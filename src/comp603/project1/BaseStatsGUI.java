package comp603.project1;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class BaseStatsGUI extends JFrame implements ActionListener {
   
    
    UserCreatedCharacter fetchBaseStats = UserCreatedCharacter.getInstance();
    
   
    
    JFrame frame = new JFrame();
    JButton continueButton = new JButton("Continue");
    JLabel label = new JLabel("To determine the base stats of " +  fetchBaseStats.getName() + " , for each stat four six-sided dice will be rolled with the highest three dice added together");
    JLabel label2 = new JLabel("Rolling the dice...");
    JLabel strengthLabel = new JLabel("Strength:" + fetchBaseStats.getStrength());
    JLabel dexterityLabel = new JLabel("Dexterity:" + fetchBaseStats.getDexterity());
    
    BaseStatsGUI(){
        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        
        continueButton = new JButton("Continue");
        continueButton.addActionListener(this);
        
   
        this.add(label);
        this.add(label2);
        this.add(strengthLabel);
        this.add(dexterityLabel);
        this.add(continueButton);
        this.pack();
        this.setVisible(true);
        
       
        frame.setTitle("Dungeons and Dragons Character Creator");
        frame.pack();
        frame.setVisible(true);
        
        frame.add(label);
        frame.add(label2);
        frame.add(strengthLabel);
        frame.add(dexterityLabel);
        frame.add(continueButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650,650);
        frame.setLayout(null);
        frame.setVisible(true);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         frame.dispose();
        if(e.getSource()==continueButton){
            
        RaceGUI raceGUI = new RaceGUI();
           
      
    }
    }
    
}
