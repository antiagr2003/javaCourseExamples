# Patrón Singleton

Número de ocurrencias:
- 0: abstract class Abstracta
- inf: class Normal

¿Y si solo quiero tener una ocurrencia?

```java
class Profesor
{
	static Profesor miProfe = null;

	private Profesor()
	{

	}

	static Profesor getInstance()
	{
		if(miProfe == null)
			miProfe = new Profesor();
		return miProfe;
	}
}
```

```java
class App
{
	main()
	{
		Profesor prof1 = new Profesor(); //ERROR
		Profesor prof2 = Profesor.getInstance();

	}
}
```
