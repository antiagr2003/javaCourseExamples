
# Tipos de datos y Wrappers

## Tipos de datos
* Enteros:
byte – 8 bits – valor por defecto: 0
short – 16 bits – 0
int – 32 bits – 0
long – 64 bits – 0

* Reales en coma flotante:
float – 32 bits IEEE 754 – valor por defecto: +0.0f
double – 64 bits IEEE 754 – valor por defecto: +0.0d

* Booleanos:
boolean – valor por defecto: false

* Caracteres
char - 16 bits sin signo – valor pro defecto: ‘\u0000’
## Caracteres
Existe varias formas de crear un carácter:
‘a’ --> Carácter: Siempre utilizando la comilla simple.
‘\t’ --> Secuencia de escape: Tabulador.
‘ ‘\u????’ --> Carácter UNICODE en hexadecimal:La representación del carácter ‘A’ será ‘\u0041’.
65 --> Entero: Representación ASCII del carácter ‘A’.

Los caracteres poseen total compatibilidad con los tipos enteros:
char c='A';
int a=1 + c; --> a tiene el valor 66
char c2=(char)(1 + c); --> c2 tiene el valor ’B’.

Tabla de secuencias de escape:
'\n' Nueva línea
'\t' tabulación
'\b' retorno
'\r' salto de carro
'\f' salto de hoja
'\'' comilla simple
'\"' doble comilla
'\\' barra invertida

## Conversiones (Cast)

En Java podemos hacer conversitiones de un tipo de dato a otro, sin embargo se debe tener en cuenta en algunos casos se puede perder información en la conversión.

Cuando se produzca está situación deberemos indicarle de manera explícita al compilador el tipo al cual queremos convertir nuestro dato. De esta manera le estamos diciendo que "ya sabemos" que se puede perder información, en caso contrario se producirá un warning.

Existen dos tipos de conversión, implícita (siempre que no se produzca pérdida de información) y explícita (siempre que se produzca o se pueda producir pérdida de información).


### Cast implícito

En este caso no hay ningun problema puesto que el número de bits de un int (16), cabe perfectamente en un long (32), por lo que no se produce pérdida de información.


```Java
int i = 45;
long l = i;

System.out.println(i);
System.out.println(l);
```

    45
    45


### Cast explícito

En cambio, en el caso inverso, puede haber pérdida de información y así lo indica el compilador.


```Java
long l = 45;
int i = l;
```


    |   int i = l;

    incompatible types: possible lossy conversion from long to int

    


Para indicar al compilador que estamos asumiendo esta posible pérdida de información, pondremos entre paréntesis el tipo de dato al que queremos convertir.


```Java
long l = 45;
int i = (int) l;

System.out.println(i);
System.out.println(l);
```

    45
    45


Por defecto un número en coma flotante es un _double_


```Java
double d = 45.56;
```

Por ese motivo, la siguiente línea dará un error al poder perder información en el paso de un double a float:


```Java
float f = 45.56;
```


    |   float f = 45.56;

    incompatible types: possible lossy conversion from double to float

    


Para solucionar esta asignación básica:


```Java
float f = (float) 45.56;
```

o 


```Java
float f = 45.56F;
float f = 45.56f;
```

### Ejemplo


```Java
byte b = 45;
```


```Java
int i = b;
```


```Java
byte b2 = i;
```


    |   byte b2 = i;

    incompatible types: possible lossy conversion from int to byte

    



```Java
float f0 = 45.7;
```


    |   float f0 = 45.7;

    incompatible types: possible lossy conversion from double to float

    



```Java
float f1 = 45.7F;
```


```Java
float f2 = (float) 45.7;
```


```Java
float f3 = 45.7;
```


    |   float f3 = 45.7;

    incompatible types: possible lossy conversion from double to float

    



```Java
int i2 = 56; 
```


```Java
float f4 = i2;
```

### Ejemplo de caracteres


