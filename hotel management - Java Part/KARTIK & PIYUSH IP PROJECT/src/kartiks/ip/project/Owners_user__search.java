/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kartiks.ip.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KARTIK NIGHANIA
 */
public class Owners_user__search extends javax.swing.JFrame {

    /**
     * Creates new form Owners_user__search
     */
    public Owners_user__search() {
      initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel23 = new javax.swing.JLabel();
        sp = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        match = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        no = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 255, 51));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("MEMBERS FOUND :");
        jLabel23.setOpaque(true);
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 220, -1));

        sp.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        sp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 70, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Untitled~1.jpg"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 100, 90));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/MENU LOGO.JPG"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 170, 70));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/refresh.jpg"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, 110, 80));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 255, 51));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("TO BE DELETED :");
        jLabel22.setOpaque(true);
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 200, -1));

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 255, 51));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText(" MEMBER'S NAME");
        jLabel21.setOpaque(true);
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 200, -1));

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 255, 51));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("ENTER ID OF USER");
        jLabel24.setOpaque(true);
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 220, -1));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 255, 51));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("ENTER INITIAL LETTERS OF");
        jLabel20.setOpaque(true);
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 310, -1));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 255, 51));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("TOTAL NUMBER OF");
        jLabel19.setOpaque(true);
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 220, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Untitled.png"))); // NOI18N
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 110, 140));

        match.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchActionPerformed(evt);
            }
        });
        match.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                matchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                matchKeyTyped(evt);
            }
        });
        getContentPane().add(match, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 160, 40));

        tbl.setBackground(new java.awt.Color(0, 0, 0));
        tbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbl.setForeground(new java.awt.Color(0, 255, 0));
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "STATUS", "NAME", "GENDER", "PASSWORD", "DATE LOGGED IN", "DATE CREATED"
            }
        ));
        tbl.setSelectionBackground(new java.awt.Color(102, 255, 255));
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 910, 240));

        jLabel4.setBackground(new java.awt.Color(255, 255, 51));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 930, 260));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/cancel button.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 70, 60));

        no.setBackground(new java.awt.Color(0, 0, 0));
        no.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        no.setForeground(new java.awt.Color(51, 255, 51));
        no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        no.setOpaque(true);
        getContentPane().add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 70, 50));

        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, 260));

        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 580, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/steampunk_gears_by_tearful_oblivion~3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void search_database(){
    String key=(match.getText().toLowerCase());
    try{
            Class.forName("java.sql.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/subway","root","123");
Statement stmt=con.createStatement();
String match="select count(*) as total_no_of_members from members where name like '"+key+"%';";
ResultSet rs=stmt.executeQuery(match);
while(rs.next()){
String number1=rs.getString("total_no_of_members");
int number=Integer.parseInt(number1);
String search="select * from members where name like '"+key+"%' ;";
rs=stmt.executeQuery(search); 

/*To remove all rows from table*/
DefaultTableModel tables=  (DefaultTableModel)tbl.getModel() ;
  int count=tables.getRowCount();
  int m;
  
  for(m=count; m>0; m--){
      tables.removeRow(0);
    }
    tbl.setModel(tables);
  /*To add all values to table*/
int i;
for(i=number;i>=0;i--){
    while(rs.next()){
      int ID=Integer.parseInt(rs.getString("ID"));
    String status=rs.getString("status");
     String name=rs.getString("name");
      String gender=rs.getString("gender");
       String password=rs.getString("password");
        String date_last_logged_in=rs.getString("date_last_logged_in");
         String date_created=rs.getString("date_created");
    
    
   Object [] names_found={ ID, status, name, gender, password, date_last_logged_in, date_created};
    DefaultTableModel table=  (DefaultTableModel)tbl.getModel() ;
    table.addRow(names_found);
    
    }
    
}

no.setText(""+ tbl.getRowCount());

}

}
catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage());
 }
    
}
    
    
    
    
    private void matchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matchKeyTyped

     
    }//GEN-LAST:event_matchKeyTyped

    private void matchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matchActionPerformed

    private void matchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matchKeyReleased
 
     char ch= evt.getKeyChar();
   if(! (((ch>='a') && (ch<='z')) || ((ch>='A') && (ch<='Z'))) ){
        evt.consume();
   }
  else
  search_database() ;
   
    }//GEN-LAST:event_matchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    new owners_dashboard().setVisible(true);
    dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
 
    }//GEN-LAST:event_tblMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     int id=(Integer)(sp.getValue());
     if(id==101){
         JOptionPane.showMessageDialog(null, "SORRY!. THIS ACCOUNT BELONGS TO THE OWNER AND CANNOT  BE DELETED.");
     }
     else{
         try {
            Class.forName("java.sql.Driver");
       
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/subway","root","123");
String delete_records_from_members="delete from members where ID ="+ id +" ;";
     String delete_records_from_contact_info="delete from contact_info where ID ="+ id +" ;";
     String delete_records_from_orders="delete from orders where ID ="+ id +" ;";
 
     
     
Statement stmt1=con.createStatement();
Statement stmt2=con.createStatement();
Statement stmt3=con.createStatement();

stmt1.executeUpdate(delete_records_from_members);
stmt2.executeUpdate(delete_records_from_contact_info);
stmt2.executeUpdate(delete_records_from_orders);
   JOptionPane.showMessageDialog(null, "ACCOUNT DELETED SUCCESSFULLY.");
con.close();  
}
 catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
 }
  }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
search_database();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Owners_user__search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Owners_user__search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Owners_user__search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Owners_user__search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Owners_user__search().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField match;
    private javax.swing.JLabel no;
    private javax.swing.JSpinner sp;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}
