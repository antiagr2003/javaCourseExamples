import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main(String[] args) 
    {
        //Inicialización de la matriz
        Integer arrayInts[] = {10,7,3,4,5,6,2,8,2};
        List<Integer> listaInts = Arrays.asList(arrayInts);
        Collection<List<Integer>> listaMatriz = new ArrayList<List<Integer>>();
        listaMatriz.add(listaInts);
        listaMatriz.add(listaInts);
        listaMatriz.add(listaInts);

        // Versión tradicional con Collections
        int suma = 0;
        for(List<Integer> lista:listaMatriz)
            for(int numero:lista)
            {
                numero = numero * 2;
                if(numero > 10)
                    suma += numero;
            }

        System.out.println(suma);   

        // Versión con Lambdas y Streams
        suma = listaMatriz.stream()
            .flatMap(Collection::stream)
            .map(n -> n*2)
            .filter(n -> n > 10)
            .reduce(0, (sumaTemp, n) -> sumaTemp + n);

        System.out.println(suma);             

        suma = listaMatriz.stream()
            .flatMap(Collection::stream)
            .mapToInt(n -> n*2)
            .filter(n -> n > 10)
            .sum();

        System.out.println(suma);   
    }
}