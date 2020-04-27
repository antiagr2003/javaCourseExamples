# ![](https://raw.githubusercontent.com/DavidContrerasICAI/javaCourseExamples/master/images/logo.jpg) Examen online de la convocatoria ordinaria
## Programación Orientada a Objetos
### Herramientas
#### OBS
Software de grabación de escritorio y fuentes externas (webcam y móvil) que grabará todo el examen en un fichero de vídeo .mkv. Este fichero deberá ser subido al finalizar el examen.

https://obsproject.com/es/download

#### Iriun Webcam (Windows)
Software que permite utilizar el móvil como segunda webcam.

- Software para el PC: https://iriun.com/. 
	- Se capturará el vídeo a 640x480. 
	- No será necesario que se arranque cada vez que iniciamos el equipo.
	- Posiblemente habrá que abrir el firewall para que se comunique con el móvil.
- Software para el móvil: Iriun Webcam for PC and Mac
	- Se conectará al software servidor anterior previamente ejecutado.

#### Epoc Webcam (Mac)
Software que permite utilizar el móvil como segunda webcam.

- Software para el PC: https://www.kinoni.com/
- Software para el móvil: EpocCam 

### Configuración de OBS en Windows

Repetir esta operación dos veces:
- a) Webcam del PC
- b) Webcam del Teléfono móvil

![](https://raw.githubusercontent.com/DavidContrerasICAI/javaCourseExamples/master/00.tools/OBS.jpg) 

Las fuentes que se deberán configurar serán:
- Captura de salida de audio (altavoces: lo que suena por los altavoces del PC)
- Captura de entrada de audio (micrófono: lo que hablamos nosotros)
- Captura de pantalla (el escritorio)
- Webcam del PC
- Webcam del Teléfono móvil

La calidad de salida del vídeo a generar (MKV) la de por defecto.

## Antes del Examen

### Escenario del examen
- Se deberá colocar el móvil en un lugar que permita visualizar CLARAMENTE la mesa y las manos del alumno.
- Además, deberá cubrir los alrededores de la mesa de trabajo. No servirá un primer plano de la mesa solamente, por ejemplo.
- No se deberá tener NADA sobre la mesa.
- No se podrán utilizar auriculares, se utilizarán los altavoces del ordenador.

![](https://raw.githubusercontent.com/DavidContrerasICAI/javaCourseExamples/master/00.tools/DesktopNew.jpg) 

### Validación del escenario
El alumno deberá grabar un vídeo corto de 1 minuto y subirlo a Moodle en la entrega "Prueba de escenario". El profesor deberá dar el VºBº a cada escenario que deberá ser idéntico al del día del examen.

## Resolución de problemas
### Pantalla de escritorio negra en OBS

Si desde OBS no puedo capturar el escritorio porque se ve todo negro, posiblemente sea porque se posee una tarjeta NVIDIA

Solución:
![](https://raw.githubusercontent.com/DavidContrerasICAI/javaCourseExamples/master/00.tools/OBSpantallaNegro.jpg)


## Examen

Solo se podrán tener las siguientes aplicaciones abiertas:
1. Sublime Text
2. Símbolo del sistema o consola del SO para compilar
3. Explorador de Windows o equivalente en otros sistemas para visualizar los archivos de una forma gráfica
4. Navegador (Chrome o equivalente) con una sola pestaña abierta a Moodle para descargar y subir el examen.


No se permitirá tener ninguna ventana más abierta ni se podrá consultar la API del compilador.