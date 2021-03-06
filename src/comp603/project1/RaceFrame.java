package comp603.project1;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class RaceFrame extends javax.swing.JFrame {
    
    UserCreatedCharacter fetchRace = UserCreatedCharacter.getInstance();
    CharacterRace raceTraits = new CharacterRace();

    //Creates new form RaceFrame//
    public RaceFrame() {
        initComponents();
        
        ButtonGroup buttonGroup = new ButtonGroup(); 
        buttonGroup.add(dwarfButton);
        buttonGroup.add(elfButton);
        buttonGroup.add(gnomeButton);
        buttonGroup.add(halfelfButton);
        buttonGroup.add(halflingButton);
        buttonGroup.add(halforcButton);
        buttonGroup.add(humanButton);
        buttonGroup.add(tieflingButton);
        
        raceChooseLabel.setText("What race would you like " + fetchRace.getName() + " to be?");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        raceChooseLabel = new javax.swing.JLabel();
        dwarfButton = new javax.swing.JRadioButton();
        elfButton = new javax.swing.JRadioButton();
        continueButton = new javax.swing.JButton();
        gnomeButton = new javax.swing.JRadioButton();
        halfelfButton = new javax.swing.JRadioButton();
        halflingButton = new javax.swing.JRadioButton();
        halforcButton = new javax.swing.JRadioButton();
        humanButton = new javax.swing.JRadioButton();
        tieflingButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        raceAbilitiesLabel = new javax.swing.JLabel();
        raceModifiersLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        raceChooseLabel.setText("What race would you like your character to be?");

        dwarfButton.setText("Dwarf");
        dwarfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dwarfButtonActionPerformed(evt);
            }
        });

        elfButton.setText("Elf");
        elfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elfButtonActionPerformed(evt);
            }
        });

        continueButton.setText("Continue");
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        gnomeButton.setText("Gnome");
        gnomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gnomeButtonActionPerformed(evt);
            }
        });

        halfelfButton.setText("Half-Elf");
        halfelfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halfelfButtonActionPerformed(evt);
            }
        });

        halflingButton.setText("Halfling");
        halflingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halflingButtonActionPerformed(evt);
            }
        });

        halforcButton.setText("Half-Orc");
        halforcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halforcButtonActionPerformed(evt);
            }
        });

        humanButton.setText("Human");
        humanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                humanButtonActionPerformed(evt);
            }
        });

        tieflingButton.setText("Tiefling");
        tieflingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tieflingButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Race Abilities :");

        jLabel2.setText("Race Ability Score Modifiers:");

        raceAbilitiesLabel.setText("...");

        raceModifiersLabel.setText("...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(raceAbilitiesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(raceModifiersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(continueButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(raceChooseLabel)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dwarfButton)
                                            .addComponent(elfButton)
                                            .addComponent(gnomeButton)
                                            .addComponent(halfelfButton))
                                        .addGap(47, 47, 47)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tieflingButton)
                                            .addComponent(humanButton)
                                            .addComponent(halforcButton)
                                            .addComponent(halflingButton)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(raceChooseLabel)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dwarfButton)
                    .addComponent(halflingButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elfButton)
                    .addComponent(halforcButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gnomeButton)
                    .addComponent(humanButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(halfelfButton)
                    .addComponent(tieflingButton))
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(raceAbilitiesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(continueButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(raceModifiersLabel)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dwarfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dwarfButtonActionPerformed

       raceTraits.dwarf();
       raceModifiersLabel.setText("Constitution + 2");
       //Converts the array of race abilities to string to be printed to label
       String joined = String.join(",",fetchRace.getAbilities());
       raceAbilitiesLabel.setText(joined); 
    }//GEN-LAST:event_dwarfButtonActionPerformed

    private void elfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elfButtonActionPerformed
  
        raceTraits.elf();
        raceModifiersLabel.setText("Dexterity + 2");
        //Converts the array of race abilities to string to be printed to label
        String joined = String.join(",",fetchRace.getAbilities());
        raceAbilitiesLabel.setText(joined);  
    }//GEN-LAST:event_elfButtonActionPerformed

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
     
       ClassFrame classFrame = new ClassFrame();
       classFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
       classFrame.setBounds(200, 200, 600, 600);
       classFrame.setTitle("DND CHARACTER CREATOR");
       classFrame.setVisible(true);   
       dispose();    
    }//GEN-LAST:event_continueButtonActionPerformed

    private void gnomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gnomeButtonActionPerformed
     
        raceTraits.gnome();
        raceModifiersLabel.setText("Intelligence + 2");
        //Converts the array of race abilities to string to be printed to label
        String joined = String.join(",",fetchRace.getAbilities());
        raceAbilitiesLabel.setText(joined); 
    }//GEN-LAST:event_gnomeButtonActionPerformed

    private void halfelfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halfelfButtonActionPerformed
 
        raceTraits.halfelf();
        raceModifiersLabel.setText("Charisma+ 2");
        //Converts the array of race abilities to string to be printed to label
        String joined = String.join(",",fetchRace.getAbilities());
        raceAbilitiesLabel.setText(joined); 
    }//GEN-LAST:event_halfelfButtonActionPerformed

    private void halflingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halflingButtonActionPerformed
       
        raceTraits.halfling();
        raceModifiersLabel.setText("Dexterity + 2");  
        //Converts the array of race abilities to string to be printed to label
        String joined = String.join(",",fetchRace.getAbilities());
        raceAbilitiesLabel.setText(joined); 
    }//GEN-LAST:event_halflingButtonActionPerformed

    private void halforcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halforcButtonActionPerformed
       
        raceTraits.halforc();
        raceModifiersLabel.setText("Strength + 2, Constitution + 1");  
        //Converts the array of race abilities to string to be printed to label
        String joined = String.join(",",fetchRace.getAbilities());
        raceAbilitiesLabel.setText(joined); 
    }//GEN-LAST:event_halforcButtonActionPerformed

    private void humanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_humanButtonActionPerformed

        raceTraits.human();
        raceModifiersLabel.setText("No ability modifiers"); 
        //Converts the array of race abilities to string to be printed to label
        String joined = String.join(",",fetchRace.getAbilities());
        raceAbilitiesLabel.setText(joined); 
    }//GEN-LAST:event_humanButtonActionPerformed

    private void tieflingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tieflingButtonActionPerformed

        raceTraits.tiefling();
        raceModifiersLabel.setText("Charisma + 2, Intelligence + 1");  
        //Converts the array of race abilities to string to be printed to label
        String joined = String.join(",",fetchRace.getAbilities());
        raceAbilitiesLabel.setText(joined); 
    }//GEN-LAST:event_tieflingButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(RaceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RaceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RaceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RaceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RaceFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continueButton;
    private javax.swing.JRadioButton dwarfButton;
    private javax.swing.JRadioButton elfButton;
    private javax.swing.JRadioButton gnomeButton;
    private javax.swing.JRadioButton halfelfButton;
    private javax.swing.JRadioButton halflingButton;
    private javax.swing.JRadioButton halforcButton;
    private javax.swing.JRadioButton humanButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel raceAbilitiesLabel;
    private javax.swing.JLabel raceChooseLabel;
    private javax.swing.JLabel raceModifiersLabel;
    private javax.swing.JRadioButton tieflingButton;
    // End of variables declaration//GEN-END:variables
}
