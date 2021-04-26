# Librerías externas: Calendario

Para trabajar con librerías externas debemos asegurarnos que nos hemos descargado el JAR correspondiente donde se encuentras sus clases.

```cmd
> dir

26/04/2021  10:39            33.887 jdatepicker-1.3.2.jar
26/04/2021  11:36             1.747 JVentanaCalendar.java
```
A continuación compilamos y ejecutamos indicándole a la JVM su ubucación y ampliando el CLASSPATH (-cp).

```cmd
> javac -cp .;jdatepicker-1.3.2.jar JVentanaCalendar.java
> java -cp .;jdatepicker-1.3.2.jar JVentanaCalendar
```