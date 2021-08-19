/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claasroutinHome;

import StudentInformaton.*;
import HomeAndLogin.Home;
import HomeAndLogin.Login;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class MakeRoutine extends javax.swing.JFrame {

    ResultSet result, result2;
    Connection con, con2;
    Statement statement, statement2;
    ImageIcon myimage;
    String imagepath;
    String imagePaths;
    byte[] image;

    public MakeRoutine() {
        initComponents();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class_routine", "root", "6660052");
            con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldatabase", "root", "6660052");
        } catch (SQLException ex) {
        }
        eday.setVisible(false);
        morningTeacher();
        
    }

    public void morningTeacher() {
        try {
           
            String query = "SELECT * FROM schooldatabase.employee where designation=\"Assistance Teacher\"";
            statement2 = (Statement) con2.createStatement();
            result2 = statement2.executeQuery(query);

            while (result2.next()) {
                String[] s = result2.getString(3).split(" ");
                hour1.addItem(s[1]);
                hour2.addItem(s[1]);
                hour3.addItem(s[1]);
                hour4.addItem(s[1]);
                hour5.addItem(s[1]);
                hour6.addItem(s[1]);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        beack = new javax.swing.JButton();
        makeRoutine = new javax.swing.JButton();
        editRoutin = new javax.swing.JButton();
        showRoutine = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        shift = new javax.swing.JComboBox<>();
        classs = new javax.swing.JComboBox<>();
        hours1 = new javax.swing.JLabel();
        firstHour = new javax.swing.JLabel();
        hour1 = new javax.swing.JComboBox<>();
        hours2 = new javax.swing.JLabel();
        secondHour = new javax.swing.JLabel();
        hour2 = new javax.swing.JComboBox<>();
        hours3 = new javax.swing.JLabel();
        thirdHour = new javax.swing.JLabel();
        hour3 = new javax.swing.JComboBox<>();
        fourthHour = new javax.swing.JLabel();
        hours4 = new javax.swing.JLabel();
        hour4 = new javax.swing.JComboBox<>();
        hours5 = new javax.swing.JLabel();
        fivthHour = new javax.swing.JLabel();
        hour5 = new javax.swing.JComboBox<>();
        save = new javax.swing.JButton();
        eday = new javax.swing.JComboBox<>();
        hours6 = new javax.swing.JLabel();
        sixthHour = new javax.swing.JLabel();
        hour6 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Student");
        setPreferredSize(new java.awt.Dimension(1050, 600));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        home.setBackground(new java.awt.Color(204, 204, 204));
        home.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.jpg"))); // NOI18N
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        beack.setBackground(new java.awt.Color(204, 204, 204));
        beack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        beack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/beack icon.jpg"))); // NOI18N
        beack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beackActionPerformed(evt);
            }
        });

        makeRoutine.setBackground(new java.awt.Color(204, 204, 204));
        makeRoutine.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        makeRoutine.setText("Make Routine");
        makeRoutine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        makeRoutine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeRoutineActionPerformed(evt);
            }
        });

        editRoutin.setBackground(new java.awt.Color(204, 204, 204));
        editRoutin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        editRoutin.setText("Edit Routine");
        editRoutin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editRoutin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editRoutinActionPerformed(evt);
            }
        });

        showRoutine.setBackground(new java.awt.Color(204, 204, 204));
        showRoutine.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        showRoutine.setText("Show Class Routine");
        showRoutine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showRoutine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showRoutineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(beack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(editRoutin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(makeRoutine, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(showRoutine))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(beack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(makeRoutine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editRoutin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showRoutine)
                .addGap(0, 368, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        shift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Select Shift---", "Morning", "Afternoon", "Evening" }));
        shift.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                shiftItemStateChanged(evt);
            }
        });

        classs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Select Class---", "One", "Two", "Three", "Four", "five" }));
        classs.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                classsItemStateChanged(evt);
            }
        });

        hours1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hours1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours1.setText("Bangla");

        firstHour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstHour.setText("  ");

        hour1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Teacher--", " " }));

        hours2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hours2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours2.setText("English");

        secondHour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        secondHour.setText("  ");

        hour2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Teacher--", " " }));

        hours3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hours3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours3.setText("Math");

        thirdHour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thirdHour.setText("  ");

        hour3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Teacher--", " " }));

        fourthHour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fourthHour.setText("  ");

        hours4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hours4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours4.setText("Religion");

        hour4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Teacher--", " " }));

        hours5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hours5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours5.setText("G. Knowledge");

        fivthHour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fivthHour.setText("  ");

        hour5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Teacher--", " " }));

        save.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        eday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Day--", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", " " }));
        eday.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                edayItemStateChanged(evt);
            }
        });

        hours6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hours6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours6.setText("Sociology");

        sixthHour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sixthHour.setText("  ");

        hour6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Teacher--", " " }));

        jLabel1.setBackground(new java.awt.Color(186, 253, 186));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Make Routine");
        jLabel1.setOpaque(true);

        logout.setBackground(new java.awt.Color(204, 204, 204));
        logout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/log out icon.jpg"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(classs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eday, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hour1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hours1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstHour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(secondHour, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hour2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hours2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hours3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hour3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thirdHour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hours4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hour4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fourthHour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fivthHour, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hour5, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hours5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(sixthHour, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hour6, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hours6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(15, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classs, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eday, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(hours2)
                            .addGap(0, 0, 0)
                            .addComponent(secondHour)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(hour2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(hours1)
                            .addGap(0, 0, 0)
                            .addComponent(firstHour)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(hour1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(hours3)
                            .addGap(0, 0, 0)
                            .addComponent(thirdHour)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(hour3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(hours4)
                            .addGap(0, 0, 0)
                            .addComponent(fourthHour)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(hour4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(hours5)
                            .addGap(0, 0, 0)
                            .addComponent(fivthHour)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(hour5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(hours6)
                        .addGap(0, 0, 0)
                        .addComponent(sixthHour)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hour6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(145, 145, 145)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:

        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void beackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beackActionPerformed
        // TODO add your handling code here:
        new classroutinHome().setVisible(true);
        dispose();
    }//GEN-LAST:event_beackActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
           new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void edayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_edayItemStateChanged
        // TODO add your handling code here:
        int days = eday.getSelectedIndex();
        switch (days) {
            case 1:
            case 2:
                hours1.setText("Bangla");
                hours2.setText("English");
                hours3.setText("Math");
                hours4.setText("Religion");
                break;
            case 3:
            case 4:
                hours1.setText("Socioloy");
                hours2.setText("English");
                hours3.setText("Math");
                hours4.setText("G. Knowledge");
                break;
            case 5:
            case 6:
                hours1.setText("Bangla");
                hours2.setText("English");
                hours3.setText("Math");
                hours4.setText("Religion");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_edayItemStateChanged

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:

        try {

            String insert = "INSERT INTO  class_routine." + shift.getSelectedItem() + " VALUES (?,?,?,?,?,?,?)";   // insert data to Database

            PreparedStatement add = con.prepareStatement(insert);

            add.setString(1, String.valueOf(classs.getSelectedItem()));
            add.setString(2, hours1.getText() + " " + String.valueOf(hour1.getSelectedItem()));
            add.setString(3, hours2.getText() + " " + String.valueOf(hour2.getSelectedItem()));
            add.setString(4, hours3.getText() + " " + String.valueOf(hour3.getSelectedItem()));
            add.setString(5, hours4.getText() + " " + String.valueOf(hour4.getSelectedItem()));
            add.setString(6, hours5.getText() + " " + String.valueOf(hour5.getSelectedItem()));
            add.setString(7, hours6.getText() + " " + String.valueOf(hour6.getSelectedItem()));
            if (add.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Routine add successfully");
            }
            //            hour1.setSelectedIndex(0);
            //            hour2.setSelectedIndex(0);
            //            hour3.setSelectedIndex(0);
            //            hour4.setSelectedIndex(0);
            //            hour5.setSelectedIndex(0);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void shiftItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_shiftItemStateChanged
        // TODO add your handling code here:
        int index = shift.getSelectedIndex();

        switch (index) {
            case 1:
                firstHour.setText("07:10 - 07:50");
                secondHour.setText("07:50 - 08:30");
                thirdHour.setText("08:30 - 09:10");
                fourthHour.setText("09:10- 09:50");
                fivthHour.setText("09:50 - 10:30");
                sixthHour.setText("10:30 - 11:10");
                fivthHour.setVisible(true);
                hour5.setVisible(true);
                hours5.setVisible(true);
                this.setSize(1100, 600);
                eday.setVisible(false);
                sixthHour.setVisible(true);
                hour6.setVisible(true);
                hours6.setVisible(true);
                break;
            case 2:
                firstHour.setText("01:10 - 01:50");
                secondHour.setText("01:50 - 02:30");
                thirdHour.setText("02:30 - 03:10");
                fourthHour.setText("03:10- 03:50");
                fivthHour.setText("03:50 - 4:50");
                sixthHour.setText("04:50 - 5:30");
                fivthHour.setVisible(true);
                hour5.setVisible(true);
                hours5.setVisible(true);
                sixthHour.setVisible(true);
                hour6.setVisible(true);
                hours6.setVisible(true);
                this.setSize(1100, 600);
                eday.setVisible(false);
                break;
            case 3:
                firstHour.setText("06:00 - 07:45");
                secondHour.setText("06:45 - 07:30");
                thirdHour.setText("07:30 - 08:15");
                fourthHour.setText("08:10- 09:00");
                fivthHour.setVisible(false);
                hour5.setVisible(false);
                hours5.setVisible(false);
                sixthHour.setVisible(false);
                hour6.setVisible(false);
                hours6.setVisible(false);
                eday.setVisible(true);
                this.setSize(900, 600);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_shiftItemStateChanged

    private void classsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_classsItemStateChanged
        // TODO add your handling code here:
        int days = classs.getSelectedIndex();
        switch (days) {
            case 1:
                hours1.setText("Bangla");
                hours2.setText("English");
                hours3.setText("Math");
                hours4.setText("Religion");
                hours5.setText("G.Knowledge");
                hours6.setText("sociology");
                break;
            case 2:
                hours2.setText("Bangla");
                hours3.setText("English");
                hours4.setText("Math");
                hours5.setText("Religion");
                hours6.setText("G.Knowledge");
                hours1.setText("sociology");
                break;
            case 3:
                hours3.setText("Bangla");
                hours4.setText("English");
                hours5.setText("Math");
                hours6.setText("Religion");
                hours1.setText("G.Knowledge");
                hours2.setText("sociology");
                break;
            case 4:
                hours4.setText("Bangla");
                hours5.setText("English");
                hours6.setText("Math");
                hours1.setText("Religion");
                hours2.setText("G.Knowledge");
                hours3.setText("sociology");
                break;
            case 5:
                hours5.setText("Bangla");
                hours6.setText("English"); 
                hours1.setText("Math");
                hours2.setText("Religion");
                hours3.setText("G.Knowledge");
                hours4.setText("sociology");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_classsItemStateChanged

    private void makeRoutineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeRoutineActionPerformed
        // TODO add your handling code here:
        new MakeRoutine().setVisible(true);
        dispose();
    }//GEN-LAST:event_makeRoutineActionPerformed

    private void editRoutinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editRoutinActionPerformed
        // TODO add your handling code here:
        new EditeRoutine().setVisible(true);
        dispose();
    }//GEN-LAST:event_editRoutinActionPerformed

    private void showRoutineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showRoutineActionPerformed
        // TODO add your handling code here:
        new shhow_routine().setVisible(true);
        dispose();
    }//GEN-LAST:event_showRoutineActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MakeRoutine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MakeRoutine().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beack;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> classs;
    private javax.swing.JComboBox<String> eday;
    private javax.swing.JButton editRoutin;
    private javax.swing.JLabel firstHour;
    private javax.swing.JLabel fivthHour;
    private javax.swing.JLabel fourthHour;
    private javax.swing.JButton home;
    private javax.swing.JComboBox<String> hour1;
    private javax.swing.JComboBox<String> hour2;
    private javax.swing.JComboBox<String> hour3;
    private javax.swing.JComboBox<String> hour4;
    private javax.swing.JComboBox<String> hour5;
    private javax.swing.JComboBox<String> hour6;
    private javax.swing.JLabel hours1;
    private javax.swing.JLabel hours2;
    private javax.swing.JLabel hours3;
    private javax.swing.JLabel hours4;
    private javax.swing.JLabel hours5;
    private javax.swing.JLabel hours6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logout;
    private javax.swing.JButton makeRoutine;
    private javax.swing.JButton save;
    private javax.swing.JLabel secondHour;
    private javax.swing.JComboBox<String> shift;
    private javax.swing.JButton showRoutine;
    private javax.swing.JLabel sixthHour;
    private javax.swing.JLabel thirdHour;
    // End of variables declaration//GEN-END:variables
}
