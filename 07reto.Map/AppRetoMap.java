import java.util.ArrayList;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Random;

public class AppRetoMap
{
    public static void main(String[] args)
    {
        Collection<Integer> numerosAleatorios = AppRetoMap.generaNumerosAleatorios(10);
        for(int n:numerosAleatorios)
            System.out.print(n + " - ");

        //Solución mediante arrays, solo válida para números
        System.out.println();
        int histograma01[] = AppRetoMap.creaHistogramaFijo(numerosAleatorios);

        for(int i=0;i<histograma01.length;i++)
            System.out.print(i + "=" + histograma01[i]+ ", ");

        //Solución mediante mapas, válida para cualquier tipo de valor y rango
        System.out.println();
        HashMap<Integer, Integer> mapaNumeros = AppRetoMap.creaHistogramaDinamico(numerosAleatorios);        
        System.out.println(mapaNumeros);

        System.out.println();
        Collection<Persona> personasAleatorias = AppRetoMap.generaPersonasAleatorias(10);
        for(Persona p:personasAleatorias)
            System.out.print(p + " - ");

        System.out.println();
        HashMap<Persona, Integer> mapaPersonas = AppRetoMap.creaHistogramaDinamicoPersonas(personasAleatorias);        
        System.out.println(mapaPersonas);
    } 

    private static Collection<Integer> generaNumerosAleatorios(int numero)
    {
        Random numeroRandom = new Random();
        Collection<Integer> lista = new ArrayList<Integer>();
        for(int i=0;i<numero;i++)
            lista.add(Math.abs(numeroRandom.nextInt())%10);
        return lista;
    }

    private static Collection<Persona> generaPersonasAleatorias(int numero)
    {
        Random numeroRandom = new Random();
        Collection<Persona> lista = new ArrayList<Persona>();
        for(int i=0;i<numero;i++)
            lista.add(new Persona("Nombre" + Math.abs(numeroRandom.nextInt())%10));
        return lista;
    }

    private static int[] creaHistogramaFijo(Collection<Integer> numerosAleatorios)
    {
        int lista[] = new int[10];
        for(int numero:numerosAleatorios)
            lista[numero] += 1;
        return lista;
    }   

    //Autoboxing implícitos.
    private static HashMap<Integer, Integer> creaHistogramaDinamico(Collection<Integer> numerosAleatorios)
    {
        HashMap<Integer, Integer> mapaNumeros = new HashMap<Integer, Integer>();
        for(int numero:numerosAleatorios)
        {
            Integer valor = mapaNumeros.get(numero);
            if(valor==null)
                mapaNumeros.put(numero, 1);
            else
                mapaNumeros.put(numero, valor+1);
        }
        return mapaNumeros;
    }    

    //Autoboxing implícitos.
    private static HashMap<Persona, Integer> creaHistogramaDinamicoPersonas(Collection<Persona> personasAleatorias)
    {
        HashMap<Persona, Integer> mapaNumeros = new HashMap<Persona, Integer>();
        for(Persona p:personasAleatorias)
        {
            Integer valor = mapaNumeros.get(p);
            if(valor==null)
                mapaNumeros.put(p, 1);
            else
                mapaNumeros.put(p, valor+1);
        }
        return mapaNumeros;
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
        sb.append(nombre);
        return sb.toString();
    }

    public int hashCode()
    {
        return nombre.hashCode();
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
