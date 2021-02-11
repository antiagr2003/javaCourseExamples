//HIJA
public class PersonajePremium extends Personaje
{
	private String skins;

	public PersonajePremium(String skins)
	{
		super(); //Por defecto lo ejecuta Java
		this.skins = skins;
	}

	public PersonajePremium(int vida, String skins)
	{
		super(vida);
		//this.setVida(); Sí se podría hacer.
		this.skins = skins;
	}

	public PersonajePremium(int vida, int material, String skins)
	{
		super(vida, material);
		this.skins = skins;
	}

	public String getSkins()
	{
		return skins;
	}

	public void setSkins(String skins)
	{
		this.skins = skins;
	}	

	public String getInfo()
	{
		//return ISLA + "-->" + vida + "-" + material + skins;
		return super.getInfo() + this.getVida() + skins;
	}	
}