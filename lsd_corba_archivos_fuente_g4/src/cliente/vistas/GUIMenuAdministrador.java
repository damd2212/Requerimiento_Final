/**
 * Presentado por: Jefferson Eduardo Campo Y Danny Alberto Diaz Mage
 */
package cliente.vistas;

import java.rmi.RemoteException;
import javax.swing.JOptionPane;
import sop_corba.GestionAnteproyectosIntOperations;
import sop_corba.GestionSeguimientoIntOperations;
import sop_corba.GestionUsuariosIntOperations;
import sop_corba.clsUsuariosDTO;

public class GUIMenuAdministrador extends javax.swing.JFrame {
    //Atributos
    private static GestionAnteproyectosIntOperations refGestion;
    private static GestionSeguimientoIntOperations refSeguimiento;
    private static GestionUsuariosIntOperations refUsuarios;
    private int numDocumento;
    
    /**
     * Constructor parametrizado.
     * @param refGestion
     * @param refSeguimiento
     * @param refUsuarios
     */
    public GUIMenuAdministrador(GestionAnteproyectosIntOperations refGestion, GestionSeguimientoIntOperations refSeguimiento, GestionUsuariosIntOperations refUsuarios) {
        initComponents();
        GUIMenuAdministrador.refGestion = refGestion;
        GUIMenuAdministrador.refSeguimiento = refSeguimiento;
        GUIMenuAdministrador.refUsuarios = refUsuarios;
        jtxtFnomCompletoMod.setEnabled(false);
        jcmbRolMod.setEnabled(false);
        jcmbProgramasMod.setEnabled(false);
        jtxtFUsuarioMod.setEnabled(false);
        jpassFClaveMod.setEnabled(false);
        btnActualizar.setEnabled(false);
    }

    /**
     * Constructor vacio.
     */
    public GUIMenuAdministrador(){}

    /**
     * Método que ajusta los valores de los campos de texto y combo box en sus valores predeterminados.
     */
    public void limpiarRegistro() {
        jtxtFIDReg.setText("");
        jtxtFnomCompletoReg.setText("");
        jcmbRolReg.setSelectedItem("Director");
        jcmbProgramasReg.setSelectedItem("PIS");
        jtxtFUsuarioReg.setText("");
        jpassFClaveReg.setText("");
    }

    /**
     * Método que ajusta los valores de los campos de texto y combo box en sus valores predeterminados.
     */
    public void limpiarConssultar() {
        jlbnomCompleto.setText("-");
        jlbRol.setText("-");
        jlbDepartamento.setText("-");
        jlbUsuario.setText("-");
    }

