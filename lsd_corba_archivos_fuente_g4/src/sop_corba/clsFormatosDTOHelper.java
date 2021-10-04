package sop_corba;


/**
* sop_corba/clsFormatosDTOHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* domingo 3 de octubre de 2021 07:51:32 PM COT
*/

abstract public class clsFormatosDTOHelper
{
  private static String  _id = "IDL:sop_corba/clsFormatosDTO:1.0";

  public static void insert (org.omg.CORBA.Any a, sop_corba.clsFormatosDTO that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static sop_corba.clsFormatosDTO extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [6];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = sop_corba.clsFormatoADTOHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "formatoA",
            _tcOf_members0,
            null);
          _tcOf_members0 = sop_corba.clsFormatoBDTOHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "formatoB1",
            _tcOf_members0,
            null);
          _tcOf_members0 = sop_corba.clsFormatoBDTOHelper.type ();
          _members0[2] = new org.omg.CORBA.StructMember (
            "formateB2",
            _tcOf_members0,
            null);
          _tcOf_members0 = sop_corba.clsFormatoCDTOHelper.type ();
          _members0[3] = new org.omg.CORBA.StructMember (
            "formatoC",
            _tcOf_members0,
            null);
          _tcOf_members0 = sop_corba.clsFormatoDDTOHelper.type ();
          _members0[4] = new org.omg.CORBA.StructMember (
            "formatoD",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[5] = new org.omg.CORBA.StructMember (
            "codAnteproyecto",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (sop_corba.clsFormatosDTOHelper.id (), "clsFormatosDTO", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static sop_corba.clsFormatosDTO read (org.omg.CORBA.portable.InputStream istream)
  {
    sop_corba.clsFormatosDTO value = new sop_corba.clsFormatosDTO ();
    value.formatoA = sop_corba.clsFormatoADTOHelper.read (istream);
    value.formatoB1 = sop_corba.clsFormatoBDTOHelper.read (istream);
    value.formateB2 = sop_corba.clsFormatoBDTOHelper.read (istream);
    value.formatoC = sop_corba.clsFormatoCDTOHelper.read (istream);
    value.formatoD = sop_corba.clsFormatoDDTOHelper.read (istream);
    value.codAnteproyecto = istream.read_long ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, sop_corba.clsFormatosDTO value)
  {
    sop_corba.clsFormatoADTOHelper.write (ostream, value.formatoA);
    sop_corba.clsFormatoBDTOHelper.write (ostream, value.formatoB1);
    sop_corba.clsFormatoBDTOHelper.write (ostream, value.formateB2);
    sop_corba.clsFormatoCDTOHelper.write (ostream, value.formatoC);
    sop_corba.clsFormatoDDTOHelper.write (ostream, value.formatoD);
    ostream.write_long (value.codAnteproyecto);
  }

}
