
package DLL;

import DAL.KhachHangDAL;
import Entity.KhachHang;
import java.util.ArrayList;

/**
 *
 * @author ThienNhut
 */
public class KhachHangDLL {
    KhachHangDAL dal = new KhachHangDAL();
    public ArrayList<KhachHang> GET_ALL(){        
    //   return dal.GET_ALL();
       return null;
    }
     public boolean InsertKH(KhachHang KH){        
    //    return dal.InsertKH(KH);  
        return false;
    }
}
