package sop_corba;


/**
* sop_corba/clsResolucionDTO.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* domingo 3 de octubre de 2021 08:29:51 PM COT
*/

public final class clsResolucionDTO implements org.omg.CORBA.portable.IDLEntity
{
  public String numResolucion = null;
  public String fecha = null;
  public String codAnteproyecto = null;

  public clsResolucionDTO ()
  {
  } // ctor

  public clsResolucionDTO (String _numResolucion, String _fecha, String _codAnteproyecto)
  {
    numResolucion = _numResolucion;
    fecha = _fecha;
    codAnteproyecto = _codAnteproyecto;
  } // ctor

} // class clsResolucionDTO
