//Presentado por: Jefferson Eduardo Campo - Danny Alberto Diaz
package SGestionAnteproyectos;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import sop_corba.GestionAnteproyectosIntPOA;
import sop_corba.GestionSeguimientoInt;
import sop_corba.clsConceptosDTO;
import sop_corba.clsFormatoADTO;
import sop_corba.clsFormatoBDTO;
import sop_corba.clsFormatoCDTO;
import sop_corba.clsFormatoDDTO;
import sop_corba.clsFormatosDTO;

public class GestionAnteproyectosImpl extends GestionAnteproyectosIntPOA {

    private GestionSeguimientoInt objSeguimiento;
    private ArrayList<clsFormatoADTO> formatosA;
    private ArrayList<clsFormatoBDTO> formatosB;
    private ArrayList<clsFormatoCDTO> formatosC;
    private ArrayList<clsFormatoDDTO> formatosD;
    private ArrayList<Integer> AntNoRemitidos;
    private ArrayList<Integer> AntRemitidos;
    private static int incremental = 0;
    
    public GestionAnteproyectosImpl(){
        this.formatosA = new ArrayList();
        this.formatosB = new ArrayList();
        this.formatosC = new ArrayList();
        this.formatosD = new ArrayList();
        this.AntNoRemitidos = new ArrayList();
        this.AntRemitidos = new ArrayList();
    }
    
    public void almacenarReferenciaRemota(GestionSeguimientoInt objSeguimiento){
        this.objSeguimiento = objSeguimiento;
    }

