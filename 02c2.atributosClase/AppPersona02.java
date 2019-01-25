//Definición de la clase que dará vida a los objetos Persona
public class AppPersona02
{
    public static void main(String args[]) 
    {
    	//Clase.metodoDeClase()
    	//objeto.metodoDeInstancia()

		Persona.setCIUDAD("Madrid");

        int lista[] = new int[10];
        lista[0] = 2;
        lista[0] = 6;

        //int lista[];
        //lista = new int[10];

        Persona personas[] = new Persona[10];
        //Persona personas = new Persona(10);

        Persona persona1 = new Persona("Luis", 22);
        personas[0] = persona1;
        personas[1] = new Persona(22, "Miguel");
        personas[2] = new Persona("Manuel");

        //persona2.setEdad(33); 

        //Da error: Persona persona3 = new Persona();

        System.out.println(Persona.getCIUDAD());

        Persona.setCIUDAD("Segovia");

        for(int i=0;i<10;i++)
            if(personas[i]!=null)
                System.out.println(personas[i].getInfo());
         
        /* SCOPE

        for(int i=0;i<10;i++)
        {
            System.out.println(personas[i].getInfo());
            int j = 0;
        }*/
    }
}
