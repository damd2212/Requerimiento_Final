/**
 * Presentado por: Jefferson Eduardo Campo Y Danny Alberto Diaz Mage
 */
package cliente.vistas;

import SGestionAnteproyectos.dto.clsFormatoADTO;
import SGestionAnteproyectos.sop_rmi.GestionAnteproyectosInt;
import SGestionAnteproyectos.sop_rmi.GestionUsuariosInt;
import SSeguimientoAnteproyectos.sop_rmi.GestionSeguimientoInt;

import java.rmi.RemoteException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GUIMenuDirector extends javax.swing.JFrame {
    //Atributos
    private static GestionAnteproyectosInt objRemotoAnteproyectos;
    private static GestionUsuariosInt objRemotoUsuarios;
    private static GestionSeguimientoInt objRemotoSeguimiento;
    private static int codigo;
    private int idDirector;
    private String nomCompleto;

    /**
     * Constructor Parametrizado.
     * @param objRemoto Objeto remoto de usuario
     * @param objRemotoA Objeto remoto de anteproyecto
     * @param objRemotoS Objeto remoto de seguimiento
     * @param idDirector Identificación del director
     * @param nomCompleto Nombre del director
     */
    public GUIMenuDirector(GestionUsuariosInt objRemoto, GestionAnteproyectosInt objRemotoA, GestionSeguimientoInt objRemotoS, int idDirector, String nomCompleto) {
        initComponents();
        this.objRemotoUsuarios = objRemoto;
        this.objRemotoAnteproyectos = objRemotoA;
        this.objRemotoSeguimiento = objRemotoS;
        this.idDirector = idDirector;
        this.nomCompleto = nomCompleto;
        jtxtANotificacion.setEditable(false);
        jcmbProgramas.setEnabled(false);
        jtxtFTitulo.setEnabled(false);
        jtxtFEst1.setEnabled(false);
        jtxtFCodEst1.setEnabled(false);
        jtxtFEst2.setEnabled(false);
        jtxtFCodEst2.setEnabled(false);
        jtxtFDirector.setEditable(false);
        jtxtFCodirector.setEnabled(false);
        jtxtAObjetivos.setEnabled(false);
        btnRegistrar.setEnabled(false);
        ListarCmbAnteproyectos();
        jtxtFDirector.setText(nomCompleto);
    }
    
    /**
     * Constructor vacio.
     */
    public GUIMenuDirector() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlbCod = new javax.swing.JLabel();
        jlbCodReg = new javax.swing.JLabel();
        jcmbProgramas = new javax.swing.JComboBox<>();
        jlbPrograma = new javax.swing.JLabel();
        jlbTitulo = new javax.swing.JLabel();
        jtxtFTitulo = new javax.swing.JTextField();
        jlbEst1 = new javax.swing.JLabel();
        jtxtFEst1 = new javax.swing.JTextField();
        jlbCodEst1 = new javax.swing.JLabel();
        jtxtFCodEst1 = new javax.swing.JTextField();
        jlbEst2 = new javax.swing.JLabel();
        jtxtFEst2 = new javax.swing.JTextField();
        jtxtFCodEst2 = new javax.swing.JTextField();
        jlbCodEst2 = new javax.swing.JLabel();
        jnlDirector = new javax.swing.JLabel();
        jtxtFDirector = new javax.swing.JTextField();
        jlbCodirector = new javax.swing.JLabel();
        jtxtFCodirector = new javax.swing.JTextField();
        jlbObjetivos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtAObjetivos = new javax.swing.JTextArea();
        btnRegistrar = new javax.swing.JButton();
        jlbBSalir = new javax.swing.JLabel();
        btnSolicitar = new javax.swing.JButton();
        jlbImgRegistrarA = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtANotificacion = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jlbSalirNotificacion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcmbAntSinRemitir = new javax.swing.JComboBox<>();
        btnRemitir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu del Director");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 26)); // NOI18N
        jLabel1.setText("Registrar Formato A");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 11, -1, -1));

        jlbCod.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbCod.setText("Codigo Anteproyecto");
        jPanel1.add(jlbCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 51, -1, -1));

        jlbCodReg.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jlbCodReg.setText("--");
        jPanel1.add(jlbCodReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 52, -1, -1));

        jcmbProgramas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcmbProgramas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PIS", "PIAI", "PIET", "TTM" }));
        jPanel1.add(jcmbProgramas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 160, 20));

        jlbPrograma.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbPrograma.setText("Programa");
        jPanel1.add(jlbPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 20));

        jlbTitulo.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbTitulo.setText("Titulo");
        jPanel1.add(jlbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 121, -1, -1));

        jtxtFTitulo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(jtxtFTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 119, 162, -1));

        jlbEst1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbEst1.setText("Estudiante 1");
        jPanel1.add(jlbEst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 155, -1, -1));

        jtxtFEst1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(jtxtFEst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 153, 162, -1));

        jlbCodEst1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbCodEst1.setText("Codigo Estudiante 1");
        jPanel1.add(jlbCodEst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 189, -1, -1));

        jtxtFCodEst1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtFCodEst1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtFCodEst1KeyTyped(evt);
            }
        });
        jPanel1.add(jtxtFCodEst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 187, 162, -1));

        jlbEst2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbEst2.setText("Estudiante 2");
        jPanel1.add(jlbEst2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 223, -1, -1));

        jtxtFEst2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(jtxtFEst2, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 221, 162, -1));

        jtxtFCodEst2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtFCodEst2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtFCodEst2KeyTyped(evt);
            }
        });
        jPanel1.add(jtxtFCodEst2, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 255, 162, -1));

        jlbCodEst2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbCodEst2.setText("Codigo Estudiante 2");
        jPanel1.add(jlbCodEst2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 257, -1, -1));

        jnlDirector.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jnlDirector.setText("Director");
        jPanel1.add(jnlDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 291, -1, -1));

        jtxtFDirector.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(jtxtFDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 289, 162, -1));

        jlbCodirector.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbCodirector.setText("Codirector");
        jPanel1.add(jlbCodirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 325, -1, -1));

        jtxtFCodirector.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(jtxtFCodirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 323, 162, -1));

        jlbObjetivos.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbObjetivos.setText("Objetivos");
        jPanel1.add(jlbObjetivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 364, -1, -1));

        jtxtAObjetivos.setColumns(20);
        jtxtAObjetivos.setRows(5);
        jScrollPane1.setViewportView(jtxtAObjetivos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 388, 262, -1));

        btnRegistrar.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 495, -1, -1));

        jlbBSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/CerrarSesion.png"))); // NOI18N
        jlbBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbBSalirMouseClicked(evt);
            }
        });
        jPanel1.add(jlbBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 40, 40));

        btnSolicitar.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        btnSolicitar.setText("Solicitar Codigo");
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSolicitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 47, 141, -1));

        jlbImgRegistrarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/registrarA.png"))); // NOI18N
        jPanel1.add(jlbImgRegistrarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 560));

        jTabbedPane1.addTab("Registrar Formato A", jPanel1);

        jPanel2.setBackground(new java.awt.Color(20, 176, 191));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtANotificacion.setColumns(20);
        jtxtANotificacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtANotificacion.setRows(5);
        jScrollPane2.setViewportView(jtxtANotificacion);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 460, 320));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 26)); // NOI18N
        jLabel2.setText("Notificaciones Aprobados");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 11, -1, -1));

        jlbSalirNotificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/CerrarSesion.png"))); // NOI18N
        jlbSalirNotificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbSalirNotificacionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jlbSalirNotificacion)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jlbSalirNotificacion)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 50, 50));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel3.setText("Remitir Anteproyecto");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jcmbAntSinRemitir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(jcmbAntSinRemitir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 220, -1));

        btnRemitir.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        btnRemitir.setText("Remitir");
        btnRemitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemitirActionPerformed(evt);
            }
        });
        jPanel2.add(btnRemitir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, -1, -1));

        jTabbedPane1.addTab("Notificacion Anteproyectos Aprobados", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que muestra un mensaje en el texto de area de notificación en la GUIMenuDirector
     * @param mensaje
     * @throws RemoteException 
     */
    public void mostarMensaje(String mensaje) throws RemoteException {
        jcmbAntSinRemitir.removeAllItems();
        ArrayList<Integer> NoRemitidos = objRemotoAnteproyectos.listaAntNoRemitidos(idDirector);
        for (int i = 0; i < NoRemitidos.size(); i++) {
            String codAnte = String.valueOf(NoRemitidos.get(i));
            jcmbAntSinRemitir.addItem(codAnte);
        }
        jtxtANotificacion.append(mensaje);
    }
    
    /**
     * Método que ajusta los parametros predeterminados del formulario.
     */
    public void limpiar() {
        jcmbProgramas.setSelectedItem("PIS");
        jtxtFTitulo.setText("");
        jtxtFEst1.setText("");
        jtxtFEst2.setText("");
        jtxtFCodEst1.setText("");
        jtxtFCodEst2.setText("");
        jtxtFCodirector.setText("");
        jtxtAObjetivos.setText("");
        jlbCodReg.setText("--");
        jcmbProgramas.setEnabled(false);
        jtxtFTitulo.setEnabled(false);
        jtxtFEst1.setEnabled(false);
        jtxtFCodEst1.setEnabled(false);
        jtxtFEst2.setEnabled(false);
        jtxtFCodEst2.setEnabled(false);
        jtxtFCodirector.setEnabled(false);
        jtxtAObjetivos.setEnabled(false);
        btnRegistrar.setEnabled(false);
        btnSolicitar.setEnabled(true);
    }

    /**
     * Método que obtiene y lista los anteproyectos en un combo box.
     */
    public void ListarCmbAnteproyectos() {
        try {
            ArrayList<Integer> NoRemitidos = objRemotoAnteproyectos.listaAntNoRemitidos(idDirector);
            if (NoRemitidos == null) {
                JOptionPane.showMessageDialog(null, "No tiene anteproyectos sin remitir", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                for (int i = 0; i < NoRemitidos.size(); i++) {
                    String codAnte = String.valueOf(NoRemitidos.get(i));
                    jcmbAntSinRemitir.addItem(codAnte);
                }
            }
        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método que captura el evento del botón registrar al efectuar un click, y posteriormente
     * registra el formato A.
     * @param evt evento.
     */
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (jtxtFTitulo.getText().isEmpty() || jtxtFEst1.getText().isEmpty() || jtxtFCodEst1.getText().isEmpty()
                || jtxtFDirector.getText().isEmpty() || jtxtAObjetivos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Solo los campos para el estudiante 2 y para el nombre del codirector pueden estar vacios", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            if (!jtxtFCodEst2.getText().isEmpty()) {
                if (jtxtFEst2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "El campo del nombre del estudiante 2 debe ingresarse", "Advertencia", JOptionPane.WARNING_MESSAGE);
                } else {
                    if (jtxtFCodEst1.getText().equals(jtxtFCodEst2.getText())) {
                        JOptionPane.showMessageDialog(null, "Los codigos de los estudiantes no pueden ser iguales", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    } else {
                        registrarFormatoA();
                    }
                }
            } else if (!jtxtFEst2.getText().isEmpty()) {
                if (jtxtFCodEst2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "El campo del codigo del estudiante 2 debe ingresarse", "Advertencia", JOptionPane.WARNING_MESSAGE);
                } else {
                    if (jtxtFCodEst1.getText().equals(jtxtFCodEst2.getText())) {
                        JOptionPane.showMessageDialog(null, "Los codigos de los estudiantes no pueden ser iguales", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    } else {
                        registrarFormatoA();
                    }
                }
            } else {
                registrarFormatoA();
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    /**
     * Método que registra el formato A en el objeto remoto.
     */
    public void registrarFormatoA() {
        try {
            String estudiante2 = "";
            int codEst2 = 0;
            int codEst1 = Integer.parseInt(jtxtFCodEst1.getText());
            if (jtxtFCodEst2.getText().isEmpty()) {
                codEst2 = 0;
            } else {
                codEst2 = Integer.parseInt(jtxtFCodEst2.getText());
            }
            int codigo = Integer.parseInt(jlbCodReg.getText());
            String programa = (String) jcmbProgramas.getSelectedItem();//jtxtFPrograma.getText();
            String titulo = jtxtFTitulo.getText();
            String estudiante1 = jtxtFEst1.getText();
            if (jtxtFEst2.getText().isEmpty()) {
                estudiante2 = "";
            } else {
                estudiante2 = jtxtFEst2.getText();
            }
            String director = jtxtFDirector.getText();
            String coDirector = jtxtFCodirector.getText();
            String objetivos = jtxtAObjetivos.getText();
            clsFormatoADTO formatoA = new clsFormatoADTO(codigo, programa, titulo, estudiante1, codEst1, estudiante2, codEst2, director, coDirector, objetivos, idDirector, 1);
            boolean registrar = objRemotoAnteproyectos.RegistrarFormatoA(formatoA);
            if (registrar == true) {
                objRemotoAnteproyectos.registrarAnteproyectoEnCallback(idDirector, codigo);
                JOptionPane.showMessageDialog(null, "Formato A registrado exitosamente");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar el Foramto A", "Error en el registro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método que captura el evento del mouse o ratón al efectuar un click en el botón salir y posteriormente
     * cierra sesión.
     * @param evt evento.
     */
    private void jlbBSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbBSalirMouseClicked
        try {
            objRemotoUsuarios.CerrarSesion(idDirector);
            GUIInicioSesion ini = new GUIInicioSesion(objRemotoUsuarios, objRemotoAnteproyectos, objRemotoSeguimiento);
            ini.setVisible(true);
            ini.setLocationRelativeTo(null);
            this.dispose();
        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jlbBSalirMouseClicked

    /**
     * Método que solicita un código unico para el formato A, y ajusta los campos de registro.
     * @param evt 
     */
    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed
        try {
            codigo = this.objRemotoAnteproyectos.SolicitarCodigo();
            jlbCodReg.setText(Integer.toString(codigo));
            btnSolicitar.setEnabled(false);
            jcmbProgramas.setEnabled(true);
            jtxtFTitulo.setEnabled(true);
            jtxtFEst1.setEnabled(true);
            jtxtFCodEst1.setEnabled(true);
            jtxtFEst2.setEnabled(true);
            jtxtFCodEst2.setEnabled(true);
            jtxtFCodirector.setEnabled(true);
            jtxtAObjetivos.setEnabled(true);
            btnRegistrar.setEnabled(true);
        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSolicitarActionPerformed

    /**
     * Este método se ejecuta cuando el usuario presiona una tecla para ingresar el codigo del
     * estudiante, restringiendolo unicamente a números.
     * @param evt 
     */
    private void jtxtFCodEst1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtFCodEst1KeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtFCodEst1KeyTyped

    /**
     * Este método se ejecuta cuando el usuario presiona una tecla para ingresar el codigo del
     * estudiante, restringiendolo unicamente a números.
     * @param evt 
     */
    private void jtxtFCodEst2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtFCodEst2KeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtFCodEst2KeyTyped

    /**
     * Método que captura el evento del mouse o ratón al efectuar un click en el botón salir y posteriormente
     * cierra sesión.
     * @param evt evento.
     */
    private void jlbSalirNotificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbSalirNotificacionMouseClicked
        try {
            objRemotoUsuarios.CerrarSesion(idDirector);
            GUIInicioSesion ini = new GUIInicioSesion(objRemotoUsuarios, objRemotoAnteproyectos, objRemotoSeguimiento);
            ini.setVisible(true);
            ini.setLocationRelativeTo(null);
            this.dispose();
        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jlbSalirNotificacionMouseClicked

    /**
     * Método que captura el evento de remitir un anteproyecto por parte del director.
     * @param evt evento.
     */
    private void btnRemitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemitirActionPerformed
        try {
            if (jcmbAntSinRemitir.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(null, "Este campo no puede estar vacio", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                int codigoAnt = Integer.parseInt(jcmbAntSinRemitir.getSelectedItem().toString());
                boolean remitido = objRemotoAnteproyectos.remitirAnteproyecto(codigoAnt);
                if (remitido) {
                    JOptionPane.showMessageDialog(null, "Anteproyecto remitido correctamente");
                    jcmbAntSinRemitir.removeAllItems();
                    ListarCmbAnteproyectos();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al remitir el anteproyecto", "Error al remitir", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRemitirActionPerformed

    /**
     * Método que se activa cuando se cierra la ventana en el icono rojo de la parte posterior derecha,
     * cierra y destruye la sesión.
     * @param evt 
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            objRemotoUsuarios.CerrarSesion(idDirector);
            GUIInicioSesion ini = new GUIInicioSesion(objRemotoUsuarios, objRemotoAnteproyectos, objRemotoSeguimiento);
            ini.setVisible(true);
            ini.setLocationRelativeTo(null);
            this.dispose();
        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(GUIMenuDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMenuDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMenuDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMenuDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMenuDirector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRemitir;
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jcmbAntSinRemitir;
    private javax.swing.JComboBox<String> jcmbProgramas;
    private javax.swing.JLabel jlbBSalir;
    private javax.swing.JLabel jlbCod;
    private javax.swing.JLabel jlbCodEst1;
    private javax.swing.JLabel jlbCodEst2;
    private javax.swing.JLabel jlbCodReg;
    private javax.swing.JLabel jlbCodirector;
    private javax.swing.JLabel jlbEst1;
    private javax.swing.JLabel jlbEst2;
    private javax.swing.JLabel jlbImgRegistrarA;
    private javax.swing.JLabel jlbObjetivos;
    private javax.swing.JLabel jlbPrograma;
    private javax.swing.JLabel jlbSalirNotificacion;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JLabel jnlDirector;
    private javax.swing.JTextArea jtxtANotificacion;
    private javax.swing.JTextArea jtxtAObjetivos;
    private javax.swing.JTextField jtxtFCodEst1;
    private javax.swing.JTextField jtxtFCodEst2;
    private javax.swing.JTextField jtxtFCodirector;
    private javax.swing.JTextField jtxtFDirector;
    private javax.swing.JTextField jtxtFEst1;
    private javax.swing.JTextField jtxtFEst2;
    private javax.swing.JTextField jtxtFTitulo;
    // End of variables declaration//GEN-END:variables
}
