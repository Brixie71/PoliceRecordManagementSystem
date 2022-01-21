/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prms;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author PANN
 */
public class PrintPDF extends javax.swing.JFrame {
    public PrintPDF() {
        initComponents();
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
            Logger.getLogger(PrintPDF.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Police Database connection Unavailable! Check your JDBC Connector");
            JOptionPane.showMessageDialog(this, "Police database connection unavailable!\r\n"
               + "Please Check your JDBC Connector!", "POLICE DATABASE", JOptionPane.INFORMATION_MESSAGE);
        }
           
            // CENTER POPUP WINDOW
            Toolkit toolkit = getToolkit();
            Dimension size = toolkit.getScreenSize();
            setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
            
            // CARBON FIBER BACKGROUND
            ImageIcon icon = new ImageIcon(Login.CarbonLoc);
            Image LoginBackground = icon.getImage();
            Image imgScale = LoginBackground.getScaledInstance(carbonFibrBackground.getWidth(), carbonFibrBackground.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(imgScale);
            carbonFibrBackground.setIcon(scaledIcon);
            
            // LOGO
            ImageIcon BTSLogoPrnt = new ImageIcon(Login.LogoLoc);
            Image logo = BTSLogoPrnt.getImage();
            Image LogoPrntScale = logo.getScaledInstance(BTSLogoPrint.getWidth(), BTSLogoPrint.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledLogo = new ImageIcon(LogoPrntScale);
            BTSLogoPrint.setIcon(scaledLogo);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        printBtn = new javax.swing.JButton();
        fakePdfPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        viewPicture = new javax.swing.JLabel();
        crimName = new javax.swing.JTextField();
        DOR = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        origin = new javax.swing.JTextField();
        crime = new javax.swing.JTextField();
        DOA = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        list2 = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        Age = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        MinimizerBtn = new javax.swing.JButton();
        RegistrationExit = new javax.swing.JButton();
        BTSTitleMainText = new javax.swing.JLabel();
        BTSShadowText = new javax.swing.JLabel();
        RegistrationMainText = new javax.swing.JLabel();
        RegistrationShadowText = new javax.swing.JLabel();
        BTSLogoPrint = new javax.swing.JLabel();
        FrameDrag = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        crimList = new javax.swing.JTable(){
            public boolean editCellAt(int row, int column, java.util.EventObject e){

                return false;
            }

        };
        SearchBar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        carbonFibrBackground = new javax.swing.JLabel();

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setText("______________________________________");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        printBtn.setBackground(new java.awt.Color(0, 0, 32));
        printBtn.setForeground(new java.awt.Color(255, 255, 255));
        printBtn.setText("PRINT RECORD");
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });
        jPanel2.add(printBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 130, 40));

