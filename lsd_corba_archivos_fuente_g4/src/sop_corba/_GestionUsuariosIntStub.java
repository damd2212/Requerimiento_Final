package sop_corba;


/**
* sop_corba/_GestionUsuariosIntStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* domingo 3 de octubre de 2021 05:25:26 PM COT
*/

public class _GestionUsuariosIntStub extends org.omg.CORBA.portable.ObjectImpl implements sop_corba.GestionUsuariosInt
{

  public boolean RegistrarUsuario (sop_corba.clsUsuariosDTO objUsuario)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("RegistrarUsuario", true);
                sop_corba.clsUsuariosDTOHelper.write ($out, objUsuario);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return RegistrarUsuario (objUsuario        );
            } finally {
                _releaseReply ($in);
            }
  } // RegistrarUsuario

  public sop_corba.clsUsuariosDTO IniciarSesion (String prmUsuario, String prmClave)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("IniciarSesion", true);
                $out.write_string (prmUsuario);
                $out.write_string (prmClave);
                $in = _invoke ($out);
                sop_corba.clsUsuariosDTO $result = sop_corba.clsUsuariosDTOHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return IniciarSesion (prmUsuario, prmClave        );
            } finally {
                _releaseReply ($in);
            }
  } // IniciarSesion

  public sop_corba.clsUsuariosDTO ConsultarUsuario (int prmIdentificacion)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("ConsultarUsuario", true);
                $out.write_long (prmIdentificacion);
                $in = _invoke ($out);
                sop_corba.clsUsuariosDTO $result = sop_corba.clsUsuariosDTOHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return ConsultarUsuario (prmIdentificacion        );
            } finally {
                _releaseReply ($in);
            }
  } // ConsultarUsuario

  public boolean ModificarUsuario (sop_corba.clsUsuariosDTO objUsuario)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("ModificarUsuario", true);
                sop_corba.clsUsuariosDTOHelper.write ($out, objUsuario);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return ModificarUsuario (objUsuario        );
            } finally {
                _releaseReply ($in);
            }
  } // ModificarUsuario

  public int consultarEvaluador (int ID)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("consultarEvaluador", true);
                $out.write_long (ID);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return consultarEvaluador (ID        );
            } finally {
                _releaseReply ($in);
            }
  } // consultarEvaluador

  public sop_corba.clsUsuariosDTO[] listarEvaluadores ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("listarEvaluadores", true);
                $in = _invoke ($out);
                sop_corba.clsUsuariosDTO $result[] = sop_corba.GestionUsuariosIntPackage.ListaUsuariosHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return listarEvaluadores (        );
            } finally {
                _releaseReply ($in);
            }
  } // listarEvaluadores

  public int ValidarRegistro (int idUsuario, String usuario)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("ValidarRegistro", true);
                $out.write_long (idUsuario);
                $out.write_string (usuario);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return ValidarRegistro (idUsuario, usuario        );
            } finally {
                _releaseReply ($in);
            }
  } // ValidarRegistro

  public void IniSesion (int idUsuario)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("IniSesion", true);
                $out.write_long (idUsuario);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                IniSesion (idUsuario        );
            } finally {
                _releaseReply ($in);
            }
  } // IniSesion

  public void CerrarSesion (int idUsuario)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("CerrarSesion", true);
                $out.write_long (idUsuario);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                CerrarSesion (idUsuario        );
            } finally {
                _releaseReply ($in);
            }
  } // CerrarSesion

  public int validarDecano ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("validarDecano", true);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return validarDecano (        );
            } finally {
                _releaseReply ($in);
            }
  } // validarDecano

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sop_corba/GestionUsuariosInt:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _GestionUsuariosIntStub