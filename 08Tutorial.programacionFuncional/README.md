# Programación Funcional en Java - Nivel Básico

## Introducción a los paradigmas de programación

### Imperativa:
- Dice cómo hacer las cosas. 
- Sentencias de código que expresan el fujo de programación.
- Tipos:
    - Programación procedural.
    - Programación orientada a objetos.
    - Programación paralela.

### Declarativa:
- Dice qué hacer.
- Expresa la lógica de un programa sin especificar su control de flujo.
- Expresiones o declaraciones en lugar de sentencias.
- Tipos:
    - Procesamiento de bases de datos (SQL).
    - Programación lógica.
    - Programación funcional (Haskell).


### Programación Funcional:
- Es una forma de programación declarativa.
- Trata la computación como la evolución de una función matemática y evita los cambios de estado y los datos mutables. Lo contrario a la programación a objetos.
- Los programas son vistos como la evaluación de funciones puras de transformación de datos. 

## Tipos de Funciones

### Funciones de primer orden

Los ciudadanos de primera en Java son los objetos, no las funciones. Por ese motivo, se dice que Java no soporta las funciones de primer orden. 

La forma que tiene Java de solucionar esto, es definiendo funciones como objetos, los cuales pueden ser gestionados como referencias a funciones y pueden ser pasadas como argumentos.

En otros lenguajes se puede ver lo siguiente:
- Javascript:
```javascript
var x = function (a, b) {return a * b};
x(2, 3);
```
- Python:
```python
def multiplicar(a, b):
    return a * b
x = multiplicar
x(2, 3)
```
- Scala:
```Scala
val x = (a: Int, b:Int) => a * b
x(2, 3)
```

### Funciones de orden superior

Cuando una función recibe otras funciones como parámetro, se la denomina de **orden superior**.

Muchos lenguajes nos proveen con una serie de funciones de orden superior para trabajar con estructuras de datos. De entre ellas, las más conocidas son map y reduce: la primera aplica la misma función sobre cada elemento de una colección, y la segunda acumula los elementos en un único valor según una función dada. Veamos un ejemplo:

### Recordando conceptos... 🥸

Hay que recordar como se trabajaba con métodos tipo Builder, aquellos que devuelven el mismo tipo en los que están declarados. Por ejemplo, como ocurría con la clase StringBuilder y sus métodos append.

Muchos métodos de la clase **Stream** devolverán nuevos Stream.


```Java
StringBuilder sb = new StringBuilder();
sb.append("A")
    .append("B")
    .append("C");
sb
```




    ABC



## Expresiones Lambdas y API Stream

Las **expresiones lambdas** son métodos/funciones sin nombre que pueden ser pasadas como argumentos de un método.

Están compuestas de uno o varios parámetros y un cuerpo que implementa su funcionalidad.

```
objeto.metodo(expresionLambdaComoArgumento)

objeto.metodo((args) -> {cuerpo})
```

Las expresiones lambdas se pueden aplicar a varios contextos Java: funcionalidades sobre streams (Predicate, Consumer, Function, ...), Single Abstract Methods (SAM), Functional Interfaces, etc.

👀 El **API Stream** permite generar una secuencia de elementos sobre los datos para tratarlos de forma funcional, permitiendo ejecutar métodos que pueden recibir como argumentos expresiones lambdas. Las operaciones realizadas sobre los streams generan nuevos streams y no modifican el original.

#### Ejemplo #1 de programación procedural (imperativa)


```Java
List<Integer> numeros = List.of(1,2,3,4,5,6);
for(int numero:numeros)
    System.out.print(numero + " ");
```

    1 2 3 4 5 6 

#### Ejemplo #1 de programación funcional (declarativa)

Se van pasando como argumentos la funcionalidad que se desea ejecutar sobre los datos inmutables.


```Java
List<Integer> numeros = List.of(1,2,3,4,5,6);
numeros.stream()
    .forEach(x -> System.out.print(x + " "));
```

    1 2 3 4 5 6 

#### Ejemplo #2 de programación procedural (imperativa)


```Java
List<Integer> numeros = List.of(1,2,3,4,5,6);
for(int numero:numeros)
    if(numero > 2)
    {
        numero *= 2;
        System.out.print(numero + " ");
    }
```

    6 8 10 12 

#### Ejemplo #2 de programación funcional (declarativa)

