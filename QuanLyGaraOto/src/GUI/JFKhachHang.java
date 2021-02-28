/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author ThienNhut
 */
import DAL.LoadData;
import DAL.KhachHangDAL;
import java.sql.*;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class JFKhachHang extends javax.swing.JFrame {

    
    public static String sql="SELECT * FROM KHACHHANG";
    public int MaKHIndex;
    public String MaKHC, TenKHC;
        
    public JFKhachHang() {
        initComponents();
        showCT();
        ProcessCtr(false);
        this.txtMaKH.setEditable(false);
        this.txtTienNo.setEditable(false);
    }
    public void showCT(){
        LoadData.LoadDatatb(sql, tbKhachHang);
            tbKhachHang.getColumnModel().getColumn(0).setHeaderValue("Mã KH");
            tbKhachHang.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbKhachHang.getColumnModel().getColumn(1).setHeaderValue("Tên KH");
            tbKhachHang.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbKhachHang.getColumnModel().getColumn(2).setPreferredWidth(50);//độ rộng cột cmnd trong tbKH        
            tbKhachHang.getColumnModel().getColumn(3).setHeaderValue("Số thẻ thành viên");
            tbKhachHang.getColumnModel().getColumn(3).setPreferredWidth(50);
            tbKhachHang.getColumnModel().getColumn(4).setHeaderValue("Điện thoại");
            tbKhachHang.getColumnModel().getColumn(4).setPreferredWidth(50);
            tbKhachHang.getColumnModel().getColumn(5).setHeaderValue("Địa chỉ");
            tbKhachHang.getColumnModel().getColumn(6).setHeaderValue("Tiền nợ");
            tbKhachHang.getColumnModel().getColumn(6).setPreferredWidth(40);                          
            this.lbTong.setText("Tổng số khách hàng: "+this.tbKhachHang.getRowCount());
    }
    private void ProcessCtr(boolean b){
        this.btnThem.setEnabled(b);
        this.btnXoa.setEnabled(b);
        this.btnSua.setEnabled(b);
        this.btnThemXe.setEnabled(b);
    }
    
    public int CheckNumber(String s){//kiểm tra là số hay chữ
        Pattern pattern = Pattern.compile("\\d*");//// \\d+ hay \\d* đều được
        Matcher matcher = pattern.matcher(s); 
            if (matcher.matches()) { 
                return 1;//là số
            } else { 
                return 0;// không phải số
            }  
    }
    public int CheckMail(String s){//kiểm tra có đúng định dạng mail hay k
        Pattern pattern = Pattern.compile("^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
        Matcher matcher = pattern.matcher(s); 
            if (matcher.matches()) { 
                return 1;//là định dạng email
            } else { 
                return 0;// không phải email
            }  
    } 
    private int CheckDelete(int MaKH){
        try {
            String sql = "SELECT * FROM DANHSACHXE WHERE MaKH ='"+MaKH+"'"; 
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
        txtMaKH = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel11110 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtDienThoai = new javax.swing.JTextField();
        txtSoThe = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        jLabel11111 = new javax.swing.JLabel();
        txtTienNo = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbKhachHang = new javax.swing.JTable();
        txtCMND = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        lbTong = new javax.swing.JLabel();
        lbTong1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnTaiLai = new javax.swing.JButton();
        btnThemXe = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dskhachhangicons8-contact-us-filled-50.png"))); // NOI18N
        jLabel1.setText("DANH SÁCH KHÁCH HÀNG");

        txtMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKHActionPerformed(evt);
            }
        });

        txtTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKHActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Tên khách hàng:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("CMND:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Mã khách hàng:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Số thẻ thành viên:");

        jLabel110.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel110.setText("Điện thoại:");

        jLabel11110.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11110.setText("Email:");

        jLabel115.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel115.setText("Địa chỉ:");

        jLabel11111.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11111.setText("Tiền nợ:");

        tbKhachHang.setModel(new javax.swing.table.DefaultTableModel(
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
        tbKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbKhachHang);

        btnTimKiem.setBackground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Tìm kiếm");

        txtTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTimKiem.setToolTipText("Nhập vào dữ liệu muốn tìm");
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
        });

        lbTong.setText("Tổng số khách hàng");

        lbTong1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTong1.setText("Tìm kiếm theo tên KH:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Tải lại");

        btnTaiLai.setBackground(new java.awt.Color(255, 255, 255));
        btnTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refesh.png"))); // NOI18N
        btnTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiLaiActionPerformed(evt);
            }
        });

        btnThemXe.setBackground(new java.awt.Color(255, 255, 255));
        btnThemXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/xehu.png"))); // NOI18N
        btnThemXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemXeActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Thêm xe");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMaKH)
                                        .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(108, 108, 108)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11110, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel110, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSoThe, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11111)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTienNo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel115)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnNhapMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnThemXe, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lbTong1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lbTong)
                                .addGap(72, 72, 72)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtSoThe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel110)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11110)
                            .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel115))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtTienNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11111))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNhapMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTong1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbTong))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)))
                    .addComponent(btnThemXe, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9)
                                .addComponent(jLabel12))
                            .addComponent(jLabel10))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        if(this.txtTenKH.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "Tên KH không thể bỏ trống", "Thông báo", 2);                    
        }else if(CheckNumber(this.txtCMND.getText())==0){
                JOptionPane.showMessageDialog(null, "CMND phải là số", "Thông báo", 1); 
        }else if(CheckNumber(this.txtDienThoai.getText())==0){
                JOptionPane.showMessageDialog(null, "Số điện thoại phải là số", "Thông báo", 1); 
        }else if(CheckNumber(this.txtTenKH.getText())==1){
                JOptionPane.showMessageDialog(null, "Tên khách hàng phải là chữ hoặc chữ và số", "Thông báo", 1); 
        }else if(CheckMail(this.txtEmail.getText())==0){
                JOptionPane.showMessageDialog(null, "Định dạng email phải là: xxxxxx@xxx.xxx", "Thông báo", 1); 
        }else{//Double.parseDouble(text) đổi dạng text sang double
                KhachHangDAL.InsertKH(this.txtTenKH.getText(), Integer.parseInt(this.txtCMND.getText()), this.txtSoThe.getText(), this.txtDienThoai.getText(), this.txtDiaChi.getText(), this.txtEmail.getText());
                showCT();
                ProcessCtr(false);
            }          
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        if(this.txtMaKH.getText().length() == 1){
            JOptionPane.showMessageDialog(null, "Bạn cần chọn khách hàng để xóa", "Thông báo", 2);
        }else if(CheckDelete(MaKHIndex) == 1){
            JOptionPane.showMessageDialog(null, "Khách hàng đã có xe, cần xóa xe trước", "Thông báo", 2);
        }else{
          if(JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không ?","Thông báo",dialogButton)==0){
          KhachHangDAL.DeleteKH(MaKHIndex);         
            showCT();
            }   
       }
         
    }//GEN-LAST:event_btnXoaActionPerformed
    
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
           
           if(this.txtTenKH.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "Tên KH không thể bỏ trống", "Thông báo", 2);                    
        }else if(CheckNumber(this.txtCMND.getText())==0){
                JOptionPane.showMessageDialog(null, "CMND phải là số", "Thông báo", 1); 
        }else if(CheckNumber(this.txtDienThoai.getText())==0){
                JOptionPane.showMessageDialog(null, "Số điện thoại phải là số", "Thông báo", 1); 
        }else if(CheckNumber(this.txtTenKH.getText())==1){
                JOptionPane.showMessageDialog(null, "Tên khách hàng phải là chữ hoặc chữ và số", "Thông báo", 1); 
        }else if(CheckMail(this.txtEmail.getText())==0){
                JOptionPane.showMessageDialog(null, "Định dạng email phải là: xxxxxx@xxx.xxx", "Thông báo", 1); 
        }else if(JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa không ?","Thông báo",2)==0){
            KhachHangDAL.UpdateKH(Integer.parseInt(this.txtMaKH.getText()),this.txtTenKH.getText(), Integer.parseInt(this.txtCMND.getText()), this.txtSoThe.getText(), this.txtDienThoai.getText(), this.txtDiaChi.getText(), Double.parseDouble(this.txtTienNo.getText()), this.txtEmail.getText());
            showCT();
            ProcessCtr(false);
        }        
    }//GEN-LAST:event_btnSuaActionPerformed
    
    private void btnTroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroLaiActionPerformed
        Main frmMain = new Main();
            this.setVisible(false);
            frmMain.setVisible(true);
    }//GEN-LAST:event_btnTroLaiActionPerformed

    private void btnNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapMoiActionPerformed
       
        ProcessCtr(false);
                this.btnThem.setEnabled(true);
                this.txtMaKH.setEditable(false);
                this.txtMaKH.setText(null);
                this.txtTenKH.setText(null);
                this.txtCMND.setText(null);
                this.txtSoThe.setText(null);
                this.txtDienThoai.setText(null);
                this.txtDiaChi.setText(null);
                this.txtTienNo.setText(null);
                this.txtTienNo.setEditable(false);
                this.txtEmail.setText(null);
    }//GEN-LAST:event_btnNhapMoiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Thoát khỏi chương trình ?","Thông báo", 2)==0){
           this.dispose();}
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        if(this.txtTimKiem.getText().length()==0){
              JOptionPane.showMessageDialog(null, "Bạn cần nhập dữ liệu tìm kiếm", "Thông báo", 1);
        }else{
            String sql1 = "{call sp_KhachHang_TimKiemTheoTen ("+this.txtTimKiem.getText()+")}";
            LoadData.LoadDatatb(sql1, tbKhachHang); 
            this.lbTong.setText("Có "+this.tbKhachHang.getRowCount()+" khách hàng cần tìm");
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void tbKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKhachHangMouseClicked

        ProcessCtr(true);
        this.btnThem.setEnabled(false);
        try {
            int row = this.tbKhachHang.getSelectedRow();//lấy dòng hiện tại đang nhấn chuột
            String IDRow = (this.tbKhachHang.getModel().getValueAt(row, 0)).toString();//lấy giá trị ở dòng i vừa nhấn sau đó đổi qua string
            String sql = "SELECT * FROM KHACHHANG WHERE MaKH =N'"+IDRow+"'"; 
            ResultSet rs = LoadData.ShowTextField(sql);
            // đọc dữ liệu tại dòng có MaKH = row 0 trên bảng
            if(rs.next()){//nếu có dữ liệu
                MaKHIndex = rs.getInt("MaKH");
                MaKHC = rs.getString("MaKH");
                TenKHC = rs.getNString("TenKH");
                this.txtMaKH.setText(rs.getString("MaKH"));
                this.txtTenKH.setText(rs.getString("TenKH"));
                this.txtCMND.setText(rs.getString("CMND"));
                this.txtSoThe.setText(rs.getString("SoTheThanhVien"));
                this.txtDienThoai.setText(rs.getString("DienThoai"));
                this.txtDiaChi.setText(rs.getString("DiaChi"));
                this.txtTienNo.setText(rs.getString("TienNo"));
                this.txtEmail.setText(rs.getString("Email"));                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tbKhachHangMouseClicked

    private void txtTenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKHActionPerformed

    private void txtMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaKHActionPerformed

    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {//hàm lấy nút enter
                if(this.txtTimKiem.getText().length()==0){
                     JOptionPane.showMessageDialog(null, "Bạn cần nhập dữ liệu tìm kiếm", "Thông báo", 1);
                }else{
                    String sql1 = "{call sp_KhachHang_TimKiemTheoTen ("+this.txtTimKiem.getText()+")}";
                    LoadData.LoadDatatb(sql1, tbKhachHang); 
                    this.lbTong.setText("Có "+this.tbKhachHang.getRowCount()+" khách hàng cần tìm");
                }
            }
             if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {//hàm lấy nút esc
                ProcessCtr(false);   
                this.txtMaKH.setEditable(false);
                this.txtMaKH.setText(null);
                this.txtTenKH.setText(null);
                this.txtCMND.setText(null);
                this.txtSoThe.setText(null);
                this.txtDienThoai.setText(null);
                this.txtDiaChi.setText(null);
                this.txtTienNo.setText(null);
                this.txtTienNo.setEditable(false);
                this.txtEmail.setText(null);
                showCT();
            }
    }//GEN-LAST:event_txtTimKiemKeyPressed

    private void btnTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiLaiActionPerformed
       ProcessCtr(false);   
                this.txtMaKH.setEditable(false);
                this.txtMaKH.setText(null);
                this.txtTenKH.setText(null);
                this.txtCMND.setText(null);
                this.txtSoThe.setText(null);
                this.txtDienThoai.setText(null);
                this.txtDiaChi.setText(null);
                this.txtTienNo.setText(null);
                this.txtTienNo.setEditable(false);
                this.txtEmail.setText(null);
        showCT();
    }//GEN-LAST:event_btnTaiLaiActionPerformed

    private void btnThemXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemXeActionPerformed
                JFDanhSachXe frmDSXe = new JFDanhSachXe(MaKHC, TenKHC);
                this.setVisible(false);             
                frmDSXe.setVisible(true);
                
    }//GEN-LAST:event_btnThemXeActionPerformed

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
            java.util.logging.Logger.getLogger(JFKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhapMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaiLai;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemXe;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTroLai;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel11110;
    private javax.swing.JLabel jLabel11111;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTong;
    private javax.swing.JLabel lbTong1;
    private javax.swing.JTable tbKhachHang;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDienThoai;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtSoThe;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTienNo;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
