/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAL.LoadData;
import DAL.PhieuSuaChuaDAL;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import DAL.Connect;
import javax.swing.JOptionPane;

/**
 *
 * @author ThienNhut
 */
public class JFPhieuSuaChua extends javax.swing.JFrame {

    public static Connection con = Connect.getConnect();
    public static String sqlTB = "SELECT * FROM PHIEUSUACHUA";
    public static String sqlCBMaKH = "SELECT * FROM KHACHHANG";  
    public static String sqlCBTrangThai = "SELECT * FROM TRANGTHAIPSC"; 
    public static String sqlCBBX = "SELECT * FROM DANHSACHXE";

    public String SPSC, BienSoIndex;
    public int SoPSCIndex;

    /**
     * Creates new form JFPhieuSuaChua
     */
    public JFPhieuSuaChua() {
        initComponents();
        showCT();
        ProcessCtr(false);
    }
     public JFPhieuSuaChua(String MaKH, String BienSo) {
        initComponents();
        showCT();
        this.cbMaKH.setSelectedItem(MaKH);
        this.cbBienSo.setSelectedItem(BienSo);
        ProcessCtr(false);
    }

    public void showCT() {
        LoadData.LoadDatatb(sqlTB, tbPSC);
        //tbPSC.removeColumn(tbPSC.getColumnModel().getColumn(8));
       // tbPSC.removeColumn(tbPSC.getColumnModel().getColumn(8));
        tbPSC.getColumnModel().getColumn(0).setHeaderValue("Số PSC");
        tbPSC.getColumnModel().getColumn(1).setHeaderValue("Biển số");
        tbPSC.getColumnModel().getColumn(2).setHeaderValue("Mã KH");
        tbPSC.getColumnModel().getColumn(3).setHeaderValue("Ngày sửa chữa");
        tbPSC.getColumnModel().getColumn(4).setHeaderValue("Đánh giá");
        tbPSC.getColumnModel().getColumn(5).setHeaderValue("Trạng thái");
        tbPSC.getColumnModel().getColumn(6).setHeaderValue("Người đánh giá");
        tbPSC.getColumnModel().getColumn(7).setHeaderValue("Tổng tiền");
        tbPSC.getColumnModel().getColumn(8).setHeaderValue("Số tiền đã thanh toán");
        tbPSC.getColumnModel().getColumn(9).setHeaderValue("Số tiền nợ");
        
        LoadData.LoadDataCB(sqlCBMaKH, this.cbMaKH, "MaKH");
        LoadData.LoadDataCB(sqlCBTrangThai, this.cbTrangThai, "TrangThai"); 
        LoadData.LoadDataCB(sqlCBBX, this.cbBienSo, "BienSo");
        this.txtSoPSC.setEditable(false);
        this.txtTongTien.setEditable(false);
        this.txtSoTienDaThanhToan.setEditable(false);
        this.txtSoTienNo.setEditable(false);
    }

    public void ProcessCtr(boolean b) {
        this.btnThem.setEnabled(b);
        this.btnXoa.setEnabled(b);
        this.btnSua.setEnabled(b);
        this.btnChiTietPSC.setEnabled(b);
    }
    private int CheckDelete(int SoPSC){
        try {
            String sql = "SELECT * FROM CT_PHIEUSUACHUA WHERE SoPSC='"+SoPSC+"'"; 
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
        txtSoPSC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jdcNgaySuaChua = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPSC = new javax.swing.JTable();
        lbTong1 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        lbTong = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();
        btnTroLai = new javax.swing.JButton();
        btnTaiLai = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnNhapMoi = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtNguoiDanhGia = new javax.swing.JTextField();
        txtDanhGia = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        btnChiTietPSC = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        cbTrangThai = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        cbMaKH = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbBienSo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtSoTienDaThanhToan = new javax.swing.JTextField();
        txtSoTienNo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/suachua.png"))); // NOI18N
        jLabel1.setText("DANH SÁCH PHIẾU SỬA CHỮA");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Số PSC:");

        jdcNgaySuaChua.setDateFormatString("dd-MM-yyyy\n");
        jdcNgaySuaChua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Ngày sửa chửa:");

        tbPSC.setModel(new javax.swing.table.DefaultTableModel(
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
        tbPSC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPSCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPSC);

        lbTong1.setText("Tìm PSC theo biển số:");

        txtTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTimKiem.setToolTipText("Nhập vào dữ liệu muốn tìm");

        lbTong.setText("Tổng số phiếu sửa chữa");

        btnTimKiem.setBackground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnTroLai.setBackground(new java.awt.Color(255, 255, 255));
        btnTroLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/undo.png"))); // NOI18N
        btnTroLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroLaiActionPerformed(evt);
            }
        });

