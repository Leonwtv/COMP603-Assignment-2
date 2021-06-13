package comp603.project1;
import java.util.Scanner;

public class ExitProgram {
    
    static void exitOrNot(){
        
        System.out.println("\n\nWould you like to exit the program or make another character?");
        System.out.println("\nEnter 1 and press [ENTER] to create another character");
        System.out.println("\nEnter 2 and press [ENTER] to exit the program");     
  
    
    Scanner scan = new Scanner(System.in);
    int userAnswer = scan.nextInt();
    
    if(userAnswer >= 1){
            System.out.println("Let's create a new character!");
    }
    
    else{
            System.out.println("Thank you for using the Dungeons and Dragons Character Creator. GoodBye!");
            System.exit(0);
    }
    
}
}

