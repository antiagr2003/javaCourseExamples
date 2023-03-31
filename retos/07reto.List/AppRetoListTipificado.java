import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AppRetoListTipificado
{
    public static void main(String[] args)
    {
        System.out.println("****ArrayList");
        AppRetoListTipificado.calculaTiempos(new ArrayList<Persona>());
        System.out.println("****LinkedList");
        AppRetoListTipificado.calculaTiempos(new LinkedList<Persona>());
    } 

    private static void calculaTiempos(List<Persona> estructura)
    {
        int numeroObjetos = 1000*1000*10;

        long tiempoIni = System.currentTimeMillis();
        for(int i=0;i<numeroObjetos;i++)
            estructura.add(new Persona(String.valueOf(i)));  

        System.out.println("Creacion: " + estructura.getClass().getName() + " -> " + (System.currentTimeMillis()-tiempoIni) + "ms");

        tiempoIni = System.currentTimeMillis();
        System.out.print("Busqueda: " + estructura.contains(new Persona("No lo encuentro")) + " -> ");
        System.out.println(estructura.getClass().getName() + ": " + (System.currentTimeMillis()-tiempoIni) + "ms");

        tiempoIni = System.currentTimeMillis();
        System.out.print("Acceso por indice a la posicion SIZE/2: " + estructura.get((int)(numeroObjetos/2)) + " -> ");
        System.out.println(estructura.getClass().getName() + ": " + (System.currentTimeMillis()-tiempoIni) + "ms");
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
        if(obj instanceof Persona p) 
            return nombre.equals(p.getNombre());
        else
            return false;
    }
}
