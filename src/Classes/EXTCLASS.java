package Classes;

import Pojos.MyCompanyDetails;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.security.KeyStore;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javazoom.jl.player.Player;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class EXTCLASS {

    private static Session s;

    public static Session getHibSession() {

        if (s == null) {
            s = Util.NewHibernateUtil.getSessionFactory().openSession();
        }
        return s;
    }

    private static Transaction t;

    public static Transaction getTransaction() {
        if (t == null) {
            t = getHibSession().beginTransaction();
        }
        return t;
    }

    public static void createFileinC() {
        try {

            File f = new File("C:\\TGPOS");
            f.mkdir();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setFrameIcon(JFrame frame) {

        try {

            Criteria c = EXTCLASS.getHibSession().createCriteria(MyCompanyDetails.class);
            c.add(Restrictions.eq("status", "active"));
            if (!c.list().isEmpty()) {

                MyCompanyDetails com = (MyCompanyDetails) c.uniqueResult();
                Application.setCompany(com);

                if (Application.isCompanySet()) {

                    if (!com.getImg1().isEmpty() && com.getImg1() != null) {

                        frame.setIconImage(new ImageIcon(Application.getCompany().getImg1()).getImage());

                    }
                    if (!Application.getCompany().getName().isEmpty()) {
                        frame.setTitle(Application.getCompany().getName());
                    }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void playClip(String path, Object obj) {
        try {
            BufferedInputStream bis = new BufferedInputStream(obj.getClass().getResourceAsStream(path));
            try {
                Player player = new Player(bis);
                player.play();

            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
        }
    }

    public static String getSaltString(int len) {
//        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz";
        String SALTCHARS = "1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < len) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    public static void showMessage(String engMsg, String sinMsg, String engHeader, String sinHeader, int type) {
        try {

            JLabel msg = new JLabel();

            String header = "";
            msg.setFont(new Font("Iskoola Pota", Font.PLAIN, 18));
            if (Application.getLangu().equals("SIN")) {
                header = sinHeader;
                msg.setText(sinMsg);
            } else {
                header = engHeader;
                msg.setText(engMsg);
            }
            JOptionPane.showMessageDialog(null, msg, header, type);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static synchronized void FrameAdd(Object obj, JPanel pname) {

        pname.removeAll();
        pname.repaint();
        pname.revalidate();
        pname.add((Component) obj);
    }

    static Date date;
    static SimpleDateFormat sdf;

    public static void setDateTime(JLabel label, String format) {

        Timer t = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                date = new Date();
                sdf = new SimpleDateFormat(format);
                label.setText(sdf.format(date));

            }
        });
        t.start();

    }

    public static boolean sendMail(String too, String sub, String msgg) {

        try {

//            HttpClientBuilder cb = HttpClientBuilder.create();
//            SSLContextBuilder sslcb = new SSLContextBuilder();
//            sslcb.loadTrustMaterial(KeyStore.getInstance(KeyStore.getDefaultType()), new TrustSelfSignedStrategy());
//            cb.setSslcontext(sslcb.build());
//            CloseableHttpClient httpclient = cb.build();
            String host = "smtp.gmail.com";
//            final String user = "hotelroyalsapphire@gmail.com";
//            final String pass = "hotel123#";//12713336
            final String user = Application.getCompany().getEmail();
            final String pass = Application.getCompany().getHeading1();//12713336
            String to = too;//nisankaakash@gmail.com
            String from = "hotelroyalsapphire@gmail.com";
            String subject = sub;
            String messageText = "\n" + msgg + "\n" + "\n" + "Contact us for any problem," + "\n" + Application.getCompany().getMobile1() + "\n" + Application.getCompany().getMobile2() + "\n" + Application.getCompany().getTp1() + "\n" + "\n" + "Thanks & Best Regards," + "\n" + "The Management of the " + Application.getCompany().getName() + "";
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            javax.mail.Session mailSession = javax.mail.Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject);
            msg.setSentDate(new Date());
            msg.setText(messageText);

            Transport transport = mailSession.getTransport("smtp");
            transport.connect(host, user, pass);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();
            return true;

        } catch (Exception ex) {
            // Console("network error!", Color.red,"this");
            System.out.println(ex);
            return false;
        }

    }

    private static void doTrustedConn() {

    }

    public static String diffrentBetweenDates(Date d1, Date d2) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
            long diff = d2.getTime() - d1.getTime();
            if (d2.getTime() < d1.getTime()) {
                return "error";
            } else {
                long sec = diff / 1000 % 60;
                long min = diff / (60 * 1000) % 60;
                long hours = diff / (60 * 60 * 1000);
                long days = hours / 24;
                int dates = (int) days;

                return String.valueOf(dates);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static final String str = "abcdefghijklmnopqrstuvwxyzk_";

    public static String encryption(String plaint, int key) {
        plaint = plaint.toLowerCase();
        String cipher = "";
        for (int i = 0; i < plaint.length(); i++) {
            int charpose = str.indexOf(plaint.charAt(i));
            int keyval = (charpose + key) % 26;
            char replaceval = str.charAt(keyval);
            cipher = cipher + replaceval;
        }
        return cipher;
    }

    public static String decrypt(String ciper, int key) {
        ciper = ciper.toLowerCase();
        String paint = "";
        for (int i = 0; i < ciper.length(); i++) {
            int charpose = str.indexOf(ciper.charAt(i));
            int keyval = (charpose - key) % 26;
            if (keyval < 0) {
                keyval = str.length() + keyval;
            }
            char replaceval = str.charAt(keyval);
            paint = paint + replaceval;
            paint = paint.replace("_", " ");
        }
        return paint;
    }

}
