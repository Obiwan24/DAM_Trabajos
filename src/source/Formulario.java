
package source;


public class Formulario extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Formulario.class.getName());

    public Formulario() {
        initComponents();
    }
    
    private void activarCongreso (boolean activar){
        jSpinnerJornadas.setEnabled(activar);
        jComboBoxHabitaciones.setEnabled(activar);
        jSpinnerDias.setEnabled(activar);
        jSpinnerNumeroHab.setEnabled(activar);      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipoEvento = new javax.swing.ButtonGroup();
        buttonGroupTipoCocina = new javax.swing.ButtonGroup();
        tituloForm = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabelTelefono1 = new javax.swing.JLabel();
        jTextTelefono = new javax.swing.JTextField();
        jLabelFecha = new javax.swing.JLabel();
        jSpinnerFecha = new javax.swing.JSpinner();
        jLabelTipoEvento = new javax.swing.JLabel();
        jRadioBanquete = new javax.swing.JRadioButton();
        jRadioJornada = new javax.swing.JRadioButton();
        jRadioCongreso = new javax.swing.JRadioButton();
        jLabelAsistentes = new javax.swing.JLabel();
        jSpinnerAsistentes = new javax.swing.JSpinner();
        jLabelCocina = new javax.swing.JLabel();
        jRadioBufe = new javax.swing.JRadioButton();
        jRadioChef = new javax.swing.JRadioButton();
        jRadioCarta = new javax.swing.JRadioButton();
        jRadioNoPrecisa = new javax.swing.JRadioButton();
        jLabelJornadas = new javax.swing.JLabel();
        jSpinnerJornadas = new javax.swing.JSpinner();
        jLabelHabitaciones = new javax.swing.JLabel();
        jComboBoxHabitaciones = new javax.swing.JComboBox<>();
        jLabelDias = new javax.swing.JLabel();
        jSpinnerDias = new javax.swing.JSpinner();
        jLabelNumeroHab = new javax.swing.JLabel();
        jSpinnerNumeroHab = new javax.swing.JSpinner();
        jLabelObservaciones = new javax.swing.JLabel();
        jScrollObservaciones = new javax.swing.JScrollPane();
        jTextObservaciones = new javax.swing.JTextArea();
        jButtonReserva = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        fondoFormulario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloForm.setBackground(new java.awt.Color(0, 0, 0));
        tituloForm.setFont(new java.awt.Font("BM Hanna 11yrs Old", 0, 48)); // NOI18N
        tituloForm.setForeground(new java.awt.Color(255, 255, 255));
        tituloForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloForm.setText("Salon Habana");
        tituloForm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(tituloForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 340, -1));

        jLabelNombre.setFont(new java.awt.Font("AkayaTelivigala", 0, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre completo");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 150, -1));

        jTextNombre.setFont(new java.awt.Font("Zapf Dingbats", 0, 14)); // NOI18N
        jTextNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextNombre.setToolTipText("Nombre completo");
        getContentPane().add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 410, 30));

        jLabelTelefono1.setFont(new java.awt.Font("AkayaTelivigala", 0, 18)); // NOI18N
        jLabelTelefono1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelefono1.setText("Teléfono de contacto");
        getContentPane().add(jLabelTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 150, -1));

        jTextTelefono.setFont(new java.awt.Font("Zapf Dingbats", 0, 14)); // NOI18N
        jTextTelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextTelefono.setToolTipText("Teléfono de contacto");
        getContentPane().add(jTextTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 410, 30));

        jLabelFecha.setFont(new java.awt.Font("AkayaTelivigala", 0, 18)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFecha.setText("Fecha del evento");
        getContentPane().add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 150, -1));

        jSpinnerFecha.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jSpinnerFecha.setModel(new javax.swing.SpinnerDateModel());
        jSpinnerFecha.setToolTipText("Selecciona fecha");
        getContentPane().add(jSpinnerFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 140, 30));

        jLabelTipoEvento.setFont(new java.awt.Font("AkayaTelivigala", 0, 24)); // NOI18N
        jLabelTipoEvento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipoEvento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTipoEvento.setText("Tipo de evento");
        getContentPane().add(jLabelTipoEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 150, -1));

        buttonGroupTipoEvento.add(jRadioBanquete);
        jRadioBanquete.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jRadioBanquete.setText("Banquete");
        getContentPane().add(jRadioBanquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));
        jRadioBanquete.addActionListener(e -> activarCongreso(false));

        buttonGroupTipoEvento.add(jRadioJornada);
        jRadioJornada.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jRadioJornada.setText("Jornada");
        getContentPane().add(jRadioJornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, 20));
        jRadioJornada.addActionListener(e -> activarCongreso(false));

        buttonGroupTipoEvento.add(jRadioCongreso);
        jRadioCongreso.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jRadioCongreso.setText("Congreso");
        getContentPane().add(jRadioCongreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));
        jRadioCongreso.addActionListener(e -> activarCongreso(true));

        jLabelAsistentes.setFont(new java.awt.Font("AkayaTelivigala", 0, 18)); // NOI18N
        jLabelAsistentes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAsistentes.setText("Asistentes");
        getContentPane().add(jLabelAsistentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 80, -1));

        jSpinnerAsistentes.setModel(new javax.swing.SpinnerNumberModel());
        jSpinnerAsistentes.setToolTipText("Seleccione numero de asistentes");
        getContentPane().add(jSpinnerAsistentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        jLabelCocina.setFont(new java.awt.Font("AkayaTelivigala", 0, 24)); // NOI18N
        jLabelCocina.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCocina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCocina.setText("Tipo de cocina");
        getContentPane().add(jLabelCocina, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 150, -1));

        buttonGroupTipoCocina.add(jRadioBufe);
        jRadioBufe.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jRadioBufe.setText("Bufé");
        getContentPane().add(jRadioBufe, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        buttonGroupTipoCocina.add(jRadioChef);
        jRadioChef.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jRadioChef.setText("Cita con el chef");
        getContentPane().add(jRadioChef, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        buttonGroupTipoCocina.add(jRadioCarta);
        jRadioCarta.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jRadioCarta.setText("Carta");
        getContentPane().add(jRadioCarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, -1));

        buttonGroupTipoCocina.add(jRadioNoPrecisa);
        jRadioNoPrecisa.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jRadioNoPrecisa.setText("No precisa");
        getContentPane().add(jRadioNoPrecisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, -1));

        jLabelJornadas.setFont(new java.awt.Font("AkayaTelivigala", 0, 18)); // NOI18N
        jLabelJornadas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelJornadas.setText("Nº de jornadas:");
        getContentPane().add(jLabelJornadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 120, -1));

        jSpinnerJornadas.setModel(new javax.swing.SpinnerNumberModel());
        jSpinnerJornadas.setToolTipText("Seleccione numero de días");
        getContentPane().add(jSpinnerJornadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, -1, -1));

        jLabelHabitaciones.setFont(new java.awt.Font("AkayaTelivigala", 0, 18)); // NOI18N
        jLabelHabitaciones.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHabitaciones.setText("Habitaciones:");
        getContentPane().add(jLabelHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 110, -1));

        jComboBoxHabitaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        jComboBoxHabitaciones.setToolTipText("Necesidad de habitaciones");
        getContentPane().add(jComboBoxHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, -1, -1));

        jLabelDias.setFont(new java.awt.Font("AkayaTelivigala", 0, 18)); // NOI18N
        jLabelDias.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDias.setText("Días:");
        getContentPane().add(jLabelDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 40, -1));

        jSpinnerDias.setModel(new javax.swing.SpinnerNumberModel());
        jSpinnerDias.setToolTipText("Numero de días de alojamiento");
        getContentPane().add(jSpinnerDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, -1, -1));

        jLabelNumeroHab.setFont(new java.awt.Font("AkayaTelivigala", 0, 18)); // NOI18N
        jLabelNumeroHab.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumeroHab.setText("Nº hab.:");
        getContentPane().add(jLabelNumeroHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 70, -1));

        jSpinnerNumeroHab.setModel(new javax.swing.SpinnerNumberModel());
        jSpinnerNumeroHab.setToolTipText("Numero de habitaciones");
        getContentPane().add(jSpinnerNumeroHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, -1, -1));

        jLabelObservaciones.setFont(new java.awt.Font("AkayaTelivigala", 0, 18)); // NOI18N
        jLabelObservaciones.setForeground(new java.awt.Color(255, 255, 255));
        jLabelObservaciones.setText("Observaciones");
        getContentPane().add(jLabelObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 120, -1));

        jTextObservaciones.setColumns(20);
        jTextObservaciones.setRows(5);
        jTextObservaciones.setToolTipText("Observaciones a tener en cuenta");
        jScrollObservaciones.setViewportView(jTextObservaciones);

        getContentPane().add(jScrollObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, 130));

        jButtonReserva.setBackground(new java.awt.Color(0, 0, 0));
        jButtonReserva.setFont(new java.awt.Font("Kannada MN", 1, 24)); // NOI18N
        jButtonReserva.setIcon(new javax.swing.ImageIcon("/Users/iglemen/Desktop/ESTUDIOS/CIDEAD/DAM/DESARROLLO DE INTERFACES/U1/Boton Reservar.jpg")); // NOI18N
        jButtonReserva.setToolTipText("Pulsa para formalizar reserva");
        jButtonReserva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 620, 150, 80));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 440, 30));

        fondoFormulario.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        fondoFormulario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoFormulario.setIcon(new javax.swing.ImageIcon("/Users/iglemen/Desktop/ESTUDIOS/CIDEAD/DAM/DESARROLLO DE INTERFACES/U1/fondoFormulario.jpg")); // NOI18N
        getContentPane().add(fondoFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservaActionPerformed
        
        //Llama al jDialogo modal Reserva
        Reserva res = new Reserva(this, true);
        res.setLocationRelativeTo(this);
        res.setVisible(true);
        
        
    }//GEN-LAST:event_jButtonReservaActionPerformed


    public static void main(String args[]) {
        

        java.awt.EventQueue.invokeLater(() -> new Formulario().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTipoCocina;
    private javax.swing.ButtonGroup buttonGroupTipoEvento;
    private javax.swing.JLabel fondoFormulario;
    private javax.swing.JButton jButtonReserva;
    private javax.swing.JComboBox<String> jComboBoxHabitaciones;
    private javax.swing.JLabel jLabelAsistentes;
    private javax.swing.JLabel jLabelCocina;
    private javax.swing.JLabel jLabelDias;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelHabitaciones;
    private javax.swing.JLabel jLabelJornadas;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumeroHab;
    private javax.swing.JLabel jLabelObservaciones;
    private javax.swing.JLabel jLabelTelefono1;
    private javax.swing.JLabel jLabelTipoEvento;
    private javax.swing.JRadioButton jRadioBanquete;
    private javax.swing.JRadioButton jRadioBufe;
    private javax.swing.JRadioButton jRadioCarta;
    private javax.swing.JRadioButton jRadioChef;
    private javax.swing.JRadioButton jRadioCongreso;
    private javax.swing.JRadioButton jRadioJornada;
    private javax.swing.JRadioButton jRadioNoPrecisa;
    private javax.swing.JScrollPane jScrollObservaciones;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerAsistentes;
    private javax.swing.JSpinner jSpinnerDias;
    private javax.swing.JSpinner jSpinnerFecha;
    private javax.swing.JSpinner jSpinnerJornadas;
    private javax.swing.JSpinner jSpinnerNumeroHab;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextArea jTextObservaciones;
    private javax.swing.JTextField jTextTelefono;
    private javax.swing.JLabel tituloForm;
    // End of variables declaration//GEN-END:variables
}
