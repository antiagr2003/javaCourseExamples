# Reto Mensajes

## Invocación de métodos de instancia y de clase

La filosofía de la Programación Orientada a Objetos es que cada objeto sea experto proporcionando la funcionalidad específica mediante los métodos. 

Yo: "Objeto String, ¿qué eres capaz de hacer?"
Objeto String: "Éste es mi interfaz (conjunto de métodos disponilbles para ti), ejecuta el que más te guste"
Yo: objetoString.método()

```java
String nombre = "Luis";
String nombreMayusculas = nombre.toUpperCase();
```

En muchos casos encontraremos funcionalidad relacionada con una clase que no opera sobre ningún objeto en particular. Esta funcionalidad la encontraremos definida como métodos de clase. Serán operaciones globales a todos los objetos String.

```java
String numeroConvertido = String.valueOf(12);
```

Cuando Java quiere agrupar una funcionalidad del mismo tipo y no tiene muy claro sobre qué tipo de objeto asociarla, define esa funcionalidad de forma estática, como métodos de clase. Un ejemplo de ello es la clase Math: son operaciones a realizar sobre tipos primitivos de datos. Se podrían definir en la clase Number, como suoerclase de todos los Wrappers, pero nos obligaría a convertir todos los tipos primitivos a objetos para poder utilizarlas.

```java
double grados = Math.abs(-45);
double radianes = Math.toRadians(grados);
double coseno = Math.cos(radianes)
```

## Utilización de atributos de clase como ayuda

También hemos visto como lso atributos de clase se suelen utilizar para establecer valores globales a todos los objetos que nos ayudan a realizar ciertas operacione.

En este caso evitamos escribir a fuego valores críticos de los objetos:

```java
public class Persona
{
	public static final int EDAD_MIN = 0; 
	public static final int EDAD_MAX = 120; 
	...
} 
```

Cuando queremos acceder a estos valores desde el exterior, App por ejemplo, podemos hacerlo directamente porque al ser constantes se puede hacer públicos.

```java
public static void main(String args[])
{
	int a = Persona.EDAD_MAX;
} 
```

Esto ocurre con mucha frecuencia con muchas clases de Java.
```java
Integer.MAX_VALUE;
```

El valor que representan muchos de estos atributos es lo de menos, podrían ser 15, 40 ó 37. Lo importante es la semántica que aporta y que todos los objetos lo consumen de la misma manera (empleando su definición) en lugar de su valor en sí.

Se dice que lo de menos es el valor, porque yo evaluaré si la persona está dentro del rango máximo, preguntando por su atributo, sin preocuparme su valor.

```java
if(edad<Persona.EDAD_MAX)
	this.edad = edad;
```

```java
if(teclaPulsada==KeyEvent.VK_ENTER)
	this.validarCajaTexto();
```

Cuando el día de mañana cambie esa edad máxima o el valor interno de la tecla ENTER, el programa seguirá funcionando porque nadie trabaja con su valor interno.

### Objetivo del reto

Mostrar por consola, solo a título informativo, el valor de ciertos atributos de clase (alias o información de ayuda). 
- Valor ASCII de la tecla ENTER.
- Valor ASCII de la tecla ESCAPE.
- Valor del atributo NORTH de la clase BorderLayout.
- Valor del atributo BOLD de la clase Font.
- Valor del atributo EXIT_ON_CLOSE del interface WindowConstants.

