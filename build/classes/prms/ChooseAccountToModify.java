
package prms;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import static prms.Login.LogoLoc;
import static prms.Login.iconLoc;

public class ChooseAccountToModify extends javax.swing.JFrame {

    public ChooseAccountToModify() {
        initComponents();
            Connection dbconn = DBConnection.connectDB();
            String sqlQuery = "SELECT * FROM policedatabaseaccounts ";
            if(dbconn != null){
                try {
                    Statement st = (Statement)            
                            dbconn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            ResultSet rs = st.executeQuery(sqlQuery);
                            PoliceAccountsList.setModel(DbUtils.resultSetToTableModel(rs));
                            PoliceAccountsList.getColumnModel().getColumn(0).setPreferredWidth(50);
                            PoliceAccountsList.getColumnModel().getColumn(1).setPreferredWidth(150);
                            PoliceAccountsList.getColumnModel().getColumn(2).setPreferredWidth(150);
                            PoliceAccountsList.getColumnModel().getColumn(3).setPreferredWidth(150);
                            PoliceAccountsList.getColumnModel().getColumn(4).setPreferredWidth(400);
                            PoliceAccountsList.getColumnModel().getColumn(5).setPreferredWidth(50);
                            PoliceAccountsList.getColumnModel().getColumn(6).setPreferredWidth(150);
                            PoliceAccountsList.getColumnModel().getColumn(7).setPreferredWidth(400);
                            PoliceAccountsList.getColumnModel().getColumn(8).setPreferredWidth(300);
                            PoliceAccountsList.getColumnModel().getColumn(9).setPreferredWidth(100);
                            PoliceAccountsList.getColumnModel().getColumn(10).setPreferredWidth(150);
                            PoliceAccountsList.getColumnModel().getColumn(11).setPreferredWidth(150);
                            PoliceAccountsList.getColumnModel().getColumn(12).setPreferredWidth(150);
                            TableColumn tcol = PoliceAccountsList.getColumnModel().getColumn(12);
                            PoliceAccountsList.removeColumn(tcol);

                            String header[] = {"ID","FIRST NAME", "MIDDLE NAME", "LAST NAME", "AGE", "CONTACT NUMBER", "ADDRESS", "STATION", "RANK", "USERNAME", "PASSWORD", "ACCOUNT TYPE",""};

                            for(int i=0;i<PoliceAccountsList.getColumnCount();i++)
                            {
                            TableColumn column1 = PoliceAccountsList.getTableHeader().getColumnModel().getColumn(i);

                            column1.setHeaderValue(header[i]);
                            } 
                } catch (SQLException ex) {
                Logger.getLogger(ChooseAccountToModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                System.out.println("Police Database connection Unavailable! Check your JDBC Connector");
                JOptionPane.showMessageDialog(this, "Police database connection unavailable!\r\n"
                   + "Please Check your JDBC Connector!", "POLICE DATABASE", JOptionPane.INFORMATION_MESSAGE);
            }

        // BTS BILLBOARD LOGO
        ImageIcon BTSLogoReg = new ImageIcon(getClass().getClassLoader().getResource(LogoLoc));
        Image logo = BTSLogoReg.getImage();
        Image LogoRegScale = logo.getScaledInstance(BTSLogoRegistration.getWidth(), BTSLogoRegistration.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledLogo = new ImageIcon(LogoRegScale);
        BTSLogoRegistration.setIcon(scaledLogo);
        
        //
        backtoModifyAccount.setOpaque(false);
        backtoModifyAccount.setContentAreaFilled(false);
        backtoModifyAccount.setBorderPainted(false);
        backtoModifyAccount.setHorizontalAlignment(SwingConstants.CENTER);
        backtoModifyAccount.setIconTextGap(-2);
        
        // MINIMIZE BUTTON
        MinimizerBtn.setOpaque(false);
        MinimizerBtn.setContentAreaFilled(false);
        MinimizerBtn.setBorderPainted(false);
        MinimizerBtn.setHorizontalAlignment(SwingConstants.CENTER);
        MinimizerBtn.setIconTextGap(-2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userPicture = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        station = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        middlename = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rank = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        LoginUsername = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        contactnumber = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        LoginPassword = new javax.swing.JTextField();
        ImageChooser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        userType = new javax.swing.JComboBox<>();
        deleteAccountButton = new javax.swing.JButton();
        updateAccountButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        backtoModifyAccount = new javax.swing.JButton();
        MinimizerBtn = new javax.swing.JButton();
        FrameDrag = new javax.swing.JLabel();
        BTSTitleMainText = new javax.swing.JLabel();
        BTSShadowText = new javax.swing.JLabel();
        RegistrationMainText = new javax.swing.JLabel();
        RegistrationShadowText = new javax.swing.JLabel();
        BTSLogoRegistration = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        searchAccounts = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PoliceAccountsList = new javax.swing.JTable(){
            public boolean editCellAt(int row, int column, java.util.EventObject e){

                return false;
            }

        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(32, 32, 32));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userPicture.setBackground(new java.awt.Color(255, 255, 255));
        userPicture.setForeground(new java.awt.Color(255, 255, 255));
        userPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_user_130px_1.png"))); // NOI18N
        userPicture.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 208, 0), 1, true));
        userPicture.setOpaque(true);
        jPanel1.add(userPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, 130));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("First Name     :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, 30));

        firstname.setBackground(new java.awt.Color(255, 255, 255));
        firstname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        firstname.setForeground(new java.awt.Color(0, 0, 0));
        firstname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        firstname.setSelectionColor(new java.awt.Color(255, 208, 0));
        jPanel1.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 250, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Police Station :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, 30));

