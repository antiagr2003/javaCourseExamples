public class JVentana extends JFrame
{
	private Gestor gestor;
	private Collection sensores;

	public JVentana()
	{
		gestor = new Gestor();
		sensores = IOSensores.readSensores();

		btnSuscribir.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					Sensor sensorABuscar = new Sensor(txtSuscripcion.getText());
					Iterator it = sensores.iterator();
					Sensor sensor = null;
					while(it.hasNext())
					{
						Object o = it.next();
						if(sensorABuscar.equals(o))
							sensor = (Sensor)o;
					}
					gestor.addSensorVentana(sensor, JVentana.this);
				}
			});
	}

}