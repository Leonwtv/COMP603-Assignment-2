package comp603.project1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class NewWindow {
    
    JFrame frame = new JFrame();
    JButton myButton = new JButton("Continue");
    JLabel label = new JLabel("hello", SwingConstants.CENTER);
    JLabel labe2 = new JLabel("In no time you will have your own character to roleplay as for your upcoming adventures", SwingConstants.CENTER);
    
    NewWindow()
    {
        label.setBounds(0,0,100,50);
        label.setFont(new Font(null,Font.PLAIN,25));
        
        frame.add(label);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
}
