package StudentInformaton;

import HomeAndLogin.Home;
import HomeAndLogin.Login;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class searchStudent extends javax.swing.JFrame {

    ResultSet result, numberOfRow;
    Connection con;
    Statement statement;
    DefaultTableModel model = new DefaultTableModel();
    ImageIcon myimage;
    String imagepath;
    String imagePaths;
    byte[] image;
    DefaultTableCellRenderer renderer;

    public searchStudent() {

        initComponents();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldatabase", "root", "6660052");
        } catch (SQLException ex) {

        }
        model.addColumn("Roll");
        model.addColumn("Class");
        model.addColumn("Shisft");
        model.addColumn("Name");
        model.addColumn("Gender");
        model.addColumn("Mobile No.");
        model.addColumn("Address");
        model.addColumn("DOB");
        table.setShowGrid(true);

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

                    // get gender and religion
                    ///////////////// Product price Get ///////////
                    font15.setFont(new Font("Monospaced", Font.BOLD, 23));
                    font15.drawString("          Progresive Kindergarten ", 12, y);
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

    public void clear() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        addNewStudent = new javax.swing.JButton();
        DeleteSutdent = new javax.swing.JButton();
        studentId = new javax.swing.JButton();
        trascript = new javax.swing.JButton();
        home1 = new javax.swing.JButton();
        beack = new javax.swing.JButton();
        editStudent = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        clase = new javax.swing.JComboBox<>();
        shift = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        logout = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        roll1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Prograsive Kindergarten");
        setPreferredSize(new java.awt.Dimension(1050, 600));

        jLabel1.setBackground(new java.awt.Color(183, 253, 183));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search Student");
        jLabel1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

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
        studentId.setText("Studetn ID");
        studentId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdActionPerformed(evt);
            }
        });

        trascript.setBackground(new java.awt.Color(204, 204, 204));
        trascript.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        trascript.setText("IssueTranscript");
        trascript.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trascript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trascriptActionPerformed(evt);
            }
        });

        home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.jpg"))); // NOI18N
        home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home1ActionPerformed(evt);
            }
        });

        beack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/beack icon.jpg"))); // NOI18N
        beack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beackActionPerformed(evt);
            }
        });

        editStudent.setBackground(new java.awt.Color(204, 204, 204));
        editStudent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        editStudent.setText("Edit Student Info");
        editStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addNewStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteSutdent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trascript, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(home1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(beack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(editStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beack, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(addNewStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteSutdent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trascript)
                .addGap(0, 259, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Search by Class & Shift");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Class  :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Shift  :");

        clase.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "ONE", "TWO", "THREE", "FOUR", "FIVE", " " }));
        clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claseActionPerformed(evt);
            }
        });

        shift.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        shift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "MORNING", "AFTERNOON", "EVENING", " " }));
        shift.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                shiftItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(shift, 0, 144, Short.MAX_VALUE)
                            .addComponent(clase, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(clase, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/log out icon.jpg"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Search by Roll");

        roll1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        roll1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        roll1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                roll1KeyReleased(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Roll Number  :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roll1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roll1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        print.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(logout))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(print))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
 
        try {
             statement = (Statement) con.createStatement();
            String query = "SELECT* FROM schooldatabase." + clase.getSelectedItem() + "_" + shift.getSelectedItem();
            result = statement.executeQuery(query);
            
            ArrayList roll= new ArrayList();
            ArrayList clas= new ArrayList();
            ArrayList Shift= new ArrayList();
            ArrayList name= new ArrayList();
            ArrayList mobile= new ArrayList();
            ArrayList gender= new ArrayList();
            ArrayList address= new ArrayList();
            ArrayList birthday= new ArrayList();
           
            
            while (result.next()) {

            roll.add(result.getString(1));
            clas.add(result.getString(2));
            Shift.add(result.getString(3));
            name.add(result.getString(4));
            mobile.add(result.getString(9));
            gender.add(result.getString(7));
            address.add(result.getString(10));
            birthday.add(result.getString(8));
           
               
            }

        
           
        // creat a workbook
        XSSFWorkbook workbook= new XSSFWorkbook();
        
        // creat spretsheet
        XSSFSheet sheet= workbook.createSheet(clase.getSelectedItem() + "_" + shift.getSelectedItem());
        
        // creat a row objcet
        XSSFRow row;
        
        // creat cells and set value
        row= sheet.createRow(0);
        Cell cell0= row.createCell(0);
        Cell cell1= row.createCell(1);
        Cell cell2= row.createCell(2);
        Cell cell3= row.createCell(3);
        Cell cell4= row.createCell(4);
        Cell cell5= row.createCell(5);
        Cell cell6= row.createCell(6);
        Cell cell7= row.createCell(7);
        
        cell0.setCellValue("roll");
        cell1.setCellValue("class");
        cell2.setCellValue("Shisf");
        cell3.setCellValue("name");
        cell4.setCellValue("gender.");
        cell5.setCellValue("birthday.");
        cell6.setCellValue("mobile");
        cell7.setCellValue("address.");
        
        
        // creat cells and rows for the data
        for (int i = 0; i < roll.size(); i++) {
            row=sheet.createRow(i+1);
            for (int j = 0; j <8; j++) {
                Cell cell=row.createCell(j);
                
                switch (cell.getColumnIndex()) {
                    case 0:
                        cell.setCellValue(roll.get(i).toString());
                        break;
                    case 1:
                       cell.setCellValue(clas.get(i).toString());
                        break;
                    case 2:
                        cell.setCellValue(Shift.get(i).toString());
                        break;
                    case 3:
                        cell.setCellValue(name.get(i).toString());
                        break;
                    case 4:
                        cell.setCellValue(gender.get(i).toString());
                        break;
                    case 5:
                        cell.setCellValue(birthday.get(i).toString());
                        break;
                    case 6:
                        cell.setCellValue(mobile.get(i).toString());
                        break;
                    case 7:
                        cell.setCellValue(address.get(i).toString());
                        break;
                   
                    default:
                        break;
                }   
            } 
        }
        
        // writing the created excel file
        
           FileOutputStream out= new FileOutputStream( new File(clase.getSelectedItem() + "_" + shift.getSelectedItem()+".xlsx")); 
           workbook.write(out);
           out.close();
            System.out.println("excel fill created successfully");
       
        } catch (IOException | SQLException e) {
        }
           
           
            
        


    }//GEN-LAST:event_printActionPerformed
    public static void m2() {

    }
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

    private void studentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdActionPerformed
        // TODO add your handling code here:
        new studentIdCard().setVisible(true);
        dispose();
    }//GEN-LAST:event_studentIdActionPerformed

    private void trascriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trascriptActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_trascriptActionPerformed

    private void editStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editStudentActionPerformed

    private void beackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beackActionPerformed
        // TODO add your handling code here:
        new Student_Information().setVisible(true);
        dispose();
    }//GEN-LAST:event_beackActionPerformed

    private void roll1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_roll1KeyReleased
        // TODO add your handling code here:

        try {
            model.setRowCount(0);
            statement = (Statement) con.createStatement();
            String query = "SELECT * FROM schooldatabase.allstudent  where role=" + roll1.getText();
            result = statement.executeQuery(query);

            while (result.next()) {

                model.addRow(new Object[]{result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(7), result.getString(9), result.getString(10), result.getString(8)});
                table.setModel(model);
                
                // center the table heder
                TableCellRenderer rendererFromHeader = table.getTableHeader().getDefaultRenderer();
                JLabel headerLabel = (JLabel) rendererFromHeader;
                headerLabel.setHorizontalAlignment(JLabel.CENTER);
                
                //Center table cell value
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(JLabel.CENTER);
                table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
                table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
                table.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
                table.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
                table.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
            
                //set the column width
                table.getColumnModel().getColumn(0).setPreferredWidth(5);
                table.getColumnModel().getColumn(1).setPreferredWidth(10);
                table.getColumnModel().getColumn(2).setPreferredWidth(25);
                table.getColumnModel().getColumn(3).setPreferredWidth(80);
                table.getColumnModel().getColumn(4).setPreferredWidth(15);
                table.getColumnModel().getColumn(5).setPreferredWidth(30);
                table.getColumnModel().getColumn(6).setPreferredWidth(140);
                table.getColumnModel().getColumn(7).setPreferredWidth(30);
                DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
                cellRenderer.setHorizontalAlignment(JLabel.CENTER);
                table.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_roll1KeyReleased

    private void claseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claseActionPerformed

    private void shiftItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_shiftItemStateChanged
        // TODO add your handling code here:
        try {
            model.setRowCount(0);
            statement = (Statement) con.createStatement();
            String query = "SELECT* FROM schooldatabase." + clase.getSelectedItem() + "_" + shift.getSelectedItem();
            result = statement.executeQuery(query);

            while (result.next()) {

                model.addRow(new Object[]{result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(7), result.getString(9), result.getString(10), result.getString(8)});
                table.setModel(model);
                
                // center the table heder
                TableCellRenderer rendererFromHeader = table.getTableHeader().getDefaultRenderer();
                JLabel headerLabel = (JLabel) rendererFromHeader;
                headerLabel.setHorizontalAlignment(JLabel.CENTER);
                
                //Center table cell value
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(JLabel.CENTER);
                table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
                table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
                table.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
                table.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
                table.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
                
                //set the column width
                table.getColumnModel().getColumn(0).setPreferredWidth(5);
                table.getColumnModel().getColumn(1).setPreferredWidth(10);
                table.getColumnModel().getColumn(2).setPreferredWidth(25);
                table.getColumnModel().getColumn(3).setPreferredWidth(80);
                table.getColumnModel().getColumn(4).setPreferredWidth(15);
                table.getColumnModel().getColumn(5).setPreferredWidth(30);
                table.getColumnModel().getColumn(6).setPreferredWidth(140);
                table.getColumnModel().getColumn(7).setPreferredWidth(30);
                DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
                cellRenderer.setHorizontalAlignment(JLabel.CENTER);
                table.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);

            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_shiftItemStateChanged

    private void home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home1ActionPerformed
        // TODO add your handling code here:
         new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_home1ActionPerformed

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
            java.util.logging.Logger.getLogger(searchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            new searchStudent().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteSutdent;
    private javax.swing.JButton addNewStudent;
    private javax.swing.JButton beack;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> clase;
    private javax.swing.JButton editStudent;
    private javax.swing.JButton home1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton logout;
    private javax.swing.JButton print;
    private javax.swing.JTextField roll1;
    private javax.swing.JComboBox<String> shift;
    private javax.swing.JButton studentId;
    private javax.swing.JTable table;
    private javax.swing.JButton trascript;
    // End of variables declaration//GEN-END:variables

}
