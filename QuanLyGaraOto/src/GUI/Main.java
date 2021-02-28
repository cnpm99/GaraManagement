/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAL.Connect;
import DAL.LoadData;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ThienNhut
 */
public class Main extends javax.swing.JFrame {
            
    public static String Quyen;
    public static Connection con = Connect.getConnect();
    
    public Main() {       
        initComponents(); 
        this.setExtendedState(MAXIMIZED_BOTH);//set full màn hình
        this.lbUser.setText(Login.makh);
        this.lbQuyen.setText(Quyen);
        getQuyen();
    }
    public Main(String str){
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);//set full màn hình
        Quyen = str;
        this.lbUser.setText(Login.makh);
        this.lbQuyen.setText(Quyen);
        getQuyen();
                       
    }
    private void setQuyenCtrl(boolean qlsc, boolean qlbh, boolean qlkh, boolean cndl,
            boolean bc, boolean dm, boolean tracuu, boolean pq, boolean tdqd, boolean tnd){
        
        this.mnQLSC.setEnabled(qlsc);
        this.btnQLSC.setEnabled(qlsc);
        this.btnQLKH.setEnabled(qlsc);
        this.btnTNSC.setEnabled(qlsc);
        this.mnQLBH.setEnabled(qlbh);
        this.btnPhieuThuTien.setEnabled(qlbh);
        this.mnQLKH.setEnabled(qlkh);
        this.mnCNDL.setEnabled(cndl);
        this.mnTKBC.setEnabled(bc);
        this.btnBaoCao.setEnabled(bc);
        this.mnDM.setEnabled(dm);
        this.mnTCDL.setEnabled(tracuu);
        this.btnTimKiem.setEnabled(tracuu);
        this.mnPhanQuyen.setEnabled(pq);
        this.mnQuyDinh.setEnabled(tdqd);
        this.mnNguoiDung.setEnabled(tnd);                           
    }
    private void getQuyen(){
         try {            
            String sqlTBIndex = "SELECT * FROM QUYENNGUOIDUNG WHERE Quyen='"+Quyen+"'";
            ResultSet rs = LoadData.ShowTextField(sqlTBIndex);        
            if(rs.next()){//nếu có dữ liệu              
                setQuyenCtrl(rs.getBoolean("QuanLySuaChua"), rs.getBoolean("QuanLyBanHang"), rs.getBoolean("QuanLyKhoHang"), 
                        rs.getBoolean("CapNhatDuLieu"), rs.getBoolean("BaoCao"), rs.getBoolean("DanhMuc"),
                        rs.getBoolean("TraCuu"), rs.getBoolean("PhanQuyen"), rs.getBoolean("ThayDoiQuyDinh"), rs.getBoolean("ThemNguoiDung"));           }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbUser = new javax.swing.JLabel();
        lblogout = new javax.swing.JLabel();
        lbQuyen = new javax.swing.JLabel();
        lbAnh = new javax.swing.JLabel();
        btnQLKH = new javax.swing.JButton();
        btnTestKN = new javax.swing.JButton();
        btnTNSC = new javax.swing.JButton();
        btnQLSC = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnBaoCao = new javax.swing.JButton();
        btnPhieuThuTien = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mnBar = new javax.swing.JMenuBar();
        mnQLSC = new javax.swing.JMenu();
        mnLuuTruKhachHang = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnPhieuSuaChua = new javax.swing.JMenuItem();
        mnQLBH = new javax.swing.JMenu();
        mnBaoGiaTienCong = new javax.swing.JMenuItem();
        mnBaoGiaVatTu = new javax.swing.JMenuItem();
        mnPhieuThuTien = new javax.swing.JMenuItem();
        mnQLKH = new javax.swing.JMenu();
        mnPhieuNhapVatTu = new javax.swing.JMenuItem();
        mnCNDL = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        mnTKBC = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        mnDM = new javax.swing.JMenu();
        mnVatTuPhuTung = new javax.swing.JMenuItem();
        mnTienCong = new javax.swing.JMenuItem();
        mnHieuXe = new javax.swing.JMenuItem();
        mnLoaiXe = new javax.swing.JMenuItem();
        mnTCDL = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        mnHT = new javax.swing.JMenu();
        mnPhanQuyen = new javax.swing.JMenuItem();
        mnNguoiDung = new javax.swing.JMenuItem();
        mnQuyDinh = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        mnThongTinPhanMem = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/Icon20/home.png")));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        lbUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon20/user.png"))); // NOI18N
        lbUser.setText("Tên user");
        lbUser.setToolTipText("Tên người dùng");

        lblogout.setBackground(new java.awt.Color(204, 51, 0));
        lblogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon20/logout.png"))); // NOI18N
        lblogout.setToolTipText("Log out");
        lblogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblogoutMouseExited(evt);
            }
        });

        lbQuyen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbQuyen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon20/quyen.png"))); // NOI18N
        lbQuyen.setText("Quyền user");
        lbQuyen.setToolTipText("Quyền người dùng");

        lbAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dadadada.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbQuyen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblogout, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbQuyen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnQLKH.setBackground(new java.awt.Color(255, 255, 255));
        btnQLKH.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnQLKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dskhachhangicons8-contact-us-filled-50.png"))); // NOI18N
        btnQLKH.setText("Quản lý khách hàng");
        btnQLKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQLKHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQLKHMouseExited(evt);
            }
        });
        btnQLKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLKHActionPerformed(evt);
            }
        });

        btnTestKN.setBackground(new java.awt.Color(255, 255, 255));
        btnTestKN.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTestKN.setText("Kiểm tra kết nối đến CSDL");
        btnTestKN.setToolTipText("");
        btnTestKN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTestKNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTestKNMouseExited(evt);
            }
        });
        btnTestKN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestKNActionPerformed(evt);
            }
        });

        btnTNSC.setBackground(new java.awt.Color(255, 255, 255));
        btnTNSC.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnTNSC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dsxe.png"))); // NOI18N
        btnTNSC.setText("Tiếp nhận sửa chữa");
        btnTNSC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTNSCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTNSCMouseExited(evt);
            }
        });
        btnTNSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTNSCActionPerformed(evt);
            }
        });

        btnQLSC.setBackground(new java.awt.Color(255, 255, 255));
        btnQLSC.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnQLSC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/suachua.png"))); // NOI18N
        btnQLSC.setText("Quản lý sửa chữa");
        btnQLSC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQLSCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQLSCMouseExited(evt);
            }
        });
        btnQLSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSCActionPerformed(evt);
            }
        });

        btnTimKiem.setBackground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm thông tin");
        btnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseExited(evt);
            }
        });
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnBaoCao.setBackground(new java.awt.Color(255, 255, 255));
        btnBaoCao.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBaoCao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/baocao.png"))); // NOI18N
        btnBaoCao.setText("Báo cáo doanh thu");
        btnBaoCao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBaoCaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBaoCaoMouseExited(evt);
            }
        });
        btnBaoCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaoCaoActionPerformed(evt);
            }
        });

        btnPhieuThuTien.setBackground(new java.awt.Color(255, 255, 255));
        btnPhieuThuTien.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnPhieuThuTien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bill.png"))); // NOI18N
        btnPhieuThuTien.setText("Phiếu thu tiền");
        btnPhieuThuTien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPhieuThuTienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPhieuThuTienMouseExited(evt);
            }
        });
        btnPhieuThuTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhieuThuTienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTestKN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQLKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPhieuThuTien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBaoCao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQLSC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTNSC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnQLKH, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTNSC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQLSC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPhieuThuTien, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTestKN)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(1050, 0, 250, 720);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/garalogo.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 170, 570, 390);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 40)); // NOI18N
        jLabel2.setText("PHẦN MỀM QUẢN LÝ GARA Ô TÔ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 60, 690, 80);

        mnBar.setBackground(new java.awt.Color(255, 255, 255));
        mnBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        mnBar.setToolTipText("");

        mnQLSC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon20/QLSC.png"))); // NOI18N
        mnQLSC.setText("Quản lý sửa chữa      ");

        mnLuuTruKhachHang.setText("Lưu trữ khách hàng");
        mnLuuTruKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLuuTruKhachHangActionPerformed(evt);
            }
        });
        mnQLSC.add(mnLuuTruKhachHang);

        jMenuItem1.setText("Tiếp nhận xe");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnQLSC.add(jMenuItem1);

        mnPhieuSuaChua.setText("Lập phiếu sửa chữa");
        mnPhieuSuaChua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPhieuSuaChuaActionPerformed(evt);
            }
        });
        mnQLSC.add(mnPhieuSuaChua);

        mnBar.add(mnQLSC);

        mnQLBH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon20/QLBH.png"))); // NOI18N
        mnQLBH.setText("Quản lý bán hàng      ");
        mnQLBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnQLBHActionPerformed(evt);
            }
        });

        mnBaoGiaTienCong.setText("Báo giá tiền công");
        mnBaoGiaTienCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBaoGiaTienCongActionPerformed(evt);
            }
        });
        mnQLBH.add(mnBaoGiaTienCong);

        mnBaoGiaVatTu.setText("Báo giá vật tư");
        mnBaoGiaVatTu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBaoGiaVatTuActionPerformed(evt);
            }
        });
        mnQLBH.add(mnBaoGiaVatTu);

        mnPhieuThuTien.setText("Phiếu thu tiền");
        mnPhieuThuTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPhieuThuTienActionPerformed(evt);
            }
        });
        mnQLBH.add(mnPhieuThuTien);

        mnBar.add(mnQLBH);

        mnQLKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon20/QLKH.png"))); // NOI18N
        mnQLKH.setText("Quản lý kho hàng  ");

        mnPhieuNhapVatTu.setText("Phiếu nhập vật tư");
        mnPhieuNhapVatTu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPhieuNhapVatTuActionPerformed(evt);
            }
        });
        mnQLKH.add(mnPhieuNhapVatTu);

        mnBar.add(mnQLKH);

        mnCNDL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon20/update.png"))); // NOI18N
        mnCNDL.setText("Cập nhật dữ liệu  ");

        jMenuItem6.setText("Danh sách xe");
        mnCNDL.add(jMenuItem6);

        jMenuItem7.setText("Phiếu sửa chữa");
        mnCNDL.add(jMenuItem7);

        jMenuItem8.setText("Phiếu nhập vật tư");
        mnCNDL.add(jMenuItem8);

        jMenuItem18.setText("Phiếu thu tiền");
        mnCNDL.add(jMenuItem18);

        mnBar.add(mnCNDL);

        mnTKBC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon20/TKBC.png"))); // NOI18N
        mnTKBC.setText("Thống kê, báo cáo  ");
        mnTKBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTKBCActionPerformed(evt);
            }
        });

        jMenuItem2.setText("jMenuItem2");
        mnTKBC.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem3");
        mnTKBC.add(jMenuItem3);

        mnBar.add(mnTKBC);

        mnDM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon20/DM.png"))); // NOI18N
        mnDM.setText("Danh mục  ");

        mnVatTuPhuTung.setText("Vật tư phụ tùng");
        mnVatTuPhuTung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVatTuPhuTungActionPerformed(evt);
            }
        });
        mnDM.add(mnVatTuPhuTung);

        mnTienCong.setText("Tiền công");
        mnTienCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTienCongActionPerformed(evt);
            }
        });
        mnDM.add(mnTienCong);

        mnHieuXe.setText("Hiệu xe");
        mnHieuXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnHieuXeActionPerformed(evt);
            }
        });
        mnDM.add(mnHieuXe);

        mnLoaiXe.setText("Loại xe");
        mnLoaiXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLoaiXeActionPerformed(evt);
            }
        });
        mnDM.add(mnLoaiXe);

        mnBar.add(mnDM);

        mnTCDL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon20/search.png"))); // NOI18N
        mnTCDL.setText("Tra cứu dữ liệu  ");

        jMenuItem14.setText("Danh sách xe");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        mnTCDL.add(jMenuItem14);

        jMenuItem15.setText("Chi tiết sửa chữa");
        mnTCDL.add(jMenuItem15);

        mnBar.add(mnTCDL);

        mnHT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon20/system.png"))); // NOI18N
        mnHT.setText("Hệ thống");

        mnPhanQuyen.setText("Phân quyền");
        mnPhanQuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPhanQuyenActionPerformed(evt);
            }
        });
        mnHT.add(mnPhanQuyen);

        mnNguoiDung.setText("Người dùng");
        mnNguoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNguoiDungActionPerformed(evt);
            }
        });
        mnHT.add(mnNguoiDung);

        mnQuyDinh.setText("Quy định");
        mnHT.add(mnQuyDinh);

        jMenuItem19.setText("Sao lưu");
        mnHT.add(jMenuItem19);

        jMenuItem20.setText("Thông tin doanh nghiệp");
        mnHT.add(jMenuItem20);

        mnThongTinPhanMem.setText("Thông tin phần mềm");
        mnHT.add(mnThongTinPhanMem);

        mnBar.add(mnHT);

        setJMenuBar(mnBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1309, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTestKNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestKNActionPerformed
           
        Connection con = Connect.getConnect();
            if(con != null){
             JOptionPane.showMessageDialog(null,"Kết nối thành công rồi bạn ei!", "Tình trạng kết nối", 1);
            }else if(con ==null)
            JOptionPane.showMessageDialog(null,"Kết nối thất bại rồi bạn ei!", "Tình trạng kết nối", 2);
    }//GEN-LAST:event_btnTestKNActionPerformed

    private void btnQLKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLKHActionPerformed
            JFKhachHang frmKH = new JFKhachHang();
            this.setVisible(false);
            frmKH.setVisible(true);
    }//GEN-LAST:event_btnQLKHActionPerformed

    private void btnTNSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTNSCActionPerformed
            JFDanhSachXe frmdsx = new JFDanhSachXe();
            this.setVisible(false);
            frmdsx.setVisible(true);
    }//GEN-LAST:event_btnTNSCActionPerformed

    private void btnQLSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSCActionPerformed
            JFPhieuSuaChua frPSC = new JFPhieuSuaChua();
            this.setVisible(false);
            frPSC.setVisible(true);
    }//GEN-LAST:event_btnQLSCActionPerformed

    private void btnBaoCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaoCaoActionPerformed
            JFThongKe frmThKe = new JFThongKe();
            this.setVisible(false);
            frmThKe.setVisible(true);
    }//GEN-LAST:event_btnBaoCaoActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
            JFTimKiem frmTK = new JFTimKiem();
            this.setVisible(false);
            frmTK.setVisible(true);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnQLKHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLKHMouseEntered
            btnQLKH.setBackground(new Color(102, 102, 102, 255));
    }//GEN-LAST:event_btnQLKHMouseEntered

    private void btnQLKHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLKHMouseExited
            btnQLKH.setBackground(new Color(255, 255, 225, 255));
    }//GEN-LAST:event_btnQLKHMouseExited

    private void btnTNSCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTNSCMouseEntered
            btnTNSC.setBackground(new Color(102, 102, 102, 255));
    }//GEN-LAST:event_btnTNSCMouseEntered

    private void btnTNSCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTNSCMouseExited
            btnTNSC.setBackground(new Color(255, 255, 225, 255));
    }//GEN-LAST:event_btnTNSCMouseExited

    private void btnQLSCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLSCMouseEntered
            btnQLSC.setBackground(new Color(102, 102, 102, 255));
    }//GEN-LAST:event_btnQLSCMouseEntered

    private void btnQLSCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLSCMouseExited
        // TODO add your handling code here:
            btnQLSC.setBackground(new Color(255, 255, 225, 255));
    }//GEN-LAST:event_btnQLSCMouseExited

    private void btnTimKiemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseEntered
        // TODO add your handling code here:
            btnTimKiem.setBackground(new Color(102, 102, 102, 255));
    }//GEN-LAST:event_btnTimKiemMouseEntered

    private void btnTimKiemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseExited
        // TODO add your handling code here:
            btnTimKiem.setBackground(new Color(255, 255, 225, 255));
    }//GEN-LAST:event_btnTimKiemMouseExited

    private void btnBaoCaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBaoCaoMouseEntered
        // TODO add your handling code here:
            btnBaoCao.setBackground(new Color(102, 102, 102, 255));
    }//GEN-LAST:event_btnBaoCaoMouseEntered

    private void btnBaoCaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBaoCaoMouseExited
        // TODO add your handling code here:
            btnBaoCao.setBackground(new Color(255, 255, 225, 255));
    }//GEN-LAST:event_btnBaoCaoMouseExited

    private void btnTestKNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTestKNMouseEntered
        // TODO add your handling code here:
            btnTestKN.setBackground(new Color(102, 102, 102, 255));
    }//GEN-LAST:event_btnTestKNMouseEntered

    private void btnTestKNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTestKNMouseExited
        // TODO add your handling code here:
            btnTestKN.setBackground(new Color(255, 255, 225, 255));
    }//GEN-LAST:event_btnTestKNMouseExited

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
            JFDanhSachXe frDSX = new JFDanhSachXe();
            this.setVisible(false);
            frDSX.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnPhieuSuaChuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPhieuSuaChuaActionPerformed
            JFPhieuSuaChua frm = new JFPhieuSuaChua();
            this.setVisible(false);
            frm.setVisible(true);
    }//GEN-LAST:event_mnPhieuSuaChuaActionPerformed

    private void mnBaoGiaVatTuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBaoGiaVatTuActionPerformed
            JFBaoGiaVatTu frm = new JFBaoGiaVatTu();
            this.setVisible(false);
            frm.setVisible(true);
    }//GEN-LAST:event_mnBaoGiaVatTuActionPerformed

    private void mnPhieuThuTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPhieuThuTienActionPerformed
            JFPhieuThuTien frm = new JFPhieuThuTien();
            this.setVisible(false);
            frm.setVisible(true);
    }//GEN-LAST:event_mnPhieuThuTienActionPerformed

    private void lblogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblogoutMouseClicked
            Login frmlogin = new Login();
            this.setVisible(false);
            frmlogin.setVisible(true);
    }//GEN-LAST:event_lblogoutMouseClicked

    private void lblogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblogoutMouseEntered
          this.lblogout.setIcon(null);
          this.lblogout.setText("LOG OUT");
        
    }//GEN-LAST:event_lblogoutMouseEntered

    private void lblogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblogoutMouseExited
            lblogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon20/logout.png")));
            this.lblogout.setText(null);
    }//GEN-LAST:event_lblogoutMouseExited

    private void mnVatTuPhuTungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVatTuPhuTungActionPerformed
            JFVatTu frm = new JFVatTu();
            this.setVisible(false);
            frm.setVisible(true);
    }//GEN-LAST:event_mnVatTuPhuTungActionPerformed

    private void mnLuuTruKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLuuTruKhachHangActionPerformed
             JFKhachHang frm = new JFKhachHang();
            this.setVisible(false);
            frm.setVisible(true);
    }//GEN-LAST:event_mnLuuTruKhachHangActionPerformed

    private void btnPhieuThuTienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPhieuThuTienMouseEntered
            btnPhieuThuTien.setBackground(new Color(102, 102, 102, 255));
    }//GEN-LAST:event_btnPhieuThuTienMouseEntered

    private void btnPhieuThuTienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPhieuThuTienMouseExited
            btnPhieuThuTien.setBackground(new Color(255, 255, 225, 255));
    }//GEN-LAST:event_btnPhieuThuTienMouseExited

    private void btnPhieuThuTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhieuThuTienActionPerformed
            JFPhieuThuTien frm = new JFPhieuThuTien();
            this.setVisible(false);
            frm.setVisible(true);
    }//GEN-LAST:event_btnPhieuThuTienActionPerformed

    private void mnNguoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNguoiDungActionPerformed
            JFQuanLyNguoiDung frm = new JFQuanLyNguoiDung();
            this.setVisible(false);
            frm.setVisible(true);
    }//GEN-LAST:event_mnNguoiDungActionPerformed

    private void mnPhanQuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPhanQuyenActionPerformed
            JFPhanQuyen frm = new JFPhanQuyen();
            this.setVisible(false);
            frm.setVisible(true);
    }//GEN-LAST:event_mnPhanQuyenActionPerformed

    private void mnBaoGiaTienCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBaoGiaTienCongActionPerformed
            JFBaoGiaTienCong frm = new JFBaoGiaTienCong();
            this.setVisible(false);
            frm.setVisible(true);   
    }//GEN-LAST:event_mnBaoGiaTienCongActionPerformed

    private void mnQLBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnQLBHActionPerformed
            JFPhieuThuTien frm = new JFPhieuThuTien();
            this.setVisible(false);
            frm.setVisible(true);
    }//GEN-LAST:event_mnQLBHActionPerformed

    private void mnTKBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTKBCActionPerformed
            JFThongKe frm = new JFThongKe();
            this.setVisible(false);
            frm.setVisible(true);
    }//GEN-LAST:event_mnTKBCActionPerformed

    private void mnHieuXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnHieuXeActionPerformed
            JFHieuXe frm = new JFHieuXe();
            this.setVisible(false);
            frm.setVisible(true);
    }//GEN-LAST:event_mnHieuXeActionPerformed

    private void mnTienCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTienCongActionPerformed
            JFTienCong frm = new JFTienCong();
            this.setVisible(false);
            frm.setVisible(true);
    }//GEN-LAST:event_mnTienCongActionPerformed

    private void mnLoaiXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLoaiXeActionPerformed
            JFLoaiXe frm = new JFLoaiXe();
            this.setVisible(false);
            frm.setVisible(true);
    }//GEN-LAST:event_mnLoaiXeActionPerformed

    private void mnPhieuNhapVatTuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPhieuNhapVatTuActionPerformed
            JFPhieuNhapVatTu frm = new JFPhieuNhapVatTu();
            this.setVisible(false);
            frm.setVisible(true);
    }//GEN-LAST:event_mnPhieuNhapVatTuActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
            JFTraCuuDsXe frm=new JFTraCuuDsXe();
            this.setVisible(false);
            frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaoCao;
    private javax.swing.JButton btnPhieuThuTien;
    private javax.swing.JButton btnQLKH;
    private javax.swing.JButton btnQLSC;
    private javax.swing.JButton btnTNSC;
    private javax.swing.JButton btnTestKN;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbAnh;
    private javax.swing.JLabel lbQuyen;
    private javax.swing.JLabel lbUser;
    private javax.swing.JLabel lblogout;
    private javax.swing.JMenuItem mnBaoGiaTienCong;
    private javax.swing.JMenuItem mnBaoGiaVatTu;
    private javax.swing.JMenuBar mnBar;
    private javax.swing.JMenu mnCNDL;
    private javax.swing.JMenu mnDM;
    private javax.swing.JMenu mnHT;
    private javax.swing.JMenuItem mnHieuXe;
    private javax.swing.JMenuItem mnLoaiXe;
    private javax.swing.JMenuItem mnLuuTruKhachHang;
    private javax.swing.JMenuItem mnNguoiDung;
    private javax.swing.JMenuItem mnPhanQuyen;
    private javax.swing.JMenuItem mnPhieuNhapVatTu;
    private javax.swing.JMenuItem mnPhieuSuaChua;
    private javax.swing.JMenuItem mnPhieuThuTien;
    private javax.swing.JMenu mnQLBH;
    private javax.swing.JMenu mnQLKH;
    private javax.swing.JMenu mnQLSC;
    private javax.swing.JMenuItem mnQuyDinh;
    private javax.swing.JMenu mnTCDL;
    private javax.swing.JMenu mnTKBC;
    private javax.swing.JMenuItem mnThongTinPhanMem;
    private javax.swing.JMenuItem mnTienCong;
    private javax.swing.JMenuItem mnVatTuPhuTung;
    // End of variables declaration//GEN-END:variables
}
