# Ficheros de texto: nueva funcionalidad

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/nio/file/Path.html

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/nio/file/Files.html


```Java
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
```

## Referencia a ficheros


```Java
Path fichero = Path.of("prueba.txt");
```

## Escritura de ficheros de texto 


```Java
Files.writeString(fichero, "1\n", StandardOpenOption.TRUNCATE_EXISTING);
```




    prueba.txt




```Java
Files.write(fichero, List.of("2", "3", "4"), StandardOpenOption.APPEND); 
```




    prueba.txt



## Lectura de ficheros de texto

### Ficheros pequeños


```Java
List<String> contenido = Files.readAllLines(fichero);
contenido.forEach(System.out::println);
```

    1
    2
    3
    4
    

### Ficheros grandes


```Java
BufferedReader reader = Files.newBufferedReader(path);
String linea;
while((linea = reader.readLine()) != null)
    System.out.println(linea);
```

    1
    2
    3
    4
    
