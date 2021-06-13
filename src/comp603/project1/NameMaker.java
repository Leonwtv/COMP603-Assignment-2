
package comp603.project1;

import java.util.Scanner;

public class NameMaker {
    
    public static void createName(){
        
       UserCreatedCharacter fetchName = UserCreatedCharacter.getInstance();
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Your character will need a name");
       System.out.println("Please enter the name of your charcter: or enter 'R' for a random name and press [ENTER]");
       
       String nameAnswer = scan.nextLine();
   
       //If-tree determines whether the progarm gives a randomized name or to use name entered
       //The 'If' calls on the RandomNameGenerator to provide a name and stores this
       //the 'else' simply stores the name entered by user
       if(nameAnswer.equals("R") || nameAnswer.equals("r") ){
            System.out.println("\nYour characters' randomly generated name is: ");
            RandomNameGenerator createRandomName = new RandomNameGenerator();
            createRandomName.createName();
            nameAnswer = createRandomName.getFullName();
            fetchName.setName(nameAnswer);
       } 
       
       else{
       fetchName.setName(nameAnswer);
       System.out.println("Your characters' name is: " +  fetchName.getName());
       }
 }
}

