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

public class ConclusionGUI extends JFrame implements ActionListener {
    
    UserCreatedCharacter conclusion = UserCreatedCharacter.getInstance();
    
    private JFrame frame = new JFrame();
    private JButton myButton = new JButton("Close");
    private JLabel label = new JLabel("Here is your character: " + conclusion.getName());
    
    
    ConclusionGUI(){
     

        label.setBounds(0,0,100,50);
        label.setFont(new Font(null,Font.PLAIN,25));
        
        frame.add(label);
        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
  
        frame.setTitle("Dungeons and Dragons Character Creator");
        frame.pack();
        frame.setVisible(true);
        

        
        frame.add(myButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650,650);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==myButton){  
           NameGUI nameGui = new NameGUI();
        }
    }
    
    
  }
   
