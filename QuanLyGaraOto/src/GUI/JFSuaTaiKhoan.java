/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAL.LoadData;
import DAL.checkLog;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class JFSuaTaiKhoan extends javax.swing.JFrame {

    public static ResultSet rs = null;
    public static PreparedStatement pst = null;
    private String quyen;
    public static String sqlCB = "SELECT * FROM QUYENNGUOIDUNG";
    
    public JFSuaTaiKhoan() {
        initComponents();
        Ctrl(false); 
        this.txtQuyenHienTai.setEditable(false);
        showCT();
    }
     public JFSuaTaiKhoan(String TK) {
        initComponents();
        Ctrl(false); 
        this.txtQuyenHienTai.setEditable(false);
        this.txtUser.setText(TK);
        showCT();
    }
    private void showCT(){
        LoadData.LoadDataCB(sqlCB, cbQuyenMoi, "Quyen");
    }
    private void Ctrl(boolean b){       
        this.cbQuyenMoi.setEnabled(b);
        this.txtTaiKhoanMoi.setEnabled(b);
        this.txtMatKhauMoi.setEnabled(b);
        this.txtMatKhauMoi2.setEnabled(b);
        this.btnSuaTaiKhoan.setEnabled(b);
        this.btnXoaTaiKhoan.setEnabled(b);        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPass = new javax.swing.JPasswordField();
        txtUser = new javax.swing.JTextField();
        lbTaiKhoan = new javax.swing.JLabel();
        lbMatKhau = new javax.swing.JLabel();
        txtQuyenHienTai = new javax.swing.JTextField();
        lbTaiKhoan1 = new javax.swing.JLabel();
        txtTaiKhoanMoi = new javax.swing.JTextField();
        lbTaiKhoan2 = new javax.swing.JLabel();
        lbMatKhau1 = new javax.swing.JLabel();
        txtMatKhauMoi = new javax.swing.JPasswordField();
        lbTaiKhoan3 = new javax.swing.JLabel();
        lbMatKhau2 = new javax.swing.JLabel();
        txtMatKhauMoi2 = new javax.swing.JPasswordField();
        cbQuyenMoi = new javax.swing.JComboBox<>();
        lbLogin = new javax.swing.JLabel();
        lbThoat = new javax.swing.JLabel();
        lbTroLai = new javax.swing.JLabel();
        lbCheck = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSuaTaiKhoan = new javax.swing.JButton();
        btnXoaTaiKhoan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user30.png"))); // NOI18N
        lbTaiKhoan.setText("Tài khoản:");

        lbMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pass30.png"))); // NOI18N
        lbMatKhau.setText("Mật khẩu:");

        txtQuyenHienTai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuyenHienTaiActionPerformed(evt);
            }
        });
        txtQuyenHienTai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuyenHienTaiKeyPressed(evt);
            }
        });

        lbTaiKhoan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user-rights-30.png"))); // NOI18N
        lbTaiKhoan1.setText("Quyền hiện tại:");

        txtTaiKhoanMoi.setToolTipText("Bỏ trống nếu không sửa");
        txtTaiKhoanMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaiKhoanMoiActionPerformed(evt);
            }
        });
        txtTaiKhoanMoi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTaiKhoanMoiKeyPressed(evt);
            }
        });

        lbTaiKhoan2.setText("Tên tài khoản mới:");

        lbMatKhau1.setText("Mật khẩu mới:");

        txtMatKhauMoi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatKhauMoiKeyPressed(evt);
            }
        });

        lbTaiKhoan3.setText("Quyền mới:");

        lbMatKhau2.setText("Nhập lại mật khẩu:");

        txtMatKhauMoi2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatKhauMoi2KeyPressed(evt);
            }
        });

        cbQuyenMoi.setToolTipText("Bỏ trống nếu không sửa");

        lbLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        lbLogin.setToolTipText("Đăng nhập");
        lbLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLoginMouseClicked(evt);
            }
        });

        lbThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        lbThoat.setToolTipText("Thoát");
        lbThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThoatMouseClicked(evt);
            }
        });

        lbTroLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/undo.png"))); // NOI18N
        lbTroLai.setToolTipText("Trở lại");
        lbTroLai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTroLaiMouseClicked(evt);
            }
        });

        lbCheck.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbCheck.setText("Đăng nhập tài khoản cần sửa, xóa");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editaccount50.png"))); // NOI18N
        jLabel1.setText("THAY ĐỔI THÔNG TIN TÀI KHOẢN");

        btnSuaTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        btnSuaTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/quyen30.png"))); // NOI18N
        btnSuaTaiKhoan.setText("Sửa tài khoản");
        btnSuaTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaTaiKhoanActionPerformed(evt);
            }
        });

        btnXoaTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        btnXoaTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deleteuser30.png"))); // NOI18N
        btnXoaTaiKhoan.setText("Xóa tài khoản");
        btnXoaTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTaiKhoanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTaiKhoan)
                                    .addComponent(lbMatKhau))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(txtPass)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(lbCheck))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(lbLogin)
                                .addGap(40, 40, 40)
                                .addComponent(lbTroLai)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbThoat)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTaiKhoan1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTaiKhoan2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTaiKhoan3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbMatKhau1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbMatKhau2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSuaTaiKhoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMatKhauMoi)
                            .addComponent(txtMatKhauMoi2)
                            .addComponent(txtQuyenHienTai)
                            .addComponent(txtTaiKhoanMoi)
                            .addComponent(cbQuyenMoi, 0, 160, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnXoaTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTaiKhoan)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTaiKhoan1)
                    .addComponent(txtQuyenHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMatKhau)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTaiKhoan3)
                    .addComponent(cbQuyenMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTaiKhoanMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTaiKhoan2)
                    .addComponent(lbCheck))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMatKhau1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMatKhau2)
                            .addComponent(txtMatKhauMoi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbThoat)
                        .addComponent(lbLogin)
                        .addComponent(lbTroLai)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSuaTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuyenHienTaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuyenHienTaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuyenHienTaiActionPerformed

    private void txtQuyenHienTaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuyenHienTaiKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuyenHienTaiKeyPressed

    private void txtTaiKhoanMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaiKhoanMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaiKhoanMoiActionPerformed

    private void txtTaiKhoanMoiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTaiKhoanMoiKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaiKhoanMoiKeyPressed

    private void txtMatKhauMoiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauMoiKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauMoiKeyPressed

    private void txtMatKhauMoi2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauMoi2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauMoi2KeyPressed

    private void lbLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLoginMouseClicked
        if(this.txtUser.getText().length() ==0 || String.valueOf(this.txtPass.getPassword()).length()==0){
                JOptionPane.showMessageDialog(null, "Bạn chưa nhập thông tin tài khoản hoặc mật khẩu", "Thông báo", 1);
        }else{
                rs = checkLog.cLog(this.txtUser.getText(), String.valueOf(this.txtPass.getPassword()));
                try {
                    if(rs.next()){
                        //Đăng nhập thành công                                               
                        Ctrl(true);
                        quyen = rs.getString("Quyen");
                        this.txtQuyenHienTai.setText(quyen);
                        this.lbCheck.setText("Đăng nhập thành công !");
                        this.txtUser.setEditable(false);
                        this.txtPass.setEditable(false);
                        this.cbQuyenMoi.setSelectedIndex(-1);
                        JOptionPane.showMessageDialog(null, "Để xóa: Nhấn \"Xóa tài khoản\" \nĐể sửa: Nhập thông tin cần sửa, bổ trống nếu không sửa", "Đăng nhập thành công !", 1); 
                    }else{
                        //Đăng nhập thất bại;
                        JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu không đúng", "Thông báo", 0);                       
                    }
        } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(rootPane, evt);
             }
        }
         
    }//GEN-LAST:event_lbLoginMouseClicked

    private void lbThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThoatMouseClicked
         if(JOptionPane.showConfirmDialog(null, "Thoát khỏi chương trình ?","Thông báo", 2)==0){
            this.dispose();
        }
    }//GEN-LAST:event_lbThoatMouseClicked

    private void lbTroLaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTroLaiMouseClicked
            JFQuanLyNguoiDung frm = new JFQuanLyNguoiDung();
            this.setVisible(false);
            frm.setVisible(true);
    }//GEN-LAST:event_lbTroLaiMouseClicked

    private void btnSuaTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaTaiKhoanActionPerformed
            String tencu = this.txtUser.getText();
            String matkhaucu = String.valueOf(this.txtPass.getPassword());
            String quyencu = this.txtQuyenHienTai.getText();
            String tenmoi = this.txtTaiKhoanMoi.getText();
            String quyenmoi=quyencu;//
            String matkhaumoi = String.valueOf(this.txtMatKhauMoi.getPassword()); 
            String matkhaumoi2 = String.valueOf(this.txtMatKhauMoi2.getPassword());
            if(this.txtQuyenHienTai.getText()==null){
                JOptionPane.showMessageDialog(null, "Bạn chưa đăng nhập", "Thông báo", 1);
            }else if(this.cbQuyenMoi.getSelectedIndex()!=-1){
                quyenmoi= this.cbQuyenMoi.getSelectedItem().toString();
            }
            if(this.txtTaiKhoanMoi.getText().length()==0){
                tenmoi = tencu;
            }
            if(matkhaumoi == null ? matkhaumoi2 != null : !matkhaumoi.equals(matkhaumoi2)){                
                JOptionPane.showMessageDialog(null, "Mật khẩu mới phải trùng nhau", "Thông báo", 1);
            }
            if(String.valueOf(this.txtMatKhauMoi.getPassword()).length()==0){
                matkhaumoi=matkhaucu;
                matkhaumoi2=matkhaucu;
            }                
                checkLog.UpdateTK(tencu, matkhaucu, quyencu, tenmoi, matkhaumoi, quyenmoi);           
    }//GEN-LAST:event_btnSuaTaiKhoanActionPerformed

    private void btnXoaTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTaiKhoanActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;      
        if(JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không ?","Thông báo",dialogButton)==0){          
             checkLog.DeleteTK(this.txtUser.getText(), String.valueOf(this.txtPass.getPassword()));
        }
    }//GEN-LAST:event_btnXoaTaiKhoanActionPerformed
 
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
            java.util.logging.Logger.getLogger(JFSuaTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFSuaTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFSuaTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFSuaTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFSuaTaiKhoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaTaiKhoan;
    private javax.swing.JButton btnXoaTaiKhoan;
    private javax.swing.JComboBox<String> cbQuyenMoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCheck;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbMatKhau;
    private javax.swing.JLabel lbMatKhau1;
    private javax.swing.JLabel lbMatKhau2;
    private javax.swing.JLabel lbTaiKhoan;
    private javax.swing.JLabel lbTaiKhoan1;
    private javax.swing.JLabel lbTaiKhoan2;
    private javax.swing.JLabel lbTaiKhoan3;
    private javax.swing.JLabel lbThoat;
    private javax.swing.JLabel lbTroLai;
    private javax.swing.JPasswordField txtMatKhauMoi;
    private javax.swing.JPasswordField txtMatKhauMoi2;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtQuyenHienTai;
    private javax.swing.JTextField txtTaiKhoanMoi;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
