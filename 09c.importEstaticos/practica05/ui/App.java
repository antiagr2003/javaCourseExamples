/** @author David Contreras */
package practica05.ui;

import static java.lang.Math.*;
import static practica05.dominio.Persona.*;

public class App
{
    private static Agenda agenda = new Agenda("AGENDA");

    public static void main(String[] args)
    {
        System.out.println("Ejemplo de Imports Estaticos");

        System.out.println(abs(-13));

        System.out.println((EDAD_MAXIMA + EDAD_MINIMA) / 2);
    }
}