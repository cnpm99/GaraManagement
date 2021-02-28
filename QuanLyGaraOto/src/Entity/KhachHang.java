/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author ThienNhut
 */
public class KhachHang {
        private int MaKH;
	private String TenKH;
	private int CMND;
	private String SoTheThanhVien;
	private int DienThoai ;
	private String DiaChi;
	private Double TienNo;
	private String Email;

    public int getMaKH() {
        return MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public int getCMND() {
        return CMND;
    }

    public String getSoTheThanhVien() {
        return SoTheThanhVien;
    }

    public int getDienThoai() {
        return DienThoai;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public Double getTienNo() {
        return TienNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public void setSoTheThanhVien(String SoTheThanhVien) {
        this.SoTheThanhVien = SoTheThanhVien;
    }

    public void setDienThoai(int DienThoai) {
        this.DienThoai = DienThoai;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setTienNo(Double TienNo) {
        this.TienNo = TienNo;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
        
        
}
