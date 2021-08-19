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
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class EditeRoutine extends javax.swing.JFrame {

    ResultSet result, result2;
    Connection con, con2;
    Statement statement, statement2;
    ImageIcon myimage;
    String imagepath;
    String imagePaths;
    byte[] image;

    public EditeRoutine() {
        initComponents();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class_routine", "root", "6660052");
            con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldatabase", "root", "6660052");
        } catch (SQLException ex) {
        }

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
        showRoutin = new javax.swing.JButton();
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
        hours6 = new javax.swing.JLabel();
        sixthHour = new javax.swing.JLabel();
        hour6 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

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

        showRoutin.setBackground(new java.awt.Color(204, 204, 204));
        showRoutin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        showRoutin.setText("Show Class Routine");
        showRoutin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showRoutin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showRoutinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(beack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(editRoutin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(makeRoutine, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(showRoutin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(beack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(home))
                .addGap(18, 18, 18)
                .addComponent(makeRoutine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editRoutin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showRoutin)
                .addGap(0, 375, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        shift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Select Shift---", "Morning", "Afternoon", " " }));
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
        hours5.setText("G.Knowledge");

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

        hours6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hours6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours6.setText("Sociology");

        sixthHour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sixthHour.setText("  ");

        hour6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Teacher--", " " }));

        jLabel1.setBackground(new java.awt.Color(176, 253, 176));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edite  Routine");
        jLabel1.setOpaque(true);

        logout.setBackground(new java.awt.Color(204, 204, 204));
        logout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/log out icon.jpg"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("1st hour");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("2nd hour");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("3rd hour");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sixth hour");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("fourth hour");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Fifth hour");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(classs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(hour1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(hours1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(firstHour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(hours2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(hour2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(secondHour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hours3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(thirdHour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(hour3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hours4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fourthHour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hour4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fivthHour, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hour5, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hours5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hours6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hour6, 0, 125, Short.MAX_VALUE)
                            .addComponent(sixthHour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
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
                    .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(secondHour)
                        .addComponent(thirdHour)
                        .addComponent(fourthHour)
                        .addComponent(fivthHour)
                        .addComponent(sixthHour))
                    .addComponent(firstHour))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hours2)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(hours1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(hour1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hour2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hour3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hour4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hour5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hour6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(hours3)
                            .addComponent(hours4)
                            .addComponent(hours5))
                        .addGap(107, 107, 107)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(hours6)
                        .addGap(335, 335, 335))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 531, Short.MAX_VALUE))
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

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:

        try {

            String insert = "update class_routine." + shift.getSelectedItem() + " set class=?, first_hour=?, second_hour=?, third_hour=?, fourth_hour=?, fifth_hour=?, sixth_hour=?  where class=\"" + classs.getSelectedItem()+"\"";

            //Getting the connection
            PreparedStatement add = con.prepareStatement(insert)   ;
            add.setString(1, String.valueOf(classs.getSelectedItem()));
            add.setString(2, hours1.getText() + " " + String.valueOf(hour1.getSelectedItem()));
            add.setString(3, hours2.getText() + " " + String.valueOf(hour2.getSelectedItem()));
            add.setString(4, hours3.getText() + " " + String.valueOf(hour3.getSelectedItem()));
            add.setString(5, hours4.getText() + " " + String.valueOf(hour4.getSelectedItem()));
            add.setString(6, hours5.getText() + " " + String.valueOf(hour5.getSelectedItem()));
            add.setString(7, hours6.getText() + " " + String.valueOf(hour6.getSelectedItem()));
            if (add.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Routine update successfully");
            }
            
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
                break;
            default:
                break;
        }
    }//GEN-LAST:event_shiftItemStateChanged

    private void classsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_classsItemStateChanged
        // TODO add your handling code here:
        int Class = classs.getSelectedIndex();

        switch (Class) {
            case 1:
                hours1.setText("Bangla");
                hours2.setText("English");
                hours3.setText("Math");
                hours4.setText("Religion");
                hours5.setText("G.Knowledge");
                hours6.setText("sociology");
                try {
                    String query = "SELECT * FROM class_routine." + shift.getSelectedItem() + " where class=\"" + classs.getSelectedItem() + "\"";
                    statement2 = (Statement) con.createStatement();
                    result2 = statement2.executeQuery(query);
                    result2.next();
                    ArrayList<Object> a = new ArrayList();
                    for (int i = 2; i <= 7; i++) {
                        String[] s = result2.getString(i).split(" ");
                        a.add(s[1]);
                    }
                    hour1.setSelectedItem(a.get(0));
                    hour2.setSelectedItem(a.get(1));
                    hour3.setSelectedItem(a.get(2));
                    hour4.setSelectedItem(a.get(3));
                    hour5.setSelectedItem(a.get(4));
                    hour6.setSelectedItem(a.get(5));
                    
                } catch (SQLException e) {
                }   break;
            case 2:
                hours2.setText("Bangla");
                hours3.setText("English");
                hours4.setText("Math");
                hours5.setText("Religion");
                hours6.setText("G.Knowledge");
                hours1.setText("sociology");
                try {
                    String query = "SELECT * FROM class_routine." + shift.getSelectedItem() + " where class=\"" + classs.getSelectedItem() + "\"";
                    statement2 = (Statement) con.createStatement();
                    result2 = statement2.executeQuery(query);
                    result2.next();
                    ArrayList<Object> a = new ArrayList();
                    for (int i = 2; i <= 7; i++) {
                        String[] s = result2.getString(i).split(" ");
                        a.add(s[1]);
                    }
                    hour1.setSelectedItem(a.get(0));
                    hour2.setSelectedItem(a.get(1));
                    hour3.setSelectedItem(a.get(2));
                    hour4.setSelectedItem(a.get(3));
                    hour5.setSelectedItem(a.get(4));
                    hour6.setSelectedItem(a.get(5));
                    
                } catch (SQLException e) {
                }   break;
            case 3:
                hours3.setText("Bangla");
                hours4.setText("English");
                hours5.setText("Math");
                hours6.setText("Religion");
                hours1.setText("G.Knowledge");
                hours2.setText("sociology");
                try {
                    String query = "SELECT * FROM class_routine." + shift.getSelectedItem() + " where class=\"" + classs.getSelectedItem() + "\"";
                    statement2 = (Statement) con.createStatement();
                    result2 = statement2.executeQuery(query);
                    result2.next();
                    ArrayList<Object> a = new ArrayList();
                    for (int i = 2; i <= 7; i++) {
                        String[] s = result2.getString(i).split(" ");
                        a.add(s[1]);
                    }
                    hour1.setSelectedItem(a.get(0));
                    hour2.setSelectedItem(a.get(1));
                    hour3.setSelectedItem(a.get(2));
                    hour4.setSelectedItem(a.get(3));
                    hour5.setSelectedItem(a.get(4));
                    hour6.setSelectedItem(a.get(5));
                    
                } catch (SQLException e) {
                }   break;
            case 4:
                hours4.setText("Bangla");
                hours5.setText("English");
                hours6.setText("Math");
                hours1.setText("Religion");
                hours2.setText("G.Knowledge");
                hours3.setText("sociology");
                try {
                    String query = "SELECT * FROM class_routine." + shift.getSelectedItem() + " where class=\"" + classs.getSelectedItem() + "\"";
                    statement2 = (Statement) con.createStatement();
                    result2 = statement2.executeQuery(query);
                    result2.next();
                    ArrayList<Object> a = new ArrayList();
                    for (int i = 2; i <= 7; i++) {
                        String[] s = result2.getString(i).split(" ");
                        a.add(s[1]);
                    }
                    hour1.setSelectedItem(a.get(0));
                    hour2.setSelectedItem(a.get(1));
                    hour3.setSelectedItem(a.get(2));
                    hour4.setSelectedItem(a.get(3));
                    hour5.setSelectedItem(a.get(4));
                    hour6.setSelectedItem(a.get(5));
                    
                } catch (SQLException e) {
                }   break;
            case 5:
                hours5.setText("Bangla");
                hours6.setText("English");
                hours1.setText("Math");
                hours2.setText("Religion");
                hours3.setText("G.Knowledge");
                hours4.setText("sociology");
                try {
                    String query = "SELECT * FROM class_routine." + shift.getSelectedItem() + " where class=\"" + classs.getSelectedItem() + "\"";
                    statement2 = (Statement) con.createStatement();
                    result2 = statement2.executeQuery(query);
                    result2.next();
                    ArrayList<Object> a = new ArrayList();
                    for (int i = 2; i <= 7; i++) {
                        String[] s = result2.getString(i).split(" ");
                        a.add(s[1]);
                    }
                    hour1.setSelectedItem(a.get(0));
                    hour2.setSelectedItem(a.get(1));
                    hour3.setSelectedItem(a.get(2));
                    hour4.setSelectedItem(a.get(3));
                    hour5.setSelectedItem(a.get(4));
                    hour6.setSelectedItem(a.get(5));
                    
                } catch (SQLException e) {
                }   break;
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

    private void showRoutinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showRoutinActionPerformed
        // TODO add your handling code here:
        new shhow_routine().setVisible(true);
        dispose();
    }//GEN-LAST:event_showRoutinActionPerformed

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
            java.util.logging.Logger.getLogger(EditeRoutine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EditeRoutine().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beack;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> classs;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logout;
    private javax.swing.JButton makeRoutine;
    private javax.swing.JButton save;
    private javax.swing.JLabel secondHour;
    private javax.swing.JComboBox<String> shift;
    private javax.swing.JButton showRoutin;
    private javax.swing.JLabel sixthHour;
    private javax.swing.JLabel thirdHour;
    // End of variables declaration//GEN-END:variables
}
