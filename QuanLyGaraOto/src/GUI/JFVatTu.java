/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAL.LoadData;
import DAL.VatTuDAL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author ThienNhut
 */
public class JFVatTu extends javax.swing.JFrame {

    private static String sqlTB = "SELECT * FROM VATTU";
    private int MaVTIndex;
    
    public JFVatTu() {
        initComponents();
        showCT();
    }
    private void ProcessCtr(boolean b){
        this.btnThem.setEnabled(b);
        this.btnXoa.setEnabled(b);
        this.btnSua.setEnabled(b);       
    }
    private void showCT(){
        LoadData.LoadDatatb(sqlTB, tbVatTu);
        tbVatTu.removeColumn(tbVatTu.getColumnModel().getColumn(5));
        tbVatTu.removeColumn(tbVatTu.getColumnModel().getColumn(5));
        tbVatTu.getColumnModel().getColumn(0).setHeaderValue("Mã vật tư");
        tbVatTu.getColumnModel().getColumn(1).setHeaderValue("Tên vật tư");
        tbVatTu.getColumnModel().getColumn(2).setHeaderValue("Đơn vị tính");
        tbVatTu.getColumnModel().getColumn(3).setHeaderValue("Đơn giá");
        tbVatTu.getColumnModel().getColumn(4).setHeaderValue("Số lượng tồn"); 
        
        this.txtMaVatTu.setEditable(false);
        this.txtSoLuongTon.setEditable(false);
    }      
    public int CheckNumber(String s){//kiểm tra là số hay chữ
        Pattern pattern = Pattern.compile("\\d*");//// \\d+ hay \\d* đều được
        Matcher matcher = pattern.matcher(s); 
            if (matcher.matches()) { 
                return 1;//là số
            } else { 
                return 0;// không phải số
            }  
    }        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTenVatTu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVatTu = new javax.swing.JTable();
        btnThoat = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnTroLai = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        btnTaiLai = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnNhapMoi = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtMaVatTu = new javax.swing.JTextField();
        txtDonViTinh = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        txtSoLuongTon = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-administrative-tools-filled-50.png"))); // NOI18N
        jLabel1.setText("VẬT TƯ");

        txtTenVatTu.setToolTipText("Nhập để tìm kiếm");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Tên vật tư:");

