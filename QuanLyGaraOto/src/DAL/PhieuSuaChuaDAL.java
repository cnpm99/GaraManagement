/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
 
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
/**
 *
 * @author ThienNhut
 */
public class PhieuSuaChuaDAL {
        public static Connection con = Connect.getConnect();
        public static PreparedStatement pst = null;
        public static CallableStatement cstmt = null;   
        public static ResultSet rs = null;
        
    public static void InsertPSC(String BienSo, int MaKH, java.util.Date NgaySuaChua, String DanhGia, String TrangThai,
            String NguoiDanhGia, Double TongTien ){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
        String sql ="{call procThemPhieuSuaChua (?,?,?,?,?,?,?)}";
        try {
                cstmt = con.prepareCall(sql);
                cstmt.setString(1, BienSo);
                cstmt.setInt(2, MaKH);   
                String Ngay = formatter.format(NgaySuaChua);
                cstmt.setString(3, Ngay);
                cstmt.setString(4, DanhGia);
                cstmt.setString(5, TrangThai);
                cstmt.setString(6, NguoiDanhGia);
                cstmt.setDouble(7, TongTien);        
                cstmt.execute();              
                JOptionPane.showMessageDialog(null, "Đã thêm PSC cho xe: "+BienSo+" thành công","Thông báo", 1);          
        } catch (HeadlessException | SQLException e) {            
            JOptionPane.showMessageDialog(null, "PSC của xe: "+BienSo+" đã tồn tại"+ e,"Thông báo", 2);
        }
    }
    
    public static void UpdatePSC(int SoPSC, String BienSo, int MaKH, java.util.Date NgaySuaChua, String DanhGia, 
            String TrangThai, String NguoiDanhGia, Double TongTien, Double SoTienDaThanhToan){
        String sql ="{call procSuaPhieuSuaChua (?,?,?,?,?,?,?,?,?)}";
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
            cstmt = con.prepareCall(sql);
            cstmt.setInt(1, SoPSC);   
            cstmt.setString(2, BienSo);
            cstmt.setInt(3, MaKH);
            String Ngay = formatter.format(NgaySuaChua);
            cstmt.setString(4, Ngay);
            cstmt.setString(5, DanhGia);
            cstmt.setString(6, TrangThai);
            cstmt.setString(7, NguoiDanhGia);
            cstmt.setDouble(8, TongTien);  
            cstmt.setDouble(9, SoTienDaThanhToan);  
            cstmt.execute();
            JOptionPane.showMessageDialog(null, "Đã sửa PSC cho xe: "+BienSo+" thành công","Thông báo", 1);
        } catch (HeadlessException | SQLException e) {          
           JOptionPane.showMessageDialog(null, "Không thể sửa PSC cho xe: "+BienSo,"Thông báo", 2);
        }
    }
    public static void DeletePSC(int SoPSC){
        String sql ="{call procXoaPhieuSuaChua (?)}";
        try {
            cstmt = con.prepareCall(sql);
            cstmt.setInt(1, SoPSC);                   
            cstmt.execute();
            JOptionPane.showMessageDialog(null, "Đã xóa mã PSC: "+SoPSC+" thành công","Thông báo", 2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "PSC: "+SoPSC+" không thể xóa","Thông báo", 3);
        }
    }

    public static void UpdateSoTienThanhToan(Double SoTienDaThanhToan, String BienSo){
            String sql = "UPDATE PHIEUSUACHUA SET SoTienDaThanhToan = ? WHERE BienSo=?;";
                try {
                    pst = con.prepareStatement(sql);
                    pst.setDouble(1,SoTienDaThanhToan);
                    pst.setString(2,BienSo);
                    pst.execute(); 
                } catch (SQLException e) {                   
                }     
    }
}
