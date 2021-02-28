/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAL.LoadData;
import javax.swing.JOptionPane;

/**
 *
 * @author ThienNhut
 */
public class JFBaoGiaTienCong extends javax.swing.JFrame {

    private static String sqlTB = "SELECT * FROM TIENCONG";
    
    public JFBaoGiaTienCong() {
        initComponents();
        showCT();
    }

    private void showCT(){
        LoadData.LoadDatatb(sqlTB, tbTienCong);
        CtrlTable();
    }
    private void CtrlTable(){
        tbTienCong.removeColumn(tbTienCong.getColumnModel().getColumn(0));
        //tbTienCong.getColumnModel().getColumn(0).setHeaderValue("Mã tiền công");
        tbTienCong.getColumnModel().getColumn(0).setHeaderValue("Nội dung");
        tbTienCong.getColumnModel().getColumn(1).setHeaderValue("Tiền công");     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTienCong = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTienCong = new javax.swing.JTable();
        btnThoat = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnTroLai = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        btnTaiLai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tiencong.png"))); // NOI18N
        jLabel1.setText("BÁO GIÁ TIỀN CÔNG");

        txtTienCong.setToolTipText("Nhập để tìm kiếm");
        txtTienCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienCongActionPerformed(evt);
            }
        });
        txtTienCong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTienCongKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Tên tiền công:");

        tbTienCong.setModel(new javax.swing.table.DefaultTableModel(
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
        tbTienCong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTienCongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTienCong);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtTienCong, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtTienCong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

    private void txtTienCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienCongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienCongActionPerformed

    private void tbTienCongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTienCongMouseClicked
        try {
            int row = this.tbTienCong.getSelectedRow();//lấy dòng hiện tại đang nhấn chuột
            this.txtTienCong.setText(this.tbTienCong.getModel().getValueAt(row, 1).toString());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tbTienCongMouseClicked

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
            this.txtTienCong.setText(null);             
            showCT();
    }//GEN-LAST:event_btnTaiLaiActionPerformed

    private void txtTienCongKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienCongKeyReleased
        String TienCong = this.txtTienCong.getText();
        String sqlTimKiem = "SELECT * FROM TIENCONG WHERE NOIDUNG LIKE N'%"+TienCong+"%'";
        LoadData.LoadDatatb(sqlTimKiem, tbTienCong);
        CtrlTable();
    }//GEN-LAST:event_txtTienCongKeyReleased

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
            java.util.logging.Logger.getLogger(JFBaoGiaTienCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFBaoGiaTienCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFBaoGiaTienCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFBaoGiaTienCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFBaoGiaTienCong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaiLai;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTroLai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbTienCong;
    private javax.swing.JTextField txtTienCong;
    // End of variables declaration//GEN-END:variables
}