Se van pasando como argumentos la funcionalidad que se desea ejecutar sobre los datos inmutables.


```Java
List<Integer> numeros = List.of(1,2,3,4,5,6);
numeros.stream()
    .filter(x -> x > 2)
    .map(x -> x * 2)
    .forEach(x -> System.out.print(x + " "));
```

    6 8 10 12 

Los parámetros definidos en la expresión lambda podrían tipificarse, aunque como el origen de las funciones a ejecutar sobre los datos es la colección tipicada, puede omitirse y es el modo común de programar. No es habitual encontrarse con el siguiente código:


```Java
List<Integer> numeros = List.of(1,2,3,4,5,6);
numeros.stream()
    .filter((Integer x) -> x > 2)
    .map((Integer x) -> x * 2)
    .forEach((Integer x) -> System.out.print(x + " "));
```

    6 8 10 12 

### Encapsulando las lambdas en clases

Las acciones declaradas en las funciones lambdas puede ser de la complejidad/dimensión que se quiera.


```Java
List<Integer> numeros = List.of(1,2,3,4,5,6);
numeros.stream()
    .filter(x -> x > 2)
    .map(x -> { x *= 2;
                x /= 2;
                x += 1; 
                x -= 1;
                x *= 2;
                return x;
                })
    .forEach(x -> System.out.print(x + " "));
```

    6 8 10 12 

Por este motivo, cuando la implementación de la expresión lambda es compleja, se puede encapsular bajo métodos de una clase.


```Java
class UtilNumeros
{
    static int multiplicar(int numero)
    {
        numero *= 2;
        numero /= 2;
        numero += 1; 
        numero -= 1;
        numero *= 2;
        return numero;
    }

    static boolean filtrar(int numero)
    {
        return numero > 2;
    }

    static void imprimir(int numero)
    {
        System.out.print(numero + " ");
    }
}
```

Esta forma de llamar a los métodos (que ahora poseen la funcionalidad) dentro de la expresión lambda es la tradicional.


```Java
List<Integer> numeros = List.of(1,2,3,4,5,6);
numeros.stream()
    .filter(x -> UtilNumeros.filtrar(x))
    .map(x -> UtilNumeros.multiplicar(x))
    .forEach(x -> UtilNumeros.imprimir(x));
```

    6 8 10 12 

### Referencias a métodos como expresión lambda 👏

Como se puede ver, en el momento que añadimos código o encapsulamos la funcionalidad de las lambdas, la programación funcional pierde su esencia ya que llegamos a mezclar los paradigmas imperativo y declarativo.

Existe una forma de generar automáticamente la expresión lambda y es mediante la expresión **::** y las **referencias a métodos**.

En este caso se puede omitir tanto el argumento de la expresión lambda, como el que se pasará al método invocado.

Se pase de...

```java
filter(x -> UtilNumeros.filtrar(x))
```
a...
```java
filter(UtilNumeros::filtrar)
```


```Java
List<Integer> numeros = List.of(1,2,3,4,5,6);
numeros.stream()
    .filter(UtilNumeros::filtrar)
    .map(UtilNumeros::multiplicar)
    .forEach(UtilNumeros::imprimir);
```

    6 8 10 12 

#### Ejemplos de referencias a métodos


```Java
List<String> palabras = List.of("hola", "adiós");
palabras.stream()
    .map(x -> x.toUpperCase())
    .forEach(x -> System.out.println(x));
```

    HOLA
    ADIÓS
    


```Java
List<String> palabras = List.of("hola", "adiós");
palabras.stream()
    .map(String::toUpperCase)
    .forEach(System.out::println);
```

Más ejemplos...


```Java
List<Integer> lista = List.of(1,2,3,4);

lista.stream()
    .filter(x -> x < 3)            //Devuelve un stream
    .map(x -> x * 2)               //Devuelve un stream    
    .reduce(0, (x, y)  -> x + y); //Devuelve un número
```




    6




```Java
List<Integer> lista = List.of(1,2,3,4);

lista.stream()
    .filter(x -> x < 3)            //Devuelve un stream
    .map(x -> x * 2)               //Devuelve un stream    
    .reduce(0, Integer::sum);
```




    6



## Programación funcional con Collections

Algunas clases, como las colecciones, se han adaptado para soportar en su interfaz el paso de funciones lambda como argumentos.

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html

