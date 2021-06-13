
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
public class WriteToFile {
   
            
    public static void fileWriterCharacter() {
        
        UserCreatedCharacter writeCharacterData = UserCreatedCharacter.getInstance();   
        try {
        FileWriter fwrite = new FileWriter("Character_Output.txt");
        PrintWriter pwrite = new PrintWriter(fwrite);
        
        pwrite.println("Your Character:");
        pwrite.println("Name: " + writeCharacterData.getName());
        pwrite.println("Race: " + writeCharacterData.getRace());
        pwrite.println("Race abilities: " + Arrays.toString(writeCharacterData.getAbilities()));
        pwrite.println("Class: " + writeCharacterData.getPlayerClass());
        pwrite.println("Class traits: " + Arrays.toString(writeCharacterData.getClassFeatures()));
        pwrite.println("Strength: " + writeCharacterData.getStrength());
        pwrite.println("Dexterity: " + writeCharacterData.getDexterity());
        pwrite.println("Constitution: " + writeCharacterData.getConstitution());
        pwrite.println("Intelligence: " + writeCharacterData.getIntelligence());
        pwrite.println("Wisdom: " + writeCharacterData.getWisdom());
        pwrite.println("Charisma: " + writeCharacterData.getCharisma());
        
        pwrite.close();
        }
        catch (IOException e) {
            out.println("Error");
        }
    }
    
   
    
    
    
    
public static void fileWriterDatabase() {
     
  

Connection connect = null;

Statement s = null;

 

try {

Class.forName("org.apache.derby.jdbc.ClientDriver.class");

connect =  DriverManager.getConnection("jdbc:derby://localhost:1527/DnD_Characters_Database", "username","password");

s = connect.createStatement();


String sql = "SELECT * FROM DND_CHARACTERS_TABLE";
ResultSet rec = s.executeQuery(sql);

 

String path = "E:\\NEW BACKUP\\UNI 2ND YEAR\\COMP603 ASSIGNMENT PART 2\\comp603 part 2\\DND_CHARACTERS_LIST";

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
        
   
