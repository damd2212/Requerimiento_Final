package sop_corba;


/**
* sop_corba/clsUsuariosDTO.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* domingo 3 de octubre de 2021 08:29:51 PM COT
*/

public final class clsUsuariosDTO implements org.omg.CORBA.portable.IDLEntity
{
  public int identificacion = (int)0;
  public String nomCompleto = null;
  public String role = null;
  public String departamento = null;
  public String usuario = null;
  public String clave = null;
  public boolean sesion = false;

  public clsUsuariosDTO ()
  {
  } // ctor

  public clsUsuariosDTO (int _identificacion, String _nomCompleto, String _role, String _departamento, String _usuario, String _clave, boolean _sesion)
  {
    identificacion = _identificacion;
    nomCompleto = _nomCompleto;
    role = _role;
    departamento = _departamento;
    usuario = _usuario;
    clave = _clave;
    sesion = _sesion;
  } // ctor

} // class clsUsuariosDTO
