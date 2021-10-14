package SGestionAnteproyectos;

import java.util.ArrayList;
import sop_corba.GestionUsuariosIntPOA;
import sop_corba.clsUsuariosDTO;

public class GestionUsuariosImpl extends GestionUsuariosIntPOA {

    /*
    Atributos
    */
    private ArrayList<clsUsuariosDTO> usuarios;

    /**
    Constructor vacio
    **/
    public GestionUsuariosImpl() {
        this.usuarios = new ArrayList();
    }

    /**
     * Método que registra un nuevo usuario en la lista de usuarios
     * @param objUsuario usuario a registrar
     * @return
     */
    @Override
    public boolean RegistrarUsuario(clsUsuariosDTO objUsuario) {
        System.out.println("==Registrar Usuario==");
        return usuarios.add(objUsuario);
    }

    /**
     * Método el cual valida los datos del usuario para iniciar sesión
     * @param prmUsuario nombre del usuario
     * @param prmClave contraseña
     * @return usuario encontrado
     */
    @Override
    public clsUsuariosDTO IniciarSesion(String prmUsuario, String prmClave) {
        System.out.println("==Iniciar Sesion==");
        clsUsuariosDTO objUsuario = new clsUsuariosDTO(-1, "", "", "", "", "", false);
        for (int i = 0; i < this.usuarios.size(); i++) {
            if (this.usuarios.get(i).usuario.equals(prmUsuario) && this.usuarios.get(i).clave.equals(prmClave)) {
                objUsuario = this.usuarios.get(i);
                break;
            }
        }
        return objUsuario;
    }

    /**
     * Método que consulta un usuario según la identificación 
     * @param prmIdentificacion numero de identificación
     * @return usuario encontrado
     */
    @Override
    public clsUsuariosDTO ConsultarUsuario(int prmIdentificacion) {

        System.out.println("==Consultar Usuario==");
        clsUsuariosDTO objUsuario = new clsUsuariosDTO(-1, "", "", "", "", "", false);
        if (this.usuarios.isEmpty()) {
            return objUsuario;
        }
        for (int i = 0; i < this.usuarios.size(); i++) {
            if (this.usuarios.get(i).identificacion == prmIdentificacion) {
                objUsuario = this.usuarios.get(i);
                break;
            }
        }
        return objUsuario;

    }

    /**
     * Método que modifica un usuario de la lista
     * @param objUsuario usuario a modificar
     * @return usuario encontrado
     */
    @Override
    public boolean ModificarUsuario(clsUsuariosDTO objUsuario) {
        System.out.println("==Modificar Usuario==");
        boolean ban = false;
        for (int i = 0; i < this.usuarios.size(); i++) {
            if (this.usuarios.get(i).identificacion == objUsuario.identificacion) {
                this.usuarios.get(i).nomCompleto = objUsuario.nomCompleto;
                this.usuarios.get(i).role = objUsuario.role;
                this.usuarios.get(i).departamento = objUsuario.departamento;
                this.usuarios.get(i).usuario = objUsuario.usuario;
                this.usuarios.get(i).clave = objUsuario.clave;
                ban = true;
                break;
            }
        }
        return ban;
    }

    /**
     * Método que consulta el evaluador por su identificación
     * @param ID numero de identificación
     * @return evaluador encontrado
     */
    @Override
    public int consultarEvaluador(int ID) {
        System.out.println("==Consultar Evaluador==");
        int bandera = -1;
        int ban = 0;
        if (this.usuarios.size() == 0) {
            System.out.println("No hay usuarios registrados");
            return bandera;
        } else {
            for (int i = 0; i < this.usuarios.size(); i++) {
                if (this.usuarios.get(i).identificacion == ID && this.usuarios.get(i).role.equals("Evaluador")) {
                    bandera = 1;
                    ban = 1;
                    break;
                }
            }
        }
        if (ban == 0) {
            System.out.println("Usuario no existe en el sistema");
            bandera = -2;
        }
        return bandera;
    }

    /**
     * Método que lista los evaluadores 
     * @return
     */
    @Override
    public clsUsuariosDTO[] listarEvaluadores() {
        System.out.println("==Listar Evaluadores==");
        ArrayList<clsUsuariosDTO> evaluadores = new ArrayList();
        for (int i = 0; i < this.usuarios.size(); i++) {
            if (this.usuarios.get(i).role.equals("Evaluador")) {
                evaluadores.add(this.usuarios.get(i));
            }
        }
        clsUsuariosDTO[] arrayEvaluadores = evaluadores.toArray(new clsUsuariosDTO[0]);
        return arrayEvaluadores;
    }

    /**
     * Método que valida los registros de usuarios 
     * @param idUsuario
     * @param usuario
     * @return
     */
    @Override
    public int ValidarRegistro(int idUsuario, String usuario) {
        System.out.println("==Validar Usuario==");
        for (int i = 0; i < this.usuarios.size(); i++) {
            if (this.usuarios.get(i).identificacion == idUsuario) {
                return -1;
            }
            if (this.usuarios.get(i).usuario.equals(usuario)) {
                return -2;
            }
        }
        return 0;
    }

    /**
     * Método que verifica si el usuario tiene una sesión activa
     * @param idUsuario identificacion del usuario
     */
    @Override
    public void IniSesion(int idUsuario) {

        System.out.println("==Invocando a cambiar estado inicio sesion==");
        for (int i = 0; i < this.usuarios.size(); i++) {
            if (this.usuarios.get(i).identificacion == idUsuario) {
                this.usuarios.get(i).sesion = true;
                break;
            }
        }

    }

    /**
     * Método para cerrar la sesión de un usuario
     * @param idUsuario identificacion del usuario
     */
    @Override
    public void CerrarSesion(int idUsuario) {

        System.out.println("==Invocando a cambiar estado cerrar sesion==");
        for (int i = 0; i < this.usuarios.size(); i++) {
            if(this.usuarios.get(i).identificacion == idUsuario){
                this.usuarios.get(i).sesion = false;
                break;
            }
        }
        
    }

    /**
     * Método que valida que el rol del usuario sea decano
     * @return 
     */
    @Override
    public int validarDecano() {

        System.out.println("==Invocando a validar decano==");
        int contador = 0;
        
        for (int i = 0; i < this.usuarios.size(); i++) {
            if(this.usuarios.get(i).role.equals("Decano")){
                contador += 1;
                break;
            }
        }
        return contador;

    }
}
