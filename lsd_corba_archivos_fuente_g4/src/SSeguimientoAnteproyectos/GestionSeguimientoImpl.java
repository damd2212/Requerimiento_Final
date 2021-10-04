package SSeguimientoAnteproyectos;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import sop_corba.GestionSeguimientoIntPOA;
import sop_corba.clsFormatosDTO;
import sop_corba.clsResolucionDTO;

/**
 *
 * @author jefer
 */
public class GestionSeguimientoImpl extends GestionSeguimientoIntPOA{
    
    /**
     * Metodo para registrar los formatos en el historial o txt
     * @param objFormatos Objeto que contiene la informacion del anteproyecto
     * @return Verdadero si se pudo escribir en el txt, falso lo contrario
     */
    @Override
    public boolean RegistrarHistorial(clsFormatosDTO objFormatos) {
        System.out.println("==Registrar Historial==");
        boolean mensaje = false;
        try {
            if (estaVacio("historialTGI.txt")) {
                try {
                    ObjectOutputStream oos = new ObjectOutputStream(
                            new FileOutputStream("historialTGI.txt"));
                    oos.writeObject(objFormatos);
                    mensaje = true;
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    MiObjectOutputStream oos = new MiObjectOutputStream(
                            new FileOutputStream("historialTGI.txt", true));
                    oos.writeUnshared(objFormatos);
                    mensaje = true;
                    oos.close();
                } catch (IOException e) {
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(GestionSeguimientoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mensaje;
    }

    /**
     * Metodo para registrar un anteproyecto en el txt de las resoluciones
     * @param Codigo
     * @return Verdadero si se pudo escribir en el txt, false lo contrario
     */
    @Override
    public boolean RegistrarResolucion(int Codigo){
        System.out.println("==Registrar Resolucion==");
        boolean mensaje = false;
        int numSecuencial = 1;
        Calendar c = Calendar.getInstance();
        String fecha = Integer.toString(c.get(Calendar.DATE)) + "-" + Integer.toString(c.get(Calendar.MONTH)) + "-" + Integer.toString(c.get(Calendar.YEAR));
        try {
            if (estaVacio("listadoTGIAprobados.txt")) {
                try {
                    clsResolucionDTO objResolucion = new clsResolucionDTO(generarCodigo(numSecuencial), fecha, Integer.toString(Codigo));
                    ObjectOutputStream oos = new ObjectOutputStream(
                            new FileOutputStream("listadoTGIAprobados.txt"));
                    oos.writeObject(objResolucion);
                    oos.close();
                    mensaje = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    numSecuencial = numSecuencial + consultarResoluciones().length;
                    clsResolucionDTO objResolucion = new clsResolucionDTO(generarCodigo(numSecuencial), fecha, Integer.toString(Codigo));
                    MiObjectOutputStream oos = new MiObjectOutputStream(
                            new FileOutputStream("listadoTGIAprobados.txt", true));
                    oos.writeUnshared(objResolucion);
                    mensaje = true;
                    oos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(GestionSeguimientoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mensaje;
    }
    
    /**
     * Metodo que obtiene una lista de todos los anteproyectos que se les ha generado la resolucion
     * @return Lista de los anteproyectos a los que se les ha generado la resolucion
     */
    @Override
    public clsResolucionDTO[] consultarResoluciones(){
        System.out.println("==consultar resoluciones==");
        ArrayList<clsResolucionDTO> varRes = new ArrayList();
        try {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("listadoTGIAprobados.txt"));
            // Se lee el primer objeto
            Object aux = ois.readObject();
            // Mientras haya objetos
            while (aux != null) {
                clsResolucionDTO obj = new clsResolucionDTO((((clsResolucionDTO) aux).numResolucion), (((clsResolucionDTO) aux).fecha), (((clsResolucionDTO) aux).codAnteproyecto));
                varRes.add(obj);
                aux = ois.readObject();
            }
            ois.close();
        } catch (Exception e2) {
            System.out.println("===Leyendo archivo===");
        }
        clsResolucionDTO[] resoluciones = varRes.toArray(new clsResolucionDTO[0]);
        return resoluciones;
    }
    
    /**
     * Metodo para consultar el historial general con toda la informacion de los anteproyectos
     * @return Lista de los anteproyectos registrados en el historial
     */
    @Override
    public clsFormatosDTO[] consultarHistorial(){
        System.out.println("==Consultar Historial==");
        ArrayList<clsFormatosDTO> varHis = new ArrayList();
        try {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("historialTGI.txt"));
            // Se lee el primer objeto
            Object aux = ois.readObject();
            // Mientras haya objetos
            while (aux != null) {
                varHis.add((clsFormatosDTO) aux);
                aux = ois.readObject();
            }
            ois.close();
        } catch (Exception e2) {
            System.out.println("===Leyendo archivo===");
        }
        clsFormatosDTO[] historial = varHis.toArray(new clsFormatosDTO[0]);
        return historial;
    }
    
    /**
     * Metodo que genera el el numero de resolucion
     * @param num Numero secuecial que aumenta a medida que se genera una resolucion a un anteproyecto
     * @return El numero de resolucion generado 
     */
    public String generarCodigo(int num) {
        System.out.println("==Generar Codigo==");
        String codigo = "8.4.2-90.14/";
        Formatter fmt = new Formatter();
        fmt.format("%03d", num);
        codigo = codigo + fmt;
        System.out.println("/n" + codigo);
        return codigo;
    }

    /**
     * Metodo para verificar si el txt esta vacio o no
     * @param fichero Txt el cual se esta consultando
     * @return Verdadero en caso de que este vacio, falso si no lo esta
     * @throws IOException 
     */
    public boolean estaVacio(String fichero) throws IOException {
        System.out.println("==Verificacion fichero==");
        boolean bandera = false;
        try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(fichero));
            Object aux = ois.readObject();
            ois.close();
        } catch (EOFException e1) {
            bandera = true;
        } catch (Exception e2) {
            bandera = true;
        }
        return bandera;
    }
}
