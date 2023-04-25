package practica10.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Collection;

import javax.swing.JOptionPane;

import practica10.dominio.Dibujo;
import practica10.dominio.Figura;

public class IODibujo 
{
	public static final String NOMBRE_FICHERO = "dibujo.obj";
    public static Dibujo leer()
    {
        Dibujo dibujo = null;
        try
		{
			FileInputStream fis = new FileInputStream(NOMBRE_FICHERO);
			ObjectInputStream ois = new ObjectInputStream(fis);
			/*
			Object o = ois.readObject();
			this.dibujo = (Dibujo) o;
			*/
			dibujo = (Dibujo) ois.readObject();
			ois.close();
			fis.close();
		}
		catch(ClassNotFoundException clnfe)
		{
			clnfe.printStackTrace();
		}
		catch(FileNotFoundException fnfe)
		{
			//fnfe.printStackTrace();
			JOptionPane.showMessageDialog(null, 
					"Fichero " + NOMBRE_FICHERO + " no encontrado", 
					"ERROR", JOptionPane.ERROR_MESSAGE);
			dibujo = new Dibujo(NOMBRE_FICHERO);
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
            dibujo = new Dibujo(NOMBRE_FICHERO);
		}

        return dibujo;
    }

    public static void escribir(Dibujo dibujo)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("dibujo.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dibujo);
            oos.close();
            fos.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
            System.out.println("ERROR I/O");
        }
    }
   
}
