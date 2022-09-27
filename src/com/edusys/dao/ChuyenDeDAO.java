package com.edusys.dao;

import com.edusys.entity.ChuyenDe;
import java.util.List;

public class ChuyenDeDAO extends EduSysDAO<ChuyenDe, String> {

    String INSERT_SQL = "INSERT INTO ChuyenDe(MaCD, TenCD, HocPhi, ThoiLuong, Hinh, MoTa) VALUES(?, ?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE ChuyenDe SET TenCD = ?, HocPhi = ?, ThoiLuong = ?, Hinh = ?, MoTa = ? WHERE MaCD = ?";
    String DELETE_SQL = "DELETE FROM ChuyenDe WHERE MaCD = ?";
    String SELECT_ALL_SQL = "SELECT * FROM ChuyenDe";
    String SELECT_BY_ID_SQL = "SELECT * FROM ChuyenDe WHERE MACD = ?";

    @Override
    public void insert(ChuyenDe entity) {
    }

    @Override
    public void update(ChuyenDe entity) {
    }

    @Override
    public void delete(String key) {
    }

    @Override
    public List<ChuyenDe> selectAll() {
        return null;
    }

    @Override
    public ChuyenDe selectByID(String key) {
        return null;
    }

    @Override
    protected List<ChuyenDe> selectBySql(String sql, Object... args) {
        return null;
    }

}
