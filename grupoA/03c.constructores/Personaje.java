public class Personaje
{
	//atributos
	String usuario;
	int vida;
	int madera;

	Personaje(String usuario, int vida, int madera)
	{
		this.usuario = usuario;
		this.setVida(vida);
		this.madera = madera;
	}
/*
	Personaje(String usuario, int madera)
	{
		this.usuario = usuario;
		this.vida = 100;
		this.madera = madera;
	}	

	Personaje(String usuario)
	{
		this.usuario = usuario;
		this.vida = 100;
		this.madera = 0;
	}	
*/

	//métodos
	String getUsuario()
	{
		return usuario;
	}

	int getMadera()
	{
		return madera;
	}

	int getVida()
	{
		return vida;
	}


	void setUsuario(String usuario)
	{
		this.usuario = usuario;
	}

	void setVida(int vida)
	{
		if(vida >= 0 && vida <= 100)
			this.vida = vida;
		else
			this.vida = 100;
	}

	void setMadera(int madera)
	{
		this.madera = madera;
	}

	void addMadera(int masMadera)
	{
		madera += masMadera;
		//madera = madera + masMadera;
	}

	void recibirDisparo(int unaVida)
	{
		vida -= unaVida;
	}

	void disparar(Personaje personaje)
	{
		personaje.recibirDisparo(20);	
	}

	boolean isVivo()
	{
		/*
		if(vida>0)
			return true;
		else
			return false;
*/
		return (vida > 0);
	}


	void addVida(int deltaVida)
	{
		if ((vida + deltaVida) <= 100)
			vida += deltaVida;
		else
			vida = 100;
	}

	String getInfo()
	{
		return "Usuario: " + usuario + " Vida: " + vida + " Madera: " + madera;
	}

	/*
	void picar (Arbol arbol)
	{
	   arbol.recibirPico();
	}
	*/
}