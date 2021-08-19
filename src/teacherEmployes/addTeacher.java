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
import payment.Payment;
import result.AcademicTranscript;
import result.reultInfo;

public class addTeacher extends javax.swing.JFrame {
    
    ResultSet result, numberOfRow;
    Connection con;
    Statement statement;
    DefaultTableModel model = new DefaultTableModel();
    ImageIcon myimage;
    String imagepath;
    String imagePaths;
    byte[] image;
    
    public addTeacher() {
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
        model.addColumn("DOB");
        model.addColumn("Mobile No.");
        model.addColumn("present Address");
        model.addColumn("Parmanent Address");
    }
    
    public void clear() {
        name.setText("");
        
        fatherName.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        mobileNumber.setText("");
        presentAddress.setText("");
        parmanentAddress.setText("");
        imageLabel.setIcon(null);
        motherName1.setText("");
        qualification.setText("");
    }
    
    public PageFormat getPageFormat(PrinterJob pj) {
        
        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();
        
        double middleHeight = 16.0;
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
                    font15.setFont(new Font("Monospaced", Font.BOLD, 23));
                    font15.drawString("         Satirpara Praimary School  ", 12, y);
                    g2d.setFont(new Font("Monospaced", Font.PLAIN, 12));
                    y += yShift;
                    g2d.drawString("                         Satirpara, Bijoynagar, Bramanbaria           ", 10, y);
                    y += yShift;
                    g2d.drawString("                                                   ", 10, y);
                    y += headerRectHeight;
                    
                    g2d.setFont(new Font("Monospaced", Font.BOLD, 16));
                    g2d.drawString("                      Student Information               ", 10, y);
                    y += yShift;
                    g2d.drawString("                                                   ", 10, y);
                    y += headerRectHeight;
                    
                    g2d.setFont(new Font("Monospaced", Font.PLAIN, 14));
                    g2d.drawString("      Role              : " + id.getText() + "               ", 10, y);
                    y += yShift;
                    g2d.drawString("      Class             : " + designation.getSelectedItem() + "      ", 10, y);
                    y += yShift;
                    
                    g2d.drawString("      Student Name      : " + name.getText() + "      ", 10, y);
                    y += yShift;
                    
                    g2d.drawString("      Mother Name       : " + fatherName.getText() + "      ", 10, y);
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
        jLabel2 = new javax.swing.JLabel();
        designation = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        fatherName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        presentAddress = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        others = new javax.swing.JRadioButton();
        mobileNumber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sameAddress = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        parmanentAddress = new javax.swing.JTextArea();
        svae = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        beack = new javax.swing.JButton();
        teacher = new javax.swing.JButton();
        Student = new javax.swing.JButton();
        results = new javax.swing.JButton();
        Transcript = new javax.swing.JButton();
        pyments = new javax.swing.JButton();
        classRoutine = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        islam = new javax.swing.JRadioButton();
        khristan = new javax.swing.JRadioButton();
        hindo = new javax.swing.JRadioButton();
        buddo = new javax.swing.JRadioButton();
        chooseImage = new javax.swing.JButton();
        imagePath = new javax.swing.JTextField();
        imageLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        motherName1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        qualification = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Student");
        setPreferredSize(new java.awt.Dimension(1050, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(184, 252, 184));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("New Employee Registration");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 11, 700, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Designations   :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 98, -1, -1));

