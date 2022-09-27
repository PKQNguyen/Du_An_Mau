package com.edusys.notificationframe;

import com.edusys.shadow.ShadowRenderer;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.JDialog;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class ImageAvartar extends javax.swing.JComponent {

    private JDialog dialog;
    private Animator animator;
    private final Frame fram;
    private boolean showing;
    private Thread thread;
    private int animate = 10;
    private BufferedImage imageShadow;
    private int shadowSize = 6;
    private Type type;
    private Location location;

    public ImageAvartar(Frame frame, Type type, Location location, String message) {
        this.fram = frame;
        this.type = type;
        this.location = location;
        initComponents();
        init(message);
        initAnimator();
    }

    private void init(String message) {
        setBackground(Color.WHITE);
        dialog = new JDialog(fram);
        dialog.setUndecorated(true);
        dialog.setFocusableWindowState(false);
        dialog.setBackground(new Color(0, 0, 0, 0));
        dialog.add(this);
        dialog.setSize(getPreferredSize());
        if (type == Type.SUCCESS) {
            lblcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/notification/success.png")));
            lblMessage.setText("Success");
        } else if (type == Type.INFO) {
            lblcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/notification/info.png")));
            lblMessage.setText("Info");
        } else {
            lblcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/notification/warrning.png")));
            lblMessage.setText("Warning");
        }
        lblMessageText.setText(message);
    }

    private void initAnimator() {
        TimingTarget target = new TimingTargetAdapter() {
            private int x;
            private int top;
            private boolean top_to_bot;

            @Override
            public void timingEvent(float fraction) {
                if (showing) {
                    float alpha = 1f - fraction;
                    int y = (int) ((1f - fraction) * animate);
                    if (top_to_bot) {
                        dialog.setLocation(x, top + y);
                    } else {
                        dialog.setLocation(x, top - y);
                    }
                    dialog.setOpacity(alpha);
                } else {
                    float alpha = fraction;
                    int y = (int) (fraction * animate);
                    if (top_to_bot) {
                        dialog.setLocation(x, top + y);
                    } else {
                        dialog.setLocation(x, top - y);
                    }
                    dialog.setOpacity(alpha);
                }
                repaint();
            }

            @Override
            public void begin() {
                if (!showing) {
                    dialog.setOpacity(0f);
                    int margin = 10;
                    int y = 0;
                    if (location == Location.TOP_CENTER) {
                        x = fram.getX() + ((fram.getWidth() - dialog.getWidth()) / 2);
                        y = fram.getY();
                        top_to_bot = true;
                    } else if (location == Location.TOP_RIGHT) {
                        x = fram.getX() + fram.getWidth() - dialog.getWidth() - margin;
                        y = fram.getY();
                        top_to_bot = true;
                    } else if (location == Location.TOP_LEFT) {
                        x = fram.getX() + margin;
                        y = fram.getY();
                        top_to_bot = true;
                    } else if (location == Location.BOTTOM_CENTER) {
                        x = fram.getX() + ((fram.getWidth() - dialog.getWidth())/ 2);
                        y = fram.getY() + fram.getHeight() - dialog.getHeight();
                        top_to_bot = false;
                    } else if(location == Location.BOTTOM_RIGHT) {
                        x = fram.getX() + fram.getWidth() - dialog.getWidth() - margin;
                        y = fram.getY() + fram.getHeight() - dialog.getHeight();
                        top_to_bot = false;
                    } else if(location == Location.BOTTOM_LEFT) {
                        x = fram.getX() + margin;
                        y = fram.getY() + fram.getHeight() - dialog.getHeight();
                        top_to_bot = false;
                    } 
                    top = y;
                    dialog.setLocation(x, y);
                    dialog.setVisible(true);

                }
            }

            @Override
            public void end() {
                showing = !showing;
                if (showing) {
                    thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            sleep();
                            closeNotification();
                        }
                    });
                    thread.start();
                } else {
                    dialog.dispose();
                }
            }

        };
        animator = new Animator(500, target);
        animator.setResolution(5);
    }

    public void showNotification() {
        animator.start();
    }

    private void closeNotification() {
        if (thread != null && thread.isAlive()) {
            thread.interrupt();
        }
        if (animator.isRunning()) {
            if (!showing) {
                animator.stop();
                showing = true;
                animator.start();
            }
        } else {
            showing = true;
            animator.start();
        }
    }

    private void sleep() {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
        }
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.drawImage(imageShadow, 0, 0, null);
        int x = shadowSize;
        int y = shadowSize;
        int width = getWidth() - shadowSize * 2;
        int height = getHeight() - shadowSize * 2;
        g2.fillRect(x, y, width, height);

        if (type == Type.SUCCESS) {
            g2.setColor(new Color(18, 163, 24));

        } else if (type == Type.INFO) {
            g2.setColor(new Color(28, 139, 206));
        } else {
            g2.setColor(new Color(241, 196, 15));
        }

        g2.fillRect(6, 5, 5, getHeight() - shadowSize * 2 + 1);
        g2.dispose();
        super.paint(g);
    }

    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);
        createImageShadow();
    }

    private void createImageShadow() {
        imageShadow = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = imageShadow.createGraphics();
        g2.drawImage(createShadow(), 0, 0, null);
        g2.dispose();
    }

    private BufferedImage createShadow() {
        BufferedImage img = new BufferedImage(getWidth() - shadowSize * 2, getHeight() - shadowSize * 2, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.fillRect(0, 0, img.getWidth(), img.getHeight());
        g2.dispose();
        return new ShadowRenderer(shadowSize, 0.3f, new Color(100, 100, 100)).createShadow(img);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        lblMessage = new javax.swing.JLabel();
        lblMessageText = new javax.swing.JLabel();
        lblcon = new javax.swing.JLabel();
        cmdClose = new javax.swing.JButton();
        panelGlowingGradient1 = new com.edusys.utils.PanelGlowingGradient();
        imageAvatar2 = new com.edusys.utils.ImageAvatar();
        jLabel4 = new javax.swing.JLabel();
        panelGlowingGradient2 = new com.edusys.utils.PanelGlowingGradient();
        imageAvatar3 = new com.edusys.utils.ImageAvatar();
        jLabel3 = new javax.swing.JLabel();
        panelGlowingGradient3 = new com.edusys.utils.PanelGlowingGradient();
        imageAvatar4 = new com.edusys.utils.ImageAvatar();
        jLabel2 = new javax.swing.JLabel();
        panelGlowingGradient4 = new com.edusys.utils.PanelGlowingGradient();
        imageAvatar5 = new com.edusys.utils.ImageAvatar();
        jLabel1 = new javax.swing.JLabel();
        panelGlowingGradient5 = new com.edusys.utils.PanelGlowingGradient();
        imageAvatar6 = new com.edusys.utils.ImageAvatar();
        jLabel5 = new javax.swing.JLabel();
        panelGlowingGradient6 = new com.edusys.utils.PanelGlowingGradient();
        imageAvatar7 = new com.edusys.utils.ImageAvatar();
        jLabel6 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        jPanel1.setBackground(new java.awt.Color(39, 39, 39));

        panel.setOpaque(false);

        lblMessage.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(127, 127, 127));
        lblMessage.setText("Message");

        lblMessageText.setForeground(new java.awt.Color(127, 127, 127));
        lblMessageText.setText("Message Text");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMessageText))
                .addGap(0, 195, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(lblMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessageText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/notification/success.png"))); // NOI18N
        lblcon.setToolTipText("");

        cmdClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/notification/close.png"))); // NOI18N
        cmdClose.setBorder(null);
        cmdClose.setContentAreaFilled(false);
        cmdClose.setFocusable(false);
        cmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCloseActionPerformed(evt);
            }
        });

        imageAvatar2.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/ThaiHoa.jpg"))); // NOI18N
        panelGlowingGradient1.add(imageAvatar2);
        imageAvatar2.setBounds(20, 20, 200, 137);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(218, 206, 206));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Võ Thái Hòa");
        panelGlowingGradient1.add(jLabel4);
        jLabel4.setBounds(20, 170, 210, 20);

        panelGlowingGradient2.setGradientColor1(new java.awt.Color(255, 255, 255));

        imageAvatar3.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/ChiCuong.jpg"))); // NOI18N
        panelGlowingGradient2.add(imageAvatar3);
        imageAvatar3.setBounds(20, 20, 210, 137);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(218, 206, 206));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nguyễn Chí Cường");
        panelGlowingGradient2.add(jLabel3);
        jLabel3.setBounds(20, 170, 210, 20);

        imageAvatar4.setGradientColor1(new java.awt.Color(255, 25, 236));
        imageAvatar4.setGradientColor2(new java.awt.Color(42, 32, 203));
        imageAvatar4.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/HuynhKhang.jpg"))); // NOI18N
        panelGlowingGradient3.add(imageAvatar4);
        imageAvatar4.setBounds(20, 20, 210, 137);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(218, 206, 206));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Huỳnh Bảo Khang");
        panelGlowingGradient3.add(jLabel2);
        jLabel2.setBounds(20, 170, 210, 20);

        imageAvatar5.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/HongTham.jpg"))); // NOI18N
        panelGlowingGradient4.add(imageAvatar5);
        imageAvatar5.setBounds(20, 20, 210, 137);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(218, 206, 206));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Trần Thị Hồng Thắm");
        panelGlowingGradient4.add(jLabel1);
        jLabel1.setBounds(20, 170, 210, 20);

        imageAvatar6.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/HongPhi.jpg"))); // NOI18N
        panelGlowingGradient5.add(imageAvatar6);
        imageAvatar6.setBounds(20, 20, 210, 137);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(218, 206, 206));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nguyễn Văn Hồng Phi");
        panelGlowingGradient5.add(jLabel5);
        jLabel5.setBounds(20, 170, 210, 20);

        imageAvatar7.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/VanVuong.jpg"))); // NOI18N
        panelGlowingGradient6.add(imageAvatar7);
        imageAvatar7.setBounds(20, 20, 210, 137);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(218, 206, 206));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Phạm Văn Vương");
        panelGlowingGradient6.add(jLabel6);
        jLabel6.setBounds(20, 170, 210, 20);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblcon, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelGlowingGradient3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelGlowingGradient4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(409, 409, 409)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelGlowingGradient2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelGlowingGradient5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(420, 420, 420)
                                .addComponent(panelGlowingGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(420, 420, 420)
                                .addComponent(panelGlowingGradient6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmdClose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelGlowingGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelGlowingGradient3, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                            .addComponent(panelGlowingGradient2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelGlowingGradient5, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(panelGlowingGradient4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGlowingGradient6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCloseActionPerformed
        closeNotification();
    }//GEN-LAST:event_cmdCloseActionPerformed

    public static enum Type {
        SUCCESS, INFO, WARNING
    }

    public static enum Location {
        TOP_CENTER, TOP_RIGHT, TOP_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT, BOTTOM_LEFT, CENTER
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdClose;
    private com.edusys.utils.ImageAvatar imageAvatar2;
    private com.edusys.utils.ImageAvatar imageAvatar3;
    private com.edusys.utils.ImageAvatar imageAvatar4;
    private com.edusys.utils.ImageAvatar imageAvatar5;
    private com.edusys.utils.ImageAvatar imageAvatar6;
    private com.edusys.utils.ImageAvatar imageAvatar7;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblMessageText;
    private javax.swing.JLabel lblcon;
    private javax.swing.JPanel panel;
    private com.edusys.utils.PanelGlowingGradient panelGlowingGradient1;
    private com.edusys.utils.PanelGlowingGradient panelGlowingGradient2;
    private com.edusys.utils.PanelGlowingGradient panelGlowingGradient3;
    private com.edusys.utils.PanelGlowingGradient panelGlowingGradient4;
    private com.edusys.utils.PanelGlowingGradient panelGlowingGradient5;
    private com.edusys.utils.PanelGlowingGradient panelGlowingGradient6;
    // End of variables declaration//GEN-END:variables
}
