package practica10.io;

import java.awt.Color;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
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

import practica10.dominio.Circulo;
import practica10.dominio.Cuadrado;
import practica10.dominio.Dibujo;
import practica10.dominio.Figura;

public class IODibujo 
{
	public static final String NOMBRE_FICHERO = "dibujo.obj";

	public static Dibujo leerCSV()
	{
		Dibujo dibujo = new Dibujo("aa");
		try
		{
			List<String> lineas = Files.readAllLines(Path.of("figuras.csv"));
			
			/*
			BufferedReader br = new BufferedReader(new FileReader("figuras.csv"));
			String linea = br.readLine();
			while(linea != null)
			{
				lineas.add(linea);
				linea = br.readLine();
			}
			*/
			
			Figura figura = null;
			for(String linea : lineas)
			{
				String atributos[] = linea.split(", ");
				if (atributos[0].equals("circulo"))
				{
					figura = new Circulo(Integer.parseInt(atributos[1]), 
							Integer.parseInt(atributos[2]), 
							true, new Color(Integer.parseInt(atributos[4])), 
							Integer.parseInt(atributos[5]));
				}
				else
				{
					figura = new Cuadrado(Integer.parseInt(atributos[1]), 
							Integer.parseInt(atributos[2]), true,
							new Color(Integer.parseInt(atributos[4])), 
							Integer.parseInt(atributos[5]));
						
				}
				dibujo.addFigura("CSV", figura);
			}

		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return dibujo;	
	}

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

	public static void escribirCSV(Dibujo dibujo)
	{
		try
		{
			FileWriter fw = new FileWriter("figuras.csv", false);
			PrintWriter pw = new PrintWriter(fw);
			for(Figura figura : dibujo.getTodasFiguras())
				pw.println(figura.toCSV());
			pw.close();
			fw.close();
		}
		 catch(IOException e)
		 {
			e.printStackTrace();
		 }
	}
   
}
