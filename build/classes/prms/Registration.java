
package prms;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import static prms.Login.LogoLoc;

public class Registration extends javax.swing.JFrame {
    public Registration() {
        initComponents();
        
        // CENTER POP UP WINDOW
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
        // REGISTRATION BTS BILLBOARD LOGO
        ImageIcon BTSLogoReg = new ImageIcon(getClass().getClassLoader().getResource(LogoLoc));
        Image logo = BTSLogoReg.getImage();
        Image LogoRegScale = logo.getScaledInstance(BTSLogoRegistration.getWidth(), BTSLogoRegistration.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledLogo = new ImageIcon(LogoRegScale);
        BTSLogoRegistration.setIcon(scaledLogo);
        
        // EXIT BUTTON
        RegistrationExit.setOpaque(false);
        RegistrationExit.setContentAreaFilled(false);
        RegistrationExit.setBorderPainted(false);
        RegistrationExit.setHorizontalAlignment(SwingConstants.CENTER);
        RegistrationExit.setIconTextGap(-2);
        
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        javax.swing.JPanel RegistrationPanel = new javax.swing.JPanel();
        station = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        middlename = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        rank = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        contactnumber = new javax.swing.JTextField();
        LoginPassword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        createAccountButton = new javax.swing.JButton();
        LoginUsername = new javax.swing.JTextField();
        userType = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        MinimizerBtn = new javax.swing.JButton();
        backToLogin = new javax.swing.JButton();
        RegistrationExit = new javax.swing.JButton();
        BTSTitleMainText = new javax.swing.JLabel();
        BTSShadowText = new javax.swing.JLabel();
        RegistrationMainText = new javax.swing.JLabel();
        RegistrationShadowText = new javax.swing.JLabel();
        BTSLogoRegistration = new javax.swing.JLabel();
        FrameDrag = new javax.swing.JLabel();
        userPicture = new javax.swing.JLabel();
        ImageChooser = new javax.swing.JButton();
        modifyAccount = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        RegistrationPanel.setBackground(new java.awt.Color(32, 32, 32));
        RegistrationPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 208, 0), 1, true));
        RegistrationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        station.setBackground(new java.awt.Color(255, 255, 255));
        station.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        station.setForeground(new java.awt.Color(0, 0, 0));
        station.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        station.setSelectionColor(new java.awt.Color(255, 208, 0));
        station.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stationActionPerformed(evt);
            }
        });
        RegistrationPanel.add(station, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 170, 30));

        firstname.setBackground(new java.awt.Color(255, 255, 255));
        firstname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        firstname.setForeground(new java.awt.Color(0, 0, 0));
        firstname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        firstname.setSelectionColor(new java.awt.Color(255, 208, 0));
        firstname.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                firstnamePropertyChange(evt);
            }
        });
        RegistrationPanel.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 250, 30));

        middlename.setBackground(new java.awt.Color(255, 255, 255));
        middlename.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        middlename.setForeground(new java.awt.Color(0, 0, 0));
        middlename.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        middlename.setSelectionColor(new java.awt.Color(255, 208, 0));
        RegistrationPanel.add(middlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 250, 30));

        address.setBackground(new java.awt.Color(255, 255, 255));
        address.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        address.setForeground(new java.awt.Color(0, 0, 0));
        address.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        address.setSelectionColor(new java.awt.Color(255, 208, 0));
        RegistrationPanel.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 530, 30));

        rank.setBackground(new java.awt.Color(255, 255, 255));
        rank.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rank.setForeground(new java.awt.Color(0, 0, 0));
        rank.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        rank.setSelectionColor(new java.awt.Color(255, 208, 0));
        RegistrationPanel.add(rank, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 180, 30));

        lastname.setBackground(new java.awt.Color(255, 255, 255));
        lastname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lastname.setForeground(new java.awt.Color(0, 0, 0));
        lastname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        lastname.setSelectionColor(new java.awt.Color(255, 208, 0));
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        RegistrationPanel.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 250, 30));

        age.setBackground(new java.awt.Color(255, 255, 255));
        age.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        age.setForeground(new java.awt.Color(0, 0, 0));
        age.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        age.setSelectionColor(new java.awt.Color(255, 208, 0));
        RegistrationPanel.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 50, 30));

        contactnumber.setBackground(new java.awt.Color(255, 255, 255));
        contactnumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        contactnumber.setForeground(new java.awt.Color(0, 0, 0));
        contactnumber.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        contactnumber.setSelectionColor(new java.awt.Color(255, 208, 0));
        RegistrationPanel.add(contactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 130, 30));

        LoginPassword.setBackground(new java.awt.Color(255, 255, 255));
        LoginPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LoginPassword.setForeground(new java.awt.Color(0, 0, 0));
        LoginPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        LoginPassword.setSelectionColor(new java.awt.Color(255, 208, 0));
        LoginPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginPasswordActionPerformed(evt);
            }
        });
        RegistrationPanel.add(LoginPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 190, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Home Address :");
        RegistrationPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Police Database Account Previleges :");
        RegistrationPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 300, 230, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Middle Name : ");
        RegistrationPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Police Rank :");
        RegistrationPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("First Name     :");
        RegistrationPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Police Station :");
        RegistrationPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Last Name     :");
        RegistrationPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Age : ");
        RegistrationPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contact Number :");
        RegistrationPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Username :");
        RegistrationPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Password  :");
        RegistrationPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, 30));

        createAccountButton.setBackground(new java.awt.Color(0, 0, 32));
        createAccountButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        createAccountButton.setForeground(new java.awt.Color(255, 255, 255));
        createAccountButton.setText("Create Account");
        createAccountButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        createAccountButton.setOpaque(true);
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });
        RegistrationPanel.add(createAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 130, 30));

        LoginUsername.setBackground(new java.awt.Color(255, 255, 255));
        LoginUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LoginUsername.setForeground(new java.awt.Color(0, 0, 0));
        LoginUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        LoginUsername.setSelectionColor(new java.awt.Color(255, 208, 0));
        LoginUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginUsernameActionPerformed(evt);
            }
        });
        RegistrationPanel.add(LoginUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 190, 30));

        userType.setBackground(new java.awt.Color(60, 63, 65));
        userType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userType.setForeground(new java.awt.Color(0, 0, 0));
        userType.setMaximumRowCount(2);
        userType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dispatcher", "Police Officer" }));
        userType.setOpaque(true);
        userType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTypeActionPerformed(evt);
            }
        });
        RegistrationPanel.add(userType, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 210, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 32));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 208, 0)));
        jPanel2.setForeground(new java.awt.Color(0, 0, 32));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(MinimizerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 30, 30));

        backToLogin.setBackground(new java.awt.Color(60, 63, 65));
        backToLogin.setForeground(new java.awt.Color(60, 63, 65));
        backToLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_back_to_32px_2.png"))); // NOI18N
        backToLogin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_back_to_32px_1.png"))); // NOI18N
        backToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToLoginActionPerformed(evt);
            }
        });
        jPanel2.add(backToLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        RegistrationExit.setBackground(new java.awt.Color(60, 63, 65));
        RegistrationExit.setForeground(new java.awt.Color(60, 63, 65));
        RegistrationExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_x_coordinate_32px_1.png"))); // NOI18N
        RegistrationExit.setToolTipText("Exit");
        RegistrationExit.setAlignmentY(0.0F);
        RegistrationExit.setBorderPainted(false);
        RegistrationExit.setName(""); // NOI18N
        RegistrationExit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_x_coordinate_32px.png"))); // NOI18N
        RegistrationExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_x_coordinate_32px_2.png"))); // NOI18N
        RegistrationExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationExitActionPerformed(evt);
            }
        });
        jPanel2.add(RegistrationExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 30, 30));

        BTSTitleMainText.setFont(new java.awt.Font("Iron Shark", 0, 14)); // NOI18N
        BTSTitleMainText.setForeground(new java.awt.Color(255, 208, 0));
        BTSTitleMainText.setText("Brion Tactical Systems");
        jPanel2.add(BTSTitleMainText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 300, 30));

        BTSShadowText.setFont(new java.awt.Font("Iron Shark", 0, 14)); // NOI18N
        BTSShadowText.setForeground(new java.awt.Color(0, 0, 0));
        BTSShadowText.setText("Brion Tactical Systems");
        jPanel2.add(BTSShadowText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 320, 40));

        RegistrationMainText.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        RegistrationMainText.setForeground(new java.awt.Color(255, 255, 255));
        RegistrationMainText.setText("PERSONEL REGISTRATION");
        jPanel2.add(RegistrationMainText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 270, 30));

        RegistrationShadowText.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        RegistrationShadowText.setForeground(new java.awt.Color(0, 0, 0));
        RegistrationShadowText.setText("PERSONEL REGISTRATION");
        jPanel2.add(RegistrationShadowText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 270, 40));

        BTSLogoRegistration.setText("BTSLogo");
        jPanel2.add(BTSLogoRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 110, 100));

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
        jPanel2.add(FrameDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        RegistrationPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        userPicture.setBackground(new java.awt.Color(255, 255, 255));
        userPicture.setForeground(new java.awt.Color(255, 255, 255));
        userPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_user_130px_1.png"))); // NOI18N
        userPicture.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 208, 0), 1, true));
        userPicture.setOpaque(true);
        RegistrationPanel.add(userPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 130));

        ImageChooser.setBackground(new java.awt.Color(0, 0, 32));
        ImageChooser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ImageChooser.setForeground(new java.awt.Color(255, 255, 255));
        ImageChooser.setText("Browse");
        ImageChooser.setOpaque(true);
        ImageChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImageChooserActionPerformed(evt);
            }
        });
        RegistrationPanel.add(ImageChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 130, 30));

        modifyAccount.setBackground(new java.awt.Color(0, 0, 32));
        modifyAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        modifyAccount.setForeground(new java.awt.Color(255, 255, 255));
        modifyAccount.setText("Modify Account");
        modifyAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyAccountActionPerformed(evt);
            }
        });
        RegistrationPanel.add(modifyAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 130, 30));

        jButton3.setBackground(new java.awt.Color(100, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Clear Fields");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        RegistrationPanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegistrationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegistrationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // POLICE STATION STRING ( JTextfield )
    private void stationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stationActionPerformed

    }//GEN-LAST:event_stationActionPerformed

    
    // LAST NAME STRING ( JTextfield )
    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed

    }//GEN-LAST:event_lastnameActionPerformed

    
    // CREATE PASSWORD STRING ( JTextfield )
    private void LoginPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginPasswordActionPerformed

    }//GEN-LAST:event_LoginPasswordActionPerformed

    
    // CREATE ACCOUNT BUTTON ( JButton )
    // CONNECTION TO DATABASE
    // IF STATEMENT TO CHECK IF JTextfields are Empty
    // TRY AND CATCH STATEMENT to warn user during execution instead of the IDE printing an error stack trace.
    // it is called Execption Handler. 
    
    // POLICE IMAGE CHOOSER
    String ImagePath = null;
    public void Clearfields(){
        firstname.setText("");
        middlename.setText("");
        lastname.setText("");
        age.setText("");
        contactnumber.setText("");
        address.setText("");
        station.setText("");
        rank.setText("");
        LoginUsername.setText("");
        LoginPassword.setText("");
        
        // RESET Picture
        ImageIcon imageIcon = new ImageIcon(Login.iconLoc);
        Image imagePicture = imageIcon.getImage();
        Image resizeImage = imagePicture.getScaledInstance(130,130, Image.SCALE_SMOOTH);
        ImageIcon myPicture = new ImageIcon(resizeImage);
        userPicture.setIcon(myPicture);
    }
    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed

        String fName = firstname.getText();
        String mName = middlename.getText();
        String lName = lastname.getText();
        String userAge = age.getText();
        String conNum = contactnumber.getText();
        String userAddress = address.getText();
        String polStation = station.getText();
        String polRank = rank.getText();
        String username = LoginUsername.getText();
        String password = LoginPassword.getText();
        if(ImagePath == null){
            
            JOptionPane.showMessageDialog(this, "No picture! Please insert a Picture!");
        }

        if(fName.isEmpty() || mName.isEmpty() || lName.isEmpty() || userAge.isEmpty() 
                || conNum.isEmpty() || userAddress.isEmpty() || polStation.isEmpty() 
                || polRank.isEmpty() || username.isEmpty() || password.isEmpty()){
            
            JOptionPane.showMessageDialog(this, "Form Fill is incomplete! Please Fill up the form properly.", "PRMS DATABASE", JOptionPane.ERROR_MESSAGE);      
        }else if(ImagePath == null){
            JOptionPane.showMessageDialog(this, "You must update user picture to update user account", "PRMS DATABASE", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                createAccount(fName, mName, lName, userAge, conNum, userAddress, polStation, polRank, username, password);
            } catch (FileNotFoundException | SQLException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_createAccountButtonActionPerformed
    
    
    // CREATE USER NAME ( JTextfield ) 
    private void LoginUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginUsernameActionPerformed

    }//GEN-LAST:event_LoginUsernameActionPerformed
    
    
    // BACK BUTTON ( JButton )
    private void backToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToLoginActionPerformed
        // BACK BUTTON TO LOGIN JFRAME
        dispose();
        Login returnToLogin = new Login();
        returnToLogin.setTitle("Brion Tactical Systems : PRMS DATABASE");
        returnToLogin.setLocationRelativeTo(null);
        returnToLogin.setVisible(true);
        
    }//GEN-LAST:event_backToLoginActionPerformed
    
    
    // EXIT BUTTON
    private void RegistrationExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrationExitActionPerformed
        // CUSTOM EXIT BUTTON
        dispose();
        
    }//GEN-LAST:event_RegistrationExitActionPerformed

    
    // FRAME DRAGGER
    int xMouse;
    int yMouse;
    
    private void FrameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMouseDragged
        // JFRAME DRAGGER
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_FrameDragMouseDragged

    private void FrameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMousePressed
        // JFRAME DRAGGER PART 2 
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_FrameDragMousePressed
    
    
    // IMAGE CHOOSER 
    public ImageIcon resizePic(String picPath){
   
        ImageIcon ProfilePicture = new ImageIcon(picPath);
        Image ProfPicture = ProfilePicture.getImage();
        Image resizeImage = ProfPicture.getScaledInstance(130,130, Image.SCALE_SMOOTH);
        ImageIcon myPicture = new ImageIcon(resizeImage);
        return myPicture;
    }
    private void ImageChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImageChooserActionPerformed
        // USER PICTURE 
        JFileChooser pictureChooser = new JFileChooser();
        pictureChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        // File Extension
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("*Images",".jpg",".png",".gif");
        pictureChooser.addChoosableFileFilter(fileFilter);
        
        int fileState = pictureChooser.showSaveDialog(null);
        
        // USER SELECTED FILE
        if(fileState == JFileChooser.APPROVE_OPTION){
            
            File selectedFile = pictureChooser.getSelectedFile();
            String Path = selectedFile.getAbsolutePath();
            ImagePath = Path;
            
            // FROM HERE, DISPLAY IMAGE IN JLABEL\
            
            userPicture.setIcon(resizePic(Path));
            
        }else if(fileState == JFileChooser.CANCEL_OPTION){
        }
    }//GEN-LAST:event_ImageChooserActionPerformed

    
    private void firstnamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_firstnamePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnamePropertyChange

    
    // SET AS ADMIN OR USER ( JList )
    private void userTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTypeActionPerformed

    }//GEN-LAST:event_userTypeActionPerformed
    
    
    // MODIFY ACCOUNT ( JButton )
    private void modifyAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyAccountActionPerformed

        dispose();
        ChooseAccountToModify GoToModify = new ChooseAccountToModify();
        GoToModify.setTitle("Brion Tactical Systems : PRMS DATABASE (Modify Account)");
        GoToModify.setLocationRelativeTo(null);
        GoToModify.setVisible(true);
    }//GEN-LAST:event_modifyAccountActionPerformed
    
    
    // MINIMIZE BUTTON
    private void MinimizerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizerBtnActionPerformed

        setState(Registration.ICONIFIED);
    }//GEN-LAST:event_MinimizerBtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Clear preview
        Clearfields();
    }//GEN-LAST:event_jButton3ActionPerformed

    
    // MAIN METHOD
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Registration().setVisible(true);   
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BTSLogoRegistration;
    private javax.swing.JLabel BTSShadowText;
    private javax.swing.JLabel BTSTitleMainText;
    private javax.swing.JLabel FrameDrag;
    private javax.swing.JButton ImageChooser;
    private javax.swing.JTextField LoginPassword;
    private javax.swing.JTextField LoginUsername;
    private javax.swing.JButton MinimizerBtn;
    private javax.swing.JButton RegistrationExit;
    private javax.swing.JLabel RegistrationMainText;
    private javax.swing.JLabel RegistrationShadowText;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JButton backToLogin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField contactnumber;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JTextField firstname;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField middlename;
    private javax.swing.JButton modifyAccount;
    private javax.swing.JTextField rank;
    private javax.swing.JTextField station;
    private javax.swing.JLabel userPicture;
    private javax.swing.JComboBox<String> userType;
    // End of variables declaration//GEN-END:variables
    
    
    // CONNECTION TO DATABASE
    private void createAccount(String fName, String mName, String lName, String userAge, String conNum, String userAddress, String polStation, String polRank, String username, String password) throws FileNotFoundException, SQLException {
        Connection dbconn = DBConnection.connectDB();
        if(dbconn != null){ 
            try {
                PreparedStatement st = (PreparedStatement)
                        dbconn.prepareStatement("INSERT INTO policedatabaseaccounts (firstname, middlename, lastname, age, contactnumber, address, station, rank, username, password, userType, userPicture) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");

                        st.setString(1, fName);
                        st.setString(2, mName);
                        st.setString(3, lName);
                        st.setString(4, userAge);
                        st.setString(5, conNum);
                        st.setString(6, userAddress);
                        st.setString(7, polStation);
                        st.setString(8, polRank);
                        st.setString(9, username);
                        st.setString(10, password);
                        st.setString(11, String.valueOf(userType.getSelectedItem().toString()));

                        InputStream ProfPicture = new FileInputStream(new File(ImagePath));
                        st.setBlob(12, ProfPicture);

                        st.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Success! User Account has been created.", "PRMS DATABASE ", JOptionPane.INFORMATION_MESSAGE);

                        firstname.setText("");
                        middlename.setText("");
                        lastname.setText("");
                        age.setText("");
                        contactnumber.setText("");
                        address.setText("");
                        station.setText("");
                        rank.setText("");
                        LoginUsername.setText("");
                        LoginPassword.setText("");
                        userType.getSelectedItem().toString();
                        userPicture.getIcon();

            } catch (SQLException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Police Database connection Unavailable! Check your JDBC Connector");
            JOptionPane.showMessageDialog(this, "Police database connection unavailable!\r\n"
               + "Please Check your JDBC Connector!", "POLICE DATABASE", JOptionPane.INFORMATION_MESSAGE);
        }     
    }
}
