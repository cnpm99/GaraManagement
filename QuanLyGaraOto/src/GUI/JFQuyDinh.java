/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;
import DAL.LoadData;
import DAL.QuyDinhDAL;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;




public class JFQuyDinh extends javax.swing.JFrame {

    private static String sqlTB ="SELECT * FROM THAMSO"; 
    public JFQuyDinh() {
        initComponents();
        showCT();
    }

    private void showCT(){
       LoadData.LoadDatatb(sqlTB, tbQuyDinh);
       tbQuyDinh.getColumnModel().getColumn(0).setHeaderValue("Tên tham số");
       tbQuyDinh.getColumnModel().getColumn(0).setPreferredWidth(250);
       tbQuyDinh.getColumnModel().getColumn(1).setHeaderValue("Giá trị");
       tbQuyDinh.getColumnModel().getColumn(1).setPreferredWidth(100);
       TableColumn col = tbQuyDinh.getColumnModel().getColumn(2);
       tbQuyDinh.removeColumn(col);           
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbTenThamSo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtGiaTri = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        btnTroLai = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbQuyDinh = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        ckbChoPhepSua = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rules.png"))); // NOI18N
        jLabel1.setText("THAY ĐỔI QUY ĐỊNH");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tên tham số:");

        lbTenThamSo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Giá trị:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Sửa");

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

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Trở lại");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Thoát");

        btnThoat.setBackground(new java.awt.Color(255, 255, 255));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        tbQuyDinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tbQuyDinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbQuyDinhMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbQuyDinh);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Cho phép sửa:");

        ckbChoPhepSua.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbTenThamSo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtGiaTri, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ckbChoPhepSua)))))
                        .addGap(0, 93, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbTenThamSo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtGiaTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ckbChoPhepSua)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        if(this.lbTenThamSo.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Bạn cần chọn quy định để sửa", "Thông báo", 2);
        }else if(this.txtGiaTri.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Bạn cần thêm giá trị để sửa", "Thông báo", 2);
        }else if(this.ckbChoPhepSua.isSelected() == false){
            JOptionPane.showMessageDialog(null, "Giá trị không cho phép sửa", "Thông báo", 2);
        }else{
            if(JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa không ?","Thông báo",dialogButton)==0){
                String TenThamSo = this.lbTenThamSo.getText();
                int GiaTri =Integer.parseInt(this.txtGiaTri.getText());
                   QuyDinhDAL.UpdateThamSo(TenThamSo, GiaTri);
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

    private void tbQuyDinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbQuyDinhMouseClicked
          try {
            int row = this.tbQuyDinh.getSelectedRow();
            String IDRow = (this.tbQuyDinh.getModel().getValueAt(row, 0)).toString();
            String sql = "SELECT * FROM THAMSO WHERE TenThamSo =N'"+IDRow+"'"; 
            ResultSet rs = LoadData.ShowTextField(sql);
            if(rs.next()){//nếu có dữ liệu              
                this.lbTenThamSo.setText(rs.getString("TenThamSo"));
                this.txtGiaTri.setText(rs.getString("GiaTri"));   
                this.ckbChoPhepSua.setSelected(rs.getBoolean("ChoPhepSua"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }        
    }//GEN-LAST:event_tbQuyDinhMouseClicked

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
            java.util.logging.Logger.getLogger(JFQuyDinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFQuyDinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFQuyDinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFQuyDinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFQuyDinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTroLai;
    private javax.swing.JCheckBox ckbChoPhepSua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTenThamSo;
    private javax.swing.JTable tbQuyDinh;
    private javax.swing.JTextField txtGiaTri;
    // End of variables declaration//GEN-END:variables

}
