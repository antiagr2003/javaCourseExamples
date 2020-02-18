package practicaPaquetes.ui;

import practicaPaquetes.dominio.Persona;
import practicaPaquetes.dominio.Alumno;

import java.sql.Date;

public class AppPersona
{
	public static void main(String args[])
	{

		java.util.Date d = new java.util.Date();
		//practicaPaquetes.dominio.Persona p = new practicaPaquetes.dominio.Persona();

		System.out.println(Persona.EDAD_MIN);
		//Persona.EDAD_MIN = -55;
		//persona1.edad = -44;

		Persona.setCIUDAD("Madrid");
		
		Persona persona1 = new Persona("Luis", 22);
		Persona persona2 = new Persona("Manuel", 23);
		//Persona persona3 = new Persona();

		//persona1.edad = -45; //ERROR

		System.out.println(persona1);
		System.out.println(persona2);

		Alumno alumno1 = new Alumno("Alumno Miguel", 33, "GITT", "2-A");
		System.out.println(alumno1);		

	}
}