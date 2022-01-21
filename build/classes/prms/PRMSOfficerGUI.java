
package prms;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

public class PRMSOfficerGUI extends javax.swing.JFrame {
    public PRMSOfficerGUI() {
            initComponents();
            
            // CARBON FIBER BACKGROUND
        ImageIcon icon = new ImageIcon(Login.CarbonLoc);
        Image LoginBackground = icon.getImage();
        Image imgScale = LoginBackground.getScaledInstance(carbonFibrBackground.getWidth(), carbonFibrBackground.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        carbonFibrBackground.setIcon(scaledIcon);
        
        // CARBON FIBER BACKGROUND
        Image LoginBackground1 = icon.getImage();
        Image imgScale1 = LoginBackground1.getScaledInstance(carbonFibrBackground.getWidth(), carbonFibrBackground2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon(imgScale1);
        carbonFibrBackground1.setIcon(scaledIcon1);
        
        // CARBON FIBER BACKGROUND
        Image LoginBackground2 = icon.getImage();
        Image imgScale2 = LoginBackground2.getScaledInstance(carbonFibrBackground3.getWidth(), carbonFibrBackground3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
        carbonFibrBackground2.setIcon(scaledIcon2);
        
        // CARBON FIBER BACKGROUND
        Image LoginBackground3 = icon.getImage();
        Image imgScale3 = LoginBackground3.getScaledInstance(carbonFibrBackground1.getWidth(), carbonFibrBackground1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon3 = new ImageIcon(imgScale3);
        carbonFibrBackground3.setIcon(scaledIcon3);

        Connection dbconn = DBConnection.connectDB();
        String sqlQuery = "SELECT * FROM prmscriminalrecords";
        if(dbconn != null){
            try {
                Statement st = (Statement)            
                        dbconn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                        ResultSet rs = st.executeQuery(sqlQuery);
                        crimList.setModel(DbUtils.resultSetToTableModel(rs));
                        crimList.getColumnModel().getColumn(0).setPreferredWidth(50);
                        crimList.getColumnModel().getColumn(1).setPreferredWidth(150);
                        crimList.getColumnModel().getColumn(2).setPreferredWidth(150);
                        crimList.getColumnModel().getColumn(3).setPreferredWidth(150);
                        crimList.getColumnModel().getColumn(4).setPreferredWidth(400);
                        crimList.getColumnModel().getColumn(5).setPreferredWidth(150);
                        crimList.getColumnModel().getColumn(6).setPreferredWidth(150);
                        crimList.getColumnModel().getColumn(7).setPreferredWidth(150);
                        crimList.getColumnModel().getColumn(8).setPreferredWidth(150);
                        crimList.getColumnModel().getColumn(9).setPreferredWidth(150);
                        crimList.getColumnModel().getColumn(10).setPreferredWidth(150);
                        TableColumn tcol = crimList.getColumnModel().getColumn(11);
                        crimList.removeColumn(tcol);

                        String header[] = {"ID","LAST NAME", "FIRST NAME", "MIDDLE NAME", "ADDRESS", "DATE OF ARREST", "DATE OF RELEASE", "AGE", "GENDER", "STATUS", "ORIGIN", ""};

                        for(int i=0;i<crimList.getColumnCount();i++)
                        {
                        TableColumn column1 = crimList.getTableHeader().getColumnModel().getColumn(i);

                        column1.setHeaderValue(header[i]);
                        } 
            } catch (SQLException ex) {
            Logger.getLogger(PRMSOfficerGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Police Database connection Unavailable! Check your JDBC Connector");
            JOptionPane.showMessageDialog(this, "Police database connection unavailable!\r\n"
               + "Please Check your JDBC Connector!", "POLICE DATABASE", JOptionPane.INFORMATION_MESSAGE);
        }

        // Tab COLORS// 
        CriminalTab.setBackground(new Color(128,128,128));
        AddCrime.setBackground(new Color(128,128,128));
        ProfileTab.setBackground(new Color(128,128,128));
        InfoTab.setBackground(new Color(128,128,128));
        
        // LOGO
        ImageIcon BTSLogoAdm = new ImageIcon(Login.LogoLoc);
        Image logo = BTSLogoAdm.getImage();
        Image LogoRegScale = logo.getScaledInstance(BTSLogoAdmin.getWidth(), BTSLogoAdmin.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledLogo = new ImageIcon(LogoRegScale);
        BTSLogoAdmin.setIcon(scaledLogo);
        
        //  BTS About LOGO CODE
        ImageIcon BTSLogoAbout = new ImageIcon(Login.LogoLoc);
        Image logoDisp = BTSLogoAbout.getImage();
        Image BTSAboutRegScale = logoDisp.getScaledInstance(BTSAbout.getWidth(), BTSAbout.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon BTSAboutScaledLogo = new ImageIcon(BTSAboutRegScale);
        BTSAbout.setIcon(BTSAboutScaledLogo);

        // LOG OUT
        LogOut.setHorizontalAlignment(SwingConstants.LEADING);
        LogOut.setIconTextGap(-2);
        
        // MINIMIZE BUTTON
        MinimizerBtn.setOpaque(false);
        MinimizerBtn.setContentAreaFilled(false);
        MinimizerBtn.setBorderPainted(false);
        MinimizerBtn.setHorizontalAlignment(SwingConstants.CENTER);
        MinimizerBtn.setIconTextGap(-2);
        
    }
    public boolean editCellAt(int row, int column, java.util.EventObject e){
        return false;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dashboard = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        P1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        crimList = new javax.swing.JTable(){
            public boolean editCellAt(int row, int column, java.util.EventObject e){

                return false;
            }

        };
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        SearchBar = new javax.swing.JTextField();
        viewPicture = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RefreshACL = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        printButton = new javax.swing.JButton();
        crimName = new javax.swing.JLabel();
        DOA = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        origin = new javax.swing.JLabel();
        crime = new javax.swing.JLabel();
        DOR = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        carbonFibrBackground = new javax.swing.JLabel();
        P3 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        nameLabel1 = new javax.swing.JLabel();
        viewProfileName = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        polAge = new javax.swing.JLabel();
        homeAddLabel = new javax.swing.JLabel();
        polAddress = new javax.swing.JLabel();
        nameLabel2 = new javax.swing.JLabel();
        polContact = new javax.swing.JLabel();
        stationLabel = new javax.swing.JLabel();
        polStation = new javax.swing.JLabel();
        homeAddLabel2 = new javax.swing.JLabel();
        polRank = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        polUsername = new javax.swing.JLabel();
        viewProfilePic = new javax.swing.JLabel();
        carbonFibrBackground2 = new javax.swing.JLabel();
        P4 = new javax.swing.JPanel();
        BTSTitleMainText1 = new javax.swing.JLabel();
        BTSShadowText1 = new javax.swing.JLabel();
        BTSAbout = new javax.swing.JLabel();
        RegistrationMainText1 = new javax.swing.JLabel();
        RegistrationShadowText1 = new javax.swing.JLabel();
        aboutMission = new javax.swing.JLabel();
        aboutVision = new javax.swing.JLabel();
        missionLine1 = new javax.swing.JLabel();
        missionLine2 = new javax.swing.JLabel();
        missionLine3 = new javax.swing.JLabel();
        missionLine4 = new javax.swing.JLabel();
        missionLine5 = new javax.swing.JLabel();
        visionLine1 = new javax.swing.JLabel();
        visionLine2 = new javax.swing.JLabel();
        visionLine3 = new javax.swing.JLabel();
        visionLine4 = new javax.swing.JLabel();
        visionLine5 = new javax.swing.JLabel();
        DevTeam = new javax.swing.JLabel();
        DevTeam1 = new javax.swing.JLabel();
        BTSDevTeam5 = new javax.swing.JLabel();
        BTSDevTeam6 = new javax.swing.JLabel();
        BTSDevTeam4 = new javax.swing.JLabel();
        BTSDevTeam7 = new javax.swing.JLabel();
        BTSDevTeam3 = new javax.swing.JLabel();
        BTSDevTeam8 = new javax.swing.JLabel();
        aboutVision1 = new javax.swing.JLabel();
        aboutMission1 = new javax.swing.JLabel();
        carbonFibrBackground3 = new javax.swing.JLabel();
        carbonFibrBackground4 = new javax.swing.JLabel();
        P2 = new javax.swing.JPanel();
        crimPicture = new javax.swing.JLabel();
        ImageChooser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtLname = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtMname = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtAge = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        txtGender = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        dor = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtOrigin = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        doa = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        txtCrime = new javax.swing.JComboBox<>();
        RESETbutton = new javax.swing.JButton();
        ADDbutton = new javax.swing.JButton();
        carbonFibrBackground1 = new javax.swing.JLabel();
        MenuIcon1 = new javax.swing.JPanel();
        Line1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        CriminalTab = new javax.swing.JPanel();
        BCTab = new javax.swing.JLabel();
        AddCrime = new javax.swing.JPanel();
        BATab = new javax.swing.JLabel();
        ProfileTab = new javax.swing.JPanel();
        BPTab = new javax.swing.JLabel();
        InfoTab = new javax.swing.JPanel();
        BITab = new javax.swing.JLabel();
        Line2 = new javax.swing.JPanel();
        Line3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        MinimizerBtn = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        BTSTitleMainText = new javax.swing.JLabel();
        BTSShadowText = new javax.swing.JLabel();
        RegistrationMainText = new javax.swing.JLabel();
        RegistrationShadowText = new javax.swing.JLabel();
        FrameDrag = new javax.swing.JLabel();
        userAccIdentificaion = new javax.swing.JLabel();
        userAccIdentificaionShdw = new javax.swing.JLabel();
        BTSLogoAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(800, 600, 600, 600));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        Dashboard.setBackground(new java.awt.Color(51, 51, 51));
        Dashboard.setLayout(new java.awt.BorderLayout());

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        P1.setBackground(new java.awt.Color(32, 32, 32));
        P1.setMaximumSize(new java.awt.Dimension(727, 551));
        P1.setMinimumSize(new java.awt.Dimension(727, 551));
        P1.setPreferredSize(new java.awt.Dimension(750, 555));
        P1.setRequestFocusEnabled(false);
        P1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("-  REPORT SHEET  -");
        P1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 177, 30));

        jScrollPane2.setBackground(new java.awt.Color(18, 30, 49));
        jScrollPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(18, 30, 49), 2, true));
        jScrollPane2.setForeground(new java.awt.Color(18, 30, 49));
        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 102), null));
        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setMaximumSize(new java.awt.Dimension(470, 404));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(470, 404));
        jScrollPane2.setRowHeaderView(null);

