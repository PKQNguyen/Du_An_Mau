package com.edusys.ui;

import com.edusys.dao.NhanVienDAO;
import com.edusys.utils.Auth;
import java.awt.Color;

public class DoiMatKhau extends javax.swing.JDialog {

    private NhanVienDAO dao;
    
    public DoiMatKhau(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnDongY = new javax.swing.JButton();
        btnHuyBo = new javax.swing.JButton();
        txtXacNhanMKMoi = new com.edusys.textfield.PasswordField();
        txtTenDN = new com.edusys.textfield.TextField();
        txtMK = new com.edusys.textfield.PasswordField();
        txtMKMoi = new com.edusys.textfield.PasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(122, 120, 120));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(124, 115, 115));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ĐỔI MẬT KHẨU");

        btnDongY.setText("Đồng ý");
        btnDongY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongYActionPerformed(evt);
            }
        });

        btnHuyBo.setText("Hủy bỏ");
        btnHuyBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyBoActionPerformed(evt);
            }
        });

        txtXacNhanMKMoi.setForeground(new java.awt.Color(51, 51, 51));
        txtXacNhanMKMoi.setLabelText("Xác nhận mật khẩu mới");
        txtXacNhanMKMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXacNhanMKMoiActionPerformed(evt);
            }
        });
        txtXacNhanMKMoi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtXacNhanMKMoiKeyReleased(evt);
            }
        });

        txtTenDN.setForeground(new java.awt.Color(51, 51, 51));
        txtTenDN.setLabelText("Tên đăng nhập");
        txtTenDN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenDNKeyReleased(evt);
            }
        });

        txtMK.setForeground(new java.awt.Color(51, 51, 51));
        txtMK.setLabelText("Mật khẩu hiện tại");
        txtMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMKActionPerformed(evt);
            }
        });
        txtMK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMKKeyReleased(evt);
            }
        });

        txtMKMoi.setForeground(new java.awt.Color(51, 51, 51));
        txtMKMoi.setLabelText("Mật khẩu mới");
        txtMKMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMKMoiActionPerformed(evt);
            }
        });
        txtMKMoi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMKMoiKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)
                                .addComponent(txtXacNhanMKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTenDN, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(btnDongY)
                        .addGap(275, 275, 275)
                        .addComponent(btnHuyBo)))
                .addContainerGap(323, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenDN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtXacNhanMKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDongY)
                            .addComponent(btnHuyBo))
                        .addGap(272, 272, 272))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDongYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongYActionPerformed
        
    }//GEN-LAST:event_btnDongYActionPerformed

    private void txtXacNhanMKMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXacNhanMKMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtXacNhanMKMoiActionPerformed

    private void txtXacNhanMKMoiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtXacNhanMKMoiKeyReleased
    }//GEN-LAST:event_txtXacNhanMKMoiKeyReleased

    private void txtTenDNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenDNKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenDNKeyReleased

    private void txtMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMKActionPerformed

    private void txtMKKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMKKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMKKeyReleased

    private void txtMKMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMKMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMKMoiActionPerformed

    private void txtMKMoiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMKMoiKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMKMoiKeyReleased

    private void btnHuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyBoActionPerformed
        huyBo();
    }//GEN-LAST:event_btnHuyBoActionPerformed

    
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
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DoiMatKhau dialog = new DoiMatKhau(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnDongY;
    private javax.swing.JButton btnHuyBo;
    private javax.swing.JLabel jLabel1;
    private com.edusys.textfield.PasswordField txtMK;
    private com.edusys.textfield.PasswordField txtMKMoi;
    private com.edusys.textfield.TextField txtTenDN;
    private com.edusys.textfield.PasswordField txtXacNhanMKMoi;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.getContentPane().setBackground(Color.WHITE);
    }
    
    private void doiMatKhau() {
        String maNV = txtTenDN.getText();
        String matKhau = String.valueOf(txtMK.getPassword());
        String matKhauMoi = String.valueOf(txtMKMoi.getPassword());
        String xacNhanMKMoi = String.valueOf(txtXacNhanMKMoi.getPassword());
        
        if(!maNV.equalsIgnoreCase(Auth.user.getMaNV())) {
            // hiển thị sai tên đăng nhập
        } else if(!matKhau.equals(Auth.user.getMatKhau())) {
            // hiển thị sai mật khẩu
        } else if(!matKhauMoi.equals(xacNhanMKMoi)) {
            // hiển thị xác nhận mật khẩu đúng
        } else {
            Auth.user.setMatKhau(matKhauMoi);
            dao.update(Auth.user);
            // hiển thị đổi mật khẩu thành công
        }
    }

    private void huyBo() {
        this.dispose();
    }
}
