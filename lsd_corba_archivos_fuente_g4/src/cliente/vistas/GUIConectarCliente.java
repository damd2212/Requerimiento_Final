package cliente.vistas;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import sop_corba.GestionAnteproyectosIntOperations;
import sop_corba.GestionSeguimientoIntOperations;
import sop_corba.GestionUsuariosIntOperations;
import sop_corba.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Danny Alberto Diaz Mage y Jefferson Eduardo Campo Yule
 */
public class GUIConectarCliente extends javax.swing.JFrame {

    static GestionAnteproyectosIntOperations refGestion;
    static GestionSeguimientoIntOperations refSeguimiento;
    static GestionUsuariosIntOperations refUsuarios;
    
    /**
     * Constructor sin parametrizar
     */
    public GUIConectarCliente() {
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
        jlbDirIPC = new javax.swing.JLabel();
        jlbPuertoC = new javax.swing.JLabel();
        jtxtFDirIPC = new javax.swing.JTextField();
        jtxtFPertoC = new javax.swing.JTextField();
        btnConectarC = new javax.swing.JButton();
        jlbImgConectarCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conectar Cliente");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(318, 260));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 26)); // NOI18N
        jLabel1.setText("Conectar Cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jlbDirIPC.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jlbDirIPC.setText("Direccion IP");
        jPanel1.add(jlbDirIPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jlbPuertoC.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jlbPuertoC.setText("Puerto");
        jPanel1.add(jlbPuertoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jtxtFDirIPC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(jtxtFDirIPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 160, -1));

        jtxtFPertoC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(jtxtFPertoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 130, 160, -1));

        btnConectarC.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        btnConectarC.setText("Conectar");
        btnConectarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarCActionPerformed(evt);
            }
        });
        jPanel1.add(btnConectarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jlbImgConectarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/conectarCliente.png"))); // NOI18N
        jPanel1.add(jlbImgConectarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 240));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 289, 238));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Método que obtiene la acción del botón conectar y crea la conexión
     * @param evt 
     */
    private void btnConectarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarCActionPerformed
        try{
            String[] vec = new String[4];
            vec[0] = "-ORBInitialPort";
            vec[1] = jtxtFDirIPC.getText();
            vec[2] = "-ORBInitialPort";
            vec[3] = jtxtFPertoC.getText();

            // se crea e inicia el ORB
            ORB orb = ORB.init(vec, null);

            // se obtiene un link al name service
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // * Resuelve la referencia del objeto en el N_S *
            String name = "objAnteproyectos";
            String name2 = "objSeguimiento";
            String name3 = "objUsuarios";
            refGestion = GestionAnteproyectosIntHelper.narrow(ncRef.resolve_str(name));
            refSeguimiento = GestionSeguimientoIntHelper.narrow(ncRef.resolve_str(name2));
            refUsuarios = GestionUsuariosIntHelper.narrow(ncRef.resolve_str(name3));
            

            System.out.println("Obtenido el manejador sobre el servidor de objetos: " + refGestion);
            System.out.println("Obtenido el manejador sobre el servidor de objetos: " + refUsuarios);
            System.out.println("Obtenido el manejador sobre el servidor de objetos: " + refSeguimiento);
            
            GUIInicioSesion iniciar = new GUIInicioSesion(refGestion, refSeguimiento, refUsuarios);
            iniciar.setVisible(true);
            iniciar.setLocationRelativeTo(null);
            
            this.dispose();
            
        }catch(Exception e){
            System.out.println("ERROR : " + e);
            e.printStackTrace(System.out);
        }
    }//GEN-LAST:event_btnConectarCActionPerformed

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
            java.util.logging.Logger.getLogger(GUIConectarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIConectarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIConectarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIConectarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIConectarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectarC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbDirIPC;
    private javax.swing.JLabel jlbImgConectarCliente;
    private javax.swing.JLabel jlbPuertoC;
    private javax.swing.JTextField jtxtFDirIPC;
    private javax.swing.JTextField jtxtFPertoC;
    // End of variables declaration//GEN-END:variables
}
