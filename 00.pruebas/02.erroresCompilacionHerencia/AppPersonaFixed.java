//Definición de la clase que dará vida a los objetos Persona
public class AppPersonaFixed
{
    public static void main(String args[]) 
    {
		PersonaFixed.setCIUDAD("Madrid");

        PersonaFixed persona1 = new PersonaFixed("Luis", 22);
        TrabajadorFixed trabajador1 = new TrabajadorFixed("Lucas", 30, "Teleco");

        PersonaFixed p = trabajador1;

        System.out.println(p.getInfo());
        System.out.println(trabajador1.getProfesion());
    }
   
}
