
package com.edusys.entity;

import java.util.Date;

public class KhoaHoc {
    private int maKhoaHoc;
    private String maChuyenDe;
    private float hocPhi;
    private int thoiLuong;
    private Date ngayKhaiGiang;
    private String ghiChu;
    private String maNhanVien;
    private Date ngayTao;

    public KhoaHoc() {
    }

    public KhoaHoc(int maKhoaHoc, String maChuyenDe, float hocPhi, int thoiLuong, Date ngayKhaiGiang, String ghiChu, String maNhanVien, Date ngayTao) {
        this.maKhoaHoc = maKhoaHoc;
        this.maChuyenDe = maChuyenDe;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.ngayKhaiGiang = ngayKhaiGiang;
        this.ghiChu = ghiChu;
        this.maNhanVien = maNhanVien;
        this.ngayTao = ngayTao;
    }

    public int getMaKhoaHoc() {
        return maKhoaHoc;
    }

    public void setMaKhoaHoc(int maKhoaHoc) {
        this.maKhoaHoc = maKhoaHoc;
    }

    public String getMaChuyenDe() {
        return maChuyenDe;
    }

    public void setMaChuyenDe(String maChuyenDe) {
        this.maChuyenDe = maChuyenDe;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public Date getNgayKhaiGiang() {
        return ngayKhaiGiang;
    }

    public void setNgayKhaiGiang(Date ngayKhaiGiang) {
        this.ngayKhaiGiang = ngayKhaiGiang;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }
    
    
}
