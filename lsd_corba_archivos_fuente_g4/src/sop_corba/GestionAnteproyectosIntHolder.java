package sop_corba;

/**
* sop_corba/GestionAnteproyectosIntHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* domingo 3 de octubre de 2021 07:51:32 PM COT
*/

public final class GestionAnteproyectosIntHolder implements org.omg.CORBA.portable.Streamable
{
  public sop_corba.GestionAnteproyectosInt value = null;

  public GestionAnteproyectosIntHolder ()
  {
  }

  public GestionAnteproyectosIntHolder (sop_corba.GestionAnteproyectosInt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = sop_corba.GestionAnteproyectosIntHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    sop_corba.GestionAnteproyectosIntHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return sop_corba.GestionAnteproyectosIntHelper.type ();
  }

}
