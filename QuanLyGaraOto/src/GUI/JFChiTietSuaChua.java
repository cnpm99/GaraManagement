/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAL.CT_PhieuSuaChuaDAL;
import DAL.CT_SuDungVatTuDAL;
import DAL.LoadData;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author ThienNhut
 */
public class JFChiTietSuaChua extends javax.swing.JFrame {

    public int SPSC;//Số phiếu sửa chữa được truyền từ JFPhieuSuaChua
    public static String sqlTBCTPSC="";
    public static String sqlTBCTSDVT ="";
    public static String sqlCBDV = "SELECT * FROM TIENCONG";   
    public static String sqlVTPT = "SELECT * FROM VATTU";
    public int SoPSCIndex, MaTCIndex;
    public Double SoTienIndex;
   
    
    public JFChiTietSuaChua() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        if(SPSC <=0 ){
            JOptionPane.showMessageDialog(null,"Bạn cần chọn phiếu sửa chữa để mở chi tiết phiếu sửa chữa","Thông báo", 2);
        }else
        showCT();
    }
    public JFChiTietSuaChua(String SoPSC, String BienSo) {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);// set jf full màn hình
        SPSC = Integer.parseInt(SoPSC);
        this.txtSoPSC.setText(SoPSC);
        this.txtBienSo.setText(BienSo);
        sqlTBCTPSC = "SELECT * FROM CT_PHIEUSUACHUA WHERE SoPSC ="+SPSC;
        sqlTBCTSDVT = "SELECT * FROM CT_SUDUNGVATTU WHERE SoPSC ="+SPSC;
        showCT();   
        ProcessCtr(false);        
    }

    private void showCT(){ 
      
        LoadData.LoadDatatb(sqlTBCTPSC, tbCTPSC);
        tbCTPSC.getColumnModel().getColumn(0).setHeaderValue("Số PSC");
        //tbCTPSC.getColumnModel().getColumn(0).setPreferredWidth(5);
        tbCTPSC.getColumnModel().getColumn(1).setHeaderValue("Mã tiền công");
        tbCTPSC.getColumnModel().getColumn(2).setHeaderValue("Ghi chú");
        tbCTPSC.getColumnModel().getColumn(3).setHeaderValue("Tiền vật tư");
        tbCTPSC.getColumnModel().getColumn(4).setHeaderValue("Tiền công");
        tbCTPSC.getColumnModel().getColumn(5).setHeaderValue("Tổng tiền");
        LoadData.LoadDatatb(sqlTBCTSDVT, tbCTSDVT); 
        tbCTSDVT.getColumnModel().getColumn(0).setHeaderValue("Số PSC");
        tbCTSDVT.getColumnModel().getColumn(1).setHeaderValue("Mã tiền công");
        tbCTSDVT.getColumnModel().getColumn(2).setHeaderValue("Mã vật tư");
        tbCTSDVT.getColumnModel().getColumn(3).setHeaderValue("Số lượng");
        tbCTSDVT.getColumnModel().getColumn(4).setHeaderValue("Đơn giá");
        tbCTSDVT.getColumnModel().getColumn(5).setHeaderValue("Thành tiền");
        LoadData.LoadDataCB(sqlCBDV, this.cbDichVu, "NoiDung");
        LoadData.LoadDataCB(sqlVTPT, this.cbTenVatTu, "TenVTPT");               
            
        this.txtSoPSC.setEditable(false);
        this.txtBienSo.setEditable(false);
        this.txtTienCong.setEditable(false);    
        this.txtDonGia.setEditable(false);
        this.txtThanhTien.setEditable(false);
        this.txtMaTienCong.setEditable(false);
        this.txtMaTienCongVT.setEditable(false);
        this.txtMaVatTu.setEditable(false);           
    }
    private void ProcessCtr(boolean b){
        this.cbTenVatTu.setEnabled(b);
        this.spSoLuong.setEnabled(b);
        this.txtMaTienCongVT.setEnabled(b);
        this.txtMaVatTu.setEnabled(b);
        this.txtDonGia.setEnabled(b);
        this.txtThanhTien.setEnabled(b);
        this.pnCTSDVT.setEnabled(b);
        this.btnThemCT_SDVT.setEnabled(b);
    }
    private int CheckDelete(int SoPSC, int MaTC){
        String sql = "SELECT * FROM CT_SUDUNGVATTU WHERE MaTienCong="+MaTC+" AND SoPSC="+SoPSC; 
        ResultSet rs = LoadData.ShowTextField(sql);
        if(rs==null)
            return 0;
        else
            return 1;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnCTPSC = new javax.swing.JPanel();
        cbDichVu = new javax.swing.JComboBox<>();
        txtTienCong = new javax.swing.JTextField();
        txtGhiChu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCTPSC = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        btnThemCT_PSC = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        sd = new javax.swing.JLabel();
        txtMaTienCong = new javax.swing.JTextField();
        btnXoaCT_PSC = new javax.swing.JButton();
        btnSuaCT_PSC = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnCTSDVT = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbTenVatTu = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCTSDVT = new javax.swing.JTable();
        btnThemCT_SDVT = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnTaiLai = new javax.swing.JButton();
        btnTroLai = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        spSoLuong = new javax.swing.JSpinner();
        txtMaVatTu = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtThanhTien = new javax.swing.JTextField();
        btnSuaCT_SDVT = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btnXoaCT_SDVT = new javax.swing.JButton();
        txtMaTienCongVT = new javax.swing.JTextField();
        pnPSC = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtSoPSC = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtBienSo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-administrative-tools-filled-50.png"))); // NOI18N
        jLabel1.setText("CHI TIẾT PHIẾU SỬA CHỮA");

        pnCTPSC.setBackground(new java.awt.Color(255, 255, 255));
        pnCTPSC.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi tiết phiếu sửa chửa"));

        cbDichVu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDichVuItemStateChanged(evt);
            }
        });

        jLabel5.setText("Ghi chú:");

        tbCTPSC.setModel(new javax.swing.table.DefaultTableModel(
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
        tbCTPSC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCTPSCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCTPSC);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Thêm");

        btnThemCT_PSC.setBackground(new java.awt.Color(255, 255, 255));
        btnThemCT_PSC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        btnThemCT_PSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCT_PSCActionPerformed(evt);
            }
        });

        jLabel15.setText("Dịch vụ:");

        jLabel16.setText("Tiền công:");

        sd.setText("Mã tiền công:");

        btnXoaCT_PSC.setBackground(new java.awt.Color(255, 255, 255));
        btnXoaCT_PSC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        btnXoaCT_PSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaCT_PSCActionPerformed(evt);
            }
        });

        btnSuaCT_PSC.setBackground(new java.awt.Color(255, 255, 255));
        btnSuaCT_PSC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        btnSuaCT_PSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaCT_PSCActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Sửa");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Xóa");

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
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addGap(33, 33, 33)
                        .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCTPSCLayout.createSequentialGroup()
                                .addComponent(cbDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addComponent(txtTienCong, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCTPSCLayout.createSequentialGroup()
                        .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCTPSCLayout.createSequentialGroup()
                                .addComponent(sd)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaTienCong, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnCTPSCLayout.createSequentialGroup()
                                .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnThemCT_PSC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnCTPSCLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel11)))
                                .addGap(18, 18, 18)
                                .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnCTPSCLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel6)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel23))
                                    .addGroup(pnCTPSCLayout.createSequentialGroup()
                                        .addComponent(btnXoaCT_PSC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSuaCT_PSC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnCTPSCLayout.setVerticalGroup(
            pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCTPSCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCTPSCLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTienCong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addComponent(txtGhiChu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaTienCong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnThemCT_PSC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaCT_PSC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaCT_PSC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCTPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel6)
                    .addComponent(jLabel23)))
        );

        pnCTSDVT.setBackground(new java.awt.Color(255, 255, 255));
        pnCTSDVT.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi tiết sử dụng vật tư"));

        jLabel7.setText("Số lượng:");

        jLabel8.setText("Mã tiền công:");

        cbTenVatTu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbTenVatTu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTenVatTuItemStateChanged(evt);
            }
        });

        jLabel9.setText("Tên vật tư:");

        jLabel10.setText("Đơn giá:");

        tbCTSDVT.setModel(new javax.swing.table.DefaultTableModel(
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
        tbCTSDVT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCTSDVTMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbCTSDVT);

        btnThemCT_SDVT.setBackground(new java.awt.Color(255, 255, 255));
        btnThemCT_SDVT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        btnThemCT_SDVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCT_SDVTActionPerformed(evt);
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

        spSoLuong.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spSoLuongStateChanged(evt);
            }
        });

        jLabel21.setText("Mã vật tư:");

        jLabel17.setText("Thành tiền:");

        btnSuaCT_SDVT.setBackground(new java.awt.Color(255, 255, 255));
        btnSuaCT_SDVT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        btnSuaCT_SDVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaCT_SDVTActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Xóa");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Sửa");

        btnXoaCT_SDVT.setBackground(new java.awt.Color(255, 255, 255));
        btnXoaCT_SDVT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        btnXoaCT_SDVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaCT_SDVTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnCTSDVTLayout = new javax.swing.GroupLayout(pnCTSDVT);
        pnCTSDVT.setLayout(pnCTSDVTLayout);
        pnCTSDVTLayout.setHorizontalGroup(
            pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCTSDVTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                    .addGroup(pnCTSDVTLayout.createSequentialGroup()
                        .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThemCT_SDVT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnCTSDVTLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel12)))
                        .addGap(18, 18, 18)
                        .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCTSDVTLayout.createSequentialGroup()
                                .addComponent(btnXoaCT_SDVT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSuaCT_SDVT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnCTSDVTLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel22)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel24)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnCTSDVTLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addGap(11, 11, 11))
                            .addGroup(pnCTSDVTLayout.createSequentialGroup()
                                .addComponent(btnTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnCTSDVTLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel14))))
                    .addGroup(pnCTSDVTLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel21)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(spSoLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMaVatTu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMaTienCongVT, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCTSDVTLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(cbTenVatTu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCTSDVTLayout.createSequentialGroup()
                                .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtThanhTien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        pnCTSDVTLayout.setVerticalGroup(
            pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCTSDVTLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(cbTenVatTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaTienCongVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7))
                .addGap(9, 9, 9)
                .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtMaVatTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel17)
                    .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCTSDVTLayout.createSequentialGroup()
                        .addComponent(btnThemCT_SDVT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addGroup(pnCTSDVTLayout.createSequentialGroup()
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel14))
                    .addGroup(pnCTSDVTLayout.createSequentialGroup()
                        .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel20)))
                    .addGroup(pnCTSDVTLayout.createSequentialGroup()
                        .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnXoaCT_SDVT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSuaCT_SDVT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCTSDVTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24)))))
        );

        pnPSC.setBackground(new java.awt.Color(255, 255, 255));
        pnPSC.setBorder(javax.swing.BorderFactory.createTitledBorder("Phiếu sửa chữa của xe"));

        jLabel18.setText("Số phiếu sửa chữa:");

        txtSoPSC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel19.setText("Biển số:");

        txtBienSo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout pnPSCLayout = new javax.swing.GroupLayout(pnPSC);
        pnPSC.setLayout(pnPSCLayout);
        pnPSCLayout.setHorizontalGroup(
            pnPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPSCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(txtSoPSC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(txtBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnPSCLayout.setVerticalGroup(
            pnPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPSCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel19)
                    .addComponent(txtBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoPSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnCTPSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnCTSDVT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnPSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnPSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnCTSDVT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnCTPSC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
        this.cbDichVu.setSelectedIndex(-1);
        this.cbTenVatTu.setSelectedIndex(-1);
        this.txtMaTienCong.setText(null);
        this.txtTienCong.setText(null);
        this.txtGhiChu.setText(null);
        this.txtMaTienCongVT.setText(null);
        this.spSoLuong.setValue(0);
        this.txtMaVatTu.setText(null);
        this.txtDonGia.setText(null);
        this.txtThanhTien.setText(null);
        
    }//GEN-LAST:event_btnTaiLaiActionPerformed

    private void btnTroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroLaiActionPerformed
        JFPhieuSuaChua frmPSC = new JFPhieuSuaChua();
        this.setVisible(false);
        frmPSC.setVisible(true);
    }//GEN-LAST:event_btnTroLaiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Thoát khỏi chương trình ?","Thông báo", 2)==0){
            this.dispose();
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void cbDichVuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDichVuItemStateChanged
        try {
            if(this.cbDichVu.getSelectedItem()== null)
            {
                return;
            }
            String LayDichVu = this.cbDichVu.getSelectedItem().toString(); 
            String sqlTBTienCong = "SELECT * FROM TIENCONG WHERE NoiDung=N'"+LayDichVu+"'";
            ResultSet rs = LoadData.ShowTextField(sqlTBTienCong);
            if(rs.next()){//nếu có dữ liệu                                            
                this.txtTienCong.setText(rs.getString("TienCong")); 
                this.txtMaTienCong.setText(rs.getString("MaTienCong"));
                this.txtMaTienCongVT.setText(rs.getString("MaTienCong"));
            }
            int k = this.cbDichVu.getSelectedIndex();        
                if(k == 4 || k == 5 || k == 6 ){
                    ProcessCtr(true);
                }else
                    ProcessCtr(false);
        } catch (SQLException e) {            
            this.txtTienCong.setText("");                                
        }
        
    }//GEN-LAST:event_cbDichVuItemStateChanged

    private void cbTenVatTuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTenVatTuItemStateChanged
         try {
            if(this.cbTenVatTu.getSelectedItem()== null)
            {
                return;
            }
            String LayTenVatTu = this.cbTenVatTu.getSelectedItem().toString(); 
            String sqlTBVatTu = "SELECT * FROM VATTU WHERE TenVTPT=N'"+LayTenVatTu+"'";
            ResultSet rs = LoadData.ShowTextField(sqlTBVatTu);
            if(rs.next()){//nếu có dữ liệu                                            
                this.txtDonGia.setText(rs.getString("DonGia"));   
                this.txtMaVatTu.setText(rs.getString("MaVTPT"));  
            }
        } catch (SQLException e) {            
            this.txtTienCong.setText("");                               
        }
    }//GEN-LAST:event_cbTenVatTuItemStateChanged

    private void btnThemCT_PSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCT_PSCActionPerformed
            if(this.txtSoPSC.getText().length()==0){
                JOptionPane.showMessageDialog(null,"Chọn phiếu sửa chữa để thêm","Thông báo", 2);
            } else if(this.txtTienCong.getText().length()==0){
                JOptionPane.showMessageDialog(null,"Chọn dịch vụ để thêm","Thông báo", 2);
            } else{
                int SoPSC = Integer.parseInt(this.txtSoPSC.getText());
                int MaTienCong = Integer.parseInt(this.txtMaTienCong.getText());
                String GhiChu = this.txtGhiChu.getText();
                Double TienCong = Double.parseDouble(this.txtTienCong.getText());
                Double TienVTPT = 0.0;
                Double TongTien =Double.parseDouble(this.txtTienCong.getText());
                CT_PhieuSuaChuaDAL.InsertCT_PSC(SoPSC, MaTienCong, GhiChu, TienCong, TienVTPT, TongTien);
            }
            showCT();
    }//GEN-LAST:event_btnThemCT_PSCActionPerformed

    private void btnThemCT_SDVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCT_SDVTActionPerformed
            int rowid = this.tbCTPSC.getSelectedRow();//lấy dòng hiện tại đang nhấn chuột
            int k = Integer.parseInt((this.tbCTPSC.getModel().getValueAt(rowid, 1)).toString());
            if(this.txtSoPSC.getText().length()==0){
                JOptionPane.showMessageDialog(null,"Cần chọn PSC để thêm","Thông báo", 2);
            }else if(k==0 || k==1 || k==2 || k==3 || k==7){
                JOptionPane.showMessageDialog(null,"Chọn PSC cần thay thế phụ tùng để thêm phụ tùng","Thông báo", 2);
            }else if(this.txtMaVatTu.getText().length()==0){
                JOptionPane.showMessageDialog(null,"Cần chọn vật tư để thêm","Thông báo", 2);
            }else if(Integer.parseInt(this.spSoLuong.getValue().toString())==0){
                JOptionPane.showMessageDialog(null,"Cần chọn số lượng vật tư để thêm","Thông báo", 2);
            }else{
                int SoPSC = Integer.parseInt(this.txtSoPSC.getText());
                int MaTienCong = Integer.parseInt(this.txtMaTienCongVT.getText());
                int MaVTPT = Integer.parseInt(this.txtMaVatTu.getText());
                int SoLuong = Integer.parseInt(this.spSoLuong.getValue().toString());
                Double DonGia = Double.parseDouble(this.txtDonGia.getText());                 
                CT_SuDungVatTuDAL.InsertCT_SDVT(SoPSC, MaTienCong, MaVTPT, SoLuong, DonGia);
                showCT();
            }
            
    }//GEN-LAST:event_btnThemCT_SDVTActionPerformed

    private void spSoLuongStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spSoLuongStateChanged
        int SoLuong = Integer.parseInt(this.spSoLuong.getValue().toString());
        Double DonGia = Double.parseDouble(this.txtDonGia.getText());   
        Double TT = SoLuong*DonGia;        
        this.txtThanhTien.setText(String.valueOf(TT));
    }//GEN-LAST:event_spSoLuongStateChanged

    private void btnXoaCT_PSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaCT_PSCActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        if(this.txtSoPSC.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Bạn cần chọn số PSC để xóa", "Thông báo", 2);
        }else if(this.txtMaTienCong.getText().length() == 0){  
            JOptionPane.showMessageDialog(null, "Bạn cần chọn vào số phiếu để xóa", "Thông báo", 2);   
        }else if(SoTienIndex >0){  
            JOptionPane.showMessageDialog(null, "Phiếu đã có vật tư, xóa vật tư trước", "Thông báo", 2); 
        }else{
            if(JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không ?","Thông báo",dialogButton)==0){
               CT_PhieuSuaChuaDAL.DeleteCT_PSC(Integer.parseInt(this.txtSoPSC.getText()), Integer.parseInt(this.txtMaTienCong.getText()));
                showCT();
            }
        }
    }//GEN-LAST:event_btnXoaCT_PSCActionPerformed

    private void btnSuaCT_PSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaCT_PSCActionPerformed
            if(this.txtSoPSC.getText().length()==0){
                JOptionPane.showMessageDialog(null,"Chọn phiếu sửa chữa để sửa","Thông báo", 2);
            } else{
                int SoPSC = Integer.parseInt(this.txtSoPSC.getText());
                int MaTienCong = Integer.parseInt(this.txtMaTienCong.getText());
                String GhiChu = this.txtGhiChu.getText();
                CT_PhieuSuaChuaDAL.UpdateCT_PSC(SoPSC, MaTienCong, GhiChu);
            }
            showCT();
    }//GEN-LAST:event_btnSuaCT_PSCActionPerformed

    private void btnSuaCT_SDVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaCT_SDVTActionPerformed
            if(this.txtSoPSC.getText().length()==0){
                JOptionPane.showMessageDialog(null,"Cần chọn PSC để thêm","Thông báo", 2);
            }else{
                int SoPSC = Integer.parseInt(this.txtSoPSC.getText());
                int MaTienCong = Integer.parseInt(this.txtMaTienCongVT.getText());
                int MaVTPT = Integer.parseInt(this.txtMaVatTu.getText());
                int SoLuong = Integer.parseInt(this.spSoLuong.getValue().toString());
                Double DonGia = Double.parseDouble(this.txtDonGia.getText()); 
                CT_SuDungVatTuDAL.UpdateCT_SDVT(SoPSC, MaTienCong, MaVTPT, SoLuong, DonGia);
                showCT();
            }
    }//GEN-LAST:event_btnSuaCT_SDVTActionPerformed

    private void btnXoaCT_SDVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaCT_SDVTActionPerformed
             if(this.txtMaVatTu.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Chọn phiếu sử dụng vật tư để xóa", "Thông báo", 1);
            }else if(JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa không ?","Thông báo",2)==0){
                CT_SuDungVatTuDAL.DeleteCT_SDVT(Integer.parseInt(this.txtSoPSC.getText()), Integer.parseInt(this.txtMaTienCongVT.getText()), Integer.parseInt(this.txtMaVatTu.getText()));
                showCT();
            }
    }//GEN-LAST:event_btnXoaCT_SDVTActionPerformed

    private void tbCTPSCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCTPSCMouseClicked

        try {
            int row = this.tbCTPSC.getSelectedRow();//lấy dòng hiện tại đang nhấn chuột
            String IDRow0 = (this.tbCTPSC.getModel().getValueAt(row, 0)).toString();//lấy giá trị ở dòng i vừa nhấn sau đó đổi qua string
            String IDRow1 = (this.tbCTPSC.getModel().getValueAt(row, 1)).toString();
            String sql = "SELECT * FROM CT_PHIEUSUACHUA WHERE MaTienCong='"+IDRow1+"' AND SoPSC ='"+IDRow0+"'"; 
            ResultSet rs = LoadData.ShowTextField(sql);
            // đọc dữ liệu tại dòng có MaKH = row 0 trên bảng
            if(rs.next()){//nếu có dữ liệu               
                MaTCIndex = Integer.parseInt(rs.getString("MaTienCong"));
                SoTienIndex = rs.getDouble("TienVTPT");
                this.txtTienCong.setText(rs.getString("TienCong"));
                this.txtMaTienCong.setText(rs.getString("MaTienCong"));
                this.txtMaTienCongVT.setText(rs.getString("MaTienCong"));
                this.txtGhiChu.setText(rs.getString("GhiChu")); 
                int k = Integer.parseInt(this.txtMaTienCong.getText());
                this.cbDichVu.setSelectedIndex(k-1);              
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tbCTPSCMouseClicked

    private void tbCTSDVTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCTSDVTMouseClicked
        ProcessCtr(true);
        try {
            int row = this.tbCTSDVT.getSelectedRow();//lấy dòng hiện tại đang nhấn chuột
            String IDRow = (this.tbCTSDVT.getModel().getValueAt(row, 2)).toString();//lấy giá trị ở dòng i vừa nhấn sau đó đổi qua string
            String sql = "SELECT * FROM CT_SUDUNGVATTU WHERE MaVTPT ='"+IDRow+"'"; 
            ResultSet rs = LoadData.ShowTextField(sql);
            // đọc dữ liệu tại dòng có MaKH = row 0 trên bảng
            if(rs.next()){//nếu có dữ liệu               
                this.txtDonGia.setText(rs.getString("DonGia"));
                this.txtMaVatTu.setText(rs.getString("MaVTPT"));
                this.txtMaTienCongVT.setText(rs.getString("MaTienCong"));
                this.txtDonGia.setText(rs.getString("DonGia"));
                this.txtThanhTien.setText(rs.getString("ThanhTien"));
                this.spSoLuong.setValue(Integer.valueOf(rs.getString("SoLuong")));    
                int k = Integer.parseInt(this.txtMaVatTu.getText());
                this.cbTenVatTu.setSelectedIndex(k-1);   
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tbCTSDVTMouseClicked

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
            java.util.logging.Logger.getLogger(JFChiTietSuaChua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFChiTietSuaChua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFChiTietSuaChua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFChiTietSuaChua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFChiTietSuaChua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaCT_PSC;
    private javax.swing.JButton btnSuaCT_SDVT;
    private javax.swing.JButton btnTaiLai;
    private javax.swing.JButton btnThemCT_PSC;
    private javax.swing.JButton btnThemCT_SDVT;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTroLai;
    private javax.swing.JButton btnXoaCT_PSC;
    private javax.swing.JButton btnXoaCT_SDVT;
    private javax.swing.JComboBox<String> cbDichVu;
    private javax.swing.JComboBox<String> cbTenVatTu;
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
    private javax.swing.JPanel pnCTPSC;
    private javax.swing.JPanel pnCTSDVT;
    private javax.swing.JPanel pnPSC;
    private javax.swing.JLabel sd;
    private javax.swing.JSpinner spSoLuong;
    private javax.swing.JTable tbCTPSC;
    private javax.swing.JTable tbCTSDVT;
    private javax.swing.JTextField txtBienSo;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtMaTienCong;
    private javax.swing.JTextField txtMaTienCongVT;
    private javax.swing.JTextField txtMaVatTu;
    private javax.swing.JTextField txtSoPSC;
    private javax.swing.JTextField txtThanhTien;
    private javax.swing.JTextField txtTienCong;
    // End of variables declaration//GEN-END:variables
}
