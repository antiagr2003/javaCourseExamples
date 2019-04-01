
# Escapados de caracteres


```Java
String texto = "Y el alumno dijo: "¿Cómo se pueden incluir comillas dentro de un String?""
```


    |   String texto = "Y el alumno dijo: "¿Cómo se pueden incluir comillas dentro de un String?""

    illegal character: '\u00bf'

    



```Java
String texto = "Y el alumno dijo: \"¿Cómo se pueden incluir comillas dentro de un String?\""
```


```Java
texto
```




    Y el alumno dijo: "¿Cómo se pueden incluir comillas dentro de un String?"




```Java
"El profesor respondió: \"de la misma manera que un tabluador \t o un retorno de carro \n o incluso que un backspace \\ \" "
```




    El profesor respondió: "de la misma manera que un tabluador 	 o un retorno de carro 
     o incluso que un backspace \ " 



Hay qeu recordar la forma de trabajar con char en codificación UTF-16


```Java
char c = '\u0061';
```


```Java
c
```




    a




```Java

```
