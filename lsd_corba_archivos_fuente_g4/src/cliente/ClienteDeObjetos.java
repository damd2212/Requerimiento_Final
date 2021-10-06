
package cliente;

import cliente.vistas.GUIConectarCliente;


public class ClienteDeObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GUIConectarCliente conectarCliente = new GUIConectarCliente();
        conectarCliente.setVisible(true);
        conectarCliente.setLocationRelativeTo(null);
    }
    
}
