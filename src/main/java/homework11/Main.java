package main.java.homework11;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
  public static void main(String[] args) throws SQLException, InterruptedException {
    ConnectionUtil db = new ConnectionUtil();
    Connection conn = db.connect_to_db("dolls", "user123", "qwerty");
    db.createTable(conn, "my_dolls");
    db.insert_row(conn, "Agnes", "female",  true);
    db.insert_row(conn, "Kyori", "female", true);
    db.insert_row(conn, "Adonis", "male", true);
    db.insert_row(conn, "Joe", "male", false);
    db.allDolls(conn, "my_dolls");
    System.out.println("");
    db.delete(conn);
  }
}
