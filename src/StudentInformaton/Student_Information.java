/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentInformaton;

import HomeAndLogin.Home;
import HomeAndLogin.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import payment.Payment;
import result.AcademicTranscript;
import result.reultInfo;
import teacherEmployes.Teacher_information;

/**
 *
 * @author mahram
 */
public final class Student_Information extends javax.swing.JFrame {

    /**
     * Creates new form student_information
     */
    ResultSet result, numberOfRow;
    Connection con;
    Statement statement;
    public Student_Information() {
         try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldatabase", "root", "6660052");
        } catch (SQLException ex) {

        }
        
        initComponents();
        classOneStudentDisply();
        classTwoStudentDisply();
        classThreeStudentDisply();
        classFourStudentDisply();
        classFiveStudentDisply();
        totalStudent();
    }
    
    public void classOneStudentDisply(){
    try {

            statement = (Statement) con.createStatement();
            
            // set one mornig student number
            String query = "SELECT COUNT(role) FROM schooldatabase.one_morning where gender=\"male\"";
            result = statement.executeQuery(query);
            result.next();
            oneMorningMale.setText(String.valueOf(result.getInt(1)));
            int onemorningMale=result.getInt(1);
            
            String query4 = "SELECT COUNT(role) FROM schooldatabase.one_morning where gender=\"female\"";
            result = statement.executeQuery(query4);
            result.next();
            oneMorningFemale.setText(String.valueOf(result.getInt(1)));
            int onemorningFemale=result.getInt(1);
            
            // set one noon student number
            String query2 = "SELECT COUNT(role) FROM schooldatabase.one_afternoon where gender=\"male\"";
            result = statement.executeQuery(query2); 
            result.next();
            oneNoonMale.setText(String.valueOf(result.getInt(1)));
            int oneafternoonMale=result.getInt(1);
            
            String query5 = "SELECT COUNT(role) FROM schooldatabase.one_afternoon where gender=\"female\"";
            result = statement.executeQuery(query5);
            result.next();
            oneNoonFemale.setText(String.valueOf(result.getInt(1)));
            int oneafternoonFemale=result.getInt(1);
            
            // set one evening student number
            String query3 = "SELECT COUNT(role) FROM schooldatabase.one_evening where gender=\"male\"";
            result = statement.executeQuery(query3); 
            result.next();
            oneEveningMale.setText(String.valueOf(result.getInt(1)));
            int oneeveningMale=result.getInt(1);
            
            String query6 = "SELECT COUNT(role) FROM schooldatabase.one_evening where gender=\"female\"";
            result = statement.executeQuery(query6);
            result.next();
            oneEveningFemale.setText(String.valueOf(result.getInt(1)));
            int oneeveningFemale=result.getInt(1);
            
            int maleTotals=onemorningMale+oneafternoonMale+oneeveningMale;
            int femaleTotals=onemorningFemale+oneafternoonFemale+oneeveningFemale;
            oneMaleTotal.setText(String.valueOf(maleTotals));
            oneFemaleTotal.setText(String.valueOf(femaleTotals));
           // set one total student number
            oneTotal.setText(String.valueOf(maleTotals+femaleTotals));

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void classTwoStudentDisply(){
    try {

            statement = (Statement) con.createStatement();
            
            // set one mornig student number
            String query = "SELECT COUNT(role) FROM schooldatabase.two_morning where gender=\"male\"";
            result = statement.executeQuery(query);
            result.next();
            twoMorningMale.setText(String.valueOf(result.getInt(1)));
            int twomorningMale=result.getInt(1);
            
            String query4 = "SELECT COUNT(role) FROM schooldatabase.two_morning where gender=\"female\"";
            result = statement.executeQuery(query4);
            result.next();
            twoMorningFemale.setText(String.valueOf(result.getInt(1)));
            int twomorningFemale=result.getInt(1);
            
            // set one noon student number
            String query2 = "SELECT COUNT(role) FROM schooldatabase.two_afternoon where gender=\"male\"";
            result = statement.executeQuery(query2); 
            result.next();
            twoNoonMale.setText(String.valueOf(result.getInt(1)));
            int twoafternoonMale=result.getInt(1);
            
            String query5 = "SELECT COUNT(role) FROM schooldatabase.two_afternoon where gender=\"female\"";
            result = statement.executeQuery(query5);
            result.next();
            twoNoonFemale.setText(String.valueOf(result.getInt(1)));
            int twoafternoonFemale=result.getInt(1);
            
            // set one evening student number
            String query3 = "SELECT COUNT(role) FROM schooldatabase.two_evening where gender=\"male\"";
            result = statement.executeQuery(query3); 
            result.next();
            twoEveningMale.setText(String.valueOf(result.getInt(1)));
            int twoeveningMale=result.getInt(1);
            
            String query6 = "SELECT COUNT(role) FROM schooldatabase.two_evening where gender=\"female\"";
            result = statement.executeQuery(query6);
            result.next();
            twoEveningFemale.setText(String.valueOf(result.getInt(1)));
            int twoeveningFemale=result.getInt(1);
            
            int twomaleTotals=twomorningMale+twoafternoonMale+twoeveningMale;
            int twofemaleTotals=twomorningFemale+twoafternoonFemale+twoeveningFemale;
            twoMaleTotal.setText(String.valueOf(twomaleTotals));
            twoFemaleTotal.setText(String.valueOf(twofemaleTotals));
           // set one total student number
            twoTotal.setText(String.valueOf(twomaleTotals+twofemaleTotals));

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void classThreeStudentDisply(){
    try {

            statement = (Statement) con.createStatement();
            
            // set one mornig student number
            String query = "SELECT COUNT(role) FROM schooldatabase.three_morning where gender=\"male\"";
            result = statement.executeQuery(query);
            result.next();
            threeMorningMale.setText(String.valueOf(result.getInt(1)));
            int threemorningMale=result.getInt(1);
            
            String query4 = "SELECT COUNT(role) FROM schooldatabase.three_morning where gender=\"female\"";
            result = statement.executeQuery(query4);
            result.next();
            threeMorningFemale.setText(String.valueOf(result.getInt(1)));
            int threemorningFemale=result.getInt(1);
            
            // set one noon student number
            String query2 = "SELECT COUNT(role) FROM schooldatabase.three_afternoon where gender=\"male\"";
            result = statement.executeQuery(query2); 
            result.next();
            threeNoonMale.setText(String.valueOf(result.getInt(1)));
            int threeafternoonMale=result.getInt(1);
            
            String query5 = "SELECT COUNT(role) FROM schooldatabase.three_afternoon where gender=\"female\"";
            result = statement.executeQuery(query5);
            result.next();
            threeNoonFemale.setText(String.valueOf(result.getInt(1)));
            int threeafternoonFemale=result.getInt(1);
            
            // set one evening student number
            String query3 = "SELECT COUNT(role) FROM schooldatabase.three_evening where gender=\"male\"";
            result = statement.executeQuery(query3); 
            result.next();
            threeEveningMale.setText(String.valueOf(result.getInt(1)));
            int threeeveningMale=result.getInt(1);
            
            String query6 = "SELECT COUNT(role) FROM schooldatabase.three_evening where gender=\"female\"";
            result = statement.executeQuery(query6);
            result.next();
            threeEveningFemale.setText(String.valueOf(result.getInt(1)));
            int threeeveningFemale=result.getInt(1);
            
            int threemaleTotals=threemorningMale+threeafternoonMale+threeeveningMale;
            int threefemaleTotals=threemorningFemale+threeafternoonFemale+threeeveningFemale;
            threeMaleTotal.setText(String.valueOf(threemaleTotals));
            threeFemaleTotal.setText(String.valueOf(threefemaleTotals));
           // set one total student number
            threeTotal.setText(String.valueOf(threemaleTotals+threefemaleTotals));

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void classFourStudentDisply(){
    try {

            statement = (Statement) con.createStatement();
            
            // set one mornig student number
            String query = "SELECT COUNT(role) FROM schooldatabase.four_morning where gender=\"male\"";
            result = statement.executeQuery(query);
            result.next();
            fourMorningMale.setText(String.valueOf(result.getInt(1)));
            int fourmorningMale=result.getInt(1);
            
            String query4 = "SELECT COUNT(role) FROM schooldatabase.four_morning where gender=\"female\"";
            result = statement.executeQuery(query4);
            result.next();
            fourMorningFemale.setText(String.valueOf(result.getInt(1)));
            int fourmorningFemale=result.getInt(1);
            
            // set one noon student number
            String query2 = "SELECT COUNT(role) FROM schooldatabase.four_afternoon where gender=\"male\"";
            result = statement.executeQuery(query2); 
            result.next();
            fourNoonMale.setText(String.valueOf(result.getInt(1)));
            int fourafternoonMale=result.getInt(1);
           
            String query5 = "SELECT COUNT(role) FROM schooldatabase.four_afternoon where gender=\"female\"";
            result = statement.executeQuery(query5);
            result.next();
            fourNoonFemale.setText(String.valueOf(result.getInt(1)));
            int fourafternoonFemale=result.getInt(1);
            
            // set one evening student number
            String query3 = "SELECT COUNT(role) FROM schooldatabase.four_evening where gender=\"male\"";
            result = statement.executeQuery(query3); 
            result.next();
            fourEveningMale.setText(String.valueOf(result.getInt(1)));
            int foureveningMale=result.getInt(1);
            
            String query6 = "SELECT COUNT(role) FROM schooldatabase.four_evening where gender=\"female\"";
            result = statement.executeQuery(query6);
            result.next();
            fourEveningFemale.setText(String.valueOf(result.getInt(1)));
            int foureveningFemale=result.getInt(1);
            
            int fourmaleTotals=fourmorningMale+fourafternoonMale+foureveningMale;
            int fourfemaleTotals=fourmorningFemale+fourafternoonFemale+foureveningFemale;
            fourMaleTotal.setText(String.valueOf(fourmaleTotals));
            fourFemaleTotal.setText(String.valueOf(fourfemaleTotals));
           // set one total student number
            fourTotal.setText(String.valueOf(fourmaleTotals+fourfemaleTotals));

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void classFiveStudentDisply(){
    try {

            statement = (Statement) con.createStatement();
            
            // set one mornig student number
            String query = "SELECT COUNT(role) FROM schooldatabase.five_morning where gender=\"male\"";
            result = statement.executeQuery(query);
            result.next();
            fiveMorningMale.setText(String.valueOf(result.getInt(1)));
            int fivemorningMale=result.getInt(1);
            
            String query4 = "SELECT COUNT(role) FROM schooldatabase.five_morning where gender=\"female\"";
            result = statement.executeQuery(query4);
            result.next();
            fiveMorningFemale.setText(String.valueOf(result.getInt(1)));
            int fivemorningFemale=result.getInt(1);
            
            // set one noon student number
            String query2 = "SELECT COUNT(role) FROM schooldatabase.five_afternoon where gender=\"male\"";
            result = statement.executeQuery(query2); 
            result.next();
            fiveNoonMale.setText(String.valueOf(result.getInt(1)));
            int fiveafternoonMale=result.getInt(1);
            
            String query5 = "SELECT COUNT(role) FROM schooldatabase.five_afternoon where gender=\"female\"";
            result = statement.executeQuery(query5);
            result.next();
            fiveNoonFemale.setText(String.valueOf(result.getInt(1)));
            int fiveafternoonFemale=result.getInt(1);
            
            // set one evening student number
            String query3 = "SELECT COUNT(role) FROM schooldatabase.five_evening where gender=\"male\"";
            result = statement.executeQuery(query3); 
            result.next();
            fiveEveningMale.setText(String.valueOf(result.getInt(1)));
            int fiveeveningMale=result.getInt(1);
            
            String query6 = "SELECT COUNT(role) FROM schooldatabase.five_evening where gender=\"female\"";
            result = statement.executeQuery(query6);
            result.next();
            fiveEveningFemale.setText(String.valueOf(result.getInt(1)));
            int fiveeveningFemale=result.getInt(1);
            
            int fivemaleTotals=fivemorningMale+fiveafternoonMale+fiveeveningMale;
            int fivefemaleTotals=fivemorningFemale+fiveafternoonFemale+fiveeveningFemale;
            fiveMaleTotal.setText(String.valueOf(fivemaleTotals));
            fiveFemaleTotal.setText(String.valueOf(fivefemaleTotals));
           // set one total student number
            fiveTotal.setText(String.valueOf(fivemaleTotals+fivefemaleTotals));

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void totalStudent(){
        
           int oneMornigMaleStudent=Integer.parseInt(oneMorningMale.getText());
           int twoMornigMaleStudent=Integer.parseInt(twoMorningMale.getText());
           int threeMornigMaleStudent=Integer.parseInt(threeMorningMale.getText());
           int fourMornigMaleStudent=Integer.parseInt(fourMorningMale.getText());
           int fiveMornigMaleStudent=Integer.parseInt(fiveMorningMale.getText());
           int morngMaleTotalStudent=oneMornigMaleStudent+twoMornigMaleStudent+threeMornigMaleStudent+fourMornigMaleStudent+fiveMornigMaleStudent;
           mornigMaleTotal.setText(String.valueOf(morngMaleTotalStudent));
           
           int oneMornigFemaleStudent=Integer.parseInt(oneMorningFemale.getText());
           int twoMornigFemaleStudent=Integer.parseInt(twoMorningFemale.getText());
           int threeMornigFemaleStudent=Integer.parseInt(threeMorningFemale.getText());
           int fourMornigFemaleStudent=Integer.parseInt(fourMorningFemale.getText());
           int fiveMornigFemaleStudent=Integer.parseInt(fiveMorningFemale.getText());
           int morngFemaleTotalStudent=oneMornigFemaleStudent+twoMornigFemaleStudent+threeMornigFemaleStudent+fourMornigFemaleStudent+fiveMornigFemaleStudent;
           morningFemale.setText(String.valueOf(morngFemaleTotalStudent));
           
           int oneEveningMaleStudent=Integer.parseInt(oneEveningMale.getText());
           int twoEveningMaleStudent=Integer.parseInt(twoEveningMale.getText());
           int threeEveningMaleStudent=Integer.parseInt(threeEveningMale.getText());
           int fourEveningMaleStudent=Integer.parseInt(fourEveningMale.getText());
           int fiveEveningMaleStudent=Integer.parseInt(fiveEveningMale.getText());
           int eveningMaleTotalStudent=oneEveningMaleStudent+twoEveningMaleStudent+threeEveningMaleStudent+fourEveningMaleStudent+fiveEveningMaleStudent;
           eveningMale.setText(String.valueOf(eveningMaleTotalStudent));
           
           int oneEveningFemaleStudent=Integer.parseInt(oneEveningFemale.getText());
           int twoEveningFemaleStudent=Integer.parseInt(twoEveningFemale.getText());
           int threeEveningFemaleStudent=Integer.parseInt(threeEveningFemale.getText());
           int fourEveningFemaleStudent=Integer.parseInt(fourEveningFemale.getText());
           int fiveEveningFemaleStudent=Integer.parseInt(fiveEveningFemale.getText());
           int eveningFemaleTotalStudent=oneEveningFemaleStudent+twoEveningFemaleStudent+threeEveningFemaleStudent+fourEveningFemaleStudent+fiveEveningFemaleStudent;
           eveningFemale.setText(String.valueOf(eveningFemaleTotalStudent));
           
           int oneNoonMaleStudent=Integer.parseInt(oneNoonMale.getText());
           int twoNoonMaleStudent=Integer.parseInt(twoNoonMale.getText());
           int threeNoonMaleStudent=Integer.parseInt(threeNoonMale.getText());
           int fourNoonMaleStudent=Integer.parseInt(fourNoonMale.getText());
           int fiveNoonMaleStudent=Integer.parseInt(fiveNoonMale.getText());
           int noonMaleTotalStudent=oneNoonMaleStudent+twoNoonMaleStudent+threeNoonMaleStudent+fourNoonMaleStudent+fiveNoonMaleStudent;
           noonMale.setText(String.valueOf(noonMaleTotalStudent));
           
           int oneNoonFemaleStudent=Integer.parseInt(oneNoonFemale.getText());
           int twoNoonFemaleStudent=Integer.parseInt(twoNoonFemale.getText());
           int threeNoonFemaleStudent=Integer.parseInt(threeNoonFemale.getText());
           int fourNoonFemaleStudent=Integer.parseInt(fourNoonFemale.getText());
           int fiveNoonFemaleStudent=Integer.parseInt(fiveNoonFemale.getText());
           int noonFemaleTotalStudent=oneNoonFemaleStudent+twoNoonFemaleStudent+threeNoonFemaleStudent+fourNoonFemaleStudent+fiveNoonFemaleStudent;
           noonFemale.setText(String.valueOf(noonFemaleTotalStudent));
           
           int oneTotalMale=Integer.parseInt(oneMaleTotal.getText());
           int twoTotalMale=Integer.parseInt(twoMaleTotal.getText());
           int threeTotalMale=Integer.parseInt(threeMaleTotal.getText());
           int fourTotalMale=Integer.parseInt(fourMaleTotal.getText());
           int fiveTotalMale=Integer.parseInt(fiveMaleTotal.getText());
           int maleTotalStudent=oneTotalMale+twoTotalMale+threeTotalMale+fourTotalMale+fiveTotalMale;
           MaleTotal.setText(String.valueOf(maleTotalStudent));
           
           int oneTotalFemale=Integer.parseInt(oneFemaleTotal.getText());
           int twoTotalFemale=Integer.parseInt(twoFemaleTotal.getText());
           int threeTotalFemale=Integer.parseInt(threeFemaleTotal.getText());
           int fourTotalFemale=Integer.parseInt(fourFemaleTotal.getText());
           int fiveTotalFemale=Integer.parseInt(fiveFemaleTotal.getText());
           int femaleTotalStudent=oneTotalFemale+twoTotalFemale+threeTotalFemale+fourTotalFemale+fiveTotalFemale;
           FemaleTotal.setText(String.valueOf(femaleTotalStudent));
           
           int oneTotalStudent=Integer.parseInt(oneTotal.getText());
           int twoTotalStudent=Integer.parseInt(twoTotal.getText());
           int threeTotalStudent=Integer.parseInt(threeTotal.getText());
           int fourTotalStudent=Integer.parseInt(fourTotal.getText());
           int fiveTotalStudent=Integer.parseInt(fiveTotal.getText());
           int totalStudent=oneTotalStudent+twoTotalStudent+threeTotalStudent+fourTotalStudent+fiveTotalStudent;
           grantTotal.setText(String.valueOf(totalStudent));
           
           
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        addStudent = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        updateStudent = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        javax.swing.JButton deleteStudent = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        beack = new javax.swing.JButton();
        teacher = new javax.swing.JButton();
        Student = new javax.swing.JButton();
        results = new javax.swing.JButton();
        Transcript = new javax.swing.JButton();
        pyments = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        EVENING = new javax.swing.JLabel();
        TOTAL = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        oneMorningMale = new javax.swing.JTextField();
        oneNoonMale = new javax.swing.JTextField();
        oneEveningMale = new javax.swing.JTextField();
        oneMaleTotal = new javax.swing.JTextField();
        oneMorningFemale = new javax.swing.JTextField();
        oneNoonFemale = new javax.swing.JTextField();
        oneEveningFemale = new javax.swing.JTextField();
        oneFemaleTotal = new javax.swing.JTextField();
        oneTotal = new javax.swing.JTextField();
        two = new javax.swing.JLabel();
        twoMorningMale = new javax.swing.JTextField();
        twoMorningFemale = new javax.swing.JTextField();
        twoNoonMale = new javax.swing.JTextField();
        twoNoonFemale = new javax.swing.JTextField();
        twoEveningMale = new javax.swing.JTextField();
        twoEveningFemale = new javax.swing.JTextField();
        twoMaleTotal = new javax.swing.JTextField();
        twoFemaleTotal = new javax.swing.JTextField();
        twoTotal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        threeMorningMale = new javax.swing.JTextField();
        threeMorningFemale = new javax.swing.JTextField();
        threeNoonMale = new javax.swing.JTextField();
        threeNoonFemale = new javax.swing.JTextField();
        threeEveningMale = new javax.swing.JTextField();
        threeEveningFemale = new javax.swing.JTextField();
        threeMaleTotal = new javax.swing.JTextField();
        threeFemaleTotal = new javax.swing.JTextField();
        threeTotal = new javax.swing.JTextField();
        fourEveningMale = new javax.swing.JTextField();
        fourTotal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fourFemaleTotal = new javax.swing.JTextField();
        fourMorningFemale = new javax.swing.JTextField();
        fourEveningFemale = new javax.swing.JTextField();
        fourMaleTotal = new javax.swing.JTextField();
        fourMorningMale = new javax.swing.JTextField();
        fourNoonMale = new javax.swing.JTextField();
        fourNoonFemale = new javax.swing.JTextField();
        fiveEveningMale = new javax.swing.JTextField();
        fiveFemaleTotal = new javax.swing.JTextField();
        fiveMorningMale = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        fiveNoonMale = new javax.swing.JTextField();
        fiveMorningFemale = new javax.swing.JTextField();
        fiveTotal = new javax.swing.JTextField();
        fiveNoonFemale = new javax.swing.JTextField();
        fiveMaleTotal = new javax.swing.JTextField();
        fiveEveningFemale = new javax.swing.JTextField();
        eveningFemale = new javax.swing.JTextField();
        noonMale = new javax.swing.JTextField();
        morningFemale = new javax.swing.JTextField();
        grantTotal = new javax.swing.JTextField();
        eveningMale = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        FemaleTotal = new javax.swing.JTextField();
        noonFemale = new javax.swing.JTextField();
        MaleTotal = new javax.swing.JTextField();
        mornigMaleTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        studentId = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        transcript = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        javax.swing.JButton searchStudent = new javax.swing.JButton();
        home1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prograsive Kindergarten");
        setBackground(new java.awt.Color(0, 255, 0));
        setPreferredSize(new java.awt.Dimension(1050, 600));

        jLabel1.setBackground(new java.awt.Color(183, 253, 183));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Informatin");
        jLabel1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        addStudent.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        addStudent.setText("Add New Student");
        addStudent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51)));
        addStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addStudent)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        updateStudent.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        updateStudent.setText("Edit Student Info");
        updateStudent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51)));
        updateStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateStudent)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        deleteStudent.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        deleteStudent.setText("Delete Student");
        deleteStudent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51)));
        deleteStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteStudent)
                .addGap(57, 57, 57))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.jpg"))); // NOI18N
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        beack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/beack icon.jpg"))); // NOI18N

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(beack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(teacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(results, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Transcript, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pyments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(home, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(beack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(258, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Student Summary");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("SHIFT NAME :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MORNING");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("AFTERNOON");

        EVENING.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EVENING.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EVENING.setText("EVENING");

        TOTAL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TOTAL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TOTAL.setText("Sub Total");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("CLASS ONE         :");

        oneMorningMale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        oneMorningMale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        oneNoonMale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        oneNoonMale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        oneEveningMale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        oneEveningMale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        oneMaleTotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        oneMaleTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        oneMorningFemale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        oneMorningFemale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        oneNoonFemale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        oneNoonFemale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        oneEveningFemale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        oneEveningFemale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        oneFemaleTotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        oneFemaleTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        oneTotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        oneTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        two.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        two.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        two.setText("CLASS TWO       :");

        twoMorningMale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        twoMorningMale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        twoMorningFemale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        twoMorningFemale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        twoNoonMale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        twoNoonMale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        twoNoonFemale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        twoNoonFemale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        twoEveningMale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        twoEveningMale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        twoEveningFemale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        twoEveningFemale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        twoMaleTotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        twoMaleTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        twoFemaleTotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        twoFemaleTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        twoTotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        twoTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("CLASS THREE    :");

        threeMorningMale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        threeMorningMale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        threeMorningFemale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        threeMorningFemale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        threeNoonMale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        threeNoonMale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        threeNoonFemale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        threeNoonFemale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        threeEveningMale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        threeEveningMale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        threeEveningFemale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        threeEveningFemale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        threeMaleTotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        threeMaleTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        threeFemaleTotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        threeFemaleTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        threeTotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        threeTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fourEveningMale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        fourEveningMale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fourTotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        fourTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("CLASS FOUR      :");

        fourFemaleTotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        fourFemaleTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fourMorningFemale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        fourMorningFemale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fourEveningFemale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        fourEveningFemale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fourMaleTotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        fourMaleTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fourMorningMale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        fourMorningMale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fourNoonMale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        fourNoonMale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fourNoonFemale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        fourNoonFemale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fiveEveningMale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        fiveEveningMale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fiveFemaleTotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        fiveFemaleTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fiveMorningMale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        fiveMorningMale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("CLASS FIVE        :");

        fiveNoonMale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        fiveNoonMale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fiveMorningFemale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        fiveMorningFemale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fiveTotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        fiveTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fiveNoonFemale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        fiveNoonFemale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fiveMaleTotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        fiveMaleTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fiveEveningFemale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        fiveEveningFemale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        eveningFemale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        eveningFemale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        noonMale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        noonMale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        morningFemale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        morningFemale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        grantTotal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        grantTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        eveningMale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        eveningMale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("TOTAL");

        FemaleTotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        FemaleTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        noonFemale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        noonFemale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        MaleTotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        MaleTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        mornigMaleTotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        mornigMaleTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Total");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Male");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Female");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Male");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Female");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Male");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Female");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Male");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Female");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("CLASS NAME");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(236, 236, 236))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(twoMorningMale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twoMorningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(twoNoonMale, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twoNoonFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(twoEveningMale, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twoEveningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(twoMaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twoFemaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(twoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(threeMorningMale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(threeMorningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(threeNoonMale, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(threeNoonFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(threeEveningMale, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(threeEveningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(threeMaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(threeFemaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(threeTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fourMorningMale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fourMorningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fourNoonMale, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fourNoonFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fourEveningMale, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fourEveningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fourMaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fourFemaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fourTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fiveMorningMale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fiveMorningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fiveNoonMale, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fiveNoonFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fiveEveningMale, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fiveEveningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fiveMaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fiveFemaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fiveTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mornigMaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(morningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(noonMale, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noonFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eveningMale, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eveningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FemaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(grantTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(EVENING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(oneMorningMale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oneMorningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(oneNoonMale, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oneNoonFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(oneEveningMale, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oneEveningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(oneMaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oneFemaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(oneTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EVENING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel20)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel17)
                    .addComponent(jLabel21)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneMorningMale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneMaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneEveningMale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneNoonMale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneMorningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneNoonFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneEveningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneFemaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoMorningMale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoMaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoEveningMale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoNoonMale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoMorningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoNoonFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoEveningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoFemaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeMorningMale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeMaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeEveningMale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeNoonMale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeMorningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeNoonFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeEveningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeFemaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourMorningMale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourMaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourEveningMale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourNoonMale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourMorningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourNoonFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourEveningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourFemaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveMorningMale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveMaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveEveningMale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveNoonMale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveMorningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveNoonFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveEveningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveFemaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mornigMaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eveningMale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noonMale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(morningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noonFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eveningFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FemaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grantTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));

        studentId.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        studentId.setText("Student ID Card");
        studentId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51)));
        studentId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentId, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentId)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));

        transcript.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        transcript.setText("Transcript");
        transcript.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51)));
        transcript.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transcript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transcriptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transcript, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transcript)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(204, 255, 204));

        searchStudent.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        searchStudent.setText("Search Student");
        searchStudent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51)));
        searchStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchStudent)
                .addGap(57, 57, 57))
        );

        home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/log out icon.jpg"))); // NOI18N
        home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(home1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(home1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentActionPerformed
        // TODO add your handling code here:
        new addNewStudent().setVisible(true);
        dispose();
    }//GEN-LAST:event_addStudentActionPerformed

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

    private void studentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdActionPerformed
        // TODO add your handling code here:
        new studentIdCard().setVisible(true);
        dispose();
    }//GEN-LAST:event_studentIdActionPerformed

    private void transcriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transcriptActionPerformed
        // TODO add your handling code here:
      new AcademicTranscript().setVisible(true);
        dispose();
    }//GEN-LAST:event_transcriptActionPerformed

    private void searchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStudentActionPerformed
        // TODO add your handling code here:
        new searchStudent().setVisible(true);
        dispose();
    }//GEN-LAST:event_searchStudentActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        dispose();
                
    }//GEN-LAST:event_homeActionPerformed

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

    private void home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home1ActionPerformed
        // TODO add your handling code here:
          new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_home1ActionPerformed

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
            java.util.logging.Logger.getLogger(Student_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Student_Information().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EVENING;
    private javax.swing.JTextField FemaleTotal;
    private javax.swing.JTextField MaleTotal;
    private javax.swing.JButton Student;
    private javax.swing.JLabel TOTAL;
    private javax.swing.JButton Transcript;
    private javax.swing.JButton addStudent;
    private javax.swing.JButton beack;
    private javax.swing.JTextField eveningFemale;
    private javax.swing.JTextField eveningMale;
    private javax.swing.JTextField fiveEveningFemale;
    private javax.swing.JTextField fiveEveningMale;
    private javax.swing.JTextField fiveFemaleTotal;
    private javax.swing.JTextField fiveMaleTotal;
    private javax.swing.JTextField fiveMorningFemale;
    private javax.swing.JTextField fiveMorningMale;
    private javax.swing.JTextField fiveNoonFemale;
    private javax.swing.JTextField fiveNoonMale;
    private javax.swing.JTextField fiveTotal;
    private javax.swing.JTextField fourEveningFemale;
    private javax.swing.JTextField fourEveningMale;
    private javax.swing.JTextField fourFemaleTotal;
    private javax.swing.JTextField fourMaleTotal;
    private javax.swing.JTextField fourMorningFemale;
    private javax.swing.JTextField fourMorningMale;
    private javax.swing.JTextField fourNoonFemale;
    private javax.swing.JTextField fourNoonMale;
    private javax.swing.JTextField fourTotal;
    private javax.swing.JTextField grantTotal;
    private javax.swing.JButton home;
    private javax.swing.JButton home1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JTextField mornigMaleTotal;
    private javax.swing.JTextField morningFemale;
    private javax.swing.JTextField noonFemale;
    private javax.swing.JTextField noonMale;
    private javax.swing.JTextField oneEveningFemale;
    private javax.swing.JTextField oneEveningMale;
    private javax.swing.JTextField oneFemaleTotal;
    private javax.swing.JTextField oneMaleTotal;
    private javax.swing.JTextField oneMorningFemale;
    private javax.swing.JTextField oneMorningMale;
    private javax.swing.JTextField oneNoonFemale;
    private javax.swing.JTextField oneNoonMale;
    private javax.swing.JTextField oneTotal;
    private javax.swing.JButton pyments;
    private javax.swing.JButton results;
    private javax.swing.JButton studentId;
    private javax.swing.JButton teacher;
    private javax.swing.JTextField threeEveningFemale;
    private javax.swing.JTextField threeEveningMale;
    private javax.swing.JTextField threeFemaleTotal;
    private javax.swing.JTextField threeMaleTotal;
    private javax.swing.JTextField threeMorningFemale;
    private javax.swing.JTextField threeMorningMale;
    private javax.swing.JTextField threeNoonFemale;
    private javax.swing.JTextField threeNoonMale;
    private javax.swing.JTextField threeTotal;
    private javax.swing.JButton transcript;
    private javax.swing.JLabel two;
    private javax.swing.JTextField twoEveningFemale;
    private javax.swing.JTextField twoEveningMale;
    private javax.swing.JTextField twoFemaleTotal;
    private javax.swing.JTextField twoMaleTotal;
    private javax.swing.JTextField twoMorningFemale;
    private javax.swing.JTextField twoMorningMale;
    private javax.swing.JTextField twoNoonFemale;
    private javax.swing.JTextField twoNoonMale;
    private javax.swing.JTextField twoTotal;
    private javax.swing.JButton updateStudent;
    // End of variables declaration//GEN-END:variables
}
