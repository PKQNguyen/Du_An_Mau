
package com.edusys.entity;

public class HocVien {
    private int maHocVien;
    private int maKhachHang;
    private String maNguoiHoc;
    private float diem;

    public HocVien() {
    }

    public HocVien(int maHocVien, int maKhachHang, String maNguoiHoc, float diem) {
        this.maHocVien = maHocVien;
        this.maKhachHang = maKhachHang;
        this.maNguoiHoc = maNguoiHoc;
        this.diem = diem;
    }

    public int getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(int maHocVien) {
        this.maHocVien = maHocVien;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaNguoiHoc() {
        return maNguoiHoc;
    }

    public void setMaNguoiHoc(String maNguoiHoc) {
        this.maNguoiHoc = maNguoiHoc;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
    
    
}
