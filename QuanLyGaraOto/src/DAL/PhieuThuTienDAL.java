/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class PhieuThuTienDAL {
        public static Connection con = Connect.getConnect();
        public static CallableStatement cstmt = null;
        public static ResultSet rs = null;
        
    public static void displayError(SQLException e){
            System.out.println(" Error Message:" + e.getMessage());
            System.out.println(" SQL State:" + e.getSQLState());
            System.out.println(" Error Code:" + e.getErrorCode());
        }    
    public static void InsertPTT(String BienSo, java.util.Date NgayThu, Double SoTienThu){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");       
        String sql ="{call procThemPhieuThuTien (?,?,?)}";
        try {
            cstmt = con.prepareCall(sql);
            cstmt.setString(1, BienSo);               
            String Ngay = formatter.format(NgayThu);
            cstmt.setString(2, Ngay);      
            cstmt.setDouble(3, SoTienThu);            
            cstmt.execute();            
            JOptionPane.showMessageDialog(null, "Đã thêm phiếu thu tiền thành công","Thông báo", 1);          
        } catch (SQLException e) {            
            JOptionPane.showMessageDialog(null, "Phiếu thu đã tồn tại","Thông báo", 2);
            displayError(e);
        }
    }
   public static void UpdatePTT(int SoPhieu, String BienSo, java.util.Date NgayThu, Double SoTienMoi){
       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
       String sql ="{call procSuaPhieuThuTien (?,?,?,?)}";
        try {
            cstmt = con.prepareCall(sql);
            cstmt.setInt(1, SoPhieu);
            cstmt.setString(2, BienSo);                     
            String Ngay = formatter.format(NgayThu);
            cstmt.setString(3, Ngay);     
            cstmt.setDouble(4, SoTienMoi); 
            cstmt.execute();
            JOptionPane.showMessageDialog(null, "Đã sửa thành công","Thông báo", 1);
        } catch (SQLException e) {          
            JOptionPane.showMessageDialog(null, "Sửa thất bại","Thông báo", 2);
            displayError(e);
        }
    }
    public static void DeletePTT(int SoPhieu, String BienSo, Double SoTienThuCu){
        String sql ="{call procXoaPhieuThuTien (?,?,?)}";
        try {
            cstmt = con.prepareCall(sql);
            cstmt.setInt(1, SoPhieu);   
            cstmt.setString(2, BienSo);
            cstmt.setDouble(3, SoTienThuCu);
            cstmt.execute();
            JOptionPane.showMessageDialog(null, "Đã xóa phiếu thu thành công","Thông báo", 1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Phiếu thu không thể xóa","Thông báo", 2);
            displayError(e);
        }
    }    
}
