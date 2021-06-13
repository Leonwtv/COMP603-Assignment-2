package comp603.project1;

import javax.swing.WindowConstants;

public class NameMakerFrame extends javax.swing.JFrame {
    
     UserCreatedCharacter fetchName = UserCreatedCharacter.getInstance();
     String nameAnswer;

    /**
     * Creates new form RandomFrame
     */
    public NameMakerFrame() {
        initComponents();
    }

    /*
     * Method called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameMakerPanel = new javax.swing.JPanel();
        namemakerLabel1 = new javax.swing.JLabel();
        namemakerLabel2 = new javax.swing.JLabel();
        namemakerLabel3 = new javax.swing.JLabel();
        randomNameButton = new javax.swing.JButton();
        continueButton = new javax.swing.JButton();
        nameTextField = new javax.swing.JTextField();
        nameResultLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        submitNameButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        namemakerLabel1.setText("Firstly, your character will need a name");

        namemakerLabel2.setText("Enter the name you wish and press CONTINUE");

        namemakerLabel3.setText("Or, press RANDOM for a random Name");

        randomNameButton.setText("RANDOM");
        randomNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomNameButtonActionPerformed(evt);
            }
        });

        continueButton.setText("CONTINUE");
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        nameResultLabel.setText("...");

        nameLabel.setText("Name:");

        submitNameButton.setText("SUBMIT NAME");
        submitNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitNameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nameMakerPanelLayout = new javax.swing.GroupLayout(nameMakerPanel);
        nameMakerPanel.setLayout(nameMakerPanelLayout);
        nameMakerPanelLayout.setHorizontalGroup(
            nameMakerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nameMakerPanelLayout.createSequentialGroup()
                .addGroup(nameMakerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nameMakerPanelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(nameMakerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(nameMakerPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(namemakerLabel3))
                            .addGroup(nameMakerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(namemakerLabel2)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nameMakerPanelLayout.createSequentialGroup()
                                    .addComponent(namemakerLabel1)
                                    .addGap(16, 16, 16)))))
                    .addGroup(nameMakerPanelLayout.createSequentialGroup()
                        .addGroup(nameMakerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(nameMakerPanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(randomNameButton))
                            .addGroup(nameMakerPanelLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(nameMakerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(nameMakerPanelLayout.createSequentialGroup()
                                .addComponent(nameResultLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(continueButton))
                            .addGroup(nameMakerPanelLayout.createSequentialGroup()
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(submitNameButton)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nameMakerPanelLayout.setVerticalGroup(
            nameMakerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nameMakerPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(namemakerLabel1)
                .addGap(57, 57, 57)
                .addComponent(namemakerLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(namemakerLabel3)
                .addGap(18, 18, 18)
                .addGroup(nameMakerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(randomNameButton)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitNameButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(nameMakerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameResultLabel)
                    .addComponent(continueButton))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameMakerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameMakerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void randomNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomNameButtonActionPerformed
     RandomNameGenerator createRandomName = new RandomNameGenerator();
     createRandomName.createName();
     nameAnswer = createRandomName.getFullName();
     fetchName.setName(nameAnswer);
     
     //Changes label to show thr randomly generated name
     nameResultLabel.setText(fetchName.getName());
     
    }//GEN-LAST:event_randomNameButtonActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed

    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
      String nameAnswer = nameTextField.getText();
        nameTextField.setText(String.valueOf(nameAnswer));
        
        fetchName.setName(nameAnswer);
        System.out.println("Your name is " + fetchName.getName());
        
        
    //Calling of BaseStatsFrame Class    
    BaseStatsFrame baseStatsFrame = new BaseStatsFrame();  
    baseStatsFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
    baseStatsFrame.setBounds(200, 200, 600, 600);
    baseStatsFrame.setTitle("DND CHARACTER CREATOR");
    baseStatsFrame.setVisible(true);
    
    dispose();    
    }//GEN-LAST:event_continueButtonActionPerformed

    private void submitNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitNameButtonActionPerformed
            
        //Changes label to show the typed name
            nameResultLabel.setText(nameTextField.getText());
    }//GEN-LAST:event_submitNameButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NameMakerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NameMakerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NameMakerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NameMakerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NameMakerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continueButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel nameMakerPanel;
    private javax.swing.JLabel nameResultLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel namemakerLabel1;
    private javax.swing.JLabel namemakerLabel2;
    private javax.swing.JLabel namemakerLabel3;
    private javax.swing.JButton randomNameButton;
    private javax.swing.JButton submitNameButton;
    // End of variables declaration//GEN-END:variables
}
