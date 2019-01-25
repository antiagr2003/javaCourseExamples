//Definición de la clase que dará vida a los objetos Persona
public class AppPersona
{
    public static void main(String args[]) 
    {
    	//Clase.metodoDeClase()
    	//objeto.metodoDeInstancia()

		Persona.setCIUDAD("Madrid");

        Persona persona1 = new Persona("Luis", 22);
        Persona persona2= new Persona(22, "Luis");
        Persona persona3 = new Persona("Manuel");

        //persona2.setEdad(33); 

        //Da error: Persona persona3 = new Persona();

        System.out.println(Persona.getCIUDAD());

        Persona.setCIUDAD("Segovia");

        System.out.println(persona1.getInfo());
        System.out.println(persona2.getInfo());
        System.out.println(persona3.getInfo());

    }
}
