## Práctica 02. POO básico. Dibujo de más de 1 cuadrado. 
### Desarrollo de una clase básica trabajando con Arrays en un entorno gráfico.
Modificar la práctica 01 para que se puedan pintar varios cuadrados de forma simultánea sobre el dibujo.

Se añadirá una característica más a los cuadrados que será si son rellenos o no. Se deberá tener en cuenta que todos los cuadrados serán del mismo tipo, rellenos o no rellenos.

Se definirá el método wait de la clase Util correctamente, para que no se necesiten tener ocurrencias para invocarlo.

Se investigará en la API del JDK la forma de pintar rectángulos con relleno (https://docs.oracle.com/javase/9/docs/api/java/awt/Graphics.html).


##### Forma de realizar la práctica
1. Modificar las clases suministradas y las propias para que realice la funcionalidad solicitada. Se debe tener en cuenta que se deben compilar todas las clases. Por lo general compilando la clase App se deberían compilar todas clases, pero si en algún caso no fuera así compilar con:
```
javac *.java
```

##### Salida del programa
* AppDibujo01: Crear tres cuadrados y pintarlos.
* AppDibujo02: Crear tres cuadrados y pintarlos uno a uno esperando un segundo entre cada acción de pintar. El resultado debe ser el mismo que en el App anterior, pero con una pausa entre cada cuadrado pintado. Al final deberán aparecer tres cuadrados.

![alt text](https://raw.githubusercontent.com/DavidContrerasICAI/javaCourseExamples/master/02.arrayCuadradosDibujo/output.jpg)


