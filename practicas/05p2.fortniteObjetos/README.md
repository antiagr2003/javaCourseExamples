# Práctica de modelización de objetos
## Diseñar y programa una solución orientada a objetos

### Funcionalidad del juego

Se pide realizar un programa que modele el comportamiento del juego Fortnite.

El objeto principal de juego es el personaje, el cual es controlado por un usuario de la plataforma de juego. Es importante saber la vida que le resta al personaje para conocer cuando debe abandonar la partida. Esta vida puede poseer unos valores de 0 a 100, y su valor por defecto es 100. Además, el personaje puede recolectar una cantidad de material (no se controlará el tipo, solo la cantidad) después de picar construcciones del juego como árboles o casas.

Como se decía, existen dos tipos de construcciones: árboles y casa. Los árboles poseerán la información de la madera total que poseen (si es un árbol muy grande tendrá mucha madera) y la que se le resta por cada pico que recibe (si es un árbol de calidad, la cantidad de madera obtenida por pico será mayor). Por otro lado, las casas igualmente poseen una cantidad de material (casa grande, mucho material), pero la diferencia es que aquí se diferencia por tipo de material de construcción que estará tabulado (cerrado) a los siguientes materiales: MARMOL(30), LADRILLO(20), MADERA(10), OTROS(5). Entre paréntesis se detalla la cantidad de material que recolecta el personaje por cada pico. Se recuerda que, por simplificar, el personaje no diferencia entre tipo de material, solo alamcenará la cantidad de material.

Los personajes poseen armas para dispararse entre ellos. En función de la familiar de arma (escopeta, fúsil, subfúsil, ...) se podrá causar un daño u otro.

Estas armas pueden ser de dos tipos: las clásicas, que tienen un uso limitado, y las premium, que tienen un coste. 

Que tengan un uso limitado las armas clásicas significa que se desgastan después de una serie de disparos y ya no se pueden utilizar (no confunidir con el concepto de vaciar el cargador y quedarse si munición).

Toda arma en el juego debe tener un nombre (escopeta, fúsil, subfúsil, ...) y un número de balas que puede poseer en el cargador. Un arma sin balas no podrá disparar, al igual, que una desgastada por el uso excesivo, tampoco. Un arma sin balas podrá ser recargada siempre, siempre y cuando siga teniendo usos disponibles.

El número máximo de armas a portar en la mochila será de 5 y por defecto el personaje no poseerá ninguna. Además podrá agregar otras armas que se encuentre y dejar las que posee en el arsenal cuando lo desee.

El jugador debe saber en todo momento cuál de todas sus armas es la que tiene activada (en su mano). Podría estar picando un árbol, por ejemplo, y no tendría ninguna en la mano, por lo que no podría disparar. Por defecto, si se le da la orden de picar una construcción al personaje, dejará de poseer el arma en su mano (arma activada). La selección del arma se puede realizar por nombre o por número que ocupa en su arsenal (activo la "Escopeta" o el arma 3ª del arsenal).

El personaje podrá encontrar en el suelo objetos que le repercutan algún beneficio como un pack de munición (un número de balas para un arma en concreto) y un botiquin que le permita recuperar vida (número de vida a recuperar). Las balas que recoja se guardarán automáticamente en el cargador del arma que poseo. Si tengo una escopeta en el arsenal y cojo balas de fúsil, no se contabilizarán, ya que no las podré meter en el cargador de ese arma. 

### Consideraciones

Ojo porque posiblemente haya que realizar algún cambio respecto al modelo en la relación de objetos que veníamos desarrollando. Sed críticos con el diseño de partida.

### Se pide

- Realizar el diagrama de clases.
- Realizar un diagrama de paquetes.
- Programar los siguientes casos de uso:
        1. Crear dos personajes y meterlos en un array: The Grefg y Ampeter.
        2. Crear dos árboles y dos casas (madera y ladrillo)
        3. The Grefg 1 picará un árbol y una casa.
        4. Ampeter picará otro árbol y la otra casa.
        5. Crear dos armas (Escopeta clásica con 5 balas y Subfusil clásico con 10 balas).
        6. The Grefg cogerá la escopeta y Ampeter el subfusil.
        7. The Grefg disparará a Ampeter.
        8. The Grefg disparará 3 veces al aire (no le dará).
        9. The Grefg 1 disparará a Ampeter nuevamente en dos ocasiones. En estos momentos el arma de The Grefg no tendrá municiones, habrá gastado todas sus balas. 
        10. The Grefg 1 disparará a Ampeter. al no tener balas no podrá hacerle daño.
        11. Comprobar la vida de Ampeter y mostrala por pantalla.
        12. Ampeter recogerá un botiquín que le dará incrementará 30 de vida.
        13. The Grefg recogerá munición para su escopeta con dos balas más. Esta escopeta de The Grefg tendrá 2 balas ahora.
        14. Mostrar toda la información de los dos personajes y comprobar que está todo correcto.


### Especificaciones técnicas

#### Se deberá trabajar con enums

#### Instance of/downncasting

Se trabajará con la nueva forma de hacer downcasting en un paso:
```java
if(o instanceof Persona persona)
        return persona.getNif().equals(this.nif);
else
        return false;

```

#### Codicionales unarios

Se probará a trabajar con expresiones condicionales unarias en Java, muy parecidas a las que define Python:

##### Python

```python
>>> nombre = None
>>> nombreUpper = nombre.upper() if nombre != None else "UNNAMED"
>>> nombreUpper
'UNNAMED'
>>> nombre = "Luis"
>>> nombreUpper = nombre.upper() if nombre != None else "UNNAMED"
>>> nombreUpper
'LUIS'
```

##### Java
```java
String nombre = (nombre != null)?nombre.toUpperCase():"UNNAMED";

jshell> String nombre;
jshell> String nombreUpper = (nombre != null)?nombre.toUpperCase():"UNNAMED";
nombre ==> "UNNAMED"
jshell> nombre = "Luis";
jshell> String nombreUpper = (nombre != null)?nombre.toUpperCase():"UNNAMED";
nombre ==> "LUIS"
```
