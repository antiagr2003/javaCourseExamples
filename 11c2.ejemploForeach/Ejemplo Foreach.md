
### Iterando arrays


```Java
String lista[] = {"Uno", "Dos", "Tres"};
```

#### Iteración de un array en versión tradicional


```Java
for(int i=0;i<lista.length;i++)
    System.out.println(lista[i].toUpperCase());
```

    UNO
    DOS
    TRES


#### Iteración de un array con for each


```Java
for(String palabra:lista)
    System.out.println(palabra.toUpperCase());
```

    UNO
    DOS
    TRES


### Iterando Collections


```Java
Collection lista = new ArrayList();
```


```Java
lista.add("Uno");
lista.add("Dos");
lista.add("Tres");
```




    true



#### Iteración de una Collection mediante Iteradores


```Java
Iterator it = lista.iterator();
while(it.hasNext())
{
    String palabra = (String) it.next();
    System.out.println(palabra.toUpperCase());
}
```

    UNO
    DOS
    TRES


#### Iteración de una Collection mediante for each


```Java
for(Object objeto:lista)
{
    String palabra = (String) objeto;
    System.out.println(palabra.toUpperCase());
}
```

    UNO
    DOS
    TRES


#### Iteración de una Collection tipificada mediante for each


```Java
Collection<String> lista = new ArrayList<String>();
lista.add("Uno");
lista.add("Dos");
lista.add("Tres");
```




    true




```Java
for(String palabra:lista)
    System.out.println(palabra.toUpperCase());
```

    UNO
    DOS
    TRES

