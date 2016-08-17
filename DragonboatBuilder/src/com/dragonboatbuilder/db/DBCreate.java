/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dragonboatbuilder.db;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author felix
 */
public class DBCreate {

    private static final DBCreate DBCREATE = new DBCreate();
    private static Connection connection;
    private static String db_path;
    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.err.println("Error: can't find can't find JDBC Driver");
            e.printStackTrace();
        }
    }

    public DBCreate() {

    }

    public DBCreate(String path, String dbname) {
        DBCreate.db_path = path;
    }

    public static DBCreate getInstance() {
        return DBCREATE;
    }
private void initDBConnection(){
    try{
        if(connection != null)
            return;
        System.out.println("Creating Connection to Database");
        connection = DriverManager.getConnection("jdbc:sqlite"+db_path);
        
    }catch(SQLException e){
        
    }
}
}
