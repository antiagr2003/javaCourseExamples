
import java.util.*;
import java.io.*;

public class IOPersona
{
    public static void escribirPersonas(Collection personas)
    {
        try
        {
            //OUTPUTS
            FileOutputStream fos = new FileOutputStream("personas.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Iterator it = personas.iterator();
            while(it.hasNext())
                oos.writeObject(it.next());

            oos.close();
            fos.close();
        }
/*        catch(FileNotFoundException fnfe)
        {

        }*/
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }

        //ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("datos/personas.obj"));
    }

    public static Collection leerPersonas()
    {
        //INTPUTS
        return null;
    }    
}