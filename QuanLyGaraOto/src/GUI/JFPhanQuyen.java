/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAL.LoadData;
import DAL.QuyenNguoiDungDAL;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ThienNhut
 */
public class JFPhanQuyen extends javax.swing.JFrame {

    private static String sqlTB = "SELECT * FROM QUYENNGUOIDUNG";
    
    public JFPhanQuyen() {
        initComponents();
        showCT();
    }
    private void showCT(){
       // this.tbPhanQuyen.setModel(TableModel);
        LoadData.LoadDatatb(sqlTB, tbPhanQuyen);
        
        this.txtQuyen.setEditable(false);
          
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ckbQLSuaChua = new javax.swing.JCheckBox();
        ckbQLBanHang = new javax.swing.JCheckBox();
        ckbQLKhoHang = new javax.swing.JCheckBox();
        ckbCapNhatDuLieu = new javax.swing.JCheckBox();
        ckbPhanQuyen = new javax.swing.JCheckBox();
        ckbDanhMuc = new javax.swing.JCheckBox();
        ckbBaoCaoo = new javax.swing.JCheckBox();
        ckbTraCuu = new javax.swing.JCheckBox();
        ckbThayDoiQuyDinh = new javax.swing.JCheckBox();
        ckbThemNguoiDung = new javax.swing.JCheckBox();
        btnSua = new javax.swing.JButton();
        btnTroLai = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtQuyen = new javax.swing.JTextField();
        tbPhanQuyen = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/quyenuser.png"))); // NOI18N
        jLabel1.setText("PHÂN QUYỀN");

        ckbQLSuaChua.setBackground(new java.awt.Color(255, 255, 255));
        ckbQLSuaChua.setText("Quản lý sửa chữa");
        ckbQLSuaChua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbQLSuaChuaActionPerformed(evt);
            }
        });

        ckbQLBanHang.setBackground(new java.awt.Color(255, 255, 255));
        ckbQLBanHang.setText("Quản lý bán hàng");
        ckbQLBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbQLBanHangActionPerformed(evt);
            }
        });

        ckbQLKhoHang.setBackground(new java.awt.Color(255, 255, 255));
        ckbQLKhoHang.setText("Quản lý kho hàng");
        ckbQLKhoHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbQLKhoHangActionPerformed(evt);
            }
        });

        ckbCapNhatDuLieu.setBackground(new java.awt.Color(255, 255, 255));
        ckbCapNhatDuLieu.setText("Cập nhật dữ liệu");
        ckbCapNhatDuLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbCapNhatDuLieuActionPerformed(evt);
            }
        });

        ckbPhanQuyen.setBackground(new java.awt.Color(255, 255, 255));
        ckbPhanQuyen.setText("Phân quyền");
        ckbPhanQuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbPhanQuyenActionPerformed(evt);
            }
        });

        ckbDanhMuc.setBackground(new java.awt.Color(255, 255, 255));
        ckbDanhMuc.setText("Danh mục");
        ckbDanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbDanhMucActionPerformed(evt);
            }
        });

        ckbBaoCaoo.setBackground(new java.awt.Color(255, 255, 255));
        ckbBaoCaoo.setText("Báo cáo, thống kê");
        ckbBaoCaoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbBaoCaooActionPerformed(evt);
            }
        });

        ckbTraCuu.setBackground(new java.awt.Color(255, 255, 255));
        ckbTraCuu.setText("Tra cứu dữ liệu");
        ckbTraCuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbTraCuuActionPerformed(evt);
            }
        });

        ckbThayDoiQuyDinh.setBackground(new java.awt.Color(255, 255, 255));
        ckbThayDoiQuyDinh.setText("Thay đổi quy định");
        ckbThayDoiQuyDinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbThayDoiQuyDinhActionPerformed(evt);
            }
        });

        ckbThemNguoiDung.setBackground(new java.awt.Color(255, 255, 255));
        ckbThemNguoiDung.setText("Thêm người dùng");
        ckbThemNguoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbThemNguoiDungActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

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

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Thoát");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Trở lại");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Sửa");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Quyền:");

        txtQuyen.setEditable(false);
        txtQuyen.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtQuyen, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tbPhanQuyen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbPhanQuyen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null,  new Boolean(false), null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tên quyền", "QL Sửa chữa", "QL Bán hàng", "QL Kho hàng", "Cập nhật DL", "Báo cáo", "Danh mục", "Tra cứu", "Phân quyền", "Thay đổi QĐ", "Thêm User"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbPhanQuyen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPhanQuyenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ckbQLSuaChua)
                            .addComponent(ckbQLBanHang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckbQLKhoHang)
                            .addComponent(ckbCapNhatDuLieu))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckbPhanQuyen)
                            .addComponent(ckbDanhMuc))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckbTraCuu)
                            .addComponent(ckbBaoCaoo))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckbThayDoiQuyDinh)
                            .addComponent(ckbThemNguoiDung))
                        .addGap(69, 69, 69))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tbPhanQuyen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbQLSuaChua)
                    .addComponent(ckbQLKhoHang)
                    .addComponent(ckbPhanQuyen)
                    .addComponent(ckbBaoCaoo)
                    .addComponent(ckbThayDoiQuyDinh))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbQLBanHang)
                    .addComponent(ckbCapNhatDuLieu)
                    .addComponent(ckbDanhMuc)
                    .addComponent(ckbTraCuu)
                    .addComponent(ckbThemNguoiDung))
                .addGap(48, 48, 48)
                .addComponent(tbPhanQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel17))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ckbQLSuaChuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbQLSuaChuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbQLSuaChuaActionPerformed

    private void ckbQLBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbQLBanHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbQLBanHangActionPerformed

    private void ckbQLKhoHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbQLKhoHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbQLKhoHangActionPerformed

    private void ckbCapNhatDuLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbCapNhatDuLieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbCapNhatDuLieuActionPerformed

    private void ckbPhanQuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbPhanQuyenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbPhanQuyenActionPerformed

    private void ckbDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbDanhMucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbDanhMucActionPerformed

    private void ckbBaoCaooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbBaoCaooActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbBaoCaooActionPerformed

    private void ckbTraCuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbTraCuuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbTraCuuActionPerformed

    private void ckbThayDoiQuyDinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbThayDoiQuyDinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbThayDoiQuyDinhActionPerformed

    private void ckbThemNguoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbThemNguoiDungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbThemNguoiDungActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
            String quyen = this.txtQuyen.getText();
            boolean a =  this.ckbQLSuaChua.isSelected();
            boolean b =  this.ckbQLBanHang.isSelected();
            boolean c =  this.ckbQLKhoHang.isSelected();
            boolean d =  this.ckbCapNhatDuLieu.isSelected();
            boolean e =  this.ckbBaoCaoo.isSelected();
            boolean f =  this.ckbDanhMuc.isSelected();
            boolean g =  this.ckbTraCuu.isSelected();
            boolean h =  this.ckbPhanQuyen.isSelected();   
            boolean i =  this.ckbThayDoiQuyDinh.isSelected();
            boolean k =  this.ckbThemNguoiDung.isSelected();
            
            int dialogButton = JOptionPane.YES_NO_OPTION;
        if(this.txtQuyen.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Bạn cần chọn quyền để sửa", "Thông báo", 2);
        }else{
          if(JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa không ?","Thông báo",dialogButton)==0){
              QuyenNguoiDungDAL.UpdateQuyen(quyen, a, b, c, d, e, f, g, h, i, k);
            showCT();
            }   
        }     
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroLaiActionPerformed
        Main frmMain = new Main();
        this.setVisible(false);
        frmMain.setVisible(true);
    }//GEN-LAST:event_btnTroLaiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Thoát khỏi chương trình ?","Thông báo", 2)==0){
            this.dispose();}
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tbPhanQuyenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPhanQuyenMouseClicked
            try {
            int row = this.tbPhanQuyen.getSelectedRow();//lấy dòng hiện tại đang nhấn chuột
            String IDRow = (this.tbPhanQuyen.getModel().getValueAt(row, 0)).toString();//lấy giá trị ở dòng thứ row, cột 0 vừa nhấn sau đó đổi qua string
            String sql = "SELECT * FROM QUYENNGUOIDUNG WHERE Quyen =N'"+IDRow+"'"; 
            ResultSet rs = LoadData.ShowTextField(sql);
            if(rs.next()){//nếu có dữ liệu
                this.txtQuyen.setText(rs.getString("Quyen"));
                this.ckbQLSuaChua.setSelected(rs.getBoolean("QuanLySuaChua"));
                this.ckbQLBanHang.setSelected(rs.getBoolean("QuanLyBanHang")); 
                this.ckbQLKhoHang.setSelected(rs.getBoolean("QuanLyKhoHang"));
                this.ckbCapNhatDuLieu.setSelected(rs.getBoolean("CapNhatDuLieu"));
                this.ckbBaoCaoo.setSelected(rs.getBoolean("BaoCao"));
                this.ckbDanhMuc.setSelected(rs.getBoolean("DanhMuc"));
                this.ckbTraCuu.setSelected(rs.getBoolean("TraCuu"));
                this.ckbPhanQuyen.setSelected(rs.getBoolean("PhanQuyen"));
                this.ckbThayDoiQuyDinh.setSelected(rs.getBoolean("ThayDoiQuyDinh"));
                this.ckbThemNguoiDung.setSelected(rs.getBoolean("ThemNguoiDung"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tbPhanQuyenMouseClicked

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
            java.util.logging.Logger.getLogger(JFPhanQuyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPhanQuyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPhanQuyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPhanQuyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPhanQuyen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTroLai;
    private javax.swing.JCheckBox ckbBaoCaoo;
    private javax.swing.JCheckBox ckbCapNhatDuLieu;
    private javax.swing.JCheckBox ckbDanhMuc;
    private javax.swing.JCheckBox ckbPhanQuyen;
    private javax.swing.JCheckBox ckbQLBanHang;
    private javax.swing.JCheckBox ckbQLKhoHang;
    private javax.swing.JCheckBox ckbQLSuaChua;
    private javax.swing.JCheckBox ckbThayDoiQuyDinh;
    private javax.swing.JCheckBox ckbThemNguoiDung;
    private javax.swing.JCheckBox ckbTraCuu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTable tbPhanQuyen;
    private javax.swing.JTextField txtQuyen;
    // End of variables declaration//GEN-END:variables
}
