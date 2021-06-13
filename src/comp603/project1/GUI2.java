package comp603.project1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class GUI2 extends JFrame{
    
    private JLabel item;
    
    public GUI2(){
        super("The title bar");
        setLayout(new FlowLayout());
        
        item = new JLabel("This is a sentence");
        item.setToolTipText("This is gonn show up on hover");
    }
    
}
