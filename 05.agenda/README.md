## Práctica 05. Java Básico. Paquetes, modificadores, equals, toString, modularidad y diseño 
### Crear una agenda que gestione personas.

#### Funcionalidad

Desarrollar un programa Java de consola (no gráfico) que muestre un menú al usuario proporcionando un conjunto de opciones. La opción introducida por el usuario se leerá por teclado gracias a la clase que se proporciona: Leer. Esta clase se almacenará en el paquete *practica05.util*.

![alt text](https://raw.githubusercontent.com/DavidContrerasICAI/javaCourseExamples/master/05.agenda/output.png)

Las opciones que se mostrarán al usuario para trabajar con la agenda, serán:

1. Crear ocurrencias de la clase Persona introduciendo la información por teclado. Posteriormente, se insertarán dichas ocurrencias en un array.
2. Buscar personas en dicho array, devolviendo la posición que ocupa. Para ello se pedirá la información necesaria para utilizar el método *equals*. Dos persona son iguales cuando coincide su DNI.
3. Eliminar una persona. Para esta acción, se reutilizará el código codificado en el punto anterior para localizar a lso objetos.
4. Mostrar el contenido del array. El número máximo de ocurrencias a crear será 10.

#### Diseño

El diseño de la aplicación estará compuesto en 3 capas: interfaz de usuario (App), lógica de la agenda (Agenda) y lógica de objetos (Persona).

En la clase App, al haber un número importante de líneas de código, se modularizará en distintos métodos.

La clase Agenda concentrará la lógica de propia de la agenda: insertar, buscar, listar. El App, será el cliente de Agenda, la cual trabajará en última instancia con Persona. 

Crear la estructura de paquetes necesaria dentro del paquete *practica05*, aplicando los modificadores de acceso correctos en cada caso.
