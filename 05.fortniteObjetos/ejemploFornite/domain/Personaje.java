package ejemploFornite.domain;

import ejemploFornite.domain.armamento.Arma;
import ejemploFornite.domain.construcciones.Construccion;
import ejemploFornite.domain.objetos.Objeto;

public class Personaje
{
	//Constante para evitar el hardcodeo
	public final static int VIDA_MAX = 100;
	public final static int VIDA_MIN = 0;
	public final static int MATERIAL_DEFAULT = 0;

	public final static int ARMAS_MAX = 5;
	
	//Lógica de los objetos: valores comunes a todos los objetos
	private static String MUNDO;

	//Lógica de los objetos: valores específicos de los objetos
	private String usuario;
	private int vida;
	private int material;
	private Arma armas[];
	private Arma armaSeleccionada;

	//Constructores
	public Personaje(String usuario, int vida, int material)
	{
		this.usuario = usuario;
		this.setVida(vida);
		this.setMaterial(material);
		armas = new Arma[ARMAS_MAX];
		armaSeleccionada = null;
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

	public int sizeArmas()
	{
		int numeroArmas = 0;
		for(Arma a:armas)
			if(a != null)
				numeroArmas++;
		return numeroArmas;
	}

	public void addArma(Arma arma)
	{
		if(this.sizeArmas() < ARMAS_MAX)
			for(int i=0;i<ARMAS_MAX;i++)
			{
				armas[i] = arma;
				i = ARMAS_MAX;
			}
	}

	public Arma getArma(Arma arma)
	{
		Arma armaArsenal = null;
		int posicion = this.indexOfArma(arma);
		if(posicion != -1)
			armaArsenal = armas[posicion];
		return armaArsenal;
	}

	public int indexOfArma(Arma arma)
	{
		int posicion = -1;
		for(int i=0;i<ARMAS_MAX;i++)
			if(armas[i] != null && armas[i].equals(arma))
			{
				armaSeleccionada = armas[i];
				posicion = i;
				i = ARMAS_MAX;
			}
		return posicion;
	}	

	public void seleccionarArma(Arma arma)
	{
		int posicion = this.indexOfArma(arma);
		if(posicion != -1)
			armaSeleccionada = armas[posicion];
		else
			this.deseleccionarArma();
	}	

	public void seleccionarArma(int posicionArma)
	{
		if(posicionArma >= 0 && posicionArma < ARMAS_MAX)
			armaSeleccionada = armas[posicionArma];
		else
			this.deseleccionarArma();
	}	

	public void deseleccionarArma()
	{
		armaSeleccionada = null;
	}	

	public void removeArma(Arma arma)
	{
		for(int i=0;i<ARMAS_MAX;i++)
			if(armas[i] != null && armas[i].equals(arma))
			{
				armas[i] = null;
				i = ARMAS_MAX;
			}
	}	

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
		if(vida < VIDA_MIN)
			this.vida = VIDA_MIN;
		else if(vida > VIDA_MAX)
			this.vida = VIDA_MAX;
		else
			this.vida = vida;
	}

	public void mejorarVida(int vidaDelta)
	{
		this.setVida(vida + vidaDelta);
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

	public void disparar()
	{
		this.disparar(null);
	}

	public void disparar(Personaje personaje)
	{
		if(armaSeleccionada != null && armaSeleccionada.canShoot())
		{
			armaSeleccionada.disparar();
			if(personaje != null)
				personaje.recibirDisparo(armaSeleccionada.getDamage());	
		}
	}

	/** Será consumido en el momento que se recoge, por simplificar */
	public void recogerObjeto(Objeto objeto)
	{
		objeto.consumirBy(this);
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

	public void picar(Construccion construccion)
	{
		this.deseleccionarArma();
		material += construccion.recibirPico();
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
		  .append("\n\tArma seleccionada: ")
		  .append(armaSeleccionada!=null?armaSeleccionada.toString():"sin arma")		  
		  .append("\n\tMundo: ")
		  .append(MUNDO);
		return sb.toString();
	}
}