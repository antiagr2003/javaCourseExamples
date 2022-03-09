import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class App
{
    private static int SIZE = 100;
    private static int ITERACIONES = Util.ITERACIONES;

    public static final int ARRAYLIST = 1;
    public static final int LINKEDLIST = 2;

    public static void main(String args[])
    {    
        List<String> lista = App.crearList(ARRAYLIST);

        System.out.printf("\nIteraciones: %d\n\n", ITERACIONES);
 
        long tiempo1 = 0;                                    // Inicializa el tiempo de cada agregación
        for(int i=0;i<ITERACIONES;i++)
            tiempo1 += App.addObjeto(lista, Util.getRandom(SIZE));  //Acumula el tiempo de cada agregación
        tiempo1 /= ITERACIONES;                              // Calcula el tiempo medio empleado en una agregación
        System.out.printf("ADD: %.4f\n", tiempo1/1000.);     // Imprime el valor medio en microsegundos (nano/1000.) con 4 decimales (%.4f)
       
        tiempo1 = 0;
        for(int i=0;i<ITERACIONES;i++)
            tiempo1 += App.getObjeto(lista, Util.getRandom(SIZE));         
        tiempo1 /= ITERACIONES;
        System.out.printf("GET: %.4f\n", tiempo1/1000.);
       
        tiempo1 = 0;
        for(int i=0;i<ITERACIONES;i++)
            tiempo1 += App.removeObjeto(lista, Util.getRandom(SIZE));         
        tiempo1 /= ITERACIONES;
        System.out.printf("REMOVE: %.4f\n", tiempo1/1000.);
 
        tiempo1 = 0;
        for(int i=0;i<ITERACIONES;i++)
            tiempo1 += App.insertObjeto(lista, Util.getRandom(SIZE));
        tiempo1 /= ITERACIONES;
        System.out.printf("INSERT: %.4f\n", tiempo1/1000.);
       
        tiempo1 = 0;
        for(int i=0;i<ITERACIONES;i++)
            tiempo1 += App.iterar(lista);         
        tiempo1 /= ITERACIONES;
        System.out.printf("ITERATOR: %.4f\n", tiempo1/1000.);       
        
        tiempo1 = 0;
        for(int i=0;i<ITERACIONES;i++)
            tiempo1 += App.contains(lista, Util.getRandom(SIZE));         
        tiempo1 /= ITERACIONES;
        System.out.printf("CONTAINS: %.4f\n", tiempo1/1000.);    
    }

    private static List<String> crearList(int tipoList)
    {
        List<String> lista;

        switch(tipoList)
        {
            case ARRAYLIST:
                lista = new ArrayList<String>();
                break;
            case LINKEDLIST: 
            default:
                lista = new LinkedList<String>();
        }

        return lista;
    }
 
    private static long addObjeto(List<String> lista, int size)
    {
        long inicioNano = System.nanoTime();

        for(int i=0;i<size;i++)
            lista.add(String.valueOf(i));
        
        long finNano = System.nanoTime();  
        long nanoTiempo = finNano - inicioNano;
        return nanoTiempo;
    }

    private static long insertObjeto(List<String> lista, int posicion)
    {
        for(int i=0;i<SIZE;i++)
            lista.add(String.valueOf(i));
 
        long inicioNano = System.nanoTime();

        lista.add(posicion, String.valueOf(posicion));
        
        long finNano = System.nanoTime();  
        long nanoTiempo = finNano - inicioNano;
        return nanoTiempo;
    }
 
    static long removeObjeto(List<String> lista, int posicion)
    {
        for(int i=0;i<SIZE;i++)
            lista.add(String.valueOf(i));
 
        long inicioNano = System.nanoTime();
        lista.remove(posicion);
        long finNano = System.nanoTime();  
        long nanoTiempo = finNano - inicioNano;
        return nanoTiempo;
    }
 
    private static long getObjeto(List<String> lista, int posicion)
    {
        for(int i=0;i<SIZE;i++)
            lista.add(String.valueOf(i));
 
        long inicioNano = System.nanoTime();

        lista.get(posicion);
        
        long finNano = System.nanoTime();   
        long nanoTiempo = finNano - inicioNano;
        return nanoTiempo;
    }
   
    private static long iterar(List<String> lista)
    {
        for(int i=0;i<SIZE;i++)
            lista.add(String.valueOf(i));
 
        long inicioNano = System.nanoTime();

        String x;
        for(String s:lista)
            x = s;

        long finNano = System.nanoTime();  
        long nanoTiempo = finNano - inicioNano;
        return nanoTiempo;
    } 
    
    private static long contains(List<String> lista, int valor)
    {
        for(int i=0;i<SIZE;i++)
            lista.add(String.valueOf(i));
        
        long inicioNano = System.nanoTime();

        boolean x = lista.contains(String.valueOf(valor));
        
        long finNano = System.nanoTime();  
        long nanoTiempo = finNano - inicioNano;
        return nanoTiempo;
    }           
}



