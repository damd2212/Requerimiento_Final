package SGestionAnteproyectos;

import java.util.ArrayList;
import sop_corba.GestionUsuariosIntPOA;
import sop_corba.clsUsuariosDTO;

public class GestionUsuariosImpl extends GestionUsuariosIntPOA {

    private ArrayList<clsUsuariosDTO> usuarios;

    public GestionUsuariosImpl() {
        this.usuarios = new ArrayList();
    }

    @Override
    public boolean RegistrarUsuario(clsUsuariosDTO objUsuario) {
        System.out.println("==Registrar Usuario==");
        return usuarios.add(objUsuario);
    }

    @Override
    public clsUsuariosDTO IniciarSesion(String prmUsuario, String prmClave) {
        System.out.println("==Iniciar Sesion==");
        clsUsuariosDTO objUsuario = null;
        for (int i = 0; i < this.usuarios.size(); i++) {
            if (this.usuarios.get(i).usuario.equals(prmUsuario) && this.usuarios.get(i).clave.equals(prmClave)) {
                objUsuario = this.usuarios.get(i);
                break;
            }
        }
        return objUsuario;
    }

    @Override
    public clsUsuariosDTO ConsultarUsuario(int prmIdentificacion) {

        System.out.println("==Consultar Usuario==");
        clsUsuariosDTO objUsuario = null;
        if (this.usuarios.isEmpty()) {
            return null;
        }
        for (int i = 0; i < this.usuarios.size(); i++) {
            if (this.usuarios.get(i).identificacion == prmIdentificacion) {
                objUsuario = this.usuarios.get(i);
                break;
            }
        }
        return objUsuario;

    }

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
