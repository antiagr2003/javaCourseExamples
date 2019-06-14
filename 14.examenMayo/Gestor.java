public class Gestor
{

	private HashMap mapaSensoresVentanas;
	
	public void addSensorVentana(Sensor sensor, JVentana ventana)
	{
		Collection listaVentanas = (Collection) mapaSensoresVentanas.get(sensor);
		if(listaVentanas==null)
			listaVentanas = new ArrayList();

		listaVentanas.add(ventana);
	}

	public void init()
	{
		while(true)
		{
			try
			{
				Util.wait(60);
				Iterator it = mapaSensoresVentanas.keySet().iterator();
				while(it.hasNext())
				{
					Sensor sensor = (Sensor) it.next();
					IOSensoresTexto.read(sensor);
				}
			}
			catch(InterruptedException ie)
			{

			}
		}
	}

}