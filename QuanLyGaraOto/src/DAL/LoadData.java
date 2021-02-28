/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.*;

public class LoadData {
    public static PreparedStatement pst = null; //Biến thực thi sql
    public static CallableStatement cstmt = null;
    public static ResultSet rs = null; //Kết quả trả về dạng 1 bảng hay 1 dòng dữ liệu
    public static Connection con = Connect.getConnect();
    
    //Viết hàm nạp dữ liệu cho bảng
    public static void LoadDatatb(String sql, JTable tb){
            try {
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                tb.setModel(DbUtils.resultSetToTableModel(rs));// nạp dữ liệu lên bảng mình muốn truyền vào
                
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e, "Thông báo lỗi", 1);
        }
    }  
    public static void LoadDatatbSP(String sql, JTable tb){
            try {
                cstmt = (CallableStatement) con.prepareStatement(sql);
                rs = cstmt.executeQuery();
                tb.setModel(DbUtils.resultSetToTableModel(rs));// nạp dữ liệu lên bảng mình muốn truyền vào
                
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e, "Thông báo lỗi", 1);
        }
    }  
    //Hàm đổ dữ 1 dòng dữ liệu lên text field
    public static ResultSet ShowTextField(String sql){
        try {
            pst = con.prepareStatement(sql);
           return pst.executeQuery();//trả về 1 dòng dữ liệu đọc được
        } catch (SQLException e) {       
               JOptionPane.showMessageDialog(null,e, "Thông báo lỗi", 1); 
        }
        return null;
    }
     public static void LoadDataCB(String sql, JComboBox cb, String Bien){
         try {
             PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            cb.removeAllItems();
            while(rs.next()){
                cb.addItem(rs.getString(Bien));
            }
         } catch (SQLException e) {
         }
    }   
    
}
