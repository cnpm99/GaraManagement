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

public class TienCongDAL {
        public static CallableStatement cstmt = null;
        public static ResultSet rs = null;
        public static Connection con = Connect.getConnect();
        
        public static void displayError(SQLException e){
            System.out.println(" Error Message:" + e.getMessage());
            System.out.println(" SQL State:" + e.getSQLState());
            System.out.println(" Error Code:" + e.getErrorCode());
        }
        public static void InsertTC(String NoiDung, Double TienCong){          
            String ADD = "{call procThemTienCong (?,?)}";    
                try {                           
                cstmt = con.prepareCall(ADD);
                cstmt.setString(1, NoiDung);
                cstmt.setDouble(2, TienCong);
                cstmt.execute();  
                JOptionPane.showMessageDialog(null, "Đã thêm tiền công thành công","Thông báo", 1);  
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Thêm tiền công thất bại","Thông báo", 1);  
                displayError(e);
            }         
        }
         public static void DeleteTC(int MaTC){
            String DELETE = "{call procXoaTienCong (?)}";
            try {              
                cstmt = con.prepareCall(DELETE);
                cstmt.setInt(1, MaTC);
                cstmt.execute(); 
                JOptionPane.showMessageDialog(null, "Đã xóa tiền công thành công","Thông báo", 1);  
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Xóa tiền công tư thất bại","Thông báo", 1);  
                displayError(e);
            } 
        }
        public static void UpdateTC(int MaTC, String NoiDung, Double TienCong){
            String UPDATE = "{call procSuaTienCong (?,?,?)}";
            try {                
                cstmt = con.prepareCall(UPDATE);
                cstmt.setInt(1, MaTC);
                cstmt.setString(2, NoiDung);
                cstmt.setDouble(3, TienCong);       
                cstmt.execute();   
                JOptionPane.showMessageDialog(null, "Cập nhật tiền công thành công","Thông báo", 1);  
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Cập nhật tiền công thất bại","Thông báo", 1);  
                displayError(e);
            }           
        }
}