        fakePdfPanel.setBackground(new java.awt.Color(255, 255, 255));
        fakePdfPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BRION TACTICAL SYSTEMS");
        fakePdfPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name :");
        fakePdfPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Date of Release :");
        fakePdfPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Gender :");
        fakePdfPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Residential Address :");
        fakePdfPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Province of Origin :");
        fakePdfPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Reason  :");
        fakePdfPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Date of Arrest :");
        fakePdfPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("- Police Record Sheet -");
        fakePdfPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        viewPicture.setBackground(new java.awt.Color(0, 0, 0));
        viewPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prms/icons/icons8_user_130px_1.png"))); // NOI18N
        viewPicture.setText("Photo");
        viewPicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        viewPicture.setPreferredSize(new java.awt.Dimension(130, 130));
        fakePdfPanel.add(viewPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 130, 130));

        crimName.setBackground(new java.awt.Color(255, 255, 255));
        crimName.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        crimName.setForeground(new java.awt.Color(0, 0, 0));
        crimName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        crimName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crimNameActionPerformed(evt);
            }
        });
        fakePdfPanel.add(crimName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 300, 20));

        DOR.setBackground(new java.awt.Color(255, 255, 255));
        DOR.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        DOR.setForeground(new java.awt.Color(0, 0, 0));
        DOR.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        fakePdfPanel.add(DOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 120, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        fakePdfPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 375, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Age :");
        fakePdfPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, 20));

        gender.setBackground(new java.awt.Color(255, 255, 255));
        gender.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        gender.setForeground(new java.awt.Color(0, 0, 0));
        gender.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        fakePdfPanel.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 130, 20));

        address.setBackground(new java.awt.Color(255, 255, 255));
        address.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        address.setForeground(new java.awt.Color(0, 0, 0));
        address.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        fakePdfPanel.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 260, -1));

        origin.setBackground(new java.awt.Color(255, 255, 255));
        origin.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        origin.setForeground(new java.awt.Color(0, 0, 0));
        origin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        origin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originActionPerformed(evt);
            }
        });
        fakePdfPanel.add(origin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 250, -1));

        crime.setBackground(new java.awt.Color(255, 255, 255));
        crime.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        crime.setForeground(new java.awt.Color(0, 0, 0));
        crime.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        fakePdfPanel.add(crime, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 310, -1));

        DOA.setBackground(new java.awt.Color(255, 255, 255));
        DOA.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        DOA.setForeground(new java.awt.Color(0, 0, 0));
        DOA.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        fakePdfPanel.add(DOA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 120, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("-Arrest and Sentencing Information-");
        fakePdfPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("------------------------------------------------------------------------------------------------------");
        fakePdfPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 272, 524, -1));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("------------------------------------------------------------------------------------------------------");
        fakePdfPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 81, 510, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Criminal ID :");
        fakePdfPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        ID.setBackground(new java.awt.Color(255, 255, 255));
        ID.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        ID.setForeground(new java.awt.Color(0, 0, 0));
        ID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        fakePdfPanel.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 70, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("- Fingerprints -");
        fakePdfPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 310, 20));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fakePdfPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 422, 65, 62));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fakePdfPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 422, 67, 62));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fakePdfPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 422, 68, 62));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("______________________________________");
        fakePdfPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 422, 192, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("-Signature-");
        fakePdfPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 180, -1));

        list2.setBackground(new java.awt.Color(255, 255, 255));
        list2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        list2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        list2.setForeground(new java.awt.Color(0, 0, 0));
        list2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"               DATE", "  CHARGE AND DESCRIPTION", "                 TERM"},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "DATE", "CODE", "TERM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        list2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        list2.setSelectionBackground(new java.awt.Color(0, 0, 102));
        list2.setSelectionForeground(new java.awt.Color(255, 255, 255));
        list2.setShowGrid(true);
        list2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list2MouseClicked(evt);
            }
        });
        fakePdfPanel.add(list2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 313, 525, -1));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fakePdfPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 422, 65, 62));

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("___________________________________");
        fakePdfPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 532, -1, -1));

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("______________________________________");
        fakePdfPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 444, 192, -1));

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("______________________________________");
        fakePdfPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 466, 192, -1));

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("______________________________________");
        fakePdfPanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 490, 192, -1));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("R. Thumbs");
        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fakePdfPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 490, 67, 12));

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("L. Thumbs");
        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fakePdfPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 490, 67, 12));

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("R. Index");
        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fakePdfPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 490, 67, 12));

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("L. Index");
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fakePdfPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 67, 12));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("- Other Information -");
        fakePdfPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 401, 140, -1));

        jLabel35.setBackground(new java.awt.Color(0, 0, 0));
        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setText("______________________________________");
        fakePdfPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 512, 192, -1));

        jLabel36.setBackground(new java.awt.Color(0, 0, 0));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setText("______________________________________");
        fakePdfPanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 537, 192, -1));

        jLabel37.setBackground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("------------------------------------------------------------------------------------------------------");
        fakePdfPanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 379, 525, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Case no. 890809");
        fakePdfPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 76, 102, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Form JV-F 96-02-01");
        fakePdfPanel.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 565, 102, -1));

        Age.setEditable(false);
        Age.setBackground(new java.awt.Color(255, 255, 255));
        Age.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        Age.setForeground(new java.awt.Color(0, 0, 0));
        Age.setAutoscrolls(false);
        Age.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 6));
        Age.setOpaque(false);
        Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeActionPerformed(evt);
            }
        });
        fakePdfPanel.add(Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 50, 20));

        jPanel2.add(fakePdfPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 560, -1));

        jButton3.setBackground(new java.awt.Color(100, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Clear Form Fields");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 160, 41));

        jPanel3.setBackground(new java.awt.Color(0, 0, 32));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 208, 0)));
        jPanel3.setForeground(new java.awt.Color(0, 0, 32));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MinimizerBtn.setBackground(null
        );
        MinimizerBtn.setForeground(null
        );
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
        jPanel3.add(MinimizerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 30, 30));

        RegistrationExit.setBackground(null
        );
        RegistrationExit.setForeground(null
        );
        RegistrationExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prms/icons/icons8_x_coordinate_32px_1.png"))); // NOI18N
        RegistrationExit.setToolTipText("Exit");
        RegistrationExit.setAlignmentY(0.0F);
        RegistrationExit.setBorderPainted(false);
        RegistrationExit.setName(""); // NOI18N
        RegistrationExit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/prms/icons/icons8_x_coordinate_32px.png"))); // NOI18N
        RegistrationExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/prms/icons/icons8_x_coordinate_32px_2.png"))); // NOI18N
        RegistrationExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationExitActionPerformed(evt);
            }
        });
        jPanel3.add(RegistrationExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 30, 30));

        BTSTitleMainText.setFont(new java.awt.Font("Iron Shark", 0, 14)); // NOI18N
        BTSTitleMainText.setForeground(new java.awt.Color(255, 208, 0));
        BTSTitleMainText.setText("Brion Tactical Systems");
        jPanel3.add(BTSTitleMainText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 300, 30));

        BTSShadowText.setFont(new java.awt.Font("Iron Shark", 0, 14)); // NOI18N
        BTSShadowText.setForeground(new java.awt.Color(0, 0, 0));
        BTSShadowText.setText("Brion Tactical Systems");
        jPanel3.add(BTSShadowText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 320, 40));

        RegistrationMainText.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        RegistrationMainText.setForeground(new java.awt.Color(255, 255, 255));
        RegistrationMainText.setText("PRINT POLICE RECORD");
        jPanel3.add(RegistrationMainText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 270, 30));

        RegistrationShadowText.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        RegistrationShadowText.setForeground(new java.awt.Color(0, 0, 0));
        RegistrationShadowText.setText("PRINT POLICE RECORD");
        jPanel3.add(RegistrationShadowText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 270, 40));

        BTSLogoPrint.setText("BTSLogo");
        jPanel3.add(BTSLogoPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 110, 100));

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
        jPanel3.add(FrameDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 90));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 90));

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

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 220, 250));

        SearchBar.setBackground(java.awt.Color.white);
        SearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBarActionPerformed(evt);
            }
        });
        SearchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchBarKeyReleased(evt);
            }
        });
        jPanel2.add(SearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 90, 30));

        jLabel11.setBackground(new java.awt.Color(32, 32, 32));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID SEARCH :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 70, 30));
        jPanel2.add(carbonFibrBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        //ptint button
        
        printRecord(fakePdfPanel);
        
        
    }//GEN-LAST:event_printBtnActionPerformed
    public void Clearfields(){
        ID.setText("");
        crimName.setText("");
        DOA.setText("");
        Age.setText("");
        gender.setText("");
        address.setText("");
        origin.setText("");
        crime.setText("");
        DOR.setText("");
        ImageIcon imageIcon = new ImageIcon(Login.iconLoc);
        Image imagePicture = imageIcon.getImage();
        Image resizeImage = imagePicture.getScaledInstance(130,130, Image.SCALE_SMOOTH);
        ImageIcon myPicture = new ImageIcon(resizeImage);
        viewPicture.setIcon(myPicture);

}
   
    private void originActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_originActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_originActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Clear preview
        Clearfields();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void list2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_list2MouseClicked

    private void MinimizerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizerBtnActionPerformed

        setState(Registration.ICONIFIED);
    }//GEN-LAST:event_MinimizerBtnActionPerformed

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
            Logger.getLogger(PrintPDF.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Police Database connection Unavailable! Check your JDBC Connector");
            JOptionPane.showMessageDialog(this, "Police database connection unavailable!\r\n"
               + "Please Check your JDBC Connector!", "POLICE DATABASE", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_crimListMouseClicked

    private void crimNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crimNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crimNameActionPerformed

    private void SearchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchBarKeyReleased
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)crimList.getModel();
        String search = SearchBar.getText().toLowerCase();
        @SuppressWarnings("Convert2Diamond")
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        crimList.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_SearchBarKeyReleased

    private void SearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBarActionPerformed

    private void AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PrintPDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PrintPDF().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age;
    private javax.swing.JLabel BTSLogoPrint;
    private javax.swing.JLabel BTSShadowText;
    private javax.swing.JLabel BTSTitleMainText;
    private javax.swing.JTextField DOA;
    private javax.swing.JTextField DOR;
    private javax.swing.JLabel FrameDrag;
    private javax.swing.JTextField ID;
    private javax.swing.JButton MinimizerBtn;
    private javax.swing.JButton RegistrationExit;
    private javax.swing.JLabel RegistrationMainText;
    private javax.swing.JLabel RegistrationShadowText;
    private javax.swing.JTextField SearchBar;
    private javax.swing.JTextField address;
    private javax.swing.JLabel carbonFibrBackground;
    private javax.swing.JTable crimList;
    private javax.swing.JTextField crimName;
    private javax.swing.JTextField crime;
    private javax.swing.JPanel fakePdfPanel;
    private javax.swing.JTextField gender;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable list2;
    private javax.swing.JTextField origin;
    private javax.swing.JButton printBtn;
    private javax.swing.JLabel viewPicture;
    // End of variables declaration//GEN-END:variables
    // method  for to print panel contents
    
    private void printRecord(JPanel panel){
       // create printer job
       PrinterJob printerjob=PrinterJob.getPrinterJob();
       //Set printer job name
       printerjob.setJobName("Print Record");
       // Set printable
       printerjob.setPrintable(new Printable() {
           @Override
           public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
              //check if no ptrintable content
              if(pageIndex > 0){
               return Printable.NO_SUCH_PAGE;
           }
           Graphics2D graphics2d = (Graphics2D)graphics;
           graphics2d.translate(pageFormat.getImageableX()*15,pageFormat.getImageableY()*15);
           graphics2d.scale(1.07,1.3);
           
           panel.paint(graphics2d);
                   
               return Printable.PAGE_EXISTS;

           }
       });
       
       boolean returningResult = printerjob.printDialog();
       
       if (returningResult) {
           
           try{
               
               printerjob.print();
               
           }catch(PrinterException printerexception){
               JOptionPane.showMessageDialog(this,"Printing Cancelled" );
           }
       }
    }

}

