import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.EOFException;

import java.io.FileReader;
import java.io.BufferedReader;

import java.util.ArrayList;
import java.util.Collection;

public class HiloImportacion extends Thread
{

	Collection<Persona> personas;

	public Collection<Persona> getPersonas()
	{
		return personas;
	}


	@Override
	public void run()
	{
		personas = new ArrayList<Persona>();
        try
        {
           FileReader fr = new FileReader("datos/personas.csv");
           BufferedReader br = new BufferedReader(fr);
           String linea = null;
           while((linea = br.readLine()) != null)
           {
                String s[] = linea.split(",");
                String nombre = s[0];
                String nif = s[1];
                int edad = Integer.parseInt(s[2].trim());
                personas.add(new Persona(nombre, nif, edad));
                //Persona p = new Persona(nombre, nif, edad);
                //System.out.println(p);
                //linea = br.readLine();
           }

        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
		
        AppImportHilos.mostrar(personas);
	}
}
