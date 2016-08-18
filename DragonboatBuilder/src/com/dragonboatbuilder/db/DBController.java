/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dragonboatbuilder.db;

import com.dragonboatbuilder.persons.Racer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                    + "forename TEXT, "
                    + "surname TEXT, "
                    + "nickname TEXT, "
                    + "email TEXT, "
                    + "position TEXT, "
                    + "weight INTEGER, "
                    + "birth DATE, "
                    + "active TEXT, "
                    + "description TEXT);");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS teams (id INTEGER PRIMARY KEY NOT NULL, "
                    + "name TEXT, "
                    + "tag TEXT, "
                    + "members, "
                    + "constalations, "
                    + "active, "
                    + "description);");

        } catch (SQLException e) {
            System.err.println(e);
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
            prep.addBatch();

            connection.setAutoCommit(false);
            prep.executeBatch();
            connection.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(DBController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertTeam() {

    }

    public Racer[] getPersons() {

        Statement stmt;
        Racer[] racer = null;
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM persons");

            for (int i = 0; rs.next(); i++) {
                racer[i].setId(rs.getInt(1));
                racer[i].setForename(rs.getString(2));
                racer[i].setSurname(rs.getString(3));
                racer[i].setNickname(rs.getString(4));
                racer[i].setEmail(rs.getString(5));
                racer[i].setPosition(rs.getString(6));
                racer[i].setWeight(rs.getDouble(7));
                racer[i].setBirth(rs.getString(8));
                racer[i].setActive(rs.getBoolean(9));
                racer[i].setDescription(rs.getString(10));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return racer;
    }
}
