# ![](https://raw.githubusercontent.com/DavidContrerasICAI/javaCourseExamples/master/images/logo.jpg) Examen online de la convocatoria ordinaria de Programación Orientada a Objetos

## Antes del Examen

### Escenario del examen
- Comprobar que OBS está perfectamente configurado y posee un layout aproximado a lo que se recomienda:
- Comprobar que los ficheros que genera OBS están por debajo de los 500MB. Lo normal es que pese unos 300MB.
- El plano desde el móvil deberá permitir visualizar CLARAMENTE la mesa y las manos del alumno. Deberá cubrir los alrededores de la mesa de trabajo. No servirá un primer plano de la mesa solamente, por ejemplo.
- Solo se permitirá tener sobre la mesa una hora y un boli/lápiz para tomar notas.
- No se podrán utilizar auriculares, se utilizarán los altavoces del ordenador.

![](https://raw.githubusercontent.com/DavidContrerasICAI/javaCourseExamples/master/99.examenOnline/DesktopNew.jpg) 

### Validación del escenario
El alumno deberá grabar un vídeo corto de 1 minuto y subirlo a Moodle en la entrega "Prueba de escenario". El profesor deberá dar el VºBº a cada escenario que deberá ser idéntico al del día del examen.

## Resolución de problemas

### Pantalla de escritorio negra en OBS

Si desde OBS no puedo capturar el escritorio porque se ve todo negro, posiblemente sea porque se posee una tarjeta NVIDIA. Cuando se poseen varias tarjetas en el ordenador, las NVIDIA suelen dar problemas y el programa OBS debe utilizar la otra tarjeta. 

Solución:
![](https://raw.githubusercontent.com/DavidContrerasICAI/javaCourseExamples/master/99.examenOnline/OBSpantallaNegro.jpg)

### Error de Codificación del archivo de salida: ENCODER

Si muestra un error relativo a la codificación (similar a este NV_ENC_ERR_INVALID_VERSION), activad la codificación del archivo de salida por Software. Inicialmente se elegirá la opción de Software (x264). Si el ordenador fuese muy lento, se elegiría la opción Software (x264 bajo uso de CPU….).

Solución:
![](https://raw.githubusercontent.com/DavidContrerasICAI/javaCourseExamples/master/99.examenOnline/OBSEncoder.jpg)


### En Mac no encuentro la cámara de Iriun

Me aseguro de ejecutar el programa IriunWebCam antes de iniciar OBS.

Si me sigue sin funcionar, ejecutar QuickTimePlayer:
1. Seleccionar File --> New Movie Recording
2. En el menú próximo al botón de grabar, seleccionar Iriun Webcam.


## Examen

Solo se podrán tener las siguientes aplicaciones abiertas:
1. Sublime Text
2. Símbolo del sistema o consola del SO para compilar
3. Explorador de Windows o equivalente en otros sistemas para visualizar los archivos de una forma gráfica
4. Navegador (Chrome o equivalente) con una sola pestaña abierta a Moodle para descargar y subir el examen.


No se permitirá tener ninguna ventana más abierta ni se podrá consultar la API del compilador.