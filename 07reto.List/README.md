# Reto List

Los List son estructuras de datos que permiten almacenar objetos respetando el orden de inserción, pudiendo trabajar además con índices.

Vamos a trabajar con dos tipos de List: ArrayList y LinkedList.

### Objetivo
Probar el rendimiento de las dos implementaciones de List: Array y Linked.

Para ello se realizarán unos tests de rendimiento para cada estructura y se deberá medir el tiempo que tarda Java en realizar las operaciones. 

Tests a ejecutar:
- Insertar 10 millones de objetos de tipo Persona (String nombre).
- Buscar un objeto concreto por contenido (contains(Object)).
- Buscar un objeto concreto por posición (get(int)).

### Resultados

Se deberá sacar las siguientes conclusiones:
- Collection más rápida para una gran número de inserciones.
- Collection más rápida en recorrer la estructura secuencialmente.
- Collection más rápida en el acceso directo.

Ejemplo de cómo acceder a la hora/fecha del sistema:

```java
import java.util.Date;

long tiempoIni = new Date().getTime(); //Devuelve la hora del sistema en milisegundos
//TEST A REALIZAR
long tiempoFin = new Date().getTime(); //Devuelve la hora del sistema en milisegundos
```
