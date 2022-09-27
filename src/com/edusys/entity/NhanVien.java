
package com.edusys.entity;

import java.util.Objects;

public class NhanVien {
    private String maNV;
    private String matKhau;
    private String hoTen;
    private Boolean vaiTro;

    public NhanVien() {
    }

    public NhanVien(String maNV, String matKhau, String hoTen, Boolean vaiTro) {
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.vaiTro = vaiTro;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Boolean getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(Boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", matKhau=" + matKhau + ", hoTen=" + hoTen + ", vaiTro=" + vaiTro + '}';
    }

    

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 47 * hash + Objects.hashCode(this.matKhau);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final NhanVien other = (NhanVien) obj;
//        if (!Objects.equals(this.matKhau, other.matKhau)) {
//            return false;
//        }
//        return true;
//    }

    
    
    
    
}
