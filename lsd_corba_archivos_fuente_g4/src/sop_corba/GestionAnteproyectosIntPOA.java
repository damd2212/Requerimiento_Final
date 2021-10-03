package sop_corba;


/**
* sop_corba/GestionAnteproyectosIntPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* domingo 3 de octubre de 2021 05:25:26 PM COT
*/

public abstract class GestionAnteproyectosIntPOA extends org.omg.PortableServer.Servant
 implements sop_corba.GestionAnteproyectosIntOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("registrarFormatoA", new java.lang.Integer (0));
    _methods.put ("AsignarFormatoB", new java.lang.Integer (1));
    _methods.put ("RegistrarFormatoC", new java.lang.Integer (2));
    _methods.put ("RegistrarFormatoD", new java.lang.Integer (3));
    _methods.put ("ModificarFormatoB", new java.lang.Integer (4));
    _methods.put ("ConsultarConceptoC", new java.lang.Integer (5));
    _methods.put ("ConsultarConceptoD", new java.lang.Integer (6));
    _methods.put ("consultarConceptos", new java.lang.Integer (7));
    _methods.put ("VerificarAnteproyecto", new java.lang.Integer (8));
    _methods.put ("SolicitarCodigo", new java.lang.Integer (9));
    _methods.put ("ConsultarAnteproyectoB", new java.lang.Integer (10));
    _methods.put ("verificarAsignacion", new java.lang.Integer (11));
    _methods.put ("listaAteproyectosAsignados", new java.lang.Integer (12));
    _methods.put ("listaAteproyectosB", new java.lang.Integer (13));
    _methods.put ("listaAteproyectosC", new java.lang.Integer (14));
    _methods.put ("listaAteproyectosD", new java.lang.Integer (15));
    _methods.put ("listaSinAsignar", new java.lang.Integer (16));
    _methods.put ("listaAntNoRemitidos", new java.lang.Integer (17));
    _methods.put ("remitirAnteproyecto", new java.lang.Integer (18));
    _methods.put ("listaAntRemitidos", new java.lang.Integer (19));
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
       case 0:  // sop_corba/GestionAnteproyectosInt/registrarFormatoA
       {
         sop_corba.clsFormatoADTO objFormatoA = sop_corba.clsFormatoADTOHelper.read (in);
         boolean $result = false;
         $result = this.registrarFormatoA (objFormatoA);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // sop_corba/GestionAnteproyectosInt/AsignarFormatoB
       {
         sop_corba.clsFormatoBDTO objFormatoB = sop_corba.clsFormatoBDTOHelper.read (in);
         boolean $result = false;
         $result = this.AsignarFormatoB (objFormatoB);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // sop_corba/GestionAnteproyectosInt/RegistrarFormatoC
       {
         sop_corba.clsFormatoCDTO objFormatoC = sop_corba.clsFormatoCDTOHelper.read (in);
         boolean $result = false;
         $result = this.RegistrarFormatoC (objFormatoC);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // sop_corba/GestionAnteproyectosInt/RegistrarFormatoD
       {
         sop_corba.clsFormatoDDTO objFormatoD = sop_corba.clsFormatoDDTOHelper.read (in);
         boolean $result = false;
         $result = this.RegistrarFormatoD (objFormatoD);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 4:  // sop_corba/GestionAnteproyectosInt/ModificarFormatoB
       {
         sop_corba.clsFormatoBDTO objFormatoB = sop_corba.clsFormatoBDTOHelper.read (in);
         int $result = (int)0;
         $result = this.ModificarFormatoB (objFormatoB);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 5:  // sop_corba/GestionAnteproyectosInt/ConsultarConceptoC
       {
         int prmCodigo = in.read_long ();
         int $result = (int)0;
         $result = this.ConsultarConceptoC (prmCodigo);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 6:  // sop_corba/GestionAnteproyectosInt/ConsultarConceptoD
       {
         int prmCodigo = in.read_long ();
         int $result = (int)0;
         $result = this.ConsultarConceptoD (prmCodigo);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 7:  // sop_corba/GestionAnteproyectosInt/consultarConceptos
       {
         int prmCodigo = in.read_long ();
         sop_corba.clsConceptosDTO $result = null;
         $result = this.consultarConceptos (prmCodigo);
         out = $rh.createReply();
         sop_corba.clsConceptosDTOHelper.write (out, $result);
         break;
       }

       case 8:  // sop_corba/GestionAnteproyectosInt/VerificarAnteproyecto
       {
         int prmCodigo = in.read_long ();
         int $result = (int)0;
         $result = this.VerificarAnteproyecto (prmCodigo);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 9:  // sop_corba/GestionAnteproyectosInt/SolicitarCodigo
       {
         int $result = (int)0;
         $result = this.SolicitarCodigo ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 10:  // sop_corba/GestionAnteproyectosInt/ConsultarAnteproyectoB
       {
         int codigo = in.read_long ();
         int $result = (int)0;
         $result = this.ConsultarAnteproyectoB (codigo);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 11:  // sop_corba/GestionAnteproyectosInt/verificarAsignacion
       {
         int CodAnteproyecto = in.read_long ();
         int idEvaluador = in.read_long ();
         int $result = (int)0;
         $result = this.verificarAsignacion (CodAnteproyecto, idEvaluador);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 12:  // sop_corba/GestionAnteproyectosInt/listaAteproyectosAsignados
       {
         int idEvaluador = in.read_long ();
         sop_corba.clsFormatoBDTO $result[] = null;
         $result = this.listaAteproyectosAsignados (idEvaluador);
         out = $rh.createReply();
         sop_corba.GestionAnteproyectosIntPackage.formatosBHelper.write (out, $result);
         break;
       }

       case 13:  // sop_corba/GestionAnteproyectosInt/listaAteproyectosB
       {
         sop_corba.clsFormatoBDTO $result[] = null;
         $result = this.listaAteproyectosB ();
         out = $rh.createReply();
         sop_corba.GestionAnteproyectosIntPackage.formatosBHelper.write (out, $result);
         break;
       }

       case 14:  // sop_corba/GestionAnteproyectosInt/listaAteproyectosC
       {
         sop_corba.clsFormatoCDTO $result[] = null;
         $result = this.listaAteproyectosC ();
         out = $rh.createReply();
         sop_corba.GestionAnteproyectosIntPackage.formatosCHelper.write (out, $result);
         break;
       }

       case 15:  // sop_corba/GestionAnteproyectosInt/listaAteproyectosD
       {
         sop_corba.clsFormatoDDTO $result[] = null;
         $result = this.listaAteproyectosD ();
         out = $rh.createReply();
         sop_corba.GestionAnteproyectosIntPackage.formatosDHelper.write (out, $result);
         break;
       }

       case 16:  // sop_corba/GestionAnteproyectosInt/listaSinAsignar
       {
         sop_corba.clsFormatoADTO $result[] = null;
         $result = this.listaSinAsignar ();
         out = $rh.createReply();
         sop_corba.GestionAnteproyectosIntPackage.formatosAHelper.write (out, $result);
         break;
       }

       case 17:  // sop_corba/GestionAnteproyectosInt/listaAntNoRemitidos
       {
         int idDirector = in.read_long ();
         int $result[] = null;
         $result = this.listaAntNoRemitidos (idDirector);
         out = $rh.createReply();
         sop_corba.GestionAnteproyectosIntPackage.listaAnteproyectosNoRemitidosHelper.write (out, $result);
         break;
       }

       case 18:  // sop_corba/GestionAnteproyectosInt/remitirAnteproyecto
       {
         int codAnteproyecto = in.read_long ();
         boolean $result = false;
         $result = this.remitirAnteproyecto (codAnteproyecto);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 19:  // sop_corba/GestionAnteproyectosInt/listaAntRemitidos
       {
         int $result[] = null;
         $result = this.listaAntRemitidos ();
         out = $rh.createReply();
         sop_corba.GestionAnteproyectosIntPackage.listaAnteproyectosRemitidosHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sop_corba/GestionAnteproyectosInt:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public GestionAnteproyectosInt _this() 
  {
    return GestionAnteproyectosIntHelper.narrow(
    super._this_object());
  }

  public GestionAnteproyectosInt _this(org.omg.CORBA.ORB orb) 
  {
    return GestionAnteproyectosIntHelper.narrow(
    super._this_object(orb));
  }


} // class GestionAnteproyectosIntPOA