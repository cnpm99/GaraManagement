/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author ThienNhut
 */
public class DanhSachXeDAL {
    public static Connection con = Connect.getConnect();
    public static CallableStatement cstmt = null;
    public static ResultSet rs = null;
    
    
    public static void InsertXe(String BienSo, String HieuXe, String LoaiXe, String DoiXe, int SoKM, String SoKhung, String SoMay, String MauSon, Date NgayTiepNhan, int MaKH, Double TienNo){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");       
        String sql ="{call procThemTiepNhanXe (?,?,?,?,?,?,?,?,?,?,?)}";
        try {
            cstmt = con.prepareCall(sql);
            cstmt.setString(1, BienSo);
            cstmt.setString(2, HieuXe);
            cstmt.setString(3, LoaiXe);
            cstmt.setString(4, DoiXe);
            cstmt.setInt(5, SoKM);
            cstmt.setString(6, SoKhung);
            cstmt.setString(7, SoMay);
            cstmt.setString(8, MauSon);            
            String Ngay = formatter.format(NgayTiepNhan);
            cstmt.setString(9, Ngay);
            cstmt.setInt(10, MaKH);
            cstmt.setDouble(11, 0);            
            cstmt.execute();
           // cstmt.close();            
            JOptionPane.showMessageDialog(null, "Đã thêm xe biển số: "+BienSo+" thành công","Thông báo", 1);          
        } catch (Exception e) {            
            JOptionPane.showMessageDialog(null, "Xe biển số: "+BienSo+" đã tồn tại","Thông báo", 2);
        }
    }
   public static void UpdateXe(String BienSo, String HieuXe, String LoaiXe, String DoiXe, int SoKM, String SoKhung, String SoMay, String MauSon, Date NgayTiepNhan, int MaKH){
       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
       String sql ="{call procSuaDanhSachXe (?,?,?,?,?,?,?,?,?,?,?)}";
        try {
            cstmt = con.prepareCall(sql);
            cstmt.setString(1, BienSo);
            cstmt.setString(2, HieuXe);
            cstmt.setString(3, LoaiXe);
            cstmt.setString(4, DoiXe);
            cstmt.setInt(5, SoKM);
            cstmt.setString(6, SoKhung);
            cstmt.setString(7, SoMay);
            cstmt.setString(8, MauSon);            
            String Ngay = formatter.format(NgayTiepNhan);
            cstmt.setString(9, Ngay);
            cstmt.setInt(10, MaKH);
            cstmt.setDouble(11, 0);                      
            cstmt.execute();
            JOptionPane.showMessageDialog(null, "Đã sửa xe biển số: "+BienSo+" thành công","Thông báo", 1);
        } catch (Exception e) {          
           JOptionPane.showMessageDialog(null, "Biển số "+BienSo+" đã tồn tại","Thông báo", 2);
        }
    }
    public static void DeleteXe(String BienSo){
        String sql ="{call procXoaDanhSachXe (?)}";
        try {
            cstmt = con.prepareCall(sql);
            cstmt.setString(1, BienSo);                   
            cstmt.execute();
            JOptionPane.showMessageDialog(null, "Đã xóa xe: "+BienSo+" thành công","Thông báo", 2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Xe: "+BienSo+" không thể xóa","Thông báo", 3);
        }
    }
}
