
package comp603.project1;

import java.io.*;
import static java.lang.System.*;
import java.util.Arrays;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
        
//Method managing writingto file functionality
 class WriteToFile {
   
            
    public static void fileWriterCharacter() {
        
        UserCreatedCharacter writeCharacterData = UserCreatedCharacter.getInstance();   
        
   try {
      FileWriter pwrite = new FileWriter("Character_Output.txt");
      pwrite.write("Your Character:");
        pwrite.write("\nName: " + writeCharacterData.getName());
        pwrite.write("\nRace: " + writeCharacterData.getRace());
        pwrite.write("\nRace abilities: " + Arrays.toString(writeCharacterData.getAbilities()));
        pwrite.write("\nClass: " + writeCharacterData.getPlayerClass());
        pwrite.write("\nClass traits: " + Arrays.toString(writeCharacterData.getClassFeatures()));
        pwrite.write("\nStrength: " + writeCharacterData.getStrength());
        pwrite.write("\nDexterity: " + writeCharacterData.getDexterity());
        pwrite.write("\nConstitution: " + writeCharacterData.getConstitution());
        pwrite.write("\nIntelligence: " + writeCharacterData.getIntelligence());
        pwrite.write("\nWisdom: " + writeCharacterData.getWisdom());
        pwrite.write("\nCharisma: " + writeCharacterData.getCharisma());
        
      
      pwrite.close();
      System.out.println("Successfully wrote to file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
    

    
 public static void fileWriterDatabase() {
 Connection connect = null;

Statement s = null;

 

try {

connect =  DriverManager.getConnection("jdbc:derby:Characters_Database_X;create=true");

s = connect.createStatement();


String sql = "SELECT * FROM CHARACTER_TABLE";
ResultSet rec = s.executeQuery(sql);

 

String path = "E:\\NEW BACKUP\\UNI 2ND YEAR\\COMP603 ASSIGNMENT PART 2\\comp603 part 2\\DND_CHARACTERS_LIST.txt";

FileWriter writer;

try {

File file = new File(path);

writer = new FileWriter(file, true);  //True = Append to file, false = Overwrite

 

while((rec!=null) && (rec.next()))

{
    
writer.write(rec.getString("NAME"));
writer.write(",");

writer.write(rec.getString("RACE"));
writer.write(",");

writer.write(rec.getString("CLASS"));
writer.write(",");

writer.write(rec.getString("STRENGTH"));
writer.write(",");

writer.write(rec.getString("DEXTERITY"));
writer.write(",");

writer.write(rec.getString("CONSTITUTION"));
writer.write(",");

writer.write(rec.getString("INTELLIGENCE"));
writer.write(",");

writer.write(rec.getString("WISDOM"));
writer.write(",");

writer.write(rec.getString("CHARISMA"));

writer.write("\r\n");

}

writer.close();

 

System.out.println("Write success!");

 

} catch (IOException e) {

e.printStackTrace();
}


} catch (Exception e) {

e.printStackTrace();
}
 


try {

    if(connect != null){
    s.close();
    connect.close();
}

} catch (SQLException e) {

e.printStackTrace();

}   
     }
      
}       


        
   

