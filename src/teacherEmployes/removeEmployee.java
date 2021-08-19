/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacherEmployes;

import StudentInformaton.*;
import claasroutinHome.classroutinHome;
import HomeAndLogin.Home;
import HomeAndLogin.Login;
import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import payment.Payment;
import result.AcademicTranscript;
import result.reultInfo;

public class removeEmployee extends javax.swing.JFrame {

    ResultSet result, numberOfRow;
    Connection con;
    Statement statement;
    ImageIcon myimage;
    String imagepath;
    String imagePaths;
    byte[] image;

    public removeEmployee() {
        initComponents();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldatabase", "root", "6660052");
        } catch (SQLException ex) {

        }
        

    }

    public void clear() {
        name.setText("");

        fatherName.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();

        imageLabel.setIcon(null);
        motherName1.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        beack = new javax.swing.JButton();
        teacher = new javax.swing.JButton();
        Student = new javax.swing.JButton();
        results = new javax.swing.JButton();
        Transcript = new javax.swing.JButton();
        pyments = new javax.swing.JButton();
        classRoutine = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        designation = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fatherName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        motherName1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Prograssive Kindergarten");
        setPreferredSize(new java.awt.Dimension(1050, 600));

        jLabel1.setBackground(new java.awt.Color(191, 253, 191));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Remove Employee ");
        jLabel1.setOpaque(true);

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

        teacher.setBackground(new java.awt.Color(204, 204, 204));
        teacher.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        teacher.setText("Teacher & Employee");
        teacher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherActionPerformed(evt);
            }
        });

        Student.setBackground(new java.awt.Color(204, 204, 204));
        Student.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Student.setText("Students");
        Student.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentActionPerformed(evt);
            }
        });

        results.setBackground(new java.awt.Color(204, 204, 204));
        results.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        results.setText("Result ");
        results.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        results.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultsActionPerformed(evt);
            }
        });

        Transcript.setBackground(new java.awt.Color(204, 204, 204));
        Transcript.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Transcript.setText("Academic Transcript");
        Transcript.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Transcript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TranscriptActionPerformed(evt);
            }
        });

        pyments.setBackground(new java.awt.Color(204, 204, 204));
        pyments.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pyments.setText("Payment & Fees");
        pyments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pyments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pymentsActionPerformed(evt);
            }
        });

        classRoutine.setBackground(new java.awt.Color(204, 204, 204));
        classRoutine.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        classRoutine.setText("Class Routine");
        classRoutine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        classRoutine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classRoutineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(beack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(classRoutine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Transcript, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(results, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teacher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pyments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(beack))
                .addGap(18, 18, 18)
                .addComponent(teacher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Student)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(results)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Transcript)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pyments)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(classRoutine)
                .addGap(0, 244, Short.MAX_VALUE))
        );

        logout.setBackground(new java.awt.Color(204, 204, 204));
        logout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/log out icon.jpg"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("ID                 :");

        id.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Designations   :");

        designation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        designation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Principal", "Assistance Teacher", "Office Assistant", "Computer Operator", "Security", " " }));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        imageLabel.setBackground(new java.awt.Color(255, 255, 255));
        imageLabel.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Name            :");

        name.setEditable(false);
        name.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Father Name   :");

        fatherName.setEditable(false);
        fatherName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Mother Name  :");

        motherName1.setEditable(false);
        motherName1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Image");

        delete.setBackground(new java.awt.Color(153, 255, 153));
        delete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(designation, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(fatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(motherName1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(designation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(motherName1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:

       new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_homeActionPerformed
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
    private void beackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beackActionPerformed
        // TODO add your handling code here:
        new Teacher_information().setVisible(true);
        dispose();
    }//GEN-LAST:event_beackActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
           new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased
        // TODO add your handling code here:
        String rrr = id.getText();
        try {
            if (rrr.length() == 5) {
                statement = (Statement) con.createStatement();
                String query2 = "SELECT * FROM schooldatabase.employee where id =" + id.getText();
                result = statement.executeQuery(query2);
                result.next();

                String Designation = (result.getString(2));
                if (null != Designation) {
                    switch (Designation) {
                        case "Principal":
                            designation.setSelectedIndex(1);
                            break;
                        case "Assistance Teacher":
                            designation.setSelectedIndex(2);
                            break;
                        case "Computer Operator":
                            designation.setSelectedIndex(4);
                            break;
                        case "Office Assistant":
                            designation.setSelectedIndex(3);
                            break;
                        case "Security":
                            designation.setSelectedIndex(5);
                            break;
                        default:
                            break;
                    }
                }
                name.setText(result.getString(3));
                fatherName.setText(result.getString(4));
                motherName1.setText(result.getString(5));
                String images = result.getString(13);
                imageLabel.setIcon(seticon(images, null));

            }

        } catch (SQLException e) {
            System.out.println(e);
        }


    }//GEN-LAST:event_idKeyReleased

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try {
            String del = "delete from schooldatabase.employee where role =?";
            String delall = "delete from schooldatabase.allstudent where role =?";
            PreparedStatement pst = con.prepareStatement(del);
            PreparedStatement pst2 = con.prepareStatement(delall);

            String[] option = {"Yes", "No"};

            if (id.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "You doesn't enter any id");
            } else {
                int x = JOptionPane.showOptionDialog(null, "are your want to delete ", "Delete confarmation box", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, option[1]);
                if (x == 0) {
                    pst.setInt(1, Integer.parseInt(id.getText()));
                    pst2.setInt(1, Integer.parseInt(id.getText()));
                    pst2.executeUpdate();
                    if (pst.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "Delete 1 row successfully");
                    }

                    // code for clear all field after delet   succesfully
                    clear();

                }
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_deleteActionPerformed

    private void teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherActionPerformed
        // TODO add your handling code here:
        new Teacher_information().setVisible(true);
        dispose();
    }//GEN-LAST:event_teacherActionPerformed

    private void StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentActionPerformed
        // TODO add your handling code here:
        new Student_Information().setVisible(true);
        dispose();
    }//GEN-LAST:event_StudentActionPerformed

    private void resultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultsActionPerformed
        // TODO add your handling code here:
        new reultInfo().setVisible(true);
        dispose();
    }//GEN-LAST:event_resultsActionPerformed

    private void TranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TranscriptActionPerformed
        // TODO add your handling code here:
        new AcademicTranscript().setVisible(true);
        dispose();
    }//GEN-LAST:event_TranscriptActionPerformed

    private void pymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pymentsActionPerformed
        // TODO add your handling code here:
        new Payment().setVisible(true);
        dispose();
    }//GEN-LAST:event_pymentsActionPerformed

    private void classRoutineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classRoutineActionPerformed
        // TODO add your handling code here:
        new classroutinHome().setVisible(true);
        dispose();
    }//GEN-LAST:event_classRoutineActionPerformed

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
            java.util.logging.Logger.getLogger(removeEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new removeEmployee().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Student;
    private javax.swing.JButton Transcript;
    private javax.swing.JButton beack;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton classRoutine;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> designation;
    private javax.swing.JTextField fatherName;
    private javax.swing.JButton home;
    private javax.swing.JTextField id;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logout;
    private javax.swing.JTextField motherName1;
    private javax.swing.JTextField name;
    private javax.swing.JButton pyments;
    private javax.swing.JButton results;
    private javax.swing.JButton teacher;
    // End of variables declaration//GEN-END:variables
}
