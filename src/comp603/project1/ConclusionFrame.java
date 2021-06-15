
package comp603.project1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.math.BigDecimal;

public class ConclusionFrame extends javax.swing.JFrame {

UserCreatedCharacter completedCharacter = UserCreatedCharacter.getInstance();
WriteToFile fetchOutputCharacters = new WriteToFile();

    /**Creates new form ConclusionFrame*/ 
    public ConclusionFrame() {
        initComponents();

           //JLabel text edits to contain character values
           nameLabel.setText("Name: " + completedCharacter.getName());
           raceLabel.setText("Race: " + completedCharacter.getRace());
           classLabel.setText("Class: " + completedCharacter.getPlayerClass());
           strengthLabel.setText("Strength: " + completedCharacter.getStrength());
           dexterityLabel.setText("Dexterity: " + completedCharacter.getDexterity());
           constitutionLabel.setText("Constitution: " + completedCharacter.getConstitution());
           intelligenceLabel.setText("Intelligence: " + completedCharacter.getIntelligence());
           wisdomLabel.setText("Wisdom " + completedCharacter.getWisdom());
           charismaLabel.setText("Charisma: " + completedCharacter.getCharisma());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        conclusionLabel = new javax.swing.JLabel();
        liketoaddPanel = new javax.swing.JLabel();
        addToDatabaseButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        raceLabel = new javax.swing.JLabel();
        classLabel = new javax.swing.JLabel();
        strengthLabel = new javax.swing.JLabel();
        dexterityLabel = new javax.swing.JLabel();
        constitutionLabel = new javax.swing.JLabel();
        intelligenceLabel = new javax.swing.JLabel();
        wisdomLabel = new javax.swing.JLabel();
        charismaLabel = new javax.swing.JLabel();
        fileWriteEntireDatabaseButton = new javax.swing.JButton();
        characterOutButton = new javax.swing.JButton();
        characterAddedLabel = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        conclusionLabel.setText("Here is your character:");

        liketoaddPanel.setText("Would You like to add this character to the DnD Character Database?");

        addToDatabaseButton.setText("ADD CHARACTER");
        addToDatabaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToDatabaseButtonActionPerformed(evt);
            }
        });

        nameLabel.setText("name: ");

        raceLabel.setText("race:");

        classLabel.setText("class:");

        strengthLabel.setText("strength");

        dexterityLabel.setText("dexterity");

        constitutionLabel.setText("constitution");

        intelligenceLabel.setText("intelligence");

        wisdomLabel.setText("wisdom");

        charismaLabel.setText("charisma");

        fileWriteEntireDatabaseButton.setText("Print txt file of Database");
        fileWriteEntireDatabaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileWriteEntireDatabaseButtonActionPerformed(evt);
            }
        });

        characterOutButton.setText("print txt of character");
        characterOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                characterOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(liketoaddPanel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(strengthLabel)
                                        .addComponent(dexterityLabel))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(addToDatabaseButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLabel)
                                    .addComponent(raceLabel)
                                    .addComponent(conclusionLabel)
                                    .addComponent(classLabel)
                                    .addComponent(constitutionLabel))
                                .addGap(42, 42, 42)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(intelligenceLabel)
                                    .addComponent(charismaLabel)
                                    .addComponent(wisdomLabel))
                                .addGap(104, 115, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(characterAddedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fileWriteEntireDatabaseButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(characterOutButton)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conclusionLabel)
                .addGap(18, 18, 18)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(raceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classLabel)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(strengthLabel)
                    .addComponent(intelligenceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dexterityLabel)
                    .addComponent(wisdomLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(constitutionLabel)
                    .addComponent(charismaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addToDatabaseButton)
                    .addComponent(characterAddedLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(liketoaddPanel)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileWriteEntireDatabaseButton)
                    .addComponent(characterOutButton)))
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

    //Method for storing the created character attributes into the database table.
    private void addToDatabaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToDatabaseButtonActionPerformed

        try {
            //DataBase Table Connection
            String databaseURL = "jdbc:derby:Characters_Database_v;create=true";

            Connection con = DriverManager.getConnection(databaseURL);    
            Statement stmt = con.createStatement();
            ResultSet rs;

            //Prepared Statment to add the created characters values into the database table
            PreparedStatement ps = con.prepareStatement("INSERT INTO CHARACTER_TABLE VALUES(?,?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1,completedCharacter.getName());
            ps.setString(2,completedCharacter.getRace());
            ps.setString(3,completedCharacter.getPlayerClass());
            ps.setInt(4,completedCharacter.getStrength());
            ps.setInt(5,completedCharacter.getDexterity());
            ps.setInt(6,completedCharacter.getConstitution());
            ps.setInt(7,completedCharacter.getIntelligence());
            ps.setInt(8,completedCharacter.getWisdom());
            ps.setInt(9,completedCharacter.getCharisma());
            ps.setString(10,"Race Abilities");
            ps.setString(11,"Class Abilities");

            //Execution of Query
            ps.executeUpdate();

            con.close();
            
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
        
        characterAddedLabel.setText("Added to Database");               
    }//GEN-LAST:event_addToDatabaseButtonActionPerformed

    private void fileWriteEntireDatabaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileWriteEntireDatabaseButtonActionPerformed
    //Call to method that writes database table to text file
    fetchOutputCharacters.fileWriterDatabase();	
    }//GEN-LAST:event_fileWriteEntireDatabaseButtonActionPerformed

    private void characterOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_characterOutButtonActionPerformed
     //Call to method that writes the created character to text file   
    fetchOutputCharacters.fileWriterCharacter();
    }//GEN-LAST:event_characterOutButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToDatabaseButton;
    private javax.swing.JLabel characterAddedLabel;
    private javax.swing.JButton characterOutButton;
    private javax.swing.JLabel charismaLabel;
    private javax.swing.JLabel classLabel;
    private javax.swing.JLabel conclusionLabel;
    private javax.swing.JLabel constitutionLabel;
    private javax.swing.JLabel dexterityLabel;
    private javax.swing.JButton fileWriteEntireDatabaseButton;
    private javax.swing.JLabel intelligenceLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel liketoaddPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel raceLabel;
    private javax.swing.JLabel strengthLabel;
    private javax.swing.JLabel wisdomLabel;
    // End of variables declaration//GEN-END:variables
}
