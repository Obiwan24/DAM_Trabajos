
package source;

import java.awt.Frame;



public class Reserva extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Reserva.class.getName());

   private Formulario formulario;
    
    public Reserva(Frame parent, boolean modal) {
        super(parent, modal);
        this.formulario = formulario;
        initComponents();
        setModal(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelReservaRealizada = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jLabelReservaRealizada.setFont(new java.awt.Font("American Typewriter", 1, 18)); // NOI18N
        jLabelReservaRealizada.setText("Reserva realizada con éxito");

        jButtonVolver.setBackground(new java.awt.Color(204, 204, 204));
        jButtonVolver.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 2, 14)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabelReservaRealizada)
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabelReservaRealizada)
                .addGap(38, 38, 38)
                .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        
        //Cierra la ventana actual para abrir la otra
        this.dispose();
        
        //Cierra el formulario
        if (formulario != null){
            formulario.dispose();
        }
        //Vuelve a la clase Bienvenidos con el botón
        new Bienvenidos().setVisible(true);
        

        

    }//GEN-LAST:event_jButtonVolverActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Reserva dialog = new Reserva(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelReservaRealizada;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