        station.setBackground(new java.awt.Color(255, 255, 255));
        station.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        station.setForeground(new java.awt.Color(0, 0, 0));
        station.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        station.setSelectionColor(new java.awt.Color(255, 208, 0));
        jPanel1.add(station, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 170, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Middle Name : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, 30));

        middlename.setBackground(new java.awt.Color(255, 255, 255));
        middlename.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        middlename.setForeground(new java.awt.Color(0, 0, 0));
        middlename.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        middlename.setSelectionColor(new java.awt.Color(255, 208, 0));
        jPanel1.add(middlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 250, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Police Rank :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, 30));

        rank.setBackground(new java.awt.Color(255, 255, 255));
        rank.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rank.setForeground(new java.awt.Color(0, 0, 0));
        rank.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        rank.setSelectionColor(new java.awt.Color(255, 208, 0));
        jPanel1.add(rank, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 180, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Last Name     :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, 30));

        lastname.setBackground(new java.awt.Color(255, 255, 255));
        lastname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lastname.setForeground(new java.awt.Color(0, 0, 0));
        lastname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        lastname.setSelectionColor(new java.awt.Color(255, 208, 0));
        jPanel1.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 250, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Username :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, 30));

        LoginUsername.setBackground(new java.awt.Color(255, 255, 255));
        LoginUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LoginUsername.setForeground(new java.awt.Color(0, 0, 0));
        LoginUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        LoginUsername.setSelectionColor(new java.awt.Color(255, 208, 0));
        jPanel1.add(LoginUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 190, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Age : ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, 30));

        age.setBackground(new java.awt.Color(255, 255, 255));
        age.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        age.setForeground(new java.awt.Color(0, 0, 0));
        age.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        age.setSelectionColor(new java.awt.Color(255, 208, 0));
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 50, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contact Number :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        contactnumber.setBackground(new java.awt.Color(255, 255, 255));
        contactnumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        contactnumber.setForeground(new java.awt.Color(0, 0, 0));
        contactnumber.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        contactnumber.setSelectionColor(new java.awt.Color(255, 208, 0));
        jPanel1.add(contactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 130, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Password  :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, 30));

        LoginPassword.setBackground(new java.awt.Color(255, 255, 255));
        LoginPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LoginPassword.setForeground(new java.awt.Color(0, 0, 0));
        LoginPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        LoginPassword.setSelectionColor(new java.awt.Color(255, 208, 0));
        jPanel1.add(LoginPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 190, 30));

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
        jPanel1.add(ImageChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 130, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Home Address :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, 30));

        address.setBackground(new java.awt.Color(255, 255, 255));
        address.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        address.setForeground(new java.awt.Color(0, 0, 0));
        address.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        address.setSelectionColor(new java.awt.Color(255, 208, 0));
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 530, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Police Database Account Previleges :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 230, 30));

        userType.setBackground(new java.awt.Color(60, 63, 65));
        userType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userType.setForeground(new java.awt.Color(0, 0, 0));
        userType.setMaximumRowCount(2);
        userType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dispatcher", "Police Officer" }));
        userType.setOpaque(true);
        jPanel1.add(userType, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 210, 30));

        deleteAccountButton.setBackground(new java.awt.Color(0, 0, 32));
        deleteAccountButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        deleteAccountButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteAccountButton.setText("Delete Account");
        deleteAccountButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteAccountButton.setOpaque(true);
        deleteAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccountButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 130, 30));

        updateAccountButton.setBackground(new java.awt.Color(0, 0, 32));
        updateAccountButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        updateAccountButton.setForeground(new java.awt.Color(255, 255, 255));
        updateAccountButton.setText("Update Account");
        updateAccountButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updateAccountButton.setOpaque(true);
        updateAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAccountButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, 130, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 32));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 208, 0)));
        jPanel2.setForeground(new java.awt.Color(0, 0, 32));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backtoModifyAccount.setBackground(new java.awt.Color(60, 63, 65));
        backtoModifyAccount.setForeground(new java.awt.Color(60, 63, 65));
        backtoModifyAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_back_to_32px_2.png"))); // NOI18N
        backtoModifyAccount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backtoModifyAccount.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_back_to_32px_1.png"))); // NOI18N
        backtoModifyAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtoModifyAccountActionPerformed(evt);
            }
        });
        jPanel2.add(backtoModifyAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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
        jPanel2.add(MinimizerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 30, 30));

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
        RegistrationMainText.setText("MODIFY ACCOUNTS");
        jPanel2.add(RegistrationMainText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 180, 30));

        RegistrationShadowText.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        RegistrationShadowText.setForeground(new java.awt.Color(0, 0, 0));
        RegistrationShadowText.setText("MODIFY ACCOUNTS");
        jPanel2.add(RegistrationShadowText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 180, 40));

        BTSLogoRegistration.setText("BTSLogo");
        jPanel2.add(BTSLogoRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 110, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, 30));

        id.setEditable(false);
        id.setBackground(new java.awt.Color(32, 32, 32));
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setBorder(null);
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 50, 30));

        searchAccounts.setBackground(new java.awt.Color(255, 255, 255));
        searchAccounts.setForeground(new java.awt.Color(0, 0, 0));
        searchAccounts.setToolTipText("Search for Accounts by ID");
        searchAccounts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchAccountsKeyReleased(evt);
            }
        });
        jPanel1.add(searchAccounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 330, 30));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("POLICE SEARCH :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 30));

        jButton3.setBackground(new java.awt.Color(100, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Clear Fields");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 100, 30));

        jScrollPane2.setBackground(new java.awt.Color(18, 30, 49));
        jScrollPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(18, 30, 49), 2, true));
        jScrollPane2.setForeground(new java.awt.Color(18, 30, 49));
        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 102), null));
        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setMaximumSize(new java.awt.Dimension(470, 404));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(470, 404));
        jScrollPane2.setRowHeaderView(null);

        PoliceAccountsList.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PoliceAccountsList.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PoliceAccountsList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        PoliceAccountsList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        PoliceAccountsList.setRowSelectionAllowed(false);
        PoliceAccountsList.setSelectionBackground(new java.awt.Color(0, 0, 32));
        PoliceAccountsList.setSelectionForeground(new java.awt.Color(255, 208, 0));
        PoliceAccountsList.setShowGrid(false);
        PoliceAccountsList.setShowVerticalLines(true);
        PoliceAccountsList.getTableHeader().setReorderingAllowed(false);
        PoliceAccountsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PoliceAccountsListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(PoliceAccountsList);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 800, 140));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 611));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backtoModifyAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtoModifyAccountActionPerformed
        // BACK BUTTON TO LOGIN JFRAME
        dispose();
        Registration returnToReg = new Registration();
        returnToReg.setTitle("Brion Tactical Systems : PRMS DATABASE");
        returnToReg.setLocationRelativeTo(null);
        returnToReg.setVisible(true);
    }//GEN-LAST:event_backtoModifyAccountActionPerformed
    
    
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
    public ImageIcon resizePic(String picPath){
   
        ImageIcon ProfilePicture = new ImageIcon(picPath);
        Image ProfPicture = ProfilePicture.getImage();
        Image resizeImage = ProfPicture.getScaledInstance(130,130, Image.SCALE_SMOOTH);
        ImageIcon myPicture = new ImageIcon(resizeImage);
        userPicture.setIcon(myPicture);
        return myPicture;
    }
    
    
    // IMAGE CHOOSER
    String ImagePath = null;
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
    
   
    // DELETE DATA ON DATABASE ( JButton )
    private void deleteAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccountButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this account?","Confirm Deletion",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if(response==JOptionPane.YES_OPTION) {
            Connection conn = DBConnection.connectDB();
            if(conn != null){
                try{
                    PreparedStatement ps = (PreparedStatement) 
                            conn.prepareStatement("DELETE FROM policedatabaseaccounts WHERE id = ?");
                    ps.setInt(1, Integer.parseInt(id.getText()));
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Success! User Accout has been deleted");
                    id.setText("");
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
                    Logger.getLogger(ChooseAccountToModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                System.out.println("Police Database connection Unavailable! Check your JDBC Connector");
                JOptionPane.showMessageDialog(this, "Police database connection unavailable!\r\n"
                   + "Please Check your JDBC Connector!", "POLICE DATABASE", JOptionPane.INFORMATION_MESSAGE);
            }     
        }else if (response==JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this, "User cancelled Account Deletion!", "POLICE DATABASE", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }//GEN-LAST:event_deleteAccountButtonActionPerformed
    
    // UPDATE VALUES INTO THE DATABSE
    private void updateAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAccountButtonActionPerformed
        // TODO add your handling code here;
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
        String userID = id.getText();
        
        if(fName.isEmpty() || mName.isEmpty() || lName.isEmpty() || userAge.isEmpty() 
                || conNum.isEmpty() || userAddress.isEmpty() || polStation.isEmpty() 
                || polRank.isEmpty() || username.isEmpty() || password.isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Form Fill is incomplete! Please Fill up the form properly.", "PRMS DATABASE", JOptionPane.ERROR_MESSAGE);
        }else if(userID.isEmpty()){
            
            JOptionPane.showMessageDialog(this, "The User you are trying to modify did not match any\r\n"
                    + "accounts in our Database. ", "PRMS DATABASE", JOptionPane.ERROR_MESSAGE);
        }else if(ImagePath == null){
            
            JOptionPane.showMessageDialog(this, "You must update user picture to update user account", "PRMS DATABASE", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                updateAccount(fName, mName, lName, userAge, conNum, userAddress, polStation, polRank, username, password, userID);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ChooseAccountToModify.class.getName()).log(Level.SEVERE, null, ex);
            }
        }                                      
    }//GEN-LAST:event_updateAccountButtonActionPerformed
    
    
        // CLEAR FORM FIELDS
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
        ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource(iconLoc));
        Image imagePicture = imageIcon.getImage();
        Image resizeImage = imagePicture.getScaledInstance(130,130, Image.SCALE_SMOOTH);
        ImageIcon myPicture = new ImageIcon(resizeImage);
        userPicture.setIcon(myPicture);
    }
    
    
    // MINIMIZE BUTTON
    private void MinimizerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizerBtnActionPerformed
        // TODO add your handling code here:
        setState(Registration.ICONIFIED);
    }//GEN-LAST:event_MinimizerBtnActionPerformed

    private void searchAccountsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchAccountsKeyReleased
        DefaultTableModel model = (DefaultTableModel) PoliceAccountsList.getModel();
        @SuppressWarnings("Convert2Diamond")
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        PoliceAccountsList.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(searchAccounts.getText().trim()));
    }//GEN-LAST:event_searchAccountsKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Clear preview
        Clearfields();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void PoliceAccountsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PoliceAccountsListMouseClicked
        // TODO add your handling code here:
        PoliceAccountsList.setCellSelectionEnabled(false);
        PoliceAccountsList.setRowSelectionAllowed(true);

        int number = PoliceAccountsList.getSelectedRow();
        id.setText(PoliceAccountsList.getValueAt(number, 0).toString());
        firstname.setText(PoliceAccountsList.getValueAt(number, 1).toString());
        middlename.setText(PoliceAccountsList.getValueAt(number, 2).toString());
        lastname.setText(PoliceAccountsList.getValueAt(number, 3).toString());
        age.setText(PoliceAccountsList.getValueAt(number, 4).toString());
        contactnumber.setText(PoliceAccountsList.getValueAt(number, 5).toString());
        address.setText(PoliceAccountsList.getValueAt(number, 6).toString());
        station.setText(PoliceAccountsList.getValueAt(number, 7).toString());
        rank.setText(PoliceAccountsList.getValueAt(number, 8).toString());
        LoginUsername.setText(PoliceAccountsList.getValueAt(number, 9).toString());
        LoginPassword.setText(PoliceAccountsList.getValueAt(number, 10).toString());
        userType.getSelectedItem().toString();
        userPicture.getIcon();
        Connection conn = DBConnection.connectDB();
        if(conn != null){
            try{
                String username = id.getText();
                PreparedStatement ps = (PreparedStatement) conn.prepareStatement("SELECT userPicture FROM policedatabaseaccounts WHERE id = ?");
                ps.setString(1, username);
                ResultSet rs = ps.executeQuery();
                
                if(rs.next()){
                    byte[] imageBytes = rs.getBytes("userPicture");
                    ImageIcon imageIcon = new ImageIcon(imageBytes);
                    Image imagePicture = imageIcon.getImage();
                    Image resizeImage = imagePicture.getScaledInstance(130,130, Image.SCALE_SMOOTH);
                    ImageIcon myPicture = new ImageIcon(resizeImage);
                    userPicture.setIcon(myPicture);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ChooseAccountToModify.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Police Database connection Unavailable! Check your JDBC Connector");
            JOptionPane.showMessageDialog(this, "Police database connection unavailable!\r\n"
               + "Please Check your JDBC Connector!", "POLICE DATABASE", JOptionPane.INFORMATION_MESSAGE);
        }     
    }//GEN-LAST:event_PoliceAccountsListMouseClicked

    
    // MAIN METHOD
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For detai {{ls see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseAccountToModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChooseAccountToModify().setVisible(true);
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
    private javax.swing.JTable PoliceAccountsList;
    private javax.swing.JLabel RegistrationMainText;
    private javax.swing.JLabel RegistrationShadowText;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JButton backtoModifyAccount;
    private javax.swing.JTextField contactnumber;
    private javax.swing.JButton deleteAccountButton;
    private javax.swing.JTextField firstname;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField middlename;
    private javax.swing.JTextField rank;
    private javax.swing.JTextField searchAccounts;
    private javax.swing.JTextField station;
    private javax.swing.JButton updateAccountButton;
    private javax.swing.JLabel userPicture;
    private javax.swing.JComboBox<String> userType;
    // End of variables declaration//GEN-END:variables
    
     
    // CONNECTION TO DATABASE
    private void updateAccount(String fName, String mName, String lName, String userAge, String conNum, String userAddress, String polStation, String polRank, String username, String password, String userID) throws FileNotFoundException {
        Connection dbconn = DBConnection.connectDB();
        if(dbconn != null){ 
            try {
                PreparedStatement st = (PreparedStatement)
                        dbconn.prepareStatement("UPDATE policedatabaseaccounts SET firstname=?, middlename=?, lastname=?, age=?, contactnumber=?, address=?, station=?, rank=?, username=?, password=?, userType=?, userPicture=? WHERE id='"+userID+"'");
                
                st.setString(12, userID);
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
                JOptionPane.showMessageDialog(this, "Success! User Account has been Updated!.", "PRMS DATABASE ", JOptionPane.INFORMATION_MESSAGE);
            
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
                
                try {
                    Thread.sleep(1 * 1000);
                } catch (InterruptedException ex) {
                }   
            } catch (SQLException ex) {
                Logger.getLogger(ChooseAccountToModify.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Police Database connection Unavailable! Check your JDBC Connector");
            JOptionPane.showMessageDialog(this, "Police database connection unavailable!\r\n"
               + "Please Check your JDBC Connector!", "POLICE DATABASE", JOptionPane.INFORMATION_MESSAGE);
        }     
    }   
}