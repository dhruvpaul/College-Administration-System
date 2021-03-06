
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dhruv Paul
 */
public class Adduser extends javax.swing.JFrame {

    public static String aduserid,adname;
    /**
     * Creates new form AddStudent
     */
    public Adduser() {
        initComponents();
    }

    public Adduser(String nm, String usern) {
        initComponents();
        adname=nm;
        aduserid=usern;
        Feesorsal.setEditable(false);
        Course.setEditable(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sexbgroup = new javax.swing.ButtonGroup();
        Adduser = new javax.swing.JLabel();
        NameL = new javax.swing.JLabel();
        UserIDL = new javax.swing.JLabel();
        PasswordL = new javax.swing.JLabel();
        Password2L = new javax.swing.JLabel();
        TypeL = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        UserID = new javax.swing.JTextField();
        Type = new javax.swing.JComboBox<>();
        Date = new javax.swing.JComboBox<>();
        Month = new javax.swing.JComboBox<>();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        Password2 = new javax.swing.JPasswordField();
        SexL = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        DobL = new javax.swing.JLabel();
        CourseL = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        Course = new javax.swing.JTextField();
        Year = new javax.swing.JTextField();
        AdminpassL = new javax.swing.JLabel();
        Adminpass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        Password = new javax.swing.JPasswordField();
        SalorfeesL = new javax.swing.JLabel();
        Feesorsal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Adduser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Adduser.setText("Add User");

        NameL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NameL.setText("Full Name");

        UserIDL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UserIDL.setText("UserID");

        PasswordL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PasswordL.setText("Password");

        Password2L.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Password2L.setText("Retype Password");

        TypeL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TypeL.setText("Type");

        UserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIDActionPerformed(evt);
            }
        });

        Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Admin", "Teacher", "Student" }));
        Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeActionPerformed(evt);
            }
        });

        Date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        Sexbgroup.add(Male);
        Male.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Male.setText("Male");

        Sexbgroup.add(Female);
        Female.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Female.setText("Female");

        SexL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SexL.setText("Sex");

        Back.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Back.setText("<<Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        DobL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DobL.setText("D.O.B");

        CourseL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CourseL.setText("Branch");

        Submit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        AdminpassL.setText("Admin Password");

        Adminpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminpassActionPerformed(evt);
            }
        });

        SalorfeesL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SalorfeesL.setText("Salary");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Help");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Submit)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Back)
                        .addGap(99, 99, 99)
                        .addComponent(Adduser)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SalorfeesL)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameL)
                            .addComponent(UserIDL)
                            .addComponent(PasswordL)
                            .addComponent(Password2L)
                            .addComponent(TypeL)
                            .addComponent(SexL)
                            .addComponent(DobL)
                            .addComponent(CourseL)
                            .addComponent(AdminpassL))
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Male)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Female))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Adminpass, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Feesorsal, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(UserID, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Password2, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Course, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Adduser)
                    .addComponent(Back))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameL)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserIDL)
                    .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordL)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password2L)
                    .addComponent(Password2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Male)
                        .addComponent(Female))
                    .addComponent(SexL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TypeL)
                    .addComponent(Type, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalorfeesL)
                    .addComponent(Feesorsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DobL)
                    .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseL)
                    .addComponent(Course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminpassL)
                    .addComponent(Adminpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(Submit)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Admin ob=new Admin(""+aduserid,""+adname);
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        try {
            // TODO add your handling code here:
            int  year,dtchk;
            String fos="",dt="",mon="", adminpass, dbapass="" ,passc, name, pass, repass, userid, course,password = "",dob;
            char sex,type = ' ',temp=' '; 
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","cam","project");
            Statement stat = con.createStatement();
            name=Name.getText();
            pass=new String(Password.getPassword());
            repass=new String(Password2.getPassword());
            userid=UserID.getText();
            ResultSet rs= stat.executeQuery("select * from login where loginid='"+userid+"'");
            if(rs.next()) {
                JOptionPane.showMessageDialog(this,"UserID already taken, try another");
                return;
            }
            course=Course.getText();
            adminpass=new String(Adminpass.getPassword());
            String check=(String)Type.getSelectedItem();
            if(check.equals("Admin"))
            {
                type='a';
            } else if(check.equals("Teacher")) {
                type='t';
            } else if(check.equals("Student")) {
                type='s';
            } else {
                JOptionPane.showMessageDialog(this,"Enter Account Type");
                return;
            }
            if(Male.isSelected())
            {
                sex='m';
            } else if(Female.isSelected()) {
                sex='f';
            } else {
                JOptionPane.showMessageDialog(this,"Enter your Gender");
                return;
            }
            fos=Feesorsal.getText();
            dt=(String)Date.getSelectedItem();
            if (dt.equals("Date")) {
                JOptionPane.showMessageDialog(this,"Enter Date");
                return;
            }
            mon=(String)Month.getSelectedItem();
            if (mon.equals("Month")) {
                JOptionPane.showMessageDialog(this,"Enter Month");
                return;
            }
            dtchk=Integer.parseInt(dt);
            if(mon.equals("February") && dtchk>29 || (mon.equals("April") || mon.equals("June") || mon.equals("September") || mon.equals("November")) && dtchk>30) {
                JOptionPane.showMessageDialog(this,"Enter correct Date");
                return;
            }
            year=Integer.parseInt(Year.getText());
            if(year>=1950 && year<2016)
            {
                
            } else {
                JOptionPane.showMessageDialog(this,"Enter Valid Year");
                return;
            }
            dob=dt+"-"+mon+"-"+year;
            if(pass.equals(repass))
            {
                int i=0, len;
                len=pass.length();
                while(i!=len)
                {
                    temp = pass.charAt(i);
                    temp=(char) ((int) temp+2);
                    password += temp;
                    i++;
                }
                i=0;
                rs=stat.executeQuery("select password from login where loginid='"+aduserid+"'");
                if (rs.next()) {
                    dbapass=rs.getString(1);
                }
                len = dbapass.length();
                passc="";
                while(i!=len)
                {
                    temp = dbapass.charAt(i);
                    temp=(char) ((int) temp-2);
                    passc += temp;
                    i++;
                } 
                if(adminpass.equals(passc)) {
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog (null, "Create User?","Warning",dialogButton);
                    if(dialogResult == JOptionPane.YES_OPTION){
                        stat.executeQuery("insert into login values('"+userid+"','"+name+"','"+password+"','"+type+"')");
                        stat.executeQuery("insert into details values('"+userid+"','"+course+"','"+sex+"','"+dob+"','"+fos+"')");
                        JOptionPane.showMessageDialog(this,"User Created");
                        Admin ob =new Admin(""+aduserid,""+adname);
                        ob.setVisible(true);
                        this.setVisible(false);
                        return;                        
                    } else {
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(this,"Wrong Admin Password");
                }
            }
            else {
                JOptionPane.showMessageDialog(this,"The password you entered does not match");
                return;
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Adduser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_SubmitActionPerformed

    private void AdminpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminpassActionPerformed

    private void UserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDActionPerformed

    }//GEN-LAST:event_UserIDActionPerformed

    private void TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeActionPerformed
       String check=(String)Type.getSelectedItem();
       if(check.equalsIgnoreCase("Admin") || check.equalsIgnoreCase("Teacher")) {
           SalorfeesL.setText("Salary");
           Feesorsal.setEditable(true);
           CourseL.setText("Department");
           Course.setEditable(true);
       } else if (check.equalsIgnoreCase("Student")) {
           SalorfeesL.setText("Fees");
           Feesorsal.setEditable(true);
           CourseL.setText("Course");
           Course.setEditable(true);
       } else if (check.equalsIgnoreCase("Select")){
           Feesorsal.setEditable(false);
           Course.setEditable(false);
       }else {
           SalorfeesL.setText("Salary");
           Feesorsal.setEditable(true);
           CourseL.setText("Department");
           Course.setEditable(true);
           return;
       }
    }//GEN-LAST:event_TypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(this,"CompSci - Computer\nCivil - Civil\nMechanical - Mechanical\nECE - Electronics\nElectrical - Electrical");
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adduser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adduser;
    private javax.swing.JPasswordField Adminpass;
    private javax.swing.JLabel AdminpassL;
    private javax.swing.JButton Back;
    private javax.swing.JTextField Course;
    private javax.swing.JLabel CourseL;
    private javax.swing.JComboBox<String> Date;
    private javax.swing.JLabel DobL;
    private javax.swing.JTextField Feesorsal;
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JComboBox<String> Month;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel NameL;
    private javax.swing.JPasswordField Password;
    private javax.swing.JPasswordField Password2;
    private javax.swing.JLabel Password2L;
    private javax.swing.JLabel PasswordL;
    private javax.swing.JLabel SalorfeesL;
    private javax.swing.JLabel SexL;
    private javax.swing.ButtonGroup Sexbgroup;
    private javax.swing.JButton Submit;
    private javax.swing.JComboBox<String> Type;
    private javax.swing.JLabel TypeL;
    private javax.swing.JTextField UserID;
    private javax.swing.JLabel UserIDL;
    private javax.swing.JTextField Year;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
