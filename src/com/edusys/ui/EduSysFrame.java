package com.edusys.ui;

import com.edusys.notificationframe.ImageAvartar;
import com.edusys.notificationframe.Notification;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import com.edusys.utils.XImage;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class EduSysFrame extends javax.swing.JFrame implements Runnable {

    private int count;
    private Notification noti;

    public EduSysFrame() {
        initComponents();
        init();
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (count == 3) {
                    count = 0;
                }
                ImageIcon icon = new ImageIcon(getClass().getResource("/com/edusys/image/" + count + ".jpg"));
                lblAnh.setIcon(icon);
                Thread.sleep(2000);
                count++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        pnlStatusBar = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnNguoiHoc = new javax.swing.JButton();
        btnKhoaHoc = new javax.swing.JButton();
        btnChuyenDe = new javax.swing.JButton();
        btnHocVien = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnHuongDan = new javax.swing.JButton();
        pnlAnhDong = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        lblAnh = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mniDangNhap = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        mniDoiMatKhau = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniKetThuc = new javax.swing.JMenuItem();
        mnuQuanLy = new javax.swing.JMenu();
        mniNguoiHoc = new javax.swing.JMenuItem();
        mniChuyenDe = new javax.swing.JMenuItem();
        mniKhoaHoc = new javax.swing.JMenuItem();
        mniQuanLyNhanVien = new javax.swing.JMenuItem();
        mnuThongKe = new javax.swing.JMenu();
        mniNguoiHocTungNam = new javax.swing.JMenuItem();
        mniBangDiemKhoa = new javax.swing.JMenuItem();
        mniDiemTungKhoaHoc = new javax.swing.JMenuItem();
        mniDoanhThuTungChuyenDe = new javax.swing.JMenuItem();
        mnuTroGiup = new javax.swing.JMenu();
        mniHuongDanSuDung = new javax.swing.JMenuItem();
        mniGioiThieuSanPham = new javax.swing.JMenuItem();
        mnuLuaChon = new javax.swing.JMenu();
        mniSang = new javax.swing.JRadioButtonMenuItem();
        mniToi = new javax.swing.JRadioButtonMenuItem();

        jMenu3.setText("jMenu3");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        jMenu10.setText("jMenu10");

        jMenu11.setText("jMenu11");

        jMenuItem12.setText("jMenuItem12");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HỆ QUẢN LÝ ĐÀO TẠO");
        setResizable(false);

        jToolBar1.setRollover(true);

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/DangXuat.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangXuat);

        btnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/KetThuc.png"))); // NOI18N
        btnKetThuc.setText("Kết thúc");
        btnKetThuc.setFocusable(false);
        btnKetThuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetThuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKetThuc);
        jToolBar1.add(jSeparator3);

        btnNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/NguoiHoc.png"))); // NOI18N
        btnNguoiHoc.setText("Người học");
        btnNguoiHoc.setFocusable(false);
        btnNguoiHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNguoiHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnNguoiHoc);

        btnKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/KhoaHoc.png"))); // NOI18N
        btnKhoaHoc.setText("Khóa học");
        btnKhoaHoc.setFocusable(false);
        btnKhoaHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhoaHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnKhoaHoc);

        btnChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/ChuyenDe.png"))); // NOI18N
        btnChuyenDe.setText("Chuyên đề");
        btnChuyenDe.setFocusable(false);
        btnChuyenDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChuyenDe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnChuyenDe);

        btnHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/HocVien.png"))); // NOI18N
        btnHocVien.setText("Học viên");
        btnHocVien.setFocusable(false);
        btnHocVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHocVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnHocVien);
        jToolBar1.add(jSeparator4);

        btnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/HuongDan.png"))); // NOI18N
        btnHuongDan.setText("Hướng dẫn");
        btnHuongDan.setFocusable(false);
        btnHuongDan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuongDan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnHuongDan);

        javax.swing.GroupLayout pnlStatusBarLayout = new javax.swing.GroupLayout(pnlStatusBar);
        pnlStatusBar.setLayout(pnlStatusBarLayout);
        pnlStatusBarLayout.setHorizontalGroup(
            pnlStatusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatusBarLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 1436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlStatusBarLayout.setVerticalGroup(
            pnlStatusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlAnhDong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/notification/info.png"))); // NOI18N
        lblInfo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblInfoFocusGained(evt);
            }
        });
        lblInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInfoMouseClicked(evt);
            }
        });
        pnlAnhDong.add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, 30, 40));

        lblDongHo.setBackground(new java.awt.Color(0, 0, 0));
        lblDongHo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        pnlAnhDong.add(lblDongHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 730, 118, 40));

        lblAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/0.jpg"))); // NOI18N
        pnlAnhDong.add(lblAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 770));

        menuBar.setBackground(new java.awt.Color(0, 0, 0));

        mnuHeThong.setText("Hệ thống");

        mniDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mniDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/DangNhap.png"))); // NOI18N
        mniDangNhap.setText("Đăng nhập");
        mniDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangNhapActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangNhap);

        mniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/DangXuat1.png"))); // NOI18N
        mniDangXuat.setText("Đăng xuất");
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangXuat);

        mniDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/DoiMatKhau.png"))); // NOI18N
        mniDoiMatKhau.setText("Đổi mật khẩu");
        mniDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMatKhauActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDoiMatKhau);
        mnuHeThong.add(jSeparator1);

        mniKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/KetThuc1.png"))); // NOI18N
        mniKetThuc.setText("Kết thúc");
        mniKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKetThucActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniKetThuc);

        menuBar.add(mnuHeThong);

        mnuQuanLy.setText("Quản lý");

        mniNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/NguoiHoc1.png"))); // NOI18N
        mniNguoiHoc.setText("Người học");
        mniNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNguoiHocActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniNguoiHoc);

        mniChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/ChuyenDe1.png"))); // NOI18N
        mniChuyenDe.setText("Chuyên đề");
        mnuQuanLy.add(mniChuyenDe);

        mniKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/KhoaHoc1.png"))); // NOI18N
        mniKhoaHoc.setText("Khóa học");
        mnuQuanLy.add(mniKhoaHoc);

        mniQuanLyNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/QLNhanVien.png"))); // NOI18N
        mniQuanLyNhanVien.setText("Quản lý nhân viên");
        mniQuanLyNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQuanLyNhanVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniQuanLyNhanVien);

        menuBar.add(mnuQuanLy);

        mnuThongKe.setText(" Thống kê");
        mnuThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuThongKeActionPerformed(evt);
            }
        });

        mniNguoiHocTungNam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/NguoiHocTungNam.png"))); // NOI18N
        mniNguoiHocTungNam.setText("Người học từng năm");
        mniNguoiHocTungNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNguoiHocTungNamActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniNguoiHocTungNam);

        mniBangDiemKhoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/BangDiemKhoa.png"))); // NOI18N
        mniBangDiemKhoa.setText("Bảng điểm khóa");
        mniBangDiemKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBangDiemKhoaActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniBangDiemKhoa);

        mniDiemTungKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/DiemTungKhoaHoc.png"))); // NOI18N
        mniDiemTungKhoaHoc.setText("Điểm từng khóa học");
        mniDiemTungKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDiemTungKhoaHocActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniDiemTungKhoaHoc);

        mniDoanhThuTungChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/DoanhThuTungChuyenDe.png"))); // NOI18N
        mniDoanhThuTungChuyenDe.setText("Doanh thu từng chuyên đề");
        mniDoanhThuTungChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoanhThuTungChuyenDeActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniDoanhThuTungChuyenDe);

        menuBar.add(mnuThongKe);

        mnuTroGiup.setText("Trợ giúp");

        mniHuongDanSuDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/HuongDanSuDung.png"))); // NOI18N
        mniHuongDanSuDung.setText("Hướng dẫn sử dụng ");
        mniHuongDanSuDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHuongDanSuDungActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mniHuongDanSuDung);

        mniGioiThieuSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/GioiThieuSanPham.png"))); // NOI18N
        mniGioiThieuSanPham.setText("Giới thiệu sản phẩm");
        mniGioiThieuSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGioiThieuSanPhamActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mniGioiThieuSanPham);

        menuBar.add(mnuTroGiup);

        mnuLuaChon.setText("Lựa chọn");

        buttonGroup1.add(mniSang);
        mniSang.setText("Sáng");
        mniSang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSangActionPerformed(evt);
            }
        });
        mnuLuaChon.add(mniSang);

        buttonGroup1.add(mniToi);
        mniToi.setSelected(true);
        mniToi.setText("Tối");
        mniToi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniToiActionPerformed(evt);
            }
        });
        mnuLuaChon.add(mniToi);

        menuBar.add(mnuLuaChon);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAnhDong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlStatusBar, javax.swing.GroupLayout.PREFERRED_SIZE, 1430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlStatusBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAnhDong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mniSangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSangActionPerformed
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FlatAnimatedLafChange.showSnapshot();
                FlatLightLaf.setup();
                FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
            }
        });
    }//GEN-LAST:event_mniSangActionPerformed

    private void mniToiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniToiActionPerformed
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FlatAnimatedLafChange.showSnapshot();
                FlatDarculaLaf.setup();
                FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
            }
        });
    }//GEN-LAST:event_mniToiActionPerformed

    private void mniDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangNhapActionPerformed
        this.openDangNhap();
    }//GEN-LAST:event_mniDangNhapActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        dangXuat();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void mniNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNguoiHocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniNguoiHocActionPerformed

    private void mniGioiThieuSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGioiThieuSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniGioiThieuSanPhamActionPerformed

    private void mniHuongDanSuDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHuongDanSuDungActionPerformed

    }//GEN-LAST:event_mniHuongDanSuDungActionPerformed

    private void mniQuanLyNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQuanLyNhanVienActionPerformed
        this.openQuanLy();
    }//GEN-LAST:event_mniQuanLyNhanVienActionPerformed

    private void mniDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMatKhauActionPerformed
        this.openDoiMatKhau();
    }//GEN-LAST:event_mniDoiMatKhauActionPerformed

    private void mnuThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuThongKeActionPerformed

    }//GEN-LAST:event_mnuThongKeActionPerformed

    private void mniNguoiHocTungNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNguoiHocTungNamActionPerformed
        this.openThongKe(0);
    }//GEN-LAST:event_mniNguoiHocTungNamActionPerformed

    private void mniBangDiemKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBangDiemKhoaActionPerformed
        this.openThongKe(1);
    }//GEN-LAST:event_mniBangDiemKhoaActionPerformed

    private void mniDiemTungKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDiemTungKhoaHocActionPerformed
        this.openThongKe(2);
    }//GEN-LAST:event_mniDiemTungKhoaHocActionPerformed

    private void mniDoanhThuTungChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoanhThuTungChuyenDeActionPerformed
        this.openThongKe(3);
    }//GEN-LAST:event_mniDoanhThuTungChuyenDeActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        dangXuat();
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKetThucActionPerformed
        ketThuc();
    }//GEN-LAST:event_mniKetThucActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        ketThuc();
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void lblInfoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblInfoFocusGained
        JOptionPane.showMessageDialog(this, "Hello");
    }//GEN-LAST:event_lblInfoFocusGained

    private void lblInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoMouseClicked
        ImageAvartar avartar = new ImageAvartar(this, ImageAvartar.Type.INFO, ImageAvartar.Location.TOP_CENTER, "");
        avartar.showNotification();
    }//GEN-LAST:event_lblInfoMouseClicked

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EduSysFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyenDe;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHocVien;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnKhoaHoc;
    private javax.swing.JButton btnNguoiHoc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mniBangDiemKhoa;
    private javax.swing.JMenuItem mniChuyenDe;
    private javax.swing.JMenuItem mniDangNhap;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDiemTungKhoaHoc;
    private javax.swing.JMenuItem mniDoanhThuTungChuyenDe;
    private javax.swing.JMenuItem mniDoiMatKhau;
    private javax.swing.JMenuItem mniGioiThieuSanPham;
    private javax.swing.JMenuItem mniHuongDanSuDung;
    private javax.swing.JMenuItem mniKetThuc;
    private javax.swing.JMenuItem mniKhoaHoc;
    private javax.swing.JMenuItem mniNguoiHoc;
    private javax.swing.JMenuItem mniNguoiHocTungNam;
    private javax.swing.JMenuItem mniQuanLyNhanVien;
    private javax.swing.JRadioButtonMenuItem mniSang;
    private javax.swing.JRadioButtonMenuItem mniToi;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenu mnuLuaChon;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JMenu mnuThongKe;
    private javax.swing.JMenu mnuTroGiup;
    private javax.swing.JPanel pnlAnhDong;
    private javax.swing.JPanel pnlStatusBar;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setIconImage(XImage.getAppIcon());
        new Chao(this, true).setVisible(true);
        new DangNhap(this, true).setVisible(true);
        count = 0;
        Thread t1 = new Thread(this);
        t1.start();
        startDongHo();
    }

    private void openQuanLy() {
        new QuanLyNhanVien(this, true).setVisible(true);
    }

    private void openDangNhap() {
        new DangNhap(this, true).setVisible(true);
    }

    private void startDongHo() {
        new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");
                String textString = format.format(now);
                lblDongHo.setForeground(Color.black);
                lblDongHo.setText(textString);
            }
        }).start();
    }

    private void openDoiMatKhau() {
        if (Auth.isLogin()) {
            new DoiMatKhau(this, true).setVisible(true);
        } else {
            noti = new Notification(this, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "Vui lòng đăng nhập");
            noti.showNotification();
        }
    }

    private void openThongKe(int index) {
        if (Auth.isLogin()) {
            if (index == 3 && !Auth.isManager()) {
                noti = new Notification(this, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "Bạn không có quyền xem danh thu");
                noti.showNotification();
            } else {
                ThongKe tk = new ThongKe(this, true);
                tk.setVisible(true);
                tk.selectTab(index);
            }
        } else {
            noti = new Notification(this, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "Vui lòng đăng nhập!");
            noti.showNotification();
        }
    }

    private void dangXuat() {
        Auth.clear();
        new DangNhap(this, true).setVisible(true);
    }

    private void ketThuc() {
        if (MsgBox.confirm(this, "Bạn muốn kết thúc làm việc")) {
            System.exit(0);
        }
    }
}
