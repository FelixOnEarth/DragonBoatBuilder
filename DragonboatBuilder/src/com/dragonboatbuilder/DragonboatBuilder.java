/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dragonboatbuilder;

import com.dragonboatbuilder.gui.Menu;
import com.dragonboatbuilder.db.DBController;



/**
 *
 * @author Felix
 */
public class DragonboatBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Starting...");
        
        Menu menu = new Menu();
        menu.setVisible(true);
        
        DBController dbc = new DBController.getInstance();
        
        System.out.println("DragonboatBuilder closed");
    }
    
}
