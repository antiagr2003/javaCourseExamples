# Bucles y estructuras de control

Documentación:
- https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
- https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html

Los bucles se utilizan para ejecutar un conjunto de instrucciones varias veces basándose siempre en una condición que decidirá si se sigue repitiendo o no. Los bucles que vamos a estudiar son los bucles for, while y do-while ya vistos anteriormente en otros lenguajes.

Bucle for permite ejecutar el conjunto de sentencias escritas en él en un número determinado de veces, el cual está fijado a principio del bucle y funciona al igual que un contador. Su expresión típica es:

```java
for(inicialización del índice;condición booleana;incremento del índice)
{
    sentencias
}
```

El bucle while ejecuta las instrucciones de las llaves mientras la condición sea verdadera. Un bucle while viene definido por:

```java
while(condición booleana)
{
    sentencias
}
```

Finalmente, el bucle do-while es idéntico al while, solo que en este caso la condición se evalua al final del bucle, por lo que el conjunto de sentencias incluido en las llaves se ejecuta al menos una vez. La forma de este bucle es:

```java
do
{
    sentencias
}while(condición booleanda);_
```

## Ejemplo de bucle for


```Java
for (int i=0; i <10; i++)
{
    System.out.println("el valor de i es: " + i);
}
```

    el valor de i es: 0
    el valor de i es: 1
    el valor de i es: 2
    el valor de i es: 3
    el valor de i es: 4
    el valor de i es: 5
    el valor de i es: 6
    el valor de i es: 7
    el valor de i es: 8
    el valor de i es: 9
    

## Ejemplo de bucle while


```Java
int i=5;

String opcion = Leer.porTeclado();
int opc = Integer.parseInt(opcion);

while(opc != 9)
{
    i--;
}

System.out.println("¿Cúanto vale ahora i?");
System.out.println("El valor de i es: "+ i);
```

    ¿Cúanto vale ahora i?
    El valor de i es: 0
    

## Ejemplo de bucle do-while


```Java
int i=5;

do 
{
    i--;
}while(i > 0 );

System.out.println("¿Cúanto vale ahora i?");
System.out.println("El valor de i es: "+ i);
```

    ¿Cúanto vale ahora i?
    El valor de i es: 0
    

### Ejemplo de estructura Switch


```Java
int entradaEntera = 3;
String entradaTexto = "tortuga";
switch(entradaTexto)
{
    case "perro":
        System.out.print("PERRO");
        break;
    case "gato":
        System.out.print("GATO");
        break;
    default:
        System.out.print("OTRO ANIMAL");
        break;        
}
```

    OTRO ANIMAL

Ejemplo anterior programado como un if


```Java
String entradaTexto = "tortuga";
if(entradaTexto.equals("perro"))
    System.out.print("PERRO");
else if(entradaTexto.equals("gato"))
    System.out.print("GATO");
else
    System.out.print("OTRO ANIMAL");
```

    OTRO ANIMAL
