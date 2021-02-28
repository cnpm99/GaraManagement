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
public class QuyenNguoiDungDAL {
        public static CallableStatement cstmt = null;
        public static ResultSet rs = null;
        public static Connection con = Connect.getConnect();
        
        public static void displayError(SQLException e){
            System.out.println(" Error Message:" + e.getMessage());
            System.out.println(" SQL State:" + e.getSQLState());
            System.out.println(" Error Code:" + e.getErrorCode());
        }
        public static void UpdateQuyen(String Quyen, boolean QuanLySuaChua, boolean QuanLyBanHang, boolean QuanLyKhoHang, boolean CapNhatDuLieu,
                boolean BaoCao, boolean DanhMuc, boolean TraCuu, boolean PhanQuyen,
                boolean ThayDoiQuyDinh, boolean ThemNguoiDung){				
            String UPDATE = "{call procSuaQuyenNguoiDung (?,?,?,?,?,?,?,?,?,?,?)}";
            try {                
                cstmt = con.prepareCall(UPDATE);
                cstmt.setString(1, Quyen);
                cstmt.setBoolean(2, QuanLySuaChua);
                cstmt.setBoolean(3, QuanLyBanHang);
                cstmt.setBoolean(4, QuanLyKhoHang);
                cstmt.setBoolean(5, CapNhatDuLieu);
                cstmt.setBoolean(6, BaoCao);
                cstmt.setBoolean(7, DanhMuc);
                cstmt.setBoolean(8, TraCuu);
                cstmt.setBoolean(9, PhanQuyen);
                cstmt.setBoolean(10, ThayDoiQuyDinh);
                cstmt.setBoolean(11, ThemNguoiDung);
                        
                
                cstmt.execute();   
                JOptionPane.showMessageDialog(null, "Cập nhật quyền thành công","Thông báo", 1);  
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Cập nhật quyền thất bại","Thông báo", 1);  
                displayError(e);
            }
        }
}
