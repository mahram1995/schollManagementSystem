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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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

public class editTeacher extends javax.swing.JFrame {

    ResultSet result, numberOfRow;
    Connection con;
    Statement statement;
    DefaultTableModel model = new DefaultTableModel();
    ImageIcon myimage;
    String imagepath;
    String imagePaths;
    byte[] image;

    public editTeacher() {
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
        upadte = new javax.swing.JButton();
        clear = new javax.swing.JButton();
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
        budho = new javax.swing.JRadioButton();
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
        setTitle("Prograssive Kindergarten");
        setPreferredSize(new java.awt.Dimension(1050, 600));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit Employee Information");
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Designations   :");

        designation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        designation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Principal", "Assistance Teacher", "Office Assistant", "Computer Operator", "Security", " " }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("ID                 :");

        id.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Name            :");

        name.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        fatherName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Father Name   :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Joining Date   :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Present Address    :");

        presentAddress.setColumns(20);
        presentAddress.setLineWrap(true);
        presentAddress.setRows(5);
        presentAddress.setWrapStyleWord(true);
        presentAddress.setAutoscrolls(false);
        presentAddress.setPreferredSize(new java.awt.Dimension(160, 95));
        jScrollPane1.setViewportView(presentAddress);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Gender          :");

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        male.setText("Male");

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        female.setText("Female");

        buttonGroup1.add(others);
        others.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        others.setText("Others");

        mobileNumber.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Phone number :");

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
        parmanentAddress.setPreferredSize(new java.awt.Dimension(160, 95));
        jScrollPane2.setViewportView(parmanentAddress);

        upadte.setBackground(new java.awt.Color(153, 255, 153));
        upadte.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        upadte.setText("Update");
        upadte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upadteActionPerformed(evt);
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
                    .addComponent(classRoutine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Transcript, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(results, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(beack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pyments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classRoutine)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Religion         :");

        buttonGroup2.add(islam);
        islam.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        islam.setText("Islam");

        buttonGroup2.add(khristan);
        khristan.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        khristan.setText("Khristan");

        buttonGroup2.add(hindo);
        hindo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        hindo.setText("Hindo");

        buttonGroup2.add(budho);
        budho.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        budho.setText("Budho");

        chooseImage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chooseImage.setText("Choose image");
        chooseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseImageActionPerformed(evt);
            }
        });

        imageLabel.setBackground(new java.awt.Color(255, 255, 255));
        imageLabel.setIcon(chooseImage.getIcon());
        imageLabel.setOpaque(true);
        imageLabel.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                imageLabelVetoableChange(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Mother Name  :");

        motherName1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Highest Qual   :");

        qualification.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        qualification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qualificationActionPerformed(evt);
            }
        });

        jButton1.setText("Image");

        logout.setBackground(new java.awt.Color(204, 204, 204));
        logout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(upadte, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(qualification, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(designation, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1)
                                            .addComponent(motherName1))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1)
                                            .addComponent(fatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(male)
                                                .addGap(18, 18, 18)
                                                .addComponent(female)
                                                .addGap(18, 18, 18)
                                                .addComponent(others))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(islam)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(khristan)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(hindo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(budho)))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(chooseImage, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                                    .addComponent(imagePath))
                                                .addGap(18, 18, 18)
                                                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addGap(77, 77, 77))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(sameAddress))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addGap(0, 0, Short.MAX_VALUE))))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(logout))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chooseImage)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(designation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(motherName1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(islam)
                                    .addComponent(khristan)
                                    .addComponent(hindo)
                                    .addComponent(budho))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(male)
                                    .addComponent(female)
                                    .addComponent(others))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qualification, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sameAddress))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(upadte, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void upadteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upadteActionPerformed
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
        } else if (budho.isSelected()) {
            religion = budho.getText();
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
                String insert = "update schooldatabase.employee set id=?, designation=?, name=?, father_name=?, mother_name=?, religion=?, gender=?, joining_date=?, qualification=?, mobile=?, present_address=? , parmanent_address=?,  image=?  where id=" + id.getText();
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
                add.setString(10, Mobile);
                add.setString(11, PresentAddress);
                add.setString(12, parmanentAddres);
                add.setString(13, imagePaths);

                if (add.executeUpdate() > 0) {

                    String[] option = {"Yes", "No"};
                    int x = JOptionPane.showOptionDialog(null, "Update Successfull \nare your want to print? ", "confarmation box", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, option[1]);
                    if (x == 0) {

                        PrinterJob pj = PrinterJob.getPrinterJob();
                        pj.setPrintable(new editTeacher.BillPrintable(), getPageFormat(pj));
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
            
            String[] ss = s.split(" ");

            if ("Duplicate".equals(ss[1])) {
                JOptionPane.showMessageDialog(null, "Role already exist ");
            }
            System.out.println(e);

        }


    }//GEN-LAST:event_upadteActionPerformed

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
                if (null != Designation) switch (Designation) {
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
                name.setText(result.getString(3));
                fatherName.setText(result.getString(4));
                motherName1.setText(result.getString(5));
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

                String Religion = result.getString(6);
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

                String date = (result.getString(8));
                //set date to the celender
                String[] dd = date.split("-");
                String day = dd[2];
                String month = dd[1];
                String year = dd[0];
                if (day.length() == 1) {
                    day = "0" + day;
                }
                if (month.length() == 1) {
                    month = "0" + month;
                }
                String ddd = year + "-" + month + "-" + day;

                Date dat = new SimpleDateFormat("yyyy-MM-dd").parse(ddd);
                jDateChooser1.setDate(dat);
                
                qualification.setText(result.getString(9));
                mobileNumber.setText(result.getString(10));
                presentAddress.setText(result.getString(11));
                parmanentAddress.setText(result.getString(12));
                String images = result.getString(13);
                 
                imagePaths = images;
                String[] imageName = images.split("\\\\");
                imagePath.setText(imageName[imageName.length - 1]);
                imageLabel.setIcon(seticon(images, null));
                

            }

        } catch (SQLException e) {
            System.out.println(e);
        } catch (ParseException ex) {
            Logger.getLogger(editTeacher.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_idKeyReleased

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
            java.util.logging.Logger.getLogger(editTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
            new editTeacher().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Student;
    private javax.swing.JButton Transcript;
    private javax.swing.JButton beack;
    private javax.swing.JRadioButton budho;
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
    private javax.swing.JButton pyments;
    private javax.swing.JTextField qualification;
    private javax.swing.JButton results;
    private javax.swing.JCheckBox sameAddress;
    private javax.swing.JButton teacher;
    private javax.swing.JButton upadte;
    // End of variables declaration//GEN-END:variables
}
