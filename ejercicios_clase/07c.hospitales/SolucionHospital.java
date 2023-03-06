import java.util.ArrayList;

abstract class Paciente
{
	ArrayList<Paciente> contactos = new ArrayList<Paciente>();

	void addContacto(Paciente paciente)
	{
		contactos.add(paciente);
	}
}

class GestorHospitales
{
	ArrayList<Hospital> hospitales = new ArrayList<Hospital>();

	void addHospital(Hospital h)
	{
		hospitales.add(h);
	}

	void ingresarPaciente(Paciente paciente)
	{
/*
		int i = 0;
		while(i < hospitales.size() && !hospitales.get(i).ingresar(p))
			i++;
*/
		for(int i=0; i<hospitales.size();i++)
		{
			Hospital hospital = hospitales.get(i);
			if (hospital.ingresar(paciente))
				i = hospitales.size();
		}
	}
}


class Hospital
{
	ArrayList<Paciente> pacientes;
	int capacidad;	

	boolean ingresar(Paciente p)
	{
		boolean rtn = false;

		if (this.isFull())
		{
			pacientes.add(p);
			rtn = true;
		}
		return rtn;
	}

	boolean isFull()
	{
		return (pacientes.size() < capacidad);
	}

}