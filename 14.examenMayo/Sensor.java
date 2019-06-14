public class Sensor
{

	private String identificador;
	private String ubicacion;
	private TreeSet medidas;

	public Medida getUltimaMedida()
	{
		Iterator it = medidas.iterator();
		Medida medida = null;
		while(it.hasNext())
			medida = it.next();

		return medida;
	}
	public abstract void parse(String valorTexto);

}