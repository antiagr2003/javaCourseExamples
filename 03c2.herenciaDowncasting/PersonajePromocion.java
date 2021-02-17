//HIJA
public class PersonajePromocion extends Personaje
{
	private String fechaCaducidad;
	private int pavosExtras;

	public PersonajePromocion(String fechaCaducidad, int pavosExtras)
	{
		this.fechaCaducidad = fechaCaducidad;
		this.pavosExtras = pavosExtras;
	}

	public PersonajePromocion(int vida, String fechaCaducidad, int pavosExtras)
	{
		super(vida);
		this.fechaCaducidad = fechaCaducidad;
		this.pavosExtras = pavosExtras;		
	}

	public PersonajePromocion(int vida, int material, String fechaCaducidad, int pavosExtras)
	{
		super(vida, material);	
		this.fechaCaducidad = fechaCaducidad;
		this.pavosExtras = pavosExtras;		
	}

	public String getFechaCaducidad()
	{
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad)
	{
		this.fechaCaducidad = fechaCaducidad;
	}	

	@Override
	public String getInfo()
	{
		return super.getInfo() + " Fin: " + fechaCaducidad + " & " + pavosExtras + " euros";
	}	
}