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

public class ClassGUI extends JFrame implements ActionListener{
    
     UserCreatedCharacter fetchClass = UserCreatedCharacter.getInstance();
     
     //Instance of this class allows this class to access 
     
     CharacterClass classTraits = new CharacterClass();
    
    private JFrame frame = new JFrame();
    private JButton continueButton = new JButton("Continue");
    private JLabel label = new JLabel("What class you do you wish " + fetchClass.getName() + " to be?");
    
    JRadioButton  barbarianButton;
    JRadioButton  bardButton;
    JRadioButton  clericButton;
    JRadioButton  druidButton;
    JRadioButton  fighterButton;
    JRadioButton  monkButton;
    JRadioButton  paladinButton;
    JRadioButton  rangerButton;
    JRadioButton  rogueButton;
    JRadioButton  sorcererButton;
    JRadioButton  warlockButton;
    JRadioButton  wizardButton;

    
    ClassGUI(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout(FlowLayout.CENTER));
    
    barbarianButton  = new JRadioButton("Barbarian");
    bardButton = new JRadioButton("Bard");
    clericButton = new JRadioButton("Ceric");
    druidButton = new JRadioButton("Druid");
    fighterButton = new JRadioButton("Fighter");
    monkButton = new JRadioButton("Monk");
    paladinButton = new JRadioButton("Paladin");
    rangerButton = new JRadioButton("Ranger");
    rogueButton = new JRadioButton("Rogue");
    sorcererButton = new JRadioButton("Sorcerer");
    warlockButton = new JRadioButton("Warlock");
    wizardButton = new JRadioButton("Wizard");
    
    
    continueButton = new JButton("Select");
    continueButton.addActionListener(this);
    
     this.add(label);
     
     //Button Group
        ButtonGroup group = new ButtonGroup(); 
        group.add(barbarianButton);
        group.add(bardButton);
        group.add(clericButton);
        group.add(druidButton);
        group.add(fighterButton);
        group.add(monkButton);
        group.add(paladinButton);
        group.add(rangerButton);
        group.add(rogueButton);
        group.add(sorcererButton);
        group.add(warlockButton);
        group.add(wizardButton);
        
        
        barbarianButton.addActionListener(this);
        bardButton.addActionListener(this);
        clericButton.addActionListener(this);
        druidButton.addActionListener(this);
        fighterButton.addActionListener(this);
        monkButton.addActionListener(this);
        paladinButton.addActionListener(this);
        rangerButton.addActionListener(this);
        rogueButton.addActionListener(this);
        sorcererButton.addActionListener(this);
        warlockButton.addActionListener(this);
        wizardButton.addActionListener(this);
    
        this.add(barbarianButton);
        this.add(bardButton);
        this.add(clericButton);
        this.add(druidButton);
        this.add(fighterButton);
        this.add(monkButton);
        this.add(paladinButton);
        this.add(rangerButton);
        this.add(sorcererButton);
        this.add(warlockButton);
        this.add(wizardButton);
        
        this.add(continueButton);
        this.pack();
        this.setVisible(true);
             
        frame.setTitle("Dungeons and Dragons Character Creator");
        frame.pack();
        frame.setVisible(true);
      
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==barbarianButton){

            classTraits.barbarian();
        }
        
        else if(e.getSource()==bardButton){
            classTraits.bard();
        }
        
        else if(e.getSource()==clericButton){
            classTraits.cleric();
        }
        else if(e.getSource()==druidButton){
            classTraits.druid();
        }
        
        else if(e.getSource()==fighterButton){
            classTraits.fighter();
        }  
        
        else if(e.getSource()==monkButton){
            classTraits.monk();
        }
        
        else if(e.getSource()==paladinButton){
            classTraits.paladin();
        }
         
        else if(e.getSource()==rangerButton){
            classTraits.ranger();
        }
         
        else if(e.getSource()==rogueButton){
            classTraits.rogue();
        }
        
        else if(e.getSource()==sorcererButton){
            classTraits.sorcerer();
        }
        
        else if(e.getSource()==warlockButton){
            classTraits.warlock();
        }
        
        else if(e.getSource()==wizardButton){
            classTraits.wizard();
        }
        
        if(e.getSource()==continueButton){
            ConclusionGUI conclusionGUI = new ConclusionGUI();
        }
    }
 }
    

