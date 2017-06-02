
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
public class Fees extends javax.swing.JFrame {

    public static char chk;
    public static String userid, name,dt="",fulldt;
    /**
     * Creates new form FeesOrSal
     */
    public Fees() {
        initComponents();
    }
    
    public Fees(char type, String usern, String nm) {
        try {
            initComponents();
            chk=type;
            userid=usern;
            name=nm;
            Monthly.setEditable(false);
            Totalpaid.setEditable(false);
            Lastpaid.setEditable(false);
            Lastpaiddt.setEditable(false);
            Dues.setEditable(false);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","cam","project");
            Statement stat = con.createStatement();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Calendar cal = Calendar.getInstance();
            String full =cal.getTime().toString();
            String mon="", dd="", yy="";
            char temp= ' ';
            for(int i=4;i<7;i++) {
                temp=full.charAt(i);
                mon += temp;
            }   
            for(int i=8;i<10;i++) {
                temp=full.charAt(i);
                dd += temp;
            }
            for(int i=24;i<=27;i++) {
                temp=full.charAt(i);
                yy += temp;
            }   
            fulldt=dd+"-"+mon+"-"+yy;
            int monthly=0,totalp,dues;
            ResultSet rs=stat.executeQuery("select feesorsal from details where loginid='"+userid+"'");
            if(rs.next()) {
                monthly=Integer.parseInt(rs.getString(1));
                Monthly.setText(""+rs.getString(1));
            }
            rs=stat.executeQuery("select lpaid,totalpaid,adate from feesdetails where loginid='"+userid+"'");
            if (rs.next()) {
                Totalpaid.setText(""+rs.getString(2));
                totalp=Integer.parseInt(rs.getString(2));
                Lastpaid.setText(""+rs.getString(1));
                String temp1=rs.getString(3), last = "",dt = "",mon1="",y="";
                char t=' ';
                for(int i=8;i<=9;i++) {
                t = temp1.charAt(i);
                dt += t;
                }
                last= last+dt+"-";
                for(int i=5;i<=6;i++) {
                    t =  temp1.charAt(i);
                    mon1 += t;
                }
                last= last+mon1+"-";
                for(int i=0;i<=3;i++) {
                    t = temp1.charAt(i);
                    y += t;
                }
                last= last+y;
                Lastpaiddt.setText(""+last);
                dues= monthly-totalp;
                Dues.setText(""+dues);
                if (dues==0) {
                    Pay.setEnabled(false);
                }
            } else {
                Totalpaid.setText("N/A");
                Lastpaid.setText("N/A");
                Lastpaiddt.setText("N/A");
                Dues.setText("N/A");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Fees.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        FeesorsalL = new javax.swing.JLabel();
        MonthlyL = new javax.swing.JLabel();
        Monthly = new javax.swing.JTextField();
        LastpaiddtL = new javax.swing.JLabel();
        Rs1 = new javax.swing.JLabel();
        Lastpaiddt = new javax.swing.JTextField();
        Pay = new javax.swing.JButton();
        DuesL = new javax.swing.JLabel();
        Dues = new javax.swing.JTextField();
        Rs3 = new javax.swing.JLabel();
        TotalpaidL = new javax.swing.JLabel();
        Totalpaid = new javax.swing.JTextField();
        Rs2 = new javax.swing.JLabel();
        AmountL = new javax.swing.JLabel();
        Amount = new javax.swing.JTextField();
        Rs4 = new javax.swing.JLabel();
        LastpaidL = new javax.swing.JLabel();
        Lastpaid = new javax.swing.JTextField();
        Rs5 = new javax.swing.JLabel();
        Fulldetails = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Back.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Back.setText("<<Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        FeesorsalL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FeesorsalL.setText("Fees");

        MonthlyL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MonthlyL.setText("Monthly Fees");

        Monthly.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LastpaiddtL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LastpaiddtL.setText("Last Paid Date");

        Rs1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Rs1.setText("Rs.");

        Lastpaiddt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lastpaiddt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastpaiddtActionPerformed(evt);
            }
        });

        Pay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pay.setText("Pay");
        Pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayActionPerformed(evt);
            }
        });

        DuesL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DuesL.setText("Amount Dues");

        Dues.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Rs3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Rs3.setText("Rs.");

        TotalpaidL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TotalpaidL.setText("Total Paid");

        Totalpaid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Rs2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Rs2.setText("Rs.");

        AmountL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AmountL.setText("Pay Amount");

        Amount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Rs4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Rs4.setText("Rs.");

        LastpaidL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LastpaidL.setText("Last Paid Amount");

        Lastpaid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Rs5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Rs5.setText("Rs.");

        Fulldetails.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Fulldetails.setText("Full Details");
        Fulldetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FulldetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back)
                .addGap(101, 101, 101)
                .addComponent(FeesorsalL)
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AmountL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Rs5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DuesL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Rs4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Dues, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(MonthlyL)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Rs1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TotalpaidL)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Rs2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(LastpaidL)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Rs3)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LastpaiddtL)
                                        .addGap(128, 128, 128)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Lastpaiddt)
                                    .addComponent(Totalpaid, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Monthly, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(Lastpaid)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Fulldetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Pay)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(FeesorsalL))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MonthlyL)
                    .addComponent(Monthly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rs1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalpaidL)
                    .addComponent(Totalpaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rs2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Lastpaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Rs3))
                    .addComponent(LastpaidL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastpaiddtL)
                    .addComponent(Lastpaiddt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DuesL)
                    .addComponent(Dues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rs4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AmountL)
                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rs5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pay)
                    .addComponent(Fulldetails))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        try {
            Student ob=new Student(""+userid,""+name);
            ob.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Fees.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BackActionPerformed

    private void LastpaiddtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastpaiddtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastpaiddtActionPerformed

    private void PayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayActionPerformed
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","cam","project");
            Statement stat = con.createStatement();
            int monthly=0,totalp=0,dues,pay;
            ResultSet rs=stat.executeQuery("select status from feesdetails where loginid='"+userid+"'");
            if (rs.next()) {
                char status=rs.getString(1).charAt(0);
                if (status=='p'||status=='P') {
                    JOptionPane.showMessageDialog(this,"Last Payment Is Not Yet Confirmed");
                    return;
                }
            }
            rs=stat.executeQuery("select feesorsal from details where loginid='"+userid+"'");
            if(rs.next()) {
                monthly=Integer.parseInt(rs.getString(1));
                dues=monthly;
            }
            rs=stat.executeQuery("select totalpaid from feesdetails where loginid='"+userid+"'");
            if (rs.next()) {
                totalp=Integer.parseInt(rs.getString(1));
                dues=monthly-totalp;
            }
            try {
                pay=Integer.parseInt(Amount.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this,"Enter a Number");
                Amount.setText("");
                return;
            }
            totalp=totalp+pay;
            if (totalp>monthly) {
                JOptionPane.showMessageDialog(this,"You Cannot Pay More Than Your Fee");
                Amount.setText("");
                return;
            }
            stat.executeQuery("insert into feeshistory values('"+userid+"','"+pay+"','"+totalp+"','"+fulldt+"')");
            rs=stat.executeQuery("select totalpaid from feesdetails where loginid='"+userid+"'");
            if (rs.next()) {
                stat.executeQuery("delete feesdetails where loginid='"+userid+"'");
            }
            stat.executeQuery("insert into feesdetails values('"+userid+"','"+pay+"','P','"+totalp+"','"+fulldt+"')");
            JOptionPane.showMessageDialog(this,"Fee Submitted.\n Awaiting Confirmation.");
            Fees ob = new Fees('S', ""+userid, ""+name);
            ob.setVisible(true);
            this.setVisible(false);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Fees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PayActionPerformed

    private void FulldetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FulldetailsActionPerformed
        Fullaccountdetails ob=new Fullaccountdetails('s',""+userid,""+name);
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_FulldetailsActionPerformed

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
            java.util.logging.Logger.getLogger(Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amount;
    private javax.swing.JLabel AmountL;
    private javax.swing.JButton Back;
    private javax.swing.JTextField Dues;
    private javax.swing.JLabel DuesL;
    private javax.swing.JLabel FeesorsalL;
    private javax.swing.JButton Fulldetails;
    private javax.swing.JTextField Lastpaid;
    private javax.swing.JLabel LastpaidL;
    private javax.swing.JTextField Lastpaiddt;
    private javax.swing.JLabel LastpaiddtL;
    private javax.swing.JTextField Monthly;
    private javax.swing.JLabel MonthlyL;
    private javax.swing.JButton Pay;
    private javax.swing.JLabel Rs1;
    private javax.swing.JLabel Rs2;
    private javax.swing.JLabel Rs3;
    private javax.swing.JLabel Rs4;
    private javax.swing.JLabel Rs5;
    private javax.swing.JTextField Totalpaid;
    private javax.swing.JLabel TotalpaidL;
    // End of variables declaration//GEN-END:variables
}
