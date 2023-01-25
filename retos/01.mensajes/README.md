# Reto 1. Obtener información del objeto

## Se pide
Trabaja con la clase App que se suministra y amplia la siguiente funcionalidad:
- Crea un método en Personaje llamado **disparar** que dispare a oro personaje.
- Este método restará vida al personaje disparado según el siguiente criterio:
	+ Si le dispara con un pistola, tendrá un 50% de herir al contrario quitándole 10 de vida.
	+ Si le dispara con una escopeta, un 50% quitándole 20 de vida.
- Crear un nuevo método llamado **herir(int cantidaVida)**.

## Salida por pantalla
- Como la probabilidad de acertar no es 1, habrá veces que no se impacte en el contrario. Se debe recoger el número de intentos y la vida final del personaje .
```cmd
> java App
Disparo #1
Disparo #2
Disparo #3
Le di!
Vida de Personaje 2: 90
```

## Ayuda
- Generación de un número aleatorio:
```java
double aleatorio = Math.random();
//aleatorio tendrá un valor en el rango [0, 1)
```
- Definición de condicionales:
```java
if (arma == null)
{
	System.out.println("No tiene arma");
}
else if (arma == "Pistola")
{
	System.out.println("Pistola");
}
else
{
	System.out.println("Otra");	
}
```
- Definición de un bucle while:
```java
int contador = 0; 
while (contador < 4)
{
	System.out.println(contador);
	contador += 1; //contador++;
}
```

