/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author ThienNhut
 */
import java.sql.*;
import javax.swing.*;


public class KhachHangDAL{
    public static Connection con = Connect.getConnect();
    public static CallableStatement cstmt = null;
   // public static PreparedStatement pst = null;
    public static ResultSet rs = null;
    
    public static void displayError(SQLException e){
            System.out.println(" Error Message:" + e.getMessage());
            System.out.println(" SQL State:" + e.getSQLState());
            System.out.println(" Error Code:" + e.getErrorCode());
    }
    public static void InsertKH(String TenKH, int CMND, String SoTheThanhVien, String DienThoai, String DiaChi, String Email){
        String sql ="{call sp_KhachHang_Them (?,?,?,?,?,?)}";
        try {          
            cstmt = con.prepareCall(sql);
            cstmt.setString(1, TenKH);
            cstmt.setInt(2, CMND);
            cstmt.setString(3, SoTheThanhVien);
            cstmt.setString(4, DienThoai);
            cstmt.setString(5, DiaChi);
            cstmt.setString(6, Email);
            cstmt.execute();                    
            JOptionPane.showMessageDialog(null, "Đã thêm KH: "+TenKH+" thành công","Thông báo", 1);          
        } catch (SQLException e) {            
            JOptionPane.showMessageDialog(null, "KH: "+TenKH+" đã tồn tại","Thông báo", 2);
            displayError(e);
        }                   
    }
   public static void UpdateKH(int MaKH1 ,String TenKH, int CMND, String SoTheThanhVien, String DienThoai, String DiaChi, double TienNo, String Email){
        String sql ="{call sp_KhachHang_Sua (?,?,?,?,?,?,?,?)}";
        try {           
            cstmt = con.prepareCall(sql);
            cstmt.setInt(1, MaKH1);   
            cstmt.setString(2, TenKH);
            cstmt.setInt(3, CMND);
            cstmt.setString(4, SoTheThanhVien);
            cstmt.setString(5, DienThoai);
            cstmt.setString(6, DiaChi);
            cstmt.setDouble(7, TienNo);
            cstmt.setString(8, Email);                      
            cstmt.execute();         
            JOptionPane.showMessageDialog(null, "Đã sửa KH: "+TenKH+" thành công","Thông báo", 1);
        } catch (SQLException e) {          
           JOptionPane.showMessageDialog(null, "KH: "+TenKH+" đã tồn tại","Thông báo", 2);
            displayError(e);
        }                    
    }
    public static void DeleteKH(int MaKH){
        String sql ="{call sp_KhachHang_Xoa (?)}";
        try {
            cstmt = con.prepareCall(sql);
            cstmt.setInt(1, MaKH);                   
            cstmt.execute();
            JOptionPane.showMessageDialog(null, "Đã xóa mã KH: "+MaKH+" thành công","Thông báo", 2);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "KH: "+MaKH+" không thể xóa","Thông báo", 3);
            displayError(e);
        }        
    }
}
