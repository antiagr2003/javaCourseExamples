package practica11.run;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import practica11.obj.Estacion;
import practica11.obj.Pista;
import practica11.util.Leer;
import practica11.util.ImportDatos;

public class App
{
    private static ArrayList estaciones = new ArrayList();
	
	public static void main(String s[])
	{
		int opc=0;
		
		while(opc!=3)
		{
			App.clear();
			App.showMenu();
			opc=Integer.parseInt(Leer.porTeclado());
			switch(opc)
			{
				case 1:	
					App.clear();
					App.showMenuCrear();
					break;
					
				case 2:
					App.clear();
					App.listar();
					System.out.println("Pulse ENTER para continuar");
					Leer.porTeclado();
					break;
				case 3:
					break;
				default:
					System.out.println("Error: Opción incorrecta");
			}
		}
	}

    private static void clear()
	{
		for(int i=0;i<25;i++)
			System.out.println();
	}
	
	private static void showMenu()
	{
		System.out.println("#######################################");
		System.out.println("##   Gestión de Estaciones de Esqui  ##");
		System.out.println("#######################################");
		System.out.println("##                                   ##");
		System.out.println("##   1.- Crear                       ##");
		System.out.println("##   2.- Listar todo                 ##");		
		System.out.println("##                                   ##");
		System.out.println("##   3.- Salir                       ##");	
		System.out.println("##                                   ##");
		System.out.println("#######################################");
	}
	
	private static void listar()
	{
		System.out.println("###################################################");
		System.out.println("##            Listado de Estaciones              ##");
		System.out.println("###################################################");
		System.out.println("##");
        for(Iterator it=estaciones.iterator();it.hasNext();)
            System.out.println(it.next());
		System.out.println("##");
		System.out.println("###################################################");

	}
	
	private static void showMenuCrear()
	{
		System.out.print("### Nombre de la Estación: ");
		String estacion = Leer.porTeclado();
		Estacion e = new Estacion(estacion);
        	System.out.print("Importando de Internet...");
		Collection c = ImportDatos.leer(e);
        if(c==null)
        {
            System.out.print("\nNo se encontraron datos\n");
        }
        else
        {
            System.out.print("\nDatos importados correctamente\n");
            e.setEspesores(c);
        }
        
        estaciones.add(e);
        
		String opc="";
		do
		{
			System.out.print("### Nombre de la Pista: ");
			String pista = Leer.porTeclado();
			System.out.print("### Color de la Pista: ");
			String color = Leer.porTeclado();		
			System.out.print("### Kms de la Pista: ");
			int km = Integer.parseInt(Leer.porTeclado());
			e.addPista(new Pista(pista, color, km));
			System.out.print("¿Desea agregar más pistas? (S/N)");
			opc = Leer.porTeclado();
		}while(opc.equalsIgnoreCase("S"));
		//}while(opc.toUpperCase.equals("S"));
	}

}
