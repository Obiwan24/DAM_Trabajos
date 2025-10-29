
package source;


public class Bienvenidos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Bienvenidos.class.getName());


    public Bienvenidos() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelBienvenidos = new javax.swing.JLabel();
        jLabelSalonHabana = new javax.swing.JLabel();
        jButtonCarta = new javax.swing.JButton();
        jButtonReservas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBienvenidos.setFont(new java.awt.Font("Academy Engraved LET", 0, 36)); // NOI18N
        jLabelBienvenidos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBienvenidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBienvenidos.setText("Bienvenidos");
        getContentPane().add(jLabelBienvenidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 200, 80));

        jLabelSalonHabana.setFont(new java.awt.Font("Academy Engraved LET", 0, 36)); // NOI18N
        jLabelSalonHabana.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSalonHabana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSalonHabana.setText("Salón Habana");
        getContentPane().add(jLabelSalonHabana, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 240, 80));

        jButtonCarta.setFont(new java.awt.Font("Academy Engraved LET", 0, 24)); // NOI18N
        jButtonCarta.setIcon(new javax.swing.ImageIcon("/Users/iglemen/Desktop/ESTUDIOS/CIDEAD/DAM/DESARROLLO DE INTERFACES/U1/Boton Carta.jpg")); // NOI18N
        jButtonCarta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jButtonCarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 140, 60));

        jButtonReservas.setFont(new java.awt.Font("Academy Engraved LET", 0, 24)); // NOI18N
        jButtonReservas.setIcon(new javax.swing.ImageIcon("/Users/iglemen/Desktop/ESTUDIOS/CIDEAD/DAM/DESARROLLO DE INTERFACES/U1/Boton Reservas.jpg")); // NOI18N
        jButtonReservas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 140, 60));

        jLabelFondo.setIcon(new javax.swing.ImageIcon("/Users/iglemen/Desktop/ESTUDIOS/CIDEAD/DAM/DESARROLLO DE INTERFACES/U1/FondoPrincipal.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelFondo)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelFondo)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservasActionPerformed
        //Para llamar a la clase Formulario
        Formulario form = new Formulario();
        form.setLocationRelativeTo(this);
        form.setVisible(true);
        
        //Cierra la ventana al abrir la nueva
        this.dispose();
        
    }//GEN-LAST:event_jButtonReservasActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new Bienvenidos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCarta;
    private javax.swing.JButton jButtonReservas;
    private javax.swing.JLabel jLabelBienvenidos;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelSalonHabana;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
