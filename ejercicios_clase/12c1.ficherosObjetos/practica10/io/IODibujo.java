package practica10.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

import practica10.dominio.Dibujo;

public class IODibujo 
{
    public static Dibujo leer()
    {
        Dibujo dibujo = null;
        try
		{
			FileInputStream fis = new FileInputStream("dibujo.obj");
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
			JOptionPane.showMessageDialog(null, "Fichero no encontrado", 
					"ERROR", JOptionPane.ERROR_MESSAGE);
			dibujo = new Dibujo("sin_nombre.dib");
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
            dibujo = new Dibujo("sin_nombre.dib");
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
