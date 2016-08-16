/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dragonboatbuilder.gui;

import com.dragonboatbuilder.persons.Racer;
import java.awt.event.FocusEvent;

/**
 *
 * @author Felix
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_NewRacer = new javax.swing.JDialog();
        jButton_Ok = new javax.swing.JButton();
        jLabel_forename = new javax.swing.JLabel();
        jTextField_forename = new javax.swing.JTextField();
        jLabel_surname = new javax.swing.JLabel();
        jTextField_surname = new javax.swing.JTextField();
        jLabel_nickname = new javax.swing.JLabel();
        jTextField_nickname = new javax.swing.JTextField();
        jLabel_email = new javax.swing.JLabel();
        jTextField_position = new javax.swing.JTextField();
        jLabel_position = new javax.swing.JLabel();
        jTextField_email = new javax.swing.JTextField();
        jLabel_weight = new javax.swing.JLabel();
        jTextField_weight = new javax.swing.JTextField();
        jLabel_birth = new javax.swing.JLabel();
        jTextField_birth = new javax.swing.JTextField();
        jLabel_note = new javax.swing.JLabel();
        jButton_Build = new javax.swing.JButton();
        jButton_Show = new javax.swing.JButton();
        jButton_NewRacer = new javax.swing.JButton();
        jButton_AllRacers = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_File = new javax.swing.JMenu();
        jMenuItem_OpenDatabase = new javax.swing.JMenuItem();
        jMenuItem_CreateDB = new javax.swing.JMenuItem();
        jMenuItem_Import = new javax.swing.JMenuItem();
        jMenuItem_Export = new javax.swing.JMenuItem();
        jMenuItem_Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu_Help = new javax.swing.JMenu();
        jMenu_About = new javax.swing.JMenu();

        jDialog_NewRacer.setTitle("DragonboatBuilder: NewRacer");
        jDialog_NewRacer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDialog_NewRacer.setMinimumSize(new java.awt.Dimension(400, 350));
        jDialog_NewRacer.setModal(true);

        jButton_Ok.setText("OK");
        jButton_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OkActionPerformed(evt);
            }
        });

        jLabel_forename.setText("Forename");

        jLabel_surname.setText("Surname");

        jLabel_nickname.setText("Nickname");

        jLabel_email.setText("E-Mail");

        jTextField_position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_positionActionPerformed(evt);
            }
        });

        jLabel_position.setText("Postition");

        jLabel_weight.setText("Weight");

        jLabel_birth.setText("Birth Date");

        jTextField_birth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_birthFocusGained(evt);
            }
        });

        jLabel_note.setForeground(new java.awt.Color(255, 64, 64));
        jLabel_note.setFocusTraversalPolicyProvider(true);

        javax.swing.GroupLayout jDialog_NewRacerLayout = new javax.swing.GroupLayout(jDialog_NewRacer.getContentPane());
        jDialog_NewRacer.getContentPane().setLayout(jDialog_NewRacerLayout);
        jDialog_NewRacerLayout.setHorizontalGroup(
            jDialog_NewRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_NewRacerLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jDialog_NewRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_nickname)
                    .addComponent(jLabel_surname)
                    .addComponent(jLabel_forename)
                    .addComponent(jLabel_email)
                    .addComponent(jLabel_position)
                    .addComponent(jLabel_weight)
                    .addComponent(jLabel_birth))
                .addGap(18, 18, 18)
                .addGroup(jDialog_NewRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_forename)
                    .addComponent(jTextField_surname, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jTextField_email, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jTextField_position, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jTextField_weight, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jTextField_nickname, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jLabel_note, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_birth, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jButton_Ok)
                .addContainerGap())
        );
        jDialog_NewRacerLayout.setVerticalGroup(
            jDialog_NewRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_NewRacerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jDialog_NewRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_forename)
                    .addComponent(jTextField_forename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog_NewRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_surname)
                    .addComponent(jTextField_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog_NewRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nickname)
                    .addComponent(jTextField_nickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog_NewRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_email)
                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog_NewRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_position)
                    .addComponent(jTextField_position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog_NewRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_weight)
                    .addComponent(jTextField_weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog_NewRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_birth)
                    .addComponent(jTextField_birth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jDialog_NewRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Ok)
                    .addComponent(jLabel_note))
                .addContainerGap())
        );

        jTextField_birth.getAccessibleContext().setAccessibleName("");
        jTextField_birth.getAccessibleContext().setAccessibleDescription("");
        jLabel_note.setVisible(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DragonboatBuilder: Menu");

        jButton_Build.setText("Build Boat");

        jButton_Show.setText("Show Boat");

        jButton_NewRacer.setText("New Racer");
        jButton_NewRacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NewRacerActionPerformed(evt);
            }
        });

        jButton_AllRacers.setText("All Racers");

        jMenu_File.setText("File");

        jMenuItem_OpenDatabase.setText("Open Database");
        jMenu_File.add(jMenuItem_OpenDatabase);

        jMenuItem_CreateDB.setText("New Database");
        jMenu_File.add(jMenuItem_CreateDB);

        jMenuItem_Import.setText("Import Database");
        jMenu_File.add(jMenuItem_Import);

        jMenuItem_Export.setText("Export Database");
        jMenu_File.add(jMenuItem_Export);

        jMenuItem_Exit.setText("Exit");
        jMenuItem_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ExitActionPerformed(evt);
            }
        });
        jMenu_File.add(jMenuItem_Exit);

        jMenuBar1.add(jMenu_File);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu_Help.setText("Help");
        jMenuBar1.add(jMenu_Help);

        jMenu_About.setText("About");
        jMenuBar1.add(jMenu_About);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Show, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(jButton_AllRacers, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(jButton_Build, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_NewRacer, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton_Build, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Show, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_NewRacer, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_AllRacers, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_ExitActionPerformed

    private void jButton_NewRacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NewRacerActionPerformed
        // TODO add your handling code here:
        String str = "";
        jTextField_forename.setText(str);
        jTextField_surname.setText(str);
        jTextField_nickname.setText(str);
        jTextField_email.setText(str);
        jTextField_position.setText(str);
        jTextField_weight.setText(str);
        jTextField_birth.setText(str);
        jLabel_note.setText(str);
        jDialog_NewRacer.setVisible(true);
    }//GEN-LAST:event_jButton_NewRacerActionPerformed

    private void jButton_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OkActionPerformed
        // TODO add your handling code here:
        String str = "";
        String forename = jTextField_forename.getText();
        String surname = jTextField_surname.getText();
        String nickname = jTextField_nickname.getText();
        String email = jTextField_email.getText();
        String position = jTextField_position.getText();
        Double weight;
        if (jTextField_weight.getText().equals(str)) {
            weight = 0.0;
        } else {
            weight = Double.parseDouble(jTextField_weight.getText());
        }
        String birth = jTextField_birth.getText();
        
        System.out.println(birth);
        
        if (forename.equals(str)
                && surname.equals(str)
                && nickname.equals(str)
                && email.equals(str)
                && position.equals(str)
                && weight == 0
                && birth.equals(str)) {
            jLabel_note.setText("All fields empty!");
            jLabel_note.setVisible(true);
        } else if (forename.equals(str)
                && surname.equals(str)
                && nickname.equals(str)) {
            jLabel_note.setText("Need a name!");
            jLabel_note.setVisible(true);
        } else {
            jLabel_note.setVisible(false);
            Racer racer = new Racer();

            //Set Values to Racer Class
            racer.setForename(forename);
            racer.setSurname(surname);
            racer.setNickname(nickname);
            racer.setEmail(email);
            racer.setWeight(weight);
            racer.setBirth(birth);
        }
        jDialog_NewRacer.dispose();
    }//GEN-LAST:event_jButton_OkActionPerformed

    private void jTextField_positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_positionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_positionActionPerformed

    private void jTextField_birthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_birthFocusGained

    }//GEN-LAST:event_jTextField_birthFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AllRacers;
    private javax.swing.JButton jButton_Build;
    private javax.swing.JButton jButton_NewRacer;
    private javax.swing.JButton jButton_Ok;
    private javax.swing.JButton jButton_Show;
    private javax.swing.JDialog jDialog_NewRacer;
    private javax.swing.JLabel jLabel_birth;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_forename;
    private javax.swing.JLabel jLabel_nickname;
    private javax.swing.JLabel jLabel_note;
    private javax.swing.JLabel jLabel_position;
    private javax.swing.JLabel jLabel_surname;
    private javax.swing.JLabel jLabel_weight;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_CreateDB;
    private javax.swing.JMenuItem jMenuItem_Exit;
    private javax.swing.JMenuItem jMenuItem_Export;
    private javax.swing.JMenuItem jMenuItem_Import;
    private javax.swing.JMenuItem jMenuItem_OpenDatabase;
    private javax.swing.JMenu jMenu_About;
    private javax.swing.JMenu jMenu_File;
    private javax.swing.JMenu jMenu_Help;
    private javax.swing.JTextField jTextField_birth;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_forename;
    private javax.swing.JTextField jTextField_nickname;
    private javax.swing.JTextField jTextField_position;
    private javax.swing.JTextField jTextField_surname;
    private javax.swing.JTextField jTextField_weight;
    // End of variables declaration//GEN-END:variables
}
