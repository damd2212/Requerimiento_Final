package sop_corba;


/**
* sop_corba/GestionSeguimientoIntPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* domingo 3 de octubre de 2021 05:25:26 PM COT
*/

public abstract class GestionSeguimientoIntPOA extends org.omg.PortableServer.Servant
 implements sop_corba.GestionSeguimientoIntOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("RegistrarHistorial", new java.lang.Integer (0));
    _methods.put ("RegistrarResolucion", new java.lang.Integer (1));
    _methods.put ("consultarResoluciones", new java.lang.Integer (2));
    _methods.put ("consultarHistorial", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // sop_corba/GestionSeguimientoInt/RegistrarHistorial
       {
         sop_corba.clsFormatosDTO objFormatos = sop_corba.clsFormatosDTOHelper.read (in);
         boolean $result = false;
         $result = this.RegistrarHistorial (objFormatos);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // sop_corba/GestionSeguimientoInt/RegistrarResolucion
       {
         int Codigo = in.read_long ();
         boolean $result = false;
         $result = this.RegistrarResolucion (Codigo);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // sop_corba/GestionSeguimientoInt/consultarResoluciones
       {
         sop_corba.clsFormatosDTO $result[] = null;
         $result = this.consultarResoluciones ();
         out = $rh.createReply();
         sop_corba.GestionSeguimientoIntPackage.ListaAnteproyectosHelper.write (out, $result);
         break;
       }

       case 3:  // sop_corba/GestionSeguimientoInt/consultarHistorial
       {
         sop_corba.clsResolucionDTO $result[] = null;
         $result = this.consultarHistorial ();
         out = $rh.createReply();
         sop_corba.GestionSeguimientoIntPackage.ListaResolucionesHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sop_corba/GestionSeguimientoInt:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public GestionSeguimientoInt _this() 
  {
    return GestionSeguimientoIntHelper.narrow(
    super._this_object());
  }

  public GestionSeguimientoInt _this(org.omg.CORBA.ORB orb) 
  {
    return GestionSeguimientoIntHelper.narrow(
    super._this_object(orb));
  }


} // class GestionSeguimientoIntPOA