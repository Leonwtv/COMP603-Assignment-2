
package comp603.project1;
        import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


import javax.swing.WindowConstants;


/**Main class that calls on LaunchPageFrame method which progresses through the different classes*/

public class Main {
   
    
    public static void main(String[] args) {
        
      
    
    LaunchPageFrame launchPageFrame = new LaunchPageFrame();
    launchPageFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    launchPageFrame.setBounds(200, 200, 600, 600);
    launchPageFrame.setTitle("DND CHARACTER CREATOR");
    launchPageFrame.setVisible(true);
        
   //Database Creation and connection
    String databaseURL = "jdbc:derby:Characters_Database_v;create=true";
 
        try (Connection conn = DriverManager.getConnection(databaseURL)) {
            Statement statement = conn.createStatement();
 
            if (!doesTableExists("jdbc:derby:Characters_Database_v;create=true", conn)) {
              
                //Table set up
                    String sql = "CREATE TABLE CHARACTER_TABLE (NAME varchar(128) PRIMARY KEY, RACE varchar(128), CLASS varchar(128), STRENGTH int, DEXTERITY int, CONSTITUTION int, INTELLIGENCE int, WISDOM int, CHARISMA int, ABILITIES varchar(128), CLASSFEATURES varchar(128))";
                statement.execute(sql);
                System.out.println("Created CHARACTER_TABLE.");
                
                //Sample characters to fill the database
                sql = "INSERT INTO CHARACTER_TABLE VALUES ('Kor Ilo','Dwarf','Fighter', 13, 14, 10, 12, 9, 7,'Darkvision, Dwarven Resiliance, Dwarven Combat Training, Stonecunning', 'Fighting Style, Second Wind, Resolve, Maneuvers, Martial Archetype'), ('Jenta MireMurker','Half-Orc','Warlock', 10, 9, 13, 9, 14, 17,'Darkvision, Menacing, Relentless Endurance,Savage Attacks', 'Spellscript, Spellcasting, Arcane Tradition'),('Eron Leaf','Elf','Ranger', 13, 8, 12, 6, 16, 12,'Darkvision, Keen Seneses, Fey Ancestry, Trance', 'Survival Instincts, Hunters Focus, Scrap, Traps, Ranger Archetype')";
               
                statement.execute(sql);
                System.out.println("Inserted 12 rows.");
            }
 
            String sql = "SELECT * FROM CHARACTER_TABLE";
            ResultSet result = statement.executeQuery(sql);
 
            while (result.next()) {
                System.out.println(result.getString("NAME"));
            }

        } catch (SQLException ex) {
            if (ex.getSQLState().equals("XJ015")) {
              
            } else {
                ex.printStackTrace();
            }
        }
    }
 
    private static boolean doesTableExists(String tableName, Connection conn)
            throws SQLException {
        DatabaseMetaData meta = conn.getMetaData();
        ResultSet result = meta.getTables(null, null, tableName.toUpperCase(), null);
 
        return result.next();
    }    
 
}
   

