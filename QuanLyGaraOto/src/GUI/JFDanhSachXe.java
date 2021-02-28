/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import DAL.LoadData;
import DAL.DanhSachXeDAL;
import java.sql.*;
import javax.swing.*;
import DAL.Connect;
import javax.swing.JOptionPane;
/**
 *
 * @author ThienNhut
 */
public final class JFDanhSachXe extends javax.swing.JFrame {

    public static Connection con = Connect.getConnect();
    public static String sqlTB="SELECT * FROM DANHSACHXE";
    public static String sqlCBKH="SELECT * FROM KHACHHANG";
    public static String sqlCBHX="SELECT * FROM HIEUXE";
    public static String sqlCBLXA="SELECT * FORM LOAIXE";
    public String BienSoIndex, MaKHC;//Biến này lưu tạm mã kh khi ấn vào một dòng trong bảng
   

   
     
    public JFDanhSachXe() {
       initComponents();
        showCT();     
        ProcessCtr(false);
    }
    public JFDanhSachXe(String MaKH, String TenKH){        
        initComponents();
        showCT(); 
        this.txtMaKH.setText(MaKH);
        this.cbTenKH.setSelectedItem(TenKH);        
        ProcessCtr(false);                 
    }
    private void showCT(){        
        LoadData.LoadDatatb(sqlTB, tbDSXe);
        tbDSXe.getColumnModel().getColumn(0).setHeaderValue("Biển số");
        tbDSXe.getColumnModel().getColumn(1).setHeaderValue("Hiệu xe");
        tbDSXe.getColumnModel().getColumn(2).setHeaderValue("Loại xe");
        tbDSXe.getColumnModel().getColumn(3).setHeaderValue("Đời xe");
        tbDSXe.getColumnModel().getColumn(4).setHeaderValue("Số KM");
        tbDSXe.getColumnModel().getColumn(5).setHeaderValue("Số khung");
        tbDSXe.getColumnModel().getColumn(6).setHeaderValue("Số máy");
        tbDSXe.getColumnModel().getColumn(7).setHeaderValue("Màu sơn");
        tbDSXe.getColumnModel().getColumn(8).setHeaderValue("Ngày tiếp nhận");
        tbDSXe.getColumnModel().getColumn(9).setHeaderValue("Mã KH");
        tbDSXe.getColumnModel().getColumn(10).setHeaderValue("Tiền nợ");
        
        LoadData.LoadDataCB(sqlCBHX, this.cbHieuXe, "HieuXe");
        LoadData.LoadDataCB(sqlCBLXA, this.cbLoaiXe, "LoaiXe");
        LoadData.LoadDataCB(sqlCBKH, this.cbTenKH, "TenKH");
        this.lbTong.setText("Tổng số xe: "+this.tbDSXe.getRowCount());
        this.txtTienNo.setEditable(false);
       
    }
    private void ProcessCtr(boolean b){
        this.btnThem.setEnabled(b);
        this.btnXoa.setEnabled(b);
        this.btnSua.setEnabled(b);
        this.btnThemPSC.setEnabled(b);
        this.btnThemPTT.setEnabled(b);
    }
    private int CheckDelete(String BienSo){
        try {
            String sql = "SELECT * FROM PHIEUSUACHUA WHERE BienSo='"+BienSo+"'"; 
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

        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTroLai = new javax.swing.JButton();
        btnNhapMoi = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtDoiXe = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtSoKm = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDSXe = new javax.swing.JTable();
        jdcNgayTiepNhan = new com.toedter.calendar.JDateChooser();
        cbHieuXe = new javax.swing.JComboBox<>();
        txtSoKhung = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTienNo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtMauSon = new javax.swing.JTextField();
        txtSoMay = new javax.swing.JTextField();
        lbTong = new javax.swing.JLabel();
        txtBienSo = new javax.swing.JTextField();
        lbTong1 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        btnTaiLai = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(3, 0), new java.awt.Dimension(3, 0), new java.awt.Dimension(3, 32767));
        cbLoaiXe = new javax.swing.JComboBox<>();
        btnThemPSC = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        btnThemHX = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        btnTimKiemMaKH = new javax.swing.JButton();
        cbTenKH = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        btnThemPTT = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        btnThemLX = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
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

        btnNhapMoi.setBackground(new java.awt.Color(255, 255, 255));
        btnNhapMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/databaseimport.png"))); // NOI18N
        btnNhapMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapMoiActionPerformed(evt);
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

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Nhập mới");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Trở lại");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Sửa");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Xóa");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Thêm");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dsxe.png"))); // NOI18N
        jLabel1.setText("DANH SÁCH XE");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Hiệu xe:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Biển số:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Đời xe:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Loại xe:");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Ngày tiếp nhận:");

        txtDoiXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoiXeActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Số KM:");

        tbDSXe.setModel(new javax.swing.table.DefaultTableModel(
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
        tbDSXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSXeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDSXe);

        jdcNgayTiepNhan.setDateFormatString("dd-MM-yyyy\n");
        jdcNgayTiepNhan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbHieuXe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbHieuXeItemStateChanged(evt);
            }
        });
        cbHieuXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHieuXeActionPerformed(evt);
            }
        });

        txtSoKhung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoKhungActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Số khung:");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Tiền nợ:");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("Số máy:");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Màu sơn:");

        lbTong.setText("Tổng số xe");

        lbTong1.setText("Tìm kiếm theo tên khách hàng:");

        txtTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTimKiem.setToolTipText("Nhập vào dữ liệu muốn tìm");

        btnTimKiem.setBackground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Tìm kiếm");

        btnTaiLai.setBackground(new java.awt.Color(255, 255, 255));
        btnTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refesh.png"))); // NOI18N
        btnTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiLaiActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Tải lại");

        cbLoaiXe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbLoaiXeItemStateChanged(evt);
            }
        });
        cbLoaiXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoaiXeActionPerformed(evt);
            }
        });

        btnThemPSC.setBackground(new java.awt.Color(255, 255, 255));
        btnThemPSC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/suachua.png"))); // NOI18N
        btnThemPSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemPSCActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Thêm PSC");

        btnThemHX.setBackground(new java.awt.Color(255, 255, 255));
        btnThemHX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon20/add.png"))); // NOI18N
        btnThemHX.setToolTipText("Thêm, xóa hiệu xe");
        btnThemHX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHXActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Khách hàng"));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel22.setText("Mã khách hàng:");

        txtMaKH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        btnTimKiemMaKH.setBackground(new java.awt.Color(255, 255, 255));
        btnTimKiemMaKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon20/find.png"))); // NOI18N
        btnTimKiemMaKH.setToolTipText("Tìm xe theo Mã KH");
        btnTimKiemMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemMaKHActionPerformed(evt);
            }
        });

        cbTenKH.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTenKHItemStateChanged(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Tên khách hàng:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTimKiemMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnTimKiemMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cbTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnThemPTT.setBackground(new java.awt.Color(255, 255, 255));
        btnThemPTT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bill.png"))); // NOI18N
        btnThemPTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemPTTActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Phiếu thu tiền");

        btnThemLX.setBackground(new java.awt.Color(255, 255, 255));
        btnThemLX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon20/add.png"))); // NOI18N
        btnThemLX.setToolTipText("Thêm, xóa loại xe");
        btnThemLX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemLXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNhapMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnThemPSC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel6)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel7)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnThemPTT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(lbTong1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(lbTong)
                                        .addGap(117, 117, 117)))
                                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel20)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(11, 11, 11))
                            .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10))
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cbHieuXe, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnThemHX, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(cbLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnThemLX, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel13))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdcNgayTiepNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtSoKhung, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtSoKm, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDoiXe, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(txtMauSon))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(txtTienNo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(txtSoMay, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel14)
                    .addComponent(txtSoKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtDoiXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtTienNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(btnThemHX, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbHieuXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel15)
                        .addComponent(txtSoKhung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(txtMauSon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(txtSoMay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(cbLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jdcNgayTiepNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(btnThemLX, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNhapMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThemPSC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThemPTT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel21)
                                .addComponent(jLabel23))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTong1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbTong)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiLaiActionPerformed
        ProcessCtr(false);
        this.cbTenKH.setSelectedItem(null);
        this.cbHieuXe.setSelectedIndex(-1); //set hiển thị cbbox item có vị trí số -1(không hiển thị gì)
        this.cbLoaiXe.setSelectedIndex(-1);
        this.txtMaKH.setText(null);
        this.txtBienSo.setText(null);   
        this.txtSoKm.setText(null);
        this.txtSoKhung.setText(null);
        this.txtDoiXe.setText(null);
        this.txtMauSon.setText(null);
        this.txtSoMay.setText(null);
        this.txtTienNo.setText(null);
        showCT();
    }//GEN-LAST:event_btnTaiLaiActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        if(this.txtTimKiem.getText().length()==0){
              JOptionPane.showMessageDialog(null, "Bạn cần nhập dữ liệu tìm kiếm", "Thông báo", 1);
        }else{
            String sql1 = "{call sp_KhachHang_TimKiemTheoTen ("+this.txtTimKiem.getText()+")}";
            LoadData.LoadDatatb(sql1, tbDSXe); 
            this.lbTong.setText("Có "+this.tbDSXe.getRowCount()+" khách hàng cần tìm");
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void txtSoKhungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoKhungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoKhungActionPerformed

    private void cbHieuXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHieuXeActionPerformed

    }//GEN-LAST:event_cbHieuXeActionPerformed

    private void tbDSXeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSXeMouseClicked
        ProcessCtr(true);
        this.btnThem.setEnabled(false);
        try {
            int row = this.tbDSXe.getSelectedRow();//lấy dòng hiện tại đang nhấn chuột
            String IDRow = (this.tbDSXe.getModel().getValueAt(row, 0)).toString();//lấy giá trị ở dòng i vừa nhấn sau đó đổi qua string
            String sqlTBIndex = "SELECT * FROM DANHSACHXE WHERE BienSo =N'"+IDRow+"'";
            ResultSet rs = LoadData.ShowTextField(sqlTBIndex);

            // đọc dữ liệu tại dòng có MaKH = row 0 trên bảng
            if(rs.next()){//nếu có dữ liệu
                BienSoIndex = rs.getString("BienSo");
                MaKHC = rs.getString("MaKH");
                this.txtBienSo.setText(rs.getString("BienSo"));
                this.cbTenKH.setSelectedItem(rs.getString("MaKH"));
                this.cbHieuXe.setSelectedItem(rs.getString("HieuXe"));
                this.txtMaKH.setText(rs.getString("MaKH"));
                this.txtDoiXe.setText(rs.getString("DoiXe"));
                this.cbLoaiXe.setSelectedItem(rs.getString("LoaiXe"));
                this.txtSoKm.setText(rs.getString("SoKM"));
                this.txtSoKhung.setText(rs.getString("SoKhung"));
                this.txtMauSon.setText(rs.getString("MauSon"));
                this.jdcNgayTiepNhan.setDate(rs.getDate("NgayTiepNhan"));
                this.txtSoMay.setText(rs.getString("SoMay"));
                this.txtTienNo.setText(rs.getString("TienNo"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tbDSXeMouseClicked

    private void txtDoiXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoiXeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoiXeActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Thoát khỏi chương trình ?","Thông báo", 2)==0){
            this.dispose();
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapMoiActionPerformed
        ProcessCtr(false);    
        this.btnThem.setEnabled(true);       
        this.cbHieuXe.setSelectedIndex(-1); //set hiển thị cbbox item có vị trí số -1(không hiển thị gì)
        this.cbLoaiXe.setSelectedIndex(-1);       
        this.txtBienSo.setText(null);       
        this.txtSoKm.setText(null);
        this.txtSoKhung.setText(null);
        this.txtDoiXe.setText(null);
        this.txtMauSon.setText(null);
        this.txtSoMay.setText(null);
        this.txtTienNo.setText(null);
    }//GEN-LAST:event_btnNhapMoiActionPerformed

    private void btnTroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroLaiActionPerformed
        Main frmMain = new Main();
        this.setVisible(false);
        frmMain.setVisible(true);
    }//GEN-LAST:event_btnTroLaiActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if(this.txtBienSo.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Biển số không thể bỏ trống", "Thông báo", 1);
        }else if(JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa không ?","Thông báo",2)==0){
            String _bienso = this.txtBienSo.getText();
            String _hieuxe = this.cbHieuXe.getSelectedItem().toString();
            String _loaixe = this.cbLoaiXe.getSelectedItem().toString();
            String _doixe = this.txtDoiXe.getText();
            DanhSachXeDAL.UpdateXe(_bienso, _hieuxe, _loaixe, _doixe, Integer.parseInt(this.txtSoKm.getText()), this.txtSoKhung.getText(),this.txtSoMay.getText(), this.txtMauSon.getText(), this.jdcNgayTiepNhan.getDate(),Integer.parseInt(this.txtMaKH.getText()));
            showCT();
            ProcessCtr(false);
            LoadData.LoadDataCB(sqlCBHX, this.cbHieuXe, "HieuXe");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;                                            
       if(this.txtBienSo.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Bạn cần chọn xe để xóa", "Thông báo", 2);
       }else if(CheckDelete(BienSoIndex) == 1){
            JOptionPane.showMessageDialog(null, "Xe đã tồn tại phiếu sữa chữa", "Thông báo", 2);
       }else{
          if(JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không ?","Thông báo",dialogButton)==0){
          DanhSachXeDAL.DeleteXe(BienSoIndex);
         //     KhachHang.DeleteKH(Integer.parseInt(this.txtMaKH.getText()));
            showCT();
            }   
       }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if(this.txtBienSo.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Biển số không thể bỏ trống", "Thông báo", 1);
        }else{//Double.parseDouble(text) đổi dạng text sang double, //Integer.parseInt(this.txtCMND.getText())
            String _bienso = this.txtBienSo.getText();
            String _hieuxe = this.cbHieuXe.getSelectedItem().toString();
            String _loaixe = this.cbLoaiXe.getSelectedItem().toString();
            String _doixe = this.txtDoiXe.getText();
            DanhSachXeDAL.InsertXe(_bienso, _hieuxe, _loaixe, _doixe, Integer.parseInt(this.txtSoKm.getText()), 
            this.txtSoKhung.getText(),this.txtSoMay.getText(), this.txtMauSon.getText(), this.jdcNgayTiepNhan.getDate(),Integer.parseInt(this.txtMaKH.getText()), 0.0);
            showCT();
            ProcessCtr(false);
            LoadData.LoadDataCB(sqlCBHX, this.cbHieuXe, "HieuXe");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void cbLoaiXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLoaiXeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLoaiXeActionPerformed

    private void btnThemPSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemPSCActionPerformed
            JFPhieuSuaChua frmPSC = new JFPhieuSuaChua(MaKHC, BienSoIndex);
            this.setVisible(false);
            frmPSC.setVisible(true);
    }//GEN-LAST:event_btnThemPSCActionPerformed

    private void btnTimKiemMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemMaKHActionPerformed
            int MaKH = Integer.parseInt(this.txtMaKH.getText());            
            String sqlTBMaKh = "SELECT * FROM DANHSACHXE WHERE MaKH='"+MaKH+"'";
            LoadData.LoadDatatb(sqlTBMaKh, tbDSXe);
    }//GEN-LAST:event_btnTimKiemMaKHActionPerformed

    private void btnThemHXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHXActionPerformed
        JFHieuXe frmHX = new JFHieuXe();
        this.setVisible(false);
        frmHX.setVisible(true);
    }//GEN-LAST:event_btnThemHXActionPerformed

    private void cbLoaiXeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbLoaiXeItemStateChanged
       
    }//GEN-LAST:event_cbLoaiXeItemStateChanged

    private void cbHieuXeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbHieuXeItemStateChanged
             try {
            String LayHX = this.cbHieuXe.getSelectedItem().toString();
            String sqlCBBienSo = "SELECT * FROM LOAIXE WHERE HieuXe=N'"+LayHX+"'";
            LoadData.LoadDataCB(sqlCBBienSo, this.cbLoaiXe, "LoaiXe");
        } catch (Exception e) {
            this.cbLoaiXe.removeAllItems();
        }
    }//GEN-LAST:event_cbHieuXeItemStateChanged

    private void cbTenKHItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTenKHItemStateChanged
        try {
            if(this.cbTenKH.getSelectedItem()== null)
            {
                return;
            }
            String LayTenKH = this.cbTenKH.getSelectedItem().toString(); 
            String sqlLayTen = "SELECT TOP 1 MaKH FROM KHACHHANG WHERE TenKH=N'"+LayTenKH+"'";
            ResultSet rs = LoadData.ShowTextField(sqlLayTen);
            // đọc dữ liệu tại dòng có MaKH = row 0 trên bảng
            if(rs.next()){//nếu có dữ liệu                                            
                this.txtMaKH.setText(rs.getString("MaKH"));           }
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, e);
            this.txtMaKH.setText("");
                    
        }
    }//GEN-LAST:event_cbTenKHItemStateChanged

    private void btnThemPTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemPTTActionPerformed
            JFPhieuThuTien frm = new JFPhieuThuTien(MaKHC);
            this.setVisible(false);
            frm.setVisible(true);          
    }//GEN-LAST:event_btnThemPTTActionPerformed

    private void btnThemLXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLXActionPerformed
            JFLoaiXe frm = new JFLoaiXe();
            this.setVisible(false);
            frm.setVisible(true);  
    }//GEN-LAST:event_btnThemLXActionPerformed
   
   
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
            java.util.logging.Logger.getLogger(JFDanhSachXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFDanhSachXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFDanhSachXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFDanhSachXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFDanhSachXe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhapMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaiLai;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemHX;
    private javax.swing.JButton btnThemLX;
    private javax.swing.JButton btnThemPSC;
    private javax.swing.JButton btnThemPTT;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTimKiemMaKH;
    private javax.swing.JButton btnTroLai;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbHieuXe;
    private javax.swing.JComboBox<String> cbLoaiXe;
    private javax.swing.JComboBox<String> cbTenKH;
    private javax.swing.Box.Filler filler1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcNgayTiepNhan;
    private javax.swing.JLabel lbTong;
    private javax.swing.JLabel lbTong1;
    private javax.swing.JTable tbDSXe;
    private javax.swing.JTextField txtBienSo;
    private javax.swing.JTextField txtDoiXe;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMauSon;
    private javax.swing.JTextField txtSoKhung;
    private javax.swing.JTextField txtSoKm;
    private javax.swing.JTextField txtSoMay;
    private javax.swing.JTextField txtTienNo;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
   
}
