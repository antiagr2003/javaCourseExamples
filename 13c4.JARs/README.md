# Creación de un fichero distribuible/empaquetable JAR

1.Generar un fichero que posea la información de la clase que contiene el método main. Crear un fichero MANIFEST.MF dentro de la carpeta META-INF.

Contenido del fichero META-INF\MANIFEST.MF:
```java
	Main-class: practica12.ui.JVentanaDibujo
```
2.Comprimir la carpeta/s de paquetes incluyendo la nueva carpeta META-INF en un ZIP.

3.Renombrar el ZIP a JAR poned el nombre que se quiera.

practica12.zip --> jpaint.jar

## Configuración avanzada

Posibilidad de indicar las dependencias de librerías.

```java
	Main-class: practica12.ui.JVentanaDibujo
	Class-Path: lib/jfreechart-1.5.0.jar lib/jsoup-1.13.1.jar
```

```java
	Main-class: practica12.ui.JVentanaDibujo
	Class-Path: lib/
```