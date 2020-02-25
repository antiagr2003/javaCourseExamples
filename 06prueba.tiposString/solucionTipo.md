char
```java
jshell> char c = 'a'
c ==> 'a'
```

String (1 caracter) 
```java
jshell> String s = String.valueOf(c)
s ==> "a"
```

String (2 car.) + String (3 car.) 
```java
jshell> s += "bc"
$8 ==> "abc"
```

Reemplazar el 2º caracter por el '9' 
```java
jshell> s = s.replace("b", "9")
s ==> "a9c"
```

Saber en qué posición está el '9' (char) 
```java
jshell> int pos = s.indexOf('9')
pos ==> 1
```

int
```java
int numero = Integer.parseInt(String.valueOf(s.charAt(pos)))
```

char (nos dará el '9')
```java
jshell> char c = String.valueOf(numero).charAt(0)
c ==> '9'
```

String
```java 
jshell> String strNueve = String.valueOf(charNueve)
strNueve ==> "9"
```

char 
```java
jshell> charNueve = strNueve.charAt(0)
charNueve ==> '9'
```

Comparar ese char con el '9'
```java
jshell> charNueve == '9'
$16 ==> true
```

Integer
```java
jshell> Integer.valueOf(String.valueOf(charNueve))
$17 ==> 9
```

int 
```java
jshell> int a = Integer.valueOf(String.valueOf(charNueve)).intValue()
a ==> 9
```

long 
```java
jshell> long l = a
l ==> 9
```

float
```java
jshell> float f = l
f ==> 9.0
```

Float
```java
jshell> Float.valueOf(f)
$21 ==> 9.0
```