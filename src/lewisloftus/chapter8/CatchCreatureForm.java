/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lewisloftus.chapter8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author dfreer
 */
public class CatchCreatureForm extends javax.swing.JFrame {

    /**
     * Creates new form CatchCreatureForm
     */
    long startTime = System.currentTimeMillis(), endTime;
    public CatchCreatureForm() {
        
        initComponents();

        int delay = 1000; //milliseconds
        ActionListener taskPerformer = new ActionListener() {
            int count = 0;

            public void actionPerformed(ActionEvent evt) {
                if (count == 20) {//we did the task 10 times
                    ((Timer) evt.getSource()).stop();
                }
                Random random = new Random(System.nanoTime());
                
                int curRandom = random.nextInt(300) + 100;
                System.out.println(jLabelPicture.getLocationOnScreen().x + " " + jLabelPicture.getLocationOnScreen().y);
               
                System.out.println(curRandom);
                if(count % 2 == 0)
                    jLabelPicture.setLocation((jLabelPicture.getLocationOnScreen().x + curRandom), (jLabelPicture.getLocationOnScreen().y + curRandom));
                else
                    jLabelPicture.setLocation((jLabelPicture.getLocationOnScreen().x - curRandom), (jLabelPicture.getLocationOnScreen().y - curRandom));
                
                System.out.println(SwingUtilities.isEventDispatchThread());
                count++;
            }
        };
        new Timer(delay, taskPerformer).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPicture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game");

        jLabelPicture.setIcon(new javax.swing.ImageIcon("C:\\Users\\dfreer\\Downloads\\CesuRMetin2.png")); // NOI18N
        jLabelPicture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelPictureMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(437, 437, 437)
                .addComponent(jLabelPicture)
                .addContainerGap(689, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(478, Short.MAX_VALUE)
                .addComponent(jLabelPicture)
                .addGap(368, 368, 368))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelPictureMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPictureMouseEntered
        // TODO add your handling code here:
        endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime);
        jLabelPicture.setVisible(false);
        JOptionPane.showConfirmDialog(null,"YOU CAUGHT THE CREATURE! " + totalTime + " milliseconds.");
        
    }//GEN-LAST:event_jLabelPictureMouseEntered

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
            java.util.logging.Logger.getLogger(CatchCreatureForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatchCreatureForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatchCreatureForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatchCreatureForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatchCreatureForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelPicture;
    // End of variables declaration//GEN-END:variables
}
