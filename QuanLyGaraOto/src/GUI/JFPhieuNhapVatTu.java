/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import DAL.LoadData;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author ThienNhut
 */
public class JFPhieuNhapVatTu extends javax.swing.JFrame {
  
    public static String sqlPNVT = "SELECT * FROM PHIEUNHAP";   
    public static String sqlCTPNVT = "SELECT * FROM CT_PHIEUNHAP";
    public static String sqlCBTrangThai = "SELECT * FROM TRANGTHAIPNHAP";
    public static String sqlCBTenVatTu = "SELECT * FROM VATTU";
    public int SoPhieuIndex, MaVTIndex;
   
    
    public JFPhieuNhapVatTu() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        showCT();  
        ProcessCtr1(false);
        ProcessCtr2(false);
    }    

    private void showCT(){        
        LoadData.LoadDatatb(sqlPNVT, tbPNVT);
        CtrlTable1();
        LoadData.LoadDatatb(sqlCTPNVT, tbCTPNVT); 
        CtrlTable2();
        
        LoadData.LoadDataCB(sqlCBTrangThai, this.cbTrangThai, "TrangThai");
        LoadData.LoadDataCB(sqlCBTenVatTu, this.cbTenVatTu, "TenVTPT");               
            
        this.txtSoPhieu.setEditable(false);
        this.txtMaVatTu.setEditable(false);           
    }
    private void CtrlTable1(){
        tbPNVT.getColumnModel().getColumn(0).setHeaderValue("Số PN");
        tbPNVT.getColumnModel().getColumn(0).setPreferredWidth(20);
        tbPNVT.getColumnModel().getColumn(1).setHeaderValue("Ngày nhập");
        tbPNVT.getColumnModel().getColumn(2).setHeaderValue("Người nhập");
        tbPNVT.getColumnModel().getColumn(3).setHeaderValue("Người duyệt");
        tbPNVT.getColumnModel().getColumn(4).setHeaderValue("Trạng thái");
        tbPNVT.getColumnModel().getColumn(5).setHeaderValue("Tổng tiền");
    }
    private void CtrlTable2(){
        tbCTPNVT.getColumnModel().getColumn(0).setHeaderValue("Số PN");
        tbCTPNVT.getColumnModel().getColumn(0).setPreferredWidth(20);
        tbCTPNVT.getColumnModel().getColumn(1).setHeaderValue("Mã vật tư");
        tbCTPNVT.getColumnModel().getColumn(0).setPreferredWidth(20);
        tbCTPNVT.getColumnModel().getColumn(2).setHeaderValue("Số lượng");
        tbCTPNVT.getColumnModel().getColumn(3).setHeaderValue("Đơn vị tính");
        tbCTPNVT.getColumnModel().getColumn(4).setHeaderValue("Đơn giá nhập");
        tbCTPNVT.getColumnModel().getColumn(5).setHeaderValue("Thành tiền");
    }
    private void ProcessCtr1(boolean b){
        this.btnThemPNVT.setEnabled(b);
        this.btnSuaPNVT.setEnabled(b);
        this.btnXoaPNVT.setEnabled(b);
    }
    private void ProcessCtr2(boolean b){
        this.btnThemCT_PNVT.setEnabled(b);
        this.btnSuaCT_PNVT.setEnabled(b);
        this.btnXoaCT_PNVT.setEnabled(b);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnCTPSC = new javax.swing.JPanel();
        cbTrangThai = new javax.swing.JComboBox<>();
        txtNguoiNhap = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPNVT = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        btnThemPNVT = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        sd = new javax.swing.JLabel();
        txtSoPhieu = new javax.swing.JTextField();
        btnXoaPNVT = new javax.swing.JButton();
        btnSuaPNVT = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNguoiDuyet = new javax.swing.JTextField();
        jdcNgayNhap = new com.toedter.calendar.JDateChooser();
        pnCTSDVT = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbTenVatTu = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCTPNVT = new javax.swing.JTable();
        btnThemCT_PNVT = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnTaiLai = new javax.swing.JButton();
        btnTroLai = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtThanhTien = new javax.swing.JTextField();
        btnSuaCT_PNVT = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btnXoaCT_PNVT = new javax.swing.JButton();
        txtMaVatTu = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtDonVi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        spSoLuong = new javax.swing.JSpinner();
        btnThemHX1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vattu.png"))); // NOI18N
        jLabel1.setText(" PHIẾU NHẬP VẬT TƯ");

        pnCTPSC.setBackground(new java.awt.Color(255, 255, 255));
        pnCTPSC.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách phiếu nhập vật tư trong tháng"));

        jLabel5.setText("Ngày nhập:");

        tbPNVT.setModel(new javax.swing.table.DefaultTableModel(
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
        tbPNVT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPNVTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPNVT);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Thêm");

        btnThemPNVT.setBackground(new java.awt.Color(255, 255, 255));
        btnThemPNVT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        btnThemPNVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemPNVTActionPerformed(evt);
            }
        });

        jLabel15.setText("Trạng thái:");

        jLabel16.setText("Người nhập:");

        sd.setText("Số phiếu:");

        btnXoaPNVT.setBackground(new java.awt.Color(255, 255, 255));
        btnXoaPNVT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        btnXoaPNVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaPNVTActionPerformed(evt);
            }
        });

        btnSuaPNVT.setBackground(new java.awt.Color(255, 255, 255));
        btnSuaPNVT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        btnSuaPNVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaPNVTActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Sửa");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Xóa");

        jLabel18.setText("Người duyệt:");

        jdcNgayNhap.setDateFormatString("dd - MM - yyyy");

        javax.swing.GroupLayout pnCTPSCLayout = new javax.swing.GroupLayout(pnCTPSC);
        pnCTPSC.setLayout(pnCTPSCLayout);
        pnCTPSCLayout.setHorizontalGroup(
            pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCTPSCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnCTPSCLayout.createSequentialGroup()
                        .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCTPSCLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(331, 331, 331))
                            .addGroup(pnCTPSCLayout.createSequentialGroup()
                                .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sd)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnCTPSCLayout.createSequentialGroup()
                                        .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtSoPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNguoiNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(61, 61, 61)
                                        .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(txtNguoiDuyet, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdcNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnCTPSCLayout.createSequentialGroup()
                        .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThemPNVT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnCTPSCLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel11)))
                        .addGap(18, 18, 18)
                        .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCTPSCLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6))
                            .addComponent(btnXoaPNVT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSuaPNVT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnCTPSCLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel23)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnCTPSCLayout.setVerticalGroup(
            pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCTPSCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sd)
                        .addComponent(txtSoPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jdcNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtNguoiNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtNguoiDuyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCTPSCLayout.createSequentialGroup()
                        .addComponent(btnXoaPNVT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(pnCTPSCLayout.createSequentialGroup()
                        .addComponent(btnSuaPNVT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23))
                    .addGroup(pnCTPSCLayout.createSequentialGroup()
                        .addComponent(btnThemPNVT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addContainerGap())
        );

        pnCTSDVT.setBackground(new java.awt.Color(255, 255, 255));
        pnCTSDVT.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi tiết phiếu nhập vật tư"));

        jLabel8.setText("Mã vật tư:");

        cbTenVatTu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbTenVatTu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTenVatTuItemStateChanged(evt);
            }
        });

        jLabel9.setText("Tên vật tư:");

        jLabel10.setText("Đơn giá:");

        tbCTPNVT.setModel(new javax.swing.table.DefaultTableModel(
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
        tbCTPNVT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCTPNVTMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbCTPNVT);

        btnThemCT_PNVT.setBackground(new java.awt.Color(255, 255, 255));
        btnThemCT_PNVT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        btnThemCT_PNVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCT_PNVTActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Thêm");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Tải lại");

        btnTaiLai.setBackground(new java.awt.Color(255, 255, 255));
        btnTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refesh.png"))); // NOI18N
        btnTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiLaiActionPerformed(evt);
            }
        });

        btnTroLai.setBackground(new java.awt.Color(255, 255, 255));
        btnTroLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/undo.png"))); // NOI18N
        btnTroLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroLaiActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Trở lại");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Thoát");

        btnThoat.setBackground(new java.awt.Color(255, 255, 255));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jLabel17.setText("Thành tiền:");

        btnSuaCT_PNVT.setBackground(new java.awt.Color(255, 255, 255));
        btnSuaCT_PNVT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        btnSuaCT_PNVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaCT_PNVTActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Xóa");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Sửa");

        btnXoaCT_PNVT.setBackground(new java.awt.Color(255, 255, 255));
        btnXoaCT_PNVT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        btnXoaCT_PNVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaCT_PNVTActionPerformed(evt);
            }
        });

        jLabel21.setText("Đơn vị");

        jLabel7.setText("Số lượng:");

        spSoLuong.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spSoLuong.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spSoLuongStateChanged(evt);
            }
        });

        btnThemHX1.setBackground(new java.awt.Color(255, 255, 255));
        btnThemHX1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon20/add.png"))); // NOI18N
        btnThemHX1.setToolTipText("Thêm, xóa hiệu xe");
        btnThemHX1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHX1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnCTSDVTLayout = new javax.swing.GroupLayout(pnCTSDVT);
        pnCTSDVT.setLayout(pnCTSDVTLayout);
        pnCTSDVTLayout.setHorizontalGroup(
            pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCTSDVTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                    .addGroup(pnCTSDVTLayout.createSequentialGroup()
                        .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThemCT_PNVT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnCTSDVTLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel12)))
                        .addGap(18, 18, 18)
                        .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXoaCT_PNVT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnCTSDVTLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel22)))
                        .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCTSDVTLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnSuaCT_PNVT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnCTSDVTLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel24)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCTSDVTLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCTSDVTLayout.createSequentialGroup()
                                .addComponent(btnTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnCTSDVTLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(11, 11, 11))
                            .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnCTSDVTLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel14))))
                    .addGroup(pnCTSDVTLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel21)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaVatTu)
                            .addComponent(txtDonVi)
                            .addComponent(cbTenVatTu, 0, 170, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCTSDVTLayout.createSequentialGroup()
                                .addComponent(btnThemHX1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtThanhTien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnCTSDVTLayout.setVerticalGroup(
            pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCTSDVTLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(txtMaVatTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(spSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(cbTenVatTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemHX1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel21)
                    .addComponent(txtDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnCTSDVTLayout.createSequentialGroup()
                            .addComponent(btnThemCT_PNVT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel12))
                        .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCTSDVTLayout.createSequentialGroup()
                                .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addGroup(pnCTSDVTLayout.createSequentialGroup()
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel14))
                            .addGroup(pnCTSDVTLayout.createSequentialGroup()
                                .addComponent(btnTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)))
                        .addGroup(pnCTSDVTLayout.createSequentialGroup()
                            .addComponent(btnXoaCT_PNVT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel22)))
                    .addGroup(pnCTSDVTLayout.createSequentialGroup()
                        .addComponent(btnSuaCT_PNVT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnCTPSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnCTSDVT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnCTPSC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnCTSDVT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    
    private void btnTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiLaiActionPerformed
        this.cbTrangThai.setSelectedIndex(-1);
        this.cbTenVatTu.setSelectedIndex(-1);
        this.txtSoPhieu.setText(null);
        this.txtNguoiNhap.setText(null);
        this.txtNguoiDuyet.setText(null);
        this.txtMaVatTu.setText(null);
        this.spSoLuong.setValue(0);
        this.txtDonVi.setText(null);
        this.txtDonGia.setText(null);
        this.txtThanhTien.setText(null);
        ProcessCtr1(false);
        ProcessCtr2(false);
        this.btnThemPNVT.setEnabled(true);
        this.btnThemCT_PNVT.setEnabled(true);
        showCT();
    }//GEN-LAST:event_btnTaiLaiActionPerformed

    private void btnTroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroLaiActionPerformed
        Main frm = new Main();
        this.setVisible(false);
        frm.setVisible(true);
    }//GEN-LAST:event_btnTroLaiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Thoát khỏi chương trình ?","Thông báo", 2)==0){
            this.dispose();
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void cbTenVatTuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTenVatTuItemStateChanged
          //  int k = this.cbTenVatTu.getSelectedIndex();
          //  this.txtMaVatTu.setText((k+1)); 
    }//GEN-LAST:event_cbTenVatTuItemStateChanged

    private void btnThemPNVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemPNVTActionPerformed
//            if(this.txtSoPSC.getText().length()==0){
//                JOptionPane.showMessageDialog(null,"Chọn phiếu sửa chữa để thêm","Thông báo", 2);
//            } else if(this.txtNguoiNhap.getText().length()==0){
//                JOptionPane.showMessageDialog(null,"Chọn dịch vụ để thêm","Thông báo", 2);
//            } else{
//                int SoPSC = Integer.parseInt(this.txtSoPSC.getText());
//                int MaTienCong = Integer.parseInt(this.txtSoPhieu.getText());
//                String GhiChu = this.txtGhiChu.getText();
//                Double TienCong = Double.parseDouble(this.txtNguoiNhap.getText());
//                Double TienVTPT = 0.0;
//                Double TongTien =Double.parseDouble(this.txtNguoiNhap.getText());
//                CT_PhieuSuaChuaDAL.InsertCT_PSC(SoPSC, MaTienCong, GhiChu, TienCong, TienVTPT, TongTien);
//            }
//            showCT();
    }//GEN-LAST:event_btnThemPNVTActionPerformed

    private void btnThemCT_PNVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCT_PNVTActionPerformed
