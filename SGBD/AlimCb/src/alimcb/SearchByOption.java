/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alimcb;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author delskev
 */
public class SearchByOption extends javax.swing.JDialog {

    private HashMap<String, Vector<String> > option;
    private boolean intersect; 
    
    /**
     * Creates new form SearchByOption
     */
    public SearchByOption(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        option = new HashMap<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonValidate = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCritere = new javax.swing.JTable();
        listeCritere = new javax.swing.JComboBox();
        inputOption = new javax.swing.JTextField();
        buttonOptionAdd = new javax.swing.JButton();
        buttonTableDel = new javax.swing.JButton();
        checkintersect = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonValidate.setText("Valider");
        buttonValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonValidateActionPerformed(evt);
            }
        });

        buttonCancel.setText("Annuler");

        tableCritere.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "champs", "critère"
            }
        ));
        jScrollPane1.setViewportView(tableCritere);

        listeCritere.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "acteur", "titre", "réalisateur", "date de sortie", "genre", "MPAA", "popularité", "vote" }));

        buttonOptionAdd.setText("Ajouter");
        buttonOptionAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOptionAddActionPerformed(evt);
            }
        });

        buttonTableDel.setText("retirer");
        buttonTableDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTableDelActionPerformed(evt);
            }
        });

        checkintersect.setText("intersection");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(listeCritere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inputOption, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonOptionAdd))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonTableDel)
                                    .addComponent(checkintersect)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(buttonValidate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonCancel)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listeCritere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonOptionAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkintersect)
                        .addGap(132, 132, 132)
                        .addComponent(buttonTableDel))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancel)
                    .addComponent(buttonValidate))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * ajoute un critère à la table des critères
     * @param evt 
     */
    private void buttonOptionAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOptionAddActionPerformed
        //ajout d'un critère de sélection de film
        DefaultTableModel dtm = (DefaultTableModel) this.tableCritere.getModel();
        Vector<String> row = new Vector<String>();
        row.add(listeCritere.getSelectedItem().toString());
        row.add(inputOption.getText());
        dtm.addRow(row);
    }//GEN-LAST:event_buttonOptionAddActionPerformed

    /**
     * supprime la ligne selectionnée dans la table des critères
     * @param evt 
     */
    private void buttonTableDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTableDelActionPerformed
        if (tableCritere.getSelectedRow() != -1) {
            DefaultTableModel dtm = (DefaultTableModel) this.tableCritere.getModel();
            dtm.removeRow(tableCritere.getSelectedRow());
        }
        
    }//GEN-LAST:event_buttonTableDelActionPerformed

    /**
     * permet de créer une hashMap contenant les critères et leurs valeurs
     * @param evt 
     */
    private void buttonValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonValidateActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) this.tableCritere.getModel();
        
        for (int i = 0; i < tableCritere.getRowCount(); i++) {
            //si le critère n'est pas présent dans la lsite
            System.out.println("critere: "+dtm.getValueAt(i, 0).toString() );
            String critere = dtm.getValueAt(i, 0).toString();
            if (option.containsKey(critere) == false) {
                //ajout d'un nouveau critère
                getOption().put(dtm.getValueAt(i, 0).toString(), new Vector<String>());               
            }
            //ajout de l'élément à la clé courrante
            getOption().get(dtm.getValueAt(i, 0).toString()).add(dtm.getValueAt(i, 1).toString());
        }
        this.setVisible(false);
    }//GEN-LAST:event_buttonValidateActionPerformed

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
            java.util.logging.Logger.getLogger(SearchByOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchByOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchByOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchByOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SearchByOption dialog = new SearchByOption(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonOptionAdd;
    private javax.swing.JButton buttonTableDel;
    private javax.swing.JButton buttonValidate;
    private javax.swing.JCheckBox checkintersect;
    private javax.swing.JTextField inputOption;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox listeCritere;
    private javax.swing.JTable tableCritere;
    // End of variables declaration//GEN-END:variables

    
    
    //<editor-fold defaultstate="collapsed" desc="get and set">
    
    /**
     * @return the intersect
     */
    public boolean isIntersect() {
        return checkintersect.isSelected();
    }
    
    /**
     * @return the option
     */
    public HashMap<String, Vector<String> > getOption() {
        return option;
    }

    //</editor-fold>

    

}