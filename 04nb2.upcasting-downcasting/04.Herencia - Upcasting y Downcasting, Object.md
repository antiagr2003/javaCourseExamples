

```Java
public class Persona
{
    String nombre;
    int edad;

    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre()
    {
        return nombre;
    }

    @Override
    public String toString()
    {
        return nombre + "(" + edad + ")"; 
    }
}

public class Trabajador extends Persona
{
    String profesion;

    public Trabajador(String nombre, int edad, String profesion)
    {
        super(nombre, edad);
        this.profesion = profesion;
    }

    public String getProfesion()
    {
        return profesion;
    }

    @Override
    public String toString()
    {
        return super.toString() + profesion; 
    }
}
```


```Java
Persona persona = new Persona("Luis", 22);
Trabajador trabajador = new Trabajador("Jaime", 33, "Teleco en Telefónica");
```


```Java
persona.getNombre();
```




    Luis




```Java
trabajador.getProfesion();
```




    Teleco en Telefónica



###### Upcasting


```Java
Persona p = trabajador;
```

El método *getProfesion()* no está en el interfaz de Persona


```Java
p.getProfesion();
```


    |   p.getProfesion();

    cannot find symbol

      symbol:   method getProfesion()

    


###### Downcasting


```Java
Trabajador t = (Trabajador) p;
```


```Java
t.getProfesion();
```




    Teleco en Telefónica



##### Upcasting y Doncasting con la clase Object


```Java
Object objetos[] = new Object[3];
```


```Java
objetos[0] = persona;
objetos[1] = "Hola";
objetos[2] = trabajador;
```




    Jaime(33)Teleco en Telefónica




```Java
objetos[0].getNombre()
```


    |   objetos[0].getNombre()

    cannot find symbol

      symbol:   method getNombre()

    


No se puede realizar un downcasting si el objeto al que apunta la referencia no es del tipo especificado


```Java
Trabajador t = (Trabajador) objetos[0];
```


    ---------------------------------------------------------------------------

    java.lang.ClassCastException: REPL.$JShell$18U$Persona cannot be cast to REPL.$JShell$19O$Trabajador

    	at .(#27:1)


Por ello, una buena práctica es preguntar por el tipo de objeto antes de hacer el downcasting


```Java
Trabajador t = null;
if(objetos[2] instanceof Trabajador)
    t = (Trabajador) objetos[2];
```


```Java
t.getNombre()
```




    Jaime




```Java
t.getProfesion()
```




    Teleco en Telefónica




```Java
for(int i=0;i<3;i++)
    System.out.println(objetos[i].toString());
```

    Luis(22)
    Hola
    Jaime(33)Teleco en Telefónica



```Java
p.toString()
```




    Jaime(33)Teleco en Telefónica




```Java
objetos[0].toString()
```




    Luis(22)



Por defecto el método println() va a buscar el método toString() de los objetos que recibe


```Java
System.out.println(p);
```

    Jaime(33)Teleco en Telefónica



```Java

```
