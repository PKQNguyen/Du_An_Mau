package com.edusys.dao;

import com.edusys.entity.HocVien;
import java.util.List;

public class HocVienDAO extends EduSysDAO<HocVien, Integer>{

    @Override
    public void insert(HocVien entity) {
    }

    @Override
    public void update(HocVien entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HocVien> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HocVien selectByID(Integer key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<HocVien> selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
