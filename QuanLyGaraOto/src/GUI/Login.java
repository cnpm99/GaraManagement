/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAL.checkLog;
import java.sql.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    public static ResultSet rs = null;
    public static PreparedStatement pst = null;
    public static String makh;

    public Login() {
        initComponents();
        this.lbConnect.setText(checkLog.testConnection()); 
    }
    
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnNhapLai = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        txtUser = new javax.swing.JTextField();
        lbTaiKhoan = new javax.swing.JLabel();
        lbMatKhau = new javax.swing.JLabel();
        lbConnect = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnNhapLai.setBackground(new java.awt.Color(255, 255, 255));
        btnNhapLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refesh.png"))); // NOI18N
        btnNhapLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapLaiActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(255, 255, 255));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });

        lbTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        lbTaiKhoan.setText("Tài khoản:");

        lbMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pass.png"))); // NOI18N
        lbMatKhau.setText("Mật khẩu:");

        lbConnect.setText("Tình trạng kết nối");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbConnect)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbTaiKhoan)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtUser))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbMatKhau)
                                        .addGap(20, 20, 20)
                                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(67, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(btnNhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTaiKhoan)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMatKhau)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(lbConnect)
                .addContainerGap(19, Short.MAX_VALUE))
        );

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

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if(this.txtUser.getText().length() ==0)
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập thông tin tài khoản", "Thông báo", 1); 
        else if(String.valueOf(this.txtPass.getPassword()).length()==0){
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập mật khẩu", "Thông báo", 1);       
        }else{
            rs = checkLog.cLog(this.txtUser.getText(), String.valueOf(this.txtPass.getPassword()));
            try {
                if(rs.next()){
                    //Đăng nhập thành công
                    makh = this.txtUser.getText();
                   String quyen = rs.getString("Quyen");
                    Main frmMain = new Main(quyen);
                    this.setVisible(false);
                    frmMain.setVisible(true);                  
                }else{
                    //Đăng nhập thất bại;
                    JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu không đúng", "Thông báo", 2);
                }                   
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, evt);
            }
        }
            
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnNhapLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapLaiActionPerformed
      this.txtUser.setText(null);
      this.txtPass.setText(null);
    }//GEN-LAST:event_btnNhapLaiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
       if(JOptionPane.showConfirmDialog(null, "Thoát khỏi chương trình ?","Thông báo", 2)==0){
           this.dispose();
       }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(this.txtUser.getText().length() ==0 || String.valueOf(this.txtPass.getPassword()).length()==0){
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập thông tin tài khoản hoặc mật khẩu", "Thông báo", 1);       
        }else{
            rs = checkLog.cLog(this.txtUser.getText(), String.valueOf(this.txtPass.getPassword()));
            try {
                if(rs.next()){
                    //Đăng nhập thành công
                    makh = this.txtUser.getText();
                    String quyen = rs.getString("Quyen");
                    Main frmMain = new Main(quyen);                    
                    this.setVisible(false);
                    frmMain.setVisible(true);
                    
                }else{
                    //Đăng nhập thất bại;
                    JOptionPane.showMessageDialog(null, "Tài khoản không đúng", "Thông báo", 0);
                }
                    
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, evt);
            }
        }
    }//GEN-LAST:event_txtPassKeyPressed
    }
    
    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(this.txtUser.getText().length() ==0 || String.valueOf(this.txtPass.getPassword()).length()==0){
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập thông tin tài khoản hoặc mật khẩu", "Thông báo", 1);       
        }else{
            rs = checkLog.cLog(this.txtUser.getText(), String.valueOf(this.txtPass.getPassword()));
            try {
                if(rs.next()){
                    //Đăng nhập thành công
                    makh = this.txtUser.getText();
                    String quyen = rs.getString("Quyen");
                    Main frmMain = new Main(quyen);                   
                    this.setVisible(false);
                    frmMain.setVisible(true);
                    
                }else{
                    //Đăng nhập thất bại;
                    JOptionPane.showMessageDialog(null, "Tài khoản không đúng", "Thông báo", 0);
                }
                    
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, evt);
            }
        }
    }//GEN-LAST:event_txtUserKeyPressed
    }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnNhapLai;
    private javax.swing.JButton btnThoat;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbConnect;
    private javax.swing.JLabel lbMatKhau;
    private javax.swing.JLabel lbTaiKhoan;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