Nuevos métodos para trabajar con lambdas en las Collections:
- forEach(lambda)
- removeIf(lambda)

### Método forEach()

Como se puede ver con el ejemplo anterior, el código funcional resulta más elegante. Otras, sin embargo, dependerán del caso de uso en cuestión o de interpretaciones más subjetivas.

El plantear una solución declarativa requiere un análisis y diseño añadido respecto al enfoque step by step de la programación declarativa.

#### Versión procedural

Como en este caso no se alterará la lista inmutable, se puede trabajar con _List.of_.


```Java
Collection<String> listaNombres = List.of("Luis", "Javier", "Ana", "Marta", "Jaime");
for(String nombre:listaNombres)
    System.out.println(nombre);
```

    Luis
    Javier
    Ana
    Marta
    Jaime
    

#### Versión funcional


```Java
Collection<String> listaNombres = List.of("Luis", "Javier", "Ana", "Marta", "Jaime");
listaNombres.forEach(System.out::println);
```

    Luis
    Javier
    Ana
    Marta
    Jaime
    

### Método removeIf()

#### Versión procedural
Ojo, porque en este caso se convierte a un ArrayList y no se deja como una List, ya que la lista generada por List.of es inmutable y no se pueden eliminar elementos.


```Java
ArrayList<String> listaNombres = new ArrayList<>(List.of("Luis", "Javier", "Ana", "Marta", "Jaime"));
Iterator<String> it = listaNombres.iterator();
while(it.hasNext())
{
    String nombre = it.next();
    if(nombre.length()==3)
        it.remove();
}

listaNombres
```




    [Luis, Javier, Marta, Jaime]



#### Versión funcional 👏


```Java
ArrayList<String> listaNombres = new ArrayList<>(List.of("Luis", "Javier", "Ana", "Marta", "Jaime"));
listaNombres.removeIf(nombre -> nombre.length() == 3);
listaNombres
```




    [Luis, Javier, Marta, Jaime]



Si se hubiese implementado esta solución con Streams, se podría haber realizado con List inmutables, ya que las operaciones con streams siempre generan copias y no actúan sobre los datos originales.


```Java
List<String> listaNombres = List.of("Luis", "Javier", "Ana", "Marta", "Jaime");
listaNombres = listaNombres.stream()
        .filter(nombre -> nombre.length() != 3)
        .toList();
listaNombres
```




    [Luis, Javier, Marta, Jaime]



## Programación funcional con Mapas


```Java
Map<String, Integer> mapa = new HashMap<>();
mapa.put("Ana", 19);
mapa.put("Luis", 20);
mapa.put("Jaime", 21);
mapa.put("Marta", 22);
```

#### Versión procedural 


```Java
for(Map.Entry<String, Integer> entry:mapa.entrySet())
     System.out.println(entry.getKey() + " " + entry.getValue());
```

    Marta 22
    Ana 19
    Luis 20
    Jaime 21
    

#### Versión funcional 👏


```Java
mapa.forEach((k, v) -> System.out.println(k + " " + v));
```

    Marta 22
    Ana 19
    Luis 20
    Jaime 21
    


```Java
mapa.keySet()
    .forEach(System.out::println);
```

    Marta
    Ana
    Luis
    Jaime
    

### Mapas con Collections como valores 


```Java
HashMap<String, List<Integer>> campeonatos = new HashMap<>();
campeonatos.put("Madrid", List.of(1, 1, 1));
campeonatos.put("Barça", List.of(2, 2, 2));
campeonatos.put("Atlético", List.of(3, 3, 3));
```


```Java
campeonatos.values()
    .stream()
    .forEach(System.out::println);
```

    [2, 2, 2]
    [3, 3, 3]
    [1, 1, 1]
    


```Java
campeonatos.values()
    .stream()
    .flatMap(Collection::stream)
    .reduce(0, Integer::sum);
```




    18



## Arrays como Streams


```Java
String[] miArray = {"Hola", "como", "estás"};
Arrays.stream(miArray).forEach(System.out::println);
```

## Programación funcional con Switch

Las expresiones lambdas se están extendiendo a otras estructuras clásicas del lenguaje. 


```Java
String s = "ADIOS";

switch(s)
{
    case "HOLA" -> System.out.println("HELLO");
    case "ADIOS" -> System.out.println("BYE");
};
```

    BYE


## Programación funcional con Interfaces tipos SAM (Interfaces Funcionales)

