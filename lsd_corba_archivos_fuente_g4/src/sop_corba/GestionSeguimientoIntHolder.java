package sop_corba;

/**
* sop_corba/GestionSeguimientoIntHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* domingo 3 de octubre de 2021 05:25:26 PM COT
*/

public final class GestionSeguimientoIntHolder implements org.omg.CORBA.portable.Streamable
{
  public sop_corba.GestionSeguimientoInt value = null;

  public GestionSeguimientoIntHolder ()
  {
  }

  public GestionSeguimientoIntHolder (sop_corba.GestionSeguimientoInt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = sop_corba.GestionSeguimientoIntHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    sop_corba.GestionSeguimientoIntHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return sop_corba.GestionSeguimientoIntHelper.type ();
  }

}
