package sop_corba.GestionAnteproyectosIntPackage;


/**
* sop_corba/GestionAnteproyectosIntPackage/listaAnteproyectosRemitidosHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* domingo 3 de octubre de 2021 05:25:26 PM COT
*/

public final class listaAnteproyectosRemitidosHolder implements org.omg.CORBA.portable.Streamable
{
  public int value[] = null;

  public listaAnteproyectosRemitidosHolder ()
  {
  }

  public listaAnteproyectosRemitidosHolder (int[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = sop_corba.GestionAnteproyectosIntPackage.listaAnteproyectosRemitidosHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    sop_corba.GestionAnteproyectosIntPackage.listaAnteproyectosRemitidosHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return sop_corba.GestionAnteproyectosIntPackage.listaAnteproyectosRemitidosHelper.type ();
  }

}