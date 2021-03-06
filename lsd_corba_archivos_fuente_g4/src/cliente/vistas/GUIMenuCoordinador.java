/**
 * Presentado por: Jefferson Eduardo Campo Y Danny Alberto Diaz Mage
 */
package cliente.vistas;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sop_corba.GestionAnteproyectosIntOperations;
import sop_corba.GestionSeguimientoIntOperations;
import sop_corba.GestionUsuariosIntOperations;
import sop_corba.clsFormatoADTO;
import sop_corba.clsFormatoBDTO;
import sop_corba.clsFormatoCDTO;
import sop_corba.clsFormatoDDTO;
import sop_corba.clsUsuariosDTO;

public class GUIMenuCoordinador extends javax.swing.JFrame {
    //Atributos
    private static GestionAnteproyectosIntOperations refGestion;
    private static GestionSeguimientoIntOperations refSeguimiento;
    private static GestionUsuariosIntOperations refUsuarios;

    public GUIMenuCoordinador(GestionAnteproyectosIntOperations refGestion, GestionSeguimientoIntOperations refSeguimiento, GestionUsuariosIntOperations refUsuarios) {
        initComponents();
        GUIMenuCoordinador.refUsuarios = refUsuarios;
        GUIMenuCoordinador.refGestion = refGestion;
        GUIMenuCoordinador.refSeguimiento = refSeguimiento;
        listarEvaluadores();
        listarAntFormatoC();
        listarNoAsignados();
        llenarCmbEvaluadores();
        llenarCmbAnteproyectos();
        llenarcmbAnteproyectosReg();
    }

