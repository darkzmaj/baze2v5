/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forme;

import Forme.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Zmaj9
 */
public class Ponuda extends javax.swing.JFrame {

    /**
     * Creates new form PonudaZaIzraduSaStavkama
     */
    public Ponuda() {
        initComponents();
        prikaziSvePonude();
        prikaziSvet1();
        prikaziSvet2();
        //prikaziBasSveStavkeJerZastoDaNe();
    }
    //
                public void prikaziSvePonude(){
        try{
            ResultSet rs = null;
          
            String upit = "select * from ponuda_view order by ponudaid#";
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
            
                //
                public void prikaziSvet1(){
        try{
            ResultSet rs = null;
          
            String upit = "select * from ponuda order by ponudaid#";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection konekcija = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "zmaj", "root");
            PreparedStatement ps = konekcija.prepareStatement(upit);
            rs = ps.executeQuery();
            
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    //
                
                //
                public void prikaziSvet2(){
        try{
            ResultSet rs = null;
          
            String upit = "select * from ponuda_podaci order by ponudaid#";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection konekcija = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "zmaj", "root");
            PreparedStatement ps = konekcija.prepareStatement(upit);
            rs = ps.executeQuery();
            
            jTable3.setModel(DbUtils.resultSetToTableModel(rs));  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    //
                
    public void prikaziSveStavkeNaOsnovuPonude(){
        try{
            ResultSet rs = null;
            //INSERT INTO "ZMAJ"."PONUDA_ZA_IZRADU" (PONUDAID#, DATUM, PRIMALACPONUDE, NAPOMENA, ROK, PLACANJE, FRANKO, OPCIJAPONUDE) VALUES ('2', TO_DATE('2018-01-29 17:46:56', 'YYYY-MM-DD HH24:MI:SS'), 'Marko', 'Nema', TO_DATE('2018-01-24 17:47:07', 'YYYY-MM-DD HH24:MI:SS'), 'asd', 'dsa', 'asd')
            //select PONUDAID#, DATUM, PRIMALACPONUDE, NAPOMENA, ROK, PLACANJE, FRANKO, OPCIJAPONUDE from "PONUDA_ZA_IZRADU" VALUES ('2', TO_DATE('2018-01-29 17:46:56', 'YYYY-MM-DD HH24:MI:SS'), 'Marko', 'Nema', TO_DATE('2018-01-24 17:47:07', 'YYYY-MM-DD HH24:MI:SS'), 'asd', 'dsa', 'asd')
            String upit = "select * from Stavka_Ponude where PonudaID# = "+jTextField9.getText()+" order by Stavkaid#";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection konekcija = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "zmaj", "root");
            PreparedStatement ps = konekcija.prepareStatement(upit);
            rs = ps.executeQuery();
            
            //jTable2.setModel(DbUtils.resultSetToTableModel(rs));  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }            
    //
    public void prikaziBasSveStavkeJerZastoDaNe(){
        try{
            ResultSet rs = null;
            //INSERT INTO "ZMAJ"."PONUDA_ZA_IZRADU" (PONUDAID#, DATUM, PRIMALACPONUDE, NAPOMENA, ROK, PLACANJE, FRANKO, OPCIJAPONUDE) VALUES ('2', TO_DATE('2018-01-29 17:46:56', 'YYYY-MM-DD HH24:MI:SS'), 'Marko', 'Nema', TO_DATE('2018-01-24 17:47:07', 'YYYY-MM-DD HH24:MI:SS'), 'asd', 'dsa', 'asd')
            //select PONUDAID#, DATUM, PRIMALACPONUDE, NAPOMENA, ROK, PLACANJE, FRANKO, OPCIJAPONUDE from "PONUDA_ZA_IZRADU" VALUES ('2', TO_DATE('2018-01-29 17:46:56', 'YYYY-MM-DD HH24:MI:SS'), 'Marko', 'Nema', TO_DATE('2018-01-24 17:47:07', 'YYYY-MM-DD HH24:MI:SS'), 'asd', 'dsa', 'asd')
            String upit = "select * from Stavka_Ponude";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection konekcija = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "zmaj", "root");
            PreparedStatement ps = konekcija.prepareStatement(upit);
            rs = ps.executeQuery();
            
            //jTable2.setModel(DbUtils.resultSetToTableModel(rs));  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }            
    //
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        brisanjePonuda1 = new javax.swing.JButton();
        unosPonuda1 = new javax.swing.JButton();
        izmenaPonuda1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ponuda za izradu");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Sifra ponude");

        jButton1.setText("Prikazi sve");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Datum");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Uslovi prodaje");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Rok isporuke");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Uslovi placanje");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel6.setText("Incoterms");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel7.setText("Rok vazenja ponude");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel8.setText("Mesto");

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jLabel9.setText("Napomena");

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        brisanjePonuda1.setText("Brisanje");
        brisanjePonuda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brisanjePonuda1ActionPerformed(evt);
            }
        });

