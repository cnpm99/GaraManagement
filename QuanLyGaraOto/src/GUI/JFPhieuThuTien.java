/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAL.LoadData;
import DAL.PhieuThuTienDAL;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author ThienNhut
 */
public class JFPhieuThuTien extends javax.swing.JFrame {

    public static String sqlTB = "SELECT * FROM PHIEUTHUTIEN";
    public static String sqlCB = "SELECT * FROM KHACHHANG";
    private int SoPhieuIndex;
    
    public JFPhieuThuTien() {
        initComponents();
        ProcessCtr(false);
        defaulCtrl();
        showCT();        
    }
    public JFPhieuThuTien(String Ma) {
        initComponents();       
        ProcessCtr(false);
        defaulCtrl();
        showCT(); 
        this.cbMaKH.setSelectedItem(Ma);       
    }
    private void defaulCtrl(){
        this.txtSoPhieu.setEditable(false);
        this.txtSoTienNo.setEditable(false);
        this.txtEmail.setEditable(false);
        this.txtTenChuXe.setEditable(false);
        this.txtDienThoai.setEditable(false);
        this.txtDiaChi.setEditable(false);
        this.txtHieuXe.setEditable(false);
        this.txtNgayTiepNhan.setEditable(false);
    }
    private void showCT(){
        LoadData.LoadDatatb(sqlTB, tbPhieuThuTien);
        LoadData.LoadDataCB(sqlCB, cbMaKH, "MaKH");                                     
    }
    private void ProcessCtr(boolean b){
        this.btnThem.setEnabled(b);
        this.btnXoa.setEnabled(b);
        this.btnSua.setEnabled(b);        
    }
    private void updatePSC(){
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cbMaKH = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtDienThoai = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTenChuXe = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtSoPhieu = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtSoTienNo = new javax.swing.JTextField();
        txtSoTienThu = new javax.swing.JTextField();
        jdcNgayThu = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPhieuThuTien = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        btnTroLai = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbBienSo = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        txtHieuXe = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtNgayTiepNhan = new javax.swing.JTextField();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnNhapMoi = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bill.png"))); // NOI18N
        jLabel1.setText("PHIẾU THU TIỀN");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin khách hàng"));

        cbMaKH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbMaKH.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMaKHItemStateChanged(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Mã khách hàng:");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("Điện thoại:");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Tên chủ xe:");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Email:");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setText("Địa chỉ:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(74, 74, 74)
                                .addComponent(txtEmail))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(cbMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel21)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenChuXe, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(txtDienThoai)
                    .addComponent(txtDiaChi))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(cbMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtTenChuXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin phiếu thu"));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Số phiếu:");

        txtSoPhieu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Số tiền nợ:");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Số tiền thu:");

        txtSoTienThu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSoTienThuKeyReleased(evt);
            }
        });

        jdcNgayThu.setDateFormatString("dd-MM-yyyy");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Ngày thu:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel5))
                .addGap(56, 56, 56)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcNgayThu, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSoTienNo, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(txtSoTienThu))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel13)
                            .addComponent(txtSoPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoTienNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel5)
                            .addComponent(jdcNgayThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtSoTienThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbPhieuThuTien.setModel(new javax.swing.table.DefaultTableModel(
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
        tbPhieuThuTien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPhieuThuTienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPhieuThuTien);

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Thêm");

        btnThoat.setBackground(new java.awt.Color(255, 255, 255));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
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

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Thoát");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin xe"));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Biển số:");

        cbBienSo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbBienSo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbBienSoItemStateChanged(evt);
            }
        });
        cbBienSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBienSoActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Hiệu xe:");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setText("Ngày tiếp nhận:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel20))
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbBienSo, 0, 160, Short.MAX_VALUE)
                    .addComponent(txtNgayTiepNhan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(txtHieuXe, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtHieuXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtNgayTiepNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

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

        btnNhapMoi.setBackground(new java.awt.Color(255, 255, 255));
        btnNhapMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/databaseimport.png"))); // NOI18N
        btnNhapMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapMoiActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Nhập mới");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Sửa");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Xóa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel6)))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnNhapMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel22)
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel7)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel10)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(224, 224, 224)
                                        .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnNhapMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel10)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel11))))))))
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

    private void cbMaKHItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMaKHItemStateChanged
        try {
            if(this.cbMaKH.getSelectedIndex()!=-1){
                this.txtHieuXe.setText(null);
                this.txtNgayTiepNhan.setText(null);
                String LayMaKH = this.cbMaKH.getSelectedItem().toString();          
                String sqlCBBienSo = "SELECT * FROM DANHSACHXE WHERE MaKH='"+LayMaKH+"'";
                LoadData.LoadDataCB(sqlCBBienSo, this.cbBienSo, "BienSo");
                ResultSet rs = LoadData.ShowTextField(sqlCBBienSo);
                if(rs.next()){//nếu có dữ liệu                
                    this.txtHieuXe.setText(rs.getString("HieuXe"));
                    this.txtNgayTiepNhan.setText(rs.getString("NgayTiepNhan"));                    
                }
                String sqlShowKH = "SELECT * FROM KHACHHANG WHERE MaKH ='"+LayMaKH+"'";
                ResultSet rs1 = LoadData.ShowTextField(sqlShowKH);
                if(rs1.next()){//nếu có dữ liệu              
                    this.txtTenChuXe.setText(rs1.getString("TenKH"));
                    this.txtDienThoai.setText(rs1.getString("DienThoai"));   
                    this.txtEmail.setText(rs1.getString("Email"));   
                    this.txtDiaChi.setText(rs1.getString("DiaChi"));   
                }
            }
        } catch (SQLException e) {
            this.cbBienSo.removeAllItems();
        }
    }//GEN-LAST:event_cbMaKHItemStateChanged

    private void cbBienSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBienSoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBienSoActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if(this.cbBienSo.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Bạn cần chọn xe để thêm phiếu thu", "Thông báo", 2);
        }else if(this.txtSoTienThu.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Nhập số tiền thu", "Thông báo", 2);
        }else{      
            String BienSo = this.cbBienSo.getSelectedItem().toString();
            java.util.Date NgayThu = this.jdcNgayThu.getDate();
            Double SoTienThu = Double.parseDouble(this.txtSoTienThu.getText());
            PhieuThuTienDAL.InsertPTT(BienSo, NgayThu, SoTienThu);
            showCT();
           }             
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Thoát khỏi chương trình ?","Thông báo", 2)==0){
            this.dispose();
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnTroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroLaiActionPerformed
        Main frmMain = new Main();
        this.setVisible(false);
        frmMain.setVisible(true);
    }//GEN-LAST:event_btnTroLaiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
            int dialogButton = JOptionPane.YES_NO_OPTION;
        if(this.txtSoPhieu.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Bạn cần phiếu thu để xóa", "Thông báo", 2);
        }else{
          if(JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không ?","Thông báo",dialogButton)==0){
              int SoPhieu = Integer.parseInt(this.txtSoPhieu.getText());
              String BienSo = this.cbBienSo.getSelectedItem().toString();
              Double SoTienThu = Double.parseDouble(this.txtSoTienThu.getText());
              PhieuThuTienDAL.DeletePTT(SoPhieu, BienSo, SoTienThu);
            showCT();
            }   
       }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if(this.txtSoPhieu.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Bạn cần phiếu thu để xóa", "Thông báo", 2);
        }else{         
            int SoPhieu = Integer.parseInt(this.txtSoPhieu.getText());
            String BienSo = this.cbBienSo.getSelectedItem().toString();
            java.util.Date NgayThu = this.jdcNgayThu.getDate();
            Double SoTienThu = Double.parseDouble(this.txtSoTienThu.getText());
            PhieuThuTienDAL.UpdatePTT(SoPhieu, BienSo, NgayThu, SoTienThu);
            showCT();               
       }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapMoiActionPerformed
        ProcessCtr(false);
        this.btnThem.setEnabled(true);
        this.txtSoTienThu.setText(null);                          
    }//GEN-LAST:event_btnNhapMoiActionPerformed

    private void cbBienSoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbBienSoItemStateChanged
        try {
            if(this.cbBienSo.getSelectedIndex()!=-1){
            String LayBienSo = this.cbBienSo.getSelectedItem().toString();           
            String sqlBienSo = "SELECT * FROM DANHSACHXE WHERE BienSo='"+LayBienSo+"'";           
            ResultSet rs = LoadData.ShowTextField(sqlBienSo);           
            if(rs.next()){//nếu có dữ liệu                
                this.txtHieuXe.setText(rs.getString("HieuXe"));
                this.txtNgayTiepNhan.setText(rs.getString("NgayTiepNhan")); 
                this.txtSoTienNo.setText(rs.getString("TienNo")); 
            }
            }
        } catch (SQLException e) { 
            JOptionPane.showMessageDialog(rootPane, e);
        } catch (NullPointerException NPE){
            System.out.println(NPE);
        }
    
        
    }//GEN-LAST:event_cbBienSoItemStateChanged

    private void tbPhieuThuTienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPhieuThuTienMouseClicked
            ProcessCtr(true);
        this.btnThem.setEnabled(false);
        try {
            int row = this.tbPhieuThuTien.getSelectedRow();//lấy dòng hiện tại đang nhấn chuột
            String IDRow = (this.tbPhieuThuTien.getModel().getValueAt(row, 0)).toString();//lấy giá trị ở dòng i vừa nhấn sau đó đổi qua string
            String sql = "SELECT * FROM PHIEUTHUTIEN WHERE SoPhieu='"+IDRow+"'"; 
            ResultSet rs = LoadData.ShowTextField(sql);
            // đọc dữ liệu tại dòng có MaKH = row 0 trên bảng
            if(rs.next()){//nếu có dữ liệu
                SoPhieuIndex = rs.getInt("SoPhieu");
                this.txtSoPhieu.setText(rs.getString("SoPhieu")); 
                this.cbMaKH.setSelectedItem(rs.getString("MaKH"));
                this.jdcNgayThu.setDate(rs.getDate("NgayThu")); 
                this.txtSoTienThu.setText(rs.getString("SoTienThu"));                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tbPhieuThuTienMouseClicked

    private void txtSoTienThuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoTienThuKeyReleased
            if(this.txtSoTienNo.getText() !=null){
                Double SoTienNo = Double.parseDouble(this.txtSoTienNo.getText());
                Double SoTienThu = Double.parseDouble(this.txtSoTienThu.getText());
                if(SoTienThu > SoTienNo){
                    this.txtSoTienThu.setForeground(Color.red);
                    this.txtSoTienThu.setToolTipText("Nhập sai");
                }
                else
                    this.txtSoTienThu.setForeground(Color.black);
            }
            
    }//GEN-LAST:event_txtSoTienThuKeyReleased

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
            java.util.logging.Logger.getLogger(JFPhieuThuTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPhieuThuTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPhieuThuTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPhieuThuTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPhieuThuTien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhapMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTroLai;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbBienSo;
    private javax.swing.JComboBox<String> cbMaKH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcNgayThu;
    private javax.swing.JTable tbPhieuThuTien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDienThoai;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHieuXe;
    private javax.swing.JTextField txtNgayTiepNhan;
    private javax.swing.JTextField txtSoPhieu;
    private javax.swing.JTextField txtSoTienNo;
    private javax.swing.JTextField txtSoTienThu;
    private javax.swing.JTextField txtTenChuXe;
    // End of variables declaration//GEN-END:variables
}
