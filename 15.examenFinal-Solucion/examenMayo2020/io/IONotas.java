package examenMayo2020.io;

import examenMayo2020.dominio.Alumno;
import examenMayo2020.dominio.Asignatura;
import examenMayo2020.dominio.AsignaturaPractica;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

import java.io.FileReader;
import java.io.BufferedReader;

import java.util.TreeSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


public class IONotas
{

    public static HashMap<Alumno, Collection<Asignatura>> importTexto() 
    {
        HashMap<Alumno, Collection<Asignatura>> mapaAlumnos = new HashMap<Alumno, Collection<Asignatura>>();
        Asignatura asignatura = null;

        try
        {
            FileReader fr = new FileReader("datos/alumnos.csv");
            BufferedReader br = new BufferedReader(fr);
            String linea = null;
            linea = br.readLine(); //Se lee la cabecera
            if(linea!=null)
            {
                while((linea = br.readLine()) != null)
                {
                    String s[] = linea.split(",");
                    String clave = s[0].trim();
                    String titulo = s[1].trim();
                    String nombre = s[2].trim();
                    float nota = Float.parseFloat(s[3].trim());
                    if(s.length>4)
                    {
                        int porcentaje = Integer.parseInt(s[4].trim());
                        float notaPractica = Float.parseFloat(s[5].trim());
                        asignatura = new AsignaturaPractica(nombre, nota, porcentaje, notaPractica);
                    }
                    else
                    {
                        asignatura = new Asignatura(nombre, nota);
                    }

                    Alumno alumno = new Alumno(clave, titulo);
                    Collection<Asignatura> asignaturas = mapaAlumnos.get(alumno);
                    if(asignaturas==null)
                    {
                        asignaturas = new TreeSet<Asignatura>();
                        mapaAlumnos.put(alumno, asignaturas);
                    }
                    asignaturas.add(asignatura);
                }
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }

        return mapaAlumnos;
    }

    public static void writeObjects(HashMap<Alumno, Collection<Asignatura>> mapaAlumnos) 
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("datos/alumnos.obj"); //.ser
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            Set<Alumno> alumnos = mapaAlumnos.keySet();

            System.out.println("Nota media de los alumnos:");
            System.out.println("===========================");

            for(Alumno alumno:alumnos)
            {
                alumno.setAsignatura(mapaAlumnos.get(alumno));
                oos.writeObject(alumno);
                System.out.println(alumno.getClave() + "(" + alumno.getTitulo() + "): "+ alumno.calcularNota());
            }
            oos.close();
            fos.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }       
    }
}