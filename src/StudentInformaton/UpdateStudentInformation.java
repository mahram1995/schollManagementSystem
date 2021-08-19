/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentInformaton;

import HomeAndLogin.Home;
import HomeAndLogin.Login;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;


import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import javax.swing.table.DefaultTableModel;

public class UpdateStudentInformation extends javax.swing.JFrame {

    ResultSet result, numberOfRow;
    Connection con;
    Statement statement;
    DefaultTableModel model = new DefaultTableModel();
    ImageIcon myimage;
    String imagepath;
    String imagePaths;
    byte[] image;

    public UpdateStudentInformation() {
        initComponents();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldatabase", "root", "6660052");
        } catch (SQLException ex) {

        }
        model.addColumn("Role");
        model.addColumn("Name");
        model.addColumn("fother name");
        model.addColumn("Mother name");
        model.addColumn("Gender");
        model.addColumn("religion");
        model.addColumn("DOB");
        model.addColumn("Mobile No.");
        model.addColumn("present Address");
        model.addColumn("Parmanent Address");
    }

    public void clear() {
        imageLabel.setIcon(null);
        name.setText("");
        fatherName.setText("");
        motherName.setText("");
        buttonGroup1.clearSelection();
        birthday.setText("");
        mobileNumber.setText("");
        presentAddress.setText("");
        parmanentAddress.setText("");
        buttonGroup2.clearSelection();

        imagePath.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        addNewStudent = new javax.swing.JButton();
        DeleteSutdent = new javax.swing.JButton();
        studentId = new javax.swing.JButton();
        transcript = new javax.swing.JButton();
        searchStudent = new javax.swing.JButton();
        home = new javax.swing.JButton();
        beack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        clase = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        shift = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        role = new javax.swing.JTextField();
        searchByRole = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        fatherName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        presentAddress = new javax.swing.JTextArea();
        motherName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        others = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        birthday = new javax.swing.JTextField();
        mobileNumber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sameAddress = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        parmanentAddress = new javax.swing.JTextArea();
        update = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        islam = new javax.swing.JRadioButton();
        khristan = new javax.swing.JRadioButton();
        budho = new javax.swing.JRadioButton();
        hindo = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        imagePath = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        logout1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Student Information");
        setPreferredSize(new java.awt.Dimension(1050, 600));

        jLabel1.setBackground(new java.awt.Color(187, 253, 187));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Student Information");
        jLabel1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        addNewStudent.setBackground(new java.awt.Color(204, 204, 204));
        addNewStudent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addNewStudent.setText("Add New Student");
        addNewStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewStudentActionPerformed(evt);
            }
        });

        DeleteSutdent.setBackground(new java.awt.Color(204, 204, 204));
        DeleteSutdent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DeleteSutdent.setText("Delete Student");
        DeleteSutdent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteSutdent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSutdentActionPerformed(evt);
            }
        });

        studentId.setBackground(new java.awt.Color(204, 204, 204));
        studentId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        studentId.setText("Studetn Id");
        studentId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdActionPerformed(evt);
            }
        });

        transcript.setBackground(new java.awt.Color(204, 204, 204));
        transcript.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        transcript.setText("Issue Transcript");
        transcript.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transcript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transcriptActionPerformed(evt);
            }
        });

        searchStudent.setBackground(new java.awt.Color(204, 204, 204));
        searchStudent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchStudent.setText("Search Student");
        searchStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStudentActionPerformed(evt);
            }
        });

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.jpg"))); // NOI18N
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        beack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/beack icon.jpg"))); // NOI18N
        beack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addNewStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(DeleteSutdent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transcript, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(beack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(addNewStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteSutdent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studentId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transcript)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchStudent)
                .addContainerGap(302, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        clase.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "ONE", "TWO", "THREE", "FOUR", "FIVE", " " }));
        clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claseActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Class  :");

        shift.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        shift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "MORNING", "AFTERNOON", "EVENING", " " }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Shift  :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Role Number   :");

        role.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        role.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        searchByRole.setBackground(new java.awt.Color(102, 255, 102));
        searchByRole.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchByRole.setText("Search ");
        searchByRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByRoleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clase, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchByRole)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchByRole))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(clase, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Student Name    :");

        name.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        fatherName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Father Name      :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Present Address :");

        presentAddress.setColumns(20);
        presentAddress.setLineWrap(true);
        presentAddress.setRows(5);
        presentAddress.setAutoscrolls(false);
        presentAddress.setPreferredSize(new java.awt.Dimension(160, 95));
        jScrollPane1.setViewportView(presentAddress);

        motherName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Mother Name     :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Gender             :");

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        male.setText("Male");

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        female.setText("Female");

        buttonGroup1.add(others);
        others.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        others.setText("Others");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Date of Birth     :");

        birthday.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        mobileNumber.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Phone number   :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Parmanent Address :");

        sameAddress.setText("Same As Present Address");
        sameAddress.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sameAddressStateChanged(evt);
            }
        });

        parmanentAddress.setColumns(20);
        parmanentAddress.setLineWrap(true);
        parmanentAddress.setRows(5);
        parmanentAddress.setWrapStyleWord(true);
        parmanentAddress.setAutoscrolls(false);
        parmanentAddress.setPreferredSize(new java.awt.Dimension(160, 95));
        jScrollPane2.setViewportView(parmanentAddress);

        update.setBackground(new java.awt.Color(153, 255, 153));
        update.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(153, 255, 153));
        clear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Religion            :");

        buttonGroup2.add(islam);
        islam.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        islam.setText("Islam");

        buttonGroup2.add(khristan);
        khristan.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        khristan.setText("khristan");

        buttonGroup2.add(budho);
        budho.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        budho.setText("Budho");

        buttonGroup2.add(hindo);
        hindo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        hindo.setText("Hindo");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("Choose Image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        imageLabel.setBackground(new java.awt.Color(255, 255, 255));
        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLabel.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Image");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(male)
                                        .addGap(18, 18, 18)
                                        .addComponent(female)
                                        .addGap(18, 18, 18)
                                        .addComponent(others))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(islam)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(khristan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(hindo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(budho))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mobileNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(motherName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fatherName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(sameAddress)))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(68, 68, 68))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(108, 108, 108))))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(motherName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(male)
                            .addComponent(female)
                            .addComponent(others))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(islam)
                            .addComponent(khristan)
                            .addComponent(budho)
                            .addComponent(hindo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sameAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/log out icon.jpg"))); // NOI18N
        logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchByRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByRoleActionPerformed
        // TODO add your handling code here:

        try {
            model.setRowCount(0);

            String Clase = String.valueOf(clase.getSelectedItem());
            String Shift = String.valueOf(shift.getSelectedItem());
            if (Clase.contains(" ")) {
                JOptionPane.showMessageDialog(null, "Please select class");
            } else if (Shift.contains(" ")) {
                JOptionPane.showMessageDialog(null, "Please select shift");
            } else {
                statement = (Statement) con.createStatement();
                String query = "SELECT * FROM schooldatabase." + clase.getSelectedItem() + "_" + shift.getSelectedItem() + " where role =" + role.getText();
                result = statement.executeQuery(query);
                result.next();
                role.setText(result.getString(1));
                name.setText(result.getString(4));
                fatherName.setText(result.getString(5));
                motherName.setText(result.getString(6));
                String Gender = result.getString(7);
                if (null == Gender) {
                    others.setSelected(true);
                } else {
                    switch (Gender) {
                        case "Male":
                            male.setSelected(true);
                            break;
                        case "Female":
                            female.setSelected(true);
                            break;
                        default:
                            others.setSelected(true);
                            break;
                    }
                }

                String Religion = result.getString(12);
                if (null == Religion) {
                    budho.setSelected(true);
                } else {
                    switch (Religion) {
                        case "Islam":
                            islam.setSelected(true);
                            break;
                        case "Khristan":
                            khristan.setSelected(true);
                            break;
                        case "Hindo":
                            hindo.setSelected(true);
                            break;
                        default:
                            budho.setSelected(true);
                            break;
                    }
                }
                birthday.setText(result.getString(8));
                mobileNumber.setText(result.getString(9));
                presentAddress.setText(result.getString(10));
                parmanentAddress.setText(result.getString(11));
                String images = result.getString(13);
                 
                imagePaths = images;
                String[] imageName = images.split("\\\\");
                imagePath.setText(imageName[imageName.length - 1]);
                imageLabel.setIcon(seticon(images, null));

            }

        } catch (SQLException e) {
            String s = e.toString();
            String[] ss = s.split(" ");

            if ("empty".equals(ss[4])) {
                JOptionPane.showMessageDialog(null, "Role does not exist");
            }

        }
    }//GEN-LAST:event_searchByRoleActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // code for clear all field after save data succesfully
        clear();
    }//GEN-LAST:event_clearActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:

        Pattern p = Pattern.compile("^[0-9]{3,3}$");
        Matcher idd = p.matcher(role.getText());

        String Clase = String.valueOf(clase.getSelectedItem());
        String Shift = String.valueOf(shift.getSelectedItem());
        String Name = name.getText();
        String fName = fatherName.getText();
        String mName = motherName.getText();

        String Gender;
        if (male.isSelected()) {
            Gender = "Male";
        } else if (female.isSelected()) {
            Gender = "Female";
        } else {
            Gender = "Others";
        }

        String Religion = "  ";
        if (islam.isSelected()) {
            Religion = "Islam";
        } else if (khristan.isSelected()) {
            Religion = "Khristan";
        } else if (hindo.isSelected()) {
            Religion = "Hindo";
        } else if (budho.isSelected()) {
            Religion = "Budho";
        }

        String DOB = birthday.getText();
        String Mobile = mobileNumber.getText();
        String PresentAddress = presentAddress.getText();
        String ParmanentAddress = parmanentAddress.getText();

        //Registering the Driver
        try {

            if (Name.isEmpty() || fName.isEmpty() || mName.isEmpty() || PresentAddress.isEmpty() || Clase.contains("  ") || Shift.contains("  ") || Mobile.isEmpty() || !male.isSelected() && !female.isSelected() && !others.isSelected()) {
                JOptionPane.showMessageDialog(null, "Fill all required field");

            } else if (!idd.find()) {
                JOptionPane.showMessageDialog(null, "ID is wrong, input numeric number and musbt be  three digit");
            } else if (Mobile.length() != 11) {
                JOptionPane.showMessageDialog(null, "Mobile number must be eleven Digit");
            } else {

                String insert = "update schooldatabase." + clase.getSelectedItem() + "_" + shift.getSelectedItem() + " set role=?, class=?, shift=?, name=?, father_name=?, mother_name=?, gender=?, birthday=?, mobile=?, present_address=? , parmanent_address=?, religion=?, image=?  where role=" + role.getText();
                String insert2 = "update schooldatabase.allstudent set role=?, class=?, shift=?, name=?, father_name=?, mother_name=?, gender=?, birthday=?, mobile=?, present_address=? , parmanent_address=?, religion=?, image=?  where role=" + role.getText();
                //Getting the connection

                PreparedStatement add = con.prepareStatement(insert);
                PreparedStatement add2 = con.prepareStatement(insert2);
                int Role = Integer.parseInt(role.getText());
                add.setInt(1, Role);                  
                add.setString(2, Clase);
                add.setString(3, Shift);
                add.setString(4, Name);
                add.setString(5, fName);
                add.setString(6, mName);
                add.setString(7, Gender);
                add.setString(8, DOB);
                add.setString(9, Mobile);
                add.setString(10, PresentAddress);
                add.setString(11, ParmanentAddress);
                add.setString(12, Religion);
                add.setString(12, Religion);
                add.setString(13, imagePaths);
                
                add2.setInt(1, Role);                  
                add2.setString(2, Clase);
                add2.setString(3, Shift);
                add2.setString(4, Name);
                add2.setString(5, fName);
                add2.setString(6, mName);
                add2.setString(7, Gender);
                add2.setString(8, DOB);
                add2.setString(9, Mobile);
                add2.setString(10, PresentAddress);
                add2.setString(11, ParmanentAddress);
                add2.setString(12, Religion);
                add2.setString(12, Religion);
                add2.setString(13, imagePaths);

                if (add.executeUpdate() > 0 & add2.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Update Successfully");
                }
                clear();
            }

        } catch (SQLException e) {
            System.out.println(e);
            String s = e.toString();
            String[] ss = s.split(" ");

            if (ss[6].contains("PRIMARY")) {
                JOptionPane.showMessageDialog(null, ss[3] + " this ID aleady exist or incorrect \nPlease Enter Correct ID ");
            }
            if (ss[6].contains("mobile_UNIQUE")) {
                JOptionPane.showMessageDialog(null, ss[3] + " Mobile number aleady exist or incorrect \nPlease Enter Correct Mobile Number ");
            }
            if (ss[6].contains("email_UNIQUE")) {
                JOptionPane.showMessageDialog(null, ss[3] + " Email id aleady exist or incorrect \nPlease Enter Correct Email ID");
            }

        }
    }//GEN-LAST:event_updateActionPerformed

    private void claseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claseActionPerformed

    private void addNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewStudentActionPerformed
        // TODO add your handling code here:
        new addNewStudent().setVisible(true);
        dispose();
       
      
    }//GEN-LAST:event_addNewStudentActionPerformed

    private void DeleteSutdentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteSutdentActionPerformed
        // TODO add your handling code here:
        new deleteStudent().setVisible(true);
         dispose();
      
    }//GEN-LAST:event_DeleteSutdentActionPerformed

    private void sameAddressStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sameAddressStateChanged
        // TODO add your handling code here:
        if (sameAddress.isSelected()) {
            parmanentAddress.setText(presentAddress.getText());
        } else {
            parmanentAddress.setText("");
        }
    }//GEN-LAST:event_sameAddressStateChanged

    private void studentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdActionPerformed
        // TODO add your handling code here:
        new studentIdCard().setVisible(true);
        dispose();
    }//GEN-LAST:event_studentIdActionPerformed

    private void transcriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transcriptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transcriptActionPerformed

    private void searchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStudentActionPerformed
        // TODO add your handling code here:
        new searchStudent().setVisible(true);
    }//GEN-LAST:event_searchStudentActionPerformed
    public ImageIcon seticon(String m, byte[] image) {
        if (m != null) {
            myimage = new ImageIcon(m);
        } else {
            myimage = new ImageIcon(image);

        }
        Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        return i;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File("user.dir"));
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "JPG & GIF Images", "jpg", "gif", "All Pic");
        file.addChoosableFileFilter(filter);
        int a = file.showSaveDialog(null);
        if (a == JFileChooser.APPROVE_OPTION) {
            File f = file.getSelectedFile();
            String p = f.getAbsolutePath();
            imagePath.setText(f.getName());
            imagePaths = f.getAbsolutePath();
            imageLabel.setIcon(seticon(p, null));

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void beackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beackActionPerformed
        // TODO add your handling code here:
         new Student_Information().setVisible(true);
        dispose();
    }//GEN-LAST:event_beackActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
         new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout1ActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_logout1ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateStudentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UpdateStudentInformation().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteSutdent;
    private javax.swing.JButton addNewStudent;
    private javax.swing.JButton beack;
    private javax.swing.JTextField birthday;
    private javax.swing.JRadioButton budho;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> clase;
    private javax.swing.JButton clear;
    private javax.swing.JTextField fatherName;
    private javax.swing.JRadioButton female;
    private javax.swing.JRadioButton hindo;
    private javax.swing.JButton home;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JTextField imagePath;
    private javax.swing.JRadioButton islam;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton khristan;
    private javax.swing.JButton logout1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField mobileNumber;
    private javax.swing.JTextField motherName;
    private javax.swing.JTextField name;
    private javax.swing.JRadioButton others;
    private javax.swing.JTextArea parmanentAddress;
    private javax.swing.JTextArea presentAddress;
    private javax.swing.JTextField role;
    private javax.swing.JCheckBox sameAddress;
    private javax.swing.JButton searchByRole;
    private javax.swing.JButton searchStudent;
    private javax.swing.JComboBox<String> shift;
    private javax.swing.JButton studentId;
    private javax.swing.JButton transcript;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
