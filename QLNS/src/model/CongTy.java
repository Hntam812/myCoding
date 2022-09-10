package model;

import java.util.ArrayList;

public class CongTy {
    public String tenCongTy;
    public String maSoThue;
    public double doanhThuThang;
    private ArrayList<NhanSu> dsNhanSu;

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public double getDoanhThuThang() {
        return doanhThuThang;
    }

    public void setDoanhThuThang(double doanhThuThang) {
        this.doanhThuThang = doanhThuThang;
    }

    public ArrayList<NhanSu> getListNV() {
        return dsNhanSu;
    }

    public void setListNV(ArrayList<NhanSu> listNV) {
        this.dsNhanSu = dsNhanSu;
    }

    public CongTy(){

    }

    public void NhapThongTinCongTy(){}

    public void XuatThongTinCongTy(){}

    public void ThemNhanSu(String NhanSu){}

    public void XoaNhanSu(String NhanSu){}

    public void XuatThong










}
