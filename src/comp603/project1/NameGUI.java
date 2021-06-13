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


public class NameGUI extends JFrame implements ActionListener {
    
    UserCreatedCharacter fetchName = UserCreatedCharacter.getInstance();
    
    JFrame frame = new JFrame();
    JButton submitButton = new JButton("Submit");
    JButton randomizeButton = new JButton("Randomize Name");
    JLabel label = new JLabel("Your character will need a name, enter the name, or press the randomized name button");
    JTextField nameTextField;
    JLabel nameLabel = new JLabel();
    String textFieldInput;
    
    NameGUI(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        
        randomizeButton = new JButton("Randomize Name");
        randomizeButton.addActionListener(this);
        
        nameTextField = new JTextField();
        nameTextField.setPreferredSize(new Dimension(250,40));
        
        this.add(label);
        this.add(submitButton);
        this.add(nameTextField);
        this.add(randomizeButton);
        this.pack();
        this.setVisible(true);
        
       
        frame.setTitle("Dungeons and Dragons Character Creator");
        frame.pack();
        frame.setVisible(true);
        

        frame.add(label);
        frame.add(submitButton);
        frame.add(randomizeButton);
        frame.add(nameTextField);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650,650);
        frame.setLayout(null);
        frame.setVisible(true);
  
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        
        
        
        if(e.getSource()== submitButton){
        
            String nameAnswer = nameTextField.getText();
            nameLabel.setText(String.valueOf(nameAnswer));

            fetchName.setName(nameAnswer);
  
        BaseStatsGUI baseStatsGUI = new BaseStatsGUI();
        
        }
        
        if(e.getSource()==randomizeButton){
        
            RandomNameGenerator createRandomName = new RandomNameGenerator();
            createRandomName.createName();
            textFieldInput = createRandomName.getFullName();
            fetchName.setName(textFieldInput);
            
            BaseStatsGUI baseStatsGUI = new BaseStatsGUI();
           
        
        }
    }
    
}
