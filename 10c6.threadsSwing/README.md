## Ejemplo de Threads

Existen dos formas de trabajar con Hilos de Ejecución o Threads:

1. Crear una clase que herede de Thread e iniciar el hilo.

Completo desacoplamiento entre el cliente (App) y el hilo (MiHilo). Podríamos tener tantos métodos run() como se desee, creando distintas clases tipo Thread con distintas funcionalidades.


```java
public class App
{
	public static void main(String args[])
	{
		MiHilo hilo = new MiHilo();
		hilo.start();
	}
}

public class MiHilo extends Thread
{
	@Override
	public void run()
	{
		//Tareas a llevar a cabo en el hilo
		//Proceso en segundo plano
	}
}
```

2. Utilizar una ventana como clase que poseerá el método run (Runnable) que NO será un Thread e indicarle que el Thread a crear utilizará ese método run.

Esta forma de trabajo es muy recomendable cuando las tareas a realizar están muy acopladas con la ventana. Solo se tiene la posibilidad de trabajar con una sola funcionalidad con un run. 

```java
public class JVentana extends JFrame implements Runnable
{
	public JVentana()
	{
		Thread hilo = new Thread(this); //Este this hace referencia al objeto del tipo Runnable que poseerá el método run 
		hilo.start();
	}

	@Override
	public void run()
	{
		//Tareas a llevar a cabo en el hilo
		//Proceso en segundo plano
	}
}
```