```Java
    char c1 = 65; //En binario 0100 0001
    char c2 = '\u0041'; //En hexadecimal 0100 -> 4 0001 -> 1 : 41
    char c3 = 'A'; 
    System.out.println(c1 + "/" + c2 + "/" + c3 );
    
    char c4 = (char) (c1 + 1);
    System.out.println(c4);
    
    for(int j=65;j<123;j++)
        System.out.println("Char: " + (char)j + " Valor ASCII: " + j);

```

    A/A/A
    B
    Char: A Valor ASCII: 65
    Char: B Valor ASCII: 66
    Char: C Valor ASCII: 67
    Char: D Valor ASCII: 68
    Char: E Valor ASCII: 69
    Char: F Valor ASCII: 70
    Char: G Valor ASCII: 71
    Char: H Valor ASCII: 72
    Char: I Valor ASCII: 73
    Char: J Valor ASCII: 74
    Char: K Valor ASCII: 75
    Char: L Valor ASCII: 76
    Char: M Valor ASCII: 77
    Char: N Valor ASCII: 78
    Char: O Valor ASCII: 79
    Char: P Valor ASCII: 80
    Char: Q Valor ASCII: 81
    Char: R Valor ASCII: 82
    Char: S Valor ASCII: 83
    Char: T Valor ASCII: 84
    Char: U Valor ASCII: 85
    Char: V Valor ASCII: 86
    Char: W Valor ASCII: 87
    Char: X Valor ASCII: 88
    Char: Y Valor ASCII: 89
    Char: Z Valor ASCII: 90
    Char: [ Valor ASCII: 91
    Char: \ Valor ASCII: 92
    Char: ] Valor ASCII: 93
    Char: ^ Valor ASCII: 94
    Char: _ Valor ASCII: 95
    Char: ` Valor ASCII: 96
    Char: a Valor ASCII: 97
    Char: b Valor ASCII: 98
    Char: c Valor ASCII: 99
    Char: d Valor ASCII: 100
    Char: e Valor ASCII: 101
    Char: f Valor ASCII: 102
    Char: g Valor ASCII: 103
    Char: h Valor ASCII: 104
    Char: i Valor ASCII: 105
    Char: j Valor ASCII: 106
    Char: k Valor ASCII: 107
    Char: l Valor ASCII: 108
    Char: m Valor ASCII: 109
    Char: n Valor ASCII: 110
    Char: o Valor ASCII: 111
    Char: p Valor ASCII: 112
    Char: q Valor ASCII: 113
    Char: r Valor ASCII: 114
    Char: s Valor ASCII: 115
    Char: t Valor ASCII: 116
    Char: u Valor ASCII: 117
    Char: v Valor ASCII: 118
    Char: w Valor ASCII: 119
    Char: x Valor ASCII: 120
    Char: y Valor ASCII: 121
    Char: z Valor ASCII: 122


## Wrappers

https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html
En Java tenemos un conjunto de clases que permiten trabajar con tipos de datos como si fuesen objetos.A estas clases se las denomina envoltorios o wrappers. Utilizaremos estas clases cuando tengamos que trabajar obligatoriamente con objetos. La correspondencia entre tipos y objetos se define a continuación:

int <--> Integer
boolean <--> Boolean
char <--> Character
double <--> Double
float <--> Float
long <--> Long
### Conversiones de tipo básico a Objeto:

Como en cualquier proceso de encapsulamiento, se invocará siempre al contructor del Wrapper correspondiente:
Se utilizarán los constructores de cada clase:
*  int a Integer: Integer(int a)
*  double a Double: Double(double a)
*  long a Long: Long(long a)
...

```Java
int entero = 15;
Integer integer = new Integer(entero);
integer
```




    15



### Conversiones de Objeto a tipo básico:
Se utilizarán los métodos tipoValue() de cada clase:
*  Integer a int: int intValue()
*  Double a double: double doubleValue()
*  Long a long: long longValue()
...

```Java
entero = integer.intValue();
entero
```




    15



### Conversiones entre diferentes tipos de datos básicos
Para hacer estas conversiones hay que utilizar las clases Wrapper del tipo destino a convertir:

Objeto a String: String toString()
String a Integer: static Integer valueOf(String s)
String a Float : static Float valueOf(String s)
String a int (en Integer): static int parseInt(String s)
String a float (en Float): static float parseFloat(String s)

```Java
String s = "34";
Long miLong = Long.valueOf(s);
miLong
```




    34



Si se desea convertir a int, busco en Integer.


```Java
String s = "7";
int a = Integer.parseInt(s);
s = String.valueOf(a);

System.out.println(s);
```

    7



```Java
char c;
Character ch= new Character('x');
c=ch.charValue();

System.out.println(c);
```

    x


## Autoboxing

A partir de la versión 1.5 Java introduce el concepto de Autoboxing: permite asignaciones directas entre tipos y sus Wrappers. Ojo, es obligatorio conocer este hecho ya que no tendrá sentido utilizar Wrappers en operaciones artiméticas o como atributos, aunque Java permita esta asignación.

En el siguiente caso la sentencia...


```Java
Integer miInteger = new Integer(34);
```

 equivaldría a la siguiente, haciéndose el encapsulado de forma implícita


```Java
Integer miInteger = 34;
```


```Java
int i = miInteger;
```

OJO: En el examen no está permitido utilizar Autoboxing

## Reto

Realizar las siguientes conversiones: 
54.6 --> float --> char --> Character --> String --> Integer --> int --> float
