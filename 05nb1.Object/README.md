
# Clase Object

https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html

Class Object is the root of the class hierarchy. Every class has Object as a superclass. All objects, including arrays, implement the methods of this class.

Methods:

* public String toString()

Returns a string representation of the object. In general, the toString method returns a string that "textually represents" this object. The result should be a concise but informative representation that is easy for a person to read. It is recommended that all subclasses override this method.

* public boolean equals(Object obj)

Indicates whether some other object is "equal to" this one.
The equals method implements an equivalence relation on non-null object references:

It is reflexive: for any non-null reference value x, x.equals(x) should return true.
It is symmetric: for any non-null reference values x and y, x.equals(y) should return true if and only if y.equals(x) returns true.
It is transitive: for any non-null reference values x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) should return true.
It is consistent: for any non-null reference values x and y, multiple invocations of x.equals(y) consistently return true or consistently return false, provided no information used in equals comparisons on the objects is modified.
For any non-null reference value x, x.equals(null) should return false.
The equals method for class Object implements the most discriminating possible equivalence relation on objects; that is, for any non-null reference values x and y, this method returns true if and only if x and y refer to the same object (x == y has the value true).

Note that it is generally necessary to override the hashCode method whenever this method is overridden, so as to maintain the general contract for the hashCode method, which states that equal objects must have equal hash codes.

Parameters:
obj - the reference object with which to compare.
Returns:
true if this object is the same as the obj argument; false otherwise.

## Object es la superclase de todas las clases Java

Toda clase definida en Java hace un extends de la clase Object implícitamente


```Java
class Persona extends Object
{

}
```


```Java
Persona p = new Persona();
p instanceof Object;
```




    true



Por ese motivo, no se explicita y se omite


```Java
class Persona
{       
    String nombre;
    int edad;
    
    Persona(String nombre, int edad) 
    {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    String getInfo()
    {
        return "Nombre: " + nombre + "\nEdad: " + edad;
    }
}
```


```Java
Persona p = new Persona("Luis", 22);
p instanceof Object;
```




    true



## Método _public String toString()_


```Java
Persona p1 = new Persona("Alejandro", 36);
p1.getInfo();
```




    Nombre: Alejandro
    Edad: 36



Si llamamos al método toString() de la clase Persona, al no estar redefinido, se toma la implementación genérica que hereda de la clase Object. Ojo que en la salida por consola, no se muestra el prefijo *REPL.$JShell$20V$* que muestra en Jupyter


```Java
p1.toString();
```




    REPL.$JShell$20V$Persona@4719ed98




```Java
class Persona
{ 

    String nombre;
    int edad;
    
     Persona(String nombre, int edad) 
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString()
    {
        return "\nNombre: " + nombre + "\n"
        +"Edad: " + edad;
    }
}
```


```Java
Persona p2 = new Persona("Luis", 22);
p2.toString();
```




    
    Nombre: Luis
    Edad: 22



Dado que el método _toString()_ es el encargado de convertir cualquier objetoa una cadena de caracteres, es el utilizado por muchos objetos Java para ser invicado pro defecto. Por ejemplo, en el caso de mostrar información por consola.


```Java
System.out.println(p2.toString())
```

    
    Nombre: Luis
    Edad: 22


Se podría sustituir por:


```Java
System.out.println(p2)
```

    
    Nombre: Luis
    Edad: 22


## Método *public boolean equals(Object o)*

A partir de este momento se utilizará el *operador ==* para comparar tipos primitivos de datos y el método equals() para comparar objetos

### Operador ==

Siempre se utilizará el == con los tipos de datos


```Java
int i1 = 34;
int i2 = 34;
i1==i2
```




    true




```Java
Persona p1 = new Persona("Manuel",22);
Persona p2 = new Persona("Manuel",22); 
```

Se obtiene _false_ porque aunque la información contenida sea la misma, los objetos apuntan a dos zonas de memoria distintas, por lo que se consideran objetos distintos.


```Java
p1==p2
```




    false



En la siguiente asignación se pierde el objeto al que apuntaba *p1* .


```Java
p1 = p2;
```

Como ahora p1 y p2 apuntan al mismo objeto en memoria, el operador *==* devolverá _true_.


```Java
p1==p2
```




    true



### equals

Hacemos un override del método equals perteneciente a la clase Object.
Ahora haremos la comparación de objetos con el método equals, con la llamada a: p1.equals(p2);
La comparación se realizará a partir de un atributo del objeto, por ejemplo el NIF, ya que este es único.
En la definición del método equals, llamaremos al método equals de la clase String(), el cual ya está definido y funciona correctamente.


```Java
class Persona
{ 
    String nif;
    String nombre;
    int edad;
    
    Persona(String nif, String nombre, int edad) 
    {
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    String getNif()
    {
        return nif;
    }
    
    @Override
    public String toString()
    {
        return "NIF: " + nif + "\nNombre: " + nombre + "\nEdad: " + edad;
    }
    
    @Override
    public boolean equals(Object obj) //Upcasting, el objeto que recibe lo vemos como un Objeto
    {
        if(obj instanceof Persona) //Si la instancia del objeto es una Persona...
        {
            Persona p = (Persona) obj; //Hacemos un downcasting (explícito) y bajamos el inyerfaz
            if (nif.equals(p.getNif())) //Llama al equals de String, que funciona correctamente
                return true;
            else
                return false;
        }
        else
            return false;
    }
}
```


```Java
Persona p1 = new Persona("11111","Manuel",22);
Persona p2 = new Persona("11111","Manuel",22);
```


```Java
System.out.println("Con el método equals: " + p1.equals(p2));
```

    Con el método equals: true


## Generalicación con el interfaz de Object


```Java
Object objetos[] = new Object[3];
```


```Java
objetos[0] = p1;
objetos[1] = "Hola";
objetos[2] = p2;
```




    NIF: 11111
    Nombre: Manuel
    Edad: 22




```Java
for(int i=0;i<objetos.length;i++)
    System.out.println(objetos[i].toString()+"\n------");
```

    NIF: 11111
    Nombre: Manuel
    Edad: 22
    ------
    Hola
    ------
    NIF: 11111
    Nombre: Manuel
    Edad: 22
    ------



```Java

```
