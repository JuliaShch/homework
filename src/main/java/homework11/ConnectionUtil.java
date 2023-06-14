package main.java.homework11;
import java.sql.*;

public class ConnectionUtil {

  public Connection connect_to_db(String dbname, String user, String pass) {
    Connection conn = null;
    try {
      Class.forName("org.postgresql.Driver");
      conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, pass);
      if (conn != null) {
        System.out.println("connection Established");
      } else {
        System.out.println("connection Failed");
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    return conn;
  }

  public void createTable(Connection conn, String table_name) {
    Statement statement;
    try {
      String query = "CREATE TABLE " + table_name +
          "(id serial, name varchar(10), gender varchar(6), collected boolean, primary key(id));";
      statement = conn.createStatement();
      statement.executeUpdate(query);
      System.out.println("table is created: " + table_name);
    } catch (Exception e) {
      System.out.println("the table isn't created");
    }
  }

  public void insert_row(Connection conn, String name, String gender, boolean collected) {
    Statement statement;
    try {
      String query = String.format("INSERT INTO my_dolls(name, gender, collected) " +
          "VALUES ('%s','%s','%s');", name, gender, collected);
      statement = conn.createStatement();
      statement.executeUpdate(query);
      System.out.println("row added");
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public void allDolls(Connection conn, String table_name) throws SQLException {
    Statement statement;
    try {
      String query = "SELECT * FROM " + table_name + ";";
      statement = conn.createStatement();
      ResultSet result = statement.executeQuery(query);
      while (result.next()) {
        int id = result.getInt("id");
        String name = result.getString("name");
        String gender = result.getString("gender");
        System.out.printf("%d. name: %s, gender: %s\n", id, name, gender);
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
  public void delete(Connection conn) {
    Statement statement;
    try {
      String query = "DELETE FROM my_dolls WHERE collected = " + false +";";
      statement = conn.createStatement();
      statement.executeUpdate(query);
      System.out.println("non-collectible doll is sold");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
