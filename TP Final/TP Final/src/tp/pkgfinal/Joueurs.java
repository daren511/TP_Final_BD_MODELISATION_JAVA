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
 * @author 201106779
 */
public class Joueurs extends javax.swing.JFrame {

    /**
     * Creates new form Joueurs
     */
    public Joueurs(ConnectionOracle conn) {
        initComponents();
        this.connBD=conn;
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Liste_Items = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TB_IDJOUEUR = new javax.swing.JTextField();
        TB_NomUsager = new javax.swing.JTextField();
        TB_NomJoueur = new javax.swing.JTextField();
        TB_PrenomJoueur = new javax.swing.JTextField();
        TB_Ecus = new javax.swing.JTextField();
        TB_MotDePasse = new javax.swing.JTextField();
        BTN_MonterEcus = new javax.swing.JButton();
        BTN_Premier = new javax.swing.JButton();
        BTN_Precedent = new javax.swing.JButton();
        BTN_Suivant = new javax.swing.JButton();
        BTN_Dernier = new javax.swing.JButton();
        BTN_OK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Joueurs");

        jScrollPane1.setViewportView(Liste_Items);

        jLabel2.setText("ID Joueur");

        jLabel3.setText("NomUsager");

        jLabel4.setText("Nom Joueur");

        jLabel5.setText("Prenom Joueur");

        jLabel6.setText("Écus");

        jLabel7.setText("Mot de Passe");

        TB_IDJOUEUR.setEnabled(false);

        TB_NomUsager.setEnabled(false);

        TB_NomJoueur.setEnabled(false);

        TB_PrenomJoueur.setEnabled(false);

        TB_Ecus.setEnabled(false);

        TB_MotDePasse.setEnabled(false);

        BTN_MonterEcus.setText("Écus +100");
        BTN_MonterEcus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_MonterEcusActionPerformed(evt);
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

        BTN_OK.setText("OK");
        BTN_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TB_NomUsager, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TB_NomJoueur, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TB_IDJOUEUR, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TB_Ecus)
                                    .addComponent(TB_PrenomJoueur)
                                    .addComponent(TB_MotDePasse))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addGap(181, 181, 181)
                                .addComponent(BTN_MonterEcus)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTN_Premier)
                .addGap(18, 18, 18)
                .addComponent(BTN_Precedent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTN_OK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_Suivant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTN_Dernier)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TB_IDJOUEUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TB_NomUsager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TB_NomJoueur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TB_PrenomJoueur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TB_Ecus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_MonterEcus))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TB_MotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Premier)
                    .addComponent(BTN_Precedent)
                    .addComponent(BTN_Suivant)
                    .addComponent(BTN_Dernier))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(BTN_OK)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_OKActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BTN_OKActionPerformed

    private void BTN_MonterEcusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_MonterEcusActionPerformed
        // TODO add your handling code here:
        double ecusactuel =Double.parseDouble(TB_Ecus.getText());
        int id =  Integer.parseInt(TB_IDJOUEUR.getText());
        double ecusmodifie = ecusactuel + 100.00;
        
        try
         {
            CallableStatement stmaddecus = connBD.getConnection().prepareCall("{ call GESTIONJOUEURS.AJOUTECUS(?,?)}");
            
            stmaddecus.setInt(1, id);
            stmaddecus.setDouble(2,ecusmodifie);
            stmaddecus.executeUpdate();
            connBD.getConnection().commit();
         }
      
      catch(SQLException se){System.out.println("err" + se);} 
    }//GEN-LAST:event_BTN_MonterEcusActionPerformed

    private void BTN_PremierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_PremierActionPerformed
        // TODO add your handling code here:
        try 
     {
         Statement stm1 = connBD.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
         rst = stm1.executeQuery(sql1);
         if (rst.first())
         {
            TB_IDJOUEUR.setText (((Integer)rst.getInt(1)).toString());
            TB_NomUsager.setText(rst.getString(2));
            TB_NomJoueur.setText(rst.getString(3));
            TB_PrenomJoueur.setText(rst.getString(4));
            TB_Ecus.setText(((Double)rst.getDouble(5)).toString()); 
            TB_MotDePasse.setText(rst.getString(6));
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
            TB_IDJOUEUR.setText (((Integer)rst.getInt(1)).toString());
            TB_NomUsager.setText(rst.getString(2));
            TB_NomJoueur.setText(rst.getString(3));
            TB_PrenomJoueur.setText(rst.getString(4));
            TB_Ecus.setText(((Double)rst.getDouble(5)).toString()); 
            TB_MotDePasse.setText(rst.getString(6));
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
            TB_IDJOUEUR.setText (((Integer)rst.getInt(1)).toString());
            TB_NomUsager.setText(rst.getString(2));
            TB_NomJoueur.setText(rst.getString(3));
            TB_PrenomJoueur.setText(rst.getString(4));
            TB_Ecus.setText(((Double)rst.getDouble(5)).toString());  
            TB_MotDePasse.setText(rst.getString(6));
            
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
            TB_IDJOUEUR.setText (((Integer)rst.getInt(1)).toString());
            TB_NomUsager.setText(rst.getString(2));
            TB_NomJoueur.setText(rst.getString(3));
            TB_PrenomJoueur.setText(rst.getString(4));
            TB_Ecus.setText(((Double)rst.getDouble(5)).toString()); 
            TB_MotDePasse.setText(rst.getString(6));
         }
     }
     
     catch(SQLException se){
        JOptionPane.showMessageDialog(this, "dernier imposible");
     
     }
    }//GEN-LAST:event_BTN_DernierActionPerformed

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
            java.util.logging.Logger.getLogger(Joueurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Joueurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Joueurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Joueurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Joueurs().setVisible(true);
            }
        });
    }
    // Declaration d'une variable connBD de type ConnectionOracle
    private ConnectionOracle connBD;
    ResultSet rst ;
    String sql1 = "Select IDJOUEUR,NOMUSAGER,NOMJOUEUR,PRENOM,ECUSJOUEURS,MOTDEPASSE from JOUEURS";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Dernier;
    private javax.swing.JButton BTN_MonterEcus;
    private javax.swing.JButton BTN_OK;
    private javax.swing.JButton BTN_Precedent;
    private javax.swing.JButton BTN_Premier;
    private javax.swing.JButton BTN_Suivant;
    private javax.swing.JList Liste_Items;
    private javax.swing.JTextField TB_Ecus;
    private javax.swing.JTextField TB_IDJOUEUR;
    private javax.swing.JTextField TB_MotDePasse;
    private javax.swing.JTextField TB_NomJoueur;
    private javax.swing.JTextField TB_NomUsager;
    private javax.swing.JTextField TB_PrenomJoueur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
