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

        System.out.println(Persona.getCIUDAD());

        Persona.setCIUDAD("Segovia");

        AppPersona.mostrarInformacionPersona(persona1);
        AppPersona.mostrarInformacionPersona(persona2);
        AppPersona.mostrarInformacionPersona(persona3);

    }

    static void mostrarInformacionPersona(Persona persona)
    {
        System.out.println(persona.getInfo());
        contadorPersonas++;
    }
}
