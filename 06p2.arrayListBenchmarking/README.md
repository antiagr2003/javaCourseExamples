## Práctica 06p2. Becnhmarking. Operaciones básicas en ArrayList

#### Se pide: 
Realizar un benchmarking que refleje el coste computacional (tiempo) que tienen las siguientes operaciones:
- Agregar elementos al final del ArrayList: se agregarán de 1 a 100 objetos Strings con el valores de la posición donde se agregarán ("1", "2", etc.). Método: **add(Object)**
- Eliminar objetos del ArrayList: desde la posición 1 hasta la 100 para ver si el coste el mismo. Método: **remove(int)**
- Insertar objetos en un ArrayList: se insertarán desde la posición 1 hasta la 100 para ver si el coste el mismo. Método: **add(int, Object)**
- Obtener objetos del ArrayList: desde la posición 1 hasta la 100 para ver si el coste el mismo. Método: **get(int)**

#### Ayuda: 

Una buena idea para hacer el benchmarking es generar una buena salida por pantalla para posteriormente copiarla a un Excel y generar una figura.

```bash
...

REMOVE

...

95, 0,0700
96, 0,0690
97, 0,0700
98, 0,0690
99, 0,0320

GET

0, 0,1870
1, 0,1510
2, 0,1500
3, 0,1490
...

```

Un método fácil y básico es tomar esta salida y copiarla seleccionando en la consola el texto. Posteriormente se pegará en una columna de la hoja y se harán una fórmulas facilonas para extraer los dos valores.

Para el primer valor, posición. Celda ROJA.
```excel
=VALOR.NUMERO(EXTRAE(A2;1;ENCONTRAR(", ";A2)-1))
```

Para el primer valor, tiempo. Celda AZUL.
```excel
=VALOR.NUMERO(EXTRAE(A2;B2+2;LARGO(A2)))
```

![Excel](excel.jpg)

Otro método sería guardar la salida como un fichero CSV e importarlo posteriormente desde Excel, para quién esté más familiariado con estos ficheros.




