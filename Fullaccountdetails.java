
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dhruv Paul
 */
public class Fullaccountdetails extends javax.swing.JFrame {

    public static char chk;
    public static String name,auserid;
    /**
     * Creates new form Fullaccountdetails
     */
    public Fullaccountdetails() {
        initComponents();
    }

    public Fullaccountdetails(char type,String usern, String nm) {
        try {
            initComponents();
            chk=type;
            name= nm;
            auserid=usern;
            Authorizep.setVisible(false);
            Reenter.setVisible(false);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","cam","project");
            Statement stat = con.createStatement();
            DefaultTableModel md=(DefaultTableModel)Table.getModel();
            md.setNumRows(0);
            if (chk=='s'||chk=='S') {
                UserID.setVisible(false);
                UserIDL.setVisible(false);
                Submit.setVisible(false);
                Separator.setVisible(false);
                /*ResultSet rs=stat.executeQuery("select status from feesdetails where loginid='"+auserid+"'");
                if(rs.next()){
                    char status;
                    status=rs.getString(1).charAt(0);
                    if (status=='p'||status=='P') {
                        Authorizep.setEnabled(true);
                    }
                }*/
                ResultSet rs= stat.executeQuery("select lpaid,adate from feeshistory where loginid='"+auserid+"' order by adate desc");
                while(rs.next()) {
                    String temp=rs.getString(2), last = "",dt = "",mon="",y="";
                    char t=' ';
                    for(int i=8;i<=9;i++) {
                    t = temp.charAt(i);
                    dt += t;
                    }
                    last= last+dt+"-";
                    for(int i=5;i<=6;i++) {
                        t =  temp.charAt(i);
                        mon += t;
                    }
                    last= last+mon+"-";
                    for(int i=0;i<=3;i++) {
                        t = temp.charAt(i);
                        y += t;
                    }
                    last= last+y;
                   md.addRow(new Object[]{""+name,""+last,rs.getString(1)}); 
                }
            } else if(chk=='t'||chk=='T') {
                UserID.setVisible(false);
                UserIDL.setVisible(false);
                Submit.setVisible(false);
                Separator.setVisible(false);
                Authorizep.setVisible(true);
                ResultSet rs=stat.executeQuery("select feesorsal from details where loginid='"+auserid+"'");
                String sal="0";
                if(rs.next()) {
                    sal=rs.getString(1);
                }
                rs= stat.executeQuery("select adate from salhistory where loginid='"+auserid+"' order by adate desc");
                while(rs.next()) {
                    String temp=rs.getString(1), last = "",dt = "",mon="",y="";
                    char t=' ';
                    for(int i=8;i<=9;i++) {
                    t = temp.charAt(i);
                    dt += t;
                    }
                    last= last+dt+"-";
                    for(int i=5;i<=6;i++) {
                        t =  temp.charAt(i);
                        mon += t;
                    }
                    last= last+mon+"-";
                    for(int i=0;i<=3;i++) {
                        t = temp.charAt(i);
                        y += t;
                    }
                    last= last+y;
                   md.addRow(new Object[]{""+name,""+last,""+sal}); 
                }
                rs= stat.executeQuery("select status from saldetails where loginid='"+auserid+"'");
                if (rs.next()) {
                    char check=rs.getString(1).charAt(0);
                    if(check=='p'||check=='P') {
                        Authorizep.setEnabled(true);
                    } else {
                        Authorizep.setEnabled(false);
                    }
                }
            } else if(chk=='a'||chk=='A') {
                Submit.setVisible(true);
                UserIDL.setVisible(true);
                UserID.setVisible(true);
                Scroll.setVisible(false);
                Separator.setVisible(false);
                Table.setVisible(false);
                Reenter.setVisible(true);
                Reenter.setEnabled(false);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Fullaccountdetails.class.getName()).log(Level.SEVERE, null, ex);
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Scroll = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Separator = new javax.swing.JSeparator();
        UserIDL = new javax.swing.JLabel();
        UserID = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        Authorizep = new javax.swing.JButton();
        Reenter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Account Details");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Date", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Scroll.setViewportView(Table);

        UserIDL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UserIDL.setText("UserID");

        UserID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Submit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Authorizep.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Authorizep.setText("Authorize Payment");
        Authorizep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorizepActionPerformed(evt);
            }
        });

        Reenter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Reenter.setText("Re-Enter");
        Reenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReenterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Separator)
                    .addComponent(Authorizep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(UserIDL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Submit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Reenter)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserIDL)
                    .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Submit)
                    .addComponent(Reenter))
                .addGap(18, 18, 18)
                .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Authorizep)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switch (chk) {
            case 's':
            case 'S':
                try {
                    Student ob=new Student(""+auserid,""+name);
                    this.setVisible(false);
                    ob.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Viewassignments.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
            case 't':
            case 'T':
                {
                    Teacher ob=new Teacher(""+auserid,""+name);
                    ob.setVisible(true);
                    this.setVisible(false);
                    break;
                }
            default:
                {
                    Accounts ob=new Accounts('a',""+auserid,""+name);
                    this.setVisible(false);
                    ob.setVisible(true);
                    break;
                }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AuthorizepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorizepActionPerformed
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","cam","project");
            Statement stat = con.createStatement();
            if (chk=='T'||chk=='t') {
                stat.executeQuery("update saldetails set status='C' where loginid='"+auserid+"'");
                JOptionPane.showMessageDialog(this,"Payment Authorized");
                Authorizep.setEnabled(false);
            } else if(chk=='a'||chk=='A') {
                String tempuserid;
                tempuserid=UserID.getText();
                ResultSet rs= stat.executeQuery("select type from login where loginid='"+tempuserid+"'");
                if (rs.next()) {
                    if (rs.getString(1).charAt(0)=='s' || rs.getString(1).charAt(0)=='S') {
                        stat.executeQuery("update feesdetails set status='C' where loginid='"+tempuserid+"'");
                    } else if(rs.getString(1).charAt(0)=='a' || rs.getString(1).charAt(0)=='A') {
                        stat.executeQuery("update saldetails set status='C' where loginid='"+tempuserid+"'");
                    }
                }
                
                JOptionPane.showMessageDialog(this,"Payment Authorized");
                Authorizep.setEnabled(false);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Fullaccountdetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AuthorizepActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","cam","project");
            Statement stat = con.createStatement();
            String userid;
            userid=UserID.getText();
            DefaultTableModel md=(DefaultTableModel)Table.getModel();
            md.setNumRows(0);
            ResultSet rs=stat.executeQuery("select type,name from login where loginid='"+userid+"'");
            if (rs.next()) {
                UserID.setEditable(false);
                Reenter.setEnabled(true);
                Scroll.setVisible(true);
                Separator.setVisible(true);
                Table.setVisible(true);
                String tempname="";
                char type;
                type=rs.getString(1).charAt(0);
                tempname=rs.getString(2);
                if (type=='s'||type=='S') {
                    rs=stat.executeQuery("select status from feesdetails where loginid='"+userid+"'");
                    if(rs.next()){
                        char status;
                        status=rs.getString(1).charAt(0);
                        System.out.println(""+status);
                        if (status=='p'||status=='P') {
                            Authorizep.setEnabled(true);
                            Authorizep.setVisible(true);
                        } else {
                            Authorizep.setEnabled(false);
                            Authorizep.setVisible(true);
                        }
                    }
                    rs= stat.executeQuery("select lpaid,adate from feeshistory where loginid='"+userid+"' order by adate desc");
                    while(rs.next()) {
                    String temp=rs.getString(2), last = "",dt = "",mon="",y="";
                    char t=' ';
                    for(int i=8;i<=9;i++) {
                    t = temp.charAt(i);
                    dt += t;
                    }
                    last= last+dt+"-";
                    for(int i=5;i<=6;i++) {
                        t =  temp.charAt(i);
                        mon += t;
                    }
                    last= last+mon+"-";
                    for(int i=0;i<=3;i++) {
                        t = temp.charAt(i);
                        y += t;
                    }
                    last= last+y;
                   md.addRow(new Object[]{""+tempname,""+last,rs.getString(1)});
                   } 
                } else if (type=='t'||type=='T') {
                    rs=stat.executeQuery("select feesorsal from details where loginid='"+userid+"'");
                    String sal="0";
                    if(rs.next()) {
                        sal=rs.getString(1);
                    }
                    rs= stat.executeQuery("select adate from salhistory where loginid='"+userid+"' order by adate desc");
                    while(rs.next()) {
                        String temp=rs.getString(1), last = "",dt = "",mon="",y="";
                        char t=' ';
                        for(int i=8;i<=9;i++) {
                        t = temp.charAt(i);
                        dt += t;
                        }
                        last= last+dt+"-";
                        for(int i=5;i<=6;i++) {
                            t =  temp.charAt(i);
                            mon += t;
                        }
                        last= last+mon+"-";
                        for(int i=0;i<=3;i++) {
                            t = temp.charAt(i);
                            y += t;
                        }
                        last= last+y;
                       md.addRow(new Object[]{""+tempname,""+last,""+sal}); 
                    }
                    Authorizep.setVisible(false);
                } else if (type=='a'||type=='A') {
                    rs=stat.executeQuery("select feesorsal from details where loginid='"+userid+"'");
                    String sal="0";
                    if(rs.next()) {
                        sal=rs.getString(1);
                    }
                    rs= stat.executeQuery("select adate from salhistory where loginid='"+userid+"' order by adate desc");
                    while(rs.next()) {
                        String temp=rs.getString(1), last = "",dt = "",mon="",y="";
                        char t=' ';
                        for(int i=8;i<=9;i++) {
                        t = temp.charAt(i);
                        dt += t;
                        }
                        last= last+dt+"-";
                        for(int i=5;i<=6;i++) {
                            t =  temp.charAt(i);
                            mon += t;
                        }
                        last= last+mon+"-";
                        for(int i=0;i<=3;i++) {
                            t = temp.charAt(i);
                            y += t;
                        }
                        last= last+y;
                       md.addRow(new Object[]{""+tempname,""+last,""+sal}); 
                    }
                    Authorizep.setEnabled(false);
                    if(auserid.equals(""+userid)) {
                        Authorizep.setVisible(true);
                        rs= stat.executeQuery("select status from saldetails where loginid='"+userid+"'");
                        if (rs.next()) {
                            char status;
                            status=rs.getString(1).charAt(0);
                            if (status=='P'||status=='p') {
                                Authorizep.setEnabled(true);
                            }
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this,"Invalid UserID");
                Scroll.setVisible(false);
                Separator.setVisible(false);
                Table.setVisible(false);
                Authorizep.setVisible(false);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Fullaccountdetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void ReenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReenterActionPerformed
        UserID.setEditable(true);
        Reenter.setEnabled(false);
        Separator.setVisible(false);
        Scroll.setVisible(false);
        Authorizep.setVisible(false);
        Table.setVisible(false);
    }//GEN-LAST:event_ReenterActionPerformed

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
            java.util.logging.Logger.getLogger(Fullaccountdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fullaccountdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fullaccountdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fullaccountdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fullaccountdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Authorizep;
    private javax.swing.JButton Reenter;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JSeparator Separator;
    private javax.swing.JButton Submit;
    private javax.swing.JTable Table;
    private javax.swing.JTextField UserID;
    private javax.swing.JLabel UserIDL;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