    /**
     * Método que ajusta los valores de los campos de texto y combo box en sus valores predeterminados.
     */
    public void limpiarActualizar() {
        jtxtFnomCompletoMod.setText("");
        jcmbRolMod.setSelectedItem("Director");
        jcmbProgramasMod.setSelectedItem("PIS");
        jtxtFUsuarioMod.setText("");
        jpassFClaveMod.setText("");
        jtxtFnomCompletoMod.setEnabled(false);
        jcmbRolMod.setEnabled(false);
        jcmbProgramasMod.setEnabled(false);
        jtxtFUsuarioMod.setEnabled(false);
        jpassFClaveMod.setEnabled(false);
        btnActualizar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jlbTituoReg = new javax.swing.JLabel();
        jlbIDRegistro = new javax.swing.JLabel();
        jtxtFIDReg = new javax.swing.JTextField();
        jtxtFnomCompletoReg = new javax.swing.JTextField();
        jlbnomCompletoReg = new javax.swing.JLabel();
        jlbRolReg = new javax.swing.JLabel();
        jcmbRolReg = new javax.swing.JComboBox<>();
        jcmbProgramasReg = new javax.swing.JComboBox<>();
        jlbDepartamentoReg = new javax.swing.JLabel();
        jlbUsuarioReg = new javax.swing.JLabel();
        jtxtFUsuarioReg = new javax.swing.JTextField();
        jlbClaveReg = new javax.swing.JLabel();
        jpassFClaveReg = new javax.swing.JPasswordField();
        jlbBSalirReg = new javax.swing.JLabel();
        btnRegistraar = new javax.swing.JButton();
        jlbImgRegUsuario = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jlbnomCompleto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlbRol = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlbDepartamento = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlbUsuario = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtxtFIDBuscarCon = new javax.swing.JTextField();
        jlbBBuscarCon = new javax.swing.JLabel();
        jlbBSalir = new javax.swing.JLabel();
        jlbImgConsultar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlbIDMod = new javax.swing.JLabel();
        jtxtFIDMod = new javax.swing.JTextField();
        jlbnomCompletoMod = new javax.swing.JLabel();
        jtxtFnomCompletoMod = new javax.swing.JTextField();
        jlbRolMod = new javax.swing.JLabel();
        jcmbRolMod = new javax.swing.JComboBox<>();
        jlbDepartamentoMod = new javax.swing.JLabel();
        jcmbProgramasMod = new javax.swing.JComboBox<>();
        jlbUsuarioMod = new javax.swing.JLabel();
        jtxtFUsuarioMod = new javax.swing.JTextField();
        jlbClaveMod = new javax.swing.JLabel();
        jpassFClaveMod = new javax.swing.JPasswordField();
        btnActualizar = new javax.swing.JButton();
        jlbBuscarAct = new javax.swing.JLabel();
        jlbBSalirAct = new javax.swing.JLabel();
        jlbImgActualizar = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Administrador");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbTituoReg.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 26)); // NOI18N
        jlbTituoReg.setText("Registrar Usuario");
        jPanel1.add(jlbTituoReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        jlbIDRegistro.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbIDRegistro.setText("Identificacion");
        jPanel1.add(jlbIDRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jtxtFIDReg.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtFIDReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtFIDRegKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtFIDReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 67, 200, -1));

        jtxtFnomCompletoReg.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(jtxtFnomCompletoReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 200, -1));

        jlbnomCompletoReg.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbnomCompletoReg.setText("Nombre Completo");
        jPanel1.add(jlbnomCompletoReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jlbRolReg.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbRolReg.setText("Role");
        jPanel1.add(jlbRolReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jcmbRolReg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Director", "Evaluador", "Jefe Departamento", "Coordinador", "Decano" }));
        jcmbRolReg.setBorder(null);
        jPanel1.add(jcmbRolReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 200, -1));

        jcmbProgramasReg.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcmbProgramasReg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sistemas", "Electronica y Telecomunicaciones", "Telematica" }));
        jPanel1.add(jcmbProgramasReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 200, -1));

