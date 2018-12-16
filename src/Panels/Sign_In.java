/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import Classes.Application;
import Classes.EXTCLASS;
import Pojos.Employee;
import UI.Admin_home;
import UI.Employee_home;
import UI.Login;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Sheha
 */
public class Sign_In extends javax.swing.JPanel {

    /**
     * Creates new form Sign_In
     */
    public Sign_In() {
        initComponents();
        empId_txt.grabFocus();
        empId_txt.setText(null);
        password_txt.setText(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        empId_txt = new javax.swing.JTextField();
        password_txt = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        loginBtn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(63, 45, 67));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Forgot Password_35px.png"))); // NOI18N
        jLabel1.setToolTipText("Forgot Password?");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 40, 40));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(115, 52, 108));
        jLabel3.setText("PASSWORD");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(115, 52, 108));
        jLabel4.setText("EMP ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 123, -1, 30));

        empId_txt.setBackground(new java.awt.Color(64, 47, 66));
        empId_txt.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        empId_txt.setForeground(new java.awt.Color(204, 204, 204));
        empId_txt.setBorder(null);
        empId_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empId_txtMouseClicked(evt);
            }
        });
        empId_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empId_txtActionPerformed(evt);
            }
        });
        empId_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empId_txtKeyTyped(evt);
            }
        });
        jPanel2.add(empId_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 230, 30));

        password_txt.setBackground(new java.awt.Color(64, 47, 66));
        password_txt.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        password_txt.setForeground(new java.awt.Color(204, 204, 204));
        password_txt.setBorder(null);
        password_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                password_txtMouseClicked(evt);
            }
        });
        password_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_txtActionPerformed(evt);
            }
        });
        jPanel2.add(password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 230, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 230, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 230, 20));

        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Login_80px_1.png"))); // NOI18N
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnMouseExited(evt);
            }
        });
        jPanel2.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 90, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/sign_up.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 480, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        EXTCLASS.FrameAdd(new Forgot_password(), Login.card_login);

        Thread t2 = new Thread() {
            public void run() {

                EXTCLASS.playClip(Login.audiioPath, this);

            }
        };

        t2.start();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered

        loginBtn.setIcon(new ImageIcon(getClass().getResource("/Img/Login_96px_1.png")));


    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
        loginBtn.setIcon(new ImageIcon(getClass().getResource("/Img/Login_80px_1.png")));
    }//GEN-LAST:event_loginBtnMouseExited

    private void empId_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empId_txtActionPerformed
        password_txt.grabFocus();


    }//GEN-LAST:event_empId_txtActionPerformed

    private void empId_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empId_txtMouseClicked
        empId_txt.setText(null);
    }//GEN-LAST:event_empId_txtMouseClicked

    private void password_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_txtActionPerformed

        Thread t = new Thread() {
            public void run() {
                logMeIn();

            }
        };
        Thread t2 = new Thread() {
            public void run() {

                EXTCLASS.playClip(Login.audiioPath, this);

            }
        };
        t.start();
        t2.start();

    }//GEN-LAST:event_password_txtActionPerformed

    private void password_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_txtMouseClicked
        password_txt.setText(null);
    }//GEN-LAST:event_password_txtMouseClicked

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked

        Thread t = new Thread() {
            public void run() {
                logMeIn();

            }
        };
        Thread t2 = new Thread() {
            public void run() {

                EXTCLASS.playClip(Login.audiioPath, this);

            }
        };
        t.start();
        t2.start();
    }//GEN-LAST:event_loginBtnMouseClicked

    private void empId_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empId_txtKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {

            evt.consume();
        }
        if (empId_txt.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_empId_txtKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField empId_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel loginBtn;
    private javax.swing.JPasswordField password_txt;
    // End of variables declaration//GEN-END:variables
private void logMeIn() {
        try {

            if (!empId_txt.getText().isEmpty() && !password_txt.getText().isEmpty()) {

                Criteria c = EXTCLASS.getHibSession().createCriteria(Employee.class);

                boolean isEMPIdOk = false;

                try {
                    c.add(Restrictions.eq("idemployee", Integer.parseInt(empId_txt.getText())));
                    isEMPIdOk = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Invalid EMP ID");
                    isEMPIdOk = false;
                }
                if (isEMPIdOk) {

                    c.add(Restrictions.eq("password", password_txt.getText()));
                    if (!c.list().isEmpty()) {

                        c.add(Restrictions.eq("status", "active"));

                        if (!c.list().isEmpty()) {

                            Employee emp = (Employee) c.uniqueResult();
                            Application.setEmp(emp);

                            if (emp.getEmployeeType().getType().equals("Admin")) {

                                Admin_home a = new Admin_home();
                                a.setVisible(true);
                                Login.getLogin().disposeMe();

                            } else {
                                Employee_home e = new Employee_home();
                                e.setVisible(true);
                                Login.getLogin().disposeMe();
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Your profile is deactivated.Contact admin to resolve!");
                        }
                    } else {

                        JOptionPane.showMessageDialog(this, "Invalid details!");
                    }
                }
            } else {

                JOptionPane.showMessageDialog(this, "Fill the details!");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
