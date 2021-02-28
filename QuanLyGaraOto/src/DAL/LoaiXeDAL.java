/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoaiXeDAL {
        public static PreparedStatement pst = null;
        public static CallableStatement cstmt = null;
        public static ResultSet rs = null;
        public static Connection con = Connect.getConnect();
        
        public static void displayError(SQLException e){
            System.out.println(" Error Message:" + e.getMessage());
            System.out.println(" SQL State:" + e.getSQLState());
            System.out.println(" Error Code:" + e.getErrorCode());
        }
        public static void InsertLoaiXe(String LoaiXe, String HieuXe){          
            String ADD = "{call sp_LoaiXe_Them (?,?)}";    
                try {                           
                cstmt = con.prepareCall(ADD);
                cstmt.setString(1, LoaiXe);
                cstmt.setString(2, HieuXe);
                cstmt.execute();  
                JOptionPane.showMessageDialog(null, "Đã thêm loại xe thành công","Thông báo", 1);  
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Thêm loại xe thất bại","Thông báo", 1);  
                displayError(e);
            }         
        }
         public static void DeleteLoaiXe(int MaLoaiXe){
            String DELETE = "delete LOAIXE where MaLoaiXe=?";
            try {              
                pst = con.prepareCall(DELETE);
                pst.setInt(1, MaLoaiXe);
                pst.execute(); 
                JOptionPane.showMessageDialog(null, "Đã xóa loại xe thành công","Thông báo", 1);  
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Xóa loại xe thất bại","Thông báo", 1);  
                displayError(e);
            } 
        }
        public static void UpdateLoaiXe(int MaLoaiXe, String LoaiXe){
            String UPDATE = "update LOAIXE set LoaiXe=? where MaLoaiXe=?";
            try {                
                pst = con.prepareCall(UPDATE);
                pst.setString(1, LoaiXe);
                pst.setInt(2, MaLoaiXe);
                pst.execute();   
                JOptionPane.showMessageDialog(null, "Cập nhật loại xe thành công","Thông báo", 1);  
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Cập nhật loại xe thất bại","Thông báo", 1);  
                displayError(e);
            }           
        }
}
