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
public class Armure extends javax.swing.JFrame {

    /**
     * Creates new form Armure
     */
    public Armure(ConnectionOracle conn) {
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

        IDItem = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TB_ID = new javax.swing.JTextField();
        TB_NomItem = new javax.swing.JTextField();
        TB_Prix = new javax.swing.JTextField();
        TB_Quantite = new javax.swing.JTextField();
        TB_Matiere = new javax.swing.JTextField();
        TB_Poids = new javax.swing.JTextField();
        TB_Taille = new javax.swing.JTextField();
        TB_Efficacite = new javax.swing.JTextField();
        L_Genre = new javax.swing.JLabel();
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

        IDItem.setText("IDItem");

        jLabel2.setText("NomItem");

        jLabel3.setText("Prix");

        jLabel4.setText("Quantité Dispo");

        jLabel5.setText("Matière");

        jLabel6.setText("Poids");

        jLabel7.setText("Taille");

        jLabel8.setText("Efficacité");

        TB_ID.setEnabled(false);

        TB_Matiere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TB_MatiereActionPerformed(evt);
            }
        });

        L_Genre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L_Genre.setText("Armures");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BTN_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN_Ajouter)
                                .addGap(30, 30, 30)
                                .addComponent(BTN_Modifier)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_Supprimer))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(L_Genre))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(IDItem)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TB_Efficacite)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(TB_Matiere, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                                .addComponent(TB_Taille))
                                            .addComponent(TB_Quantite, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                            .addComponent(CHK_Dispo)
                                            .addComponent(BTN_Vider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TB_Poids)
                                            .addComponent(TB_NomItem)
                                            .addComponent(TB_Prix, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                            .addComponent(TB_ID)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN_Premier)
                                .addGap(18, 18, 18)
                                .addComponent(BTN_Precedent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_Suivant)
                                .addGap(18, 18, 18)
                                .addComponent(BTN_Dernier)))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_Genre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDItem)
                    .addComponent(TB_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TB_NomItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(TB_Prix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TB_Quantite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(TB_Matiere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(TB_Taille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TB_Efficacite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(TB_Poids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CHK_Dispo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTN_Vider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Premier)
                    .addComponent(BTN_Precedent)
                    .addComponent(BTN_Suivant)
                    .addComponent(BTN_Dernier))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Ajouter)
                    .addComponent(BTN_Modifier)
                    .addComponent(BTN_Supprimer))
                .addGap(28, 28, 28)
                .addComponent(BTN_OK)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TB_MatiereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TB_MatiereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TB_MatiereActionPerformed

    private void BTN_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_OKActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BTN_OKActionPerformed

    private void BTN_AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AjouterActionPerformed
      String nomItem = TB_NomItem.getText();
      String genre = L_Genre.getText();
      double prix = Double.parseDouble(TB_Prix.getText());
      int quantite = Integer.parseInt(TB_Quantite.getText());
      String matiere = TB_Matiere.getText();
      int taille = Integer.parseInt(TB_Taille.getText());
      int efficacite = Integer.parseInt(TB_Efficacite.getText());
      int poids = Integer.parseInt(TB_Poids.getText());
      int disponible = 0;
      if(CHK_Dispo.isSelected())
      {
          disponible = 1;
      }
     

      try
         {
            CallableStatement stminsertArmures = connBD.getConnection().prepareCall("{ call GESTIONARMURE.INSERTION(?,?,?,?,?,?,?,?,?)}");
            
            stminsertArmures.setString(1, nomItem);
            stminsertArmures.setString(2, genre);
            stminsertArmures.setDouble(3, prix);
            stminsertArmures.setInt(4, quantite);
            stminsertArmures.setInt(5, disponible);
            stminsertArmures.setString(6, matiere);
            stminsertArmures.setInt(7, taille);
            stminsertArmures.setInt(8,efficacite);
            stminsertArmures.setInt(9, poids);
            stminsertArmures.executeUpdate();
         }
      
      catch(SQLException se){System.out.println("err" + se);}  
    }//GEN-LAST:event_BTN_AjouterActionPerformed

    private void BTN_ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ModifierActionPerformed
        
      
      int idItem = Integer.parseInt(TB_ID.getText());
      String nomItem = TB_NomItem.getText();
      String genre = L_Genre.getText();
      double prix = Double.parseDouble(TB_Prix.getText());
      int quantite = Integer.parseInt(TB_Quantite.getText());
      String matiere = TB_Matiere.getText();
      int taille = Integer.parseInt(TB_Taille.getText());
      int efficacite = Integer.parseInt(TB_Efficacite.getText());
      int poids = Integer.parseInt(TB_Poids.getText());
      int disponible=0;
      if(CHK_Dispo.isSelected())
      {
          disponible = 1;
      }

      try
         {
            //PreparedStatement stmupdateArmures= connBD.getConnection().prepareStatement(sqlupdateArmures);
            //PreparedStatement stmupdateItems= connBD.getConnection().prepareStatement(sqlupdateItems);
            CallableStatement stmupdateArmures = connBD.getConnection().prepareCall("{ call GESTIONARMURE.MODIFIER(?,?,?,?,?,?,?,?,?,?)}");
            
            stmupdateArmures.setInt(1, idItem);
            stmupdateArmures.setString(2, nomItem);
            stmupdateArmures.setString(3, genre);
            stmupdateArmures.setDouble(4, prix);
            stmupdateArmures.setInt(5, quantite);
            stmupdateArmures.setInt(6, disponible);
            stmupdateArmures.setString(7, matiere);
            stmupdateArmures.setInt(8, taille);
            stmupdateArmures.setInt(9, efficacite);
            stmupdateArmures.setInt(10, poids);
            stmupdateArmures.executeUpdate();  
         }
      
      catch(SQLException se){System.out.println("err" + se);}
    }//GEN-LAST:event_BTN_ModifierActionPerformed

    private void BTN_SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SupprimerActionPerformed
        // TODO add your handling code here:
        String sqlDeleteArmures = "DELETE FROM ARMURES WHERE IDITEM = "+TB_ID.getText();
        String sqlDeleteItems = "DELETE FROM ITEMS WHERE IDITEM = "+TB_ID.getText();
        
        
        try
        {
            Statement stmDelete = connBD.getConnection().createStatement();
            stmDelete.executeQuery(sqlDeleteArmures);
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
            TB_ID.setText (((Integer)rst.getInt(1)).toString());
            TB_NomItem.setText(rst.getString(2));
            TB_Prix.setText(((Double)rst.getDouble(3)).toString());
            TB_Quantite.setText(((Integer)rst.getInt(4)).toString());
            TB_Matiere.setText(rst.getString(5));
            TB_Taille.setText(((Integer)rst.getInt(6)).toString());
            TB_Efficacite.setText(((Integer)rst.getInt(7)).toString());
            TB_Poids.setText(((Integer)rst.getInt(8)).toString());
            if(rst.getInt(9) == 1)
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
            TB_ID.setText (((Integer)rst.getInt(1)).toString());
            TB_NomItem.setText(rst.getString(2));
            TB_Prix.setText(((Double)rst.getDouble(3)).toString());
            TB_Quantite.setText(((Integer)rst.getInt(4)).toString());
            TB_Matiere.setText(rst.getString(5));
            TB_Taille.setText(((Integer)rst.getInt(6)).toString());
            TB_Efficacite.setText(((Integer)rst.getInt(7)).toString());
            TB_Poids.setText(((Integer)rst.getInt(8)).toString());
            if(rst.getInt(9) == 1)
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
            TB_ID.setText (((Integer)rst.getInt(1)).toString());
            TB_NomItem.setText(rst.getString(2));
            TB_Prix.setText(((Double)rst.getDouble(3)).toString());
            TB_Quantite.setText(((Integer)rst.getInt(4)).toString());
            TB_Matiere.setText(rst.getString(5));
            TB_Taille.setText(((Integer)rst.getInt(6)).toString());
            TB_Efficacite.setText(((Integer)rst.getInt(7)).toString());
            TB_Poids.setText(((Integer)rst.getInt(8)).toString());
            if(rst.getInt(9) == 1)
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
            TB_ID.setText (((Integer)rst.getInt(1)).toString());
            TB_NomItem.setText(rst.getString(2));
            TB_Prix.setText(((Double)rst.getDouble(3)).toString());
            TB_Quantite.setText(((Integer)rst.getInt(4)).toString());
            TB_Matiere.setText(rst.getString(5));
            TB_Taille.setText(((Integer)rst.getInt(6)).toString());
            TB_Efficacite.setText(((Integer)rst.getInt(7)).toString());
            TB_Poids.setText(((Integer)rst.getInt(8)).toString());
            if(rst.getInt(9) == 1)
            {
                CHK_Dispo.setSelected(true);
            }
            else
                CHK_Dispo.setSelected(false);
         }    
     }
     catch(SQLException se)
     {
        JOptionPane.showMessageDialog(this, "dernier imposible");
     }
    }//GEN-LAST:event_BTN_DernierActionPerformed

    private void BTN_ViderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ViderActionPerformed
        // TODO add your handling code here:
            TB_ID.setText("");
            TB_NomItem.setText("");
            TB_Prix.setText("");
            TB_Quantite.setText("");
            TB_Matiere.setText("");
            TB_Taille.setText("");
            TB_Efficacite.setText("");
            TB_Poids.setText("");
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
            java.util.logging.Logger.getLogger(Armure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Armure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Armure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Armure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Armure().setVisible(true);
            }
        });
    }
// Declaration d'une variable connBD de type ConnectionOracle
   private ConnectionOracle connBD;
   ResultSet rst ;
   String sql1 = "Select I.IDITEM,I.nomItem,I.Prix,I.QuantiteDispo,A.matiere,A.taille,A.efficacite,A.poids,I.disponible from Items I inner join Armures A on I.IDITEM=A.IDITEM";
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
    private javax.swing.JLabel IDItem;
    private javax.swing.JLabel L_Genre;
    private javax.swing.JTextField TB_Efficacite;
    private javax.swing.JTextField TB_ID;
    private javax.swing.JTextField TB_Matiere;
    private javax.swing.JTextField TB_NomItem;
    private javax.swing.JTextField TB_Poids;
    private javax.swing.JTextField TB_Prix;
    private javax.swing.JTextField TB_Quantite;
    private javax.swing.JTextField TB_Taille;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