        crimList.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        crimList.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        crimList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        crimList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        crimList.setRowSelectionAllowed(false);
        crimList.setSelectionBackground(new java.awt.Color(0, 0, 32));
        crimList.setSelectionForeground(new java.awt.Color(255, 208, 0));
        crimList.setShowGrid(false);
        crimList.setShowVerticalLines(true);
        crimList.getTableHeader().setReorderingAllowed(false);
        crimList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crimListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(crimList);

        P1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 750, 250));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date of Release : ");
        P1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Gender             :");
        P1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Age  :");
        P1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 50, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Residential Address  :");
        P1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 130, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Province of Origin    :");
        P1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Reason               :");
        P1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 120, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Date of Arrest   :");
        P1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 110, 30));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("-  LIST OF CRIMINALS   -");
        jLabel13.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        P1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 177, 30));

        jLabel14.setBackground(null);
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Criminal ID");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        P1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 130, 30));

        SearchBar.setBackground(java.awt.Color.white);
        SearchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchBarKeyReleased(evt);
            }
        });
        P1.add(SearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 450, 30));

        viewPicture.setBackground(new java.awt.Color(255, 255, 255));
        viewPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prms/icons/icons8_user_130px_1.png"))); // NOI18N
        viewPicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 208, 0), 2));
        viewPicture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewPicture.setOpaque(true);
        P1.add(viewPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 130, 130));

        jLabel5.setBackground(null);
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("________________________");
        P1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 170, -1));

        RefreshACL.setBackground(new java.awt.Color(0, 0, 32));
        RefreshACL.setForeground(new java.awt.Color(255, 255, 255));
        RefreshACL.setText("Refresh");
        RefreshACL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshACLActionPerformed(evt);
            }
        });
        P1.add(RefreshACL, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 100, 30));

        jLabel3.setBackground(new java.awt.Color(32, 32, 32));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SEARCH :");
        P1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 70, 30));

        printButton.setBackground(new java.awt.Color(0, 0, 32));
        printButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        printButton.setForeground(new java.awt.Color(255, 255, 255));
        printButton.setText("Print\n");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        P1.add(printButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 90, 30));

        crimName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        crimName.setForeground(new java.awt.Color(255, 255, 255));
        P1.add(crimName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 430, 40));

        DOA.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        DOA.setForeground(new java.awt.Color(255, 255, 255));
        P1.add(DOA, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 310, 30));

        gender.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));
        P1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 160, 30));

        Age.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Age.setForeground(new java.awt.Color(255, 255, 255));
        P1.add(Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 60, 30));

        address.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        P1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 410, 30));

        origin.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        origin.setForeground(new java.awt.Color(255, 255, 255));
        P1.add(origin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 410, 30));

        crime.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        crime.setForeground(new java.awt.Color(255, 255, 255));
        P1.add(crime, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 410, 30));

        DOR.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        DOR.setForeground(new java.awt.Color(255, 255, 255));
        P1.add(DOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 410, 30));

        ID.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        ID.setForeground(new java.awt.Color(255, 255, 255));
        ID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        P1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 110, 30));
        P1.add(carbonFibrBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 630));

        jLayeredPane1.add(P1, "card4");

        P3.setBackground(new java.awt.Color(51, 51, 51));
        P3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Impact", 0, 27)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("User Profile");
        P3.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 140, 30));

        nameLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel1.setText("Name :");
        P3.add(nameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, 30));

        viewProfileName.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        viewProfileName.setForeground(new java.awt.Color(255, 255, 255));
        viewProfileName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewProfileName.setAlignmentX(0.5F);
        P3.add(viewProfileName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 310, 30));

        ageLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(255, 255, 255));
        ageLabel.setText("Age    :");
        P3.add(ageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, 30));

        polAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        polAge.setForeground(new java.awt.Color(255, 255, 255));
        P3.add(polAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 60, 30));

        homeAddLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        homeAddLabel.setForeground(new java.awt.Color(255, 255, 255));
        homeAddLabel.setText("Home Address    :");
        P3.add(homeAddLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, 30));

        polAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        polAddress.setForeground(new java.awt.Color(255, 255, 255));
        P3.add(polAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 430, 30));

        nameLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameLabel2.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel2.setText("Contact Number :");
        P3.add(nameLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, 30));

        polContact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        polContact.setForeground(new java.awt.Color(255, 255, 255));
        P3.add(polContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 330, 30));

        stationLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stationLabel.setForeground(new java.awt.Color(255, 255, 255));
        stationLabel.setText("Station Assigned : ");
        P3.add(stationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, 30));

        polStation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        polStation.setForeground(new java.awt.Color(255, 255, 255));
        P3.add(polStation, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 400, 30));

        homeAddLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        homeAddLabel2.setForeground(new java.awt.Color(255, 255, 255));
        homeAddLabel2.setText("Police Rank    :");
        P3.add(homeAddLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, 30));

        polRank.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        polRank.setForeground(new java.awt.Color(255, 255, 255));
        P3.add(polRank, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 130, 30));

        usernameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Police Username  :");
        P3.add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, 30));

        polUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        polUsername.setForeground(new java.awt.Color(255, 255, 255));
        P3.add(polUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 320, 30));

        viewProfilePic.setBackground(new java.awt.Color(255, 255, 255));
        viewProfilePic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewProfilePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prms/icons/icons8_user_130px_1.png"))); // NOI18N
        viewProfilePic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        viewProfilePic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewProfilePic.setOpaque(true);
        P3.add(viewProfilePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 130, 130));
        P3.add(carbonFibrBackground2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 600));

        jLayeredPane1.add(P3, "card2");

        P4.setBackground(new java.awt.Color(51, 51, 51));
        P4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTSTitleMainText1.setFont(new java.awt.Font("Iron Shark", 0, 14)); // NOI18N
        BTSTitleMainText1.setForeground(new java.awt.Color(255, 208, 0));
        BTSTitleMainText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BTSTitleMainText1.setText("Brion Tactical Systems");
        P4.add(BTSTitleMainText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 290, 30));

        BTSShadowText1.setFont(new java.awt.Font("Iron Shark", 0, 14)); // NOI18N
        BTSShadowText1.setForeground(new java.awt.Color(0, 0, 0));
        BTSShadowText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BTSShadowText1.setText("Brion Tactical Systems");
        P4.add(BTSShadowText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 290, 40));
        P4.add(BTSAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 250, 240));

        RegistrationMainText1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        RegistrationMainText1.setForeground(new java.awt.Color(255, 255, 255));
        RegistrationMainText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegistrationMainText1.setText("POLICE DATABASE");
        P4.add(RegistrationMainText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 270, 30));

        RegistrationShadowText1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        RegistrationShadowText1.setForeground(new java.awt.Color(0, 0, 0));
        RegistrationShadowText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegistrationShadowText1.setText("POLICE DATABASE");
        P4.add(RegistrationShadowText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 270, 40));

        aboutMission.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        aboutMission.setForeground(new java.awt.Color(255, 255, 255));
        aboutMission.setText("Mission");
        P4.add(aboutMission, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 110, 30));

        aboutVision.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        aboutVision.setForeground(new java.awt.Color(255, 255, 255));
        aboutVision.setText("Vision");
        P4.add(aboutVision, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 110, 30));

        missionLine1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        missionLine1.setForeground(new java.awt.Color(255, 255, 255));
        missionLine1.setText("To be the most concrete and informative in finding a personal information and");
        P4.add(missionLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 390, -1));

        missionLine2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        missionLine2.setForeground(new java.awt.Color(255, 255, 255));
        missionLine2.setText("crime status. Our agency aims to store, view information, add records or files");
        P4.add(missionLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 390, 30));

        missionLine3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        missionLine3.setForeground(new java.awt.Color(255, 255, 255));
        missionLine3.setText("pertaining to law enforcement operations such as criminal and personal information");
        P4.add(missionLine3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 400, 30));

        missionLine4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        missionLine4.setForeground(new java.awt.Color(255, 255, 255));
        missionLine4.setText("of every individual that may be involved in unlawful acts and requires proper");
        P4.add(missionLine4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 390, -1));

        missionLine5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        missionLine5.setForeground(new java.awt.Color(255, 255, 255));
        missionLine5.setText("investigation.");
        P4.add(missionLine5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 70, -1));

        visionLine1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        visionLine1.setForeground(new java.awt.Color(255, 255, 255));
        visionLine1.setText("To prove and see the people loyal to law, ethics and society and see ");
        P4.add(visionLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 390, -1));

        visionLine2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        visionLine2.setForeground(new java.awt.Color(255, 255, 255));
        visionLine2.setText("transparency of every people for them to respect the law and its punishments.");
        P4.add(visionLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 390, 30));

        visionLine3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        visionLine3.setForeground(new java.awt.Color(255, 255, 255));
        visionLine3.setText("Brion Tactical Systems aims to provide credible reports towards people that");
        P4.add(visionLine3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 400, 30));

        visionLine4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        visionLine4.setForeground(new java.awt.Color(255, 255, 255));
        visionLine4.setText("committed an unlawful crime wherein crimes committed shall be determined");
        P4.add(visionLine4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 390, -1));

        visionLine5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        visionLine5.setForeground(new java.awt.Color(255, 255, 255));
        visionLine5.setText("by the authority and law enforcement as fast as possible.");
        P4.add(visionLine5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 370, -1));

        DevTeam.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        DevTeam.setForeground(new java.awt.Color(255, 255, 255));
        DevTeam.setText("BTS Development Team");
        P4.add(DevTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 240, 30));

        DevTeam1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        DevTeam1.setForeground(new java.awt.Color(0, 0, 0));
        DevTeam1.setText("BTS Development Team");
        P4.add(DevTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 240, 40));

        BTSDevTeam5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BTSDevTeam5.setForeground(new java.awt.Color(255, 208, 0));
        BTSDevTeam5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BTSDevTeam5.setText("JHON BRIX BRION");
        P4.add(BTSDevTeam5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 220, -1));

        BTSDevTeam6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BTSDevTeam6.setForeground(new java.awt.Color(255, 255, 255));
        BTSDevTeam6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BTSDevTeam6.setText("LEAD DEVELOPER ");
        P4.add(BTSDevTeam6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 220, -1));

        BTSDevTeam4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BTSDevTeam4.setForeground(new java.awt.Color(255, 208, 0));
        BTSDevTeam4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BTSDevTeam4.setText("PAULA ANDREA NAVARRO");
        P4.add(BTSDevTeam4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 220, 20));

        BTSDevTeam7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BTSDevTeam7.setForeground(new java.awt.Color(255, 255, 255));
        BTSDevTeam7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BTSDevTeam7.setText("CO - DEVELOPER");
        P4.add(BTSDevTeam7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 220, 20));

        BTSDevTeam3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BTSDevTeam3.setForeground(new java.awt.Color(255, 208, 0));
        BTSDevTeam3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BTSDevTeam3.setText("ELISON SERRANO");
        P4.add(BTSDevTeam3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 220, 30));

        BTSDevTeam8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BTSDevTeam8.setForeground(new java.awt.Color(255, 255, 255));
        BTSDevTeam8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BTSDevTeam8.setText("ASSISTANT DEVELOPER");
        P4.add(BTSDevTeam8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 220, 30));

        aboutVision1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        aboutVision1.setForeground(new java.awt.Color(0, 0, 0));
        aboutVision1.setText("Vision");
        P4.add(aboutVision1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 110, 40));

        aboutMission1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        aboutMission1.setForeground(new java.awt.Color(0, 0, 0));
        aboutMission1.setText("Mission");
        P4.add(aboutMission1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 110, 40));
        P4.add(carbonFibrBackground3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 600));
        P4.add(carbonFibrBackground4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 600));

        jLayeredPane1.add(P4, "card3");

        P2.setBackground(new java.awt.Color(51, 51, 51));
        P2.setMaximumSize(new java.awt.Dimension(727, 551));
        P2.setPreferredSize(new java.awt.Dimension(727, 551));
        P2.setRequestFocusEnabled(false);
        P2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crimPicture.setBackground(new java.awt.Color(255, 255, 255));
        crimPicture.setForeground(new java.awt.Color(255, 255, 255));
        crimPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crimPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prms/icons/icons8_user_130px_1.png"))); // NOI18N
        crimPicture.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 208, 0), 1, true));
        crimPicture.setOpaque(true);
        P2.add(crimPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 130, 130));

        ImageChooser.setText("Browse");
        ImageChooser.setBackground(new java.awt.Color(0, 0, 32));
        ImageChooser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ImageChooser.setForeground(new java.awt.Color(255, 255, 255));
        ImageChooser.setOpaque(true);
        ImageChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImageChooserActionPerformed(evt);
            }
        });
        P2.add(ImageChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("Impact", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Record");
        P2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 200, 70));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(225, 237, 206));
        jLabel24.setText("Last Name    :");
        P2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 110, 30));

        txtLname.setBackground(new java.awt.Color(255, 255, 255));
        txtLname.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtLname.setForeground(new java.awt.Color(0, 0, 0));
        txtLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLnameActionPerformed(evt);
            }
        });
        P2.add(txtLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 390, 30));

        jLabel25.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(225, 237, 206));
        jLabel25.setText("First Name    :");
        P2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 110, 30));

        txtFname.setBackground(new java.awt.Color(255, 255, 255));
        txtFname.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtFname.setForeground(new java.awt.Color(0, 0, 0));
        txtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnameActionPerformed(evt);
            }
        });
        P2.add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 390, 30));

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(225, 237, 206));
        jLabel26.setText("Middle Name  :");
        P2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 110, 30));

        txtMname.setBackground(new java.awt.Color(255, 255, 255));
        txtMname.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtMname.setForeground(new java.awt.Color(0, 0, 0));
        txtMname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMnameActionPerformed(evt);
            }
        });
        P2.add(txtMname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 390, 30));

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(225, 237, 206));
        jLabel18.setText("Age              :");
        P2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 110, 30));

        txtAge.setBackground(new java.awt.Color(0, 0, 32));
        txtAge.setForeground(new java.awt.Color(255, 208, 0));
        txtAge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-0-", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "48", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "83", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", " ", " " }));
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        P2.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 130, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(225, 237, 206));
        jLabel22.setText("Gender  :");
        P2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 60, 30));

        txtGender.setBackground(new java.awt.Color(0, 0, 32));
        txtGender.setForeground(new java.awt.Color(255, 208, 0));
        txtGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "MALE", "FEMALE", "LESBIAN", "GAY", "TRANSGENDER", " " }));
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        P2.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 180, 30));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(225, 237, 206));
        jLabel17.setText("Date of Release : ");
        P2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, 30));

        dor.setBackground(new java.awt.Color(0, 0, 32));
        dor.setForeground(new java.awt.Color(255, 208, 0));
        dor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dor.setMaxSelectableDate(new java.util.Date(4102419700000L));
        dor.setMinSelectableDate(new java.util.Date(-25100000L));
        P2.add(dor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 200, 30));

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(225, 237, 206));
        jLabel19.setText("Residential Address :");
        P2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 30));

        txtAddress.setBackground(new java.awt.Color(255, 255, 255));
        txtAddress.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(0, 0, 0));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        P2.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 500, 30));

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(225, 237, 206));
        jLabel20.setText("State of Origin        :");
        P2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 30));

        txtOrigin.setBackground(new java.awt.Color(0, 0, 32));
        txtOrigin.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtOrigin.setForeground(new java.awt.Color(255, 208, 0));
        txtOrigin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarlac", "Pampanga", "Nueva Ecija", "Bulacan", "Pangasinan", "Zambales", "Aurora", "Bataan", " ", " " }));
        txtOrigin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOriginActionPerformed(evt);
            }
        });
        P2.add(txtOrigin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 500, 30));

        jLabel27.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(225, 237, 206));
        jLabel27.setText("Date of Arrest :");
        P2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 160, 30));

        doa.setBackground(new java.awt.Color(32, 32, 32));
        doa.setForeground(new java.awt.Color(255, 208, 0));
        doa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        doa.setMaxSelectableDate(new java.util.Date(4102419709000L));
        doa.setMinSelectableDate(new java.util.Date(-25091000L));
        P2.add(doa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 150, 30));

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(225, 237, 206));
        jLabel21.setText("Reason :");
        P2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, 30));

        txtCrime.setBackground(new java.awt.Color(0, 0, 32));
        txtCrime.setForeground(new java.awt.Color(255, 208, 0));
        txtCrime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "Murder", "Assault", "Possession of Illegal Drugs", "Illegal possession of firearms and ammunition", "Human Trafficking", "Drug Trafficking", "Disobedience of a Person in Authority", "Assault of a Person in Authority", "Illegal Detention", "Drunk Driving", "Extortion", "Forgery", "Fraud", "Harassment", "Identity Theft", "Rape", "Traffic Rage", "Theft", "Vandalism", "Homicide", "Damage to Property", "Bribery", "Child Abuse", "Cyber Crime", "Grave Misconduct", " " }));
        txtCrime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCrimeActionPerformed(evt);
            }
        });
        P2.add(txtCrime, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 310, 30));

        RESETbutton.setBackground(new java.awt.Color(100, 0, 0));
        RESETbutton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RESETbutton.setForeground(new java.awt.Color(255, 255, 255));
        RESETbutton.setText("Reset Fields");
        RESETbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RESETbutton.setOpaque(true);
        RESETbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETbuttonActionPerformed(evt);
            }
        });
        P2.add(RESETbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 110, 40));

        ADDbutton.setBackground(new java.awt.Color(18, 30, 49));
        ADDbutton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ADDbutton.setForeground(new java.awt.Color(255, 255, 255));
        ADDbutton.setText("Add Record");
        ADDbutton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ADDbutton.setOpaque(true);
        ADDbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDbuttonActionPerformed(evt);
            }
        });
        P2.add(ADDbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 100, 40));
        P2.add(carbonFibrBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 600));

        jLayeredPane1.add(P2, "card2");

        Dashboard.add(jLayeredPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(Dashboard, java.awt.BorderLayout.CENTER);

        MenuIcon1.setBackground(new java.awt.Color(0, 0, 32));
        MenuIcon1.setMinimumSize(new java.awt.Dimension(150, 500));
        MenuIcon1.setPreferredSize(new java.awt.Dimension(170, 500));
        MenuIcon1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Line1.setBackground(new java.awt.Color(32, 32, 32));
        Line1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 208, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MENU");

        javax.swing.GroupLayout Line1Layout = new javax.swing.GroupLayout(Line1);
        Line1.setLayout(Line1Layout);
        Line1Layout.setHorizontalGroup(
            Line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
        );
        Line1Layout.setVerticalGroup(
            Line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        MenuIcon1.add(Line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        BCTab.setBackground(new java.awt.Color(32, 32, 32));
        BCTab.setForeground(new java.awt.Color(255, 255, 255));
        BCTab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BCTab.setText("Police Records");
        BCTab.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        BCTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCTabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CriminalTabLayout = new javax.swing.GroupLayout(CriminalTab);
        CriminalTab.setLayout(CriminalTabLayout);
        CriminalTabLayout.setHorizontalGroup(
            CriminalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CriminalTabLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BCTab, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CriminalTabLayout.setVerticalGroup(
            CriminalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CriminalTabLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BCTab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuIcon1.add(CriminalTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 170, 50));

        BATab.setBackground(new java.awt.Color(32, 32, 32));
        BATab.setForeground(new java.awt.Color(255, 255, 255));
        BATab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BATab.setText("Add Record");
        BATab.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        BATab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BATabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AddCrimeLayout = new javax.swing.GroupLayout(AddCrime);
        AddCrime.setLayout(AddCrimeLayout);
        AddCrimeLayout.setHorizontalGroup(
            AddCrimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddCrimeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BATab, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AddCrimeLayout.setVerticalGroup(
            AddCrimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddCrimeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BATab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuIcon1.add(AddCrime, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 170, 50));

        BPTab.setBackground(new java.awt.Color(32, 32, 32));
        BPTab.setForeground(new java.awt.Color(255, 255, 255));
        BPTab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BPTab.setText("Police Profile");
        BPTab.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        BPTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BPTabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ProfileTabLayout = new javax.swing.GroupLayout(ProfileTab);
        ProfileTab.setLayout(ProfileTabLayout);
        ProfileTabLayout.setHorizontalGroup(
            ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProfileTabLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BPTab, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ProfileTabLayout.setVerticalGroup(
            ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProfileTabLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BPTab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuIcon1.add(ProfileTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 170, -1));

        BITab.setBackground(new java.awt.Color(32, 32, 32));
        BITab.setForeground(new java.awt.Color(255, 255, 255));
        BITab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BITab.setText("About           ");
        BITab.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        BITab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BITabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout InfoTabLayout = new javax.swing.GroupLayout(InfoTab);
        InfoTab.setLayout(InfoTabLayout);
        InfoTabLayout.setHorizontalGroup(
            InfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoTabLayout.createSequentialGroup()
                .addComponent(BITab, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        InfoTabLayout.setVerticalGroup(
            InfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoTabLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BITab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuIcon1.add(InfoTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 170, -1));

        javax.swing.GroupLayout Line2Layout = new javax.swing.GroupLayout(Line2);
        Line2.setLayout(Line2Layout);
        Line2Layout.setHorizontalGroup(
            Line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        Line2Layout.setVerticalGroup(
            Line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        MenuIcon1.add(Line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 170, 10));

        javax.swing.GroupLayout Line3Layout = new javax.swing.GroupLayout(Line3);
        Line3.setLayout(Line3Layout);
        Line3Layout.setHorizontalGroup(
            Line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        Line3Layout.setVerticalGroup(
            Line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        MenuIcon1.add(Line3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, 10));

        getContentPane().add(MenuIcon1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(0, 0, 32));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 208, 0)));
        jPanel2.setForeground(new java.awt.Color(0, 0, 32));
        jPanel2.setPreferredSize(new java.awt.Dimension(920, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MinimizerBtn.setBackground(new java.awt.Color(60, 63, 65));
        MinimizerBtn.setForeground(new java.awt.Color(60, 63, 65));
        MinimizerBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prms/icons/icons8_minimize_window_32px.png"))); // NOI18N
        MinimizerBtn.setToolTipText("Exit");
        MinimizerBtn.setAlignmentY(0.0F);
        MinimizerBtn.setBorder(null);
        MinimizerBtn.setBorderPainted(false);
        MinimizerBtn.setName(""); // NOI18N
        MinimizerBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/prms/icons/icons8_minimize_window_32px_2.png"))); // NOI18N
        MinimizerBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/prms/icons/icons8_minimize_window_32px_1.png"))); // NOI18N
        MinimizerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizerBtnActionPerformed(evt);
            }
        });
        jPanel2.add(MinimizerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 30, 30));

        LogOut.setBackground(new java.awt.Color(0, 34, 0));
        LogOut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LogOut.setForeground(new java.awt.Color(255, 255, 255));
        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prms/icons/icons8_exit_32px_9.png"))); // NOI18N
        LogOut.setText("Log Out\n");
        LogOut.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        LogOut.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/prms/icons/icons8_export_32px_7.png"))); // NOI18N
        LogOut.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/prms/icons/icons8_exit_32px_9_1.png"))); // NOI18N
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        jPanel2.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 52, 120, 30));

        BTSTitleMainText.setFont(new java.awt.Font("Iron Shark", 0, 14)); // NOI18N
        BTSTitleMainText.setForeground(new java.awt.Color(255, 208, 0));
        BTSTitleMainText.setText("Brion Tactical Systems");
        jPanel2.add(BTSTitleMainText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 300, 30));

        BTSShadowText.setFont(new java.awt.Font("Iron Shark", 0, 14)); // NOI18N
        BTSShadowText.setForeground(new java.awt.Color(0, 0, 0));
        BTSShadowText.setText("Brion Tactical Systems");
        jPanel2.add(BTSShadowText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 320, 40));

        RegistrationMainText.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        RegistrationMainText.setForeground(new java.awt.Color(255, 255, 255));
        RegistrationMainText.setText("POLICE DATABASE");
        jPanel2.add(RegistrationMainText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 270, 30));

        RegistrationShadowText.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        RegistrationShadowText.setForeground(new java.awt.Color(0, 0, 0));
        RegistrationShadowText.setText("POLICE DATABASE");
        jPanel2.add(RegistrationShadowText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 270, 40));

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
        jPanel2.add(FrameDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 100));

        userAccIdentificaion.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        userAccIdentificaion.setForeground(new java.awt.Color(255, 255, 255));
        userAccIdentificaion.setText("POLICE OFFICER");
        jPanel2.add(userAccIdentificaion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 50));

        userAccIdentificaionShdw.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        userAccIdentificaionShdw.setForeground(new java.awt.Color(0, 0, 0));
        userAccIdentificaionShdw.setText("POLICE OFFICER");
        jPanel2.add(userAccIdentificaionShdw, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 60));

        BTSLogoAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BTSLogoAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(BTSLogoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 130, 130));

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public static java.sql.Date convertUtilDateToSqlDate(java.util.Date date){
    if(date != null) {
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        
        return sqlDate;
    }
    return null;
    }
    
    // IMAGE CHOOSER
    String ImagePath = null;
    public void Clearfields(){
        txtLname.setText("");
        txtFname.setText("");
        txtMname.setText("");
        txtAddress.setText("");
        txtAge.setSelectedIndex(0);
        txtGender.setSelectedIndex(0);
        txtCrime.setSelectedIndex(0);
        txtOrigin.setSelectedIndex(0);
        txtAddress.setText("");
        ImageIcon imageIcon = new ImageIcon(Login.iconLoc);
        Image imagePicture = imageIcon.getImage();

        Image resizeImage = imagePicture.getScaledInstance(130,130, Image.SCALE_SMOOTH);
        ImageIcon myPicture = new ImageIcon(resizeImage);
        crimPicture.setIcon(myPicture);
        
//}        
    }        
    private void BCTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCTabMouseClicked
        P1.setVisible(true);
        P2.setVisible(false);
        P3.setVisible(false);
        P4.setVisible(false);
        CriminalTab.setBackground(new Color (159, 159, 159));
        AddCrime.setBackground(new Color(128, 128, 128));
        ProfileTab.setBackground(new Color(128, 128, 128));
        InfoTab.setBackground(new Color(128, 128, 128));       // BUTTON CRIMINAL TAB
    }//GEN-LAST:event_BCTabMouseClicked

    private void BATabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BATabMouseClicked
        P2.setVisible(true);
        P1.setVisible(false);
        P3.setVisible(false);
        P4.setVisible(false);
        AddCrime.setBackground(new Color (159, 159, 159));
        ProfileTab.setBackground(new Color(128, 128, 128));
        CriminalTab.setBackground(new Color(128, 128, 128));
        InfoTab.setBackground(new Color(128, 128, 128));   //BUTTON ADD CRIMINAL TAB     
    }//GEN-LAST:event_BATabMouseClicked

    private void BPTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BPTabMouseClicked
        P3.setVisible(true);
        P1.setVisible(false);
        P2.setVisible(false);
        P4.setVisible(false);
        ProfileTab.setBackground(new Color (159, 159, 159));
        AddCrime.setBackground(new Color(128, 128, 128));
        CriminalTab.setBackground(new Color(128, 128, 128));
        InfoTab.setBackground(new Color(128, 128, 128));         
    }//GEN-LAST:event_BPTabMouseClicked

    private void BITabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BITabMouseClicked
        P4.setVisible(true);
        P1.setVisible(false);
        P2.setVisible(false);
        P3.setVisible(false);
        InfoTab.setBackground(new Color (159, 159, 159));
        AddCrime.setBackground(new Color(128, 128, 128));
        CriminalTab.setBackground(new Color(128, 128, 128));
        ProfileTab.setBackground(new Color(128, 128, 128));
        // INFO TAB
        
    }//GEN-LAST:event_BITabMouseClicked

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked

    }//GEN-LAST:event_listMouseClicked

    private void crimListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crimListMouseClicked
        // TODO add your handling code here:
        crimList.setCellSelectionEnabled(false);
        crimList.setRowSelectionAllowed(true);
        
        
        int number = crimList.getSelectedRow();
        ID.setText(crimList.getValueAt(number, 0).toString());
        String conCat = crimList.getValueAt(number, 1).toString()+", " + crimList.getValueAt(number, 2).toString()
                +" " + crimList.getValueAt(number, 3).toString();
        String upperCase = conCat.toUpperCase();
        crimName.setText(upperCase);
        address.setText(crimList.getValueAt(number, 4).toString());
        DOA.setText(crimList.getValueAt(number, 5).toString());
        DOR.setText(crimList.getValueAt(number, 6).toString());
        Age.setText(crimList.getValueAt(number, 7).toString());
        gender.setText(crimList.getValueAt(number, 8).toString());
        crime.setText(crimList.getValueAt(number, 9).toString());
        origin.setText(crimList.getValueAt(number, 10).toString());
        
        
        Connection conn = DBConnection.connectDB();
        if(conn != null){
            try{
                String username = ID.getText();
                PreparedStatement ps = (PreparedStatement) conn.prepareStatement("SELECT crimPicture FROM prmscriminalrecords WHERE id = ?");
                ps.setString(1, username);
                
                ResultSet rs = ps.executeQuery();
                
                if(rs.next()){
                    byte[] imageBytes = rs.getBytes("crimPicture");          
                    ImageIcon imageIcon = new ImageIcon(imageBytes);
                    Image imagePicture = imageIcon.getImage();
                    Image resizeImage = imagePicture.getScaledInstance(130,130, Image.SCALE_SMOOTH);
                    ImageIcon myPicture = new ImageIcon(resizeImage);
                    viewPicture.setIcon(myPicture);

                }
            } catch (SQLException ex) {
            Logger.getLogger(PRMSOfficerGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Police Database connection Unavailable! Check your JDBC Connector");
            JOptionPane.showMessageDialog(this, "Police database connection unavailable!\r\n"
               + "Please Check your JDBC Connector!", "POLICE DATABASE", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_crimListMouseClicked
        
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

            crimPicture.setIcon(resizePic(Path));

        }else if(fileState == JFileChooser.CANCEL_OPTION){
            System.out.println("No Image Selected");
            JOptionPane.showMessageDialog(this, "Form Fill is incomplete! Please Fill up the form properly.", "POLICE DATABASE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ImageChooserActionPerformed

    private void MinimizerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizerBtnActionPerformed
        // TODO add your handling code here:
        setState(PRMSOfficerGUI.ICONIFIED);
    }//GEN-LAST:event_MinimizerBtnActionPerformed

    private void RefreshACLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshACLActionPerformed
        // TODO add your handling code here:
        // GET DATA TO DATABASE
        Connection dbconn = DBConnection.connectDB();
        String sqlQuery = "SELECT * FROM prmscriminalrecords";
        if(dbconn != null){
            try {
                Statement st = (Statement)            
                        dbconn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                        ResultSet rs = st.executeQuery(sqlQuery);
                        crimList.setModel(DbUtils.resultSetToTableModel(rs));
                        crimList.getColumnModel().getColumn(0).setPreferredWidth(50);
                        crimList.getColumnModel().getColumn(1).setPreferredWidth(150);
                        crimList.getColumnModel().getColumn(2).setPreferredWidth(150);
                        crimList.getColumnModel().getColumn(3).setPreferredWidth(150);
                        crimList.getColumnModel().getColumn(4).setPreferredWidth(400);
                        crimList.getColumnModel().getColumn(5).setPreferredWidth(150);
                        crimList.getColumnModel().getColumn(6).setPreferredWidth(150);
                        crimList.getColumnModel().getColumn(7).setPreferredWidth(150);
                        crimList.getColumnModel().getColumn(8).setPreferredWidth(150);
                        crimList.getColumnModel().getColumn(9).setPreferredWidth(150);
                        crimList.getColumnModel().getColumn(10).setPreferredWidth(150);
                        TableColumn tcol = crimList.getColumnModel().getColumn(11);
                        crimList.removeColumn(tcol);

                        String header[] = {"ID","LAST NAME", "FIRST NAME", "MIDDLE NAME", "ADDRESS", "DATE OF ARREST", "DATE OF RELEASE", "AGE", "GENDER", "STATUS", "ORIGIN", ""};

                        for(int i=0;i<crimList.getColumnCount();i++)
                        {
                        TableColumn column1 = crimList.getTableHeader().getColumnModel().getColumn(i);

                        column1.setHeaderValue(header[i]);
                        } 
            } catch (SQLException ex) {
            Logger.getLogger(PRMSOfficerGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Police Database connection Unavailable! Check your JDBC Connector");
            JOptionPane.showMessageDialog(this, "Police database connection unavailable!\r\n"
               + "Please Check your JDBC Connector!", "POLICE DATABASE", JOptionPane.INFORMATION_MESSAGE);
        }
           
    }//GEN-LAST:event_RefreshACLActionPerformed

    private void SearchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchBarKeyReleased
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)crimList.getModel();
        String search = SearchBar.getText();
        @SuppressWarnings("Convert2Diamond")
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        crimList.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_SearchBarKeyReleased

    private void txtLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLnameActionPerformed
        txtLname.setEnabled(true);
        txtLname.setEnabled(false);
    }//GEN-LAST:event_txtLnameActionPerformed

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed

    }//GEN-LAST:event_txtFnameActionPerformed

    private void txtMnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMnameActionPerformed

    }//GEN-LAST:event_txtMnameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed

    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed

    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed

    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtCrimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCrimeActionPerformed

    }//GEN-LAST:event_txtCrimeActionPerformed

    private void RESETbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETbuttonActionPerformed
        // RESET Input DATA
        Clearfields();
    }//GEN-LAST:event_RESETbuttonActionPerformed

    private void ADDbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDbuttonActionPerformed
        // TODO add your handling code here;

        //NAME
        String Lname = txtLname.getText();
        String Fname = txtFname.getText();
        String Mname = txtMname.getText();
        String rAddress = txtAddress.getText();

        if(Lname.isEmpty() || Fname.isEmpty() || Mname.isEmpty() || rAddress.isEmpty() || ImagePath == null)
        {
            JOptionPane.showMessageDialog(this, "Form Fill is incomplete! Please Fill up the form properly.", "PRMS DATABASE", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                ADDbutton(Lname, Fname, Mname, rAddress);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PRMSOfficerGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_ADDbuttonActionPerformed

    private void txtOriginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOriginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOriginActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        // TODO add your handling code here:
        PrintPDF printIt = new PrintPDF();
        printIt.setTitle("Brion Tactical System : PRMS DATABASE (PRINT)");
        printIt.setVisible(true);
    }//GEN-LAST:event_printButtonActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
              // CUSTOM EXIT BUTTON
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want Log Out?","Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if(response==JOptionPane.YES_OPTION) {
            dispose();
            Login returnToLogin = new Login();
            returnToLogin.setTitle("Brion Tactical Systems : PRMS DATABASE");
            returnToLogin.setLocationRelativeTo(null);
            returnToLogin.setVisible(true);
        }else if (response==JOptionPane.NO_OPTION) {
            System.out.println(".");
        }
    }//GEN-LAST:event_LogOutActionPerformed
    
    /**
     * @param args the command line arguments
     */
       
        public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                } else {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRMSOfficerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

            java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
                public void run() {
                    new PRMSOfficerGUI().setVisible(true);
   
            }
        });
        }
        
                

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDbutton;
    private javax.swing.JPanel AddCrime;
    private javax.swing.JLabel Age;
    private javax.swing.JLabel BATab;
    private javax.swing.JLabel BCTab;
    private javax.swing.JLabel BITab;
    private javax.swing.JLabel BPTab;
    public javax.swing.JLabel BTSAbout;
    private javax.swing.JLabel BTSDevTeam3;
    private javax.swing.JLabel BTSDevTeam4;
    private javax.swing.JLabel BTSDevTeam5;
    private javax.swing.JLabel BTSDevTeam6;
    private javax.swing.JLabel BTSDevTeam7;
    private javax.swing.JLabel BTSDevTeam8;
    private javax.swing.JLabel BTSLogoAdmin;
    private javax.swing.JLabel BTSShadowText;
    public javax.swing.JLabel BTSShadowText1;
    private javax.swing.JLabel BTSTitleMainText;
    public javax.swing.JLabel BTSTitleMainText1;
    private javax.swing.JPanel CriminalTab;
    private javax.swing.JLabel DOA;
    private javax.swing.JLabel DOR;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JLabel DevTeam;
    private javax.swing.JLabel DevTeam1;
    private javax.swing.JLabel FrameDrag;
    private javax.swing.JLabel ID;
    private javax.swing.JButton ImageChooser;
    private javax.swing.JPanel InfoTab;
    private javax.swing.JPanel Line1;
    private javax.swing.JPanel Line2;
    private javax.swing.JPanel Line3;
    private javax.swing.JButton LogOut;
    private javax.swing.JPanel MenuIcon1;
    private javax.swing.JButton MinimizerBtn;
    private javax.swing.JPanel P1;
    private javax.swing.JPanel P2;
    private javax.swing.JPanel P3;
    private javax.swing.JPanel P4;
    private javax.swing.JPanel ProfileTab;
    private javax.swing.JButton RESETbutton;
    private javax.swing.JButton RefreshACL;
    private javax.swing.JLabel RegistrationMainText;
    public javax.swing.JLabel RegistrationMainText1;
    private javax.swing.JLabel RegistrationShadowText;
    public javax.swing.JLabel RegistrationShadowText1;
    private javax.swing.JTextField SearchBar;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel aboutMission;
    private javax.swing.JLabel aboutMission1;
    private javax.swing.JLabel aboutVision;
    private javax.swing.JLabel aboutVision1;
    private javax.swing.JLabel address;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel carbonFibrBackground;
    private javax.swing.JLabel carbonFibrBackground1;
    private javax.swing.JLabel carbonFibrBackground2;
    private javax.swing.JLabel carbonFibrBackground3;
    private javax.swing.JLabel carbonFibrBackground4;
    private javax.swing.JTable crimList;
    private javax.swing.JLabel crimName;
    private javax.swing.JLabel crimPicture;
    private javax.swing.JLabel crime;
    private com.toedter.calendar.JDateChooser doa;
    private com.toedter.calendar.JDateChooser dor;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel homeAddLabel;
    private javax.swing.JLabel homeAddLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel missionLine1;
    private javax.swing.JLabel missionLine2;
    private javax.swing.JLabel missionLine3;
    private javax.swing.JLabel missionLine4;
    private javax.swing.JLabel missionLine5;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JLabel origin;
    public static javax.swing.JLabel polAddress;
    public static javax.swing.JLabel polAge;
    public static javax.swing.JLabel polContact;
    public static javax.swing.JLabel polRank;
    public static javax.swing.JLabel polStation;
    public static javax.swing.JLabel polUsername;
    private javax.swing.JButton printButton;
    private javax.swing.JLabel stationLabel;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JComboBox<String> txtAge;
    private javax.swing.JComboBox<String> txtCrime;
    private javax.swing.JTextField txtFname;
    private javax.swing.JComboBox<String> txtGender;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtMname;
    private javax.swing.JComboBox<String> txtOrigin;
    private javax.swing.JLabel userAccIdentificaion;
    private javax.swing.JLabel userAccIdentificaionShdw;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel viewPicture;
    public static javax.swing.JLabel viewProfileName;
    public static javax.swing.JLabel viewProfilePic;
    private javax.swing.JLabel visionLine1;
    private javax.swing.JLabel visionLine2;
    private javax.swing.JLabel visionLine3;
    private javax.swing.JLabel visionLine4;
    private javax.swing.JLabel visionLine5;
    // End of variables declaration//GEN-END:variables
    
    private void ADDbutton(String Lname, String Fname, String Mname, String rAddress) throws FileNotFoundException {
        
        java.util.Date date1 = doa.getDate();
        java.util.Date date2 = dor.getDate();
        
        java.sql.Date DoArrest = convertUtilDateToSqlDate(date1);
        java.sql.Date DoRelease = convertUtilDateToSqlDate(date2);
        Connection dbconn = DBConnection.connectDB();
        if(dbconn != null){ 
            try {
                PreparedStatement st = (PreparedStatement)
                        dbconn.prepareStatement("INSERT INTO prmscriminalrecords (txtLname, txtFname, txtMname, txtAddress, doa, dor, txtAge, txtGender, txtCrime, txtOrigin, crimPicture) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
               
                st.setString(1, Lname);
                st.setString(2, Fname);
                st.setString(3, Mname);
                st.setString(4, rAddress);
                st.setDate(5, DoArrest);
                st.setDate(6, DoRelease);
                st.setString(7, txtAge.getSelectedItem().toString());
                st.setString(8, txtGender.getSelectedItem().toString());
                st.setString(9, txtCrime.getSelectedItem().toString());
                st.setString(10, txtOrigin.getSelectedItem().toString());
                InputStream ProfPicture = new FileInputStream(new File(ImagePath));
                st.setBlob(11, ProfPicture);
                
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Success! Criminal Record has been created.", "PRMS DATABASE ", JOptionPane.INFORMATION_MESSAGE);
                
                txtLname.setText("");
                txtFname.setText("");
                txtMname.setText("");
                txtAddress.setText("");
                this.doa.toString();
                this.dor.toString();
                txtAge.getSelectedItem().toString();
                txtGender.getSelectedItem().toString();
                txtCrime.getSelectedItem().toString();
                txtOrigin.getSelectedItem().toString();
            } catch (SQLException ex) {
            Logger.getLogger(PRMSOfficerGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Police Database connection Unavailable! Check your JDBC Connector");
            JOptionPane.showMessageDialog(this, "Police database connection unavailable!\r\n"
               + "Please Check your JDBC Connector!", "POLICE DATABASE", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}