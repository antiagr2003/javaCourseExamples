```Java
ArrayList lista = new ArrayList();
```


```Java
lista.add("A")
```




    true




```Java
lista.add(Integer.valueOf(3))
```




    true




```Java
lista.add(3)
```




    true




```Java
lista.add("B")
```




    true




```Java
lista.add("C")
```




    true




```Java
for(Object o:lista)
  System.out.println(o)
```

    A
    3
    3
    B
    C
    


```Java
lista.add("D")
```




    true




```Java
lista
```




    [A, 3, 3, B, C, D]




```Java
for(int i=0;i<lista.size();i++)
{
    Object o = lista.get(i);
    System.out.println("·" + o);
}
```

    ·A
    ·3
    ·3
    ·B
    ·C
    ·D
    


```Java
ArrayList<String> listaST = new ArrayList<String>();
```


```Java
listaST.add("ssasas");
listaST.add("AA");
listaST.add("C");
```




    true




```Java
for(String s:listaST)
    System.out.println("·" + s.toLowerCase());
```

    ·ssasas
    ·ssasas
    ·aa
    ·c
    


```Java
HashSet listaHS = new HashSet(lista);
```


```Java
listaHS.toString()
```




    [A, B, C, D]




```Java
listaHS.add("B")
```




    false




```Java
for(Object o:listaHS)
  System.out.println(o)
```

    A
    B
    C
    D
    


```Java
Iterator it = listaHS.iterator();
while(it.hasNext())
{
   it.next();
   System.out.println(it.next());
}
```

    B
    D
    


```Java
Runtime rt = new Runtime()
```


    |   Runtime rt = new Runtime();

    Runtime() has private access in java.lang.Runtime

    


Singleton


```Java
Runtime rt = Runtime.getRuntime();
```


```Java
rt.freeMemory()
```




    47129056




```Java
StringBuilder sb = new StringBuilder();

```


```Java
sb.append("A");
```




    AAA




```Java
sb.append("A")
   .append("B")
   .append("C");
```




    AAAABC




```Java
sb
```




    AAAABC




```Java

```


```Java
p.setNombre("Luis")
  .setEdad(22);
```
