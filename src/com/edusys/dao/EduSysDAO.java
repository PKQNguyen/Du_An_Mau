
package com.edusys.dao;


import java.util.List;

// K là kiểu dữ liệu của khóa chính
// E là thực thể class 

public abstract class EduSysDAO<E, K> {
    abstract public void insert(E entity);
    abstract public void update(E entity);
    abstract public void delete(K key);
    // selectAll thì chúng ta không cần tham số gì cả
    // Nhưng nó có giữ liệu trả về nên chúng ta sẽ dùng List
    abstract public List<E> selectAll();
    
    // Lấy theo mã thì chỉ trả về một kết quả
    // nên ta chỉ dùng E
    abstract public E selectByID(K key);
    
    // phương thức này để dành cho lớp con định nghĩa lại
    // có 2 tham số truyền vào 
    // 1: là câu lệnh sql
    // 2: là Object cần thiết để đưa vào dấu ?
    // kết quả trả về phải truyền vào List
    abstract protected List<E> selectBySql(String sql, Object...args);
    
}
