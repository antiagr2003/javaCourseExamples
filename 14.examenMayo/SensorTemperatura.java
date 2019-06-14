public class SensorTemperatura
{
	public static int VALOR_MAX = 100;
	public static int VALOR_MIN = -50;

	public static String UNIDAD = "ºC";

	public void parse(String valorTexto) 
	//Como no se dijo nada de Excepciones, no hacía falta lanzar, pero lo suyo sería lanzar una en caso de fallo
	{
		String linea = null;
		try
		{
			int valorInt = Integer.parseInt(valorTexto);
			if(valorInt > VALOR_MIN && valorInt < VALOR_MAX)
			{
				Medida medidaAnterior = this.getUltimaMedida();
				int valorAnterior = ((Integer)(medidaAnterior.getValor())).intValue();
				if(valorInt > valorAnterior * 0.9 && valorInt < valorAnterior * 1.1)
				{
					Medida medida = new Medida(new Time(), new Integer(valorInt));
					medidas.add(medida);
					linea = this.formatToLinea(medida);
				}
			}
		}
		catch(NumberFormatException nfe)
		{

		}

		return linea;
	}

	public String formatToLinea()
	{
		return medida.getTime() + "-" + identificador + ": " + medida.getValor() + " (" + UNIDAD + ")";
	}
}