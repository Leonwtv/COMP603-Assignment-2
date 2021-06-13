/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp603.project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseExperimentClass {
  static Connection conn;

  public static void main(String[] args) {
    String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    String connectionURL = "jdbc:derby:Database2;create=true";
    String createString = "CREATE TABLE Characters (NAME VARCHAR(32) NOT NULL, Race VARCHAR(50) NOT NULL)";
    try {
      Class.forName(driver);
    } catch (java.lang.ClassNotFoundException e) {
      e.printStackTrace();
    }
    try {
      conn = DriverManager.getConnection(connectionURL);
      Statement stmt = conn.createStatement();
      stmt.executeUpdate(createString);

      PreparedStatement psInsert = conn.prepareStatement("insert into Characters values (?,?)");

      psInsert.setString(1, args[0]);
      psInsert.setString(2, args[1]);

      psInsert.executeUpdate();

      Statement stmt2 = conn.createStatement();
      ResultSet rs = stmt2.executeQuery("select * from Employee");
      int num = 0;
      while (rs.next()) {
        System.out.println(++num + ": Name: " + rs.getString(1) + "\n Race" + rs.getString(2));
      }
      rs.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}