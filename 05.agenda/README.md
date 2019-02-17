## Práctica 05. Java Básico. Paquetes, modificadores, equals, toString, modularidad y diseño 
### Crear una agenda que gestione personas.

#### Funcionalidad

Desarrollar un programa Java de consola (no gráfico) que muestre un menú al usuario proporcionando un conjunto de opciones. La opción introducida por el usuario se leerá por teclado gracias a la clase que se proporciona: Leer. Esta clase se almacenará en el paquete *practica05.util*.

![alt text](https://raw.githubusercontent.com/DavidContrerasICAI/javaCourseExamples/master/05.agenda/output.png)

Las opciones que se mostrarán al usuario para trabajar con la agenda, serán:

1. Crear ocurrencias de la clase Persona introduciendo la información por teclado. Posteriormente, se insertarán dichas ocurrencias en un array.
2. Buscar personas en dicho array, devolviendo la posición que ocupa. Para ello se pedirá la información necesaria para utilizar el método *public boolean equals(Object o)* declarado en Object. En este caso, sos persona serán iguales cuando coincida su DNI.
3. Eliminar una persona. Para esta acción, se reutilizará el código codificado en el punto anterior para localizar a lso objetos.
4. Mostrar el contenido del array. El número máximo de ocurrencias a crear será 10.

#### Diseño

![alt text](https://raw.githubusercontent.com/DavidContrerasICAI/javaCourseExamples/master/05.agenda/diagramaPaquetes.jpg)

El diseño de la aplicación estará compuesto por 3 capas: 
- La clase App de interfaz de usuario que se definirá en el paquete *practica05.ui*. Al poseer muchas líneas de código se modularizará en distintos métodos. La clase App deberá comunicarse con Agenda mediante objetos Persona ya encapsulados. Agenda, agrégame a esta persona, no agregame a un futuro objeto que tenga estos atributos.
- La clase que define la lógica de operaciones sobre las personas (inserciones, búsquedas, listados, etc.) se extraerán de la capa del interfaz y se implementarán en una clase Agenda, dentro de un paquete denominado *practica05.negocio*. La clase App será el consumidor de esta clase, de forma que si el día de mañana la clase App es cambiada por otro interfaz, la lógica de negocio del programa no se verá modificada. La persona poseerá un nombre, una edad y un NIF.
- La lógica de objetos definirá la lógica de la clase Persona (*practica05.dominio*).


Crear la estructura de paquetes necesaria dentro del paquete *practica05*, aplicando los modificadores de acceso correctos en cada caso.
