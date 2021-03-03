# Clase String

https://docs.oracle.com/javase/9/docs/api/java/lang/String.html

La clase String representa cadenas de caracteres. Todas las combinaciones de palabras y caracteres, como “Hola, soy Álex”, o simplemente, “abc”, se implementan con instancias de esta clase.

Los Strings son inmutables, es decir, sus valores no se pueden modificar una vez se crean. Sin embargo, existen otras clases como StringBuffer o StringBuilder que, como veremos más adelante, que sí lo son.

La clase String incluye métodos para examinar caracteres individuales de la cadena, para comparar strings, buscar strings, extraer partes de un string para crear substrings, y para crear una copia exacta de un string poniendo todos sus caracteres como mayúsculas o minúsculas.

Java ofrece una ayuda especial para la concatenación, unión, de strings con el operador (+), que también sirve para la conversión de objetos a strings. 

Es importante destacar que un objeto String creado a partir de un argumento nulo en el constructor provocará un error NullPointerException.


### Definición de objetos String


```Java
String s1 = "Madrid";
String s2 = "Barcelona";
String s3 = "Valencia";
```

### Operaciones básicas


```Java
String concatenacion = s1 + ", " + s2 + ", " + s3;
```


```Java
concatenacion
```




    Madrid, Barcelona, Valencia



### Métodos básicos


```Java
s1
```




    Madrid




```Java
String nuevoString = s3.concat(" Club de Fútbol");
nuevoString
```




    Valencia Club de Fútbol



Devuelve la longitud de la cadena


```Java
s1.length();
```




    6



Devuelve el caracter de la posición indicada (0 a n)


```Java
s1.charAt(4); 
```




    i



Formateo mediante el método de clase


```Java
String.format("%s tiene %d años", "Luis", 22)
```




    Luis tiene 22 años




```Java

```


```Java
String cadena = "Hola esto es un ejemplo";
for(String s:cadena.split(" ")) 
    System.out.println(s);
```

    Hola
    esto
    es
    un
    ejemplo
    

#### indent(int)


```Java
String cadena = "Hola esto es un ejemplo";
cadena;
```




    Hola esto es un ejemplo




```Java
cadena.indent(2);
```




      Hola esto es un ejemplo
    




```Java
String cadena = "Hola\nesto\nes\nun\nejemplo";
cadena;
```




    Hola
    esto
    es
    un
    ejemplo




```Java
cadena.indent(2);
```




      Hola
      esto
      es
      un
      ejemplo
    



#### replace() vs replaceAll()


```Java
String cadena = "Hola esto es 1 ejemplo";
cadena.replace("o", "O")
```




    HOla estO es 1 ejemplO




```Java
cadena.replaceAll("\\s", "_")
```




    Hola_esto_es_1_ejemplo




```Java
cadena.replaceAll("\\d", "_")
```




    Hola esto es _ ejemplo




```Java
cadena.replaceAll("[0-9]", "_")
```




    Hola esto es _ ejemplo



#### Reto
---
Elimina los espacios en blanco de la palabra palabra " hola ", extrae los 3 primeros caracteres, conviértelos a mayúsculas y quédate con el segundo caracter: 'O'


```Java

```

### Particularidades de los objetos String

Los objetos String, además de ser objetos inmutables, tienen la particularidad de pdoer crearse de dos formas:
- Mediante el constructor, como el resto de objetos: en este caso la reserva de memoria se realiza de forma estándar.
- Mediante la asignación básica (=) y la utilización de las comillas dobles.

#### Constructor


```Java
String s1 = new String("Hola");
String s2 = new String("Hola");
```

En este caso se habrán creado dos instancias de la clase String, dos reservas de memoria, como con el resto de objetos. Hay que recordar que el operador ==, en el caso de trabajar con objetos, responde a si físicamente dos objetos apuntan a la misma zona de memoria.


```Java
s1==s2
```




    false



Por tanto, para comparar objetos siempre utilizaremos el método equals.


```Java
s1.equals(s2)
```




    true



#### Asignación directa

En el caso de utilizar el operador de asignación, la forma de creación será distinta. Los objetos String creados así se guardarán en una zona de memoria especial a forma de constantes (pila de constantes). Cada vez que se haga refencia a ese objeto, se referenciará y no se volverá a crear.


```Java
String s1 = "Hola"
```

La línea anterior crea el objeto String "Hola" en la pila. Si volviéramos a crear nuevamente una referencia con el mismo valor, se hara referencia al mismo objeto, misma posición de memoria.


```Java
String s2 = "Hola"
```


```Java
s1==s2
```




    true




```Java

```
