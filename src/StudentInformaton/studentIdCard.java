package StudentInformaton;

import HomeAndLogin.Home;
import HomeAndLogin.Login;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class studentIdCard extends javax.swing.JFrame {

    ResultSet result, numberOfRow;
    Connection con;
    Statement statement;
    DefaultTableModel model = new DefaultTableModel();
    ImageIcon myimage;
    String imagepath;
    String imagePaths;
    byte[] image;

    public studentIdCard() {

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

    public PageFormat getPageFormat(PrinterJob pj) {

        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();

        double middleHeight = 8.0;
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
                    font15.setFont(new Font("Monospaced", Font.BOLD, 2));
                    font15.drawString("          SATIRPARA PRIMARY SCHOOL  ", 12, y);
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
                    g2d.drawString("      Roll              : " + rolls.getText() + "               ", 10, y);
                    y += yShift;
                    g2d.drawString("      Class             : " + classs.getText() + "      ", 10, y);
                    y += yShift;
                    g2d.drawString("      Shift             : " + shifts.getText() + "      ", 10, y);
                    y += yShift;
                    g2d.drawString("      Student Name      : " + name.getText() + "               ", 10, y);
                    y += yShift;
                    g2d.drawString("      Mobile No         : " + mobile.getText() + "       ", 10, y);
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
        name.setText("");
        fname.setText("");

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
        issueTranscript = new javax.swing.JButton();
        search = new javax.swing.JButton();
        home = new javax.swing.JButton();
        beack = new javax.swing.JButton();
        editStudent = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        rolls = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        panelId = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        classs = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        shifts = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        roll = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        mobile = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        printId = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Prograsive Kindergarten");
        setPreferredSize(new java.awt.Dimension(1050, 600));

        jLabel1.setBackground(new java.awt.Color(186, 253, 186));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Studetn ID Card ");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51)));
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

        issueTranscript.setBackground(new java.awt.Color(204, 204, 204));
        issueTranscript.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        issueTranscript.setText("Issue Transcript");
        issueTranscript.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        issueTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueTranscriptActionPerformed(evt);
            }
        });

        search.setBackground(new java.awt.Color(204, 204, 204));
        search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        search.setText("Search studenst");
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
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

        editStudent.setBackground(new java.awt.Color(204, 204, 204));
        editStudent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        editStudent.setText("Edit Students Info");
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
                    .addComponent(addNewStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(DeleteSutdent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(issueTranscript, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(beack, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(addNewStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteSutdent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(issueTranscript)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search)
                .addGap(0, 294, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Role Number   :");

        rolls.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        rolls.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rolls.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rollsKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(rolls, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rolls, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        panelId.setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setText("Student Name :-");

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 51));
        jLabel8.setText("SATIRPARA PRIMARY SCHOOL");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Satripara, Bijoynagar, Brahmanbaria");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("STUDENT ID CARD");

        jLabel17.setText("Father Name :-");

        jLabel21.setText("Class :-");

        jLabel23.setText("Shift :-");

        jLabel25.setText("Roll :-");

        jLabel27.setText("Mobile :-");

        jLabel29.setText("PHOTO");

        jLabel30.setText("Address :-");

        jLabel32.setText("Signaturel");

        javax.swing.GroupLayout panelIdLayout = new javax.swing.GroupLayout(panelId);
        panelId.setLayout(panelIdLayout);
        panelIdLayout.setHorizontalGroup(
            panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdLayout.createSequentialGroup()
                .addGroup(panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIdLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelIdLayout.createSequentialGroup()
                        .addGroup(panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelIdLayout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(classs, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelIdLayout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(roll, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelIdLayout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panelIdLayout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelIdLayout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel29)
                                            .addGap(319, 324, Short.MAX_VALUE))
                                        .addGroup(panelIdLayout.createSequentialGroup()
                                            .addGroup(panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(panelIdLayout.createSequentialGroup()
                                                    .addGap(129, 129, 129)
                                                    .addGroup(panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel17))))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(panelIdLayout.createSequentialGroup()
                                            .addComponent(jLabel30)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(panelIdLayout.createSequentialGroup()
                                    .addGap(185, 185, 185)
                                    .addComponent(jLabel23)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(shifts, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIdLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addGap(66, 66, 66))
        );
        panelIdLayout.setVerticalGroup(
            panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIdLayout.createSequentialGroup()
                        .addGroup(panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classs, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shifts, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roll, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jLabel32)
                .addContainerGap())
        );

        printId.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        printId.setText("Print ID");
        printId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(panelId, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(printId)
                        .addGap(293, 293, 293))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(panelId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(printId)
                .addGap(43, 43, 43))
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
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    }    public static void m2() {

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

    private void issueTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueTranscriptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_issueTranscriptActionPerformed

    private void printIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printIdActionPerformed
        // TODO add your handling code here:

        try {
            Toolkit tkp = panelId.getToolkit();
            PrintJob pjp = tkp.getPrintJob(this, null, null);
            Graphics g = pjp.getGraphics();
            panelId.print(g);
            g.dispose();
            pjp.end();

        } catch (Exception e) {
        }

    }//GEN-LAST:event_printIdActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        new searchStudent().setVisible(true);
        dispose();
    }//GEN-LAST:event_searchActionPerformed

    private void rollsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rollsKeyReleased
        // TODO add your handling code here:
         try {
            model.setRowCount(0);

            
            if (rolls.getText().length()==3) {
                
                statement = (Statement) con.createStatement();
                String query = "SELECT * FROM schooldatabase.allstudent where role =" + rolls.getText();
                result = statement.executeQuery(query);
                result.next();
                rolls.setText(result.getString(1));
                name.setText(result.getString(4));
                fname.setText(result.getString(5));
                classs.setText(result.getString(2));
                shifts.setText(result.getString(3));
                roll.setText(rolls.getText());
                address.setText(result.getString(10));
                mobile.setText(result.getString(9));
                String p = result.getString(13);
                imageLabel.setIcon(seticon(p, null));

            }

        } catch (SQLException e) {
            String s = e.toString();
            String[] ss = s.split(" ");

            if ("empty".equals(ss[4])) {
                JOptionPane.showMessageDialog(null, "Role does not exist");
            }

        }
    }//GEN-LAST:event_rollsKeyReleased

    private void editStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStudentActionPerformed
        // TODO add your handling code here:
        new UpdateStudentInformation().setVisible(true);
        dispose();
    }//GEN-LAST:event_editStudentActionPerformed

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
            java.util.logging.Logger.getLogger(studentIdCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new studentIdCard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteSutdent;
    private javax.swing.JButton addNewStudent;
    private javax.swing.JLabel address;
    private javax.swing.JButton beack;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel classs;
    private javax.swing.JButton editStudent;
    private javax.swing.JLabel fname;
    private javax.swing.JButton home;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JButton issueTranscript;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton logout;
    private javax.swing.JLabel mobile;
    private javax.swing.JLabel name;
    private javax.swing.JPanel panelId;
    private javax.swing.JButton printId;
    private javax.swing.JLabel roll;
    private javax.swing.JTextField rolls;
    private javax.swing.JButton search;
    private javax.swing.JLabel shifts;
    // End of variables declaration//GEN-END:variables

}
