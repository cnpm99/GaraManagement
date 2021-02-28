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


/**
 *
 * @author ThienNhut
 */
public class CT_PhieuSuaChuaDAL{                      
            
        public static Connection con = Connect.getConnect();
        public static CallableStatement cstmt = null;
        public static ResultSet rs = null;
        
        
        public static void displayError(SQLException e){
            System.out.println(" Error Message:" + e.getMessage());
            System.out.println(" SQL State:" + e.getSQLState());
            System.out.println(" Error Code:" + e.getErrorCode());
        }       
        
        public static void InsertCT_PSC(int SoPSC, int MaTienCong, String GhiChu, Double TienCong, Double TienVTPT, Double TongTien){            
            String ADD = "{call procThemCT_PhieuSuaChua (?,?,?,?,?,?)}";
            try {                
                cstmt = con.prepareCall(ADD);
                cstmt.setInt(1, SoPSC);
                cstmt.setInt(2, MaTienCong);
                cstmt.setString(3, GhiChu);
                cstmt.setDouble(4, TienCong);
                cstmt.setDouble(5, TienVTPT);
                cstmt.setDouble(6, TongTien);
                cstmt.execute();
                JOptionPane.showMessageDialog(null, "Đã thêm thành công","Thông báo", 1); 
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Phiếu đã tồn tại!","Thông báo", 2); 
                displayError(e);
            }          
        }
        public static void DeleteCT_PSC(int SoPSC, int MaTienCong){           
            String DELETE = "{call procXoaCT_PhieuSuaChua (?,?)}";
            try {            
                cstmt = con.prepareCall(DELETE);
                cstmt.setInt(1, SoPSC);
                cstmt.setInt(2, MaTienCong);
                cstmt.execute();
                JOptionPane.showMessageDialog(null, "Đã xóa thành công","Thông báo", 1); 
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Xóa thất bại","Thông báo", 1); 
                displayError(e);
            }                   
        }
        public static void UpdateCT_PSC(int SoPSC, int MaTienCong, String GhiChu){          
            String UPDATE = "{call procSuaCT_PhieuSuaChua (?,?,?)}";
            try {                
                cstmt = con.prepareCall(UPDATE);
                cstmt.setInt(1, SoPSC);
                cstmt.setInt(2, MaTienCong);
                cstmt.setString(3, GhiChu);               
                cstmt.execute();
                JOptionPane.showMessageDialog(null, "Cập nhật thành công","Thông báo", 1); 
            }catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "Cập nhật thất bại","Thông báo", 1); 
                displayError(e);
            } 
        }
       
}
