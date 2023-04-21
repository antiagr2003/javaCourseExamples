## Práctica 12 y última. Java Avanzado. Ficheros.
### Exportar e importar las figuras de un CSV.

#### Funcionalidad

Tomar como base la práctica anterior.

Exportar e importar los dibujos a ficheros ASCII compatibles por todas las aplicaciones separados por comas: CSV.

La estructura del archivo a crear será la siguiente:
```
Tipo Objeto, x, y, relleno, color.getRGB(), lado/radio
```


Por último, deberéis probad a importar este fichero a ver cuál es el resultado:
```
Circulo, 223, 125, true, -14629765, 301
Circulo, 211, 180, true, -4427753, 16
Circulo, 223, 191, true, -8254967, 12
Circulo, 230, 197, true, -9597360, 12
Circulo, 480, 106, true, -1754489, 131
Cuadrado, 276, 387, true, -3088392, 34
Cuadrado, 279, 416, true, -5897908, 26
Cuadrado, 266, 430, true, -14901128, 43
Cuadrado, 450, 385, true, -6723595, 30
Cuadrado, 445, 411, true, -4728994, 43
Cuadrado, 438, 448, true, -12148377, 31
Cuadrado, 460, 447, true, -7567623, 25
Cuadrado, 472, 450, true, -7719596, 17
Cuadrado, 477, 462, true, -6526159, 21
Circulo, 562, 141, true, -165605, 20
Cuadrado, 603, 159, true, -5572132, 23
Cuadrado, 623, 175, true, -6055082, 22
Cuadrado, 637, 184, true, -15096599, 29
Cuadrado, 662, 195, true, -10290904, 36
Cuadrado, 691, 193, true, -10799311, 32
Cuadrado, 715, 186, true, -11565820, 24
Cuadrado, 723, 177, true, -12376487, 26
Cuadrado, 735, 165, true, -179318, 16
Cuadrado, 742, 159, true, -1465045, 12
Circulo, 488, 100, true, -12416876, 21
Circulo, 488, 117, true, -9203344, 22
Circulo, 509, 122, true, -9372080, 21
Circulo, 484, 130, true, -4085385, 43
Circulo, 541, 179, true, -10700367, 9
Circulo, 507, 110, true, -4752476, 28
Circulo, 514, 146, true, -1389533, 26
Circulo, 489, 163, true, -11200284, 42
Circulo, 516, 167, true, -10649007, 38
Cuadrado, 573, 196, true, -10935609, 9
Cuadrado, 578, 204, true, -7348077, 7
Cuadrado, 584, 209, true, -5463323, 8
Cuadrado, 239, 25, true, -11631343, 34
Cuadrado, 240, 57, true, -1060680, 33
Circulo, 270, 26, true, -5110779, 37
Circulo, 337, 28, true, -9567513, 56
Circulo, 426, 33, true, -7439081, 43
Circulo, 422, 30, true, -12774435, 51
Cuadrado, 256, 25, true, -886850, 23
Cuadrado, 257, 50, true, -836154, 19
Cuadrado, 264, 46, true, -8101659, 17
Cuadrado, 264, 66, true, -11719637, 14
Cuadrado, 267, 79, true, -13765616, 13
Circulo, 272, 20, true, -6855277, 35
Circulo, 279, 30, true, -8584090, 32
Circulo, 429, 28, true, -13552909, 51
Circulo, 451, 47, true, -15299603, 32
Circulo, 422, 29, true, -10317504, 63
Circulo, 338, 30, true, -14076025, 56
Cuadrado, 602, 181, true, -5843085, 30
Cuadrado, 634, 197, true, -5840314, 18
Cuadrado, 628, 203, true, -16017509, 24
Cuadrado, 646, 215, true, -10889017, 27
Cuadrado, 651, 208, true, -4940295, 22
Cuadrado, 673, 221, true, -3330956, 24
Cuadrado, 695, 219, true, -1994385, 17
```

#### Diseño 

![output](output.jpg)
