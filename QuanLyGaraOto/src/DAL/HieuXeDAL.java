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
import DAL.Connect;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;


public class HieuXeDAL {
        public static Connection con = Connect.getConnect();
        public static CallableStatement cstmt = null;
        public static ResultSet rs = null;
        
    
        public static void InsertHX(String HieuXe){
            String sql ="{call procThemHieuXe (?)}";
            try {
                cstmt = con.prepareCall(sql);
                cstmt.setString(1, HieuXe);
                cstmt.execute();
                //cstmt.close();              
                JOptionPane.showMessageDialog(null, "Đã thêm hiệu xe "+HieuXe+" thành công","Thông báo", 1);          
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Hiệu xe "+HieuXe+" đã tồn tại","Thông báo", 2);
            }
        }
        
          public static void DeleteHX(String HieuXe){
            String sql ="{call procXoaHieuXe (?)}";
            try {
                cstmt = con.prepareCall(sql);
                cstmt.setString(1, HieuXe);
                cstmt.execute();
              //  cstmt.close();                
                JOptionPane.showMessageDialog(null, "Đã xóa hiệu xe "+HieuXe+" thành công","Thông báo", 1);          
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Hiệu xe "+HieuXe+" không thể xóa","Thông báo", 2);
            }
        }
    
}
