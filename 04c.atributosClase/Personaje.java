public class Personaje
{
	//Constante para evitar el hardcodeo
	public final static int VIDA_MAX = 100;
	public final static int VIDA_MIN = 0;
	public final static int MADERA_DEFAULT = 0;
	
	//Lógica de los objetos: valores comunes a todos los objetos
	static String MUNDO;

	//Lógica de los objetos: valores específicos de los objetos
	String usuario;
	int vida;
	int madera;

	//Constructores
	Personaje(String usuario, int vida, int madera)
	{
		this.usuario = usuario;
		this.setVida(vida);
		this.setMadera(madera);
	}

	Personaje(String usuario, int madera)
	{
		this(usuario, VIDA_MAX, madera);
	}	

	Personaje(int madera, String usuario)
	{
		this(usuario, madera); 
	}		

	Personaje(String usuario)
	{
		this(usuario, VIDA_MAX, MADERA_DEFAULT);
	}	

	static void setMundo(String mundo)
	{
		MUNDO = mundo;
	}


	//Métodos
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
		if(vida >= VIDA_MIN && vida <= VIDA_MAX)
			this.vida = vida;
		else
			this.vida = VIDA_MAX;
	}

	void setMadera(int madera)
	{
		this.madera = madera;
	}

	void addMadera(int masMadera)
	{
		madera += masMadera;
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
		return (vida > 0);
	}


	void addVida(int deltaVida)
	{
		if ((vida + deltaVida) <= VIDA_MAX)
			vida += deltaVida;
		else
			vida = VIDA_MAX;
	}

	void picar(Arbol arbol)
	{
		madera += arbol.recibirPico();
	}

	String getInfo()
	{
		return "Usuario: " + usuario + " Vida: " + vida +
			   " Madera: " + madera + " Mundo: " + MUNDO;
	}


}