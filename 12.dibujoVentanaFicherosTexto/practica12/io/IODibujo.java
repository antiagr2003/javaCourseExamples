package practica12.io;

import java.util.Iterator;
import java.util.Collection;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;



import java.util.ArrayList;
import java.util.Collection;

import java.awt.Color;

import practica12.dominio.Dibujo;
import practica12.dominio.Figura;
import practica12.dominio.Cuadrado;
import practica12.dominio.Circulo;

public class IODibujo
{
	public static void guardar(Dibujo dibujo)
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("datos/dibujo.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(dibujo);
			oos.close();
			fos.close();
		}
		catch(IOException e)
		{
			System.out.println("Se produjo un error en la escritura del archivo");
		}
	}	

	public static Dibujo leer() 
	{
		Dibujo dibujo = null;
		try
		{
			FileInputStream fis = new FileInputStream("datos/dibujo.obj");
			ObjectInputStream ois = new ObjectInputStream(fis);
			dibujo = (Dibujo) ois.readObject();
			ois.close();
			fis.close();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Clases no encontradas");
		}
		catch(FileNotFoundException e)
		{
			//Desarrollo: e.printStackTrace();
			//Solo en Producción:
			System.out.println("No se encontró el fichero");
		}
		catch(IOException e)
		{
			//Desarrollo: e.printStackTrace();
			//Solo en Producción:
			System.out.println("Se produjo un error en la lectura del archivo");
		}

		return dibujo;
			
	}	

	public static void exportar(Dibujo dibujo) 
    {
        try
        {
            FileWriter fw = new FileWriter("datos/figuras.csv");
            PrintWriter pw = new PrintWriter(fw);
            for(Figura figura:dibujo.getTodasFiguras())
                pw.println(figura.toCSV());
            pw.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

 	public static Dibujo importar() 
    {
        Dibujo dibujo = new Dibujo("sin_nombre");
        try
        {
           FileReader fr = new FileReader("datos/figuras.csv");
           BufferedReader br = new BufferedReader(fr);
           String linea = null;
           while((linea = br.readLine()) != null)
           {
                String s[] = linea.split(",");
                String tipo = s[0].trim();
                int x = Integer.parseInt(s[1].trim());
                int y = Integer.parseInt(s[2].trim());
                boolean relleno = s[3].trim().equals("true")?true:false;
                Color color = new Color(Integer.parseInt(s[4].trim()));
                int ladoRadio = Integer.parseInt(s[5].trim());

                Figura figura = null;
                switch(tipo)
                {
                	case "Cuadrado":
                		figura = new Cuadrado(x, y, relleno, color, ladoRadio);
                		break;
                	case "Circulo":
                		figura = new Circulo(x, y, relleno, color, ladoRadio);
                		break;
                }
                dibujo.addFigura("Grupo 1", figura);
           }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        return dibujo;
    }    


}