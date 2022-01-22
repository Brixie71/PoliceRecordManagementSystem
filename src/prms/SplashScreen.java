
package prms;

import java.awt.Image;
import javax.swing.ImageIcon;
import static prms.Login.LogoLoc;

public class SplashScreen extends javax.swing.JFrame {
    public SplashScreen() { 
        initComponents();
        
        //  BTS LOGO CODE
        ImageIcon BTSLogoReg = new ImageIcon(getClass().getClassLoader().getResource(LogoLoc));
        Image logo = BTSLogoReg.getImage();
        Image LogoRegScale = logo.getScaledInstance(BTSLogo.getWidth(), BTSLogo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledLogo = new ImageIcon(LogoRegScale);
        BTSLogo.setIcon(scaledLogo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BTSLogo = new javax.swing.JLabel();
        Loading = new javax.swing.JProgressBar();
        RegistrationMainText = new javax.swing.JLabel();
        RegistrationShadowText = new javax.swing.JLabel();
        BTSTitleMainText = new javax.swing.JLabel();
        BTSShadowText = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 32));
        setBounds(new java.awt.Rectangle(0, 0, 500, 300));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 32));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 0, 32));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(BTSLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 250, 240));

        Loading.setBackground(new java.awt.Color(0, 0, 32));
        Loading.setForeground(new java.awt.Color(0, 0, 32));
        Loading.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(Loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 480, 10));

        RegistrationMainText.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        RegistrationMainText.setForeground(new java.awt.Color(255, 255, 255));
        RegistrationMainText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegistrationMainText.setText("POLICE DATABASE");
        jPanel1.add(RegistrationMainText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 270, 30));

        RegistrationShadowText.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        RegistrationShadowText.setForeground(new java.awt.Color(0, 0, 0));
        RegistrationShadowText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegistrationShadowText.setText("POLICE DATABASE");
        jPanel1.add(RegistrationShadowText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 270, 40));

        BTSTitleMainText.setFont(new java.awt.Font("Iron Shark", 0, 14)); // NOI18N
        BTSTitleMainText.setForeground(new java.awt.Color(255, 208, 0));
        BTSTitleMainText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BTSTitleMainText.setText("Brion Tactical Systems");
        jPanel1.add(BTSTitleMainText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 290, 30));

        BTSShadowText.setFont(new java.awt.Font("Iron Shark", 0, 14)); // NOI18N
        BTSShadowText.setForeground(new java.awt.Color(0, 0, 0));
        BTSShadowText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BTSShadowText.setText("Brion Tactical Systems");
        jPanel1.add(BTSShadowText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 290, 40));

        Status.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        Status.setForeground(new java.awt.Color(255, 255, 255));
        Status.setToolTipText("");
        jPanel1.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 240, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel BTSLogo;
    public javax.swing.JLabel BTSShadowText;
    public javax.swing.JLabel BTSTitleMainText;
    public javax.swing.JProgressBar Loading;
    public javax.swing.JLabel RegistrationMainText;
    public javax.swing.JLabel RegistrationShadowText;
    public javax.swing.JLabel Status;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
