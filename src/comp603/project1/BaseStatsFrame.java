package comp603.project1;

import javax.swing.WindowConstants;


public class BaseStatsFrame extends javax.swing.JFrame {
    
    UserCreatedCharacter fetchBaseStats = UserCreatedCharacter.getInstance();
    
/*Setting character values to dice roll An instance of Roll4D6 is created for each
ability, in order to generate a new random roll for each ability*/
    
   Roll4D6 strengthRoll = new Roll4D6();
   Roll4D6 dexterityRoll = new Roll4D6();
   Roll4D6 constitutionRoll = new Roll4D6();
   Roll4D6 intelligenceRoll = new Roll4D6();
   Roll4D6 wisdomRoll = new Roll4D6();
   Roll4D6 charismaRoll = new Roll4D6();
       
    public BaseStatsFrame() {
        initComponents();
   
   //The attribute variables are set to to the results of the Roll4D6 instances created above
   fetchBaseStats.setStrength(strengthRoll.getResult());
   fetchBaseStats.setDexterity(dexterityRoll.getResult());
   fetchBaseStats.setConstitution(constitutionRoll.getResult()); 
   fetchBaseStats.setIntelligence(intelligenceRoll.getResult());
   fetchBaseStats.setWisdom(wisdomRoll.getResult());
   fetchBaseStats.setCharisma(charismaRoll.getResult());
   
   //Text of the jlabels
   baseStatsLabel1.setText("In order to play Dungeons and Dragons, your character " +fetchBaseStats.getName() + " will need attribute values");
   strengthLabel.setText("Strength = " + String.valueOf(strengthRoll.getResult()));
   dexterityLabel.setText("Dexterity = " + String.valueOf(dexterityRoll.getResult()));
   constitutionLabel.setText("Constitution = " + String.valueOf(constitutionRoll.getResult()));
   intelligenceLabel.setText("Intelligence = " + String.valueOf(intelligenceRoll.getResult()));
   wisdomLabel.setText("Wisdom = " + String.valueOf(wisdomRoll.getResult()));
   charismaLabel.setText("Charisma = " + String.valueOf(charismaRoll.getResult()));
  
    }

    /**
     * Method called from within the constructor to initialize the form.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baseStatsPanel = new javax.swing.JPanel();
        baseStatsLabel1 = new javax.swing.JLabel();
        baseStatsLabel2 = new javax.swing.JLabel();
        continueButton = new javax.swing.JButton();
        dexterityLabel = new javax.swing.JLabel();
        constitutionLabel = new javax.swing.JLabel();
        intelligenceLabel = new javax.swing.JLabel();
        wisdomLabel = new javax.swing.JLabel();
        charismaLabel = new javax.swing.JLabel();
        strengthLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        baseStatsLabel1.setText("Your character needs base stats for the six different attributes");

        baseStatsLabel2.setText("4 6-Sided Dice are rolled with the highest three rolls being added together for each attribute...");

        continueButton.setText("Continue");
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        dexterityLabel.setText("Dexterity =");

        constitutionLabel.setText("Constitution = ");

        intelligenceLabel.setText("Intelligence =");

        wisdomLabel.setText("Wisdom =");

        charismaLabel.setText("Charisma =");

        strengthLabel.setText("Strength = ");

        javax.swing.GroupLayout baseStatsPanelLayout = new javax.swing.GroupLayout(baseStatsPanel);
        baseStatsPanel.setLayout(baseStatsPanelLayout);
        baseStatsPanelLayout.setHorizontalGroup(
            baseStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseStatsPanelLayout.createSequentialGroup()
                .addComponent(baseStatsLabel2)
                .addGap(0, 54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, baseStatsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continueButton)
                .addGap(128, 128, 128))
            .addGroup(baseStatsPanelLayout.createSequentialGroup()
                .addGroup(baseStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(baseStatsPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(baseStatsLabel1))
                    .addGroup(baseStatsPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(baseStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dexterityLabel)
                            .addComponent(constitutionLabel)
                            .addComponent(intelligenceLabel)
                            .addComponent(wisdomLabel)
                            .addComponent(charismaLabel)
                            .addComponent(strengthLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        baseStatsPanelLayout.setVerticalGroup(
            baseStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseStatsPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(baseStatsLabel1)
                .addGap(29, 29, 29)
                .addComponent(baseStatsLabel2)
                .addGap(13, 13, 13)
                .addComponent(strengthLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dexterityLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(constitutionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(intelligenceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wisdomLabel)
                .addGroup(baseStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(baseStatsPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(continueButton)
                        .addGap(52, 52, 52))
                    .addGroup(baseStatsPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(charismaLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseStatsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseStatsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
        // TODO add your handling code here: 
   RaceFrame raceFrame = new RaceFrame();
   raceFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
   raceFrame.setBounds(200, 200, 600, 600);
   raceFrame.setTitle("DND CHARACTER CREATOR");
   raceFrame.setVisible(true);

  dispose();       
    }//GEN-LAST:event_continueButtonActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BaseStatsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaseStatsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaseStatsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaseStatsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaseStatsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel baseStatsLabel1;
    private javax.swing.JLabel baseStatsLabel2;
    private javax.swing.JPanel baseStatsPanel;
    private javax.swing.JLabel charismaLabel;
    private javax.swing.JLabel constitutionLabel;
    private javax.swing.JButton continueButton;
    private javax.swing.JLabel dexterityLabel;
    private javax.swing.JLabel intelligenceLabel;
    private javax.swing.JLabel strengthLabel;
    private javax.swing.JLabel wisdomLabel;
    // End of variables declaration//GEN-END:variables
}
