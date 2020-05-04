public abstract class Sensor implements java.io.Serializable
{
	private String id;
	private String ubicacion;
	protected TreeMap<Time, Object> mapaHoraValores = new TreeMap<Time, Object>();

	public abstract String parse(String linea);

	protected String toLine()
	{
		return " - " + id + "(" + ubicacion + ")";
	}
}

public class SensorTemperatura extends Sensor
{
	public static String UNIDAD = "ºC";
	private static float ULTIMO_VALOR = Float.MIN_VALUE;

	//private TreeMap<Time, Float> mapaHoraValores = new TreeMap<Time, Float>();

	public String parse(String linea)
	{
		float valor = Float.parseFloat(linea);
		Time time = new Time();
		if(ULTIMO_VALOR != Float.MIN_VALUE)
			if(Math.abs(valor-ULTIMO_VALOR)<=ULTIMO_VALOR*0.10F)
				mapaHoraValores.put(time, valor);
		ULTIMO_VALOR = valor; //El primer valor se da siempre por bueno.
		return time.toString() + this.toLine() + valor + UNIDAD;
	}

	public String toString()
	{
		return id + "(" + ubicacion + ")" + valo
	}
}

public class SensorMovimiento extends Sensor
{
	public static String UNIDAD = "";

	//private TreeMap<Time, Boolean> mapaHoraValores = new TreeMap<Time, Boolean>();

	public String parse(String linea)
	{
		boolean valor = lineas.equals("si");
		Time time = new Time();
		mapaHoraValores.put(time, valor);
		return time.toString() + this.toLine() + valor + UNIDAD;
	}
}

public class IOSensores
{
	public String readLine(Sensor sensor)
	{
		String ultimaLinea;
		while(String linea = br.readLine()!=null)
			ultimaLinea = linea;

		String output = sensor.parse(ultimaLinea);

		return output;
	}
}

public class Gestor
{
	private TreeSet<Sensor, JVentana> mapaSuscripcion = new TreeSet<Sensor, JVentana>();
	private boolean fin = false;

	private Collection<Sensor> sensores;

	public Gestor()
	{
		sensores = IOSensores.readObjects();

		this.run();
	}

	private Sensor buscar(String id)
	{
		Sensor sensorEncontrado = null;
		for(Sensor sensor:sensores)
			if(sensor.getId().equals(id))
				sensorEncontrado = sensor;

		return sensorEncontrado;
	}

	public void suscribir(String idSensor, JVentana ventana)
	{
		Sensor sensor = this.buscar(idSensor);
		if(sensor!=null)
		{
			Collection<JVentana> ventanas = mapaSuscripcion.get(sensor);
			if(ventanas==null)
			{
				ventanas = new ArrayList<JVentana>();
				mapaSuscripcion.put(sensor, ventanas);
			}
			ventanas.add(ventana);
		}
	}

	public void finalizar()
	{
		fin = true;
	}

	public void run()
	{
		while(!fin)
		{
			try
			{
				new Util().wait((byte)1);
				Set<Sensor> sensores = mapaSuscripcion.keySet();
				for(Sensor sensor:sensores)
				{
					Strign output = IOSensores.readLine(sensor);
					Collection<JVentana> ventanas = mapaSuscripcion.get(sensor);
					for(JVentana ventana:ventanas)
						ventana.append(output);
				}

			}
			catch(InterruptedException e)
			{

			}
		}
	}

}

public class JVentana
{

	private Gestor gestor;

	public JVentana()
	{
		gestor = new Gestor();
	}

	//actionPerformed del botón llama a este método
	private void suscribir()
	{
		gestor.suscribir(txtSensor.getText(), this);
	}
}