/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import control.ControlInsurance;
import da.InsuranceDA;
import domain.Insurance;
import da.InsuranceTable;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.PatternSyntaxException;
import javax.swing.ButtonGroup;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.*;
/**
 *
 * @author win7
 */
public class ManageInsurance extends javax.swing.JFrame {
    
    private ControlInsurance insurance = new ControlInsurance();
    private InsuranceTable tableModel2;
    private TableRowSorter<TableModel> sorter;
    /**
     * Creates new form ManageStaff
     */
    private ButtonGroup group;
    ImageIcon insicon = new ImageIcon(getClass().getResource("/images/insicon.png"));
    ImageIcon saveicon = new ImageIcon(getClass().getResource("/images/saveicon.png"));
    
    public ManageInsurance() {
        initTable1();  
        initComponents();
        setSize(670, 680);
        setLocationRelativeTo(null);
    }
    
 private void initTable1(){
        try{
         tableModel2 = new InsuranceTable();
         jTable1 = new JTable(tableModel2);
         sorter = new TableRowSorter<TableModel>(jTable1.getModel());
            jTable1.setRowSorter(sorter);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        Back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Staff");
        setUndecorated(true);

        jPanel1.setToolTipText("");
        jPanel1.setMinimumSize(new java.awt.Dimension(690, 680));
        jPanel1.setPreferredSize(new java.awt.Dimension(690, 680));
        jPanel1.setLayout(null);

        Back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/insTitle.png"))); // NOI18N
        Back.setBorder(null);
        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.setOpaque(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(20, 0, 620, 99);

        jScrollPane1.setOpaque(false);

        jTable1.setModel(tableModel2);
        jTable1.setGridColor(new java.awt.Color(102, 102, 255));
        jTable1.setOpaque(false);
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 160, 580, 170);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        jPanel2.setOpaque(false);

        jTextField1.setEditable(false);
        jTextField1.setPreferredSize(new java.awt.Dimension(34, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Insurance ID :");

        jButton2.setMnemonic('S');
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField3.setText("I1001");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Price                 : RM");

        jButton1.setMnemonic('C');
        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Description     :   ");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 390, 440, 220);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel3.setOpaque(false);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setMnemonic('D');
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setMnemonic('E');
        jButton6.setText("Edit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setMnemonic('A');
        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(490, 390, 140, 220);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setMnemonic('R');
        jButton8.setText("REFRESH");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(520, 340, 100, 23);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setMnemonic('B');
        jButton9.setText("BACK");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(50, 340, 100, 23);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(160, 110, 240, 30);

        jButton3.setMnemonic('H');
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(420, 110, 90, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bestdoraemonBG.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(-20, 0, 690, 690);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:       
        String insId = jTextField3.getText();
        
        ControlInsurance insurance = new ControlInsurance();
        domain.Insurance ins = insurance.selectRecord(insId);

            if (ins != null) {
         
               jTextField1.setText(String.valueOf(ins.getPrice()));
               jTextArea1.setText(ins.getDescription());

            } else {
                JOptionPane.showMessageDialog(null, "No records found in database.", "NO RECORDS", JOptionPane.ERROR_MESSAGE);
                jTextField1.setText("");
                jTextArea1.setText("");
                jTextField6.setText("");
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                jTextField1.setText("");
                jTextArea1.setText("");
                jTextField3.setText("");
                jTextField6.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        String insId = jTextField3.getText();
        
        ControlInsurance insurance = new ControlInsurance();
        domain.Insurance ins = insurance.selectRecord(insId);

            if (ins != null) {
                JOptionPane.showMessageDialog(null, "Existing ID or Invalid ID");
                     
            } 
            else {
                    if(insId.length()>5||insId.length()<5){
                      JOptionPane.showMessageDialog(null, "ID must be exactly 5 digit!"); 
                    }
        else{
        //domain.Member mem = member.selectRecord(memberId);
                  /*int option=0;
                  String desc=null;
                  double price=0;
                  
                  String insId="";
                  String latest = insurance.getlast();
                  for(int x=1;x<5;x++){
                      insId += latest.charAt(x);
                  }
                  int insID = Integer.parseInt(insId)+1;
                  insId = "I" + String.format("%d", insID);
                  
                  JOptionPane.showMessageDialog(null,"    New insurance ID is "+ insId +"              ", "New Insurance ID", JOptionPane.INFORMATION_MESSAGE, insicon);*/
                            int option=0;
                            String desc=null;
                            double price=0;
                            
                    do{
                            try{    
                                    option=0;
                                    price = Double.parseDouble(JOptionPane.showInputDialog("Enter Insurance Price : RM "));
 
                                }catch(IllegalArgumentException ex){
                                             JOptionPane.showMessageDialog(null, "Please key in price format !\n For example: XXX.XX", "Invalid Add", JOptionPane.ERROR_MESSAGE);
                                             option++;
                                }catch(NullPointerException ex){
                                }
                        }while(option==1);

                        do{ 
                                option=0;
                                desc = JOptionPane.showInputDialog("Enter Insurance Description :");

                            if(desc != null)
                            {
                                    if(desc.isEmpty()){
                                            JOptionPane.showMessageDialog(null, "Please fill up Insurance Description !\n( Must in Character Format ) ", "Invalid Add", JOptionPane.ERROR_MESSAGE);   
                                            option=1;
                                    }
                                    else{
                                            option=2;
                                    }   
                            }
                            else{
                                    new ManageInsurance();
                                    option=0;
                            }
                        }while(option==1);

                    if(option==2){
                        Insurance insdetail = new Insurance(insId, desc, price);
                        insurance.addRecord(insdetail);
       
                        JOptionPane.showMessageDialog(null, "Thank you , Records saved", "Successfully Saved!" ,JOptionPane.INFORMATION_MESSAGE, saveicon);                
                    } 
                    }
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
         String insId = jTextField3.getText();
        
        ControlInsurance insurance = new ControlInsurance();
        domain.Insurance ins = insurance.selectRecord(insId);
        try{
        
        if(jTextField1.getText().equals(String.valueOf(ins.getPrice()))&&jTextArea1.getText().equals(ins.getDescription())){
            
            int option=0;
            String desc=null;
            double price=0;

            Object[] options5 = {"Yes, edit price","No, remains!"};
            int s = JOptionPane.showOptionDialog(null,"Would you like to "+ "edit the INSURANCE PRICE?","Update Insurance Price?",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options5,options5[1]); 
            
            if(s==0){
                do{
                                        try{
                                            option=0;
                                            price = Double.parseDouble(JOptionPane.showInputDialog("Enter Insurance Price : RM "));

                                        }catch(IllegalArgumentException ex){
                                            JOptionPane.showMessageDialog(null, "Please key in price format !\n For example: XXX.XX", "Invalid Update", JOptionPane.ERROR_MESSAGE);
                                             option++;
                                        }
                                        catch(NullPointerException ex){
                                            option=3;
                                        }
                    }while(option==1);
            }
            else{
                price=ins.getPrice();
                option=0;
            }
            
        if(option==0){    
            Object[] options = {"Yes, edit desciption","No, remains!"};
            int n = JOptionPane.showOptionDialog(null,"Would you like to "+ "edit the insurance description?","Update Description?",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
            
            if(n==0){
                do{
                        desc =JOptionPane.showInputDialog("Enter Insurance Description :");
                        if(desc != null)
                        {
                            if( desc.isEmpty() || !desc.matches("[A-Z a-z]*")){
                                JOptionPane.showMessageDialog(null, "Please fill up Insurance Description !\n( Must in Character Format ) ", "Invalid Update", JOptionPane.ERROR_MESSAGE);   
                                option=1;
                            }
                            else{
                                option=4;
                            }   
                        }
                        else{
                            new ManageInsurance();
                            option=0;
                        }
                    }while(option==1);
                
            }
            else{
                 desc = ins.getDescription();
                 option=4;
            }
            
             
            if(option==4){ 
               Insurance insdetail = new Insurance(insId, desc, price);
               insurance.updateRecord(insdetail);
 
                JOptionPane.showMessageDialog(null, "Thank you , Records updated", "Successfully Saved!" ,JOptionPane.INFORMATION_MESSAGE, saveicon);
                jTextArea1.setText(desc);
                jTextField1.setText(String.format("%.2f",price));

            } //option is 4.
            } //option is 3;
        }
        else
        {
             JOptionPane.showMessageDialog(null, "Please check ID First");
        }
         }catch(NullPointerException ex){
             JOptionPane.showMessageDialog(null,"Invalid Insurance ID !");     
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

            String insId = jTextField3.getText();
        
        ControlInsurance insurance = new ControlInsurance();
        
        domain.Insurance ins = insurance.selectRecord(insId);
            
        
            if (ins == null) {
                JOptionPane.showMessageDialog(null, "No records found in database");    
            } 
            else {
                
                if(jTextField1.getText().equals(String.valueOf(ins.getPrice()))&&jTextArea1.getText().equals(ins.getDescription())){
                
                        insurance.deleteRecord(ins);
                         jTextField1.setText("");
                         jTextArea1.setText("");
                         jTextField3.setText("");
                }
                else{
                        JOptionPane.showMessageDialog(null, "Please check ID First");
                }
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        dispose();
        new ManageInsurance().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        dispose();
        new ManageInsurance();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
        String text = jTextField6.getText();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            try {
                sorter.setRowFilter(RowFilter.regexFilter(text));
            } catch (PatternSyntaxException pse) {
                JOptionPane.showMessageDialog(null, "Bad regex pattern", "Bad regex pattern", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{

            String query= "SELECT * FROM INSURANCE";
            String search = (jTextField6.getText());
            search.toUpperCase();
            if(!search.equals(""))
            query = "SELECT * FROM INSURANCE WHERE InsuranceID = '"+ search+ "'";

            tableModel2.setQuery(query);

        }catch(IllegalArgumentException ex){
            if(jTextField6.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Insurance ID can't be empty !", "INVALID TYPE", JOptionPane.ERROR_MESSAGE);
                jTextField6.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "ID Does Not Exits", "ID NOT FOUND", JOptionPane.ERROR_MESSAGE);
                jTextField6.setText("");
            }
        } catch (IllegalStateException ex) {
            Logger.getLogger(ManageInsurance.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManageInsurance.class.getName()).log(Level.SEVERE, null, ex);
        }

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
            java.util.logging.Logger.getLogger(ManageInsurance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageInsurance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageInsurance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageInsurance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ManageInsurance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}