        jlbDepartamentoReg.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbDepartamentoReg.setText("Departamento");
        jPanel1.add(jlbDepartamentoReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jlbUsuarioReg.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbUsuarioReg.setText("Usuario");
        jPanel1.add(jlbUsuarioReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jtxtFUsuarioReg.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(jtxtFUsuarioReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 200, -1));

        jlbClaveReg.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbClaveReg.setText("Contrasenia");
        jPanel1.add(jlbClaveReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jpassFClaveReg.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(jpassFClaveReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 200, 20));

        jlbBSalirReg.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbBSalirReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cerrarSesion.png"))); // NOI18N
        jlbBSalirReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbBSalirRegMouseClicked(evt);
            }
        });
        jPanel1.add(jlbBSalirReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        btnRegistraar.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        btnRegistraar.setText("Registrar");
        btnRegistraar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistraar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        jlbImgRegUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/RegistrarUsuario.png"))); // NOI18N
        jPanel1.add(jlbImgRegUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 420));

        jTabbedPane1.addTab("Registrar Usuario", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jLabel3.setText("Nombre Completo");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jlbnomCompleto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbnomCompleto.setText("-");
        jPanel3.add(jlbnomCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jLabel4.setText("Rol");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jlbRol.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbRol.setText("-");
        jPanel3.add(jlbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jLabel5.setText("Departamento");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 194, -1, -1));

        jlbDepartamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbDepartamento.setText("-");
        jPanel3.add(jlbDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 195, -1, -1));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jLabel6.setText("Usuario");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jlbUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbUsuario.setText("-");
        jPanel3.add(jlbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 231, -1, -1));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 26)); // NOI18N
        jLabel8.setText("Consultar Usuario");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 24, 210, -1));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jLabel9.setText("ID Usuario");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 20));

        jtxtFIDBuscarCon.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtFIDBuscarCon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtFIDBuscarConKeyTyped(evt);
            }
        });
        jPanel3.add(jtxtFIDBuscarCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 146, -1));

        jlbBBuscarCon.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jlbBBuscarCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icoBuscar.png"))); // NOI18N
        jlbBBuscarCon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbBBuscarConMouseClicked(evt);
            }
        });
        jPanel3.add(jlbBBuscarCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 40, 40));

        jlbBSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/CerrarSesion.png"))); // NOI18N
        jlbBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbBSalirMouseClicked(evt);
            }
        });
        jPanel3.add(jlbBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        jlbImgConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/adminconsultar.png"))); // NOI18N
        jPanel3.add(jlbImgConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 420));

        jTabbedPane1.addTab("Consultar Usuario", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 26)); // NOI18N
        jLabel1.setText("Actualizar Datos Usuario");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 22, -1, -1));

        jlbIDMod.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbIDMod.setText("Identificacion");
        jPanel4.add(jlbIDMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 72, -1, -1));

        jtxtFIDMod.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtFIDMod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtFIDModKeyTyped(evt);
            }
        });
        jPanel4.add(jtxtFIDMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 170, -1));

        jlbnomCompletoMod.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbnomCompletoMod.setText("Nombre Completo");
        jPanel4.add(jlbnomCompletoMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 113, -1, -1));

        jtxtFnomCompletoMod.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel4.add(jtxtFnomCompletoMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 111, 170, -1));

        jlbRolMod.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbRolMod.setText("Rol");
        jPanel4.add(jlbRolMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 154, -1, -1));

        jcmbRolMod.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcmbRolMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Director", "Evaluador", "Jefe Departamento", "Coordinador", "Decano" }));
        jPanel4.add(jcmbRolMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 152, 170, -1));

        jlbDepartamentoMod.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbDepartamentoMod.setText("Departamento");
        jPanel4.add(jlbDepartamentoMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 195, -1, -1));

        jcmbProgramasMod.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcmbProgramasMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PIS", "PIAI", "PIET", "TTM" }));
        jPanel4.add(jcmbProgramasMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 170, -1));

        jlbUsuarioMod.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbUsuarioMod.setText("Usuario");
        jPanel4.add(jlbUsuarioMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 236, -1, -1));

        jtxtFUsuarioMod.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel4.add(jtxtFUsuarioMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 234, 173, -1));

        jlbClaveMod.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbClaveMod.setText("Contrasenia");
        jPanel4.add(jlbClaveMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 275, -1, -1));
        jPanel4.add(jpassFClaveMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 275, 173, -1));

        btnActualizar.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel4.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 325, -1, -1));

        jlbBuscarAct.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbBuscarAct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icoBuscar.png"))); // NOI18N
        jlbBuscarAct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbBuscarActMouseClicked(evt);
            }
        });
        jPanel4.add(jlbBuscarAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 62, 40, 40));

        jlbBSalirAct.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbBSalirAct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/CerrarSesion.png"))); // NOI18N
        jlbBSalirAct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbBSalirActMouseClicked(evt);
            }
        });
        jPanel4.add(jlbBSalirAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        jlbImgActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/adminActualizar.png"))); // NOI18N
        jPanel4.add(jlbImgActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 420));

        jTabbedPane1.addTab("Actualizar Usuario", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que captura el evento del botón actualizar al efectuar un click, y posteriormente
     * modifica los valores de un usuario.
     * @param evt evento.
     */
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            if (jtxtFnomCompletoMod.getText().isEmpty() || jpassFClaveMod.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                String user = jtxtFUsuarioMod.getText();
                String Pass = new String(jpassFClaveMod.getPassword());
                if (user.length() < 8) {
                    JOptionPane.showMessageDialog(null, "El campo de usuario debe contener como minimo 8 caracteres", "Advertencia", JOptionPane.WARNING_MESSAGE);
                } else {
                    if (Pass.length() < 8) {
                        JOptionPane.showMessageDialog(null, "El campo de contraseña debe contener como minimo 8 caracteres", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    } else {
                        boolean vUsuario = validarAlfaNumerico(user);
                        boolean vPass = validarAlfaNumerico(Pass);
                        if (vUsuario == true) {
                            if (vPass == true) {
                                String nombre = jtxtFnomCompletoMod.getText();
                                String rol = (String) jcmbRolMod.getSelectedItem();
                                String departamento = (String)jcmbProgramasMod.getSelectedItem();//jtxtFDepartamentoMod.getText();
                                clsUsuariosDTO objUsuario = new clsUsuariosDTO(numDocumento, nombre, rol, departamento, user, Pass, false);
                                boolean mod = refUsuarios.ModificarUsuario(objUsuario);
                                if (mod == true) {
                                    JOptionPane.showMessageDialog(null, "Usuario Actualizado exitosamente");
                                    limpiarActualizar();
                                } else {
                                    JOptionPane.showMessageDialog(null, "No se pudo actualizar el usuario", "Error al actualizar", JOptionPane.ERROR_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "El campo de contraseña debe contener numeros y letras", "Advertencia", JOptionPane.WARNING_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El campo de usuario debe contener numeros y letras", "Advertencia", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed
    
    /**
     * Método que valida que un texto ingresado sea alfanumerico.
     * @param texto
     * @return 
     */
    public boolean validarAlfaNumerico(String texto) {
        boolean validar = false;
        char textoIngresado;
        byte conNumero = 0, conLetra = 0;
        for (byte i = 0; i < texto.length(); i++) {
            textoIngresado = texto.charAt(i);
            String aux = String.valueOf(textoIngresado);
            if (aux.matches("[a-z]") || aux.matches("[A-Z]")) {
                conLetra++;
            } else if (aux.matches("[0-9]")) {
                conNumero++;
            }
        }
        if (conNumero > 0 && conLetra > 0) {
            validar = true;
        }
        return validar;
    }

    /**
     * Método que busca un usuario a través de una identificación, para luego mostrar los datos relacionados
     * a esta identificación.
     * @param evt 
     */
    private void jlbBuscarActMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbBuscarActMouseClicked
        try {
            if (jtxtFIDMod.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo del ID No puede estar vacio", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                int id = Integer.parseInt(jtxtFIDMod.getText());
                clsUsuariosDTO usuario = refUsuarios.ConsultarUsuario(id);
                
                if (usuario.identificacion == -1 ) {
                    JOptionPane.showMessageDialog(null, "ID ingresado NO existente en el sistema", "Error al buscar usuario", JOptionPane.ERROR_MESSAGE);
                    limpiarActualizar();
                } else if (usuario.sesion) {
                    JOptionPane.showMessageDialog(null, "Debe cerrar la sesion del usuario para actualizar la informacion", "Error al recuperar usuario", JOptionPane.ERROR_MESSAGE);
                } else {
                    numDocumento = Integer.parseInt(jtxtFIDMod.getText());
                    jtxtFnomCompletoMod.setEnabled(true);
                    jcmbRolMod.setEnabled(true);
                    jcmbProgramasMod.setEnabled(true);
                    jpassFClaveMod.setEnabled(true);
                    btnActualizar.setEnabled(true);
                    jtxtFnomCompletoMod.setText(usuario.nomCompleto);
                    jcmbRolMod.setSelectedItem(usuario.role);
                    jcmbProgramasMod.setSelectedItem(usuario.departamento);
                    jtxtFUsuarioMod.setText(usuario.usuario);
                    jpassFClaveMod.setText(usuario.clave);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jlbBuscarActMouseClicked

    /**
     * Método que captura el evento del mouse o ratón al efectuar un click en el botón salir.
     * @param evt evento.
     */
    private void jlbBSalirActMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbBSalirActMouseClicked
        GUIInicioSesion ini = new GUIInicioSesion(refGestion, refSeguimiento, refUsuarios);
        ini.setVisible(true);
        ini.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jlbBSalirActMouseClicked

    /**
     * Este método se ejecuta cuando el usuario presiona una tecla para ingresar el codigo del
     * usuario, restringiendolo unicamente a números.
     * @param evt 
     */
    private void jtxtFIDRegKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtFIDRegKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtFIDRegKeyTyped

    /**
     * Este método se ejecuta cuando el usuario presiona una tecla para ingresar el codigo del
     * usuario, restringiendolo unicamente a números.
     * @param evt 
     */
    private void jtxtFIDModKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtFIDModKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();

        }
    }//GEN-LAST:event_jtxtFIDModKeyTyped

    /**
     * Método que captura la acción del botón buscar a través de una identificación ingresada, la cual
     * ajusta los valores en los campos de texto segun los datos del usuario encontrado.
     * @param evt 
     */
    private void jlbBBuscarConMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbBBuscarConMouseClicked
        try {
            if (jtxtFIDBuscarCon.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo del ID No puede estar vacio", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                int id = Integer.parseInt(jtxtFIDBuscarCon.getText());
                clsUsuariosDTO usuario = refUsuarios.ConsultarUsuario(id);
                
                if (usuario.identificacion == -1) {
                    JOptionPane.showMessageDialog(null, "ID ingresado NO existente en el sistema", "Error la consultar usuario", JOptionPane.ERROR_MESSAGE);
                    limpiarConssultar();
                } else {
                    jlbnomCompleto.setText(usuario.nomCompleto);
                    jlbRol.setText(usuario.role);
                    jlbDepartamento.setText(usuario.departamento);
                    jlbUsuario.setText(usuario.usuario);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jlbBBuscarConMouseClicked

    /**
     * Método que captura el evento del mouse o ratón al efectuar un click en el botón salir.
     * @param evt evento.
     */
    private void jlbBSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbBSalirMouseClicked
        // TODO add your handling code here:
        GUIInicioSesion ini = new GUIInicioSesion(refGestion,refSeguimiento,refUsuarios);
        ini.setVisible(true);
        ini.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jlbBSalirMouseClicked

    /**
     * Este método se ejecuta cuando el usuario presiona una tecla para ingresar el codigo del
     * usuario, restringiendolo unicamente a números.
     * @param evt 
     */
    private void jtxtFIDBuscarConKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtFIDBuscarConKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();

        }
    }//GEN-LAST:event_jtxtFIDBuscarConKeyTyped

    /**
     * Método que captura la acción del botón registrar, el cual, llama al método registrarUsuario.
     * @param evt 
     */
    private void btnRegistraarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraarActionPerformed
        try {
            if (jtxtFIDReg.getText().isEmpty() || jtxtFnomCompletoReg.getText().isEmpty() 
                    || jtxtFUsuarioReg.getText().isEmpty() || jpassFClaveReg.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                String role = (String) jcmbRolReg.getSelectedItem();
                if (role.equals("Decano")) {
                    int numDecano = refUsuarios.validarDecano();
                    if (numDecano > 0) {
                        JOptionPane.showMessageDialog(null, "Solo puede existir un decano para esta facultad", "Error de registro", JOptionPane.ERROR_MESSAGE);
                    } else {
                        registrarUsuario();
                    }
                } else {
                    registrarUsuario();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistraarActionPerformed

    /**
     * Método que registra un usuario en el objeto remoto de usuarios.
     */
    public void registrarUsuario() {
        try {
            String usuario = jtxtFUsuarioReg.getText();
            String Pass = new String(jpassFClaveReg.getPassword());
            if (usuario.length() < 8) {
                JOptionPane.showMessageDialog(null, "El usuario debe contener un minimo de 8 caracteres", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                if (Pass.length() < 8) {
                    JOptionPane.showMessageDialog(null, "La contraseña debe contener un minimo de 8 caracteres", "Advertencia", JOptionPane.WARNING_MESSAGE);
                } else {
                    boolean vUsuario = validarAlfaNumerico(usuario);
                    boolean vPass = validarAlfaNumerico(Pass);
                    if (vUsuario == true) {
                        if (vPass == true) {
                            int id = Integer.parseInt(jtxtFIDReg.getText());
                            int eUsuario = refUsuarios.ValidarRegistro(id, usuario);
                            if (eUsuario == 0) {
                                String nombre = jtxtFnomCompletoReg.getText();
                                String rol = (String) jcmbRolReg.getSelectedItem();
                                String departamento = (String)jcmbProgramasReg.getSelectedItem();//jtxtFDepartamentoReg.getText();
                                clsUsuariosDTO objUsuario = new clsUsuariosDTO(id, nombre, rol, departamento, usuario, Pass, false);
                                boolean registro = refUsuarios.RegistrarUsuario(objUsuario);
                                if (registro == true) {
                                    JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente");
                                    limpiarRegistro();
                                } else {
                                    JOptionPane.showMessageDialog(null, "No se pude registar el usuario", "Error al registrar", JOptionPane.ERROR_MESSAGE);
                                }
                            } else if (eUsuario == -1) {
                                JOptionPane.showMessageDialog(null, "Ya existe un usuario con la identificacion " + id, "Error", JOptionPane.ERROR_MESSAGE);
                            } else if (eUsuario == -2) {
                                JOptionPane.showMessageDialog(null, "Ya existe un usuario con el login " + usuario, "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "La contraseña ingresada debe contener numeros y letras", "Advertencia", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El usuario ingresado debe contener numeros y letras", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método que captura el evento del mouse o ratón al efectuar un click en el botón salir.
     * @param evt evento.
     */
    private void jlbBSalirRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbBSalirRegMouseClicked
        GUIInicioSesion ini = new GUIInicioSesion(refGestion,refSeguimiento,refUsuarios);
        ini.setVisible(true);
        ini.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jlbBSalirRegMouseClicked

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
            java.util.logging.Logger.getLogger(GUIMenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMenuAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegistraar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jcmbProgramasMod;
    private javax.swing.JComboBox<String> jcmbProgramasReg;
    private javax.swing.JComboBox<String> jcmbRolMod;
    private javax.swing.JComboBox<String> jcmbRolReg;
    private javax.swing.JLabel jlbBBuscarCon;
    private javax.swing.JLabel jlbBSalir;
    private javax.swing.JLabel jlbBSalirAct;
    private javax.swing.JLabel jlbBSalirReg;
    private javax.swing.JLabel jlbBuscarAct;
    private javax.swing.JLabel jlbClaveMod;
    private javax.swing.JLabel jlbClaveReg;
    private javax.swing.JLabel jlbDepartamento;
    private javax.swing.JLabel jlbDepartamentoMod;
    private javax.swing.JLabel jlbDepartamentoReg;
    private javax.swing.JLabel jlbIDMod;
    private javax.swing.JLabel jlbIDRegistro;
    private javax.swing.JLabel jlbImgActualizar;
    private javax.swing.JLabel jlbImgConsultar;
    private javax.swing.JLabel jlbImgRegUsuario;
    private javax.swing.JLabel jlbRol;
    private javax.swing.JLabel jlbRolMod;
    private javax.swing.JLabel jlbRolReg;
    private javax.swing.JLabel jlbTituoReg;
    private javax.swing.JLabel jlbUsuario;
    private javax.swing.JLabel jlbUsuarioMod;
    private javax.swing.JLabel jlbUsuarioReg;
    private javax.swing.JLabel jlbnomCompleto;
    private javax.swing.JLabel jlbnomCompletoMod;
    private javax.swing.JLabel jlbnomCompletoReg;
    private javax.swing.JPasswordField jpassFClaveMod;
    private javax.swing.JPasswordField jpassFClaveReg;
    private javax.swing.JTextField jtxtFIDBuscarCon;
    private javax.swing.JTextField jtxtFIDMod;
    private javax.swing.JTextField jtxtFIDReg;
    private javax.swing.JTextField jtxtFUsuarioMod;
    private javax.swing.JTextField jtxtFUsuarioReg;
    private javax.swing.JTextField jtxtFnomCompletoMod;
    private javax.swing.JTextField jtxtFnomCompletoReg;
    // End of variables declaration//GEN-END:variables
}
