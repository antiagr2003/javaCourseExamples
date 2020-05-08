# Utilización de librerías de terceros

## Jsoup como librería para Webscraping y JFreeChart para generación de gráficos

### Compilación y ejecución en Windows
```java
javac -cp .;lib\jcommon-1.0.23.jar;lib\jfreechart-1.0.19.jar;lib\jsoup-1.13.1.jar covid19\JVentana.java 
java -cp .;lib\jcommon-1.0.23.jar;lib\jfreechart-1.0.19.jar;lib\jsoup-1.13.1.jar covid19.JVentana 
```
### Compilación y ejecución en Linux o Mac
```java
javac -cp .:lib/jcommon-1.0.23.jar:lib/jfreechart-1.0.19.jar:lib/jsoup-1.13.1.jar covid19/JVentana.java 
java -cp .:lib/jcommon-1.0.23.jar:lib/jfreechart-1.0.19.jar:lib/jsoup-1.13.1.jar covid19.JVentana 
```