//            int rowid = this.tbPNVT.getSelectedRow();//lấy dòng hiện tại đang nhấn chuột
//            int k = Integer.parseInt((this.tbPNVT.getModel().getValueAt(rowid, 1)).toString());
//            if(this.txtSoPSC.getText().length()==0){
//                JOptionPane.showMessageDialog(null,"Cần chọn PSC để thêm","Thông báo", 2);
//            }else if(k==0 || k==1 || k==2 || k==3 || k==7){
//                JOptionPane.showMessageDialog(null,"Chọn PSC cần thay thế phụ tùng để thêm phụ tùng","Thông báo", 2);
//            }else if(this.txtDonVi.getText().length()==0){
//                JOptionPane.showMessageDialog(null,"Cần chọn vật tư để thêm","Thông báo", 2);
//            }else if(Integer.parseInt(this.spSoLuong.getValue().toString())==0){
//                JOptionPane.showMessageDialog(null,"Cần chọn số lượng vật tư để thêm","Thông báo", 2);
//            }else{
//                int SoPSC = Integer.parseInt(this.txtSoPSC.getText());
//                int MaTienCong = Integer.parseInt(this.txtMaVatTu.getText());
//                int MaVTPT = Integer.parseInt(this.txtDonVi.getText());
//                int SoLuong = Integer.parseInt(this.spSoLuong.getValue().toString());
//                Double DonGia = Double.parseDouble(this.txtDonGia.getText());                 
//                CT_SuDungVatTuDAL.InsertCT_SDVT(SoPSC, MaTienCong, MaVTPT, SoLuong, DonGia);
//                showCT();
//            }
            
    }//GEN-LAST:event_btnThemCT_PNVTActionPerformed

    private void spSoLuongStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spSoLuongStateChanged
        int SoLuong = Integer.parseInt(this.spSoLuong.getValue().toString());
            if(this.txtDonGia.getText().length() != 0){
            Double DonGia = Double.parseDouble(this.txtDonGia.getText());   
            Double TT = SoLuong*DonGia;        
            this.txtThanhTien.setText(String.valueOf(TT));
            }
    }//GEN-LAST:event_spSoLuongStateChanged

    private void btnXoaPNVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaPNVTActionPerformed
