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
import javax.swing.JOptionPane;


public class VatTuDAL {
        public static CallableStatement cstmt = null;
        public static ResultSet rs = null;
        public static Connection con = Connect.getConnect();
        
        public static void displayError(SQLException e){
            System.out.println(" Error Message:" + e.getMessage());
            System.out.println(" SQL State:" + e.getSQLState());
            System.out.println(" Error Code:" + e.getErrorCode());
        }
        public static void InsertVTPT(String TenVTPT, String DVT, Double DonGia, int ThoiGianBaoHanh, int SoLuongTon, int MaNCC){          
            String ADD = "{call procThemVatTu (?,?,?,?,?,?)}";    
                try {                           
                cstmt = con.prepareCall(ADD);
                cstmt.setString(1, TenVTPT);
                cstmt.setString(2, DVT);
                cstmt.setDouble(3, DonGia);
                cstmt.setInt(4, ThoiGianBaoHanh);                         
                cstmt.setInt(5, SoLuongTon);
                cstmt.setInt(6, MaNCC);
                cstmt.execute();  
                JOptionPane.showMessageDialog(null, "Đã thêm vật tư thành công","Thông báo", 1);  
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Thêm vật tư thất bại","Thông báo", 1);  
                displayError(e);
            }         
        }
         public static void DeleteVTPT(int MaVTPT){
            String DELETE = "{call procXoaVatTu (?)}";
            try {              
                cstmt = con.prepareCall(DELETE);
                cstmt.setInt(1, MaVTPT);
                cstmt.execute(); 
                JOptionPane.showMessageDialog(null, "Đã xóa vật tư thành công","Thông báo", 1);  
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Xóa vật tư thất bại","Thông báo", 1);  
                displayError(e);
            } 
        }
        public static void UpdateVTPT(int MaVTPT, String TenVTPT, String DVT, Double DonGia, int ThoiGianBaoHanh, int SoLuongTon, int MaNCC){
            String UPDATE = "{call procSuaVatTu (?,?,?,?,?,?,?)}";
            try {                
                cstmt = con.prepareCall(UPDATE);
                cstmt.setInt(1, MaVTPT);
                cstmt.setString(2, TenVTPT);
                cstmt.setString(3, DVT);
                cstmt.setDouble(4, DonGia);
                cstmt.setInt(5, ThoiGianBaoHanh);                         
                cstmt.setInt(6, SoLuongTon);
                cstmt.setInt(7, MaNCC);
                cstmt.execute();   
                JOptionPane.showMessageDialog(null, "Cập nhật vật tư thành công","Thông báo", 1);  
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Cập nhật vật tư thất bại","Thông báo", 1);  
                displayError(e);
            }           
        }
}
