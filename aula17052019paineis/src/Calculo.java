/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TI-Turma-B
 */
public class Calculo extends javax.swing.JFrame {

    /**
     * Creates new form Calculo
     */
    public Calculo() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTablePaneCalculo = new javax.swing.JTabbedPane();
        jPanelDelta = new javax.swing.JPanel();
        jLa = new javax.swing.JLabel();
        jTFvalorA = new javax.swing.JTextField();
        jLb = new javax.swing.JLabel();
        jTFvalorB = new javax.swing.JTextField();
        jLc = new javax.swing.JLabel();
        jTFvalorC = new javax.swing.JTextField();
        jLdelta = new javax.swing.JLabel();
        jTFvalordelta = new javax.swing.JTextField();
        jBcalcular = new javax.swing.JButton();
        jBlimpar = new javax.swing.JButton();
        jPanelArea = new javax.swing.JPanel();
        jLbase = new javax.swing.JLabel();
        jTFbase = new javax.swing.JTextField();
        jLaltura = new javax.swing.JLabel();
        jTFaltura = new javax.swing.JTextField();
        jRBquadrado = new javax.swing.JRadioButton();
        jRBtriangulo = new javax.swing.JRadioButton();
        jLarea = new javax.swing.JLabel();
        jTFarea = new javax.swing.JTextField();
        jBcalculararea = new javax.swing.JButton();
        jBlimpararea = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delta & Área");

        jLa.setText("Valor A");

        jLb.setText("Valor B");

        jLc.setText("Valor C");

        jLdelta.setText("Valor Delta");

        jTFvalordelta.setEditable(false);
        jTFvalordelta.setEnabled(false);

        jBcalcular.setText("Calcular");

        jBlimpar.setText("Limpar");

        javax.swing.GroupLayout jPanelDeltaLayout = new javax.swing.GroupLayout(jPanelDelta);
        jPanelDelta.setLayout(jPanelDeltaLayout);
        jPanelDeltaLayout.setHorizontalGroup(
            jPanelDeltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeltaLayout.createSequentialGroup()
                .addComponent(jLa)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelDeltaLayout.createSequentialGroup()
                .addGroup(jPanelDeltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFvalorA)
                    .addComponent(jTFvalorB)
                    .addComponent(jTFvalorC)
                    .addComponent(jTFvalordelta)
                    .addGroup(jPanelDeltaLayout.createSequentialGroup()
                        .addGroup(jPanelDeltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLb)
                            .addComponent(jLc)
                            .addComponent(jLdelta))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelDeltaLayout.createSequentialGroup()
                        .addComponent(jBcalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(jBlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelDeltaLayout.setVerticalGroup(
            jPanelDeltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeltaLayout.createSequentialGroup()
                .addComponent(jLa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFvalorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFvalorB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFvalorC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLdelta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFvalordelta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelDeltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcalcular)
                    .addComponent(jBlimpar))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTablePaneCalculo.addTab("Delta", jPanelDelta);

        jLbase.setText("Base");

        jTFbase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFbaseActionPerformed(evt);
            }
        });

        jLaltura.setText("Altura");

        buttonGroup1.add(jRBquadrado);
        jRBquadrado.setText("Quadrado");

        buttonGroup1.add(jRBtriangulo);
        jRBtriangulo.setText("Triângulo");

        jLarea.setText("Área");

        jTFarea.setEditable(false);
        jTFarea.setEnabled(false);

        jBcalculararea.setText("Calcular");

        jBlimpararea.setText("Limpar");

        javax.swing.GroupLayout jPanelAreaLayout = new javax.swing.GroupLayout(jPanelArea);
        jPanelArea.setLayout(jPanelAreaLayout);
        jPanelAreaLayout.setHorizontalGroup(
            jPanelAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAreaLayout.createSequentialGroup()
                .addGroup(jPanelAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbase)
                    .addComponent(jLaltura))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelAreaLayout.createSequentialGroup()
                .addGroup(jPanelAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFaltura)
                    .addComponent(jTFbase, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelAreaLayout.createSequentialGroup()
                        .addComponent(jRBquadrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRBtriangulo))
                    .addComponent(jTFarea)
                    .addGroup(jPanelAreaLayout.createSequentialGroup()
                        .addComponent(jLarea)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelAreaLayout.createSequentialGroup()
                        .addComponent(jBcalculararea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(jBlimpararea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelAreaLayout.setVerticalGroup(
            jPanelAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAreaLayout.createSequentialGroup()
                .addComponent(jLbase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFbase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLaltura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFaltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBquadrado)
                    .addComponent(jRBtriangulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLarea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcalculararea)
                    .addComponent(jBlimpararea))
                .addGap(0, 75, Short.MAX_VALUE))
        );

        jTablePaneCalculo.addTab("Área", jPanelArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTablePaneCalculo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTablePaneCalculo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFbaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFbaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFbaseActionPerformed

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
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBcalcular;
    private javax.swing.JButton jBcalculararea;
    private javax.swing.JButton jBlimpar;
    private javax.swing.JButton jBlimpararea;
    private javax.swing.JLabel jLa;
    private javax.swing.JLabel jLaltura;
    private javax.swing.JLabel jLarea;
    private javax.swing.JLabel jLb;
    private javax.swing.JLabel jLbase;
    private javax.swing.JLabel jLc;
    private javax.swing.JLabel jLdelta;
    private javax.swing.JPanel jPanelArea;
    private javax.swing.JPanel jPanelDelta;
    private javax.swing.JRadioButton jRBquadrado;
    private javax.swing.JRadioButton jRBtriangulo;
    private javax.swing.JTextField jTFaltura;
    private javax.swing.JTextField jTFarea;
    private javax.swing.JTextField jTFbase;
    private javax.swing.JTextField jTFvalorA;
    private javax.swing.JTextField jTFvalorB;
    private javax.swing.JTextField jTFvalorC;
    private javax.swing.JTextField jTFvalordelta;
    private javax.swing.JTabbedPane jTablePaneCalculo;
    // End of variables declaration//GEN-END:variables
}
