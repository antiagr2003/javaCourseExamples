import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.FileNotFoundException;

import java.io.File;

public class AppUtilidades
{
    public static void main(String args[]) 
    {
        File fichero = new File("datos/personas.obj");
        if(!fichero.exists())
            System.out.println("Fichero no existe");

        System.out.println(fichero.getAbsolutePath());
        System.out.println(fichero.length());
        System.out.println(new java.util.Date(fichero.lastModified()));
        AppLeer.leer(fichero);
    }

    public static void leer(File fichero) 
    {
        FileInputStream fis = null;
        ObjectInputStream ois  = null;
        try
        {
            fis = new FileInputStream(fichero);
            ois = new ObjectInputStream(fis);
            while(true)
                System.out.println(ois.readObject());
        }
        catch(EOFException eofe)
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
        catch(FileNotFoundException ioe)
        {
            ioe.printStackTrace();            
        }   
        catch(IOException ioe)
        {
            ioe.printStackTrace();            
        }	
        catch(ClassNotFoundException cnfe)
        {
            cnfe.printStackTrace(); 
        }
    }
}