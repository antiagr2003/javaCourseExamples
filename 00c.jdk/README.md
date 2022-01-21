# Configuración del JDK

## Configuración de la variable de entorno PATH

### Configuración en consola (CMD)
He instalado el JDK, pero en la consola escribo javac y no compila. 

Los cambios que se realizarán a continuación solo tendrán valor para esa sesión de la consola. Al cerrar esta ventana los cambios no quedarán guardados.

```bash
Z:\>javac
"javac" no se reconoce como un comando interno o externo,
programa o archivo por lotes ejecutable.

Z:\>set PATH=%PATH%;"C:\Program Files\Java\jdk1.7.0_01\bin"

Z:\>javac
Usage: javac <options> <source files>
where possible options include:
  -g                         Generate all debugging info
  -g:none                    Generate no debugging info
  -g:{lines,vars,source}     Generate only some debugging info
...
```

> Donde pone "C:\Program Files\Java\jdk1.7.0_01\bin", se deberá indicar la ruta donde se instaló el JDK en nuestro ordenador. Ojo, porque se debe añadir también el directorio BIN.



![alt text](https://raw.githubusercontent.com/DavidContrerasICAI/javaCourseExamples/master/00c.jdk/configuracionPathEnConsola.png)

### Configuración en Windows

Configuración recomendable para persistir los cambios en el sistema, para que los cambios queden registrados para siempre.


![alt text](https://raw.githubusercontent.com/DavidContrerasICAI/javaCourseExamples/master/00c.jdk/configuracionPathEnWindows.png)


## Configuración de acentos

La siguiente explicación no forma parte de la asignatura y es de un nivel medio-avanzado, por lo que si la lectura resulta compleja, mejor dejarla.


Windows emplea generalmente la tabla de codificación de caracteres widows-1252. Al ejecutar la JVM, Java detecta esa configuración y muestra la salida por la consola empleando dicha tabla.
El problema surge por la codificación específica que sigue la consola, que generalmente emplea la página de códigos CP850. Por ese motivo, no coinciden los caracteres empleados en código con los que representa Windows.

### Solución

1. Conocer la página de códigos (tabla de codificación) de la consola

```bash
    Z:\> mode con

    Estado para dispositivo CON:
    ----------------------------
    Líneas:              300
    Columnas:            80
    Ritmo del teclado:   31
    Retardo del teclado: 1
    Página de códigos:    850
```

2. Indicar a Java que debe utilizar esa tabla, en lugar de la tabla por defecto del sistema.

```bash
    Z:\> java -Dfile.encoding=cp850 HolaMundo
```    

![alt text](https://raw.githubusercontent.com/DavidContrerasICAI/javaCourseExamples/master/00c.jdk/acentos.png)