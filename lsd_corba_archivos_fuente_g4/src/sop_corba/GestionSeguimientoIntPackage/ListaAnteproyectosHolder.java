package sop_corba.GestionSeguimientoIntPackage;


/**
* sop_corba/GestionSeguimientoIntPackage/ListaAnteproyectosHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* domingo 3 de octubre de 2021 05:25:26 PM COT
*/

public final class ListaAnteproyectosHolder implements org.omg.CORBA.portable.Streamable
{
  public sop_corba.clsFormatosDTO value[] = null;

  public ListaAnteproyectosHolder ()
  {
  }

  public ListaAnteproyectosHolder (sop_corba.clsFormatosDTO[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = sop_corba.GestionSeguimientoIntPackage.ListaAnteproyectosHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    sop_corba.GestionSeguimientoIntPackage.ListaAnteproyectosHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return sop_corba.GestionSeguimientoIntPackage.ListaAnteproyectosHelper.type ();
  }

}
