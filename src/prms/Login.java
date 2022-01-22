
package prms;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Login extends javax.swing.JFrame {
    
    static String LogoLoc = "res/Brion Technological Systems3.png";
    static String CarbonLoc = "res/CVO9Y72-black-carbon-wallpaper.jpg";
    static String iconLoc = "res/icons8_user_130px_1.png";
    
    public Login() {
        initComponents();
        
        // CENTER POPUP WINDOW
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);        
        
        // CARBON FIBER BACKGROUND
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource(CarbonLoc));
        Image LoginBackground = icon.getImage();
        Image imgScale = LoginBackground.getScaledInstance(carbonFibrBackground.getWidth(), carbonFibrBackground.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        carbonFibrBackground.setIcon(scaledIcon);

        // COMPANY LOGO
        ImageIcon LoginArea = new ImageIcon(getClass().getClassLoader().getResource(LogoLoc));
        Image LoginA = LoginArea.getImage();
        Image LoginAScale = LoginA.getScaledInstance(BTSBillboardLogo.getWidth(), BTSBillboardLogo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaledLoginA = new ImageIcon(LoginAScale);
        BTSBillboardLogo.setIcon(ScaledLoginA);
        
        // BUTTONS
        
        // EXIT BUTTON
        
        LoginExit.setOpaque(false);
        LoginExit.setContentAreaFilled(false);
        LoginExit.setBorderPainted(false);
        LoginExit.setHorizontalAlignment(SwingConstants.CENTER);
        LoginExit.setIconTextGap(-2);
        
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

        javax.swing.JPanel LoginPanel = new javax.swing.JPanel();
        LoginUsername = new javax.swing.JTextField();
        LoginPassword = new javax.swing.JPasswordField();
        viewPicture = new javax.swing.JLabel();
        viewName = new javax.swing.JLabel();
        viewNameBlank = new javax.swing.JLabel();
        UsernameText = new javax.swing.JLabel();
        PasswordText = new javax.swing.JLabel();
        PRMSTitleMainText = new javax.swing.JLabel();
        PRMSTitleMainText1 = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        Registration = new javax.swing.JButton();
        loginDesign = new javax.swing.JLabel();
        loginSign = new javax.swing.JLabel();
        carbonFibrBackground = new javax.swing.JLabel();
        MinimizerBtn = new javax.swing.JButton();
        LoginExit = new javax.swing.JButton();
        BTSBillboardLogo = new javax.swing.JLabel();
        BTSTitleMainText = new javax.swing.JLabel();
        BTSTitleShadowText = new javax.swing.JLabel();
        FrameDrag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Brion Tactical Systems : PRMS Database");
        setBackground(null
        );
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("LoginFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        LoginPanel.setBackground(new java.awt.Color(0, 0, 32));
        LoginPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 208, 0), 1, true));
        LoginPanel.setMinimumSize(new java.awt.Dimension(600, 400));
        LoginPanel.setPreferredSize(new java.awt.Dimension(600, 400));
        LoginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginUsername.setBackground(new java.awt.Color(255, 255, 255));
        LoginUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LoginUsername.setForeground(new java.awt.Color(0, 0, 0));
        LoginUsername.setToolTipText("Enter your Username");
        LoginUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        LoginUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        LoginUsername.setSelectionColor(new java.awt.Color(255, 208, 0));
        LoginUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginUsernameActionPerformed(evt);
            }
        });
        LoginUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoginUsernameKeyPressed(evt);
            }
        });
        LoginPanel.add(LoginUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 160, 35));

        LoginPassword.setBackground(new java.awt.Color(255, 255, 255));
        LoginPassword.setForeground(new java.awt.Color(0, 0, 0));
        LoginPassword.setToolTipText("Enter your Password");
        LoginPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        LoginPassword.setSelectionColor(new java.awt.Color(255, 208, 0));
        LoginPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginPasswordActionPerformed(evt);
            }
        });
        LoginPanel.add(LoginPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 160, 35));

        viewPicture.setBackground(new java.awt.Color(255, 255, 255));
        viewPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_user_130px_1.png"))); // NOI18N
        viewPicture.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        viewPicture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewPicture.setOpaque(true);
        LoginPanel.add(viewPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 130, 130));

        viewName.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        viewName.setForeground(new java.awt.Color(255, 255, 255));
        viewName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewName.setAlignmentX(0.5F);
        LoginPanel.add(viewName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 310, 30));

        viewNameBlank.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        viewNameBlank.setForeground(new java.awt.Color(255, 255, 255));
        viewNameBlank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewNameBlank.setText("______________________________");
        viewNameBlank.setAlignmentX(0.5F);
        LoginPanel.add(viewNameBlank, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 310, 30));

        UsernameText.setBackground(new java.awt.Color(0, 8, 138));
        UsernameText.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        UsernameText.setForeground(new java.awt.Color(255, 255, 255));
        UsernameText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsernameText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/UsernameIcon.png"))); // NOI18N
        UsernameText.setText("USERNAME  : ");
        LoginPanel.add(UsernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 130, 35));

        PasswordText.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        PasswordText.setForeground(new java.awt.Color(255, 255, 255));
        PasswordText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/PasswordIcon.png"))); // NOI18N
        PasswordText.setText("PASSWORD : ");
        LoginPanel.add(PasswordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 130, 35));

        PRMSTitleMainText.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        PRMSTitleMainText.setForeground(new java.awt.Color(255, 255, 255));
        PRMSTitleMainText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PRMSTitleMainText.setText("POLICE RECORD MANAGEMENT SYSTEM");
        PRMSTitleMainText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LoginPanel.add(PRMSTitleMainText, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 370, 30));

        PRMSTitleMainText1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        PRMSTitleMainText1.setForeground(new java.awt.Color(0, 0, 0));
        PRMSTitleMainText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PRMSTitleMainText1.setText("POLICE RECORD MANAGEMENT SYSTEM");
        PRMSTitleMainText1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LoginPanel.add(PRMSTitleMainText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 370, 40));

        LoginButton.setBackground(new java.awt.Color(0, 0, 32));
        LoginButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/SelectedLoginIcon.png"))); // NOI18N
        LoginButton.setText("Login");
        LoginButton.setToolTipText("Login to the Database");
        LoginButton.setBorder(new javax.swing.border.MatteBorder(null));
        LoginButton.setDefaultCapable(false);
        LoginButton.setDoubleBuffered(true);
        LoginButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/res/LoginIcon.png"))); // NOI18N
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        LoginPanel.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 100, 40));

        Registration.setBackground(new java.awt.Color(1, 0, 32));
        Registration.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Registration.setForeground(new java.awt.Color(255, 255, 255));
        Registration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_add_user_male_32px_1.png"))); // NOI18N
        Registration.setText("Create Account");
        Registration.setToolTipText("Create Account");
        Registration.setBorder(new javax.swing.border.MatteBorder(null));
        Registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationActionPerformed(evt);
            }
        });
        LoginPanel.add(Registration, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 170, 40));

        loginDesign.setBackground(new java.awt.Color(255, 208, 0));
        loginDesign.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginDesign.setOpaque(true);
        LoginPanel.add(loginDesign, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 10, 50));

        loginSign.setBackground(new java.awt.Color(32, 32, 32));
        loginSign.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        loginSign.setForeground(new java.awt.Color(255, 255, 255));
        loginSign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginSign.setText("LOGIN ");
        loginSign.setOpaque(true);
        LoginPanel.add(loginSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 50));
        LoginPanel.add(carbonFibrBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 470));

        MinimizerBtn.setBackground(new java.awt.Color(60, 63, 65));
        MinimizerBtn.setForeground(new java.awt.Color(60, 63, 65));
        MinimizerBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_minimize_window_32px.png"))); // NOI18N
        MinimizerBtn.setToolTipText("Exit");
        MinimizerBtn.setAlignmentY(0.0F);
        MinimizerBtn.setBorder(null);
        MinimizerBtn.setBorderPainted(false);
        MinimizerBtn.setName(""); // NOI18N
        MinimizerBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_minimize_window_32px_2.png"))); // NOI18N
        MinimizerBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_minimize_window_32px_1.png"))); // NOI18N
        MinimizerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizerBtnActionPerformed(evt);
            }
        });
        LoginPanel.add(MinimizerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 30, 30));

        LoginExit.setBackground(new java.awt.Color(60, 63, 65));
        LoginExit.setForeground(new java.awt.Color(60, 63, 65));
        LoginExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_x_coordinate_32px_1.png"))); // NOI18N
        LoginExit.setToolTipText("Exit");
        LoginExit.setAlignmentY(0.0F);
        LoginExit.setBorder(null);
        LoginExit.setBorderPainted(false);
        LoginExit.setName(""); // NOI18N
        LoginExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_x_coordinate_32px_2.png"))); // NOI18N
        LoginExit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_x_coordinate_32px.png"))); // NOI18N
        LoginExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginExitActionPerformed(evt);
            }
        });
        LoginPanel.add(LoginExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 30, 30));

        BTSBillboardLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BTSBillboardLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LoginPanel.add(BTSBillboardLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 370, 370));

        BTSTitleMainText.setFont(new java.awt.Font("Iron Shark", 0, 18)); // NOI18N
        BTSTitleMainText.setForeground(new java.awt.Color(255, 208, 0));
        BTSTitleMainText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTSTitleMainText.setText("BRION TACTICAL SYSTEMS");
        BTSTitleMainText.setToolTipText("");
        BTSTitleMainText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LoginPanel.add(BTSTitleMainText, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 380, 20));

        BTSTitleShadowText.setFont(new java.awt.Font("Iron Shark", 0, 18)); // NOI18N
        BTSTitleShadowText.setForeground(new java.awt.Color(0, 0, 0));
        BTSTitleShadowText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTSTitleShadowText.setText("BRION TACTICAL SYSTEMS");
        BTSTitleShadowText.setToolTipText("");
        BTSTitleShadowText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LoginPanel.add(BTSTitleShadowText, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 380, 30));

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
        LoginPanel.add(FrameDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // LOGIN PASSWORD ENTRY ( JPasswordField )
    private void LoginPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginPasswordActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_LoginPasswordActionPerformed
        
    
    // LOGIN BUTTON ( JButton )
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        
        String username = LoginUsername.getText();
        String password = String.valueOf(LoginPassword.getPassword());
        
        if(username.isEmpty() || password.isEmpty()){
            viewName.setText("LOGIN FIELDS ARE EMPTY!");
        }else{
            // start the login process.
            userLogin(username, password);
            
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    // LOGIN USERNAME ENTRY ( JTextfield )
    // POLICE PICTURE RETRIEVER
    // DISPLAY NAME ( JTextfield ) && STRING CONCATENATION
    // CONNECTED TO MYSQL DATABASE
    String retrieve = null;
    private void LoginUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginUsernameActionPerformed
        // TODO add your handling code here:
        Connection conn = DBConnection.connectDB();
        if(conn != null){
            try{
                String username = LoginUsername.getText();
                PreparedStatement ps = (PreparedStatement) conn.prepareStatement("SELECT userPicture, firstname, middlename, lastname, rank FROM policedatabaseaccounts WHERE username = ?");
                ps.setString(1, username);
   
                ResultSet rs = ps.executeQuery();
                
                if(rs.next()){
                    byte[] imageBytes = rs.getBytes("userPicture");
                    String fname = rs.getString("firstname");
                    String mname = rs.getString("middlename");
                    String lname = rs.getString("lastname");
                    String rank = rs.getString("rank");
                    
                    String conCat = rank+" : " + fname+" " + mname+" " + lname;
                    String upperCase = conCat.toUpperCase();
                    viewName.setText(upperCase);

                    ImageIcon imageIcon = new ImageIcon(imageBytes);
                    Image imagePicture = imageIcon.getImage();
                    Image resizeImage = imagePicture.getScaledInstance(130,130, Image.SCALE_SMOOTH);
                    ImageIcon myPicture = new ImageIcon(resizeImage);
                    viewPicture.setIcon(myPicture);

                }else if(username.isEmpty()){
                    ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource(iconLoc));
                    Image imagePicture = imageIcon.getImage();

                    Image resizeImage = imagePicture.getScaledInstance(130,130, Image.SCALE_SMOOTH);
                    ImageIcon myPicture = new ImageIcon(resizeImage);
                    viewPicture.setIcon(myPicture);
                    viewName.setText("USERNAME FIELD IS EMPTY!");
                    
                }else{
                    ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource(iconLoc));
                    Image imagePicture = imageIcon.getImage();
                    Image resizeImage = imagePicture.getScaledInstance(130,130, Image.SCALE_SMOOTH);
                    ImageIcon myPicture = new ImageIcon(resizeImage);
                    viewPicture.setIcon(myPicture);
                    viewName.setText("USER NOT FOUND!");

                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
             System.out.println("Police Database connection Unavailable! Check your JDBC Connector");
            JOptionPane.showMessageDialog(this, "Police database connection unavailable!\r\n"
               + "Please Check your JDBC Connector!", "POLICE DATABASE", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_LoginUsernameActionPerformed

    
    // CREATE ACCOUNT BUTTON ( JButton )
    private void RegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrationActionPerformed
        // TODO add your handling code here:
        dispose();
        JOptionPane.showMessageDialog(this, "Only the BTS development team can access this for signing police personel.\r\n"
                        + "Please contact your database supervisor and the BTS development team for adding additional\r\n"
                        + "police personel accounts.", "PRMS DATABASE", JOptionPane.INFORMATION_MESSAGE);
        AuthenticationForRegistration rUser = new AuthenticationForRegistration();
        rUser.setTitle("Brion Tactical Systems : PRMS DATABASE (Authentication)");
        rUser.setLocationRelativeTo(null);
        rUser.setVisible(true);
    }//GEN-LAST:event_RegistrationActionPerformed

    
    // EXIT BUTTON
    private void LoginExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_LoginExitActionPerformed

    
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

    
    // ENTER BUTTON ON LOGIN USERNAME to LOGIN PASSWORD ( JTextField )
    private void LoginUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginUsernameKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if(key == 10){
            LoginPassword.requestFocus();
        }
    }//GEN-LAST:event_LoginUsernameKeyPressed

    
    // MINIMIZE BUTTON CODE
    private void MinimizerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizerBtnActionPerformed
        // TODO add your handling code here:
        setState(Login.ICONIFIED);
    }//GEN-LAST:event_MinimizerBtnActionPerformed
    

    // MAIN METHOD
    public static void main(String args[]) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        // LOADING SCREEN................
        SplashScreen wel = new SplashScreen();
        wel.setTitle("Brion Tactical Systems");
        wel.setVisible(true);
        
        /*/File file = new File("C:\\Users\\Brion\\Documents\\NetBeansProjects\\PRMS\\Voice\\BTS.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);/*/

        Login login = new Login();
        try {
            for( int i=0;i<101;i++){ 
                Thread.sleep(5 * 10);
                if(i == 20){ 
                    //clip.start();
                    
                }
                switch (i) {
                    
                    case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 -> wel.Status.setText("Booting system        | " +Integer.toString(i)+"%");
                    case 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 -> wel.Status.setText("Loading modules       | " +Integer.toString(i)+"%");
                    case 30, 31, 32, 33, 34, 35, 36, 37, 38, 39 -> wel.Status.setText("Booting database      | " +Integer.toString(i)+"%");
                    case 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 -> wel.Status.setText("Loading system files  | " +Integer.toString(i)+"%");
                    case 50, 51, 52, 53, 54, 55, 56, 57, 58, 59 -> wel.Status.setText("Checking files        | " +Integer.toString(i)+"%");
                    case 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79 -> wel.Status.setText("Starting System       | " +Integer.toString(i)+"%");
                    case 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101 -> wel.Status.setText("Booting Login Screen  | " +Integer.toString(i)+"%");
                    default -> {
                    }
                }
                wel.Loading.setValue(i);        // Loading is a name of progressbar
            }
        } catch (InterruptedException e) {
        }
        
        // DELAY BEFORE LOGIN POP UP WINDOW
        try {
        
        Thread.sleep(7 * 1000);
        wel.setVisible(false);
        login.setTitle("Brion Tactical Systems : PRMS DATABASE");
        login.setVisible(true);
        Runtime.getRuntime().exec("cmd /c C:\\wamp64\\wampmanager.exe");
        wel.dispose();
        
        } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BTSBillboardLogo;
    private javax.swing.JLabel BTSTitleMainText;
    private javax.swing.JLabel BTSTitleShadowText;
    private javax.swing.JLabel FrameDrag;
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton LoginExit;
    public static javax.swing.JPasswordField LoginPassword;
    public static javax.swing.JTextField LoginUsername;
    private javax.swing.JButton MinimizerBtn;
    private javax.swing.JLabel PRMSTitleMainText;
    private javax.swing.JLabel PRMSTitleMainText1;
    private javax.swing.JLabel PasswordText;
    private javax.swing.JButton Registration;
    private javax.swing.JLabel UsernameText;
    private javax.swing.JLabel carbonFibrBackground;
    private javax.swing.JLabel loginDesign;
    private javax.swing.JLabel loginSign;
    public static javax.swing.JLabel viewName;
    private javax.swing.JLabel viewNameBlank;
    private javax.swing.JLabel viewPicture;
    // End of variables declaration//GEN-END:variables
    
    
    // CONNECTION TO DATABASE
    private void userLogin(String username, String password) {
        Connection dbconn = DBConnection.connectDB();
        if(dbconn != null){
            try {
                PreparedStatement st = (PreparedStatement)
                        dbconn.prepareStatement("SELECT * FROM policedatabaseaccounts WHERE username = ? AND password = ?");

                        st.setString(1, username);
                        st.setString(2, password);

                        ResultSet account = st.executeQuery();
                        LoginUsername.setText("");
                        LoginPassword.setText("");
                        
                        if(account.next()){
                            String type = account.getString("userType");
                            if(type.equals("Dispatcher")){
                                dispose();
                                PRMSDispatcherGUI bravo = new PRMSDispatcherGUI();
                                bravo.setTitle("Brion Tactical Systems : PRMS DATABASE (DISPATCHER)");
                                
                                byte[] imageBytes = account.getBytes("userPicture");
                                String fname = account.getString("firstname");
                                String mname = account.getString("middlename");
                                String lname = account.getString("lastname");
                                String rank = account.getString("rank");
                                String age = account.getString("age");
                                String address = account.getString("address");
                                String contact = account.getString("contactnumber");
                                String station = account.getString("station");
                                String userAcc = account.getString("username");
                                
                                String conCat = fname+" " + mname+" " + lname;
                                String upperCase = conCat.toUpperCase();
                                PRMSDispatcherGUI.viewProfileName.setText(upperCase);
                                PRMSDispatcherGUI.polAge.setText(age);
                                PRMSDispatcherGUI.polAddress.setText(address);
                                PRMSDispatcherGUI.polContact.setText(contact);
                                PRMSDispatcherGUI.polStation.setText(station);
                                PRMSDispatcherGUI.polRank.setText(rank);
                                PRMSDispatcherGUI.polUsername.setText(userAcc);
                                
                                ImageIcon imageIcon = new ImageIcon(imageBytes);
                                Image imagePicture = imageIcon.getImage();
                                Image resizeImage = imagePicture.getScaledInstance(130,130, Image.SCALE_SMOOTH);
                                ImageIcon myPicture = new ImageIcon(resizeImage);
                                PRMSDispatcherGUI.viewProfilePic.setIcon(myPicture);
                                
                                bravo.setVisible(true);
                                
                            }else if(type.equals("Police Officer")){
                                dispose();
                                PRMSOfficerGUI bravo = new PRMSOfficerGUI();
                                bravo.setTitle("Brion Tactical Systems : PRMS DATABASE (POLICE OFFICER)");
                                
                                byte[] imageBytes = account.getBytes("userPicture");
                                String fname = account.getString("firstname");
                                String mname = account.getString("middlename");
                                String lname = account.getString("lastname");
                                String rank = account.getString("rank");
                                String age = account.getString("age");
                                String address = account.getString("address");
                                String contact = account.getString("contactnumber");
                                String station = account.getString("station");
                                String userAcc = account.getString("username");
                                
                                String conCat = fname+" " + mname+" " + lname;
                                String upperCase = conCat.toUpperCase();
                                PRMSOfficerGUI.viewProfileName.setText(upperCase);
                                PRMSOfficerGUI.polAge.setText(age);
                                PRMSOfficerGUI.polAddress.setText(address);
                                PRMSOfficerGUI.polContact.setText(contact);
                                PRMSOfficerGUI.polStation.setText(station);
                                PRMSOfficerGUI.polRank.setText(rank);
                                PRMSOfficerGUI.polUsername.setText(userAcc);
                                
                                ImageIcon imageIcon = new ImageIcon(imageBytes);
                                Image imagePicture = imageIcon.getImage();
                                Image resizeImage = imagePicture.getScaledInstance(130,130, Image.SCALE_SMOOTH);
                                ImageIcon myPicture = new ImageIcon(resizeImage);
                                PRMSOfficerGUI.viewProfilePic.setIcon(myPicture);
                                
                                bravo.setVisible(true);
                            }else{
                                
                            }   
                        }else{
                            System.out.println("username " + username);
                            System.out.println("password " + password);
                            JOptionPane.showMessageDialog(this, "The Username and Password you have entered\r\n"
                                    + "did not match any of our records in the database.", "PRMS DATABASE", JOptionPane.INFORMATION_MESSAGE);
                        }
            } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Police Database connection Unavailable! Check your JDBC Connector");
            JOptionPane.showMessageDialog(this, "Police database connection unavailable!\r\n"
               + "Please Check your JDBC Connector!", "POLICE DATABASE", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
