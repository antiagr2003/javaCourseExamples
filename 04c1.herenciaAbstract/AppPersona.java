//Definición de la clase que dará vida a los objetos Persona
public class AppPersona
{

    static final int NUMERO_PERSONAS = 10;

    public static void main(String args[]) 
    {
        Persona personas[] = new Persona[NUMERO_PERSONAS];
		Persona.setCIUDAD("Madrid");

		//Estudiante e = new Estudiante ("Luis", 22, "Teleco");
		//Persona p = new Estudiante ("Luis", 22, "Teleco");

        personas[0] = new Estudiante ("Luis", 22, "Teleco");
        personas[1] = new Trabajador("Lucas", 30, "Telefonica");

        for(int i=0;i<personas.length;i++)
        	if(personas[i]!=null)
        		System.out.println("Esta persona cotiza a un " + personas[i].cotizar() + "%");

        //System.out.println(trabajador1.getProfesion());

    }

}