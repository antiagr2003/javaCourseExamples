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
        Collection personas = new ArrayList();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try
        {
            fis = new FileInputStream ("personas.obj");
            ois = new ObjectInputStream(fis);
            while(true)
                personas.add(ois.readObject());
        }
        catch(EOFException eof)
        {
            try
            {
                ois.close();
                fis.close();
            }
            catch(IOException ioe)
            {
                ioe.printStackTrace();       
            }
        }
        catch(ClassNotFoundException ioe)
        {
           ioe.printStackTrace();
        }        
        catch(IOException ioe)
        {
           ioe.printStackTrace();
        }

        return personas;
    }    
}