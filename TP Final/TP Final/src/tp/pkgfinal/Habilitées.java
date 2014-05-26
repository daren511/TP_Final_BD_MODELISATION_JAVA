/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp.pkgfinal;
import java.sql.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author 200666155
 */
public class Habilitées extends javax.swing.JFrame {

    /**
     * Creates new form Habiliter
     */
    public Habilitées(ConnectionOracle conn) {
        initComponents();
        this.connBD = conn;
        BTN_Premier.doClick();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Genre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TB_IDItem = new javax.swing.JTextField();
        TB_NomItem = new javax.swing.JTextField();
        TB_Prix = new javax.swing.JTextField();
        TB_Quantite = new javax.swing.JTextField();
        TB_Description = new javax.swing.JTextField();
        BTN_Premier = new javax.swing.JButton();
        BTN_Precedent = new javax.swing.JButton();
        BTN_Suivant = new javax.swing.JButton();
        BTN_Dernier = new javax.swing.JButton();
        BTN_Ajouter = new javax.swing.JButton();
        BTN_Modifier = new javax.swing.JButton();
        BTN_Supprimer = new javax.swing.JButton();
        BTN_OK = new javax.swing.JButton();
        BTN_Vider = new javax.swing.JButton();
        CHK_Dispo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Label_Genre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Genre.setText("Habilites");

        jLabel2.setText("IDItem");

        jLabel4.setText("Nom Item");

        jLabel5.setText("Prix");

        jLabel1.setText("Quantité Dispo");

        jLabel7.setText("Description");

        TB_IDItem.setEnabled(false);

        TB_Quantite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TB_QuantiteActionPerformed(evt);
            }
        });

        BTN_Premier.setText("<<");
        BTN_Premier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_PremierActionPerformed(evt);
            }
        });

        BTN_Precedent.setText("Précédent");
        BTN_Precedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_PrecedentActionPerformed(evt);
            }
        });

        BTN_Suivant.setText("Suivant");
        BTN_Suivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SuivantActionPerformed(evt);
            }
        });

        BTN_Dernier.setText(">>");
        BTN_Dernier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DernierActionPerformed(evt);
            }
        });

        BTN_Ajouter.setText("Ajouter");
        BTN_Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AjouterActionPerformed(evt);
            }
        });

        BTN_Modifier.setText("Modifier");
        BTN_Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ModifierActionPerformed(evt);
            }
        });

        BTN_Supprimer.setText("Supprimer");
        BTN_Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SupprimerActionPerformed(evt);
            }
        });

        BTN_OK.setText("OK");
        BTN_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_OKActionPerformed(evt);
            }
        });

        BTN_Vider.setText("Vider");
        BTN_Vider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ViderActionPerformed(evt);
            }
        });

        CHK_Dispo.setText("Disponible");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TB_NomItem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TB_Prix, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TB_IDItem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BTN_Vider, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Label_Genre)
                                            .addComponent(CHK_Dispo)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TB_Description)
                                    .addComponent(TB_Quantite, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(BTN_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN_Ajouter)
                                .addGap(18, 18, 18)
                                .addComponent(BTN_Modifier)
                                .addGap(18, 18, 18)
                                .addComponent(BTN_Supprimer))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN_Premier)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_Precedent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_Suivant)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BTN_Dernier)))
                        .addGap(0, 15, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Genre)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TB_IDItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TB_NomItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TB_Prix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TB_Quantite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TB_Description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CHK_Dispo)
                .addGap(17, 17, 17)
                .addComponent(BTN_Vider)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Premier)
                    .addComponent(BTN_Precedent)
                    .addComponent(BTN_Suivant)
                    .addComponent(BTN_Dernier))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Ajouter)
                    .addComponent(BTN_Modifier)
                    .addComponent(BTN_Supprimer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(BTN_OK)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TB_QuantiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TB_QuantiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TB_QuantiteActionPerformed

    private void BTN_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_OKActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BTN_OKActionPerformed

    private void BTN_AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AjouterActionPerformed
        // TODO add your handling code here:
      
      String nomItem = TB_NomItem.getText();
      String genre =Label_Genre.getText();
      double prix = Double.parseDouble(TB_Prix.getText());
      int quantite = Integer.parseInt(TB_Quantite.getText());
      String description = TB_Description.getText();
      int disponible=0;
      if(CHK_Dispo.isSelected())
      {
          disponible = 1;
      }
      
     

      try
         {
            CallableStatement stm1 =connBD.getConnection().prepareCall("{ call GESTIONSKILL.INSERTION(?,?,?,?,?,?)}");
            
            stm1.setString(1, nomItem);
            stm1.setString(2, genre);
            stm1.setDouble(3, prix);
            stm1.setInt(4, quantite);
            stm1.setString(5, description);
            stm1.setInt(6, disponible);
            
            stm1.executeUpdate();  
            BTN_Premier.doClick();
         }
      
      catch(SQLException se){System.out.println("err" + se);}
    }//GEN-LAST:event_BTN_AjouterActionPerformed

    private void BTN_ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ModifierActionPerformed
        // TODO add your handling code here:
      int iditem = Integer.parseInt(TB_IDItem.getText());
      String nomItem = TB_NomItem.getText();
      String genre = Label_Genre.getText();
      double prix = Double.parseDouble(TB_Prix.getText());
      int quantite = Integer.parseInt(TB_Quantite.getText());
      String description = TB_Description.getText();
      int disponible=0;
      if(CHK_Dispo.isSelected())
      {
          disponible = 1;
      }
      

      try
         {
             CallableStatement stm2 =connBD.getConnection().prepareCall("{ call GESTIONSKILL.MODIFIER(?,?,?,?,?,?,?)}");
            
            stm2.setInt(1, iditem);
            stm2.setString(2, nomItem);
            stm2.setString(3, genre);
            stm2.setDouble(4, prix);
            stm2.setInt(5, quantite);
            stm2.setString(6, description);
            stm2.setInt(7, disponible);
            stm2.executeUpdate();
            BTN_Premier.doClick();
            
            
         }
      
      catch(SQLException se){System.out.println("err" + se);}
    }//GEN-LAST:event_BTN_ModifierActionPerformed

    
    private void BTN_SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SupprimerActionPerformed
        // TODO add your handling code here:
        String sqlDeleteSkill = "DELETE FROM HABILITES WHERE IDITEM = "+TB_IDItem.getText();
        String sqlDeleteItems = "DELETE FROM ITEMS WHERE IDITEM = "+TB_IDItem.getText();
        
        
        try
        {
            Statement stmDelete = connBD.getConnection().createStatement();
            stmDelete.executeQuery(sqlDeleteSkill);
            stmDelete.executeQuery(sqlDeleteItems);
            BTN_Premier.doClick(); 
        }
        catch(SQLException se)
        {
            System.out.println("err" + se);
        }
    }//GEN-LAST:event_BTN_SupprimerActionPerformed

    private void BTN_PremierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_PremierActionPerformed
        // TODO add your handling code here:
     try 
     {
         Statement stm1 = connBD.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
         rst = stm1.executeQuery(sql1);
         if (rst.first())
         {
            TB_IDItem.setText (((Integer)rst.getInt(1)).toString());
            TB_NomItem.setText(rst.getString(2));
            TB_Prix.setText(((Double)rst.getDouble(3)).toString());
            TB_Quantite.setText(((Integer)rst.getInt(4)).toString());
            TB_Description.setText(rst.getString(5)); 
            if(rst.getInt(6) == 1)
            {
                CHK_Dispo.setSelected(true);
            }
            else
            CHK_Dispo.setSelected(false);
         }
     }
     catch(SQLException se)
     { 
         System.out.println(se);
     }
    }//GEN-LAST:event_BTN_PremierActionPerformed

    private void BTN_PrecedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_PrecedentActionPerformed
        // TODO add your handling code here:
        try 
       {
          if (rst.previous())
         {
            TB_IDItem.setText (((Integer)rst.getInt(1)).toString());
            TB_NomItem.setText(rst.getString(2));
            TB_Prix.setText(((Double)rst.getDouble(3)).toString());
            TB_Quantite.setText(((Integer)rst.getInt(4)).toString());
            TB_Description.setText(rst.getString(5));
            if(rst.getInt(6) == 1)
            {
                CHK_Dispo.setSelected(true);
            }
            else
            CHK_Dispo.setSelected(false);
            
         }
          else 
          {
            JOptionPane.showMessageDialog(this, "Précedent impossible");
          }
       
       }
   
     catch(SQLException se)
     {
        JOptionPane.showMessageDialog(this, "précedent impossible");
     }
    }//GEN-LAST:event_BTN_PrecedentActionPerformed

    private void BTN_SuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SuivantActionPerformed
        // TODO add your handling code here:
        try 
     {
         if(rst.next())
          {
            TB_IDItem.setText (((Integer)rst.getInt(1)).toString());
            TB_NomItem.setText(rst.getString(2));
            TB_Prix.setText(((Double)rst.getDouble(3)).toString());
            TB_Quantite.setText(((Integer)rst.getInt(4)).toString());
            TB_Description.setText(rst.getString(5)); 
            if(rst.getInt(6) == 1)
            {
                CHK_Dispo.setSelected(true);
            }
            else
            CHK_Dispo.setSelected(false);
          }
         
      
         else 
          {
            JOptionPane.showMessageDialog(this, "suivant impossible");
          }
     }
     
     catch(SQLException se)
     {
        JOptionPane.showMessageDialog(this, "Suivant imposible");
     
     }
    }//GEN-LAST:event_BTN_SuivantActionPerformed

    private void BTN_DernierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DernierActionPerformed
        // TODO add your handling code here:
        try 
      {
         if(rst.last())
         {
            TB_IDItem.setText (((Integer)rst.getInt(1)).toString());
            TB_NomItem.setText(rst.getString(2));
            TB_Prix.setText(((Double)rst.getDouble(3)).toString());
            TB_Quantite.setText(((Integer)rst.getInt(4)).toString());
            TB_Description.setText(rst.getString(5));
            if(rst.getInt(6) == 1)
            {
                CHK_Dispo.setSelected(true);
            }
            else
            CHK_Dispo.setSelected(false);
         }
         

      
     }
     
     catch(SQLException se){
        JOptionPane.showMessageDialog(this, "dernier imposible");
     
     }
    }//GEN-LAST:event_BTN_DernierActionPerformed

    private void BTN_ViderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ViderActionPerformed
        // TODO add your handling code here:
            TB_IDItem.setText("");
            TB_NomItem.setText("");
            TB_Prix.setText("");
            TB_Quantite.setText("");
            TB_Description.setText("");
            CHK_Dispo.setSelected(false);
    }//GEN-LAST:event_BTN_ViderActionPerformed

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
            java.util.logging.Logger.getLogger(Habilitées.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Habilitées.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Habilitées.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Habilitées.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Habilitées().setVisible(true);
            }
        });
    }
// Declaration d'une variable connBD de type ConnectionOracle
   private ConnectionOracle connBD;
   ResultSet rst ;
   String sql1 = "Select I.IDITEM,I.nomItem,I.Prix,I.QuantiteDispo,H.description,I.DISPONIBLE from Items I inner join Habilites H on I.IDITEM=H.IDITEM";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Ajouter;
    private javax.swing.JButton BTN_Dernier;
    private javax.swing.JButton BTN_Modifier;
    private javax.swing.JButton BTN_OK;
    private javax.swing.JButton BTN_Precedent;
    private javax.swing.JButton BTN_Premier;
    private javax.swing.JButton BTN_Suivant;
    private javax.swing.JButton BTN_Supprimer;
    private javax.swing.JButton BTN_Vider;
    private javax.swing.JCheckBox CHK_Dispo;
    private javax.swing.JLabel Label_Genre;
    private javax.swing.JTextField TB_Description;
    private javax.swing.JTextField TB_IDItem;
    private javax.swing.JTextField TB_NomItem;
    private javax.swing.JTextField TB_Prix;
    private javax.swing.JTextField TB_Quantite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
