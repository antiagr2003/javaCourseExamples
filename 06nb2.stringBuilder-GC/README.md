
# StringBuilder y Garbage Collection

## StringBuilder


```Java
public class Persona
{
    private String nombre;
    private int edad;
    
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
        //return nombre + "(" + edad + ")"; 
        StringBuilder sb = new StringBuilder();
        
        //Opción 1: 
        sb.append(nombre);
        sb.append("(");
        sb.append(edad);
        sb.append(")");
        
        //Opción 2: 
        //sb.append(nombre).append("(").append(edad).append(")");
        
        //Opción 3 (estético): 
        /* 
        sb.append(nombre)
          .append("(")
          .append(edad)
          .append(")");
        */
        return sb.toString();
    }
}
```


```Java
Persona p1 = new Persona("Luis", 22);
```


```Java
p1.toString()
```




    Luis(22)



## Garbage Collection


```Java
long memory1 = Runtime.getRuntime().freeMemory()
```


```Java
Persona p1 = new Persona("Luis", 22);
Persona p2 = new Persona("Luis", 22);
Persona p3 = new Persona("Luis", 22);
Persona p4 = new Persona("Luis", 22);
Persona p5 = new Persona("Luis", 22);
```


```Java
long memory2 = Runtime.getRuntime().freeMemory()
```


```Java
"Memoria utilizada: " + (memory2-memory1)
```




    Memoria utilizada: -14031944




```Java
Persona p1 = null;
Persona p2 = null;
Persona p3 = null;
Persona p4 = null;
Persona p5 = null;
```


```Java
long memory3 = Runtime.getRuntime().freeMemory()
```


```Java
"Memoria utilizada: " + (memory3-memory2)
```




    Memoria utilizada: -22265712




```Java
System.gc()
```


```Java
long memory4 = Runtime.getRuntime().freeMemory()
```


```Java
"Memoria liberada: " + (memory4-memory3)
```




    Memoria liberada: 41483504




```Java

```
