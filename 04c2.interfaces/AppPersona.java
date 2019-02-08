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

        /*for(int i=0;i<personas.length;i++)
        	if(personas[i]!=null)
        		System.out.println("Esta persona cotiza a un " + personas[i].cotizar() + "%");
*/

        Cotizable cotizables[] = new Cotizable[10];

        cotizables[0] = new Trabajador("Miguel", 43, "Informático");
        cotizables[1] = new Empresa("Telefonica", 2323232);
        cotizables[2] = new Estudiante ("Luis", 22, "Teleco");

        for(int i=0;i<cotizables.length;i++)
            if(cotizables[i]!=null)
                System.out.println(cotizables[i].cotizar());

        //System.out.println(trabajador1.getProfesion());

    }

}