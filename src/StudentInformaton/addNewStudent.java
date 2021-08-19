/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentInformaton;

import HomeAndLogin.Home;
import HomeAndLogin.Login;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import javax.swing.table.DefaultTableModel;

public class addNewStudent extends javax.swing.JFrame {

    ResultSet result, numberOfRow;
    Connection con;
    Statement statement;
    DefaultTableModel model = new DefaultTableModel();
    ImageIcon myimage;
    String imagepath;
    String imagePaths;
    byte[] image;
    String Gender = "";
    String religion="";

    public addNewStudent() {
        initComponents();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldatabase", "root", "6660052");
        } catch (SQLException ex) {

        }
       
    }

    public void clear() {
        name.setText("");
        fatherName.setText("");
        motherName.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        mobileNumber.setText("");
        presentAddress.setText("");
        parmanentAddress.setText("");
        imageLabel.setIcon(null);
    }

    public PageFormat getPageFormat(PrinterJob pj) {

        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();

        double middleHeight = 24.0;
        double headerHeight = 2.0;
        double footerHeight = 2.0;
        double width = convert_CM_To_PPI(21);      //printer know only point per inch.default value is 72ppi
        double height = convert_CM_To_PPI(headerHeight + middleHeight + footerHeight);
        paper.setSize(width, height);
        paper.setImageableArea(
                0,
                10,
                width,
                height - convert_CM_To_PPI(1)
        );   //define boarder size    after that print area width is about 180 points

        pf.setOrientation(PageFormat.PORTRAIT);           //select orientation portrait or landscape but for this time portrait
        pf.setPaper(paper);

        return pf;
    }

    protected static double convert_CM_To_PPI(double cm) {
        return toPPI(cm * 0.393600787);
    }

    protected static double toPPI(double inch) {
        return inch * 72d;
    }

    public class BillPrintable implements Printable {

        @Override
        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
                throws PrinterException {

            int result = NO_SUCH_PAGE;
            if (pageIndex == 0) {

                Graphics2D g2d = (Graphics2D) graphics;
                Graphics2D font15 = (Graphics2D) graphics;

                g2d.translate((int) pageFormat.getImageableX(), (int) pageFormat.getImageableY());
                font15.translate((int) pageFormat.getImageableX(), (int) pageFormat.getImageableY());
                try {
                    /*Draw Header*/
                    int y = 20;
                    int yShift = 21;
                    int headerRectHeight = 15;

                    ///////////////// Product price Get ///////////
                    int day = jDateChooser1.getDate().getDate();
                    String d=String.valueOf(jDateChooser1.getDate());
                    String[] dd=d.split(" ");
                    String month = dd[1];
                    int year = jDateChooser1.getDate().getYear() + 1900;
                    String date = day + " " + month + "," + year;

                    font15.setFont(new Font("Monospaced", Font.BOLD, 23));
                    font15.drawString("          SATIRPARA PRIMARY SCHOOL  ", 12, y);
                    g2d.setFont(new Font("Monospaced", Font.PLAIN, 12));
                    y += yShift;
                    g2d.drawString("                         Satirpara, Bijoynagar, Brahmanbaria           ", 10, y);
                    y += yShift;
                    g2d.drawString("                                                   ", 10, y);
                    y += headerRectHeight;

                    g2d.setFont(new Font("Monospaced", Font.BOLD, 16));
                    g2d.drawString("                      Student Information               ", 10, y);
                    y += yShift;
                    g2d.drawString("                                                   ", 10, y);
                    y += headerRectHeight;

                    g2d.setFont(new Font("Monospaced", Font.PLAIN, 14));
                    g2d.drawString("      Roll              : " + role.getText() + "               ", 10, y);
                    y += yShift;
                    g2d.drawString("      Class             : " + clase.getSelectedItem() + "      ", 10, y);
                    y += yShift;
                    g2d.drawString("      Shift             : " + shift.getSelectedItem() + "      ", 10, y);
                    y += yShift;
                    g2d.drawString("      Student Name      : " + name.getText() + "      ", 10, y);
                    y += yShift;
                    g2d.drawString("      Father Name       : " + fatherName.getText() + "      ", 10, y);
                    y += yShift;
                    g2d.drawString("      Mother Name       : " + motherName.getText() + "      ", 10, y);
                    y += yShift;
                    g2d.drawString("      Gender            : " + Gender  + "      ", 10, y);
                    y += yShift;
                    g2d.drawString("      Religion          : " + religion + "      ", 10, y);
                    y += yShift;
                    g2d.drawString("      Birthday          : " + date + "           ", 10, y);
                    y += yShift;
                    g2d.drawString("      Mobile No         : " + mobileNumber.getText() + "       ", 10, y);
                    y += yShift;
                    g2d.drawString("      Present Address   : " + presentAddress.getText() + "     ", 10, y);
                    y += yShift;
                    y += yShift;
                    y += yShift;
                    y += yShift;
                    y += yShift;
                    y += yShift;
                    y += yShift;

                    // get totady date
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDateTime now = LocalDateTime.now();
                    System.out.println(dtf.format(now));

                    g2d.drawString("      Print date :" + dtf.format(now) + "                       Athority ", 10, y);
                    y += yShift;

                } catch (NumberFormatException r) {
                }

                result = PAGE_EXISTS;
            }
            return result;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        updateStudent = new javax.swing.JButton();
        deleteStudent = new javax.swing.JButton();
        studentID = new javax.swing.JButton();
        searchStudent = new javax.swing.JButton();
        home = new javax.swing.JButton();
        beack = new javax.swing.JButton();
        Trascript = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        clase = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        shift = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        role = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fatherName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        motherName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        islam = new javax.swing.JRadioButton();
        khristan = new javax.swing.JRadioButton();
        hindo = new javax.swing.JRadioButton();
        buddo = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        others = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        mobileNumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        presentAddress = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        sameAddress = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        parmanentAddress = new javax.swing.JTextArea();
        chooseImage = new javax.swing.JButton();
        imagePath = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        svae = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Student");
        setPreferredSize(new java.awt.Dimension(1050, 600));

        jLabel1.setBackground(new java.awt.Color(204, 253, 185));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add new Student");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51)));
        jLabel1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        updateStudent.setBackground(new java.awt.Color(204, 204, 204));
        updateStudent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateStudent.setText("Edit Student Info");
        updateStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentActionPerformed(evt);
            }
        });

        deleteStudent.setBackground(new java.awt.Color(204, 204, 204));
        deleteStudent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deleteStudent.setText("Delete Student");
        deleteStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentActionPerformed(evt);
            }
        });

        studentID.setBackground(new java.awt.Color(204, 204, 204));
        studentID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        studentID.setText("Student Id");
        studentID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIDActionPerformed(evt);
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

        Trascript.setBackground(new java.awt.Color(204, 204, 204));
        Trascript.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Trascript.setText("Issue Transcript");
        Trascript.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Trascript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrascriptActionPerformed(evt);
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
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(beack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(updateStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Trascript, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(updateStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studentID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Trascript)
                .addGap(0, 295, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Class  :");

        clase.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "ONE", "TWO", "THREE", "FOUR", "FIVE", " " }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Shift  :");

        shift.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        shift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "MORNING", "AFTERNOON", "EVENING", " " }));
        shift.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                shiftItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Role Number    :");

        role.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        role.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Student Name  :");

        name.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        imageLabel.setBackground(new java.awt.Color(255, 255, 255));
        imageLabel.setIcon(chooseImage.getIcon());
        imageLabel.setOpaque(true);
        imageLabel.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                imageLabelVetoableChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Father Name    :");

        fatherName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Mother Name   :");

        motherName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        motherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motherNameActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel13.setText("Religion          :");

        buttonGroup2.add(islam);
        islam.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        islam.setText("Islam");

        buttonGroup2.add(khristan);
        khristan.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        khristan.setText("Khristan");

        buttonGroup2.add(hindo);
        hindo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        hindo.setText("Hindo");

        buttonGroup2.add(buddo);
        buddo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        buddo.setText("Budho");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setText("Gender           :");

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        male.setText("Male");

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        female.setText("Female");

        buttonGroup1.add(others);
        others.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        others.setText("Others");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("Date of Birth   :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel11.setText("Phone number :");

        mobileNumber.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setText("Present Address     :");

        presentAddress.setColumns(20);
        presentAddress.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        presentAddress.setLineWrap(true);
        presentAddress.setRows(5);
        presentAddress.setAutoscrolls(false);
        jScrollPane1.setViewportView(presentAddress);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel12.setText("Parmanent Address :");

        sameAddress.setText("Same As Present Address");
        sameAddress.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sameAddressStateChanged(evt);
            }
        });

        parmanentAddress.setColumns(20);
        parmanentAddress.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        parmanentAddress.setLineWrap(true);
        parmanentAddress.setRows(5);
        jScrollPane2.setViewportView(parmanentAddress);

        chooseImage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chooseImage.setText("Choose image");
        chooseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseImageActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Image");

        svae.setBackground(new java.awt.Color(153, 255, 153));
        svae.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        svae.setText("Save");
        svae.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51)));
        svae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svaeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clase, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fatherName, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                        .addComponent(motherName)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(role, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                        .addComponent(name)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(islam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(khristan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hindo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buddo))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(male)
                                        .addGap(18, 18, 18)
                                        .addComponent(female)))
                                .addGap(18, 18, 18)
                                .addComponent(others)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(chooseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33))
                                            .addComponent(imagePath))
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(148, 148, 148)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(18, 18, 18)
                                                .addComponent(sameAddress))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(143, 143, 143))))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(svae, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(clase, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(chooseImage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(motherName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(islam)
                            .addComponent(khristan)
                            .addComponent(hindo)
                            .addComponent(buddo)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(male)
                            .addComponent(female)
                            .addComponent(others))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sameAddress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(svae, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/log out icon.jpg"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void shiftItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_shiftItemStateChanged
        // TODO add your handling code here:
        try {

            statement = (Statement) con.createStatement();
            String query = "SELECT max(role) FROM schooldatabase." + clase.getSelectedItem() + "_" + shift.getSelectedItem();
            result = statement.executeQuery(query);
            result.next();
            role.setText(String.valueOf(result.getInt(1) + 1));

        } catch (SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_shiftItemStateChanged

    private void svaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svaeActionPerformed
        // TODO add your handling code here:

        Pattern p = Pattern.compile("^[0-9]{3,3}$");
        Matcher idd = p.matcher(role.getText());

        String Clase = String.valueOf(clase.getSelectedItem());
        String Shift = String.valueOf(shift.getSelectedItem());

        String Name = name.getText();
        String fName = fatherName.getText();
        String mName = motherName.getText();
        
        if (islam.isSelected()) {
            religion = islam.getText();
        } else if (hindo.isSelected()) {
            religion = hindo.getText();
        } else if (khristan.isSelected()) {
            religion = khristan.getText();
        } else if (buddo.isSelected()) {
            religion = buddo.getText();
        }
        
        if (male.isSelected()) {
            Gender = male.getText();
        } else if (female.isSelected()) {
            Gender = female.getText();
        } else if (others.isSelected()) {
            Gender = others.getText();
        }
        int day = jDateChooser1.getDate().getDate();
        int month = jDateChooser1.getDate().getMonth() + 1;
        int year = jDateChooser1.getDate().getYear() + 1900;
        String date = year + "-" + month + "-" + day;

        String Mobile = mobileNumber.getText();
        String PresentAddress = presentAddress.getText();
        String parmanentAddres = parmanentAddress.getText();

        try {

            if (Name.isEmpty() || fName.isEmpty() || mName.isEmpty() || PresentAddress.isEmpty() || Clase.contains("  ") || Shift.contains("  ") || Mobile.isEmpty() || !male.isSelected() && !female.isSelected() && !others.isSelected()) {
                JOptionPane.showMessageDialog(null, "Fill all required field");

            } else if (!idd.find()) {
                JOptionPane.showMessageDialog(null, "ID is wrong, input numeric number and musbt be  three digit");
            } else if (Mobile.length() != 11) {
                JOptionPane.showMessageDialog(null, "Mobile number must be eleven Digit");
            } else {
                // inser data to the table
                String insert = "INSERT INTO  schooldatabase." + clase.getSelectedItem() + "_" + shift.getSelectedItem() + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";   // insert data to Database
                String allstudent = "INSERT INTO  schooldatabase.allstudent VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";   // insert data to Database
                PreparedStatement add = con.prepareStatement(insert);
                PreparedStatement add2 = con.prepareStatement(allstudent);
                int Role = Integer.parseInt(role.getText());
                add.setInt(1, Role);
                add.setString(2, Clase);
                add.setString(3, Shift);
                add.setString(4, Name);
                add.setString(5, fName);
                add.setString(6, mName);
                add.setString(7, Gender);
                add.setDate(8, Date.valueOf(date));
                add.setInt(9, Integer.parseInt(Mobile));
                add.setString(10, PresentAddress);
                add.setString(11, parmanentAddres);
                add.setString(12, religion);
                add.setString(13, imagePaths);
                
                add2.setInt(1, Role);
                add2.setString(2, Clase);
                add2.setString(3, Shift);
                add2.setString(4, Name);
                add2.setString(5, fName);
                add2.setString(6, mName);
                add2.setString(7, Gender);
                add2.setDate(8, Date.valueOf(date));
                add2.setInt(9, Integer.parseInt(Mobile));
                add2.setString(10, PresentAddress);
                add2.setString(11, parmanentAddres);
                add2.setString(12, religion);
                add2.setString(13, imagePaths);
                add2.executeUpdate();

                if (add.executeUpdate() > 0) {

                    String[] option = {"Yes", "No"};
                    int x = JOptionPane.showOptionDialog(null, "Regestration Successfull \nare your want to print? ", "confarmation box", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, option[1]);
                    if (x == 0) {

                        PrinterJob pj = PrinterJob.getPrinterJob();
                        pj.setPrintable(new addNewStudent.BillPrintable(), getPageFormat(pj));
                        try {
                            pj.print();

                        } catch (PrinterException ex) {
                        }

                    }

                    // code for update nex role after save succesfully
                    statement = (Statement) con.createStatement();
                    String query = "SELECT max(role) FROM schooldatabase." + clase.getSelectedItem() + "_" + shift.getSelectedItem();
                    result = statement.executeQuery(query);
                    result.next();
                    role.setText(String.valueOf(result.getInt(1) + 1));

                    // code for clear all field after save data succesfully
                    clear();

                }

            }
        } catch (SQLException e) {
            String s = e.toString();
            System.out.println(e);
            String[] ss = s.split(" ");

            if ("Duplicate".equals(ss[1])) {
                JOptionPane.showMessageDialog(null, "Role already exist ");
            }

        }


    }//GEN-LAST:event_svaeActionPerformed

    private void updateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentActionPerformed
        // TODO add your handling code here:
        new UpdateStudentInformation().setVisible(true);
        dispose();
    }//GEN-LAST:event_updateStudentActionPerformed

    private void deleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentActionPerformed
        // TODO add your handling code here:
        new deleteStudent().setVisible(true);
        dispose();
    }//GEN-LAST:event_deleteStudentActionPerformed

    private void sameAddressStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sameAddressStateChanged
        // TODO add your handling code here:
        if (sameAddress.isSelected()) {
            parmanentAddress.setText(presentAddress.getText());
        }

    }//GEN-LAST:event_sameAddressStateChanged
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
    private void chooseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseImageActionPerformed
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


    }//GEN-LAST:event_chooseImageActionPerformed

    private void imageLabelVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_imageLabelVetoableChange
        // TODO add your handling code here:


    }//GEN-LAST:event_imageLabelVetoableChange

    private void studentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIDActionPerformed
        // TODO add your handling code here:
        new studentIdCard().setVisible(true);
        dispose();
    }//GEN-LAST:event_studentIDActionPerformed

    private void searchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStudentActionPerformed
        // TODO add your handling code here:
        new searchStudent().setVisible(true);
        dispose();
    }//GEN-LAST:event_searchStudentActionPerformed

    private void motherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motherNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motherNameActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleActionPerformed

    private void TrascriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrascriptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TrascriptActionPerformed

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

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
           new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(addNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new addNewStudent().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Trascript;
    private javax.swing.JButton beack;
    private javax.swing.JRadioButton buddo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton chooseImage;
    private javax.swing.JComboBox<String> clase;
    private javax.swing.JButton deleteStudent;
    private javax.swing.JTextField fatherName;
    private javax.swing.JRadioButton female;
    private javax.swing.JRadioButton hindo;
    private javax.swing.JButton home;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JTextField imagePath;
    private javax.swing.JRadioButton islam;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton khristan;
    private javax.swing.JButton logout;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField mobileNumber;
    private javax.swing.JTextField motherName;
    private javax.swing.JTextField name;
    private javax.swing.JRadioButton others;
    private javax.swing.JTextArea parmanentAddress;
    private javax.swing.JTextArea presentAddress;
    private javax.swing.JTextField role;
    private javax.swing.JCheckBox sameAddress;
    private javax.swing.JButton searchStudent;
    private javax.swing.JComboBox<String> shift;
    private javax.swing.JButton studentID;
    private javax.swing.JButton svae;
    private javax.swing.JButton updateStudent;
    // End of variables declaration//GEN-END:variables
}
