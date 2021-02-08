public class Personaje
{
	//Atributo de CLASE
	public final static int VIDA_MINIMA = 0;
	public final static int VIDA_MAXIMA = 100;

	static String ISLA;

	//Atributo de Instancia
	int vida;
	int material;

	Personaje()
	{
		this(100, 0);
	}

	Personaje(int vida)
	{
		this.setVida(vida);
	}

	Personaje(int vida, int material)
	{
		this.setVida(vida);
		this.material = material;
	}

	static void setISLA(String isla)
	{
		ISLA = isla;
		//ERROR: vida = 99;
	}

	static String getISLA()
	{
		return ISLA;
	}

	int getVida()
	{
		return vida;
	}

	int getMaterial()
	{
		return material;
	}

	void setVida(int vida)
	{
		if(vida > VIDA_MINIMA && vida <= VIDA_MAXIMA)
			this.vida = vida;
	}

	void setMaterial(int material)
	{
		this.material = material;
	}	

	String getInfo()
	{
		return ISLA + "-->" + vida + "-" + material;
	}
}