//        int dialogButton = JOptionPane.YES_NO_OPTION;
//        if(this.txtSoPSC.getText().length() == 0){
//            JOptionPane.showMessageDialog(null, "Bạn cần chọn số PSC để xóa", "Thông báo", 2);
//        }else if(this.txtSoPhieu.getText().length() == 0){
//            JOptionPane.showMessageDialog(null, "Bạn cần chọn vào số phiếu để xóa", "Thông báo", 2);
//        }else{
//            if(JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không ?","Thông báo",dialogButton)==0){
//               CT_PhieuSuaChuaDAL.DeleteCT_PSC(Integer.parseInt(this.txtSoPSC.getText()), Integer.parseInt(this.txtSoPhieu.getText()));
//                showCT();
//            }
//        }
    }//GEN-LAST:event_btnXoaPNVTActionPerformed

    private void btnSuaPNVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaPNVTActionPerformed
//            if(this.txtSoPSC.getText().length()==0){
//                JOptionPane.showMessageDialog(null,"Chọn phiếu sửa chữa để sửa","Thông báo", 2);
//            } else{
//                int SoPSC = Integer.parseInt(this.txtSoPSC.getText());
//                int MaTienCong = Integer.parseInt(this.txtSoPhieu.getText());
//                String GhiChu = this.txtGhiChu.getText();
//                CT_PhieuSuaChuaDAL.UpdateCT_PSC(SoPSC, MaTienCong, GhiChu);
//            }
//            showCT();
    }//GEN-LAST:event_btnSuaPNVTActionPerformed

    private void btnSuaCT_PNVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaCT_PNVTActionPerformed
