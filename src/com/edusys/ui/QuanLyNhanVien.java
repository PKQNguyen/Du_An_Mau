package com.edusys.ui;

import com.edusys.dao.NhanVienDAO;
import com.edusys.entity.NhanVien;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class QuanLyNhanVien extends javax.swing.JDialog {

    private DefaultTableModel model;
    private NhanVienDAO dao;
    private int row;
    private NhanVien nv;

    public QuanLyNhanVien(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtHoVaTen = new com.edusys.textfield.TextField();
        txtMaNhanVien = new com.edusys.textfield.TextField();
        txtMatKhau = new com.edusys.textfield.PasswordField();
        txtXacNhanMK = new com.edusys.textfield.PasswordField();
        lblRongMaNhanVien = new javax.swing.JLabel();
        lblRongMatKhau = new javax.swing.JLabel();
        lblXacNhanMatKhau = new javax.swing.JLabel();
        lblRongHoTen = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rdoTruongPhong = new javax.swing.JRadioButton();
        rdoNhanVien = new javax.swing.JRadioButton();
        btnThem = new com.edusys.utils.ButtonBadges();
        btnSua = new com.edusys.utils.ButtonBadges();
        btnMoi = new com.edusys.utils.ButtonBadges();
        btnXoa = new com.edusys.utils.ButtonBadges();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new com.edusys.utils.TableStyle();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys - Quản lý nhân viên");

        txtHoVaTen.setLabelText("Họ và tên");
        txtHoVaTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoVaTenActionPerformed(evt);
            }
        });

        txtMaNhanVien.setLabelText("Mã nhân viên");
        txtMaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNhanVienActionPerformed(evt);
            }
        });

        txtMatKhau.setLabelText("Mật khẩu");

        txtXacNhanMK.setLabelText("Xác nhận mật khẩu");
        txtXacNhanMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXacNhanMKActionPerformed(evt);
            }
        });

        lblRongMaNhanVien.setForeground(new java.awt.Color(255, 51, 0));
        lblRongMaNhanVien.setText(" ");

        lblRongMatKhau.setForeground(new java.awt.Color(255, 51, 0));
        lblRongMatKhau.setText(" ");

        lblXacNhanMatKhau.setForeground(new java.awt.Color(255, 51, 0));
        lblXacNhanMatKhau.setText(" ");

        lblRongHoTen.setForeground(new java.awt.Color(255, 51, 0));
        lblRongHoTen.setText(" ");

        jLabel11.setForeground(new java.awt.Color(109, 109, 109));
        jLabel11.setText("Vai trò");

        buttonGroup2.add(rdoTruongPhong);
        rdoTruongPhong.setForeground(new java.awt.Color(109, 109, 109));
        rdoTruongPhong.setSelected(true);
        rdoTruongPhong.setText("Trưởng phòng");

        buttonGroup2.add(rdoNhanVien);
        rdoNhanVien.setForeground(new java.awt.Color(109, 109, 109));
        rdoNhanVien.setText("Nhân viên");
        rdoNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNhanVienActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRongMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblXacNhanMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtXacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRongMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(rdoTruongPhong)
                            .addGap(103, 103, 103)
                            .addComponent(rdoNhanVien))
                        .addComponent(lblRongHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lblRongMaNhanVien)
                .addGap(20, 20, 20)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lblRongMatKhau)
                .addGap(20, 20, 20)
                .addComponent(txtXacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lblXacNhanMatKhau)
                .addGap(20, 20, 20)
                .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lblRongHoTen)
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoTruongPhong)
                    .addComponent(rdoNhanVien))
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1134, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 674, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tabs.addTab("CẬP NHẬT", jPanel1);

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Mật khẩu", "Họ tên", "Vai trò"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("DANH SÁCH", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 1123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        if (evt.getClickCount() == 2) {
            row = tblNhanVien.getSelectedRow();
            String maNV = (String) tblNhanVien.getValueAt(this.row, 0);
            System.out.println(maNV);
            NhanVien nv = dao.selectByID(maNV);
            this.setForm(nv);
            tabs.setSelectedIndex(0);
            this.updateStatus();
        }
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void rdoNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNhanVienActionPerformed

    private void txtXacNhanMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXacNhanMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtXacNhanMKActionPerformed

    private void txtMaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNhanVienActionPerformed

    private void txtHoVaTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoVaTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoVaTenActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuanLyNhanVien dialog = new QuanLyNhanVien(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.edusys.utils.ButtonBadges btnMoi;
    private com.edusys.utils.ButtonBadges btnSua;
    private com.edusys.utils.ButtonBadges btnThem;
    private com.edusys.utils.ButtonBadges btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRongHoTen;
    private javax.swing.JLabel lblRongMaNhanVien;
    private javax.swing.JLabel lblRongMatKhau;
    private javax.swing.JLabel lblXacNhanMatKhau;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoTruongPhong;
    private javax.swing.JTabbedPane tabs;
    private com.edusys.utils.TableStyle tblNhanVien;
    private com.edusys.textfield.TextField txtHoVaTen;
    private com.edusys.textfield.TextField txtMaNhanVien;
    private com.edusys.textfield.PasswordField txtMatKhau;
    private com.edusys.textfield.PasswordField txtXacNhanMK;
    // End of variables declaration//GEN-END:variables

    private void init() {
        color();
        dao = new NhanVienDAO();
        nv = new NhanVien();
        fillTable();
        this.row = -1;
        this.updateStatus();
    }

    private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0); // xóa tất cả các hàng trên JTable
        try {
            List<NhanVien> list = dao.selectAll(); // đọc dữ liệu từ csdl
            for (NhanVien nv : list) {
                model.addRow(new Object[]{
                    nv.getMaNV(), nv.getMatKhau(), nv.getHoTen(), nv.getVaiTro() ? "Trưởng phòng" : "Nhân viên"
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setForm(NhanVien nv) {
        txtMaNhanVien.setText(nv.getMaNV());
        txtMatKhau.setText(nv.getMatKhau());
        txtXacNhanMK.setText(nv.getMatKhau());
        txtHoVaTen.setText(nv.getHoTen());
        rdoTruongPhong.setSelected(nv.getVaiTro());
        rdoNhanVien.setSelected(!nv.getVaiTro());
    }

    private NhanVien getForm() {
        NhanVien nv = new NhanVien();
        nv.setMaNV(txtMaNhanVien.getText());
        nv.setMatKhau(String.valueOf(txtMatKhau.getPassword()));
        nv.setHoTen(txtHoVaTen.getText());
        nv.setVaiTro(rdoTruongPhong.isSelected());
        return nv;

    }

    private void clearForm() {
        txtMaNhanVien.setText("");
        txtMatKhau.setText("");
        txtXacNhanMK.setText("");
        txtHoVaTen.setText("");
        lblRongMaNhanVien.setText("");
//        buttonGroup2.clearSelection();
        this.row = -1;
        this.updateStatus();
    }

    private void insert() {
        NhanVien nv = getForm();
        if (nv.getMaNV().isEmpty() || nv.getMatKhau().isEmpty() || nv.getHoTen().isEmpty() || nv.getVaiTro()) {
            if (nv.getMaNV().isEmpty()) {
                lblRongMaNhanVien.setText("Vui lòng nhập vào mã nhân viên");
            } else {
                lblRongMaNhanVien.setText("");
            }

            if (nv.getMatKhau().isEmpty()) {
                lblRongMatKhau.setText("Vui lòng nhập vào mật khẩu");
            } else {
                lblRongMatKhau.setText("");
            }

            if (nv.getMatKhau().isEmpty()) {
                lblXacNhanMatKhau.setText("Vui lòng xác nhận mật khẩu");
            } else {
                lblXacNhanMatKhau.setText("");
            }

            if (nv.getHoTen().isEmpty()) {
                lblRongHoTen.setText("Vui lòng nhập vào họ tên");
            } else {
                lblRongHoTen.setText("");
            }

        } else {
            String XNMatKhau = new String(txtXacNhanMK.getPassword());
            if (!XNMatKhau.equals(nv.getMatKhau())) {
                MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
                txtXacNhanMK.requestFocus();
            } else {
                try {
                    dao.insert(nv);
                    this.fillTable();
                    this.clearForm();
                    tabs.setSelectedIndex(0);
                    MsgBox.alert(this, "Thêm thành công!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void update() {
        NhanVien nv = getForm();
        String mk2 = String.valueOf(txtXacNhanMK.getPassword());
        if (!mk2.equals(nv.getMatKhau())) {
            MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
            txtXacNhanMK.requestFocus();
        } else {
            try {
                dao.update(nv);
                this.fillTable();
                MsgBox.alert(this, "Cập nhật thành công");
                tabs.setSelectedIndex(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa nhân viên!");
        } else {
            String maNV = txtMaNhanVien.getText();
            if (maNV.equals(Auth.user.getMaNV())) {
                MsgBox.alert(this, "Bạn không được xóa chính bạn!");
            } else if (MsgBox.confirm(this, "Bạn có thực sự muốn xóa nhân viên này?")) {
                try {
                    dao.delete(maNV);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Xóa thành công");
                    tabs.setSelectedIndex(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblNhanVien.getRowCount() - 1);
        // trạng thái form
        txtMaNhanVien.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
        // trạng thái điều hướng

    }

    private void color() {
        txtMaNhanVien.setBackground(new Color(0, 0, 0, 0));
        txtMatKhau.setBackground(new Color(0, 0, 0, 0));
        txtXacNhanMK.setBackground(new Color(0, 0, 0, 0));
        txtHoVaTen.setBackground(new Color(0, 0, 0, 0));
    }
}
