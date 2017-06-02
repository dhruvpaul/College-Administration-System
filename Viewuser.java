
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
public class Viewuser extends javax.swing.JFrame {

    public static String adname, aduserid;
    public static char type;
    /**
     * Creates new form Viewuser
     */
    public Viewuser() {
        initComponents();
    }
    
    public Viewuser(char temp, String usern, String nm) {
        initComponents();
        type=temp;
        adname=nm;
        aduserid=usern;   
        DetailsL.setVisible(false);
        Name.setVisible(false);
        Sex.setVisible(false);
        Dob.setVisible(false);
        Course.setVisible(false);
        Usertype.setVisible(false);
        Name.setEditable(false);
        Sex.setEditable(false);
        Dob.setEditable(false);
        Usertype.setEditable(false);
        Course.setEditable(false);
        NameL.setVisible(false);
        SexL.setVisible(false);
        DobL.setVisible(false);
        CourseL.setVisible(false);
        UsertypeL.setVisible(false);
        Separator.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JButton();
        UserIDL = new javax.swing.JLabel();
        UserID = new javax.swing.JTextField();
        Showdetails = new javax.swing.JButton();
        DetailsL = new javax.swing.JLabel();
        NameL = new javax.swing.JLabel();
        SexL = new javax.swing.JLabel();
        UsertypeL = new javax.swing.JLabel();
        DobL = new javax.swing.JLabel();
        CourseL = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Sex = new javax.swing.JTextField();
        Usertype = new javax.swing.JTextField();
        Dob = new javax.swing.JTextField();
        Course = new javax.swing.JTextField();
        Reset = new javax.swing.JButton();
        Separator = new javax.swing.JSeparator();
        Viewuser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Back.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Back.setText("<<Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        UserIDL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UserIDL.setText("Enter UserID");

        Showdetails.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Showdetails.setText("Show Details");
        Showdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowdetailsActionPerformed(evt);
            }
        });

        DetailsL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailsL.setText("Details");

        NameL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NameL.setText("Name");

        SexL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SexL.setText("Sex");

        UsertypeL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UsertypeL.setText("User Type");

        DobL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DobL.setText("D.O.B.");

        CourseL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CourseL.setText("Course/Department");

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Viewuser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Viewuser.setText("View User");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(DetailsL)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserIDL)
                            .addComponent(SexL)
                            .addComponent(NameL)
                            .addComponent(UsertypeL)
                            .addComponent(DobL)
                            .addComponent(CourseL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Name)
                                .addComponent(Sex)
                                .addComponent(Usertype)
                                .addComponent(Dob)
                                .addComponent(Course, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                            .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Viewuser)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Reset)
                                .addGap(18, 18, 18)
                                .addComponent(Showdetails)))))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Back)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Separator, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(Viewuser))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserIDL)
                    .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Showdetails)
                    .addComponent(Reset))
                .addGap(5, 5, 5)
                .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(DetailsL)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameL)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SexL)
                    .addComponent(Sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsertypeL)
                    .addComponent(Usertype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DobL)
                    .addComponent(Dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseL)
                    .addComponent(Course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowdetailsActionPerformed
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","cam","project");
            Statement stat = con.createStatement();
            String name, userid, dobf="", dob="", course="";
            char sex=' ', temp=' ', usertype;
            userid=UserID.getText();
            ResultSet rs=stat.executeQuery("select name, type from login where loginid='"+userid+"'");
            if (rs.next()) {
                name=rs.getString(1);
                usertype= rs.getString(2).charAt(0);
                if (type=='t'||type=='T') {
                    if (userid.equals(aduserid)) {
                        
                    } else if (usertype=='t'||usertype=='T'||usertype=='a'||usertype=='A') {
                        JOptionPane.showMessageDialog(this,"Oops!! You Can Only Check Details Of A Student");
                        Name.setVisible(false);
                        Sex.setVisible(false);
                        Dob.setVisible(false);
                        Course.setVisible(false);
                        Usertype.setVisible(false);
                        NameL.setVisible(false);
                        SexL.setVisible(false);
                        DobL.setVisible(false);
                        CourseL.setVisible(false);
                        UsertypeL.setVisible(false);
                        Separator.setVisible(false);
                        DetailsL.setVisible(false);
                        return;
                    }
                }
            } else {
                Name.setVisible(false);
                Sex.setVisible(false);
                Dob.setVisible(false);
                Course.setVisible(false);
                Usertype.setVisible(false);
                NameL.setVisible(false);
                SexL.setVisible(false);
                DobL.setVisible(false);
                CourseL.setVisible(false);
                UsertypeL.setVisible(false);
                Separator.setVisible(false);
                DetailsL.setVisible(false);
                JOptionPane.showMessageDialog(this,"Invalid UserID");
                return;
            }
            rs=stat.executeQuery("select courseanddept, sex, dob from details where loginid='"+userid+"'");
            if (rs.next()) {
                course=rs.getString(1);
                sex=rs.getString(2).charAt(0);
                dob=rs.getString(3);
            }
            Name.setText(name);
            for(int t=0;t<=9;t++) {
                temp=dob.charAt(t);
                dobf += temp;
            }
            Dob.setText(dobf);
            Course.setText(course);
            if (usertype == 't' || usertype == 'T' ) {
                Usertype.setText("Teacher");
            } else if (usertype == 'a' || usertype == 'A') {
                Usertype.setText("Administrator");
            } else {
                Usertype.setText("Student");
            }
            if (sex == 'm' || sex == 'M' ) {
                Sex.setText("Male");
            } else {
                Sex.setText("Female");
            }
            DetailsL.setVisible(true);
            Name.setVisible(true);
            Sex.setVisible(true);
            Dob.setVisible(true);
            Course.setVisible(true);
            Usertype.setVisible(true);
            NameL.setVisible(true);
            SexL.setVisible(true);
            DobL.setVisible(true);
            CourseL.setVisible(true);
            UsertypeL.setVisible(true);
            Separator.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Viewuser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ShowdetailsActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        if (type=='a'||type=='A') {
            Admin ob=new Admin(""+aduserid,""+adname);
            ob.setVisible(true);
            this.setVisible(false);
        } else if (type=='t'||type=='T') {
            Teacher ob=new Teacher(""+aduserid,""+adname);
            ob.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_BackActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        UserID.setText("");
        DetailsL.setVisible(false);
        Name.setVisible(false);
        Sex.setVisible(false);
        Dob.setVisible(false);
        Course.setVisible(false);
        Usertype.setVisible(false);
        Separator.setVisible(false);
        NameL.setVisible(false);
        SexL.setVisible(false);
        DobL.setVisible(false);
        CourseL.setVisible(false);
        UsertypeL.setVisible(false);
    }//GEN-LAST:event_ResetActionPerformed

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
            java.util.logging.Logger.getLogger(Viewuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Viewuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Viewuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Viewuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viewuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField Course;
    private javax.swing.JLabel CourseL;
    private javax.swing.JLabel DetailsL;
    private javax.swing.JTextField Dob;
    private javax.swing.JLabel DobL;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel NameL;
    private javax.swing.JButton Reset;
    private javax.swing.JSeparator Separator;
    private javax.swing.JTextField Sex;
    private javax.swing.JLabel SexL;
    private javax.swing.JButton Showdetails;
    private javax.swing.JTextField UserID;
    private javax.swing.JLabel UserIDL;
    private javax.swing.JTextField Usertype;
    private javax.swing.JLabel UsertypeL;
    private javax.swing.JLabel Viewuser;
    // End of variables declaration//GEN-END:variables
}