package comp603.project1;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RaceGUI extends JFrame implements ActionListener {
    
     UserCreatedCharacter fetchRace = UserCreatedCharacter.getInstance();
     CharacterRace raceTraits = new CharacterRace();
    
    private JFrame frame = new JFrame();
    private JButton continueButton = new JButton("Continue");
    private JLabel label = new JLabel("What race you do you wish " + fetchRace.getName() + " to be?");
    
    JRadioButton  dwarfButton;
    JRadioButton  elfButton;
    JRadioButton  gnomeButton;
    JRadioButton  halfelfButton; 
    JRadioButton  halflingButton; 
    JRadioButton  halforcButton; 
    JRadioButton  humanButton;
    JRadioButton  tieflingButton; 
    
    RaceGUI(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout(FlowLayout.CENTER));
    
    dwarfButton = new JRadioButton("Dwarf");
    elfButton = new JRadioButton("Elf");
    gnomeButton = new JRadioButton("Gnome");
    halfelfButton = new JRadioButton("Half Elf");
    halflingButton = new JRadioButton("Halfling");
    halforcButton = new JRadioButton("Half Orc");
    humanButton = new JRadioButton("Human");
    tieflingButton = new JRadioButton("Tiefing");
    
   
        continueButton = new JButton("Select");
        continueButton.addActionListener(this);
        
        
        this.add(label);
        
        //Button Group
        ButtonGroup group = new ButtonGroup(); 
        group.add(dwarfButton);
        group.add(elfButton);
        group.add(gnomeButton);
        group.add(halfelfButton);
        group.add(halflingButton);
        group.add(halforcButton);
        group.add(humanButton);
        group.add(tieflingButton);
        
        
        //Action Listeners for buttons
        dwarfButton.addActionListener(this);
        elfButton.addActionListener(this); 
        gnomeButton.addActionListener(this);
        halfelfButton.addActionListener(this);
        halflingButton.addActionListener(this);
        halforcButton.addActionListener(this);
        humanButton.addActionListener(this);
        tieflingButton.addActionListener(this);
        
        this.add(dwarfButton);
        this.add(elfButton);
        this.add(gnomeButton);
        this.add(halfelfButton);
        this.add(halflingButton);
        this.add(halforcButton);
        this.add(humanButton);
        this.add(tieflingButton);
        
        
        
        this.add(continueButton);
        this.pack();
        this.setVisible(true);
             
        frame.setTitle("Dungeons and Dragons Character Creator");
        frame.pack();
        frame.setVisible(true);

        frame.add(label);
        frame.add(dwarfButton);
        frame.add(elfButton);
        frame.add(gnomeButton);
        frame.add(halfelfButton);
        frame.add(halflingButton);
        frame.add(halforcButton);
        frame.add(humanButton);
        frame.add(tieflingButton);
        frame.add(continueButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650,650);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==dwarfButton){
        raceTraits.dwarf();
        }
        
        else if(e.getSource()==elfButton){
         raceTraits.elf();
        }
        
        else if(e.getSource()==gnomeButton){
         raceTraits.gnome();
        }
        
         else if(e.getSource()==halfelfButton){
         raceTraits.halfelf();
         }
        
        
         else if(e.getSource()==halflingButton){
         raceTraits.halfling();
         }
        
        else if(e.getSource()==halforcButton){
        raceTraits.halforc();
        }
        
        else if(e.getSource()==humanButton){
         raceTraits.human();
        }
        
         else if(e.getSource()==tieflingButton){
         raceTraits.tiefling();
         }
        
     
         if(e.getSource()==continueButton){
             
             ClassGUI classGUI = new ClassGUI();
         
           
        }
        
        
    }
    
}
