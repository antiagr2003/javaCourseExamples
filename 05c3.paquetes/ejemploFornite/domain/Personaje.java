package ejemploFornite.domain;

public class Personaje
{
	//Constante para evitar el hardcodeo
	public final static int VIDA_MAX = 100;
	public final static int VIDA_MIN = 0;
	public final static int MATERIAL_DEFAULT = 0;
	
	//Lógica de los objetos: valores comunes a todos los objetos
	static String MUNDO;

	//Lógica de los objetos: valores específicos de los objetos
	String usuario;
	int vida;
	int material;

	//Constructores
	public Personaje(String usuario, int vida, int material)
	{
		this.usuario = usuario;
		this.setVida(vida);
		this.setMaterial(material);
	}

	public Personaje(String usuario, int material)
	{
		this(usuario, VIDA_MAX, material);
	}	

	public Personaje(int material, String usuario)
	{
		this(usuario, material); 
	}		

	public Personaje(String usuario)
	{
		this(usuario, VIDA_MAX, MATERIAL_DEFAULT);
	}	

	public static void setMundo(String mundo)
	{
		MUNDO = mundo;
	}


	//Métodos
	public String getUsuario()
	{
		return usuario;
	}

	public int getMaterial()
	{
		return material;
	}

	public int getVida()
	{
		return vida;
	}

	public void setUsuario(String usuario)
	{
		this.usuario = usuario;
	}

	public void setVida(int vida)
	{
		if(vida >= VIDA_MIN && vida <= VIDA_MAX)
			this.vida = vida;
		else
			this.vida = VIDA_MAX;
	}

	public void setMaterial(int material)
	{
		this.material = material;
	}

	public void addmaterial(int masMaterial)
	{
		material += masMaterial;
	}

	public void recibirDisparo(int unaVida)
	{
		vida -= unaVida;
	}

	public void disparar(Personaje personaje)
	{
		personaje.recibirDisparo(20);	
	}

	public boolean isVivo()
	{
		return (vida > VIDA_MIN);
	}


	public void addVida(int deltaVida)
	{
		if ((vida + deltaVida) <= VIDA_MAX)
			vida += deltaVida;
		else
			vida = VIDA_MAX;
	}

	public void picar(Picable picable)
	{
		material += picable.recibirPico();
	}	

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("\n\tUsuario: ")
		  .append(usuario)
		  .append("\n\tVida: ")
		  .append(vida)
		  .append("\n\tMaterial: ")
		  .append(material)
		  .append("\n\tMundo: ")
		  .append(MUNDO);
		return sb.toString();
	}


}