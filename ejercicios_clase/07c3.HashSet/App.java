import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.LinkedList;
import java.util.HashSet;

/*
Q1: ¿Qué ocurre si borras el método hashCode() de la clase Persona?
Q2: ¿Por qué el método hashCode() devuelve distintos valores?
*/

public class App
{
    public static void main(String[] args)
    {
        Collection miCollection = new HashSet();
        //HashSet miCollection = new HashSet();

        Persona p1 = new Persona("44444A", "Lucas", 23);
        Persona p2 = new Persona("44444A", "Lucas", 23);

        miCollection.add(p1);
        miCollection.add(p2);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(miCollection);
    }
}

