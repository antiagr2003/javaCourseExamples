# Herencia en las excepciones

Ejemplo del tratamiento de errores en un contexto de herencia.

Dadas las siguientes excepciones:

### Definición de Excepciones


```Java
public class E1 extends Exception
{
    @Override
    public String toString()
    {
        return "E1";
    }
}
```


```Java
public class E2 extends E1
{
    @Override
    public String toString()
    {
        return "E2";
    }
}
```


```Java
public class E3 extends Exception
{
    @Override
    public String toString()
    {
        return "E3";
    }
}
```

### Lanzamiento de las excepciones

Y las el lanzamiento de ellas por cualquier clase.


```Java
public class MiClase
{
    public MiClase(String numero) throws E1, E2, E3, NumberFormatException
    {
        int i = Integer.parseInt(numero);
        if(i==1)
            throw new E1();
        if(i==2)
            throw new E2();
        if(i==3)
            throw new E3();            
    }

}
```

### Captura de las excepciones

Si el tratamiento se puede generalizar a todas las excepciones:


```Java
try
{
    MiClase mc = new MiClase("3");
}
catch(Exception e)
{
    System.out.println(e);
}
```

    E3


Si el tratamiento es distinto en función del tipo de objeto en una jerarquía de herencia:


```Java
try
{
    MiClase mc = new MiClase("3");
}
catch(E1 e)
{
    System.out.println("Tratamiento general para los objetos de tipo E1: " + e);
}
catch(E3 e)
{
    System.out.println("Tramiento distinto: " + e);
}
catch(NumberFormatException e)
{
    System.out.println("Número recibido no válido: " + e);
}
```

    Tramiento distinto: E3


Si todos los errores lanzados son tratados de forma específica. Lo más importante a destacar aquí es el orden en la captura de los errores. Siempre los específicos deben ser capturados en primer lugar.


```Java
try
{
    MiClase mc = new MiClase("2");
}
catch(E2 e)
{
    System.out.println("Tratamiento particular para los objetos de tipo E2: " + e);
}
catch(E1 e)
{
    System.out.println("Tratamiento particular para los objetos de tipo E1: " + e);
}
catch(E3 e)
{
    System.out.println("Tratamiento particular para los objetos de tipo E3: " + e);
}
catch(NumberFormatException e)
{
    System.out.println("Número recibido no válido: " + e);
}
```

    Tratamiento particular para los objetos de tipo E2: E2


Otro ejemplo de generalización de tratamiento de errores.


```Java
try
{
    MiClase mc = new MiClase("2");
}
catch(E2 e)
{
    System.out.println("Tratamiento particular para los objetos de tipo E2: " + e);
}
catch(Exception e)
{
    System.out.println("Tratamiento particular para el resto de los errores: " + e);
}
```

    Tratamiento particular para los objetos de tipo E2: E2


### Lanzamiento y tratamiento en diferentes métodos


```Java
public class C
{
    public C() throws E3, E2
    {
        if(Math.random()>0.5)
            throw new E3();
        else
            throw new E2();
    }
}
```


```Java
public class B
{
    public B() throws E3, E1
    {
        try
        {
            new C();
        }
        catch(E2 e)
        {
            System.out.println(e);
        }
        throw new E1();
    }
}
```


```Java
public class A
{
    public A() throws E1
    {
        try
        {
            new B();
        }
        catch(E3 e)
        {
            
        }    
    }
}
```


```Java
try
{
    new A();
}
catch(E1 e)
{
    System.out.println(e);
}
```

    E2
    E1
    


```Java

```
