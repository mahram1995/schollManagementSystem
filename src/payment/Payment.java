package payment;

import StudentInformaton.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import HomeAndLogin.Home;
import HomeAndLogin.Login;
import java.awt.Color;



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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import result.AcademicTranscript;
import result.reultInfo;
import teacherEmployes.Teacher_information;

public class Payment extends javax.swing.JFrame {

    ResultSet result, numberOfRow;
    Connection con;
    Statement statement;
    DefaultTableModel model = new DefaultTableModel();
    ImageIcon myimage;
    String imagepath;
    String imagePaths;
    byte[] image;
    List<payment_item> plist;

    public Payment() {

        initComponents();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldatabase", "root", "6660052");
        } catch (SQLException ex) {

        }

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
                    int y = 15;
                    int yShift = 15;
                    int headerRectHeight = 15;

                    // get gender and religion
                    ///////////////// Product price Get ///////////
                    font15.setFont(new Font("Monospaced", Font.BOLD, 23));
                    font15.drawString("           Progresive Kindergarten  ", 12, y);
                    g2d.setFont(new Font("Monospaced", Font.PLAIN, 12));
                    y += yShift;
                    g2d.drawString("                         Satirpara, Bijoynagar, Brahmanbaria           ", 10, y);
                    y += yShift;
                    g2d.drawString("                                                                        ", 10, y);
                    y += headerRectHeight;

                    g2d.setFont(new Font("Monospaced", Font.BOLD, 16));
                    g2d.drawString("                  Pyment Boucher                          ", 10, y);
                    y += yShift;
                    g2d.drawString("                                                                         ", 10, y);
                    y += headerRectHeight;

                    g2d.setFont(new Font("Monospaced", Font.PLAIN, 12));
                    g2d.drawString("      Roll              : " + roll.getText() + "               ", 10, y);
                    y += yShift;
                    g2d.drawString("      Class             : " + classe.getText() + "      ", 10, y);
                    y += yShift;
                    g2d.drawString("      Shift             : " + shift.getText() + "      ", 10, y);
                    y += yShift;
                    g2d.drawString("      Student Name      : " + name.getText() + "               ", 10, y);
                    y += yShift;
                    g2d.drawString("      Mobile No         : " + mobileNumber.getText() + "       ", 10, y);
                    y += yShift;
                    g2d.drawString("      -----------------------------------------------------------------", 10, y);
                    y += yShift;
                    g2d.drawString("      01. " + item1.getSelectedItem() + "                   " + amount1.getText(), 10, y);
                    y += yShift;
                    g2d.drawString("      02. " + item2.getSelectedItem() + "                   " + amount2.getText(), 10, y);
                    y += yShift;
                    g2d.drawString("      03. " + item3.getSelectedItem() + "                   " + amount3.getText(), 10, y);
                    y += yShift;
                    g2d.drawString("      04. " + item4.getSelectedItem() + "                   " + amount4.getText(), 10, y);
                    y += yShift;
                    g2d.drawString("                                       Total.               " + total.getText(), 10, y);
                    y += yShift;

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

        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();

