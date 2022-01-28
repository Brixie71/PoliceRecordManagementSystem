
package prms;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import static prms.Login.IronShark;
import static prms.Login.LogoLoc;

public class AuthenticationForRegistration extends javax.swing.JFrame {
    
    
    public AuthenticationForRegistration() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
        // BTS LOGO
        ImageIcon BTSLogoReg = new ImageIcon(getClass().getClassLoader().getResource(LogoLoc));
        Image logo = BTSLogoReg.getImage();
        Image LogoRegScale = logo.getScaledInstance(BTSLogoRegistration.getWidth(), BTSLogoRegistration.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledLogo = new ImageIcon(LogoRegScale);
        BTSLogoRegistration.setIcon(scaledLogo);
        
        // EXIT BUTTON
        AuthExit.setOpaque(false);
        AuthExit.setContentAreaFilled(false);
        AuthExit.setBorderPainted(false);
        AuthExit.setHorizontalAlignment(SwingConstants.CENTER);
        AuthExit.setIconTextGap(-2);
        
        // Back to Login
        backToLogin.setOpaque(false);
        backToLogin.setContentAreaFilled(false);
        backToLogin.setBorderPainted(false);
        backToLogin.setHorizontalAlignment(SwingConstants.CENTER);
        backToLogin.setIconTextGap(-2);
        
        // MINIMIZE BUTTON
        MinimizerBtn.setOpaque(false);
        MinimizerBtn.setContentAreaFilled(false);
        MinimizerBtn.setBorderPainted(false);
        MinimizerBtn.setHorizontalAlignment(SwingConstants.CENTER);
        MinimizerBtn.setIconTextGap(-2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        AuthUsername = new javax.swing.JTextField();
        AuthPassword = new javax.swing.JPasswordField();
        AuthEnterRegistration = new javax.swing.JButton();
        MinimizerBtn = new javax.swing.JButton();
        backToLogin = new javax.swing.JButton();
        AuthExit = new javax.swing.JButton();
        FrameDrag = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RegistrationMainText = new javax.swing.JLabel();
        RegistrationShadowText = new javax.swing.JLabel();
        BTSLogoRegistration = new javax.swing.JLabel();
        BTSRegTitle = new javax.swing.JLabel();
        BTSRegShadow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 0, 32));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 208, 0), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AuthUsername.setBackground(new java.awt.Color(255, 255, 255));
        AuthUsername.setForeground(new java.awt.Color(0, 0, 0));
        AuthUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        AuthUsername.setSelectionColor(new java.awt.Color(255, 208, 0));
        AuthUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthUsernameActionPerformed(evt);
            }
        });
        jPanel2.add(AuthUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 190, 30));

        AuthPassword.setBackground(new java.awt.Color(255, 255, 255));
        AuthPassword.setForeground(new java.awt.Color(0, 0, 0));
        AuthPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        AuthPassword.setSelectionColor(new java.awt.Color(255, 208, 0));
        AuthPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(AuthPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 190, 30));

        AuthEnterRegistration.setText("Enter Signup");
        AuthEnterRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthEnterRegistrationActionPerformed(evt);
            }
        });
        jPanel2.add(AuthEnterRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, 30));

        MinimizerBtn.setBackground(new java.awt.Color(60, 63, 65));
        MinimizerBtn.setForeground(new java.awt.Color(60, 63, 65));
        MinimizerBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_minimize_window_32px.png"))); // NOI18N
        MinimizerBtn.setToolTipText("Exit");
        MinimizerBtn.setAlignmentY(0.0F);
        MinimizerBtn.setBorder(null);
        MinimizerBtn.setBorderPainted(false);
        MinimizerBtn.setName(""); // NOI18N
        MinimizerBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_minimize_window_32px_1.png"))); // NOI18N
        MinimizerBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_minimize_window_32px_2.png"))); // NOI18N
        MinimizerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizerBtnActionPerformed(evt);
            }
        });
        jPanel2.add(MinimizerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 30, 30));

        backToLogin.setBackground(new java.awt.Color(60, 63, 65));
        backToLogin.setForeground(new java.awt.Color(60, 63, 65));
        backToLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_back_to_32px_2.png"))); // NOI18N
        backToLogin.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_back_to_32px_1.png"))); // NOI18N
        backToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToLoginActionPerformed(evt);
            }
        });
        jPanel2.add(backToLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        AuthExit.setBackground(new java.awt.Color(60, 63, 65));
        AuthExit.setForeground(new java.awt.Color(60, 63, 65));
        AuthExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_x_coordinate_32px_1.png"))); // NOI18N
        AuthExit.setToolTipText("Exit");
        AuthExit.setAlignmentY(0.0F);
        AuthExit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AuthExit.setBorderPainted(false);
        AuthExit.setName(""); // NOI18N
        AuthExit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_x_coordinate_32px.png"))); // NOI18N
        AuthExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_x_coordinate_32px_2.png"))); // NOI18N
        AuthExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthExitActionPerformed(evt);
            }
        });
        jPanel2.add(AuthExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 30, 30));

        FrameDrag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FrameDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FrameDragMouseDragged(evt);
            }
        });
        FrameDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FrameDragMousePressed(evt);
            }
        });
        jPanel2.add(FrameDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 260));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USERNAME  :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 90, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("KEY :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 40, 30));

        RegistrationMainText.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        RegistrationMainText.setForeground(new java.awt.Color(255, 255, 255));
        RegistrationMainText.setText("REGISTRATION LOCK");
        jPanel2.add(RegistrationMainText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 270, -1));

        RegistrationShadowText.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        RegistrationShadowText.setForeground(new java.awt.Color(0, 0, 0));
        RegistrationShadowText.setText("REGISTRATION LOCK");
        jPanel2.add(RegistrationShadowText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 270, 40));

        BTSLogoRegistration.setText("BTSLogo");
        jPanel2.add(BTSLogoRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 110, 100));

        try{
            IronShark = Font.createFont(Font.TRUETYPE_FONT, new File("src\\res\\Iron-Shark.ttf")).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT,new File("src\\res\\Iron-Shark.ttf")));

        }catch(IOException | FontFormatException e){

        }
        BTSRegTitle.setText("BRION TACTICAL SYSTEMS");
        BTSRegTitle.setFont(IronShark);
        BTSRegTitle.setForeground(new Color(255,208,0));
        jPanel2.add(BTSRegTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 270, 20));

        try{
            IronShark = Font.createFont(Font.TRUETYPE_FONT, new File("src\\res\\Iron-Shark.ttf")).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT,new File("src\\res\\Iron-Shark.ttf")));

        }catch(IOException | FontFormatException e){

        }
        BTSRegShadow.setText("BRION TACTICAL SYSTEMS");
        BTSRegShadow.setFont(IronShark);
        BTSRegShadow.setForeground(new Color(0,0,0));
        jPanel2.add(BTSRegShadow, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 15, 270, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AuthUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthUsernameActionPerformed

    }//GEN-LAST:event_AuthUsernameActionPerformed

    private void AuthEnterRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthEnterRegistrationActionPerformed
        // TODO add your handling code here:
        String username = AuthUsername.getText();
        String password = String.valueOf(AuthPassword.getPassword());
        
        if(username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Username and Password should not be Empty!\r\n"
                    + "Note : Creating an Account for Police Personel can only be done by the BTS Dev Team\r\n"
                    + "and your respective Police PRMS Adminstrator.  ", "POLICE DATABASE", JOptionPane.ERROR_MESSAGE);
        }else{
            // start the login process.
            AuthLogin(username , password);            
        }
    }//GEN-LAST:event_AuthEnterRegistrationActionPerformed

    private void backToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToLoginActionPerformed
        // TODO add your handling code here:
        dispose();
        Login returnToLogin = new Login();
        returnToLogin.setTitle("Brion Tactical Systems : PRMS DATABASE");
        returnToLogin.setLocationRelativeTo(null);
        returnToLogin.setVisible(true);

    }//GEN-LAST:event_backToLoginActionPerformed

    private void AuthPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AuthPasswordActionPerformed

    private void AuthExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthExitActionPerformed
        // TODO add your handling code here:
        dispose();

    }//GEN-LAST:event_AuthExitActionPerformed
    
    // FRAME DRAGGER
    int xMouse;
    int yMouse;
    private void FrameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_FrameDragMouseDragged

    private void FrameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_FrameDragMousePressed

    private void MinimizerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizerBtnActionPerformed
        // TODO add your handling code here:
        setState(AuthenticationForRegistration.ICONIFIED);
    }//GEN-LAST:event_MinimizerBtnActionPerformed
    
    
    // MAIN METHOD
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthenticationForRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AuthenticationForRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AuthEnterRegistration;
    private javax.swing.JButton AuthExit;
    private javax.swing.JPasswordField AuthPassword;
    private javax.swing.JTextField AuthUsername;
    private javax.swing.JLabel BTSLogoRegistration;
    private javax.swing.JLabel BTSRegShadow;
    private javax.swing.JLabel BTSRegTitle;
    private javax.swing.JLabel FrameDrag;
    private javax.swing.JButton MinimizerBtn;
    private javax.swing.JLabel RegistrationMainText;
    private javax.swing.JLabel RegistrationShadowText;
    private javax.swing.JButton backToLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    
    // SECUTITY LOGIN TO REGISTRATION WINDOW
    private void AuthLogin(String username, String password) {
        try{
            if(username.equals("BTSDevelopmentTeam2021") && password.equals("BravoTangoSierraDeltaTango2021")){
                dispose();
                Registration AuthSuccess = new Registration();
                AuthSuccess.setTitle("Brion Tactical Systems : PRMS DATABASE");
                AuthSuccess.setLocationRelativeTo(null);
                AuthSuccess.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this, "Username and Password is Wrong!\r\n"
                    + "Note : Signing of police personel can only be done by the BTS development team!\r\n"
                    + "Please contact the BTS development team for more information. ", "POLICE DATABASE", JOptionPane.ERROR_MESSAGE);
            }
        } catch (HeadlessException ex) {
        Logger.getLogger(AuthenticationForRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}   
