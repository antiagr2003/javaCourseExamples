# Novedades de Java

## Collections

#### Colecciones no tipificadas


```Java
ArrayList lista = new ArrayList();
lista.add(1);
lista.add(2);
lista.add(3);
lista.add(4);
lista.add("Hola");
```




    true




```Java
lista
```




    [1, 2, 3, 4, Hola]




```Java
int suma = 0;
for(Object o:lista)
    if (o instanceof Integer numero)
        suma += numero;
System.out.println(suma);
```

    10


#### Colecciones tipificadas

Solo se admiten los <'E'> elementos permitidos en su definición.


```Java
ArrayList<Integer> lista= new ArrayList<Integer>();
lista.add(1);
lista.add(2);
lista.add(3);
lista.add(4);
```




    true




```Java
int suma = 0;
for(int numero:lista) //Autoboxing
    suma += numero;
System.out.println(suma);
```

    10


#### Creación de colecciones

Genera una lista inmutable de elementos


```Java
List<Integer> lista = List.of(1,2,3,4);
```


```Java
lista
```




    [1, 2, 3, 4]



## Argumentos variables (var args)

Hasta ahora, la forma de recibir diferente número de argumentos era sobrecargando los métodos.


```Java
class Util
{
    static int sumar(int numero1, int numero2)
    {
        return numero1 + numero2;
    }
    
    static int sumar(int numero1, int numero2, int numero3)
    {
        return sumar(numero1, numero2) + numero3;
    }
    
    static int sumar(int numero1, int numero2, int numero3, int numero4)
    {
        return sumar(numero1, numero2, numero3) + numero4;
    }   
}
```


```Java
Util.sumar(1, 2);
```




    3




```Java
Util.sumar(1, 2, 3);
```




    6




```Java
Util.sumar(1, 2, 3, 4);
```




    10



Con la aparición de los varargs podemos trabajar con infinitos argumentos. Éstos se almacenarán en un array para su procesamiento.


```Java
class Util
{
    static int sumar(int... numeros)
    {
        int suma = 0;
        for(int numero:numeros)
            suma += numero;
        return suma;
    }
}
```


```Java
Util.sumar(1, 2);
```




    3




```Java
Util.sumar(1, 2, 3);
```




    6




```Java
Util.sumar(1, 2, 3, 4);
```




    10



## Records: creación de clases de forma rápida

Hemos visto la manera formal de creación de clases. En algunas ocasiones necesitaremos clases muy básicas, de funcionalidad reducida, que queramos crear de una forma rápida: **records**.

Los records implementan los métodos _equals_ , _toString_ y _hashCode_.

También implenta automáticamente los getters en formato record, es decir, con los nombres únicamente del propio atributo:

```
persona.nombre()
```


```Java
public record Persona(String nombre, int edad){}
```


```Java
List<Persona> personas = List.of(new Persona("Luis", 22),
                                new Persona("Pepe", 10),
                                new Persona("Juan", 8));
```


```Java
personas
```




    [Persona[nombre=Luis, edad=22], Persona[nombre=Pepe, edad=10], Persona[nombre=Juan, edad=8]]




```Java
Persona persona = personas.get(0);
persona.nombre()
```




    Luis



Se podría personalizar a nuestro gusto


```Java
public record Persona(String nombre, int edad)
{
    int getEdad()
    {
        return edad;
    }
}
```


```Java
class Util
{
    static int sumar(Persona... personas)
    {
        int suma = 0;
        for(Persona persona:personas)
            suma += persona.getEdad();
        return suma;
    }
}
```


```Java
Util.sumar(new Persona("Luis", 22),
        new Persona("Pepe", 10),
        new Persona("Juan", 8));
```




    40




```Java
personas.stream()
        .mapToInt(x -> x.getEdad())
        .reduce(0, Integer::sum);
```




    40



## No tipificación de los objetos

Siguiendo la tendencia de muchos lenguajes de programación que no realizan una inferencia de tipos (Python) o que suprimen el tipo de la definición de variables, en Java se da la posibilidad de eliminar el tipo de la definición para simplificar el código. 

Para evitar los problemas derivados de la inferencia de tipos, Java solo permite definir variables así en el momento de creación del objeto, es decir, no permite definir solo variables sin tipo ni declararlas como parámetros (que sería lo mismo).


```Java
var nombre = "Hola";
nombre.toUpperCase();
```




    HOLA




```Java
var i = 5;
i
```




    5




```Java
var lista = new ArrayList<Integer>();
lista.add(1);
lista.add(2);
lista.add(3);

lista.get(1);
```




    2




```Java
lista.getClass()
```




    class java.util.ArrayList



### Restricciones en el uso de _var_

No se permiten declarar objetos no tipificados cuando van acoompañados de la creación del objeto, es decir, no se puede inferir en tiempo de compilación. Este hecho hace la compilación segura. 

Este hecho no ocurre en Python, por ejemplo.


```Java
var lista;
lista = new ArrayList<Integer>();
```


    |   var lista;

    cannot infer type for local variable lista

      (cannot use 'var' on variable without initializer)

    



```Java
class Clase
{
    var atributo;

    void metodo(var a)
    {
        a = 4;
    }
}
```


    |       var atributo;

    'var' is not allowed here

    

    |       void metodo(var a)

    'var' is not allowed here

    


## Programación Imperativa


```Java
List<Integer> lista = List.of(1,2,3,4);
```


```Java
for(int i:lista)
    if(i < 3)
        System.out.println(i*2);
```

    2
    4
    

## Programación Declarativa

Mas adelante profundizaremos sobre esta forma de programación.


```Java
lista.stream()
     .filter(x -> x<3)
     .map(x -> x*2)
     .forEach(x -> System.out.println(x));
```

    2
    4
    


```Java

```
