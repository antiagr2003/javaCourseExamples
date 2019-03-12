/** @author David Contreras */

public class AppEquipoFutbol
{
    public static void main(String[] args)
    {
        Equipo equipo1 = new Equipo("PSG", 400000000);
        equipo1.setPresidente(new Presidente("Nasser Al-Khelaifi", "Multimillonario"));
        
        Jugador j1 = new Jugador("MBampe", 27);
        j1.addEstadisticas(new Estadistica(1, 1));
        j1.addEstadisticas(new Estadistica(2, 1));
        j1.addEstadisticas(new Estadistica(5, 2));
        
        Jugador j2 = new Jugador("Neymar", 7);
        j2.addEstadisticas(new Estadistica(4, 1));
        
        equipo1.addJugador(j1);
        equipo1.addJugador(j2);
        
        System.out.println(equipo1);
    }
}
