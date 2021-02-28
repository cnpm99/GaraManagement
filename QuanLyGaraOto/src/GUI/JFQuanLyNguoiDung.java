/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAL.LoadData;
import DAL.checkLog;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ThienNhut
 */
public class JFQuanLyNguoiDung extends javax.swing.JFrame {

    public String TaiKhoanIndex;
    public static String sqlTB = "SELECT * FROM TAIKHOAN";
    public static String sqlCB = "SELECT * FROM QUYENNGUOIDUNG";
    
    public JFQuanLyNguoiDung() {
        initComponents();
        showCT();
    }
     public void showCT(){
        LoadData.LoadDatatb(sqlTB, tbTaiKhoan);
        tbTaiKhoan.removeColumn(tbTaiKhoan.getColumnModel().getColumn(1));
        tbTaiKhoan.getColumnModel().getColumn(0).setHeaderValue("Tên người dùng");
        tbTaiKhoan.getColumnModel().getColumn(1).setHeaderValue("Quyền người dùng");
        LoadData.LoadDataCB(sqlCB, cbQuyen, "Quyen");
        this.btnThem.setEnabled(false);
                                      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTaiKhoan = new javax.swing.JTable();
        btnTroLai = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbQuyen = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtTenNguoiDung = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThemMoi = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin.png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ NGƯỜI DÙNG");

        tbTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTaiKhoanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTaiKhoan);

        btnTroLai.setBackground(new java.awt.Color(255, 255, 255));
        btnTroLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/undo.png"))); // NOI18N
        btnTroLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroLaiActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Trở lại");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Thoát");

        btnThoat.setBackground(new java.awt.Color(255, 255, 255));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Quyền:");

        jLabel3.setText("Tên người dùng:");

        jLabel4.setText("Mật khẩu:");

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adduser.png"))); // NOI18N
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deleteuser.png"))); // NOI18N
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editaccount.png"))); // NOI18N
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMatKhau)
                    .addComponent(txtTenNguoiDung)
                    .addComponent(cbQuyen, 0, 174, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnThemMoi.setBackground(new java.awt.Color(255, 255, 255));
        btnThemMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addnew.png"))); // NOI18N
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Thêm mới");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel11))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroLaiActionPerformed
        Main frmMain = new Main();
        this.setVisible(false);
        frmMain.setVisible(true);
    }//GEN-LAST:event_btnTroLaiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Thoát khỏi chương trình ?","Thông báo", 2)==0){
            this.dispose();
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
            int dialogButton = JOptionPane.YES_NO_OPTION; 
            if(this.txtTenNguoiDung.getText().length()==0){                
                JOptionPane.showMessageDialog(null, "Bạn chưa nhập tài khoản", "Thông báo", 1);
            }else if(String.valueOf(this.txtMatKhau.getPassword()).length()==0){                
                JOptionPane.showMessageDialog(null, "Bạn chưa nhập mật khẩu", "Thông báo", 1);
            }else  if(this.cbQuyen.getSelectedIndex()==-1){                
                JOptionPane.showMessageDialog(null, "Bạn chưa chọn quyền người dùng", "Thông báo", 1);
            }else if(JOptionPane.showConfirmDialog(null, "Bạn có muốn thêm không ?","Thông báo",dialogButton)==0){                
                checkLog.InsertTK(this.txtTenNguoiDung.getText(), String.valueOf(this.txtMatKhau.getPassword()), cbQuyen.getSelectedItem().toString());
                showCT();
            }           
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
                JFSuaTaiKhoan frm = new JFSuaTaiKhoan(TaiKhoanIndex);
               this.setVisible(false);
               frm.setVisible(true);
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
               JFSuaTaiKhoan frm = new JFSuaTaiKhoan(TaiKhoanIndex);
               this.setVisible(false);
               frm.setVisible(true);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tbTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTaiKhoanMouseClicked
        try {
            int row = this.tbTaiKhoan.getSelectedRow();//lấy dòng hiện tại đang nhấn chuột
            String IDRow = (this.tbTaiKhoan.getModel().getValueAt(row, 0)).toString();//lấy giá trị ở dòng i vừa nhấn sau đó đổi qua string
            String sqlTBIndex = "SELECT * FROM TAIKHOAN WHERE Ten ='"+IDRow+"'";
            ResultSet rs = LoadData.ShowTextField(sqlTBIndex);

            // đọc dữ liệu tại dòng có MaKH = row 0 trên bảng
            if(rs.next()){//nếu có dữ liệu
                TaiKhoanIndex = rs.getString("Ten");                              
                this.txtTenNguoiDung.setText(rs.getString("Ten"));
                this.txtMatKhau.setText(rs.getString("MatKhau"));
                this.cbQuyen.setSelectedItem(rs.getString("Quyen"));
            }
            this.btnThem.setEnabled(false);    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tbTaiKhoanMouseClicked

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
            this.btnThem.setEnabled(true);      
            this.cbQuyen.setSelectedIndex(-1);
            this.txtTenNguoiDung.setText(null);
            this.txtMatKhau.setText(null);
    }//GEN-LAST:event_btnThemMoiActionPerformed

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
            java.util.logging.Logger.getLogger(JFQuanLyNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFQuanLyNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFQuanLyNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFQuanLyNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFQuanLyNguoiDung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTroLai;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbQuyen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbTaiKhoan;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenNguoiDung;
    // End of variables declaration//GEN-END:variables
}
