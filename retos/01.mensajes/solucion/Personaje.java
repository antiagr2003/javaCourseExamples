public class Personaje
{
	//Atributos
	String nombre; //null por defecto, "Luis" o "Manuel"
	int vida;	   //0
	String arma;  //null por defecto, "Pistola" o "Escopeta"

	//def get_nombre(self) -> str:
	String getNombre()
	{
		return nombre;
	}
	
	int getVida()
	{
		return vida;
	}

	String getArma()
	{
		return arma;
	}

	//def set_nombre(x:str) -> None:
	void setNombre(String x)
	{
		nombre = x;
	}

	void setVida(int x)
	{
		vida = x;
	}

	void setArma(String x)
	{
		arma = x;
	}

	void herir(int vidaARestar)
	{
		vida -= vidaARestar;
	}

	void disparar(Personaje p)
	{
		double random = Math.random();
		if (arma == "Pistola" && random < 0.5)
			p.herir(10);
		else if(arma == "Escopeta" && random < 0.8)
			p.herir(20);
	}

}