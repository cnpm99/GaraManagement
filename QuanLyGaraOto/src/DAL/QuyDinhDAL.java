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


public class QuyDinhDAL {
        public static Connection con = Connect.getConnect();
        public static CallableStatement cstmt = null;
        public static ResultSet rs = null;
        
         public static void displayError(SQLException e){
            System.out.println(" Error Message:" + e.getMessage());
            System.out.println(" SQL State:" + e.getSQLState());
            System.out.println(" Error Code:" + e.getErrorCode());
        }
        public static void UpdateThamSo(String TenThamSo, int GiaTri){
            String UPDATE = "{call procSuaThamSo (?,?)}";
            try {                
                cstmt = con.prepareCall(UPDATE);
                cstmt.setString(1, TenThamSo);
                cstmt.setInt(2, GiaTri);             
                cstmt.execute();   
                JOptionPane.showMessageDialog(null, "Cập nhật giá trị thành công","Thông báo", 1);  
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Cập nhật giá trị thất bại","Thông báo", 1);  
                displayError(e);
            }           
        }
}
