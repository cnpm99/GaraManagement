/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAL.LoadData;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ThienNhut
 */
public class JFTraCuuDsXe extends javax.swing.JFrame {

    private static String sqlTB ="SELECT * FROM DANHSACHXE";
    private String BienSoIndex;
    
    public JFTraCuuDsXe() {
        initComponents();
        showCT();
    }
    
    private void showCT(){
        LoadData.LoadDatatb(sqlTB, tbDanhSachXe);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBienSo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtHieuXe = new javax.swing.JTextField();
        txtTenXe = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDanhSachXe = new javax.swing.JTable();
        btnTroLai = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnTaiLai = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnThemPSC = new javax.swing.JButton();
        btnThemPTT = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dsxe.png"))); // NOI18N
        jLabel1.setText("TRA CỨU DANH SÁCH XE");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Biển số:");

        txtBienSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBienSoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Tên xe:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("SĐT:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Hiệu xe:");

        txtHieuXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHieuXeActionPerformed(evt);
            }
        });

        txtTenXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenXeActionPerformed(evt);
            }
        });

        txtSdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSdtActionPerformed(evt);
            }
        });

        tbDanhSachXe.setModel(new javax.swing.table.DefaultTableModel(
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
        tbDanhSachXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDanhSachXeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDanhSachXe);

        btnTroLai.setBackground(new java.awt.Color(255, 255, 255));
        btnTroLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/undo.png"))); // NOI18N
        btnTroLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroLaiActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(255, 255, 255));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnTaiLai.setBackground(new java.awt.Color(255, 255, 255));
        btnTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refesh.png"))); // NOI18N
        btnTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiLaiActionPerformed(evt);
            }
        });

        btnTimKiem.setBackground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Tìm kiếm");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Tải lại");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Trở lại");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Thoát");

        btnThemPSC.setBackground(new java.awt.Color(255, 255, 255));
        btnThemPSC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/suachua.png"))); // NOI18N
        btnThemPSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemPSCActionPerformed(evt);
            }
        });

        btnThemPTT.setBackground(new java.awt.Color(255, 255, 255));
        btnThemPTT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bill.png"))); // NOI18N
        btnThemPTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemPTTActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Phiếu thu tiền");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Thêm PSC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtHieuXe, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtTenXe, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnThemPSC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel21))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnThemPTT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel23)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(txtHieuXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel16)
                                .addComponent(jLabel17)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel10)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThemPSC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThemPTT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel23))))
                .addContainerGap())
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

    private void txtBienSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBienSoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBienSoActionPerformed

    private void txtHieuXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHieuXeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHieuXeActionPerformed

    private void txtTenXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenXeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenXeActionPerformed

    private void txtSdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSdtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSdtActionPerformed

    private void tbDanhSachXeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDanhSachXeMouseClicked
  
        try {
            int row = this.tbDanhSachXe.getSelectedRow();//lấy dòng hiện tại đang nhấn chuột
            String IDRow = (this.tbDanhSachXe.getModel().getValueAt(row, 0)).toString();//lấy giá trị ở dòng i vừa nhấn sau đó đổi qua string
            String sql = "SELECT * FROM DANHSACHXE WHERE BienSo='"+IDRow+"'";
            ResultSet rs = LoadData.ShowTextField(sql);
            // đọc dữ liệu tại dòng có MaKH = row 0 trên bảng
            if(rs.next()){//nếu có dữ liệu
                BienSoIndex = rs.getString("BienSo");             
                this.txtBienSo.setText(rs.getString("BienSo"));
                this.txtHieuXe.setText(rs.getString("HieuXe"));           
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tbDanhSachXeMouseClicked

    private void btnTroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroLaiActionPerformed
        Main frmMain = new Main();
        this.setVisible(false);
        frmMain.setVisible(true);
    }//GEN-LAST:event_btnTroLaiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Thoát khỏi chương trình ?","Thông báo", 2)==0){
            this.dispose();}
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiLaiActionPerformed

        this.txtBienSo.setText(null);
        this.txtHieuXe.setText(null);
        this.txtSdt.setText(null);
        this.txtTenXe.setText(null);
        showCT();
    }//GEN-LAST:event_btnTaiLaiActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
//        if(this.txtTimKiem.getText().length()==0){
//            JOptionPane.showMessageDialog(null, "Bạn cần nhập dữ liệu tìm kiếm", "Thông báo", 1);
//        }else{
//            String sql1 = "{call sp_KhachHang_TimKiemTheoTen ("+this.txtTimKiem.getText()+")}";
//            LoadData.LoadDatatb(sql1, tbKhachHang);
//            this.lbTong.setText("Có "+this.tbKhachHang.getRowCount()+" khách hàng cần tìm");
//        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnThemPSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemPSCActionPerformed
//        JFPhieuSuaChua frmPSC = new JFPhieuSuaChua(MaKHC, BienSoIndex);
//        this.setVisible(false);
//        frmPSC.setVisible(true);
    }//GEN-LAST:event_btnThemPSCActionPerformed

    private void btnThemPTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemPTTActionPerformed
//        JFPhieuThuTien frm = new JFPhieuThuTien(MaKHC);
//        this.setVisible(false);
//        frm.setVisible(true);
    }//GEN-LAST:event_btnThemPTTActionPerformed

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
            java.util.logging.Logger.getLogger(JFTraCuuDsXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFTraCuuDsXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFTraCuuDsXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFTraCuuDsXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFTraCuuDsXe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaiLai;
    private javax.swing.JButton btnThemPSC;
    private javax.swing.JButton btnThemPTT;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTroLai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDanhSachXe;
    private javax.swing.JTextField txtBienSo;
    private javax.swing.JTextField txtHieuXe;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTenXe;
    // End of variables declaration//GEN-END:variables
}
