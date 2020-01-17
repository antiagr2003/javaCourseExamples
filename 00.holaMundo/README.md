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



![alt text](https://raw.githubusercontent.com/DavidContrerasICAI/javaCourseExamples/master/00.holaMundo/configuracionPathEnConsola.png)

### Configuración en Windows

Configuración recomendable para persistir los cambios en el sistema, para que los cambios queden registrados para siempre.


![alt text](https://raw.githubusercontent.com/DavidContrerasICAI/javaCourseExamples/master/00.holaMundo/configuracionPathEnWindows.png)


## Configuración de acentos

![alt text](https://raw.githubusercontent.com/DavidContrerasICAI/javaCourseExamples/master/00.holaMundo/acentos.png)