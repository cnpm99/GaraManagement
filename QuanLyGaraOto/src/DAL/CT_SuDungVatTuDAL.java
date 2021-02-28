
package DAL;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class CT_SuDungVatTuDAL{
                             
        public static CallableStatement cstmt = null;
        public static ResultSet rs = null;
        public static Connection con = Connect.getConnect();
        
        public static void displayError(SQLException e){
            System.out.println(" Error Message:" + e.getMessage());
            System.out.println(" SQL State:" + e.getSQLState());
            System.out.println(" Error Code:" + e.getErrorCode());
        }
        public static void InsertCT_SDVT(int SoPSC, int MaTienCong, int MaVTPT, int SoLuong, Double DonGia){          
            String ADD = "{call procThemCT_SuDungVatTu (?,?,?,?,?)}";    
                try {                           
                cstmt = con.prepareCall(ADD);
                cstmt.setInt(1, SoPSC);
                cstmt.setInt(2, MaTienCong);
                cstmt.setInt(3, MaVTPT);          
                cstmt.setInt(4, SoLuong);
                cstmt.setDouble(5, DonGia);
                cstmt.execute();  
                JOptionPane.showMessageDialog(null, "Đã thêm vật tư thành công","Thông báo", 1);  
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Thêm vật tư thất bại","Thông báo", 1);  
                displayError(e);
            }         
        }
         public static void DeleteCT_SDVT(int SoPSC, int MaTienCong, int MaVTPT){
            String DELETE = "{call procXoaCT_SuDungVatTu (?,?,?)}";
            try {              
                cstmt = con.prepareCall(DELETE);
                cstmt.setInt(1, SoPSC);
                cstmt.setInt(2, MaTienCong);
                cstmt.setInt(3, MaVTPT);
                cstmt.execute(); 
                JOptionPane.showMessageDialog(null, "Đã xóa vật tư thành công","Thông báo", 1);  
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Xóa vật tư thất bại","Thông báo", 1);  
                displayError(e);
            } 
        }
        public static void UpdateCT_SDVT(int SoPSC, int MaTienCong, int MaVTPT, int SoLuong, Double DonGia){
            String UPDATE = "{call procSuaCT_SuDungVatTu (?,?,?,?,?)}";
            try {                
                cstmt = con.prepareCall(UPDATE);
                cstmt.setInt(1, SoPSC);
                cstmt.setInt(2, MaTienCong);
                cstmt.setInt(3, MaVTPT);
                cstmt.setInt(4, SoLuong);
                cstmt.setDouble(5, DonGia);
                cstmt.execute();   
                JOptionPane.showMessageDialog(null, "Cập nhật vật tư thành công","Thông báo", 1);  
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Cập nhật vật tư thất bại","Thông báo", 1);  
                displayError(e);
            }           
        }
        
        
}
