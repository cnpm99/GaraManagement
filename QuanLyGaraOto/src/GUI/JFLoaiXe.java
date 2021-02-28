/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import DAL.LoadData;
import DAL.LoaiXeDAL;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ThienNhut
 */
public class JFLoaiXe extends javax.swing.JFrame {


    public static String sqlTB="SELECT * FROM LOAIXE";
    public static String sqlCB="SELECT * FROM HIEUXE";
    public int MaLXIndex;
    public String LXIndex;
    
    public JFLoaiXe() {
        initComponents();
        showCT();
    }
    private void showCT(){
        LoadData.LoadDataCB(sqlCB, cbHieuXe, "HieuXe");
        LoadData.LoadDatatb(sqlTB, tbLoaiXe);
        
        CtrlTable();
        
        this.cbHieuXe.setSelectedIndex(-1);
        this.txtMaLoaiXe.setEditable(false);
        
        this.btnSua.setEnabled(false);
        this.btnThem.setEnabled(true);
    }
  private void CtrlTable(){
        tbLoaiXe.getColumnModel().getColumn(0).setHeaderValue("Mã loại xe");
        tbLoaiXe.getColumnModel().getColumn(0).setPreferredWidth(10);
        tbLoaiXe.getColumnModel().getColumn(1).setHeaderValue("Loại xe");
        tbLoaiXe.getColumnModel().getColumn(2).setHeaderValue("Hiệu xe");
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLoaiXe = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnTroLai = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaLoaiXe = new javax.swing.JTextField();
        cbHieuXe = new javax.swing.JComboBox<>();
        txtLoaiXe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnTaiLai = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LoaiXe.png"))); // NOI18N
        jLabel1.setText("LOẠI XE");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Hiệu xe:");

        tbLoaiXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLoaiXeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbLoaiXe);

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Xóa");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Thêm");

        btnTroLai.setBackground(new java.awt.Color(255, 255, 255));
        btnTroLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/undo.png"))); // NOI18N
        btnTroLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroLaiActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Trở lại");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Mã loại xe:");

        txtMaLoaiXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaLoaiXeActionPerformed(evt);
            }
        });

        cbHieuXe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbHieuXeItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Loại xe:");

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Sửa");

        btnTaiLai.setBackground(new java.awt.Color(255, 255, 255));
        btnTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refesh.png"))); // NOI18N
        btnTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiLaiActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Tải lại");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbHieuXe, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtMaLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(24, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8))
                    .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbHieuXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)))
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

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if(this.cbHieuXe.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Chọn hiệu xe để thêm loại xe", "Thông báo", 2);
        }else if(this.txtLoaiXe.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Loại xe không thể bỏ trống", "Thông báo", 2);
        }else{    
            String HieuXe = this.cbHieuXe.getSelectedItem().toString();
            String LoaiXe = this.txtLoaiXe.getText();
            LoaiXeDAL.InsertLoaiXe(LoaiXe, HieuXe);
            showCT();            
        }
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        if(this.txtMaLoaiXe.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Bạn cần chọn loại xe để xóa", "Thông báo", 2);
        }else{ 
            if(JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không ?","Thông báo",dialogButton)==0){
            LoaiXeDAL.DeleteLoaiXe(MaLXIndex);
            showCT();
            }  
        }        
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroLaiActionPerformed
                JFDanhSachXe frmDS = new JFDanhSachXe();
                this.setVisible(false);
                frmDS.setVisible(true);
    }//GEN-LAST:event_btnTroLaiActionPerformed

    private void tbLoaiXeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLoaiXeMouseClicked
            try {
            int row = this.tbLoaiXe.getSelectedRow();//lấy dòng hiện tại đang nhấn chuột
            String IDRow = (this.tbLoaiXe.getModel().getValueAt(row, 0)).toString();//lấy giá trị ở dòng i vừa nhấn sau đó đổi qua string
            String sql = "SELECT * FROM LOAIXE WHERE MaLoaiXe ='"+IDRow+"'"; 
            ResultSet rs = LoadData.ShowTextField(sql);
            // đọc dữ liệu tại dòng có MaKH = row 0 trên bảng
            if(rs.next()){//nếu có dữ liệu
                MaLXIndex = rs.getInt("MaLoaiXe");
                LXIndex = rs.getString("LoaiXe");               
                this.cbHieuXe.setSelectedItem(rs.getString("HieuXe"));
                this.txtLoaiXe.setText(rs.getString("LoaiXe"));
                this.txtMaLoaiXe.setText(rs.getString("MaLoaiXe"));                
            }
            this.btnThem.setEnabled(false);
            this.btnSua.setEnabled(true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tbLoaiXeMouseClicked

    private void cbHieuXeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbHieuXeItemStateChanged
            
            if(this.cbHieuXe.getSelectedItem()!= null){
            this.txtMaLoaiXe.setText(null);
            String HieuXe = this.cbHieuXe.getSelectedItem().toString();
            String sqlHX = "SELECT * FROM LOAIXE WHERE HieuXe='"+HieuXe+"'";
            LoadData.LoadDatatb(sqlHX, tbLoaiXe); 
            CtrlTable();
            }
    }//GEN-LAST:event_cbHieuXeItemStateChanged

    private void txtMaLoaiXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaLoaiXeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaLoaiXeActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if(this.txtMaLoaiXe.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Chọn loại xe để sửa", "Thông báo", 2);
        }else{    
            String LoaiXe = this.txtLoaiXe.getText();
            LoaiXeDAL.UpdateLoaiXe(MaLXIndex, LoaiXe);
            showCT();            
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiLaiActionPerformed
        
        this.cbHieuXe.setSelectedItem(null);
        this.txtMaLoaiXe.setText(null);
        this.txtLoaiXe.setText(null);
        showCT();
    }//GEN-LAST:event_btnTaiLaiActionPerformed

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
            java.util.logging.Logger.getLogger(JFLoaiXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLoaiXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLoaiXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLoaiXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLoaiXe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaiLai;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTroLai;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbHieuXe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbLoaiXe;
    private javax.swing.JTextField txtLoaiXe;
    private javax.swing.JTextField txtMaLoaiXe;
    // End of variables declaration//GEN-END:variables
}
