

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



Para evitar problemas futuros, siempre se recomienda verificar el tipo de objeto antes de hacer un Downcasting


```Java
String s1 = "Hola";
Trabajador t = (Trabajador) s1;
```


    |   Trabajador t = (Trabajador) s1;

    incompatible types: java.lang.String cannot be converted to Trabajador

    

if(s1 instanceof Trabajador)
    t = (Trabajador) s1;