//            if(this.txtSoPSC.getText().length()==0){
//                JOptionPane.showMessageDialog(null,"Cần chọn PSC để thêm","Thông báo", 2);
//            }else{
//                int SoPSC = Integer.parseInt(this.txtSoPSC.getText());
//                int MaTienCong = Integer.parseInt(this.txtMaVatTu.getText());
//                int MaVTPT = Integer.parseInt(this.txtDonVi.getText());
//                int SoLuong = Integer.parseInt(this.spSoLuong.getValue().toString());
//                Double DonGia = Double.parseDouble(this.txtDonGia.getText()); 
//             //   int dongia = Integer.parseInt(this.txtDonGia.getText()); 
//                CT_SuDungVatTuDAL.UpdateCT_SDVT(SoPSC, MaTienCong, MaVTPT, SoLuong, DonGia);
//                showCT();
//            }
    }//GEN-LAST:event_btnSuaCT_PNVTActionPerformed

    private void btnXoaCT_PNVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaCT_PNVTActionPerformed
//             if(this.txtDonVi.getText().length() == 0){
//            JOptionPane.showMessageDialog(null, "Chọn phiếu sử dụng vật tư để xóa", "Thông báo", 1);
//            }else if(JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa không ?","Thông báo",2)==0){
//                CT_SuDungVatTuDAL.DeleteCT_SDVT(Integer.parseInt(this.txtSoPSC.getText()), Integer.parseInt(this.txtMaVatTu.getText()), Integer.parseInt(this.txtDonVi.getText()));
//                showCT();
//            }
    }//GEN-LAST:event_btnXoaCT_PNVTActionPerformed

    private void tbPNVTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPNVTMouseClicked
        ProcessCtr1(true);
        this.btnThemPNVT.setEnabled(false);
        try {
            int row = this.tbPNVT.getSelectedRow();//lấy dòng hiện tại đang nhấn chuột
            String IDRow = (this.tbPNVT.getModel().getValueAt(row, 0)).toString();//lấy giá trị ở dòng i vừa nhấn sau đó đổi qua string
            String sql = "SELECT * FROM PHIEUNHAP WHERE SoPN='"+IDRow+"'"; 
            ResultSet rs = LoadData.ShowTextField(sql);         
            if(rs.next()){//nếu có dữ liệu  
                SoPhieuIndex = rs.getInt("SoPN");
                this.txtSoPhieu.setText(rs.getString("SoPN"));
                this.jdcNgayNhap.setDate(rs.getDate("NgayNhap"));
                this.txtNguoiNhap.setText(rs.getString("NguoiNhap"));                
                this.txtNguoiDuyet.setText(rs.getString("NguoiDuyet"));                
                this.cbTrangThai.setSelectedItem(rs.getString("TrangThai"));               
            }
            String sqlTBCTPN = "SELECT * FROM CT_PHIEUNHAP WHERE SoPN='"+SoPhieuIndex+"'"; 
            LoadData.LoadDatatb(sqlTBCTPN, tbCTPNVT);   
            CtrlTable2();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tbPNVTMouseClicked

    private void tbCTPNVTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCTPNVTMouseClicked
        ProcessCtr2(true);
        this.btnThemCT_PNVT.setEnabled(false);
        try {
            int row = this.tbCTPNVT.getSelectedRow();//lấy dòng hiện tại đang nhấn chuột
            String IDRow = (this.tbCTPNVT.getModel().getValueAt(row, 1)).toString();//lấy giá trị ở dòng i vừa nhấn sau đó đổi qua string
            String sql = "SELECT * FROM CT_PHIEUNHAP WHERE MaVTPT ='"+IDRow+"'"; 
            ResultSet rs = LoadData.ShowTextField(sql);          
            if(rs.next()){//nếu có dữ liệu
                MaVTIndex = rs.getInt("MaVTPT");
                this.txtMaVatTu.setText(rs.getString("MaVTPT"));
                this.spSoLuong.setValue(Integer.valueOf(rs.getString("SoLuong")));                  
                this.txtDonVi.setText(rs.getString("DVT"));                
                this.txtDonGia.setText(rs.getString("DonGiaNhap"));
                this.txtThanhTien.setText(rs.getString("ThanhTien"));  
                int k = Integer.parseInt(this.txtMaVatTu.getText());
                this.cbTenVatTu.setSelectedIndex(k-1);  
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tbCTPNVTMouseClicked

    private void btnThemHX1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHX1ActionPerformed
        JFVatTu frm = new JFVatTu();
        this.setVisible(false);
        frm.setVisible(true);
    }//GEN-LAST:event_btnThemHX1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFPhieuNhapVatTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPhieuNhapVatTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPhieuNhapVatTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPhieuNhapVatTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPhieuNhapVatTu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaCT_PNVT;
    private javax.swing.JButton btnSuaPNVT;
    private javax.swing.JButton btnTaiLai;
    private javax.swing.JButton btnThemCT_PNVT;
    private javax.swing.JButton btnThemHX;
    private javax.swing.JButton btnThemHX1;
    private javax.swing.JButton btnThemLX;
    private javax.swing.JButton btnThemPNVT;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTroLai;
    private javax.swing.JButton btnXoaCT_PNVT;
    private javax.swing.JButton btnXoaPNVT;
    private javax.swing.JComboBox<String> cbTenVatTu;
    private javax.swing.JComboBox<String> cbTrangThai;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdcNgayNhap;
    private javax.swing.JPanel pnCTPSC;
    private javax.swing.JPanel pnCTSDVT;
    private javax.swing.JLabel sd;
    private javax.swing.JSpinner spSoLuong;
    private javax.swing.JTable tbCTPNVT;
    private javax.swing.JTable tbPNVT;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtDonVi;
    private javax.swing.JTextField txtMaVatTu;
    private javax.swing.JTextField txtNguoiDuyet;
    private javax.swing.JTextField txtNguoiNhap;
    private javax.swing.JTextField txtSoPhieu;
    private javax.swing.JTextField txtThanhTien;
    // End of variables declaration//GEN-END:variables
}
