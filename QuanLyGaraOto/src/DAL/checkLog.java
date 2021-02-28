/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.*;
import javax.swing.*;
import java.awt.HeadlessException;



    

public class checkLog {
    public static Connection con = null;
    public static ResultSet rs = null;
    public static PreparedStatement pst = null;
    public static CallableStatement cstmt = null;
            
     
    public static String testConnection(){
            try {
                con = Connect.getConnect();
                if(con==null)
                    return "Kết nối cơ sở dữ liệu thất bại";
                else{
                    return "Kết nối cơ sở dữ liệu thành công";
                }
            } catch (Exception e) {
                 return "Kết nối cơ sở dữ liệu thất bại";
            }
    }
    public static ResultSet cLog(String id, String pass){
            String sql = "SELECT * from TAIKHOAN where TEN=? AND MATKHAU=?";
                try {
                    con = Connect.getConnect();
                    pst = con.prepareStatement(sql);
                    pst.setString(1,id);
                    pst.setString(2,pass);
                    return rs=pst.executeQuery(); 
                } catch (SQLException e) {
                    return null; 
                }     
    }
    public static void UpdateTK(String TenCu, String MatKhauCu, String QuyenCu, String TenMoi, String MatKhauMoi, String QuyenMoi){
        String sql ="{call procSuaTaiKhoan (?,?,?,?,?,?)}";
        try {           
            cstmt = con.prepareCall(sql);
            cstmt.setString(1, TenCu);   
            cstmt.setString(2, MatKhauCu);
            cstmt.setString(3, QuyenCu);
            cstmt.setString(4, TenMoi);
            cstmt.setString(5, MatKhauMoi);
            cstmt.setString(6, QuyenMoi);                     
            cstmt.execute();         
            JOptionPane.showMessageDialog(null, "Đã sửa thành công","Thông báo", 1);
        } catch (HeadlessException | SQLException e) {          
           JOptionPane.showMessageDialog(null, "Sửa thất bại","Thông báo", 2);
        }                    
    }
    public static void InsertTK(String Ten, String MatKhau, String Quyen){
        String sql ="{call procThemTaiKhoan (?,?,?)}";
        try {           
            cstmt = con.prepareCall(sql);
            cstmt.setString(1, Ten);   
            cstmt.setString(2, MatKhau);
            cstmt.setString(3, Quyen);                             
            cstmt.execute();         
            JOptionPane.showMessageDialog(null, "Đã thêm thành công","Thông báo", 1);
        } catch (HeadlessException | SQLException e) {          
           JOptionPane.showMessageDialog(null, "Thêm thất bại thất bại","Thông báo", 2);
        }                    
    }
    public static void DeleteTK(String Ten, String MatKhau){
        String sql ="{call procXoaTaiKhoan (?,?)}";
        try {           
            cstmt = con.prepareCall(sql);
            cstmt.setString(1, Ten);   
            cstmt.setString(2, MatKhau);                              
            cstmt.execute();         
            JOptionPane.showMessageDialog(null, "Đã xóa thành công","Thông báo", 1);
        } catch (HeadlessException | SQLException e) {          
           JOptionPane.showMessageDialog(null, "Xóa thất bại","Thông báo", 2);
        }                    
    }
}
