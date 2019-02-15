/**
 @author David Contreras
*/

public class AreaProtegida extends Parque implements Visitable
{
	//Atributos

	double subvencion;
	String ong;

	//Constructores

	public AreaProtegida(String _nombre, double _km, int _numeroEspecies, double _subvencion, String _ong)
	{
		super(_nombre, _km, _numeroEspecies);
		subvencion = _subvencion;	
		ong = _ong;
	}

	//Metodos
	public double getSubvencion()
	{
		return subvencion;
	}
	
	public void setSubvencion(double _subvencion)
	{
		subvencion = _subvencion;		
	}

	public String getOng()
	{
		return ong;
	}
	
	public void setOng(String _ong)
	{
		ong = _ong;	
	}

	@Override
	public String getInfo()
	{
	    String s= super.getInfo();
		s += "\nSubvención: " + subvencion;
		s += "\nONG: " + ong;
	    return s;	
	}
	
	@Override
    public String visitar(String guia)
    {
        return "Visitando área " + nombre + " con el/la guía " + guia;
    }
		
} 