        mobileNumber.setText("");

    }
    int Totals = 0;
    int temp1 = 0;
    int temp2 = 0;
    int temp3 = 0;
    int temp4 = 0;
    int temp5 = 0;
    int temp6 = 0;
    int temp7 = 0;
    int temp8 = 0;

    public int totalNumber(int number, String itemname) {

        String SubjectName = itemname;
        if ("item1".equals(SubjectName)) {
            Totals = Totals + number - temp1;
            temp1 = number;
        }
        if ("item2".equals(SubjectName)) {
            Totals = Totals + number - temp2;
            temp2 = number;
        }
        if ("item3".equals(SubjectName)) {
            Totals = Totals + number - temp3;
            temp3 = number;
        }
        if ("item4".equals(SubjectName)) {
            Totals = Totals + number - temp4;
            temp4 = number;
        }
        if ("item5".equals(SubjectName)) {
            Totals = Totals + number - temp5;
            temp5 = number;
        }
        if ("item6".equals(SubjectName)) {
            Totals = Totals + number - temp6;
            temp6 = number;
        }
        if ("item7".equals(SubjectName)) {
            Totals = Totals + number - temp7;
            temp7 = number;
        }
        if ("item8".equals(SubjectName)) {
            Totals = Totals + number - temp8;
            temp8 = number;
        }

        return Totals;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        teacher = new javax.swing.JButton();
        Student = new javax.swing.JButton();
        results = new javax.swing.JButton();
        Transcript = new javax.swing.JButton();
        home = new javax.swing.JButton();
        beck = new javax.swing.JButton();
        pyments = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        roll = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        voucher = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        mobileNumber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        shift = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        classe = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        item1 = new javax.swing.JComboBox<>();
        amount1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        item2 = new javax.swing.JComboBox<>();
        amount2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        item3 = new javax.swing.JComboBox<>();
        amount3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        item4 = new javax.swing.JComboBox<>();
        amount4 = new javax.swing.JTextField();
        item5 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        amount5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        item6 = new javax.swing.JComboBox<>();
        amount6 = new javax.swing.JTextField();
        item7 = new javax.swing.JComboBox<>();
        amount7 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        item8 = new javax.swing.JComboBox<>();
        jTextField8 = new javax.swing.JTextField();
        amount8 = new javax.swing.JTextField();
        ssss = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("School Management System");
        setPreferredSize(new java.awt.Dimension(1050, 600));

        jLabel1.setBackground(new java.awt.Color(183, 253, 183));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Payment System");
        jLabel1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        teacher.setBackground(new java.awt.Color(204, 204, 204));
        teacher.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        teacher.setText("Teacher & Employee");
        teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherActionPerformed(evt);
            }
        });

        Student.setBackground(new java.awt.Color(204, 204, 204));
        Student.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Student.setText("Students");
        Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentActionPerformed(evt);
            }
        });

        results.setBackground(new java.awt.Color(204, 204, 204));
        results.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        results.setText("Result ");
        results.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultsActionPerformed(evt);
            }
        });

        Transcript.setBackground(new java.awt.Color(204, 204, 204));
        Transcript.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Transcript.setText("Academic Transcript");
        Transcript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TranscriptActionPerformed(evt);
            }
        });

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.jpg"))); // NOI18N
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        beck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/beack icon.jpg"))); // NOI18N

        pyments.setBackground(new java.awt.Color(204, 204, 204));
        pyments.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pyments.setText("Payment & Fees");
        pyments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pymentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(results, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Transcript, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(beck, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pyments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beck, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(teacher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Student)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(results)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Transcript)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pyments)
                .addGap(0, 268, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Roll Number     :");

        roll.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        roll.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        roll.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rollKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Voucher No.");

        voucher.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        voucher.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        voucher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                voucherKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roll, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(voucher, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(voucher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(roll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Student Name   :");

        name.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        mobileNumber.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Phone number   :");

        save.setBackground(new java.awt.Color(153, 255, 153));
        save.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        save.setText("Save & Print");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Class               :");

        shift.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Shift  :");

        classe.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("01");

        item1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        item1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    " }));
        item1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                item1ItemStateChanged(evt);
            }
        });

        amount1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        amount1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("02");

        item2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        item2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    " }));
        item2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                item2ItemStateChanged(evt);
            }
        });

        amount2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        amount2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("03");

        item3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        item3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    " }));
        item3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                item3ItemStateChanged(evt);
            }
        });

        amount3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        amount3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("04");

        item4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        item4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    " }));
        item4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                item4ItemStateChanged(evt);
            }
        });

        amount4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        amount4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        item5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        item5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    " }));
        item5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                item5ItemStateChanged(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("05");

        amount5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        amount5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("06");

        item6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        item6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    " }));
        item6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                item6ItemStateChanged(evt);
            }
        });

        amount6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        amount6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        item7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        item7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    " }));
        item7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                item7ItemStateChanged(evt);
            }
        });

        amount7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        amount7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("07");

        item8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        item8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    " }));
        item8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                item8ItemStateChanged(evt);
            }
        });

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("08");

        amount8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        amount8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ssss.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ssss.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ssss.setText("Total :");

        total.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        total.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        clear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        clear.setText("clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(7, 7, 7)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(classe, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(item1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(amount1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(amount2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(amount3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(item4, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(amount4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(item5, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(amount5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(item6, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(amount6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(item7, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(amount7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(item8, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(amount8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(129, 129, 129)
                                        .addComponent(ssss, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(classe, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mobileNumber, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(item1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(amount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(amount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(amount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(item4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(amount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(item5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(amount5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(item6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(amount6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(item7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(amount7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(item8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amount8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ssss))))
                .addContainerGap(22, Short.MAX_VALUE))
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // code for clear all field after save data succesfully
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(roll.getText()+".pdf"));
           
             
            document.open();
            Paragraph SchoolNmae = new Paragraph("Progresive Kindergarten");

            SchoolNmae.setAlignment(Element.ALIGN_CENTER);
            document.add(SchoolNmae);
            
            // set school address
            Paragraph address = new Paragraph("Satirpara, Bijoynagar, Brahmanbaria");
            address.setAlignment(Element.ALIGN_CENTER);
            document.add(address);
            document.add(new Paragraph("             "));
            document.add(new Paragraph("                  Roll                   : " + roll.getText()));
            document.add(new Paragraph("                  Class                : "+classe.getText()));
            document.add(new Paragraph("                  Shift                  : "+shift.getText()));
            document.add(new Paragraph("                  Student name   : "+name.getText()));
            document.add(new Paragraph("                  Mobile Number : "+mobileNumber.getText()));
            
            
            document.add(new Paragraph("             "));
            // set colum width
            float colum[] = {50f, 300f, 50f};

            // creat table
            PdfPTable table = new PdfPTable(colum);

            // create column name
            PdfPCell c1 = new PdfPCell(new Paragraph("Serial"));
            PdfPCell c2 = new PdfPCell(new Paragraph("Item"));
            PdfPCell c3 = new PdfPCell(new Paragraph("Amount"));
            PdfPCell c4 = new PdfPCell(new Paragraph("Total"));
            PdfPCell c5 = new PdfPCell(new Paragraph(total.getText()));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            c2.setHorizontalAlignment(Element.ALIGN_CENTER);
            c3.setHorizontalAlignment(Element.ALIGN_CENTER);
            c4.setHorizontalAlignment(Element.ALIGN_CENTER);
            c5.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            table.addCell(c1);
            table.addCell(c2);
            table.addCell(c3); 

            
           
            
            c1 = new PdfPCell(new Paragraph("01"));
            c2 = new PdfPCell(new Paragraph(String.valueOf(item1.getSelectedItem())));
            c3 = new PdfPCell(new Paragraph(amount1.getText()));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            c3.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            table.addCell(c2);
            table.addCell(c3);

            c1 = new PdfPCell(new Paragraph("02"));
            c2 = new PdfPCell(new Paragraph(String.valueOf(item2.getSelectedItem())));
            c3 = new PdfPCell(new Paragraph(amount2.getText()));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            c3.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            table.addCell(c2);
            table.addCell(c3);

            c1 = new PdfPCell(new Paragraph("03"));
            c2 = new PdfPCell(new Paragraph(String.valueOf(item3.getSelectedItem())));
            c3 = new PdfPCell(new Paragraph(amount3.getText()));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            c3.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            table.addCell(c2);
            table.addCell(c3);

            c1 = new PdfPCell(new Paragraph("04"));
            c2 = new PdfPCell(new Paragraph(String.valueOf(item4.getSelectedItem())));
            c3 = new PdfPCell(new Paragraph(amount4.getText()));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            c3.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            table.addCell(c2);
            table.addCell(c3);

            c1 = new PdfPCell(new Paragraph("05"));
            c2 = new PdfPCell(new Paragraph(String.valueOf(item5.getSelectedItem())));
            c3 = new PdfPCell(new Paragraph(amount5.getText()));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            c3.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            table.addCell(c2);
            table.addCell(c3);

            c1 = new PdfPCell(new Paragraph("06"));
            c2 = new PdfPCell(new Paragraph(String.valueOf(item6.getSelectedItem())));
            c3 = new PdfPCell(new Paragraph(amount6.getText()));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            c3.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            table.addCell(c2);
            table.addCell(c3);

            c1 = new PdfPCell(new Paragraph("07"));
            c2 = new PdfPCell(new Paragraph(String.valueOf(item7.getSelectedItem())));
            c3 = new PdfPCell(new Paragraph(amount7.getText()));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            c3.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            table.addCell(c2);
            table.addCell(c3);

            c1 = new PdfPCell(new Paragraph("08"));
            c2 = new PdfPCell(new Paragraph(String.valueOf(item8.getSelectedItem())));
            c3 = new PdfPCell(new Paragraph(amount8.getText()));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            c3.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            table.addCell(c2);
            table.addCell(c3);

            c4.setColspan(2);
            table.addCell(c4);
            table.addCell(c5);
            document.add(table);
            document.add(new Paragraph("         "));
            document.add(new Paragraph("         "));
            document.add(new Paragraph("         "));
            document.add(new Paragraph("         "));
            document.add(new Paragraph("         "));
            document.add(new Paragraph("         "));
            document.add(new Paragraph("         "));
            document.add(new Paragraph("         "));
            document.add(new Paragraph("         "));
            document.add(new Paragraph("                                                                                                             Authority"));

            document.close();

        } catch (DocumentException | FileNotFoundException e) {
        }
    }//GEN-LAST:event_saveActionPerformed
   
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
    private void itemChange(int r) {
        int R = r;

        if (R < 200 & R > 100) {

            plist = new ArrayList<>();
            plist.add(new payment_item("Admission Fee", 500));
            plist.add(new payment_item("Tuition Fee", 300));
            plist.add(new payment_item("Institute Development Fee", 300));
            plist.add(new payment_item("Examination Fee", 300));
            plist.add(new payment_item("Test exam Fee", 50));
            plist.add(new payment_item("Library  Fee", 20));
            plist.add(new payment_item("Sports  Fee", 20));
            plist.add(new payment_item("Medical insurance Fee", 20));
            plist.add(new payment_item("ID Card Fee", 150));

            for (int i = 0; i < plist.size(); i++) {
                item1.addItem(plist.get(i).getItem());
                item2.addItem(plist.get(i).getItem());
                item3.addItem(plist.get(i).getItem());
                item4.addItem(plist.get(i).getItem());
                item5.addItem(plist.get(i).getItem());
                item6.addItem(plist.get(i).getItem());
                item7.addItem(plist.get(i).getItem());
                item8.addItem(plist.get(i).getItem());
            }

        } else if (R < 300 & R > 200) {
            plist = new ArrayList<>();
            plist.add(new payment_item("Admission Fee", 700));
            plist.add(new payment_item("Tuition Fee", 450));
            plist.add(new payment_item("Institute Development Fee", 300));
            plist.add(new payment_item("Examination Fee", 350));
            plist.add(new payment_item("Test exam Fee", 70));
            plist.add(new payment_item("Library  Fee", 20));
            plist.add(new payment_item("Sports  Fee", 20));
            plist.add(new payment_item("Medical insurance Fee", 20));
            plist.add(new payment_item("ID Card Fee", 150));
            for (int i = 0; i < plist.size(); i++) {
                item1.addItem(plist.get(i).getItem());
                item2.addItem(plist.get(i).getItem());
                item3.addItem(plist.get(i).getItem());
                item4.addItem(plist.get(i).getItem());
                item5.addItem(plist.get(i).getItem());
                item6.addItem(plist.get(i).getItem());
                item7.addItem(plist.get(i).getItem());
                item8.addItem(plist.get(i).getItem());
            }
        } else if (R < 400 & R > 300) {
            plist = new ArrayList<>();
            plist.add(new payment_item("Admission Fee", 900));
            plist.add(new payment_item("Tuition Fee", 500));
            plist.add(new payment_item("Institute Development Fee", 300));
            plist.add(new payment_item("Examination Fee", 400));
            plist.add(new payment_item("Test exam Fee", 90));
            plist.add(new payment_item("Library  Fee", 20));
            plist.add(new payment_item("Sports  Fee", 20));
            plist.add(new payment_item("Medical insurance Fee", 20));
            plist.add(new payment_item("ID Card Fee", 150));
            for (int i = 0; i < plist.size(); i++) {
                item1.addItem(plist.get(i).getItem());
                item2.addItem(plist.get(i).getItem());
                item3.addItem(plist.get(i).getItem());
                item4.addItem(plist.get(i).getItem());
                item5.addItem(plist.get(i).getItem());
                item6.addItem(plist.get(i).getItem());
                item7.addItem(plist.get(i).getItem());
                item8.addItem(plist.get(i).getItem());
            }
        } else if (R < 500 & R > 400) {
            plist = new ArrayList<>();
            plist.add(new payment_item("Admission Fee", 1100));
            plist.add(new payment_item("Tuition Fee", 600));
            plist.add(new payment_item("Institute Development Fee", 300));
            plist.add(new payment_item("Examination Fee", 450));
            plist.add(new payment_item("Test exam Fee", 110));
            plist.add(new payment_item("Library  Fee", 20));
            plist.add(new payment_item("Sports  Fee", 20));
            plist.add(new payment_item("Medical insurance Fee", 20));
            plist.add(new payment_item("ID Card Fee", 150));
            for (int i = 0; i < plist.size(); i++) {
                item1.addItem(plist.get(i).getItem());
                item2.addItem(plist.get(i).getItem());
                item3.addItem(plist.get(i).getItem());
                item4.addItem(plist.get(i).getItem());
                item5.addItem(plist.get(i).getItem());
                item6.addItem(plist.get(i).getItem());
                item7.addItem(plist.get(i).getItem());
                item8.addItem(plist.get(i).getItem());
            }
        } else if (R < 600 & R > 500) {
            plist = new ArrayList<>();
            plist.add(new payment_item("Admission Fee", 1300));
            plist.add(new payment_item("Tuition Fee", 700));
            plist.add(new payment_item("Institute Development Fee", 300));
            plist.add(new payment_item("Examination Fee", 500));
            plist.add(new payment_item("Test exam Fee", 150));
            plist.add(new payment_item("Library  Fee", 20));
            plist.add(new payment_item("Sports  Fee", 20));
            plist.add(new payment_item("Medical insurance Fee", 20));
            plist.add(new payment_item("ID Card Fee", 150));
            for (int i = 0; i < plist.size(); i++) {
                item1.addItem(plist.get(i).getItem());
                item2.addItem(plist.get(i).getItem());
                item3.addItem(plist.get(i).getItem());
                item4.addItem(plist.get(i).getItem());
                item5.addItem(plist.get(i).getItem());
                item6.addItem(plist.get(i).getItem());
                item7.addItem(plist.get(i).getItem());
                item8.addItem(plist.get(i).getItem());
            }
        }
    }
    private void rollKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rollKeyReleased
        // TODO add your handling code here:
        try {
            String Roll = roll.getText();

            if (Roll.length() == 3) {

                statement = (Statement) con.createStatement();
                String query = "SELECT * FROM schooldatabase.allstudent where role =" + roll.getText();
                result = statement.executeQuery(query);
                result.next();

                roll.setText(result.getString(1));
                classe.setText(result.getString(2));
                shift.setText(result.getString(3));
                name.setText(result.getString(4));
                mobileNumber.setText(result.getString(9));
                int R = Integer.parseInt(result.getString(1));
                itemChange(R);

            }

        } catch (SQLException e) {
            String s = e.toString();
            String[] ss = s.split(" ");

            if ("empty".equals(ss[4])) {
                JOptionPane.showMessageDialog(null, "Role does not exist");
            }

        }
    }//GEN-LAST:event_rollKeyReleased

    private void voucherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_voucherKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_voucherKeyReleased

    private void item1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_item1ItemStateChanged
        // TODO add your handling code here:
        try {
            amount1.setText(String.valueOf(plist.get(item1.getSelectedIndex() - 1).amount));

            int amount = Integer.parseInt((String.valueOf(plist.get(item1.getSelectedIndex() - 1).amount)));
            int totals = totalNumber(amount, "item1");
            total.setText(String.valueOf(totals));

        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_item1ItemStateChanged

    private void item2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_item2ItemStateChanged
        // TODO add your handling code here:
        amount2.setText(String.valueOf(plist.get(item2.getSelectedIndex() - 1).amount));
        int amount = Integer.parseInt((String.valueOf(plist.get(item2.getSelectedIndex() - 1).amount)));
        int totals = totalNumber(amount, "item2");
        total.setText(String.valueOf(totals));
    }//GEN-LAST:event_item2ItemStateChanged

    private void item3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_item3ItemStateChanged
        // TODO add your handling code here:
        amount3.setText(String.valueOf(plist.get(item3.getSelectedIndex()).amount));
        int amount = Integer.parseInt((String.valueOf(plist.get(item3.getSelectedIndex()).amount)));
        int totals = totalNumber(amount, "item3");
        total.setText(String.valueOf(totals));
    }//GEN-LAST:event_item3ItemStateChanged

    private void item4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_item4ItemStateChanged
        // TODO add your handling code here:
        amount4.setText(String.valueOf(plist.get(item4.getSelectedIndex()).amount));
        int amount = Integer.parseInt((String.valueOf(plist.get(item4.getSelectedIndex()).amount)));
        int totals = totalNumber(amount, "item4");
        total.setText(String.valueOf(totals));
    }//GEN-LAST:event_item4ItemStateChanged

    private void item5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_item5ItemStateChanged

        amount5.setText(String.valueOf(plist.get(item5.getSelectedIndex()).amount));
        int amount = Integer.parseInt((String.valueOf(plist.get(item5.getSelectedIndex()).amount)));
        int totals = totalNumber(amount, "item5");
        total.setText(String.valueOf(totals));
    }//GEN-LAST:event_item5ItemStateChanged

    private void item6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_item6ItemStateChanged

        // TODO add your handling code here:
        amount6.setText(String.valueOf(plist.get(item6.getSelectedIndex()).amount));
        int amount = Integer.parseInt((String.valueOf(plist.get(item6.getSelectedIndex()).amount)));
        int totals = totalNumber(amount, "item6");
        total.setText(String.valueOf(totals));
    }//GEN-LAST:event_item6ItemStateChanged

    private void item7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_item7ItemStateChanged
        // TODO add your handling code here:
        amount7.setText(String.valueOf(plist.get(item7.getSelectedIndex()).amount));
        int amount = Integer.parseInt((String.valueOf(plist.get(item7.getSelectedIndex()).amount)));
        int totals = totalNumber(amount, "item7");
        total.setText(String.valueOf(totals));
    }//GEN-LAST:event_item7ItemStateChanged

    private void item8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_item8ItemStateChanged
        // TODO add your handling code here:
        amount8.setText(String.valueOf(plist.get(item8.getSelectedIndex()).amount));
        int amount = Integer.parseInt((String.valueOf(plist.get(item8.getSelectedIndex()).amount)));
        int totals = totalNumber(amount, "item8");
        total.setText(String.valueOf(totals));
    }//GEN-LAST:event_item8ItemStateChanged

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:

        new Payment().setVisible(true);
        dispose();

    }//GEN-LAST:event_clearActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void pymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pymentsActionPerformed
        // TODO add your handling code here:
        new Payment().setVisible(true);
        
        dispose();
    }//GEN-LAST:event_pymentsActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            new Payment().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Student;
    private javax.swing.JButton Transcript;
    private javax.swing.JTextField amount1;
    private javax.swing.JTextField amount2;
    private javax.swing.JTextField amount3;
    private javax.swing.JTextField amount4;
    private javax.swing.JTextField amount5;
    private javax.swing.JTextField amount6;
    private javax.swing.JTextField amount7;
    private javax.swing.JTextField amount8;
    private javax.swing.JButton beck;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField classe;
    private javax.swing.JButton clear;
    private javax.swing.JButton home;
    private javax.swing.JComboBox<String> item1;
    private javax.swing.JComboBox<String> item2;
    private javax.swing.JComboBox<String> item3;
    private javax.swing.JComboBox<String> item4;
    private javax.swing.JComboBox<String> item5;
    private javax.swing.JComboBox<String> item6;
    private javax.swing.JComboBox<String> item7;
    private javax.swing.JComboBox<String> item8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton logout;
    private javax.swing.JTextField mobileNumber;
    private javax.swing.JTextField name;
    private javax.swing.JButton pyments;
    private javax.swing.JButton results;
    private javax.swing.JTextField roll;
    private javax.swing.JButton save;
    private javax.swing.JTextField shift;
    private javax.swing.JLabel ssss;
    private javax.swing.JButton teacher;
    private javax.swing.JTextField total;
    private javax.swing.JTextField voucher;
    // End of variables declaration//GEN-END:variables

}
