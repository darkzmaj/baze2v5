/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnosDodatnihPodataka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Zmaj9
 */
public class JedinicaMere extends javax.swing.JFrame {

    /**
     * Creates new form JedinicaMere
     */
    public JedinicaMere() {
        initComponents();
        prikaziSve();
    }
    
        public void prikaziSve(){
        try{
            ResultSet rs = null;
            String upit = "select *  FROM JEDINICA_MERE order by JEDMERID#";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection konekcija = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "zmaj", "root");
            PreparedStatement ps = konekcija.prepareStatement(upit);
            rs = ps.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
        
        public void pretragaPoID(){
        try{
            //ResultSet rs = null;
            String upit = "select * from JEDINICA_MERE where JEDMERID# =" +jTextField1.getText() ;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection konekcija = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "zmaj", "root");
            PreparedStatement ps = konekcija.prepareStatement(upit);
            ResultSet rs = ps.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
        
        public void pretragaPoImenu(){
        try{
            ResultSet rs = null;
            String upit = "select * from JEDINICA_MERE where JEDMERE like '%" +jTextField2.getText()+"%'" ;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection konekcija = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "zmaj", "root");
            PreparedStatement ps = konekcija.prepareStatement(upit);
            rs = ps.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
        
        
        //
        private void unesiPodatke() {                                      
    
        try{
        String upit = "insert into JEDINICA_MERE values(?,?)";
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection konekcija = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "zmaj", "root");
        PreparedStatement ps = konekcija.prepareStatement(upit);
        ps.setString (1, jTextField1.getText());
        ps.setString(2, jTextField2.getText());
        ps.executeUpdate();
        ps.close();
        konekcija.close();
        prikaziSve();
        }
    catch(Exception ex){
    JOptionPane.showMessageDialog(null, ex);
        }
        
     
    
            
            }
        //
            
        private void izmeniPodatke() {                                      
    try{
        String upit = "update jedinica_mere set jedmere = 'lala' where jedmerid# = 7";
        String upit2 = "update JEDINICA_MERE set jedmere = '"+ jTextField2.getText()+ "' where jedmerid# = " + Integer.parseInt(jTextField1.getText()) +";";
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection konekcija = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "zmaj", "root");
        PreparedStatement ps = konekcija.prepareStatement(upit2);
        ps.execute();
        ps.close();
        konekcija.close();
       // jTextField3.setText(upit2);
        prikaziSve();
        }
    catch(Exception ex){
    JOptionPane.showMessageDialog(null, ex);
        }
        }
        //
        private void obrisiPodatke() {                               
        try{
        String upit = "delete from JEDINICA_MERE where jedmerid# =" + Integer.parseInt(jTextField1.getText());
        //jTextField2.setText(null);
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection konekcija = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "zmaj", "root");
        PreparedStatement ps = konekcija.prepareStatement(upit);
        ps.execute();
        ps.close();
        konekcija.close();
        prikaziSve();
        }
    catch(Exception ex){
    JOptionPane.showMessageDialog(null, ex);
        }
        }
        //
        
        //
        
        //
        
        //

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Unesi = new javax.swing.JButton();
        Izmeni = new javax.swing.JButton();
        Obrisi = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jedinica mere");

        jLabel1.setText("Sifra Jedinice Mere");

        jLabel2.setText("Jedinica Mere");

        Unesi.setText("Unesi");
        Unesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnesiActionPerformed(evt);
            }
        });

        Izmeni.setText("Izmeni");
        Izmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IzmeniActionPerformed(evt);
            }
        });

        Obrisi.setText("Obrisi");
        Obrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObrisiActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Sifra", "Jedinica Mere"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        jButton4.setText("Pretrazi po sifri");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Prikazi sve");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Pretrazi po imenu");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Unesi)
                        .addGap(18, 18, 18)
                        .addComponent(Izmeni)
                        .addGap(10, 10, 10)
                        .addComponent(Obrisi)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton5)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Unesi)
                    .addComponent(Izmeni)
                    .addComponent(Obrisi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UnesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnesiActionPerformed
unesiPodatke();
    }//GEN-LAST:event_UnesiActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

   pretragaPoID();  

     



    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
prikaziSve();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void IzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IzmeniActionPerformed
try{
        int id = Integer.parseInt(jTextField1.getText());
        String naziv = jTextField2.getText();
        String upit = "UPDATE JEDINICA_MERE SET JEDMERE = ? WHERE JEDMERID# = ?";
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection konekcija = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "zmaj", "root");
        PreparedStatement ps = konekcija.prepareStatement(upit);
        ps.setString(1, naziv);
        ps.setInt(2, id);
        int check = ps.executeUpdate();
        prikaziSve();
        
        /*if(check > 0){
            JOptionPane.showMessageDialog(null, "Sve okej");
        }
        else
            JOptionPane.showMessageDialog(null, "Greska");
        prikaziSve();
        */
        }
    catch(Exception ex){
    JOptionPane.showMessageDialog(null, ex);
        }

/*

*/
        
    }//GEN-LAST:event_IzmeniActionPerformed

    private void ObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObrisiActionPerformed
obrisiPodatke();
    }//GEN-LAST:event_ObrisiActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
pretragaPoImenu();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(JedinicaMere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JedinicaMere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JedinicaMere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JedinicaMere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JedinicaMere().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Izmeni;
    private javax.swing.JButton Obrisi;
    private javax.swing.JButton Unesi;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
