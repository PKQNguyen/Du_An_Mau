package com.edusys.dao;

import com.edusys.entity.NhanVien;
import com.edusys.jdbcHelper.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO extends EduSysDAO<NhanVien, String> {

    String INSERT_SQL = "INSERT INTO NhanVien(MaNV, MatKhau, HoTen, VaiTro) VALUES(?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE NhanVien SET MatKhau = ?, HoTen = ?, VaiTro = ? WHERE MaNV = ?";
    String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE MaNV = ?";

    @Override
    public void insert(NhanVien entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMaNV(), entity.getHoTen(), entity.getMatKhau(), entity.getVaiTro());
    }

    @Override
    public void update(NhanVien entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getMaNV(), entity.getMatKhau(), entity.getVaiTro(), entity.getMaNV());
    }

    @Override
    public void delete(String maNV) {
        JdbcHelper.update(DELETE_SQL, maNV);
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectByID(String maNV) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL , maNV);
        if(list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while(rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("maNV"));
                entity.setMatKhau(rs.getString("matKhau"));
                entity.setHoTen(rs.getString("hoTen"));
                entity.setVaiTro(rs.getBoolean("vaiTro"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            System.out.println(list);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private NhanVien readFromResultSet(ResultSet rs) throws SQLException {
        NhanVien model = new NhanVien();
        model.setMaNV(rs.getString("MaNV"));
        model.setMatKhau(rs.getString("MatKhau"));
        model.setHoTen(rs.getString("HoTen"));
        model.setVaiTro(rs.getBoolean("VaiTro"));
        return model;
    }
}
