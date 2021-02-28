/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.*;
import javax.swing.JOptionPane;
public class Connect {
    public static Connection con = null;
    public static ResultSet rs = null;
    public static PreparedStatement pst = null;
    public static Connection getConnect()
    {
       try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyGaraOto";
            String user = "sa";
            String pass = "123456";     
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, user, pass);
         // JOptionPane.showMessageDialog(null,"Kết nối CSDL thành công", "Thông báo", 1);
            return con;
        } catch (ClassNotFoundException | SQLException ex) {      
            JOptionPane.showMessageDialog(null, ex);
            //JOptionPane.showMessageDialog(null,"Kết nối CSDL thất bại", "Thông báo", 2);  
            return null;
        }                    
    }
    public static void getClose(){
        try {
            con.close();
        } catch (SQLException e) {
        }
    }
   
     public static ResultSet cLog(String id, String pass){
        String sql = "SELECT * from TAIKHOAN where TEN=? AND MATKHAU=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,id);
            pst.setString(2,pass);
            return rs=pst.executeQuery(); 
        } catch (SQLException e) {
            return null; 
        }     
    }
    
}