Los tipos **Single Abstract Methods** (SAM) hacen referencia a interfaces con un solo método abstracto. Todos los tipos SAM se interpretarán como Interfaces Funcionales y su implementación podrá ser gestionada como una expresión lambda. Estos interfaces funcionales podrán llevar asociada la anotación @FunctionalInterface o no, pero como siempre, se aconseja etiquetarlo así para evitar futuros errores.

Por ejemplo, el interface Matemáticas podrá tener la anotación o no. En cualquier caso Java interfiere que cualquier tipo SAM es un interface funcional.


```Java
public interface Matematicas
{
    public int sumar(int x, int y);
}
```


```Java
@FunctionalInterface
public interface Matematicas
{
    public int sumar(int x, int y);
}
```

Pero en esta caso, ya no será un interface funcional al definir más de un método abstracto. No será un tipo SAM.


```Java
@FunctionalInterface
public interface Matematicas
{
    public int sumar(int x, int y);
    public int restar(int x, int y);
}
```


    |   @FunctionalInterface

    Unexpected @FunctionalInterface annotation

      Matematicas is not a functional interface

        multiple non-overriding abstract methods found in interface Matematicas

    


#### Versión procedural

La implementación procedural se puede realizar con la herencia de una clase de una forma clásica...


```Java
@FunctionalInterface
public interface Matematicas
{
    public int sumar(int x, int y);
}
```

Se podría hacer una implementación sobre una herencia de una clase:


```Java
class Operacion implements Matematicas
{
    @Override
    public int sumar(int x, int y)
    {
        return x + y;
    }
}
```


```Java
Matematicas m = new Operacion();
m.sumar(2, 3);
```




    5



O se puede realizar una implementación con clases anónimas sobre un interface...


```Java
Matematicas m = new Matematicas(){
        @Override
        public int sumar(int x, int y)
        {
            return x + y;
        }
    };
m.sumar(2, 3);
```




    5



#### Versión funcional

O se puede realizar la **implementación funcional**, mucho más sencillo y limpio. Aunque es importante saber qué hay por detrás...

La expresión lambda se realiza sobre el único método que existe en el interface Matemáticas. Recibirá dos argumentos y devolverá un entero.


```Java
Matematicas m = (x, y) -> x + y;
m.sumar(2, 3)
```




    5



### Programación funcional de tipos SAM con un problema más completo

#### Versión procedural


```Java
public interface Pintable
{
    public Object pintar();
}
```


```Java
public class PintarEspanyol implements Pintable
{
    public Object pintar()
    {
        return "ROJO";
    }
}

public class PintarColor implements Pintable
{
    public Object pintar()
    {
        return java.awt.Color.RED;
    }
}

public class PintarHexadecimal implements Pintable
{
    public Object pintar()
    {
        return "#FF0000";
    }
}
```


```Java
Pintable strPintable = new PintarEspanyol();
Pintable colorPintable = new PintarColor();
Pintable hexPintable = new PintarHexadecimal();

Collection<Pintable> pintables = List.of(strPintable, colorPintable, hexPintable);

for(Pintable pintable:pintables)
    System.out.println(pintable.pintar());
```

    ROJO
    java.awt.Color[r=255,g=0,b=0]
    #FF0000
    

#### Versión funcional


```Java
@FunctionalInterface
public interface Pintable
{
    public Object pintar();
}
```

Al ser interfaces funcionales, se pueden resolver como una lambda:


```Java
Pintable strPintable = () -> "ROJO";
Pintable colorPintable = () -> java.awt.Color.RED;
Pintable hexPintable = () -> "#FF0000";

Collection<Pintable> pintables = List.of(strPintable, colorPintable, hexPintable);

pintables.stream()
    .map(Pintable::pintar)
    .forEach(System.out::println);
```

    ROJO
    java.awt.Color[r=255,g=0,b=0]
    #FF0000
    

## Solución Java a las Lists Comprehension de Python

Aproximación en Java de este tipo de expresiones.

### Python

```python
lista = ["abc", "ab", "abcd"]
[x.upper() for x in lista if len(x) > 2]

[ABC, ABCD]
```


### Java


```Java
var lista = List.of("abc", "ab", "abcd");
lista.stream().filter(x -> x.length() > 2).map(x -> x.toUpperCase()).toList()
```




    [ABC, ABCD]