        btnTaiLai.setBackground(new java.awt.Color(255, 255, 255));
        btnTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refesh.png"))); // NOI18N
        btnTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiLaiActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(255, 255, 255));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
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

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Sửa");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Tìm kiếm");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Tải lại");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Trở lại");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Thoát");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Trạng thái:");

        btnNhapMoi.setBackground(new java.awt.Color(255, 255, 255));
        btnNhapMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/databaseimport.png"))); // NOI18N
        btnNhapMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapMoiActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Nhập mới");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("Người đánh giá:");

        txtNguoiDanhGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNguoiDanhGiaActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Đánh giá:");

        btnChiTietPSC.setBackground(new java.awt.Color(255, 255, 255));
        btnChiTietPSC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-administrative-tools-filled-50.png"))); // NOI18N
        btnChiTietPSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietPSCActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Chi tiết PSC");

        cbTrangThai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTrangThaiItemStateChanged(evt);
            }
        });
        cbTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTrangThaiActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Xe sửa chữa"));

        cbMaKH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbMaKH.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMaKHItemStateChanged(evt);
            }
        });
        cbMaKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbMaKHMouseClicked(evt);
            }
        });
        cbMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaKHActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Mã khách hàng:");

        cbBienSo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbBienSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBienSoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Biển số:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(cbMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cbBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel11)
                    .addComponent(cbMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setText("Tổng tiền:");

        txtSoTienDaThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoTienDaThanhToanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbTrangThai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSoPSC, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel18)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDanhGia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcNgaySuaChua, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSoTienDaThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSoTienNo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNguoiDanhGia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(btnNhapMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnChiTietPSC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbTong)
                                        .addGap(46, 46, 46))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbTong1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtSoPSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jdcNgaySuaChua, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cbTrangThai)
                            .addComponent(txtDanhGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNguoiDanhGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(txtSoTienDaThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(txtSoTienNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNhapMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTong1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbTong)
                                .addGap(15, 15, 15)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnChiTietPSC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)))
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

    private void cbBienSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBienSoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cbBienSoActionPerformed

    private void cbMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaKHActionPerformed
     
    }//GEN-LAST:event_cbMaKHActionPerformed

    private void tbPSCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPSCMouseClicked
        ProcessCtr(true);
        this.btnThem.setEnabled(false);
        try {
            int row = this.tbPSC.getSelectedRow();//lấy dòng hiện tại đang nhấn chuột
            String IDRow = (this.tbPSC.getModel().getValueAt(row, 0)).toString();//lấy giá trị ở dòng i vừa nhấn sau đó đổi qua string
            String sqltbid = "SELECT * FROM PHIEUSUACHUA WHERE SoPSC ='"+IDRow+"'";
            ResultSet rs = LoadData.ShowTextField(sqltbid);
            if (rs.next()) {//nếu có dữ liệu
                SoPSCIndex = rs.getInt("SoPSC");
                SPSC= rs.getString("SoPSC");
                BienSoIndex= rs.getString("BienSo");
                this.txtSoPSC.setText(rs.getString("SoPSC"));
                this.cbMaKH.setSelectedItem(rs.getString("MaKH"));
                this.cbBienSo.setSelectedItem(rs.getString("BienSo"));
                this.cbTrangThai.setSelectedItem(rs.getString("NguoiDanhGia"));
                this.txtTongTien.setText(rs.getString("TongTien"));
                this.jdcNgaySuaChua.setDate(rs.getDate("NgaySuaChua"));
                this.txtNguoiDanhGia.setText(rs.getString("NguoiDanhGia"));
                this.txtDanhGia.setText(rs.getString("DanhGia"));
                this.txtSoTienDaThanhToan.setText(rs.getString("SoTienDaThanhToan"));
                this.txtSoTienNo.setText(rs.getString("SoTienNo"));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tbPSCMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        if (this.txtTimKiem.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Bạn cần nhập dữ liệu tìm kiếm", "Thông báo", 1);
        } else {
            String dulieu = this.txtTimKiem.getText();
            String sql1 = "SELECT * FROM PHIEUSUACHUA WHERE BIENSO LIKE N'%"+dulieu+"%'";
            LoadData.LoadDatatb(sql1, tbPSC);
            this.lbTong.setText("Có " + this.tbPSC.getRowCount() + " PSC tìm thấy");
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnTroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroLaiActionPerformed
        Main frmMain = new Main();
        this.setVisible(false);
        frmMain.setVisible(true);
    }//GEN-LAST:event_btnTroLaiActionPerformed

    private void btnTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiLaiActionPerformed
        ProcessCtr(false);
        this.txtSoPSC.setText(null);       
        this.cbMaKH.setSelectedItem(null);
        this.cbBienSo.setSelectedItem(null); //set hiển thị cbbox item có vị trí số -1(không hiển thị gì)
        this.cbTrangThai.setSelectedItem(null);
        this.txtTongTien.setText(null);       
        this.txtNguoiDanhGia.setText(null);
        this.txtDanhGia.setText(null);
        this.txtSoTienDaThanhToan.setText(null);
        this.txtSoTienNo.setText(null);
        showCT();
    }//GEN-LAST:event_btnTaiLaiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Thoát khỏi chương trình ?", "Thông báo", 2) == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
         if (this.cbMaKH.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Bạn phải chọn khách hàng để sửa PSC", "Thông báo", 1);
        }else if (this.cbBienSo.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Bạn phải chọn biển số để sửa PSC", "Thông báo", 1);
        } else {//Double.parseDouble(text) đổi dạng text sang double, //Integer.parseInt(this.txtCMND.getTtxtSoPSC
            String bienSo = this.cbBienSo.getSelectedItem().toString();
            int maKH = Integer.parseInt(this.cbMaKH.getSelectedItem().toString());                        
            String danhGia = this.txtDanhGia.getText();
            String trangThai = this.cbTrangThai.getSelectedItem().toString();
            String nguoiDanhGia = this.txtNguoiDanhGia.getText();
            java.util.Date ngaysuachua = this.jdcNgaySuaChua.getDate();          
            Double tongTien = Double.parseDouble(this.txtTongTien.getText().equals("") ? "0":this.txtTongTien.getText());                    
            Double soTienDaThanhToan = Double.parseDouble(this.txtSoTienDaThanhToan.getText().equals("") ? "0":this.txtSoTienDaThanhToan.getText());
            PhieuSuaChuaDAL.UpdatePSC(SoPSCIndex, bienSo, maKH, ngaysuachua, danhGia, trangThai, nguoiDanhGia, tongTien, soTienDaThanhToan);
            showCT();
            ProcessCtr(false);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        if(this.txtSoPSC.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Bạn cần chọn PSC để xóa", "Thông báo", 2);
        }else if(CheckDelete(SoPSCIndex)==1){
            JOptionPane.showMessageDialog(null, "Xe đã sửa, xóa chi tiết PSC trước", "Thông báo", 2);
        }else{
          if(JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không ?","Thông báo",dialogButton)==0){
            PhieuSuaChuaDAL.DeletePSC(SoPSCIndex);
         //     KhachHang.DeleteKH(Integer.parseInt(this.txtMaKH.getText()));
            showCT();
            }   
       }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
    //    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");   
        if (this.cbMaKH.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Bạn phải chọn mã khách hàng để thêm PSC", "Thông báo", 1);
        }else if (this.cbBienSo.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Bạn phải chọn biển số để thêm PSC", "Thông báo", 1);
        } else {//Double.parseDouble(text) đổi dạng text sang double, //Integer.parseInt(this.txtCMND.getTtxtSoPSC  
            String bienSo = this.cbBienSo.getSelectedItem().toString();
            int maKH = Integer.parseInt(this.cbMaKH.getSelectedItem().toString());                        
            String danhGia = this.txtDanhGia.getText();
            String trangThai = this.cbTrangThai.getSelectedItem().toString();
            String nguoiDanhGia = this.txtNguoiDanhGia.getText();
            String _strTongTien = this.txtTongTien.getText();
            Double tongTien = Double.parseDouble(this.txtTongTien.getText().equals("") ? "0":this.txtTongTien.getText());
            java.util.Date ngaysuachua = this.jdcNgaySuaChua.getDate();
           PhieuSuaChuaDAL.InsertPSC(bienSo, maKH, ngaysuachua, danhGia, trangThai, nguoiDanhGia, tongTien);
            showCT();
            ProcessCtr(false);
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapMoiActionPerformed
        ProcessCtr(false);
        this.btnThem.setEnabled(true);
        this.txtSoPSC.setText(null);        
        this.cbTrangThai.setSelectedIndex(-1);
        this.txtTongTien.setText(null);     
        this.txtNguoiDanhGia.setText(null);
        this.txtDanhGia.setText(null);
        this.txtSoTienDaThanhToan.setText(null);
        this.txtSoTienNo.setText(null);
    }//GEN-LAST:event_btnNhapMoiActionPerformed

    private void txtNguoiDanhGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNguoiDanhGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNguoiDanhGiaActionPerformed

    private void btnChiTietPSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietPSCActionPerformed
            JFChiTietSuaChua frmCTPSC = new JFChiTietSuaChua(SPSC, BienSoIndex);
            this.setVisible(false);
            frmCTPSC.setVisible(true);
    }//GEN-LAST:event_btnChiTietPSCActionPerformed

    private void cbTrangThaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTrangThaiItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTrangThaiItemStateChanged

    private void cbTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTrangThaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTrangThaiActionPerformed

    private void cbMaKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbMaKHMouseClicked
    
    }//GEN-LAST:event_cbMaKHMouseClicked

    private void cbMaKHItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMaKHItemStateChanged
        try {
            String LayMaKH = this.cbMaKH.getSelectedItem().toString();
            String sqlCBBienSo = "SELECT * FROM DANHSACHXE WHERE MaKH='"+LayMaKH+"'";
            LoadData.LoadDataCB(sqlCBBienSo, this.cbBienSo, "BienSo");
        } catch (Exception e) {
            this.cbBienSo.removeAllItems();
        }
    }//GEN-LAST:event_cbMaKHItemStateChanged

    private void txtSoTienDaThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoTienDaThanhToanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoTienDaThanhToanActionPerformed

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
            java.util.logging.Logger.getLogger(JFPhieuSuaChua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPhieuSuaChua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPhieuSuaChua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPhieuSuaChua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPhieuSuaChua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiTietPSC;
    private javax.swing.JButton btnNhapMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaiLai;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTroLai;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbBienSo;
    private javax.swing.JComboBox<String> cbMaKH;
    private javax.swing.JComboBox<String> cbTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcNgaySuaChua;
    private javax.swing.JLabel lbTong;
    private javax.swing.JLabel lbTong1;
    private javax.swing.JTable tbPSC;
    private javax.swing.JTextField txtDanhGia;
    private javax.swing.JTextField txtNguoiDanhGia;
    private javax.swing.JTextField txtSoPSC;
    private javax.swing.JTextField txtSoTienDaThanhToan;
    private javax.swing.JTextField txtSoTienNo;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables

}
