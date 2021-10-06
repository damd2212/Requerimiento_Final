//Presentado por: Jefferson Eduardo Campo - Danny Alberto Diaz
package SGestionAnteproyectos.vistas;

import SSeguimientoAnteproyectos.*;
import SGestionAnteproyectos.GestionAnteproyectosImpl;
import SGestionAnteproyectos.GestionUsuariosImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.InvalidName;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import org.omg.PortableServer.POAManagerPackage.AdapterInactive;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;

import sop_corba.GestionAnteproyectosInt;
import sop_corba.GestionAnteproyectosIntHelper;
import sop_corba.GestionSeguimientoInt;
import sop_corba.GestionSeguimientoIntHelper;
import sop_corba.GestionUsuariosInt;
import sop_corba.GestionUsuariosIntHelper;

public class GUIConectarServidorGestion extends javax.swing.JFrame {

    /**
     * Creates new form GUIConectarServidor1
     */
    public GUIConectarServidorGestion() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnConectar = new javax.swing.JButton();
        jlbDireccionIp = new javax.swing.JLabel();
        jlbPuerto = new javax.swing.JLabel();
        jtxtFDirIp = new javax.swing.JTextField();
        jtxtFPuerto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conectar Servidor de Gestion");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        jLabel1.setText("Conectar Servidor Gestion");

        btnConectar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        jlbDireccionIp.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlbDireccionIp.setText("Direccion IP");

        jlbPuerto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlbPuerto.setText("Puerto");

        jtxtFDirIp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jtxtFPuerto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtFDirIp, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(jtxtFPuerto)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jlbDireccionIp))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jlbPuerto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnConectar)
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbDireccionIp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtFDirIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbPuerto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtFPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConectar)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento utilizado para conectar el servidor de gestion de anteproyectos
     *
     * @param evt
     */
    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        // TODO add your handling code here:
        try {
            String[] vec = new String[4];
            vec[0] = "-ORBInitialHost";
            vec[1] = jtxtFDirIp.getText();
            vec[2] = "-ORBInitialPort";
            vec[3] = jtxtFPuerto.getText();
            GestionAnteproyectosImpl objRemoto = new GestionAnteproyectosImpl();
            GestionUsuariosImpl objRemoto2 = new GestionUsuariosImpl();
            GestionSeguimientoInt ref = obtenerReferenciaSSeguimiento(vec);
            objRemoto.almacenarReferenciaRemota(ref);
            inicializarORB(vec, objRemoto2, objRemoto);
        } catch (Exception e) {
            System.out.println("Error: " + e);
            e.printStackTrace(System.out);
        }

        System.out.println("Servidor: Saliendo ...");

    }//GEN-LAST:event_btnConectarActionPerformed

    private void inicializarORB(String[] vec, GestionUsuariosImpl objRemoto2, GestionAnteproyectosImpl objRemoto) throws ServantNotActive, WrongPolicy, org.omg.CORBA.ORBPackage.InvalidName, AdapterInactive, InvalidName, NotFound, CannotProceed {
        // crea e inicia el ORB
        ORB orb = ORB.init(vec, null);
        POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
        rootpoa.the_POAManager().activate();

        //*** se genera la referencia del servant
        org.omg.CORBA.Object obj = rootpoa.servant_to_reference(objRemoto);
        GestionAnteproyectosInt href = GestionAnteproyectosIntHelper.narrow(obj);
        
        org.omg.CORBA.Object obj2 = rootpoa.servant_to_reference(objRemoto2);
        GestionUsuariosInt ref2 = GestionUsuariosIntHelper.narrow(obj2);

        // se obtiene un link al name service
        org.omg.CORBA.Object objref = orb.resolve_initial_references("NameService");
        NamingContextExt ncref = NamingContextExtHelper.narrow(objref);

        // *** se realiza el binding de la referencia del servant en el N_S ***
        String name = "objAnteproyectos";
        String name2 = "objUsuarios";
        NameComponent path[] = ncref.to_name(name);
        ncref.rebind(path, href);
        NameComponent path2[] = ncref.to_name(name2);
        ncref.rebind(path2, ref2);

        System.out.println("El Servidor esta listo y esperando ...");

        // esperan por las invocaciones desde los clientes
        this.dispose();
        orb.run();
    }

    private GestionSeguimientoInt obtenerReferenciaSSeguimiento(String[] vec) throws org.omg.CORBA.ORBPackage.InvalidName {
        GestionSeguimientoInt ref = null;
        try {
            ORB orb = ORB.init(vec, null);
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            String name = "objSeguimiento";
            ref = (GestionSeguimientoInt) GestionSeguimientoIntHelper.narrow(ncRef.resolve_str(name));
        } catch (NotFound ex) {
            Logger.getLogger(SSeguimientoAnteproyectos.ServidorDeObjetosSeguimiento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CannotProceed ex) {
            Logger.getLogger(SSeguimientoAnteproyectos.ServidorDeObjetosSeguimiento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidName ex) {
            Logger.getLogger(SSeguimientoAnteproyectos.ServidorDeObjetosSeguimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ref;
    }

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
            java.util.logging.Logger.getLogger(GUIConectarServidorGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIConectarServidorGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIConectarServidorGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIConectarServidorGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIConectarServidorGestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbDireccionIp;
    private javax.swing.JLabel jlbPuerto;
    private javax.swing.JTextField jtxtFDirIp;
    private javax.swing.JTextField jtxtFPuerto;
    // End of variables declaration//GEN-END:variables
}
