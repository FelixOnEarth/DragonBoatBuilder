/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dragonboatbuilder.db;

import com.dragonboatbuilder.physicalObjects.Racer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.Object;

/**
 *
 * @author Felix
 */
public class DBController {

    private static final DBController DBCONTROLLER = new DBController();
    private static Connection connection;
    private static final String DB_PATH = "DragonboatBuilder.db";

    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.err.println("Can't load JDBC driver");
        }
    }

    public DBController() {
        initDBConnection();
        handleDB();
    }

    public static DBController getInstance() {
        return DBCONTROLLER;
    }

    private void initDBConnection() {
        try {
            if (connection != null) {
                return;
            }
            System.out.println("Creating Connection to Database...");
            connection = DriverManager.getConnection("jdbc:sqlite:" + DB_PATH);
            if (!connection.isClosed()) {
                System.out.println("...Connection established");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                try {
                    if (!connection.isClosed() && connection != null) {
                        connection.close();
                        if (connection.isClosed()) {
                            System.out.println("Connection to Database is closed");
                        }
                    }
                } catch (SQLException e) {
                    System.err.println(e);
                }
            }
        });
    }

    private void handleDB() {
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS persons (id INTEGER PRIMARY KEY NOT NULL, "
                    + "forename , "
                    + "surname , "
                    + "nickname , "
                    + "email , "
                    + "position , "
                    + "weight , "
                    + "birth , "
                    + "active,"
                    + "description );");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS teams (id INTEGER PRIMARY KEY NOT NULL, "
                    + "name , "
                    + "members, "
                    + "constalations, "
                    + "active, "
                    + "description);");
        } catch (SQLException e) {
            System.err.println("SQL ERROR: " + e);
        }
    }

    public void insertPerson(String forename, String surname, String nickname, String email, String position, double weight, String birth, boolean active, String description) {
        try {
            PreparedStatement prep = connection.prepareStatement("INSERT INTO persons VALUES (?,?,?,?,?,?,?,?,?,?);"); //id, forename, surname, nickname, email, position, weight, birth, active, description

            Statement stmt = connection.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT COUNT (*) FROM persons");
            int id = rs.getInt(1);
            id++;

            prep.setInt(1, id);
            prep.setString(2, forename);
            prep.setString(3, surname);
            prep.setString(4, nickname);
            prep.setString(5, email);
            prep.setString(6, position);
            prep.setDouble(7, weight);
            prep.setString(8, birth);
            prep.setBoolean(9, active);
            prep.setString(10, description);
            prep.executeUpdate();

            Statement stmt2 = connection.createStatement();

            ResultSet rs2 = stmt2.executeQuery("SELECT * FROM persons WHERE id='" + id + "';");
            if (rs2.getInt("id") == id) {
                System.out.println("Created successfull new Racer");
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBController.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error:" + ex);
        }
    }

    public void insertTeam() {

    }

    public static Object[][] getPersons() {

        Statement stmt;
        Statement stmt_count;
        try {
            stmt = connection.createStatement();
            stmt_count = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM persons");
            // object[0][0] = rs.getInt("id");
  
            ResultSet rs_count = stmt_count.executeQuery("SELECT COUNT (*) FROM persons");
            
            
            
            Object[][] object = new Object[rs_count.getInt(1)][10];


            for (int i = 0; rs.next(); i++) {

                object[i][0] = rs.getInt(1); //ID
                object[i][1] = rs.getString(2); //Forenaem
                object[i][2] = rs.getString(3); //Surname
                object[i][3] = rs.getString(4); //Nickname
                object[i][4] = rs.getString(5); //Email
                object[i][5] = rs.getString(6); //Position
                object[i][6] = rs.getDouble(7); //Weight
                object[i][7] = rs.getString(8); //Birth
                object[i][8] = rs.getBoolean(9); //Active
                object[i][9] = rs.getString(10); //Description

           

            }
            return object;
        } catch (SQLException ex) {
            Logger.getLogger(DBController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            return null;

        }

    }
}
