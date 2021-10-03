
package SGestionAnteproyectos;

import java.util.ArrayList;
import sop_corba.GestionAnteproyectosIntPOA;
import sop_corba.clsConceptosDTO;
import sop_corba.clsFormatoADTO;
import sop_corba.clsFormatoBDTO;
import sop_corba.clsFormatoCDTO;
import sop_corba.clsFormatoDDTO;


public class GestionAnteproyectosImpl extends GestionAnteproyectosIntPOA{
    
    private ArrayList<clsFormatoADTO> formatosA;
    private ArrayList<clsFormatoBDTO> formatosB;
    private ArrayList<clsFormatoCDTO> formatosC;
    private ArrayList<clsFormatoDDTO> formatosD;
    private ArrayList<Integer> AntNoRemitidos;
    private ArrayList<Integer> AntRemitidos;
    
    
    /**
     * Metodo remoto que registra el anteproyecto en la lista de Formatos A
     *
     * @param objFormatoA Objeto de tipo Formato A que recibe para el respectivo
     * registro
     * @return Verdadero si el objeto fue agregado a la lista, falso lo
     * contrario
     */
    @Override
    public boolean registrarFormatoA(clsFormatoADTO objFormatoA) {
        System.out.println("==Registrar FormatoA==");
        objFormatoA.flujo = 1;
        return formatosA.add(objFormatoA);
    }

    /**
     * Metodo remoto que registra los formatos B con los evaluadores
     *
     * @param objFormatoB Objeto de tipo formato B que contiene el codigo del
     * anteproyecto con su respectivo evaluador
     * @return Verdadero si el objeto fue agregado a la lista, falso lo
     * contrario
     */
    @Override
    public boolean AsignarFormatoB(clsFormatoBDTO objFormatoB) {
        System.out.println("==Asignar Evaluador==");
        return formatosB.add(objFormatoB);
    }

    @Override
    public boolean RegistrarFormatoC(clsFormatoCDTO objFormatoC) {

        System.out.println("==Registrar FormatoC==");
        boolean ban = false;
        int aux = -1;
        if (formatosC.isEmpty()) {
            formatosC.add(objFormatoC);
            aux = -2;
            if (objFormatoC.conceptoDepto.equals("Aprobado")) {
                for (int i = 0; i < this.formatosA.size(); i++) {
                    if (this.formatosA.get(i).codAnteproyecto == objFormatoC.codAnteproyecto) {
                        this.formatosA.get(i).flujo = 4;
                        break;
                    }
                }
                actualizarAntRemitidos(objFormatoC.getCodAnteproyecto());
            }
            ban = true;

        } else {
            for (int i = 0; i < formatosC.size(); i++) {
                if (formatosC.get(i).getCodAnteproyecto() == objFormatoC.getCodAnteproyecto()) {
                    aux = i;
                    break;
                }
            }
        }

        if (aux == -1) {
            formatosC.add(objFormatoC);

            if (objFormatoC.getConceptoDepto().equals("Aprobado")) {
                actualizarAntRemitidos(objFormatoC.getCodAnteproyecto());
                for (int i = 0; i < this.formatosA.size(); i++) {
                    if (this.formatosA.get(i).codAnteproyecto == objFormatoC.codAnteproyecto) {
                        this.formatosA.get(i).flujo = 4;
                        break;
                    }
                }
            }
            ban = true;
        } else if (aux >= 0) {
            this.formatosC.get(aux).setConceptoDepto(objFormatoC.getConceptoDepto());
            this.formatosC.get(aux).setEstructura(objFormatoC.getEstructura());
            this.formatosC.get(aux).setObservaciones(objFormatoC.getObservaciones());
            if (objFormatoC.getConceptoDepto().equals("Aprobado")) {
                for (int i = 0; i < this.formatosA.size(); i++) {
                    if (this.formatosA.get(i).codAnteproyecto == objFormatoC.codAnteproyecto) {
                        this.formatosA.get(i).flujo = 4;
                        break;
                    }
                }
                actualizarAntRemitidos(objFormatoC.getCodAnteproyecto());
            }
            ban = true;
        }

        return ban;

    }

    @Override
    public boolean RegistrarFormatoD(clsFormatoDDTO objFormatoD) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int ModificarFormatoB(clsFormatoBDTO objFormatoB) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int ConsultarConceptoC(int prmCodigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int ConsultarConceptoD(int prmCodigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public clsConceptosDTO consultarConceptos(int prmCodigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int VerificarAnteproyecto(int prmCodigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int SolicitarCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int ConsultarAnteproyectoB(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int verificarAsignacion(int CodAnteproyecto, int idEvaluador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public clsFormatoBDTO[] listaAteproyectosAsignados(int idEvaluador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public clsFormatoBDTO[] listaAteproyectosB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public clsFormatoCDTO[] listaAteproyectosC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public clsFormatoDDTO[] listaAteproyectosD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public clsFormatoADTO[] listaSinAsignar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[] listaAntNoRemitidos(int idDirector) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remitirAnteproyecto(int codAnteproyecto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[] listaAntRemitidos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
