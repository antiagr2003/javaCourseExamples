public class Personaje
{
	//Atributo de CLASE
	String ISLA;

	//Atributo de Instancia
	int vida;
	int material;

	Personaje()
	{
		this.vida = 100;
		this.material = 0;
	}

	Personaje(int vida)
	{
		this.vida = vida;
	}

	Personaje(int vida, int material)
	{
		this.vida = vida;
		this.material = material;
	}


	void setIsla(String isla)
	{
		this.isla = isla;
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
		this.vida = vida;
	}

	void setMaterial(int material)
	{
		this.material = material;
	}	

	String getInfo()
	{
		return isla + "-->" + vidad + "-" + material;
	}
}