        designation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        designation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Designation--", "Principal", "Assistance Teacher -", "Office Assistant", "Computer Operator", "Security", " " }));
        getContentPane().add(designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 95, 266, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("ID                 :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 50, 131, 32));

        id.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 52, 264, 32));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Name            :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 131, 131, 32));

        name.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 133, 265, 32));

        fatherName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(fatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 173, 265, 32));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Father Name   :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 171, -1, 32));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Joining Date   :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 327, 131, 32));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Present Address    :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 264, -1, 32));

        presentAddress.setColumns(20);
        presentAddress.setLineWrap(true);
        presentAddress.setRows(5);
        presentAddress.setAutoscrolls(false);
        presentAddress.setPreferredSize(new java.awt.Dimension(160, 95));
        jScrollPane1.setViewportView(presentAddress);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 302, 271, 42));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Gender          :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 289, -1, 32));

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        male.setText("Male");
        getContentPane().add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        female.setText("Female");
        getContentPane().add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        buttonGroup1.add(others);
        others.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        others.setText("Others");
        getContentPane().add(others, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        mobileNumber.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(mobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 275, 32));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Phone number :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 410, 131, 32));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Parmanent Address :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 370, -1, 32));

        sameAddress.setText("Same As Present Address");
        sameAddress.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sameAddressStateChanged(evt);
            }
        });
        getContentPane().add(sameAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(817, 378, -1, -1));

        parmanentAddress.setColumns(20);
        parmanentAddress.setLineWrap(true);
        parmanentAddress.setRows(5);
        parmanentAddress.setPreferredSize(new java.awt.Dimension(160, 95));
        jScrollPane2.setViewportView(parmanentAddress);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 408, 272, 42));

        svae.setBackground(new java.awt.Color(153, 255, 153));
        svae.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        svae.setText("Save");
        svae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svaeActionPerformed(evt);
            }
        });
        getContentPane().add(svae, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 489, 140, 41));

        clear.setBackground(new java.awt.Color(153, 255, 153));
        clear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 489, 140, 41));

        print.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        getContentPane().add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 491, -1, -1));

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pyments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Transcript, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(results, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Student, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(beack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(teacher, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(classRoutine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(beack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGap(0, 236, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 200, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Religion         :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 251, 131, 32));

        buttonGroup2.add(islam);
        islam.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        islam.setText("Islam");
        getContentPane().add(islam, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 255, -1, -1));

        buttonGroup2.add(khristan);
        khristan.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        khristan.setText("Khristan");
        getContentPane().add(khristan, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 255, -1, -1));

        buttonGroup2.add(hindo);
        hindo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        hindo.setText("Hindo");
        getContentPane().add(hindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 255, -1, -1));

        buttonGroup2.add(buddo);
        buddo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        buddo.setText("Budho");
        getContentPane().add(buddo, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 255, -1, -1));

        chooseImage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chooseImage.setText("Choose image");
        chooseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseImageActionPerformed(evt);
            }
        });
        getContentPane().add(chooseImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 50, 124, -1));
        getContentPane().add(imagePath, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 90, 124, 28));

        imageLabel.setIcon(chooseImage.getIcon());
        imageLabel.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                imageLabelVetoableChange(evt);
            }
        });
        getContentPane().add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(821, 62, 146, 157));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Mother Name  :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 211, 131, 32));

        motherName1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(motherName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 265, 32));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Highest Qual   :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 365, 131, 32));

        qualification.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        qualification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qualificationActionPerformed(evt);
            }
        });
        getContentPane().add(qualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 367, 275, 32));

        jButton1.setText("Image");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(861, 230, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 327, 140, 32));

        logout.setBackground(new java.awt.Color(204, 204, 204));
        logout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/log out icon.jpg"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(928, 11, 46, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void svaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svaeActionPerformed
        // TODO add your handling code here:

        Pattern p = Pattern.compile("^[0-9]{5,5}$");
        Matcher idd = p.matcher(id.getText());
        
        String Designation = String.valueOf(designation.getSelectedItem());
        int Id = Integer.parseInt(id.getText());
        int date = jDateChooser1.getDate().getDate();
        int month = jDateChooser1.getDate().getMonth() + 1;
        int year = jDateChooser1.getDate().getYear() + 1900;
        String dates = (year + "-" + month + "-" + date);
        String Name = name.getText();
        String fName = fatherName.getText();
        String mName = motherName1.getText();
        String religion = "";
        if (islam.isSelected()) {
            religion = islam.getText();
        } else if (hindo.isSelected()) {
            religion = hindo.getText();
        } else if (khristan.isSelected()) {
            religion = khristan.getText();
        } else if (buddo.isSelected()) {
            religion = buddo.getText();
        }
        String Gender = "";
        if (male.isSelected()) {
            Gender = male.getText();
        } else if (female.isSelected()) {
            Gender = female.getText();
        } else if (others.isSelected()) {
            Gender = others.getText();
        }
        String Qualification = qualification.getText();
        String Mobile = mobileNumber.getText();
        String PresentAddress = presentAddress.getText();
        String parmanentAddres = parmanentAddress.getText();
        
        try {
            
            if (Name.isEmpty() || mName.isEmpty() || PresentAddress.isEmpty() || Designation.contains("  ") || Mobile.isEmpty() || !male.isSelected() && !female.isSelected() && !others.isSelected()) {
                JOptionPane.showMessageDialog(null, "Fill all required field");
                
            } else if (!idd.find()) {
                JOptionPane.showMessageDialog(null, "ID is wrong, input numeric number and musbt be  three digit");
            } else if (Mobile.length() != 11) {
                JOptionPane.showMessageDialog(null, "Mobile number must be eleven Digit");
            } else {
                // inser data to the table
                String insert = "INSERT INTO  schooldatabase.employee  VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";   // insert data to Database
                PreparedStatement add = con.prepareStatement(insert);
                add.setInt(1, Id);
                add.setString(2, Designation);
                add.setString(3, Name);
                add.setString(4, fName);
                add.setString(5, mName);
                add.setString(6, religion);
                add.setString(7, Gender);
                add.setString(8, dates);
                add.setString(9, Qualification);
                add.setInt(10, Integer.parseInt(Mobile));
                add.setString(11, PresentAddress);
                add.setString(12, parmanentAddres);
                add.setString(13, imagePaths);
                
                if (add.executeUpdate() > 0) {
                    
                    String[] option = {"Yes", "No"};
                    int x = JOptionPane.showOptionDialog(null, "Regestration Successfull \nare your want to print? ", "confarmation box", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, option[1]);
                    if (x == 0) {
                        
                        PrinterJob pj = PrinterJob.getPrinterJob();
                        pj.setPrintable(new addTeacher.BillPrintable(), getPageFormat(pj));
                        try {
                            pj.print();
                            
                        } catch (PrinterException ex) {
                        }
                        
                    }

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

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:

        try {
            clear();
            // code for update nex role after save succesfully
            statement = (Statement) con.createStatement();
            String query = "SELECT max(role) FROM schooldatabase." + designation.getSelectedItem();
            result = statement.executeQuery(query);
            result.next();
            id.setText(String.valueOf(result.getInt(1) + 1));

            // code for clear all field after save data succesfully
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_clearActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
//        MessageFormat header = new MessageFormat("Stdent Information");
//        table.print(JTable.PrintMode.NORMAL, header, header);
    }//GEN-LAST:event_printActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:

       new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_homeActionPerformed

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

    private void qualificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qualificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qualificationActionPerformed

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
            java.util.logging.Logger.getLogger(addTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            new addTeacher().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Student;
    private javax.swing.JButton Transcript;
    private javax.swing.JButton beack;
    private javax.swing.JRadioButton buddo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton chooseImage;
    private javax.swing.JButton classRoutine;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> designation;
    private javax.swing.JTextField fatherName;
    private javax.swing.JRadioButton female;
    private javax.swing.JRadioButton hindo;
    private javax.swing.JButton home;
    private javax.swing.JTextField id;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JTextField imagePath;
    private javax.swing.JRadioButton islam;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton khristan;
    private javax.swing.JButton logout;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField mobileNumber;
    private javax.swing.JTextField motherName1;
    private javax.swing.JTextField name;
    private javax.swing.JRadioButton others;
    private javax.swing.JTextArea parmanentAddress;
    private javax.swing.JTextArea presentAddress;
    private javax.swing.JButton print;
    private javax.swing.JButton pyments;
    private javax.swing.JTextField qualification;
    private javax.swing.JButton results;
    private javax.swing.JCheckBox sameAddress;
    private javax.swing.JButton svae;
    private javax.swing.JButton teacher;
    // End of variables declaration//GEN-END:variables
}