    /**
     * Metodo que registra el anteproyecto en la lista de Formatos A
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
     * Metodo que registra los formatos B con los evaluadores, es decir, metodo donde se asignan los evaluadores
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
    
    /**
     * Metodo que registra el anteproyecto en la lista de formatos C
     * @param objFormatoC Objeto de tipo Formato C que contiene la informacion para el registro
     * @return Verdadero si se registro exitosamente, falso lo contrario
     */
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
                actualizarAntRemitidos(objFormatoC.codAnteproyecto);
            }
            ban = true;

        } else {
            for (int i = 0; i < formatosC.size(); i++) {
                if (formatosC.get(i).codAnteproyecto == objFormatoC.codAnteproyecto) {
                    aux = i;
                    break;
                }
            }
        }

        if (aux == -1) {
            formatosC.add(objFormatoC);

            if (objFormatoC.conceptoDepto.equals("Aprobado")) {
                actualizarAntRemitidos(objFormatoC.codAnteproyecto);
                for (int i = 0; i < this.formatosA.size(); i++) {
                    if (this.formatosA.get(i).codAnteproyecto == objFormatoC.codAnteproyecto) {
                        this.formatosA.get(i).flujo = 4;
                        break;
                    }
                }
            }
            ban = true;
        } else if (aux >= 0) {
            this.formatosC.get(aux).conceptoDepto = objFormatoC.conceptoDepto;
            this.formatosC.get(aux).estructura = objFormatoC.estructura;
            this.formatosC.get(aux).observaciones = objFormatoC.observaciones;
            if (objFormatoC.conceptoDepto.equals("Aprobado")) {
                for (int i = 0; i < this.formatosA.size(); i++) {
                    if (this.formatosA.get(i).codAnteproyecto == objFormatoC.codAnteproyecto) {
                        this.formatosA.get(i).flujo = 4;
                        break;
                    }
                }
                actualizarAntRemitidos(objFormatoC.codAnteproyecto);
            }
            ban = true;
        }

        return ban;

    }

    /**
     * Metodo que registra un anteproyecto en la lista de formatos D
     * @param objFormatoD objeto de tipo formato D que contiene la informacion del anteproyecto a registrar
     * @return Verdadero si el registro fue exitoso, falso lo contrario
     */
    @Override
    public boolean RegistrarFormatoD(clsFormatoDDTO objFormatoD) {

        System.out.println("==Registrar FormatoD");
        boolean ban = false;
        int aux = -1;

        if (formatosD.isEmpty()) {
            formatosD.add(objFormatoD);
            aux = -2;
            if (objFormatoD.conceptoCoodinador.equals("Aprobado")) {
                for (int i = 0; i < this.formatosA.size(); i++) {
                    if (this.formatosA.get(i).codAnteproyecto == objFormatoD.codAnteproyecto) {
                        this.formatosA.get(i).flujo = 5;
                        break;
                    }
                }
                if (objFormatoD.conceptoCoodinador.equals("Aprobado")) {
                    llenarFormatos(objFormatoD.codAnteproyecto);
                }
            }
            ban = true;

        } else {
            for (int i = 0; i < formatosD.size(); i++) {
                if (formatosD.get(i).codAnteproyecto == objFormatoD.codAnteproyecto) {
                    aux = i;
                    break;
                }
            }
        }

        if (aux == -1) {
            formatosD.add(objFormatoD);

            if (objFormatoD.conceptoCoodinador.equals("Aprobado")) {

                for (int i = 0; i < this.formatosA.size(); i++) {
                    if (this.formatosA.get(i).codAnteproyecto == objFormatoD.codAnteproyecto) {
                        this.formatosA.get(i).flujo = 5;
                        break;
                    }
                }
                if (objFormatoD.conceptoCoodinador.equals("Aprobado")) {
                    llenarFormatos(objFormatoD.codAnteproyecto);
                }
            }
            ban = true;
        } else if (aux >= 0) {
            this.formatosD.get(aux).conceptoCoodinador = objFormatoD.conceptoCoodinador;
            this.formatosD.get(aux).estructura = objFormatoD.estructura;
            this.formatosD.get(aux).observaciones = objFormatoD.observaciones;
            if (objFormatoD.conceptoCoodinador.equals("Aprobado")) {
                for (int i = 0; i < this.formatosA.size(); i++) {
                    if (this.formatosA.get(i).codAnteproyecto == objFormatoD.codAnteproyecto) {
                        this.formatosA.get(i).flujo = 5;
                        break;
                    }
                }
                if (objFormatoD.conceptoCoodinador.equals("Aprobado")) {
                    llenarFormatos(objFormatoD.codAnteproyecto);
                }
            }
            ban = true;
        }

        return ban;

    }

    /**
     * Metodo que registra la informacion que registra un evaluador de un anteproyecto
     * @param objFormatoB Objeto de tipo formato B que contiene la la evaluacion de un evaluador
     * @return 1 si la modificacion fue correcta, 0 o -1 si ocurre algun error
     * en el proceso de guardado
     */
    @Override
    public int ModificarFormatoB(clsFormatoBDTO objFormatoB) {

        System.out.println("==Registrar FormatoB==");
        int ban = 0;
        for (int i = 0; i < this.formatosB.size(); i++) {
            if (this.formatosB.get(i).codAnteproyecto == objFormatoB.codAnteproyecto && this.formatosB.get(i).idEvaluador == objFormatoB.idEvaluador) {
                if (!(this.formatosB.get(i).concepto.equals(""))) {
                    if (!(this.formatosB.get(i).concepto.equals("No Aprobado"))) {
                        ban = -1;
                        break;
                    } else {
                        this.formatosB.get(i).concepto = objFormatoB.concepto;
                        this.formatosB.get(i).observaciones = objFormatoB.observaciones;
                        this.formatosB.get(i).fechaEvaluacion = objFormatoB.fechaEvaluacion;
                        ban = 2;
                        break;
                    }

                } else {
                    this.formatosB.get(i).concepto = objFormatoB.concepto;
                    this.formatosB.get(i).observaciones = objFormatoB.observaciones;
                    this.formatosB.get(i).fechaEvaluacion = objFormatoB.fechaEvaluacion;
                    ban = 1;
                    break;
                }
            }
        }

        int flujo = 0;
        int posicion = 0;

        if (ban == 1 || ban == 2) {
            if (objFormatoB.concepto.equals("Aprobado")) {
                for (int i = 0; i < this.formatosA.size(); i++) {
                    if (this.formatosA.get(i).codAnteproyecto == objFormatoB.codAnteproyecto) {
                        flujo = this.formatosA.get(i).flujo;
                        posicion = i;
                        break;
                    }
                }
                if (flujo != 0) {
                    flujo = flujo + 1;
                    this.formatosA.get(posicion).flujo = flujo;
                }
            }
        }

        //Registro en los anteproyectos no remitidos
        int validarFlujo = 0;
        int concepto1 = 0;
        int concepto2 = 0;
        int codigoAnt = 0;

        for (int i = 0; i < this.formatosA.size(); i++) {
            if (this.formatosA.get(i).codAnteproyecto == objFormatoB.codAnteproyecto) {
                if (this.formatosA.get(i).flujo == 3) {
                    validarFlujo = 1;
                    codigoAnt = this.formatosA.get(i).codAnteproyecto;
                    break;
                }
            }
        }
        if (validarFlujo == 1) {
            int idEvaluador = 0;
            for (int i = 0; i < this.formatosB.size(); i++) {
                if (this.formatosB.get(i).codAnteproyecto == codigoAnt) {
                    if (this.formatosB.get(i).concepto.equals("Aprobado")) {
                        concepto1 = 1;
                        idEvaluador = this.formatosB.get(i).idEvaluador;
                        break;
                    }
                }
            }

            for (int i = 0; i < this.formatosB.size(); i++) {
                if (this.formatosB.get(i).codAnteproyecto == codigoAnt) {
                    if (this.formatosB.get(i).concepto.equals("Aprobado") && this.formatosB.get(i).idEvaluador != idEvaluador) {
                        concepto2 = 1;
                        break;
                    }
                }
            }

            if (concepto1 == 1 && concepto2 == 1) {
                this.AntNoRemitidos.add(codigoAnt);
                System.out.println("Anteproyecto aprobado por los dos evaluadores");
            }
        }

        return ban;

    }

    /**
     * Metodo que consulta el concepto del Jefe de Departamento
     * @param prmCodigo Codigo del anteproyecto a consultar
     * @return  si el concepto es aprobado o 0 si no es aprobado
     */
    @Override
    public int ConsultarConceptoC(int prmCodigo) {

        System.out.println("==Consultar Concepto FormatoC==");
        int concepto = 0;
        for (int i = 0; i < this.formatosC.size(); i++) {
            if (this.formatosC.get(i).codAnteproyecto == prmCodigo) {
                if (this.formatosC.get(i).conceptoDepto.equals("Aprobado")) {
                    concepto = 1;
                }
                break;
            }
        }
        return concepto;
        
    }

    /**
     * Metodo para consultar el concepto del Coordinador
     * @param prmCodigo Codigo del anteproyecto a consultar
     * @return 1 si el concepto es aprobado o 0 si el concepto es no aprobado
     */
    @Override
    public int ConsultarConceptoD(int prmCodigo) {

        System.out.println("==Consultar Concepto FormatoD==");
        int concepto = 0;
        for (int i = 0; i < this.formatosD.size(); i++) {
            if (this.formatosD.get(i).codAnteproyecto == prmCodigo) {
                if (this.formatosD.get(i).conceptoCoodinador.equals("Aprobado")) {
                    concepto = 1;
                }
                break;
            }
        }
        return concepto;

    }

    /**
     * Metodo para consultar los conceptos de los evaluadores
     * @param prmCodigo Codigo del anteproyecto a consultar
     * @return un objeto de tipo clsConceptosDTO es cual contiene la los dos conceptos de los evaluadores
     */
    @Override
    public clsConceptosDTO consultarConceptos(int prmCodigo) {

        System.out.println("==Consultar Conceptos==");
        String concepto1 = "";
        String concepto2 = "";
        int idEvaluador = 0;
        for (int i = 0; i < this.formatosB.size(); i++) {
            if (this.formatosB.get(i).codAnteproyecto == prmCodigo) {
                if (this.formatosB.get(i).concepto.equals("Aprobado")) {
                    concepto1 = "Aprobado";
                } else {
                    concepto1 = "No Aprobado";
                }
                idEvaluador = this.formatosB.get(i).idEvaluador;
                break;
            }
        }

        for (int j = 0; j < this.formatosB.size(); j++) {
            if (this.formatosB.get(j).codAnteproyecto == prmCodigo && this.formatosB.get(j).idEvaluador != idEvaluador) {
                if (this.formatosB.get(j).concepto.equals("Aprobado")) {
                    concepto2 = "Aprobado";
                } else {
                    concepto2 = "No Aprobado";
                }
                break;
            }
        }
        clsConceptosDTO objConceptos = new clsConceptosDTO(concepto1, concepto2);
        return objConceptos;
    }

    /**
     * Metodo para verificar en que formato se encuetra el anteproyecto
     * @param prmCodigo Codigo del anteproyecto a consultar
     * @return valor o estado en que se encuentra el anteproyecto 
     */
    @Override
    public int VerificarAnteproyecto(int prmCodigo) {

        System.out.println("==Verificar Anteproyecto==");

        int resultado = 0;
        for (int i = 0; i < this.formatosA.size(); i++) {
            if (this.formatosA.get(i).codAnteproyecto == prmCodigo) {
                resultado = this.formatosA.get(i).flujo;
                break;
            }
        }
        return resultado;

    }

    /**
     * Metodo que genera un codigo con un formato para el registro de un anteproyecto
     * @return el codigo generado para el anteproyecto
     */
    @Override
    public int SolicitarCodigo() {
        System.out.println("==Solicitar Codigo==");
        incremental += 1;
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        String anio = Integer.toString(localDate.getYear());
        int mes = localDate.getMonthValue();
        String periodo;
        if (mes <= 6) {
            periodo = "1";
        } else {
            periodo = "2";
        }
        String parte1 = anio + periodo;

        int codParte1 = Integer.parseInt(parte1);
        codParte1 = codParte1 * 1000;
        codParte1 = codParte1 + incremental;
        System.out.println(codParte1);
        return codParte1;
        
    }

    /**
     * Metodo que verifica si un anteproyecto esta disponible 
     * @param codigo Codigo del anteproyecto a consultar
     * @return 1 si el anteproyecto consultado esta disponible
     */
    @Override
    public int ConsultarAnteproyectoB(int codigo) {

        System.out.println("==Consultar Anteproyectos Disponibles==");
        int bandera = -1;
        int banCod = 0;

        if (this.formatosA.isEmpty()) {
            System.out.println("No hay anteproyectos registrados");
            return bandera;
        } else {
            for (int i = 0; i < this.formatosA.size(); i++) {
                if (this.formatosA.get(i).flujo == 1 && this.formatosA.get(i).codAnteproyecto == codigo) {
                    banCod = 1;
                    bandera = 1;
                    break;
                }
            }
        }

        if (banCod == 1) {
            if (this.formatosB.isEmpty()) {
                System.out.println("Asignar Evaluador");
                bandera = 1;
            } else {
                for (int j = 0; j < this.formatosB.size(); j++) {
                    if (this.formatosB.get(j).codAnteproyecto == codigo) {
                        System.out.println("Asignado");
                        bandera = -2;
                        break;
                    }
                }
            }
        } else {
            System.out.println("No existe en el sistema");
            bandera = -3;
        }
        return bandera;
    }

    /**
     * Metodo que verifica si un evaluador fue asignado a un anteproyecto
     * @param CodAnteproyecto codigo del anteproyecto a consultar
     * @param idEvaluador identificacion del evaluador para verificar si le fue asignado el anteproyecto
     * @return Verdadero si el evaluador fue asignado, falso si el evaluador no
     * tiene relacion con el anteproyecto consultado
     */
    @Override
    public boolean verificarAsignacion(int CodAnteproyecto, int idEvaluador) {

        System.out.println("==Verificar Asignacion==");
        boolean bandera = false;
        if (this.formatosB.isEmpty()) {
            System.out.println("No hay anteproyectos asignados");
            return bandera;
        } else {
            for (int i = 0; i < this.formatosB.size(); i++) {
                if (this.formatosB.get(i).codAnteproyecto == CodAnteproyecto && this.formatosB.get(i).idEvaluador == idEvaluador) {
                    bandera = true;
                    break;
                }
            }
        }
        return bandera;
        
    }

    /**
     * Metodo que retorna la lista de los anteproyectos asignados a un evaludor
     * @param idEvaluador Identificacion del evaluador con el cual se va a consultar 
     * @return vector de los anteproyectos asignados a un evaluador
     */
    @Override
    public clsFormatoBDTO[] listaAteproyectosAsignados(int idEvaluador) {

        System.out.println("==Listar Anteproyectos Asignados a Evaluadores==");
        
        ArrayList<clsFormatoBDTO> aux = new ArrayList();

        for (int i = 0; i < this.formatosB.size(); i++) {
            if (this.formatosB.get(i).idEvaluador == idEvaluador && this.formatosB.get(i).concepto.equals("") || this.formatosB.get(i).concepto.equals("No Aprobado")) {
                aux.add(this.formatosB.get(i));
            }
        }
        
        clsFormatoBDTO[] asignados = aux.toArray(new clsFormatoBDTO[0]);
        return asignados;
        
    }

    /**
     * Metodo que obtiene una lista de todos los anteproyectos aprobados por los evaluadores
     * @return Vector de anteproyectos del formato B
     */
    @Override
    public clsFormatoBDTO[] listaAteproyectosB() {

        System.out.println("== Listar Anteproyectos Aprobado B==");
        ArrayList<clsFormatoBDTO> formB = new ArrayList();
        ArrayList<clsFormatoBDTO> listaAux = new ArrayList();
        ArrayList<clsFormatoBDTO> listaAux2 = new ArrayList();
        listaAux = formatosB;
        int idEvaluador = 0;

        for (int k = 0; k < this.formatosA.size(); k++) {
            if (this.formatosA.get(k).flujo == 3) {

                for (int i = 0; i < this.formatosB.size(); i++) {
                    if (this.formatosA.get(k).codAnteproyecto == this.formatosB.get(i).codAnteproyecto && this.formatosB.get(i).concepto.equals("Aprobado")) {
                        for (int j = 0; j < listaAux.size(); j++) {
                            if (this.formatosB.get(i).codAnteproyecto == listaAux.get(j).codAnteproyecto && this.formatosB.get(i).idEvaluador != listaAux.get(j).idEvaluador) {
                                if (listaAux.get(j).concepto.equals("Aprobado")) {
                                    formB.add(this.formatosB.get(i));
                                }
                            }
                        }
                    }
                }

            }
        }

        if (!(formB.isEmpty())) {
            for (int u = 0; u < formB.size(); u = u + 2) {
                listaAux2.add(formB.get(u));
            }

            formB = listaAux2;
            
        }
        clsFormatoBDTO[] arrayformatosB = formB.toArray(new clsFormatoBDTO[0]);
        return arrayformatosB;

    }

    /**
     * Metodo que obtiene la lista de los anteproyectsos aprobados por el jefe de departamento
     * @return Lista de anteproyectos del formato C arobados
     */
    @Override
    public clsFormatoCDTO[] listaAteproyectosC() {
        System.out.println("==Listar Anteproyectos FormatoC==");
        ArrayList<clsFormatoCDTO> formC = new ArrayList();

        for (int j = 0; j < this.formatosA.size(); j++) {
            if (this.formatosA.get(j).flujo == 4) {
                for (int i = 0; i < this.formatosC.size(); i++) {
                    if (this.formatosA.get(j).codAnteproyecto == this.formatosC.get(i).codAnteproyecto && this.formatosC.get(i).conceptoDepto.equals("Aprobado")) {
                        formC.add(this.formatosC.get(i));
                    }
                }
            }
        }
        
        clsFormatoCDTO[] arrayFromatosC = formC.toArray(new clsFormatoCDTO[0]);
        
        return arrayFromatosC;
    }

    /**
     * Metodo que obtiene la lista de los anteproyectos aprobados por los coordinadores
     * @return un vector de anteproyectos de tipo formato D
     */
    @Override
    public clsFormatoDDTO[] listaAteproyectosD() {

        System.out.println("==Listar Anteproyectos FormatoD==");
        ArrayList<clsFormatoDDTO> formD = new ArrayList();

        for (int j = 0; j < this.formatosA.size(); j++) {
            if (this.formatosA.get(j).flujo == 5) {
                for (int i = 0; i < this.formatosD.size(); i++) {
                    if (this.formatosA.get(j).codAnteproyecto == this.formatosD.get(i).codAnteproyecto && this.formatosD.get(i).conceptoCoodinador.equals("Aprobado")) {
                        formD.add(this.formatosD.get(i));
                    }
                }
            }
        }
        clsFormatoDDTO[] arrayFromatosD = formD.toArray(new clsFormatoDDTO[0]);
        return arrayFromatosD;
        
    }

    /**
     * Metodo que obtiene una lista de los anteproyectos que no han sido asignados a un evaluador
     * @return vector con los anteproyectos que no han sido asignados a los evaluadores
     */
    @Override
    public clsFormatoADTO[] listaSinAsignar() {

        System.out.println("==Lista de formatos sin asignar==");

        ArrayList<clsFormatoADTO> formaA = new ArrayList();
        int ban = 0;

        for (int i = 0; i < this.formatosA.size(); i++) {
            if (this.formatosA.get(i).flujo == 1) {
                for (int j = 0; j < this.formatosB.size(); j++) {
                    if (this.formatosA.get(i).codAnteproyecto == this.formatosB.get(j).codAnteproyecto) {
                        ban += 1;
                    }
                }
                if (ban == 0) {
                    formaA.add(this.formatosA.get(i));
                }
            }
            ban = 0;
        }
        
        clsFormatoADTO[] arraySinAsignar = formaA.toArray(new clsFormatoADTO[0]);
        
        return arraySinAsignar;

    }

    /**
     * Metodo que obtiene una lista de los anteproyectos no remitidos por el director
     * @param idDirector id del director que registro el anteproyecto
     * @return vector de los anteproyectos sin remitir
     */
    @Override
    public int[] listaAntNoRemitidos(int idDirector) {

        System.out.println("==Invocando a listar anteproyectos sin remitir==");
        ArrayList<Integer> listaAuxNoRemitidos = new ArrayList();
        for (int i = 0; i < this.formatosA.size(); i++) {
            for (int j = 0; j < this.AntNoRemitidos.size(); j++) {
                if (this.formatosA.get(i).codAnteproyecto == this.AntNoRemitidos.get(j)) {
                    if (this.formatosA.get(i).codDirector == idDirector) {
                        int codigo = this.formatosA.get(i).codAnteproyecto;
                        listaAuxNoRemitidos.add(codigo);
                    }
                }
            }
        }
        
        int[] arrayNoRemitidos = listaAuxNoRemitidos.stream().mapToInt(i->i).toArray();
        
        return arrayNoRemitidos;
        
    }

    /**
     * Metodo para remitir un anteproyecto
     * @param codAnteproyecto codigo del anteproyecto a remitir 
     * @return Verdadero si el anteproyecto fue remitido o falso lo contrario
     */
    @Override
    public boolean remitirAnteproyecto(int codAnteproyecto) {
        
        System.out.println("==Invocando a remitir Anteproyecto");
        boolean bandera = false;
        if (this.AntRemitidos.add(codAnteproyecto)) {
            actualizarAntNoRemitidos(codAnteproyecto);
            bandera = true;
        }
        return bandera;

    }

    /**
     * Metodo que retorna la lista de los anteproyectos remitidos
     * @return vector con los anteproyectos remitidos por el director
     */
    @Override
    public int[] listaAntRemitidos() {
        System.out.println("==Invvocando a listar anteproyectos remitidos==");
        int[] arrayRemitidos = this.AntRemitidos.stream().mapToInt(i->i).toArray();
        return arrayRemitidos;
    }

    /**
     * Metodo que actualiza la lista de los anteproyectos remitidos
     *
     * @param codigo Codigo del anteproyecto que se elimina de la lista de los
     * anteproyectos remitidos
     */
    public void actualizarAntRemitidos(int codigo) {
        for (int i = 0; i < this.AntRemitidos.size(); i++) {
            if (this.AntRemitidos.get(i) == codigo) {
                this.AntRemitidos.remove(i);
                break;
            }
        }
    }

    /**
     * Metodo que actualiza la lista de los anteproyectos no remitidos
     *
     * @param codigo Codigo del anteproyecto que se va a eliminar de la lista de
     * los anteproyectos no remitidos
     */
    public void actualizarAntNoRemitidos(int codigo) {
        for (int i = 0; i < this.AntNoRemitidos.size(); i++) {
            if (this.AntNoRemitidos.get(i) == codigo) {
                this.AntNoRemitidos.remove(i);
                break;
            }
        }

    }

    /**
     * Metodo que llena los formatos para el uso en el servidor de seguimiento
     *
     * @param codigo Codigo del anteproyecto que se esta consultando
     */
    public void llenarFormatos(int codigo) {
        System.out.println("==Llenar Objeto Formatos==");

        int idEvaluador = 0;
        clsFormatoADTO formatoA = new clsFormatoADTO();
        clsFormatoBDTO formatoB1 = new clsFormatoBDTO();
        clsFormatoBDTO formatoB2 = new clsFormatoBDTO();
        clsFormatoCDTO formatoC = new clsFormatoCDTO();
        clsFormatoDDTO formatoD = new clsFormatoDDTO();

        //Obtener los objetos de cada lista de formatos
        for (int i = 0; i < this.formatosA.size(); i++) {
            if (this.formatosA.get(i).codAnteproyecto == codigo) {
                formatoA = this.formatosA.get(i);
                break;
            }
        }

        for (int j = 0; j < this.formatosB.size(); j++) {
            if (this.formatosB.get(j).codAnteproyecto == codigo) {
                formatoB1 = this.formatosB.get(j);
                idEvaluador = this.formatosB.get(j).idEvaluador;
                break;
            }
        }

        for (int k = 0; k < this.formatosB.size(); k++) {
            if (this.formatosB.get(k).codAnteproyecto == codigo && this.formatosB.get(k).idEvaluador != idEvaluador) {
                formatoB2 = this.formatosB.get(k);
                break;
            }
        }

        for (int m = 0; m < this.formatosC.size(); m++) {
            if (this.formatosC.get(m).codAnteproyecto == codigo) {
                formatoC = this.formatosC.get(m);
                break;
            }
        }

        for (int n = 0; n < this.formatosD.size(); n++) {
            if (this.formatosD.get(n).codAnteproyecto == codigo) {
                formatoD = this.formatosD.get(n);
                break;
            }
        }

        clsFormatosDTO formatos = new clsFormatosDTO(formatoA, formatoB1, formatoB2, formatoC, formatoD, codigo);

        boolean registro = objSeguimiento.RegistrarHistorial(formatos);
        if (registro == true) {
            System.out.println("==Registrado exitosamente en el historial");

        } else {
            System.out.println("==No se pudo registrar el formato en el historial");
        }
    }
}
