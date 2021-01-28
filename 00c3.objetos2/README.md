# Definición de un objeto

## Objetivos

En la clase de hoy se han visto los siguientes conceptos básicos:
- Definición de objeto: atributos + métodos
- Concepto de ocultación de atributos.
- Concepto de interfaz de un objeto: métodos visibles para el resto de objetos.
- Visión de los 4 tipos de interfaces distintos que puede tener un objeto.
- Transición de Python a Java: compilación y sintáxis básica.

## Sintaxis básica

#### Python
```python
a = 2
a
```
2
```python
a = "2"
a
```
'2'
#### Java
```java
int numero = 2;
```
numero ==> 2

```Java
numero = "2";
```
|  Error:

|  incompatible types: java.lang.String cannot be converted to int

|  numero = "2";

|           ^-^


## Ejemplo de definición de un objeto básico

```java
/* Ejemplo de declaración de un "objeto" en 
   lenguaje de programación
   Java   */
class Persona
{
	//Atributos: siempre ocultos
	int edad; //por defecto 0

	//Métodos
	void setEdad(int unaEdad)
	{
		//if unEdad > 0 and unaEdad < 140:
		if (unEdad > 0 && unaEdad < 140)
		{
			edad = unaEdad;
		}
		else 
		{
			edad = 20;
		}
	}

	int getEdad()
	{
		return edad;
	}
}
```

## Interfaz del objeto y mensajes

El acceso directo a los atributos de un objeto:
```python
persona.edad = -22
```

La estructura de un mensaje es: objeto.método(). Trabajar a través de métodos que accedan al atributo es más engorroso, pero en muchos casos más seguro.

```java
persona.getEdad(); //--> 0
persona.setEdad(-22);
persona.getEdad(); //--> 20
persona.setEdad(33);
persona.getEdad(); //--> 33
```