    /**
     * Constructor vacio.
     */
    public GUIMenuCoordinador() {}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlbBSalir = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEvaluadores = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaSA = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcmbAnteproyectosAsig = new javax.swing.JComboBox<>();
        jcmbEvaluador1 = new javax.swing.JComboBox<>();
        jcmbEvaluador2 = new javax.swing.JComboBox<>();
        btnAsignar = new javax.swing.JButton();
        jlbImgAsignar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlbSalirReg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAnte = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jcmbConcepto = new javax.swing.JComboBox<>();
        btnRegistrarFormato = new javax.swing.JButton();
        jcmbEstructura = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtxtAObs = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jcmbAnteproyectos = new javax.swing.JComboBox<>();
        jlbImgRegistrarD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu del Coordinador");
        setResizable(false);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 26)); // NOI18N
        jLabel1.setText("Asignar Evaluadores");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 11, -1, -1));

        jlbBSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/CerrarSesion.png"))); // NOI18N
        jlbBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbBSalirMouseClicked(evt);
            }
        });
        jPanel3.add(jlbBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
        jLabel9.setText("Lista Evaluadores");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 59, -1, -1));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
        jLabel6.setText("Asignar");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
        jLabel13.setText("Lista Anteproyectos sin Asignar");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 208, -1, -1));

        tablaEvaluadores.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tablaEvaluadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Evaluador", "Nombre"
            }
        ));
        jScrollPane2.setViewportView(tablaEvaluadores);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 89, -1, 100));

        tablaSA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Codigo Anteproyecto"
            }
        ));
        jScrollPane5.setViewportView(tablaSA);

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 238, -1, 104));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jLabel2.setText("Codigo Anteproyecto");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, 20));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jLabel3.setText("ID Evaluador 1");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jLabel4.setText("ID Evaluador 2");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jcmbAnteproyectosAsig.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel3.add(jcmbAnteproyectosAsig, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 190, -1));

        jcmbEvaluador1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel3.add(jcmbEvaluador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 190, -1));

        jcmbEvaluador2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel3.add(jcmbEvaluador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 190, -1));

        btnAsignar.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        btnAsignar.setText("Asignar Evaluadores");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });
        jPanel3.add(btnAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, -1, -1));

        jlbImgAsignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/asignarEvaluadores.png"))); // NOI18N
        jPanel3.add(jlbImgAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 590));

        jTabbedPane1.addTab("Asignar Evaluadores", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 26)); // NOI18N
        jLabel5.setText("Registro Formato D");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
        jLabel7.setText("Registro");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 235, -1, -1));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
        jLabel8.setText("Lista Anteproyectos Disponibles");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 59, -1, -1));

        jlbSalirReg.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbSalirReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/CerrarSesion.png"))); // NOI18N
        jlbSalirReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbSalirRegMouseClicked(evt);
            }
        });
        jPanel4.add(jlbSalirReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        tablaAnte.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tablaAnte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Codigo Anteproyecto"
            }
        ));
        jScrollPane1.setViewportView(tablaAnte);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 89, 436, 128));

        jLabel14.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jLabel14.setText("Concepto");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, 30));

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jLabel10.setText("Codigo Anteproyecto");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 265, -1, 30));

        jcmbConcepto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcmbConcepto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aprobado", "No Aprobado" }));
        jPanel4.add(jcmbConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 243, -1));

        btnRegistrarFormato.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        btnRegistrarFormato.setText("Registrar");
        btnRegistrarFormato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFormatoActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegistrarFormato, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, -1, -1));

        jcmbEstructura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcmbEstructura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Correcto", "Incorrecto" }));
        jPanel4.add(jcmbEstructura, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 243, -1));

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jLabel12.setText("Observaciones");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jtxtAObs.setColumns(20);
        jtxtAObs.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtAObs.setRows(5);
        jScrollPane3.setViewportView(jtxtAObs);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 243, -1));

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jLabel11.setText("Estructura");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, 30));

        jcmbAnteproyectos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel4.add(jcmbAnteproyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 240, -1));

        jlbImgRegistrarD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/registrarD.png"))); // NOI18N
        jPanel4.add(jlbImgRegistrarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 590));

        jTabbedPane1.addTab("Registrar Formato D", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * M??todo que lista los evaluadores disponibles en el campo de area de texto donde se muestra su id, nombre.
     */
    public void listarEvaluadores() {
        try {
            clsUsuariosDTO[] evaluadoresArray = refUsuarios.listarEvaluadores();
            ArrayList<clsUsuariosDTO> evaluadores = new ArrayList(Arrays.asList(evaluadoresArray));
            DefaultTableModel modelo = new DefaultTableModel();
            if (evaluadores.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se tienen evaluadores disponibles", "Advertencia al listar", JOptionPane.WARNING_MESSAGE);
                modelo.addColumn("ID Evaluador");
                modelo.addColumn("Nombre Evaluador");
                Object[] obj = new Object[]{"", ""};
                modelo.addRow(obj);
                tablaEvaluadores.setModel(modelo);
            } else {
                modelo.addColumn("ID Evaluador");
                modelo.addColumn("Nombre Evaluador");
                tablaEvaluadores.setEnabled(false);
                for (int i = 0; i < evaluadores.size(); i++) {
                    clsUsuariosDTO evaluador = evaluadores.get(i);
                    Object[] obj = new Object[]{evaluador.identificacion, evaluador.nomCompleto};
                    modelo.addRow(obj);
                }
                tablaEvaluadores.setModel(modelo);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * M??todo que muestra los anteproyectos que aun no han sido asignados.
     */
    public void listarNoAsignados() {
        try {
            clsFormatoADTO[] fsas = refGestion.listaSinAsignar();
            DefaultTableModel modelo = new DefaultTableModel();
            ArrayList<clsFormatoADTO> fsa = new ArrayList(Arrays.asList(fsas));
            if (fsa.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se tienen proyectos para asignar", "Advertencia al listar", JOptionPane.WARNING_MESSAGE);
                modelo.addColumn("Codigo Anteproyecto");
                Object[] obj = new Object[]{""};
                modelo.addRow(obj);
                tablaSA.setModel(modelo);
            } else {
                modelo.addColumn("Codigo Anteproyecto");
                tablaSA.setEnabled(false);
                for (int i = 0; i < fsa.size(); i++) {
                    clsFormatoADTO formA = fsa.get(i);
                    Object[] obj = new Object[]{formA.codAnteproyecto};
                    modelo.addRow(obj);
                }
                tablaSA.setModel(modelo);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * M??todo que completa los campos de combo box, con la referencia de los
     * evaluadores para que puedan ser seleccionados por el usuario.
     */
    public void llenarCmbEvaluadores() {
        try {
            clsUsuariosDTO[] evaluadoresArray = refUsuarios.listarEvaluadores();
            ArrayList<clsUsuariosDTO> evaluadores = new ArrayList(Arrays.asList(evaluadoresArray));
            for (int i = 0; i < evaluadores.size(); i++) {
                String codEva = String.valueOf(evaluadores.get(i).identificacion);
                jcmbEvaluador1.addItem(codEva);
                jcmbEvaluador2.addItem(codEva);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * M??todo que completa los campos de combo box, con la referencia de los
     * anteproyectos para que puedan ser seleccionados por el usuario.
     */
    public void llenarCmbAnteproyectos() {
        try {
            clsFormatoADTO[] fsas = refGestion.listaSinAsignar();
            ArrayList<clsFormatoADTO> fsa = new ArrayList(Arrays.asList(fsas));
            for (int i = 0; i < fsa.size(); i++) {
                String codAnte = String.valueOf(fsa.get(i).codAnteproyecto);
                jcmbAnteproyectosAsig.addItem(codAnte);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * M??todo que completa los campos de combo box, con la referencia de los
     * anteproyectos registrados para que puedan ser seleccionados por el usuario.
     */
    public void llenarcmbAnteproyectosReg() {
        try {
            clsFormatoCDTO[] formatosArray = refGestion.listaAteproyectosC();
            ArrayList<clsFormatoCDTO> formatos = new ArrayList(Arrays.asList(formatosArray));
            for (int i = 0; i < formatos.size(); i++) {
                String codAnte = String.valueOf(formatos.get(i).codAnteproyecto);
                jcmbAnteproyectos.addItem(codAnte);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * M??todo que lista los anteproyectos asignados al coordinador.
     */
    public void listarAntFormatoC() {
        try {
            clsFormatoCDTO[] formatosArray = refGestion.listaAteproyectosC();
            DefaultTableModel modelo = new DefaultTableModel();
            ArrayList<clsFormatoCDTO> formatos = new ArrayList(Arrays.asList(formatosArray));
            if (formatos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No tiene anteproyectos disponibles para registrar en el formato D", "Advertencia al listar", JOptionPane.WARNING_MESSAGE);
                modelo.addColumn("Codigo Anteproyecto");
                Object[] obj = new Object[]{""};
                modelo.addRow(obj);
                tablaAnte.setModel(modelo);
            } else {
                modelo.addColumn("Codigo Anteproyecto");
                tablaAnte.setEnabled(false);
                for (int i = 0; i < formatos.size(); i++) {
                    clsFormatoCDTO formato = formatos.get(i);
                    Object[] obj = new Object[]{formato.codAnteproyecto};
                    modelo.addRow(obj);
                }
                tablaAnte.setModel(modelo);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * M??todo que limpia los combo box de anteproyectos sin asignar, evaluador 1 y 2.
     */
    public void limpiarAsignacion() {
        jcmbAnteproyectosAsig.removeAllItems();
        jcmbEvaluador1.removeAllItems();
        jcmbEvaluador2.removeAllItems();
    }
    
    /**
     * M??todo que limpia los combo box de anteproyectos, y ajusta los parametros en predeterminado.
     */
    public void limpiarRegistroFormato() {
        jcmbAnteproyectos.removeAllItems();
        jcmbConcepto.setSelectedItem("Aprobado");
        jcmbEstructura.setSelectedItem("Correcto");
        jtxtAObs.setText("");
    }
    
    /**
     * M??todo que captura la acci??n de asignar los evaluadores a un anteproyecto
     * @param evt 
     */
    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        try {
            int aux1 = 0;
            int aux2 = 0;
            int aux3 = 0;
            if (jcmbEvaluador1.getSelectedItem().equals(jcmbEvaluador2.getSelectedItem())) {
                JOptionPane.showMessageDialog(null, "Los ID ingresados NO pueden ser iguales", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                if (jcmbAnteproyectosAsig.getSelectedItem() == null) {
                    JOptionPane.showMessageDialog(null, "Este campo para el codigo no puede estar vacio", "Advertencia", JOptionPane.WARNING_MESSAGE);
                } else {
                    int codigo = Integer.parseInt(jcmbAnteproyectosAsig.getSelectedItem().toString());
                    int id1 = Integer.parseInt(jcmbEvaluador1.getSelectedItem().toString());
                    int id2 = Integer.parseInt(jcmbEvaluador2.getSelectedItem().toString());
                    aux1 = refGestion.ConsultarAnteproyectoB(codigo);
                    aux2 = refUsuarios.consultarEvaluador(id1);
                    aux3 = refUsuarios.consultarEvaluador(id2);
                    if (aux1 == 1 && aux2 == 1 && aux3 == 1) {
                        clsFormatoBDTO formatoB1 = new clsFormatoBDTO(codigo, "", "", "", id1);
                        clsFormatoBDTO formatoB2 = new clsFormatoBDTO(codigo, "", "", "", id2);
                        boolean asignar1 = refGestion.AsignarFormatoB(formatoB1);
                        boolean asignar2 = refGestion.AsignarFormatoB(formatoB2);
                        if (asignar1 == true && asignar2 == true) {
                            JOptionPane.showMessageDialog(null, "Anteproyecto asigando a los evaluadores correctamente");
                            listarNoAsignados();
                            limpiarAsignacion();
                            llenarCmbAnteproyectos();
                            llenarCmbEvaluadores();
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo asignar el anteproyecto a los evaluadores", "Error al asignar evaluadores", JOptionPane.ERROR_MESSAGE);
                        }
                    } else if (aux1 == -1) {
                        JOptionPane.showMessageDialog(null, "No hay Anteproyectos registrados", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    } else if (aux1 == -2) {
                        JOptionPane.showMessageDialog(null, "El anteproyecto ya ha sido asigando", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    } else if (aux1 == -3) {
                        JOptionPane.showMessageDialog(null, "Anteproyecto no existe en el sistema o ya se encuetra evaluado", "Error sin anteproyectos", JOptionPane.ERROR_MESSAGE);
                    } else if (aux2 == -1) {
                        JOptionPane.showMessageDialog(null, "No hay usuarios registrados en el sistema", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    } else if (aux2 == -2) {
                        JOptionPane.showMessageDialog(null, "El usuario con ID " + id1 + " no fue encontrado", "Error de usuario no existente", JOptionPane.ERROR_MESSAGE);
                    } else if (aux3 == -2) {
                        JOptionPane.showMessageDialog(null, "El usuario con ID " + id2 + " no fue encontrado", "Error de usuario no existente", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAsignarActionPerformed

    /**
     * M??todo que captura el evento del mouse o rat??n al efectuar un click en el bot??n salir
     * en la ventana de asignar evaluadores.
     * @param evt evento.
     */
    private void jlbBSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbBSalirMouseClicked
        GUIInicioSesion ini = new GUIInicioSesion(refGestion, refSeguimiento,refUsuarios);
        ini.setVisible(true);
        ini.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jlbBSalirMouseClicked

    /**
     * M??todo que captura el evento del mouse o rat??n al efectuar un click en el bot??n salir
     * en la ventana de registrar formato.
     * @param evt evento.
     */
    private void jlbSalirRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbSalirRegMouseClicked
        GUIInicioSesion ini = new GUIInicioSesion(refGestion, refSeguimiento,refUsuarios);
        ini.setVisible(true);
        ini.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jlbSalirRegMouseClicked

    /**
     * M??todo que captura el evento del bot??n de registrar el formato C.
     * @param evt 
     */
    private void btnRegistrarFormatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarFormatoActionPerformed
        try {
            if (jcmbAnteproyectos.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(null, "El campo del codigo no puede estar vacio ","Advertencia",JOptionPane.WARNING_MESSAGE);
            } else {
                int codigo = Integer.parseInt(jcmbAnteproyectos.getSelectedItem().toString());
                int flujo = refGestion.VerificarAnteproyecto(codigo);
                if (flujo == 0) {
                    JOptionPane.showMessageDialog(null, "Anteproyecto ingresado no encontrado", "Error de busqueda", JOptionPane.ERROR_MESSAGE);
                } else if (flujo < 4) {
                    JOptionPane.showMessageDialog(null, "El anteproyecto ingresado no ha sido evaluado", "Advertencia", JOptionPane.WARNING_MESSAGE);
                } else if (flujo == 5) {
                    JOptionPane.showMessageDialog(null, "El anteproyecto ya fue evaluado", "Advertencia", JOptionPane.WARNING_MESSAGE);
                } else {
                    int conceptoC = refGestion.ConsultarConceptoC(codigo);
                    if (conceptoC == 1) {
                        String concepto = (String) jcmbConcepto.getSelectedItem();
                        String estructura = (String) jcmbEstructura.getSelectedItem();
                        String observaciones = jtxtAObs.getText();
                        clsFormatoDDTO formatoD = new clsFormatoDDTO(codigo, estructura, concepto, observaciones);
                        boolean registroD = refGestion.RegistrarFormatoD(formatoD);
                        if (registroD == true) {
                            JOptionPane.showMessageDialog(null, "Anteproyecto registrado exitosamente en el formato D");
                            listarAntFormatoC();
                            limpiarRegistroFormato();
                            llenarcmbAnteproyectosReg();
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo registrar el anteproyecto", "Error al registrar", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El Anteproyecto ingresado no fue aprobado por el Jefe de Departamento", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarFormatoActionPerformed

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
            java.util.logging.Logger.getLogger(GUIMenuCoordinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMenuCoordinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMenuCoordinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMenuCoordinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMenuCoordinador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnRegistrarFormato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jcmbAnteproyectos;
    private javax.swing.JComboBox<String> jcmbAnteproyectosAsig;
    private javax.swing.JComboBox<String> jcmbConcepto;
    private javax.swing.JComboBox<String> jcmbEstructura;
    private javax.swing.JComboBox<String> jcmbEvaluador1;
    private javax.swing.JComboBox<String> jcmbEvaluador2;
    private javax.swing.JLabel jlbBSalir;
    private javax.swing.JLabel jlbImgAsignar;
    private javax.swing.JLabel jlbImgRegistrarD;
    private javax.swing.JLabel jlbSalirReg;
    private javax.swing.JTextArea jtxtAObs;
    private javax.swing.JTable tablaAnte;
    private javax.swing.JTable tablaEvaluadores;
    private javax.swing.JTable tablaSA;
    // End of variables declaration//GEN-END:variables
}
