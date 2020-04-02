## Funciones Lambdas en Java

#### Collections e Iteradores
La forma tradicional de trabajar con colecciones utilizando bucles para procesarlas.

```java
 for(List<Integer> lista:listaMatriz)
    for(int numero:lista)
    {
        numero = numero * 2;
        if(numero > 10)
            suma += numero;
    }
```

#### Streams y Lambdas
Permite procesar datos de forma declarativa mediante pipelines, capaces de procesar de forma paralela sin utilizar programación basada en multithreading, empleando programación funcional y trabajar en modo lazy (planificación de tareas para optimizar la ejecución de código).

```java
suma = listaMatriz.stream()
            .flatMap(Collection::stream)
            .map(n -> n*2)
            .filter(n -> n > 10)
            .reduce(0, (sumaTemp, n) -> sumaTemp + n);
```