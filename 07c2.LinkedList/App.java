import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.LinkedList;
import java.util.HashSet;

/*
Q1: ¿Has notado más rápidez en las inserciones y borrados que un ArrayList?
*/

public class App
{
    public static void main(String[] args)
    {
        //Collection col = new Collection(); //ERROR: 
        List<Persona> lista = new LinkedList<Persona>();

        Persona p = new Persona("44444A", "Lucas", 23);
        lista.add(p);
        lista.add(new Persona("44444A", "Lucas", 23));
        lista.add(0, new Persona("11111A", "Miguel", 33));

        lista.remove(2);
        System.out.println(lista);

        //Si quisiésemos ejecutar métodos específicos de LinkedList...
        LinkedList<Persona> listaLL = (LinkedList) lista;
        Persona p1 = listaLL.getFirst();
        Persona p2 = listaLL.getLast();

    }
}