        unosPonuda1.setText("Unos");
        unosPonuda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unosPonuda1ActionPerformed(evt);
            }
        });

        izmenaPonuda1.setText("Izmena");
        izmenaPonuda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izmenaPonuda1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(unosPonuda1)
                        .addGap(10, 10, 10)
                        .addComponent(izmenaPonuda1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(brisanjePonuda1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4))
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel8))
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3))
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5))
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unosPonuda1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(izmenaPonuda1)
                                .addComponent(brisanjePonuda1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        prikaziSvePonude();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void brisanjePonuda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brisanjePonuda1ActionPerformed
        // TODO add your handling code here:
        
        
        
        
                prikaziSvePonude();
        prikaziSvet1();
        prikaziSvet2();
        //
    }//GEN-LAST:event_brisanjePonuda1ActionPerformed

    private void unosPonuda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unosPonuda1ActionPerformed
        // TODO add your handling code here:
        try{
                    Class.forName("oracle.jdbc.driver.OracleDriver");
            }
	catch (ClassNotFoundException e){
                        JOptionPane.showMessageDialog(null, "Greska u loadovanju drajvera");
                }
                
                Connection con = null;
                Statement stmt = null;
               
        try{      
                    String URL = "jdbc:oracle:thin:@localhost:1521:xe";
                    String username = "zmaj";
                    String password = "root";
                    
                    con = DriverManager.getConnection(URL, username, password);
                    stmt = con.createStatement();
                    String sql = "INSERT INTO PONUDA_VIEW VALUES ("+Integer.parseInt(jTextField1.getText())+", TO_DATE('"+jTextField2.getText()+" 17:46:56', 'YYYY-MM-DD HH24:MI:SS'), TO_DATE('"+jTextField4.getText()+" 17:46:56', 'YYYY-MM-DD HH24:MI:SS'), '"+jTextField8.getText()+"', '"+jTextField3.getText()+"','"+jTextField5.getText()+"','"+jTextField6.getText()+"', TO_DATE('"+jTextField7.getText()+" 17:46:56', 'YYYY-MM-DD HH24:MI:SS'), '"+jTextField9.getText()+"')";
                    String sql3 = "UPDATE PONUDA_VIEW SET datum = TO_DATE('"+jTextField2.getText()+" 17:46:56', 'YYYY-MM-DD HH24:MI:SS'), rokisporuke TO_DATE('"+jTextField4.getText()+" 17:46:56', 'YYYY-MM-DD HH24:MI:SS'), mesto = '"+jTextField8.getText()+"', usloviprodaje = '"+jTextField3.getText()+"',usloviplacanja = '"+jTextField5.getText()+"',incoterms = '"+jTextField6.getText()+"', rokvazenjaponude = TO_DATE('"+jTextField7.getText()+" 17:46:56', 'YYYY-MM-DD HH24:MI:SS'), napomena = '"+jTextField9.getText()+"' where ponudaid# = "+ jTextField1.getText();

                    int i = stmt.executeUpdate(sql);
                                
                    if(i > 0){
                        JOptionPane.showMessageDialog(null, "Row is created");
			}
			else{
			JOptionPane.showMessageDialog(null, "Row is not created");
			}
                }
        catch(Exception e){
                    e.printStackTrace();
                }
        try{
                    if(stmt!=null){
			stmt.close();
			stmt=null;
				}
            }
			catch (SQLException e){
				e.printStackTrace();
                                                }
			try{
				if(con!=null){
					con.close();
					con=null;
                                                }
                            }
			catch (SQLException e){
				e.printStackTrace();
                                                }
        prikaziSvePonude();
        prikaziSvet1();
        prikaziSvet2();
        //
    }//GEN-LAST:event_unosPonuda1ActionPerformed

    private void izmenaPonuda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izmenaPonuda1ActionPerformed
        // TODO add your handling code here:
        try{
                    Class.forName("oracle.jdbc.driver.OracleDriver");
            }
	catch (ClassNotFoundException e){
                        JOptionPane.showMessageDialog(null, "Greska u loadovanju drajvera");
                }
                
                Connection con = null;
                Statement stmt = null;
               
        try{      
                    String URL = "jdbc:oracle:thin:@localhost:1521:xe";
                    String username = "zmaj";
                    String password = "root";
                    
                    con = DriverManager.getConnection(URL, username, password);
                    stmt = con.createStatement();
                    String sql = "update PONUDA SET DATUM = TO_DATE('"+jTextField2.getText()+" 17:46:56', 'YYYY-MM-DD HH24:MI:SS'), ROKISPORUKE = TO_DATE('"+jTextField4.getText()+" 17:46:56', 'YYYY-MM-DD HH24:MI:SS'), MESTO ='"+jTextField4.getText()+"' where PONUDAID# = " + jTextField1.getText();
                    String sql5 = "UPDATE PONUDA_VIEW SET DATUM = TO_DATE('"+jTextField2.getText()+" 17:46:56', 'YYYY-MM-DD HH24:MI:SS'), ROKISPORUKE = TO_DATE('"+jTextField4.getText()+" 17:46:56', 'YYYY-MM-DD HH24:MI:SS'), MESTO = '"+jTextField8.getText()+"', USLOVIPRODAJE = '"+jTextField3.getText()+"', USLOVIPLACANJA = '"+jTextField5.getText()+"', INCOTERMS = '"+jTextField6.getText()+"', ROKVAZENJAPONUDe = TO_DATE('"+jTextField7.getText()+" 17:46:56', 'YYYY-MM-DD HH24:MI:SS'),NAPOMENA =  '"+jTextField9.getText()+"' WHERE PONUDAID# ="+jTextField1.getText();

//   String sql = "INSERT INTO PONUDA VALUES ("+Integer.parseInt(jTextField1.getText())+", 'YYYY-MM-DD HH24:MI:SS'), '"+jTextField8.getText()+"')";
	//, TO_DATE('"++" 17:46:56', 				
       int i = stmt.executeUpdate(sql5);
                                
                    if(i > 0){
                        JOptionPane.showMessageDialog(null, "Row is updated");
			}
			else{
			JOptionPane.showMessageDialog(null, "Row is not updated");
			}
                }
        catch(Exception e){
                    e.printStackTrace();
                }
        try{
                    if(stmt!=null){
			stmt.close();
			stmt=null;
				}
            }
	catch (SQLException e){
		e.printStackTrace();
                                                }
	try{
	if(con!=null){
            con.close();
            con=null;
                      }
                            }
	catch (SQLException e){
				e.printStackTrace();
                                                }

        prikaziSvePonude();
        prikaziSvet1();
        prikaziSvet2();
        //
        
    }//GEN-LAST:event_izmenaPonuda1ActionPerformed
//
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
            java.util.logging.Logger.getLogger(Ponuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ponuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ponuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ponuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ponuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brisanjePonuda1;
    private javax.swing.JButton izmenaPonuda1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton unosPonuda1;
    // End of variables declaration//GEN-END:variables
}
