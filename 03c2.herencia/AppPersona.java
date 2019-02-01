//Definición de la clase que dará vida a los objetos Persona
public class AppPersona
{

    static int contadorPersonas = 0;

    public static void main(String args[]) 
    {
		Persona.setCIUDAD("Madrid");

        Persona persona1 = new Persona("Luis", 22);
        Persona persona2= new Persona(22, "Luis");
        Persona persona3 = new Persona("Manuel");

        Trabajador trabajador1 = new Trabajador("Lucas", 30, "Teleco");

        Persona persona = trabajador1;


        System.out.println(Persona.getCIUDAD());

        Persona.setCIUDAD("Segovia");

        AppPersona.mostrarInformacion(persona1);
        AppPersona.mostrarInformacion(persona2);
        AppPersona.mostrarInformacion(persona3);

        AppPersona.mostrarInformacion(trabajador1);


        System.out.println(trabajador1.getNombre());
        System.out.println(trabajador1.getProfesion());

    }

    static void mostrarInformacion(Persona persona)
    {
        System.out.println(persona.getInfo());
        //ERROR: String profesion = persona.getProfesion();
        contadorPersonas++;
    }
   
}
