package comp603.project1;
        
import javax.swing.WindowConstants;

public class Main {
   
    public static void main(String[] args) {
        
        //Calling of class that adjusts jframe look and feel
        LookAndFeelAdjustment lookAndFeelAdjustment = new LookAndFeelAdjustment();
        lookAndFeelAdjustment.changeLAF(); 
                
        //Connection to database, through DatabaseConnection class
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.makeConnection();
        
        //Calling of LaunchPageFrame class which progresses through the different classes
        LaunchPageFrame launchPageFrame = new LaunchPageFrame();
        launchPageFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        launchPageFrame.setBounds(200, 200, 600, 600);
        launchPageFrame.setTitle("DND CHARACTER CREATOR");
        launchPageFrame.setVisible(true);
    }
}
   

