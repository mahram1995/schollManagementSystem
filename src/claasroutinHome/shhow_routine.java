/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claasroutinHome;

import HomeAndLogin.Home;
import HomeAndLogin.Login;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class shhow_routine extends javax.swing.JFrame {

    ResultSet result, result2;
    Connection con, con2;
    Statement statement, statement2;
    ImageIcon myimage;
    String imagepath;
    String imagePaths;
    byte[] image;

    public shhow_routine() {
        initComponents();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class_routine", "root", "6660052");
            con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldatabase", "root", "6660052");
        } catch (SQLException ex) {
        }

    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        new javax.swing.ButtonGroup();
        new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        makeRoutine = new javax.swing.JButton();
        editRoutin = new javax.swing.JButton();
        showRoutine = new javax.swing.JButton();
        home = new javax.swing.JButton();
        beack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        shift = new javax.swing.JComboBox<>();
        hours1 = new javax.swing.JLabel();
        hours2 = new javax.swing.JLabel();
        hours3 = new javax.swing.JLabel();
        hours4 = new javax.swing.JLabel();
        hours5 = new javax.swing.JLabel();
        hours6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        beack1 = new javax.swing.JButton();
        one2 = new javax.swing.JTextField();
        one1 = new javax.swing.JTextField();
        one3 = new javax.swing.JTextField();
        one4 = new javax.swing.JTextField();
        one5 = new javax.swing.JTextField();
        one6 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        hours7 = new javax.swing.JLabel();
        hours8 = new javax.swing.JLabel();
        hours9 = new javax.swing.JLabel();
        hours10 = new javax.swing.JLabel();
        hours11 = new javax.swing.JLabel();
        hours12 = new javax.swing.JLabel();
        tw6 = new javax.swing.JTextField();
        tw5 = new javax.swing.JTextField();
        tw4 = new javax.swing.JTextField();
        tw3 = new javax.swing.JTextField();
        tw2 = new javax.swing.JTextField();
        tw1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        hours13 = new javax.swing.JLabel();
        three1 = new javax.swing.JTextField();
        hours14 = new javax.swing.JLabel();
        three2 = new javax.swing.JTextField();
        hours15 = new javax.swing.JLabel();
        three3 = new javax.swing.JTextField();
        hours16 = new javax.swing.JLabel();
        three4 = new javax.swing.JTextField();
        hours17 = new javax.swing.JLabel();
        three5 = new javax.swing.JTextField();
        hours18 = new javax.swing.JLabel();
        three6 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        hours19 = new javax.swing.JLabel();
        four1 = new javax.swing.JTextField();
        hours20 = new javax.swing.JLabel();
        four2 = new javax.swing.JTextField();
        hours21 = new javax.swing.JLabel();
        four3 = new javax.swing.JTextField();
        hours22 = new javax.swing.JLabel();
        four4 = new javax.swing.JTextField();
        hours23 = new javax.swing.JLabel();
        four5 = new javax.swing.JTextField();
        hours24 = new javax.swing.JLabel();
        four6 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        hours25 = new javax.swing.JLabel();
        five1 = new javax.swing.JTextField();
        hours26 = new javax.swing.JLabel();
        five2 = new javax.swing.JTextField();
        hours27 = new javax.swing.JLabel();
        five3 = new javax.swing.JTextField();
        hours28 = new javax.swing.JLabel();
        five4 = new javax.swing.JTextField();
        hours29 = new javax.swing.JLabel();
        five5 = new javax.swing.JTextField();
        hours30 = new javax.swing.JLabel();
        five6 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        firstHour = new javax.swing.JLabel();
        secondHour = new javax.swing.JLabel();
        thirdHour = new javax.swing.JLabel();
        fourthHour = new javax.swing.JLabel();
        fivthHour = new javax.swing.JLabel();
        sixthHour = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Student");
        setPreferredSize(new java.awt.Dimension(1050, 600));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(makeRoutine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editRoutin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showRoutine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(beack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(beack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(home))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(makeRoutine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editRoutin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showRoutine)
                .addGap(0, 373, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        shift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Select Shift---", "Morning", "Afternoon" }));
        shift.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                shiftItemStateChanged(evt);
            }
        });

        hours1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours1.setText("Bangla");

        hours2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours2.setText("English");

        hours3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours3.setText("Math");

        hours4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours4.setText("Religion");

        hours5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours5.setText("G. Knowledge");

        hours6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours6.setText("Sociology");

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("      Class Routine");
        jLabel1.setOpaque(true);

        beack1.setBackground(new java.awt.Color(204, 204, 204));
        beack1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        beack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/log out icon.jpg"))); // NOI18N
        beack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beack1ActionPerformed(evt);
            }
        });

        one2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        one2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        one1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        one1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        one3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        one3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        one4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        one4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        one5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        one5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        one6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        one6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setBackground(new java.awt.Color(184, 253, 184));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ONE");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(184, 253, 184));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TWO");
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(184, 253, 184));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("THREE");
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(184, 253, 184));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FOUR");
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(184, 253, 184));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FIVE");
        jLabel6.setOpaque(true);

        jLabel13.setBackground(new java.awt.Color(184, 253, 184));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("HOURS");
        jLabel13.setOpaque(true);

        jLabel15.setBackground(new java.awt.Color(184, 253, 184));
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("TIMR");
        jLabel15.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 463, Short.MAX_VALUE))
        );

        hours7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours7.setText("Bangla");

        hours8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours8.setText("English");

        hours9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours9.setText("Math");

        hours10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours10.setText("Religion");

        hours11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours11.setText("G. Knowledge");

        hours12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours12.setText("Sociology");

        tw6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tw6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tw5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tw5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tw4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tw4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tw3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tw3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tw2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tw2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tw1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tw1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hours13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours13.setText("Bangla");

        three1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        three1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hours14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours14.setText("English");

        three2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        three2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hours15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours15.setText("Math");

        three3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        three3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hours16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours16.setText("Religion");

        three4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        three4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hours17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours17.setText("G. Knowledge");

        three5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        three5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hours18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours18.setText("Sociology");

        three6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        three6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hours19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours19.setText("Bangla");

        four1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        four1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hours20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours20.setText("English");

        four2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        four2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hours21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours21.setText("Math");

        four3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        four3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hours22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours22.setText("Religion");

        four4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        four4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hours23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours23.setText("G. Knowledge");

        four5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        four5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hours24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours24.setText("Sociology");

        four6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        four6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hours25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours25.setText("Bangla");

        five1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        five1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hours26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours26.setText("English");

        five2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        five2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hours27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours27.setText("Math");

        five3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        five3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hours28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours28.setText("Religion");

        five4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        five4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hours29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours29.setText("G. Knowledge");

        five5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        five5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hours30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hours30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours30.setText("Sociology");

        five6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        five6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPanel4.setBackground(new java.awt.Color(178, 253, 178));

        firstHour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstHour.setText("  ");

        secondHour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        secondHour.setText("  ");

        thirdHour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thirdHour.setText("  ");

        fourthHour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fourthHour.setText("  ");

        fivthHour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fivthHour.setText("  ");

        sixthHour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sixthHour.setText("  ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("1st Hour");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("2nd Hour");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("3rd Hour");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("fourth hour");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Fifth Hour");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Sixth Hour");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstHour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(secondHour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(thirdHour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(fourthHour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(fivthHour, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sixthHour, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firstHour)
                        .addComponent(secondHour)
                        .addComponent(thirdHour))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fourthHour)
                        .addComponent(fivthHour)
                        .addComponent(sixthHour)))
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(five1)
                                    .addComponent(hours25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(five2)
                                    .addComponent(hours26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hours27, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(five3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hours28, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(five4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hours29, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(five5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(hours30, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8))
                                    .addComponent(five6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(beack1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(one1)
                                    .addComponent(hours1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(one2)
                                    .addComponent(hours2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(one3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(hours3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(hours4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hours5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)
                                        .addComponent(hours6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(one4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(one5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(one6))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tw1)
                                    .addComponent(hours7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tw2)
                                    .addComponent(hours8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tw3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(hours9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(hours10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hours11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(11, 11, 11)
                                        .addComponent(hours12, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(tw4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tw5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tw6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(three1)
                                    .addComponent(hours13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(three2)
                                    .addComponent(hours14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(three3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(hours15, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(hours16, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hours17, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(hours18, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(three4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(three5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(three6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(four1)
                                    .addComponent(hours19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(four2)
                                    .addComponent(hours20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(four3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(hours21, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(hours22, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hours23, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(hours24, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(four4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(four5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(four6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(106, 106, 106))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(beack1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(37, 37, 37)
                .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hours2)
                                    .addComponent(hours1)
                                    .addComponent(hours3)
                                    .addComponent(hours4)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hours5)
                                        .addComponent(hours6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(one2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(one3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(one4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(one5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(one6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(one1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hours8)
                                    .addComponent(hours7)
                                    .addComponent(hours9)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hours10)
                                        .addComponent(hours11))
                                    .addComponent(hours12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tw2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tw3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tw4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tw5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tw6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tw1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hours14)
                                    .addComponent(hours13)
                                    .addComponent(hours15)
                                    .addComponent(hours16)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hours17)
                                        .addComponent(hours18)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(three2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(three3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(three4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(three5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(three6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(three1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hours20)
                                    .addComponent(hours19)
                                    .addComponent(hours21)
                                    .addComponent(hours22)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hours23)
                                        .addComponent(hours24)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(four2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(four3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(four4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(four5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(four6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(four1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(hours26)
                                            .addComponent(hours25)
                                            .addComponent(hours27))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(five2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(five3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(five1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(hours28)
                                            .addComponent(hours29))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(five4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(five5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(hours30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(five6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void showRoutineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showRoutineActionPerformed
        // TODO add your handling code here:
        new shhow_routine().setVisible(true);
        dispose();
    }//GEN-LAST:event_showRoutineActionPerformed

    private void beackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beackActionPerformed
        // TODO add your handling code here:
        new classroutinHome().setVisible(true);
        dispose();
    }//GEN-LAST:event_beackActionPerformed

    private void beack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beack1ActionPerformed
        // TODO add your handling code here:
           new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_beack1ActionPerformed

    private void shiftItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_shiftItemStateChanged
        // TODO add your handling code here:
        int index = shift.getSelectedIndex();

        if (index == 1) {
            firstHour.setText("07:10 - 07:50");
            secondHour.setText("07:50 - 08:30");
            thirdHour.setText("08:30 - 09:10");
            fourthHour.setText("09:10- 09:50");
            fivthHour.setText("09:50 - 10:30");
            sixthHour.setText("10:30 - 11:10");

            hours1.setText("Bangla");
            hours2.setText("English");
            hours3.setText("Math");
            hours4.setText("Religion");
            hours5.setText("G.Knowledge");
            hours6.setText("sociology");

            hours8.setText("Bangla");
            hours9.setText("English");
            hours10.setText("Math");
            hours11.setText("Religion");
            hours12.setText("G.Knowledge");
            hours7.setText("sociology");

            hours15.setText("Bangla");
            hours16.setText("English");
            hours17.setText("Math");
            hours18.setText("Religion");
            hours13.setText("G.Knowledge");
            hours14.setText("sociology");

            hours22.setText("Bangla");
            hours23.setText("English");
            hours24.setText("Math");
            hours19.setText("Religion");
            hours20.setText("G.Knowledge");
            hours21.setText("sociology");

            hours29.setText("Bangla");
            hours30.setText("English");
            hours25.setText("Math");
            hours26.setText("Religion");
            hours27.setText("G.Knowledge");
            hours28.setText("sociology");

            try {

                String query = "SELECT * FROM class_routine.morning where class=\"one\"";
                statement2 = (Statement) con.createStatement();
                result2 = statement2.executeQuery(query);
                result2.next();
                ArrayList<String> a = new ArrayList<String>();
                ArrayList<String> a2 = new ArrayList<String>();
                ArrayList<String> a3 = new ArrayList<String>();
                ArrayList<String> a4 = new ArrayList<String>();
                ArrayList<String> a5 = new ArrayList<String>();

                for (int i = 2; i <= 7; i++) {
                    String[] s = result2.getString(i).split(" ");
                    a.add(s[1]);
                }
                one1.setText(a.get(0));
                one2.setText(a.get(1));
                one3.setText(a.get(2));
                one4.setText(a.get(3));
                one5.setText(a.get(4));
                one6.setText(a.get(5));

                String query2 = "SELECT * FROM class_routine.morning where class=\"two\"";
                statement2 = (Statement) con.createStatement();
                result2 = statement2.executeQuery(query2);
                result2.next();
                for (int i = 2; i <= 7; i++) {
                    String[] s = result2.getString(i).split(" ");
                    a2.add(s[1]);
                }
                tw1.setText(a2.get(0));
                tw2.setText(a2.get(1));
                tw3.setText(a2.get(2));
                tw4.setText(a2.get(3));
                tw5.setText(a2.get(4));
                tw6.setText(a2.get(5));

                String query3 = "SELECT * FROM class_routine.morning where class=\"three\"";
                statement2 = (Statement) con.createStatement();
                result2 = statement2.executeQuery(query3);
                result2.next();
                for (int i = 2; i <= 7; i++) {
                    String[] s = result2.getString(i).split(" ");
                    a3.add(s[1]);
                }
                three1.setText(a3.get(0));
                three2.setText(a3.get(1));
                three3.setText(a3.get(2));
                three4.setText(a3.get(3));
                three5.setText(a3.get(4));
                three6.setText(a3.get(5));

                String query4 = "SELECT * FROM class_routine.morning where class=\"four\"";
                statement2 = (Statement) con.createStatement();
                result2 = statement2.executeQuery(query4);
                result2.next();
                for (int i = 2; i <= 7; i++) {
                    String[] s = result2.getString(i).split(" ");
                    a4.add(s[1]);
                }
                four1.setText(a4.get(0));
                four2.setText(a4.get(1));
                four3.setText(a4.get(2));
                four4.setText(a4.get(3));
                four5.setText(a4.get(4));
                four6.setText(a4.get(5));

                String query5 = "SELECT * FROM class_routine.morning where class=\"five\"";
                statement2 = (Statement) con.createStatement();
                result2 = statement2.executeQuery(query5);
                result2.next();
                for (int i = 2; i <= 7; i++) {
                    String[] s = result2.getString(i).split(" ");
                    a5.add(s[1]);
                }
                five1.setText(a5.get(0));
                five2.setText(a5.get(1));
                five3.setText(a5.get(2));
                five4.setText(a5.get(3));
                five5.setText(a5.get(4));
                five6.setText(a5.get(5));

            } catch (SQLException e) {
                System.out.println(e);
            }

        } else if (index == 2) {
            firstHour.setText("01:10 - 01:50");
            secondHour.setText("01:50 - 02:30");
            thirdHour.setText("02:30 - 03:10");
            fourthHour.setText("03:10- 03:50");
            fivthHour.setText("03:50 - 4:50");
            sixthHour.setText("04:50 - 5:30");

            try {

                String query = "SELECT * FROM class_routine.afternoon where class=\"one\"";
                statement2 = (Statement) con.createStatement();
                result2 = statement2.executeQuery(query);
                result2.next();
                ArrayList<String> a = new ArrayList<String>();
                ArrayList<String> a2 = new ArrayList<String>();
                ArrayList<String> a3 = new ArrayList<String>();
                ArrayList<String> a4 = new ArrayList<String>();
                ArrayList<String> a5 = new ArrayList<String>();

                for (int i = 2; i <= 7; i++) {
                    String[] s = result2.getString(i).split(" ");
                    a.add(s[1]);
                }
                one1.setText(a.get(0));
                one2.setText(a.get(1));
                one3.setText(a.get(2));
                one4.setText(a.get(3));
                one5.setText(a.get(4));
                one6.setText(a.get(5));

                String query2 = "SELECT * FROM class_routine.afternoon where class=\"two\"";
                statement2 = (Statement) con.createStatement();
                result2 = statement2.executeQuery(query2);
                result2.next();
                for (int i = 2; i <= 7; i++) {
                    String[] s = result2.getString(i).split(" ");
                    a2.add(s[1]);
                }
                tw1.setText(a2.get(0));
                tw2.setText(a2.get(1));
                tw3.setText(a2.get(2));
                tw4.setText(a2.get(3));
                tw5.setText(a2.get(4));
                tw6.setText(a2.get(5));

                String query3 = "SELECT * FROM class_routine.afternoon where class=\"three\"";
                statement2 = (Statement) con.createStatement();
                result2 = statement2.executeQuery(query3);
                result2.next();
                for (int i = 2; i <= 7; i++) {
                    String[] s = result2.getString(i).split(" ");
                    a3.add(s[1]);
                }
                three1.setText(a3.get(0));
                three2.setText(a3.get(1));
                three3.setText(a3.get(2));
                three4.setText(a3.get(3));
                three5.setText(a3.get(4));
                three6.setText(a3.get(5));

                String query4 = "SELECT * FROM class_routine.afternoon where class=\"four\"";
                statement2 = (Statement) con.createStatement();
                result2 = statement2.executeQuery(query4);
                result2.next();
                for (int i = 2; i <= 7; i++) {
                    String[] s = result2.getString(i).split(" ");
                    a4.add(s[1]);
                }
                four1.setText(a4.get(0));
                four2.setText(a4.get(1));
                four3.setText(a4.get(2));
                four4.setText(a4.get(3));
                four5.setText(a4.get(4));
                four6.setText(a4.get(5));

                String query5 = "SELECT * FROM class_routine.afternoon where class=\"five\"";
                statement2 = (Statement) con.createStatement();
                result2 = statement2.executeQuery(query5);
                result2.next();
                for (int i = 2; i <= 7; i++) {
                    String[] s = result2.getString(i).split(" ");
                    a5.add(s[1]);
                }
                five1.setText(a5.get(0));
                five2.setText(a5.get(1));
                five3.setText(a5.get(2));
                five4.setText(a5.get(3));
                five5.setText(a5.get(4));
                five6.setText(a5.get(5));

            } catch (SQLException e) {
                System.out.println(e);
            }

            fivthHour.setVisible(true);
            hours5.setVisible(true);
            sixthHour.setVisible(true);
            hours6.setVisible(true);

        }
    }//GEN-LAST:event_shiftItemStateChanged

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
            java.util.logging.Logger.getLogger(shhow_routine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new shhow_routine().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beack;
    private javax.swing.JButton beack1;
    private javax.swing.JButton editRoutin;
    private javax.swing.JLabel firstHour;
    private javax.swing.JTextField five1;
    private javax.swing.JTextField five2;
    private javax.swing.JTextField five3;
    private javax.swing.JTextField five4;
    private javax.swing.JTextField five5;
    private javax.swing.JTextField five6;
    private javax.swing.JLabel fivthHour;
    private javax.swing.JTextField four1;
    private javax.swing.JTextField four2;
    private javax.swing.JTextField four3;
    private javax.swing.JTextField four4;
    private javax.swing.JTextField four5;
    private javax.swing.JTextField four6;
    private javax.swing.JLabel fourthHour;
    private javax.swing.JButton home;
    private javax.swing.JLabel hours1;
    private javax.swing.JLabel hours10;
    private javax.swing.JLabel hours11;
    private javax.swing.JLabel hours12;
    private javax.swing.JLabel hours13;
    private javax.swing.JLabel hours14;
    private javax.swing.JLabel hours15;
    private javax.swing.JLabel hours16;
    private javax.swing.JLabel hours17;
    private javax.swing.JLabel hours18;
    private javax.swing.JLabel hours19;
    private javax.swing.JLabel hours2;
    private javax.swing.JLabel hours20;
    private javax.swing.JLabel hours21;
    private javax.swing.JLabel hours22;
    private javax.swing.JLabel hours23;
    private javax.swing.JLabel hours24;
    private javax.swing.JLabel hours25;
    private javax.swing.JLabel hours26;
    private javax.swing.JLabel hours27;
    private javax.swing.JLabel hours28;
    private javax.swing.JLabel hours29;
    private javax.swing.JLabel hours3;
    private javax.swing.JLabel hours30;
    private javax.swing.JLabel hours4;
    private javax.swing.JLabel hours5;
    private javax.swing.JLabel hours6;
    private javax.swing.JLabel hours7;
    private javax.swing.JLabel hours8;
    private javax.swing.JLabel hours9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton makeRoutine;
    private javax.swing.JTextField one1;
    private javax.swing.JTextField one2;
    private javax.swing.JTextField one3;
    private javax.swing.JTextField one4;
    private javax.swing.JTextField one5;
    private javax.swing.JTextField one6;
    private javax.swing.JLabel secondHour;
    private javax.swing.JComboBox<String> shift;
    private javax.swing.JButton showRoutine;
    private javax.swing.JLabel sixthHour;
    private javax.swing.JLabel thirdHour;
    private javax.swing.JTextField three1;
    private javax.swing.JTextField three2;
    private javax.swing.JTextField three3;
    private javax.swing.JTextField three4;
    private javax.swing.JTextField three5;
    private javax.swing.JTextField three6;
    private javax.swing.JTextField tw1;
    private javax.swing.JTextField tw2;
    private javax.swing.JTextField tw3;
    private javax.swing.JTextField tw4;
    private javax.swing.JTextField tw5;
    private javax.swing.JTextField tw6;
    // End of variables declaration//GEN-END:variables
}
