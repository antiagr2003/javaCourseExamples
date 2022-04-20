import java.util.Collection;

public class AppImportHilos
{
    public static void main(String args[]) 
    {
        //Collection<Persona> personas = AppImport.importTexto();

        HiloImportacion hi = new HiloImportacion();
        hi.start();
        for(int i=0;i<1000;i++)
          System.out.println(i);

        //No sé cuando va  aacabar el hilo:
        //System.out.println(hi.getPersonas());


        //System.out.println(personaspersonas);
    }

    public synchronized static void mostrar(Collection<Persona> personas)
    {
        System.out.println(personas);
    }

  /*  public static Collection<Persona> importTexto() 
    {
        
    }*/
}