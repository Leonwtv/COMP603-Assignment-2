package comp603.project1;

import javax.swing.UIManager;


public class LookAndFeelAdjustment {
    
    public void changeLAF(){
        //Nimbus look and feel adjustment
        try { 
    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
} catch (Exception ex) { 
    ex.printStackTrace(); 
}
 
        
    }
    
}
