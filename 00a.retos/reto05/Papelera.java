class Papelera
{
    String contenido[] = new String[10];

    Papelera()
    {

    }

    Papelera(String contenido[])
    {
      this.contenido = contenido;
    }    
  
  String[] getContenido()
  {
    return contenido;
  }    

  void setContenido(String contenido[])
  {
    this.contenido = contenido;
  } 

  void addContenido(String contenidoNuevo)
  {
    for(int i=0;i<contenido.length;i++)
      if(contenido[i] == null)
      {
        contenido[i] = contenidoNuevo;
        i = contenido.length;
      }
  }     

  String getInfo()
  {
    String contenidoTotal = "Contenido de la Papelera\n==============================\n";
    for(int i=0;i<contenido.length;i++)
      if(contenido[i] != null)
        contenidoTotal += contenido[i] + "\n";
      else
        i=contenido.length;
    return contenidoTotal;
  }
    
}