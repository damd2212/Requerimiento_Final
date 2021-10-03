/**
 * Presentado por: Jefferson Eduardo Campo Y Danny Alberto Diaz Mage
 */
package cliente.vistas;

import SGestionAnteproyectos.sop_rmi.GestionAnteproyectosInt;
import SGestionAnteproyectos.sop_rmi.GestionUsuariosInt;
import SGestionAnteproyectos.dto.clsFormatoCDTO;
import SGestionAnteproyectos.dto.clsConceptosDTO;
import SGestionAnteproyectos.dto.clsFormatoBDTO;
import SSeguimientoAnteproyectos.sop_rmi.GestionSeguimientoInt;

import java.rmi.RemoteException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUIMenuJefeDepartamento extends javax.swing.JFrame {

    // Atributos 
    private static GestionAnteproyectosInt objRemotoAnteproyectos;
    private static GestionUsuariosInt objRemotoUsuarios;
    private static GestionSeguimientoInt objRemotoSeguimiento;

    /**
     * Constructor parametrizado.
     */
    public GUIMenuJefeDepartamento(GestionUsuariosInt objRemoto, GestionAnteproyectosInt objRemotoA, GestionSeguimientoInt objRemotoS) {
        initComponents();
        this.objRemotoUsuarios = objRemoto;
        this.objRemotoAnteproyectos = objRemotoA;
        this.objRemotoSeguimiento = objRemotoS;

        listarAnteproyectosDisponibles();
        listarCmbAnteproyectos();
    }

    /**
     * Constructor vacio.
     */
    public GUIMenuJefeDepartamento() {
    }

    /**
     * Método que ajusta los parametros predeterminados del formulario.
     */
    public void limpiar() {
        jcmbAnteproyectos.removeAllItems();
        jcmbConcepto.setSelectedItem("Aprobado");
        jcmbEstructura.setSelectedItem("Correcta");
        jtxtFObservaciones.setText("");
    }

    /**
     * Método que obtiene y lista los anteproyectos en un combo box.
     */
    public void listarCmbAnteproyectos() {
        try {
            ArrayList<Integer> formatos = objRemotoAnteproyectos.listaAntRemitidos();
            for (int i = 0; i < formatos.size(); i++) {
                String codAnte = String.valueOf(formatos.get(i));
                jcmbAnteproyectos.addItem(codAnte);
            }
        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Método que comprueba y lista los anteproyectos que estén disponibles y que hayan sido asignados
     * al jefe de departamento.
     */
    public void listarAnteproyectosDisponibles() {
        try {
            ArrayList<Integer> formatos = objRemotoAnteproyectos.listaAntRemitidos();
            DefaultTableModel modelo = new DefaultTableModel();
            if (formatos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No tiene anteproyectos asignados o remitidos", "Advertencia", JOptionPane.WARNING_MESSAGE);
                modelo.addColumn("Codigo Anteproyecto");
                Object[] obj = new Object[]{""};
                modelo.addRow(obj);
                tablaDisponibles.setModel(modelo);
            } else {
                modelo.addColumn("Codigo Anteproyecto");
                tablaDisponibles.setEnabled(false);
                for (int i = 0; i < formatos.size(); i++) {
                    int formato = formatos.get(i);
                    Object[] obj = new Object[]{formato};
                    modelo.addRow(obj);
                }
                tablaDisponibles.setModel(modelo);
            }

        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
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
        jPanel2 = new javax.swing.JPanel();
        jlbtitulo1 = new javax.swing.JLabel();
        jlbtitulo2 = new javax.swing.JLabel();
        jlbtitulo4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDisponibles = new javax.swing.JTable();
        jlbtitulo5 = new javax.swing.JLabel();
        jlbtitulo6 = new javax.swing.JLabel();
        jcmbEstructura = new javax.swing.JComboBox<>();
        jcmbConcepto = new javax.swing.JComboBox<>();
        jlbtitulo7 = new javax.swing.JLabel();
        jlbtitulo8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtFObservaciones = new javax.swing.JTextArea();
        jcmbAnteproyectos = new javax.swing.JComboBox<>();
        jlbBSalir = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jlbImgRegistrarC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu del Jefe de Departamento");
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbtitulo1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 26)); // NOI18N
        jlbtitulo1.setText("Registrar Formato C");
        jPanel2.add(jlbtitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        jlbtitulo2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
        jlbtitulo2.setText("Lista de proyectos");
        jPanel2.add(jlbtitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 33, -1, -1));

        jlbtitulo4.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
        jlbtitulo4.setText("Registro");
        jPanel2.add(jlbtitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 185, -1, -1));

        tablaDisponibles.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tablaDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Codigo Anteproyecto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaDisponibles);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 63, 430, 116));

        jlbtitulo5.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbtitulo5.setText("Codigo Anteproyecto");
        jPanel2.add(jlbtitulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 216, -1, 30));

        jlbtitulo6.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbtitulo6.setText("Estructura");
        jPanel2.add(jlbtitulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 255, -1, -1));

        jcmbEstructura.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jcmbEstructura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Correcta", "Incorrecta" }));
        jPanel2.add(jcmbEstructura, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 254, 250, -1));

        jcmbConcepto.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jcmbConcepto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aprobado", "No aprobado" }));
        jPanel2.add(jcmbConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 293, 250, -1));

        jlbtitulo7.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbtitulo7.setText("Concepto");
        jPanel2.add(jlbtitulo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 293, -1, 20));

        jlbtitulo8.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jlbtitulo8.setText("Observaciones");
        jPanel2.add(jlbtitulo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 378, -1, -1));

        jtxtFObservaciones.setColumns(20);
        jtxtFObservaciones.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jtxtFObservaciones.setRows(5);
        jScrollPane2.setViewportView(jtxtFObservaciones);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 332, 250, 102));

        jcmbAnteproyectos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(jcmbAnteproyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 250, -1));

        jlbBSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/CerrarSesion.png"))); // NOI18N
        jlbBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbBSalirMouseClicked(evt);
            }
        });
        jPanel2.add(jlbBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, -1, -1));

        btnRegistrar.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 452, -1, -1));

        jlbImgRegistrarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/registrarC.png"))); // NOI18N
        jPanel2.add(jlbImgRegistrarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 510));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Registrar Formato C", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que captura el evento del mouse o ratón al efectuar un click en el botón salir.
     * @param evt evento.
     */
    private void jlbBSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbBSalirMouseClicked
        GUIInicioSesion ini = new GUIInicioSesion(objRemotoUsuarios, objRemotoAnteproyectos, objRemotoSeguimiento);
        ini.setVisible(true);
        ini.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jlbBSalirMouseClicked

    /**
     * Método que captura el evento del botón registrar al efectuar un click.
     * @param evt evento.
     */
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            if (jcmbAnteproyectos.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(null, "Este campo para el codigo no puede estar vacio", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                int codigo = Integer.parseInt(jcmbAnteproyectos.getSelectedItem().toString());
                int flujo = objRemotoAnteproyectos.VerificarAnteproyecto(codigo);
                if (flujo == 0) {
                    JOptionPane.showMessageDialog(null, "Anteproyecto ingresado no encontrado", "Error en la busqueda", JOptionPane.ERROR_MESSAGE);
                } else if (flujo < 3) {
                    JOptionPane.showMessageDialog(null, "El anteproyecto ingresado no ha sido evaluado", "Advertencia", JOptionPane.WARNING_MESSAGE);
                } else if (flujo >= 4) {
                    JOptionPane.showMessageDialog(null, "El anteproyecto ya fue evaluado", "Advertencia", JOptionPane.WARNING_MESSAGE);
                } else {
                    clsConceptosDTO conceptos = objRemotoAnteproyectos.consultarConceptos(codigo);
                    if (conceptos.getConcepto1().equals("Aprobado") && conceptos.getConcepto2().equals("Aprobado")) {
                        String concepto = (String) jcmbConcepto.getSelectedItem();
                        String estructura = (String) jcmbEstructura.getSelectedItem();
                        String observaciones = jtxtFObservaciones.getText();
                        clsFormatoCDTO formatoC = new clsFormatoCDTO(codigo, estructura, concepto, observaciones);
                        boolean registrarC = objRemotoAnteproyectos.RegistrarFormatoC(formatoC);
                        if (registrarC == true) {
                            JOptionPane.showMessageDialog(null, "Anteproyecto registrado exitosamente en el formato C");
                            listarAnteproyectosDisponibles();
                            limpiar();
                            listarCmbAnteproyectos();
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo registrar el anteproyecto en el formato C", "Error en el registro", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El Anteproyecto ingresado no fue aprobado por los evaluadores", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(GUIMenuJefeDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMenuJefeDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMenuJefeDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMenuJefeDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMenuJefeDepartamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jcmbAnteproyectos;
    private javax.swing.JComboBox<String> jcmbConcepto;
    private javax.swing.JComboBox<String> jcmbEstructura;
    private javax.swing.JLabel jlbBSalir;
    private javax.swing.JLabel jlbImgRegistrarC;
    private javax.swing.JLabel jlbtitulo1;
    private javax.swing.JLabel jlbtitulo2;
    private javax.swing.JLabel jlbtitulo4;
    private javax.swing.JLabel jlbtitulo5;
    private javax.swing.JLabel jlbtitulo6;
    private javax.swing.JLabel jlbtitulo7;
    private javax.swing.JLabel jlbtitulo8;
    private javax.swing.JTextArea jtxtFObservaciones;
    private javax.swing.JTable tablaDisponibles;
    // End of variables declaration//GEN-END:variables
}
