public class App
{
    public static void main(String args[]) 
    {
        Persona persona1 = new Persona("Luis", 22);
        Trabajador trabajador1 = new Trabajador("Lucas", 30, "Teleco");

        System.out.println(persona1);
        System.out.println(trabajador1);
    }
}