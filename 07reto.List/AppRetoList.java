import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

public class AppRetoList
{
    public static void main(String[] args)
    {
        System.out.println("****ArrayList");
        AppRetoList.calculaTiempos(new ArrayList<Persona>());
        System.out.println("****LinkedList");
        AppRetoList.calculaTiempos(new LinkedList<Persona>());
    } 

    private static void calculaTiempos(List<Persona> estructura)
    {
        int numeroObjetos = 100000000;

        long tiempoIni = new Date().getTime();
        for(int i=0;i<numeroObjetos;i++)
            estructura.add(new Persona(String.valueOf(Math.random())));  

        System.out.println("Creacion: " + estructura.getClass().getName() + " -> " + (new Date().getTime()-tiempoIni));
        //System.out.println(personasArray);

        tiempoIni = new Date().getTime();
        System.out.print("Busqueda: " + estructura.contains(new Persona("No lo encuentro")) + " -> ");
        System.out.println(estructura.getClass().getName() + " -> " + (new Date().getTime()-tiempoIni));

         tiempoIni = new Date().getTime();
        System.out.print("Acceso por indice: " + estructura.get((int)(numeroObjetos/2)) + " -> ");
        System.out.println(estructura.getClass().getName() + " -> " + (new Date().getTime()-tiempoIni));
    }
}

class Persona
{ 
    private String nombre;
   
    public Persona(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getNombre() 
    {
        return nombre;
    }    
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ")
          .append(nombre);
        return sb.toString();
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Persona) 
        {
            Persona p = (Persona) obj; 
            return nombre.equals(p.getNombre());
        }
        else
            return false;
    }
}
