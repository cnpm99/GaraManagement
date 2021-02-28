/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import DAL.LoadData;
import DAL.HieuXeDAL;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JOptionPane;
/**
 *
 * @author ThienNhut
 */
public class JFHieuXe extends javax.swing.JFrame {


    public static String sql="SELECT * FROM HIEUXE";
    public String HieuXez;
    
    public JFHieuXe() {
        initComponents();
        showCT();
    }
       public void showCT(){
        LoadData.LoadDatatb(sql, tbHieuXe);
        tbHieuXe.getColumnModel().getColumn(0).setHeaderValue("Hiệu xe");
        ((DefaultTableCellRenderer)tbHieuXe.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        this.lbTong.setText("Tổng số hiệu xe: "+this.tbHieuXe.getRowCount());
    }
    private int CheckDelete(String HieuXe){
        try {
            String sql = "SELECT * FROM LOAIXE WHERE HieuXe='"+HieuXe+"'"; 
            ResultSet rs = LoadData.ShowTextField(sql);
            if(rs.next() == false)
            return 0;              
        } catch (SQLException e) {       
        }   
      return 1;  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHieuXe = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHieuXe = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnTroLai = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lbTong = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hieuxe.png"))); // NOI18N
        jLabel1.setText("DANH SÁCH HIỆU XE");

        txtHieuXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHieuXeActionPerformed(evt);
            }
        });
        txtHieuXe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHieuXeKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Hiệu xe:");

        tbHieuXe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hiệu Xe", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbHieuXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHieuXeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbHieuXe);

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

        lbTong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTong.setText("Tổng hiệu xe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtHieuXe, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(lbTong))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel5)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2))
                    .addComponent(txtHieuXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lbTong)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void txtHieuXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHieuXeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHieuXeActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if(this.txtHieuXe.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Tên hiệu xe không thể bỏ trống", "Thông báo", 2);
        }else{
           // HieuXe.InsertHX(HieuXez);
            HieuXeDAL.InsertHX(this.txtHieuXe.getText());
            showCT();            
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        if(this.txtHieuXe.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Bạn cần chọn hiệu xe để xóa", "Thông báo", 2);
        }else if(CheckDelete(HieuXez) == 1){
            JOptionPane.showMessageDialog(null, "Bạn cần xóa loại xe trước", "Thông báo", 2);
        }else{ 
            if(JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không ?","Thông báo",dialogButton)==0){
            HieuXeDAL.DeleteHX(this.txtHieuXe.getText());     
            showCT();
            }  
        }        
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroLaiActionPerformed
                JFDanhSachXe frmDS = new JFDanhSachXe();
                this.setVisible(false);
                frmDS.setVisible(true);
    }//GEN-LAST:event_btnTroLaiActionPerformed

    private void tbHieuXeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHieuXeMouseClicked
       try {
            int row = this.tbHieuXe.getSelectedRow();//lấy dòng hiện tại đang nhấn chuột
            HieuXez = this.tbHieuXe.getModel().getValueAt(row, 0).toString();
            this.txtHieuXe.setText(HieuXez);
       } 
         catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tbHieuXeMouseClicked

    private void txtHieuXeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHieuXeKeyReleased
            String HieuXe = this.txtHieuXe.getText();
            String sqlTimKiem = "SELECT * FROM HIEUXE WHERE HIEUXE LIKE N'%"+HieuXe+"%'";
            LoadData.LoadDatatb(sqlTimKiem, tbHieuXe);
            tbHieuXe.getColumnModel().getColumn(0).setHeaderValue("Hiệu xe");
        ((DefaultTableCellRenderer)tbHieuXe.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
    }//GEN-LAST:event_txtHieuXeKeyReleased

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
            java.util.logging.Logger.getLogger(JFHieuXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFHieuXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFHieuXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFHieuXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFHieuXe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTroLai;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTong;
    private javax.swing.JTable tbHieuXe;
    private javax.swing.JTextField txtHieuXe;
    // End of variables declaration//GEN-END:variables
}
