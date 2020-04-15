# Pseudocódigo de dudas

## Formatos de información

Los ficheros de objetos Java no son editables/legibles por ninguna tra aplicación que no sea Java.

Por ello, aparecen distintos formatos:

### XML
<persona>
	<nombre>Luis</nombre>
	<edad>22</edad>
</persona>

personas.xml

### JSON
{nombre: "Luis", edad: 22}

personas.json
JavaScript Object Notation


### Conversión de objetos Java a estos formatos

```java
p = new Persona("Luis", 22);
pw.println(p.toString())
pw.println(p.toJSON())
```

```java
//GSON
public String toJSON()
{
    return "{nombre: " + nombre + ", edad: " + edad + "..... nif}";
    //StringBuilder
}
```

## Ejemplo de Excepciones

```java
class O
{
	void m() throws E1
	{
		throw new E1();
	}

}

class A
{
	m2() throws E2
	{
		try
		{
			o.m();
		}
		catch(E1)
		{
			throw new E2();
		}
	}
}

class B
{
	A a;

	m3()
	{
		try
		{
			a.m2()
		}
		catch(E2)
		{
		
		}
	}
}
```

## Dudas de Hilos

```java
GestorHilos
{
	Hilo hilos[];

	fin()
	{
		cont++;

		if(cont==hilos.legth)
		{
			//......
		}
	}

	start()
	{
		h.start();


		h.join(); //Espera a que termine un hilo...

		otras lineas....
	}
}

Hilo extends Thread
{

	run()
	{
		while()
		{
		}
		gh.fin();
	}
}
```
