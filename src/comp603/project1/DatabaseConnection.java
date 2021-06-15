package comp603.project1;
        
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DatabaseConnection {
    
   public void makeConnection(){
       
        //Database Connection
        String url = "jdbc:derby:Characters_Database_v;create=true";
        //Table is created if it does not already created
        try (Connection con = DriverManager.getConnection(url)) {
            Statement sm = con.createStatement();

        if (!hasTableBeenCreated("jdbc:derby:Characters_Database_v;create=true", con)) {

            //Database table set up
            String sql = "CREATE TABLE CHARACTER_TABLE (NAME varchar(128) PRIMARY KEY, RACE varchar(128), CLASS varchar(128), STRENGTH int, DEXTERITY int, CONSTITUTION int, INTELLIGENCE int, WISDOM int, CHARISMA int, ABILITIES varchar(128), CLASSFEATURES varchar(128))";
            sm.execute(sql);
            System.out.println("Created CHARACTER_TABLE.");

            //Sample characters inserted into table to fill the database
            sql = "INSERT INTO CHARACTER_TABLE VALUES ('Kor Ilo','Dwarf','Fighter', 13, 14, 10, 12, 9, 7,'Darkvision, Dwarven Resiliance, Dwarven Combat Training, Stonecunning', 'Fighting Style, Second Wind, Resolve, Maneuvers, Martial Archetype'),"
                    + " ('Jenta MireMurker','Half-Orc','Warlock', 10, 9, 13, 9, 14, 17,'Darkvision, Menacing, Relentless Endurance,Savage Attacks', 'Spellscript, Spellcasting, Arcane Tradition'),"
                    + "('Eron Leaf','Elf','Ranger', 13, 8, 12, 6, 16, 12,'Darkvision, Keen Seneses, Fey Ancestry, Trance', 'Survival Instincts, Hunters Focus, Scrap, Traps, Ranger Archetype')";
            sm.execute(sql);
        }

        String sql = "SELECT * FROM CHARACTER_TABLE";
        ResultSet rs = sm.executeQuery(sql);

        while (rs.next()) {
            System.out.println(rs.getString("NAME"));
        }

    } catch (SQLException e) {
        if (e.getSQLState().equals("Exception")) {

        } else {
            e.printStackTrace();
        }
    }
    
}
 
    private static boolean hasTableBeenCreated
        (String tableName, Connection con)
        throws SQLException {
            DatabaseMetaData metadata = con.getMetaData();
            ResultSet rs = metadata.getTables(null, null, tableName.toUpperCase(), null);

            return rs.next();
    }    
        
}