        tbVatTu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVatTuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbVatTu);

        btnThoat.setBackground(new java.awt.Color(255, 255, 255));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Thoát");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Trở lại");

        btnTroLai.setBackground(new java.awt.Color(255, 255, 255));
        btnTroLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/undo.png"))); // NOI18N
        btnTroLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroLaiActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Tải lại");

        btnTaiLai.setBackground(new java.awt.Color(255, 255, 255));
        btnTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refesh.png"))); // NOI18N
        btnTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiLaiActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Thêm");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Xóa");

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Sửa");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Nhập mới");

        btnNhapMoi.setBackground(new java.awt.Color(255, 255, 255));
        btnNhapMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/databaseimport.png"))); // NOI18N
        btnNhapMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapMoiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Mã vật tư:");

        txtMaVatTu.setToolTipText("Nhập để tìm kiếm");

        txtDonViTinh.setToolTipText("Nhập để tìm kiếm");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Đơn vị tính:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Đơn giá:");

        txtDonGia.setToolTipText("Nhập để tìm kiếm");

        txtSoLuongTon.setToolTipText("Nhập để tìm kiếm");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Số lượng tồn:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnNhapMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(jLabel10)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaVatTu, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(txtTenVatTu))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDonViTinh, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(txtDonGia))
                        .addGap(65, 65, 65)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtSoLuongTon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaVatTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtDonViTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtSoLuongTon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenVatTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel17)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel10)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnNhapMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))))))
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

    private void tbVatTuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVatTuMouseClicked
        ProcessCtr(true);
        this.btnThem.setEnabled(false);
        try {
            int row = this.tbVatTu.getSelectedRow();//lấy dòng hiện tại đang nhấn chuột
            String IDRow = (this.tbVatTu.getModel().getValueAt(row, 0)).toString();//lấy giá trị ở dòng i vừa nhấn sau đó đổi qua string
            String sql = "SELECT * FROM VATTU WHERE MaVTPT ='"+IDRow+"'"; 
            ResultSet rs = LoadData.ShowTextField(sql);
            // đọc dữ liệu tại dòng có MaKH = row 0 trên bảng
            if(rs.next()){//nếu có dữ liệu
                MaVTIndex = rs.getInt("MaVTPT");             
                this.txtMaVatTu.setText(rs.getString("MaVTPT"));
                this.txtTenVatTu.setText(rs.getString("TenVTPT"));
                this.txtDonViTinh.setText(rs.getString("DVT"));
                this.txtDonGia.setText(rs.getString("DonGia"));
                this.txtSoLuongTon.setText(rs.getString("SoLuongTon"));                         
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tbVatTuMouseClicked

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Thoát khỏi chương trình ?","Thông báo", 2)==0){
            this.dispose();}
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnTroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroLaiActionPerformed
        Main frmMain = new Main();
        this.setVisible(false);
        frmMain.setVisible(true);
    }//GEN-LAST:event_btnTroLaiActionPerformed

    private void btnTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiLaiActionPerformed
            ProcessCtr(false);
            this.txtMaVatTu.setText(null);
            this.txtTenVatTu.setText(null);
            this.txtDonViTinh.setText(null);
            this.txtDonGia.setText(null);
            this.txtSoLuongTon.setText(null);            
            showCT();
    }//GEN-LAST:event_btnTaiLaiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        if(this.txtTenVatTu.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Tên vật tư không thể bỏ trống", "Thông báo", 2);
        }else{
            String tenVT = this.txtTenVatTu.getText();
            String DVT = this.txtDonViTinh.getText();
            Double DonGia = Double.parseDouble(this.txtDonGia.getText());
            int ThoiGianBaoHanh = 6;
            int SoLuongTon = Integer.parseInt(this.txtSoLuongTon.getText());
            int MaNhaCungCap = 1;
            VatTuDAL.InsertVTPT(tenVT, DVT, DonGia, ThoiGianBaoHanh, SoLuongTon, MaNhaCungCap);
            showCT();
            ProcessCtr(false);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed

        int dialogButton = JOptionPane.YES_NO_OPTION;
        if(this.txtMaVatTu.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Bạn cần chọn vật tư để xóa", "Thông báo", 2);
        }else{
            if(JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không ?","Thông báo",dialogButton)==0){
                VatTuDAL.DeleteVTPT(MaVTIndex);
                showCT();
            }
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if(this.txtMaVatTu.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Cần chọn vật tư để sửa", "Thông báo", 2);
        }else{          
            String tenVT = this.txtTenVatTu.getText();
            String DVT = this.txtDonViTinh.getText();
            Double DonGia = Double.parseDouble(this.txtDonGia.getText());
            int ThoiGianBaoHanh = 6;
            int SoLuongTon = Integer.parseInt(this.txtSoLuongTon.getText());
            int MaNhaCungCap = 1;
            VatTuDAL.UpdateVTPT(MaVTIndex, tenVT, DVT, DonGia, ThoiGianBaoHanh, SoLuongTon, MaNhaCungCap);
            showCT();
            ProcessCtr(false);
        }

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapMoiActionPerformed

        ProcessCtr(false);
        this.btnThem.setEnabled(true);
        this.txtMaVatTu.setText(null);
            this.txtTenVatTu.setText(null);
            this.txtDonViTinh.setText(null);
            this.txtDonGia.setText(null);
            this.txtSoLuongTon.setText(null);    
    }//GEN-LAST:event_btnNhapMoiActionPerformed

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
            java.util.logging.Logger.getLogger(JFVatTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFVatTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFVatTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFVatTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFVatTu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhapMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaiLai;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTroLai;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbVatTu;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtDonViTinh;
    private javax.swing.JTextField txtMaVatTu;
    private javax.swing.JTextField txtSoLuongTon;
    private javax.swing.JTextField txtTenVatTu;
    // End of variables declaration//GEN-END:variables
}
