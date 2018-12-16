/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Classes.Application;
import Classes.EXTCLASS;
import Panels.CompanyConfig;
import Panels.EmployeeManagement;
import Panels.FinancialManagement;
import Panels.Index;
import Panels.StockManagement;
import Panels.Sup_VenManagement;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Sheha
 */
public class Admin_home extends javax.swing.JFrame {

    boolean isBtn1Click;
    boolean isBtn2Click;
    boolean isBtn3Click;
    boolean isBtn4Click;
    boolean isBtn5Click;
    boolean isBtn6Click;
    boolean isBtn7Click;

    int currentPanel;
    JLabel currentBtn;

    public static String audioPath = "/Audio/button-46.mp3";
    public static String audioPathClick = "/Audio/switch2.mp3";
    public static String audioPathClickLangu = "/Audio/switch3.mp3";
    public static String audioPathClickLogOut = "/Audio/switch3.mp3";

    boolean isPlayHover = true;
    boolean isPlayClick = true;
    boolean isPlayClickLangu = true;
    boolean isPlayClickLogOut = true;

//    String langu = "ENG";
    public Admin_home() {
        initComponents();

        EXTCLASS.setFrameIcon(this);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        frameConfig();

    }

    private void frameConfig() {
        if (Application.isCompanySet()) {
            companyName_txt.setText(Application.getCompany().getName());
        } else {
            companyName_txt.setText("YOUR COMPANY NAME");
        }
        setDateTime();
        EXTCLASS.FrameAdd(new Index(), adminMain_card);
        isBtn6Click = true;
        setIconstoBtn(btn6, 6, false);
        changeLanguImage();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn5 = new javax.swing.JLabel();
        btn1 = new javax.swing.JLabel();
        btn3 = new javax.swing.JLabel();
        btn4 = new javax.swing.JLabel();
        btn2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        companyName_txt = new javax.swing.JLabel();
        btn7 = new javax.swing.JLabel();
        btn6 = new javax.swing.JLabel();
        adminMain_card = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory Management System");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons_ENG_5.png"))); // NOI18N
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn5MouseExited(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 810, 180, 180));

        btn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons_ENG_1.png"))); // NOI18N
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1MouseExited(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 180, 180));

        btn3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons_ENG_3.png"))); // NOI18N
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3MouseExited(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 180, 180));

        btn4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons_ENG_4.png"))); // NOI18N
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn4MouseExited(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 180, 180));

        btn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons_ENG_2.png"))); // NOI18N
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btn2MouseDragged(evt);
            }
        });
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2MouseExited(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 180, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_2.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 160, 50));

        date.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 30, 130, 30));

        time.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 30, 140, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_Datee.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 10, 220, 70));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnLogout.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 20, 90, 60));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_Datee.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1570, 10, 220, 70));

        companyName_txt.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        companyName_txt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(companyName_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 550, 40));

        btn7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons_7.png"))); // NOI18N
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn7MouseExited(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 120, 110));

        btn6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons_6.png"))); // NOI18N
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn6MouseExited(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 120, 120));

        adminMain_card.setLayout(new java.awt.CardLayout());
        jPanel1.add(adminMain_card, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 88, 1580, 900));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/back_full_test_8.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1020));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("test_1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem3.setText("jMenuItem3");
        jMenu2.add(jMenuItem3);

        jMenu3.setText("jMenu3");

        jMenuItem4.setText("jMenuItem4");
        jMenu3.add(jMenuItem4);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.out.println("test1");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btn5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseEntered
        if (Application.getLangu().equals("ENG")) {

            changeBtnIcon(btn5, "/Img/icons_ENG_5H.png", isBtn5Click, true);
        } else {

            changeBtnIcon(btn5, "/Img/icons_SIN_5H.png", isBtn5Click, true);
        }
    }//GEN-LAST:event_btn5MouseEntered

    private void btn5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseExited
        if (Application.getLangu().equals("ENG")) {

            changeBtnIcon(btn5, "/Img/icons_ENG_5.png", isBtn5Click, false);
        } else {

            changeBtnIcon(btn5, "/Img/icons_SIN_5.png", isBtn5Click, false);
        }
    }//GEN-LAST:event_btn5MouseExited

    private void btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseClicked

        isBtn1Click = false;
        isBtn2Click = false;
        isBtn3Click = false;
        isBtn4Click = false;
        isBtn5Click = true;
        isBtn6Click = false;
        isBtn7Click = false;

        setIconstoBtn(btn5, 5, true);

        EXTCLASS.FrameAdd(new CompanyConfig(), adminMain_card);
    }//GEN-LAST:event_btn5MouseClicked

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        isBtn1Click = true;
        isBtn2Click = false;
        isBtn3Click = false;
        isBtn4Click = false;
        isBtn5Click = false;
        isBtn6Click = false;
        isBtn7Click = false;

        setIconstoBtn(btn1, 1, true);

        EXTCLASS.FrameAdd(new StockManagement(), adminMain_card);
    }//GEN-LAST:event_btn1MouseClicked

    private void btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseEntered

        if (Application.getLangu().equals("ENG")) {

            changeBtnIcon(btn1, "/Img/icons_ENG_1H.png", isBtn1Click, true);
        } else {

            changeBtnIcon(btn1, "/Img/icons_SIN_1H.png", isBtn1Click, true);

        }
    }//GEN-LAST:event_btn1MouseEntered

    private void btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseExited
        if (Application.getLangu().equals("ENG")) {

            changeBtnIcon(btn1, "/Img/icons_ENG_1.png", isBtn1Click, false);
        } else {
            changeBtnIcon(btn1, "/Img/icons_SIN_1.png", isBtn1Click, false);

        }
    }//GEN-LAST:event_btn1MouseExited

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        isBtn1Click = false;
        isBtn2Click = false;
        isBtn3Click = true;
        isBtn4Click = false;
        isBtn5Click = false;
        isBtn6Click = false;
        isBtn7Click = false;

        setIconstoBtn(btn3, 3, true);

        EXTCLASS.FrameAdd(new EmployeeManagement(), adminMain_card);
    }//GEN-LAST:event_btn3MouseClicked

    private void btn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseEntered
        if (Application.getLangu().equals("ENG")) {

            changeBtnIcon(btn3, "/Img/icons_ENG_3H.png", isBtn3Click, true);
        } else {

            changeBtnIcon(btn3, "/Img/icons_SIN_3H.png", isBtn3Click, true);
        }
    }//GEN-LAST:event_btn3MouseEntered

    private void btn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseExited
        if (Application.getLangu().equals("ENG")) {
            changeBtnIcon(btn3, "/Img/icons_ENG_3.png", isBtn3Click, false);
        } else {
            changeBtnIcon(btn3, "/Img/icons_SIN_3.png", isBtn3Click, false);

        }
    }//GEN-LAST:event_btn3MouseExited

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
        isBtn1Click = false;
        isBtn2Click = false;
        isBtn3Click = false;
        isBtn4Click = true;
        isBtn5Click = false;
        isBtn6Click = false;
        isBtn7Click = false;

        setIconstoBtn(btn4, 4, true);

        EXTCLASS.FrameAdd(new FinancialManagement(), adminMain_card);
    }//GEN-LAST:event_btn4MouseClicked

    private void btn4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseEntered

        if (Application.getLangu().equals("ENG")) {
            changeBtnIcon(btn4, "/Img/icons_ENG_4H.png", isBtn4Click, true);
        } else {

            changeBtnIcon(btn4, "/Img/icons_SIN_4H.png", isBtn4Click, true);
        }

    }//GEN-LAST:event_btn4MouseEntered

    private void btn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseExited
        if (Application.getLangu().equals("ENG")) {
            changeBtnIcon(btn4, "/Img/icons_ENG_4.png", isBtn4Click, false);
        } else {
            changeBtnIcon(btn4, "/Img/icons_SIN_4.png", isBtn4Click, false);

        }
    }//GEN-LAST:event_btn4MouseExited

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        isBtn1Click = false;
        isBtn2Click = true;
        isBtn3Click = false;
        isBtn4Click = false;
        isBtn5Click = false;
        isBtn6Click = false;
        isBtn7Click = false;

        setIconstoBtn(btn2, 2, true);

        EXTCLASS.FrameAdd(new Sup_VenManagement(), adminMain_card);
    }//GEN-LAST:event_btn2MouseClicked

    private void btn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseEntered
        if (Application.getLangu().equals("ENG")) {
            changeBtnIcon(btn2, "/Img/icons_ENG_2H.png", isBtn2Click, true);
        } else {
            changeBtnIcon(btn2, "/Img/icons_SIN_2H.png", isBtn2Click, true);

        }
    }//GEN-LAST:event_btn2MouseEntered

    private void btn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseExited
        if (Application.getLangu().equals("ENG")) {
            changeBtnIcon(btn2, "/Img/icons_ENG_2.png", isBtn2Click, false);
        } else {

            changeBtnIcon(btn2, "/Img/icons_SIN_2.png", isBtn2Click, false);
        }
    }//GEN-LAST:event_btn2MouseExited

    private void btn2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2MouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try {

            if (Application.getLangu().equals("ENG")) {

                jLabel1.setIcon(new ImageIcon(getClass().getResource("/Img/btn_1.png")));//eng
                System.out.println("langu is ENG");

//            langu = "SIN";
                Application.setLangu("SIN");
                if (isBtn5Click) {
                    CompanyConfig.changeLangu();

                }
                if (isBtn2Click) {

                    Sup_VenManagement.changeLangu();

                }
                if (isBtn3Click) {
                    EmployeeManagement.changeLangu();
                }
                if (isBtn1Click) {
                    StockManagement.changeLangu();
                }
                //convert to SIN
                setIconstoBtn(currentBtn, currentPanel, false);

            } else {
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/Img/btn_2.png")));//sin
                System.out.println("langu is SIN");

                //convert to ENG
//            langu = "ENG";
                Application.setLangu("ENG");
                if (isBtn5Click) {

                    CompanyConfig.changeLangu();
                }
                if (isBtn2Click) {

                    Sup_VenManagement.changeLangu();

                }
                if (isBtn3Click) {
                    EmployeeManagement.changeLangu();
                }
                if (isBtn1Click) {
                    StockManagement.changeLangu();
                }
                setIconstoBtn(currentBtn, currentPanel, false);

            }
            if (isPlayClickLangu) {
                Thread t2 = new Thread() {
                    public void run() {

                        EXTCLASS.playClip(audioPathClickLangu, this);
                    }
                };
                t2.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        try {
            String un = (Application.getEmp() != null) ? Application.getEmp().getName() : "";

            if (isPlayClickLogOut) {
                Thread t2 = new Thread() {
                    public void run() {

                        EXTCLASS.playClip(audioPathClickLogOut, this);

                    }
                };
                t2.start();
            }

            JLabel msg = new JLabel();
            String header = "";

            if (Application.getLangu().equals("SIN")) {
                header = Application.SININFO;
                msg.setFont(new Font("Iskoola Pota", Font.PLAIN, 18));
                msg.setText(un + " ඔබට විශ්වාසයිද " + "?");
            } else {
                header = "INFO";
                msg.setFont(new Font("Iskoola Pota", Font.PLAIN, 18));
                msg.setText(un + " are you sure " + "?");
            }

            if (JOptionPane.showConfirmDialog(this, msg, header, JOptionPane.WARNING_MESSAGE) == 0) {

                Login.login = null;

                Login.getLogin().setVisible(true);
                this.dispose();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btn6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseEntered

        changeBtnIcon(btn6, "/Img/icons_6H.png", isBtn6Click, true);

    }//GEN-LAST:event_btn6MouseEntered

    private void btn6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseExited
        changeBtnIcon(btn6, "/Img/icons_6.png", isBtn6Click, false);
    }//GEN-LAST:event_btn6MouseExited

    private void btn7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseEntered
        changeBtnIcon(btn7, "/Img/icons_7H.png", isBtn7Click, true);
    }//GEN-LAST:event_btn7MouseEntered

    private void btn7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseExited
        changeBtnIcon(btn7, "/Img/icons_7.png", isBtn7Click, false);
    }//GEN-LAST:event_btn7MouseExited

    private void btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseClicked
        isBtn1Click = false;
        isBtn2Click = false;
        isBtn3Click = false;
        isBtn4Click = false;
        isBtn5Click = false;
        isBtn6Click = true;
        isBtn7Click = false;
        setIconstoBtn(btn6, 6, true);

        EXTCLASS.FrameAdd(new Index(), adminMain_card);
    }//GEN-LAST:event_btn6MouseClicked

    private void btn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseClicked
        isBtn1Click = false;
        isBtn2Click = false;
        isBtn3Click = false;
        isBtn4Click = false;
        isBtn5Click = false;
        isBtn6Click = false;
        isBtn7Click = true;

        setIconstoBtn(btn7, 7, true);

        new POS().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn7MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminMain_card;
    private javax.swing.JLabel btn1;
    private javax.swing.JLabel btn2;
    private javax.swing.JLabel btn3;
    private javax.swing.JLabel btn4;
    private javax.swing.JLabel btn5;
    private javax.swing.JLabel btn6;
    private javax.swing.JLabel btn7;
    private javax.swing.JLabel companyName_txt;
    private javax.swing.JLabel date;
    private static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables

    private void changeBtnIcon(JLabel btn, String path, boolean isbtnClick, boolean isHover) {
        try {

            if (!isbtnClick) {
                btn.setIcon(new ImageIcon(getClass().getResource(path)));
                if (isHover && isPlayHover) {

                    Thread t2 = new Thread() {
                        public void run() {

                            EXTCLASS.playClip(audioPath, this);

                        }
                    };
                    t2.start();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void changeBtnIcon(JLabel btn, String path) {
        try {

            btn.setIcon(new ImageIcon(getClass().getResource(path)));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    Date date1;
    SimpleDateFormat sdf;
    SimpleDateFormat sdf1;

    private void setDateTime() {

        Timer t = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                date1 = new Date();
                sdf = new SimpleDateFormat("yyy-MM-dd");
                sdf1 = new SimpleDateFormat("hh:mm:ss a");
                date.setText(sdf.format(date1));
                time.setText(sdf1.format(date1));

            }
        });
        t.start();

    }

    private void setIconstoBtn(JLabel lbl, int no, boolean wantPlay) {

        currentPanel = no;
        currentBtn = lbl;

        if (!Application.getLangu().equals("ENG")) {
            //set sin

            changeBtnIcon(btn1, "/Img/icons_SIN_1.png");
            changeBtnIcon(btn2, "/Img/icons_SIN_2.png");
            changeBtnIcon(btn3, "/Img/icons_SIN_3.png");
            changeBtnIcon(btn4, "/Img/icons_SIN_4.png");
            changeBtnIcon(btn5, "/Img/icons_SIN_5.png");
            changeBtnIcon(btn6, "/Img/icons_6.png");
            changeBtnIcon(btn7, "/Img/icons_7.png");
            if (no != 0) {

                System.out.println("going to change btn" + no + "(SIN)");

                if (no == 6 || no == 7) {
                    changeBtnIcon(lbl, "/Img/icons_" + no + "S.png");

                } else {
                    changeBtnIcon(lbl, "/Img/icons_SIN_" + no + "S.png");
                }
            }

        } else {
            //set eng
            changeBtnIcon(btn1, "/Img/icons_ENG_1.png");
            changeBtnIcon(btn2, "/Img/icons_ENG_2.png");
            changeBtnIcon(btn3, "/Img/icons_ENG_3.png");
            changeBtnIcon(btn4, "/Img/icons_ENG_4.png");
            changeBtnIcon(btn5, "/Img/icons_ENG_5.png");
            changeBtnIcon(btn6, "/Img/icons_6.png");
            changeBtnIcon(btn7, "/Img/icons_7.png");
            if (no != 0) {

                System.out.println("going to change btn" + no + "(ENG)");
                if (no == 6 || no == 7) {
                    changeBtnIcon(lbl, "/Img/icons_" + no + "S.png");

                } else {
                    changeBtnIcon(lbl, "/Img/icons_ENG_" + no + "S.png");
                }
            }
        }

        if (isPlayClick && wantPlay) {
            Thread t2 = new Thread() {
                public void run() {

                    EXTCLASS.playClip(audioPathClick, this);

                }
            };
            t2.start();
        }

    }

    private void changeLanguImage() {

        if (!Application.getLangu().equals("ENG")) {

            jLabel1.setIcon(new ImageIcon(getClass().getResource("/Img/btn_1.png")));//eng

        } else {
            jLabel1.setIcon(new ImageIcon(getClass().getResource("/Img/btn_2.png")));//sin

        }
    }
}
