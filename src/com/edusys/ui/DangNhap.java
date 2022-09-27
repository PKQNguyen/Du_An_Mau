package com.edusys.ui;

import com.edusys.dao.NhanVienDAO;
import com.edusys.entity.NhanVien;
import com.edusys.notification.Notification;
import com.edusys.utils.Auth;
import java.awt.Color;
import javax.swing.JOptionPane;

public class DangNhap extends javax.swing.JDialog {

    private Notification noti;
    private NhanVienDAO dao;

    public DangNhap(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtMatKhau = new com.edusys.textfield.PasswordField();
        txtTenDangNhap = new com.edusys.textfield.TextField();
        btnDangNhap = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        lblSaiTenDangNhap = new javax.swing.JLabel();
        lblSaiMatKhau = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(217, 228, 82));

        txtMatKhau.setForeground(new java.awt.Color(51, 51, 51));
        txtMatKhau.setLabelText("Mật khẩu");
        txtMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhauActionPerformed(evt);
            }
        });
        txtMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMatKhauKeyReleased(evt);
            }
        });

        txtTenDangNhap.setForeground(new java.awt.Color(51, 51, 51));
        txtTenDangNhap.setLabelText("Tên đăng nhập");
        txtTenDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenDangNhapKeyReleased(evt);
            }
        });

        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnKetThuc.setText("Kết thúc");
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });

        lblSaiTenDangNhap.setForeground(new java.awt.Color(255, 0, 0));

        lblSaiMatKhau.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSaiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnDangNhap)
                        .addGap(56, 56, 56)
                        .addComponent(btnKetThuc))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSaiTenDangNhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lblSaiTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSaiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNhap)
                    .addComponent(btnKetThuc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/mp4/anhDong.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1268, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 707, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        dangNhap();
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void txtTenDangNhapKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenDangNhapKeyReleased
        lblSaiTenDangNhap.setText("");
    }//GEN-LAST:event_txtTenDangNhapKeyReleased

    private void txtMatKhauKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauKeyReleased
        lblSaiMatKhau.setText("");
    }//GEN-LAST:event_txtMatKhauKeyReleased

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        ketThuc();
    }//GEN-LAST:event_btnKetThucActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangNhap dialog = new DangNhap(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSaiMatKhau;
    private javax.swing.JLabel lblSaiTenDangNhap;
    private com.edusys.textfield.PasswordField txtMatKhau;
    private com.edusys.textfield.TextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setResizable(false);
        txtTenDangNhap.setBackground(new Color(0, 0, 0, 0));
        txtMatKhau.setBackground(new Color(0, 0, 0, 0));
        dao = new NhanVienDAO();
    }

    private void dangNhap() {
        String maNV = txtTenDangNhap.getText();
        String matKhau = String.valueOf(txtMatKhau.getPassword());
        NhanVien nhanVien = dao.selectByID(maNV);

        if (maNV.isEmpty() || matKhau.isEmpty()) {
            noti = new Notification(this, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "ĐĂNG NHẬP THẤT BẠI");
            noti.showNotification();
            if (maNV.isEmpty() && matKhau.isEmpty()) {
                lblSaiTenDangNhap.setText("Vui lòng không để trống trường hợp này");
                lblSaiMatKhau.setText("Vui lòng không để trống trường hợp này");
            } else if (maNV.isEmpty()) {
                lblSaiTenDangNhap.setText("Vui lòng không để trống trường hợp này");
            } else if (matKhau.isEmpty()) {
                lblSaiMatKhau.setText("Vui lòng không để trống trường hợp này");
            }
        } else if (nhanVien == null) {
            noti = new Notification(this, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "Sai tên đăng nhập!");
            noti.showNotification();
        } else if (!matKhau.equals(nhanVien.getMatKhau())) {
            noti = new Notification(this, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "Sai mật khẩu");
            noti.showNotification();
        } else {
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
            Auth.user = nhanVien;
            this.dispose();
        }
    }

    private void ketThuc() {
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn kết thúc ứng dụng?", "Hệ thống quản lý đào tạo", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}
