/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmn2
 */
public class puzzle extends javax.swing.JFrame {

    /**
     * Creates new form puzzle
     */
    public puzzle() {
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

        a0 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        a7 = new javax.swing.JLabel();
        a8 = new javax.swing.JLabel();
        up = new javax.swing.JButton();
        left = new javax.swing.JButton();
        right = new javax.swing.JButton();
        down = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("8 puzzle");
        setResizable(false);

        a0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a0.setForeground(java.awt.Color.blue);
        a0.setText(" ");

        a1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a1.setForeground(java.awt.Color.blue);
        a1.setText("1");

        a2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a2.setForeground(java.awt.Color.blue);
        a2.setText("2");

        a3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a3.setForeground(java.awt.Color.blue);
        a3.setText("3");

        a4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a4.setForeground(java.awt.Color.blue);
        a4.setText("4");

        a5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a5.setForeground(java.awt.Color.blue);
        a5.setText("5");

        a6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a6.setForeground(java.awt.Color.blue);
        a6.setText("6");

        a7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a7.setForeground(java.awt.Color.blue);
        a7.setText("7");

        a8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a8.setForeground(java.awt.Color.blue);
        a8.setText("8");

        up.setText("^");
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });

        left.setText("<");
        left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftActionPerformed(evt);
            }
        });

        right.setText(">");
        right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightActionPerformed(evt);
            }
        });

        down.setText("v");
        down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a0)
                    .addComponent(a3)
                    .addComponent(a6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a1)
                    .addComponent(a4)
                    .addComponent(a7))
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a2)
                    .addComponent(a5)
                    .addComponent(a8))
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(up, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(left, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(right, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(down, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a0)
                    .addComponent(a1)
                    .addComponent(a2))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a3)
                    .addComponent(a4)
                    .addComponent(a5))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a6)
                    .addComponent(a7)
                    .addComponent(a8))
                .addGap(64, 64, 64)
                .addComponent(up)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(left)
                    .addComponent(right))
                .addGap(18, 18, 18)
                .addComponent(down)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        if(a0.getText().charAt(0) == ' ')
        {
            a0.setText(a3.getText());
            a3.setText(" ");
        }
        else if(a1.getText().charAt(0) == ' ')
        {
            a1.setText(a4.getText());
            a4.setText(" ");
        }
        else if(a2.getText().charAt(0) == ' ')
        {
            a2.setText(a5.getText());
            a5.setText(" ");
        }
        else if(a3.getText().charAt(0) == ' ')
        {
            a3.setText(a6.getText());
            a6.setText(" ");
        }
        else if(a4.getText().charAt(0) == ' ')
        {
            a4.setText(a7.getText());
            a7.setText(" ");
        }
        else if(a5.getText().charAt(0) == ' ')
        {
            a5.setText(a8.getText());
            a8.setText(" ");
        }
    }//GEN-LAST:event_upActionPerformed

    private void rightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightActionPerformed
        if(a2.getText().charAt(0) == ' ')
        {
            a2.setText(a1.getText());
            a1.setText(" ");
        }
        else if(a5.getText().charAt(0) == ' ')
        {
            a5.setText(a4.getText());
            a4.setText(" ");
        }
        else if(a8.getText().charAt(0) == ' ')
        {
            a8.setText(a7.getText());
            a7.setText(" ");
        }
        else if(a1.getText().charAt(0) == ' ')
        {
            a1.setText(a0.getText());
            a0.setText(" ");
        }
        else if(a4.getText().charAt(0) == ' ')
        {
            a4.setText(a3.getText());
            a3.setText(" ");
        }
        else if(a7.getText().charAt(0) == ' ')
        {
            a7.setText(a6.getText());
            a6.setText(" ");
        }
    }//GEN-LAST:event_rightActionPerformed

    private void downActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downActionPerformed
        if(a6.getText().charAt(0) == ' ')
        {
            a6.setText(a3.getText());
            a3.setText(" ");
        }
        else if(a7.getText().charAt(0) == ' ')
        {
            a7.setText(a4.getText());
            a4.setText(" ");
        }
        else if(a8.getText().charAt(0) == ' ')
        {
            a8.setText(a5.getText());
            a5.setText(" ");
        }
        else if(a3.getText().charAt(0) == ' ')
        {
            a3.setText(a0.getText());
            a0.setText(" ");
        }
        else if(a4.getText().charAt(0) == ' ')
        {
            a4.setText(a1.getText());
            a1.setText(" ");
        }
        else if(a5.getText().charAt(0) == ' ')
        {
            a5.setText(a2.getText());
            a2.setText(" ");
        }
    }//GEN-LAST:event_downActionPerformed

    private void leftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftActionPerformed
        if(a0.getText().charAt(0) == ' ')
        {
            a0.setText(a1.getText());
            a1.setText(" ");
        }
        else if(a3.getText().charAt(0) == ' ')
        {
            a3.setText(a4.getText());
            a4.setText(" ");
        }
        else if(a6.getText().charAt(0) == ' ')
        {
            a6.setText(a7.getText());
            a7.setText(" ");
        }
        else if(a1.getText().charAt(0) == ' ')
        {
            a1.setText(a2.getText());
            a2.setText(" ");
        }
        else if(a4.getText().charAt(0) == ' ')
        {
            a4.setText(a5.getText());
            a5.setText(" ");
        }
        else if(a7.getText().charAt(0) == ' ')
        {
            a7.setText(a8.getText());
            a8.setText(" ");
        }
    }//GEN-LAST:event_leftActionPerformed

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
            java.util.logging.Logger.getLogger(puzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(puzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(puzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(puzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new puzzle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a0;
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JLabel a7;
    private javax.swing.JLabel a8;
    private javax.swing.JButton down;
    private javax.swing.JButton left;
    private javax.swing.JButton right;
    private javax.swing.JButton up;
    // End of variables declaration//GEN-END:variables
}
