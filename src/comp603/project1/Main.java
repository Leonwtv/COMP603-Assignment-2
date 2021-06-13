
package comp603.project1;


import javax.swing.WindowConstants;


/**Main class that calls on LaunchPageFrame method which progresses through the different classes*/

public class Main {
   
    
    public static void main(String[] args) {
        
   LaunchPageFrame launchPageFrame = new LaunchPageFrame();
   ConnectToDatabase connectToDatabase = new ConnectToDatabase();
     
connectToDatabase.getConnection();
   
        launchPageFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        launchPageFrame.setBounds(200, 200, 600, 600);
        launchPageFrame.setTitle("DND CHARACTER CREATOR");
        launchPageFrame.setVisible(true);
        

    } 
    }  

