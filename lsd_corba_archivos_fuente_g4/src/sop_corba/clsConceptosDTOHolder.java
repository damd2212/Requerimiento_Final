package sop_corba;

/**
* sop_corba/clsConceptosDTOHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* domingo 3 de octubre de 2021 08:29:51 PM COT
*/

public final class clsConceptosDTOHolder implements org.omg.CORBA.portable.Streamable
{
  public sop_corba.clsConceptosDTO value = null;

  public clsConceptosDTOHolder ()
  {
  }

  public clsConceptosDTOHolder (sop_corba.clsConceptosDTO initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = sop_corba.clsConceptosDTOHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    sop_corba.clsConceptosDTOHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return sop_corba.clsConceptosDTOHelper.type ();
  }

}
