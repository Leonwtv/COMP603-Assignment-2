
package comp603.project1;

import java.util.Random;


public class RandomNameGenerator {
    
    
    int numberOfNames;
    String fullName;
    String firstName;
    String lastName;
    
    //Arrays containing lists of first and last names
    String[] firstNames = {"Igor", "Geralt", "Asher", "Ajak", "Vor", "Azogg", "Yala", "Jarok", "Rook", "Jonta", "Thora"};
    String[] lastNames = {"Vakar", "Silverblade", "Soulburner", "Rull", "Kantor", "Yarrow","Karna", "Yureth", "Ironshield", "Darkbane", "Giantslayer"};
    
    public RandomNameGenerator(){
        numberOfNames = 11;
    }
   
    //Method randomizing and printing names
    public void createName(){
        Random rand = new Random();
        firstName = firstNames[rand.nextInt(numberOfNames)];
        lastName = lastNames[rand.nextInt(numberOfNames)];
        System.out.println(firstName + " " + lastName);
        String fullName = firstName + " " + lastName;
    }
    /**Accessor for the generated full name, returns name*/
     public void setResult(String fullName){
        this.fullName = fullName;
        }
     
    public String getFullName()
     {
        return fullName;
     }
    
}
