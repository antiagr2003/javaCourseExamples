

```Java
public interface I1
{
    public int m1();
}

public interface I2
{
    public int m2();
}

public class A
{
    public int mA()
    {
        return 3;
    }
}

public class B extends A implements I1, I2
{
    @Override
    public int mA()
    {
        return super.mA() + 3;
    }
    
    @Override
    public int m1()
    {
        return 10;
    }
    
    @Override
    public int m2()
    {
        return 20;
    }
}
```


```Java
B b1 = new B();
b1.m1()+b1.m2();
```




    30



Upcasting


```Java
I1 i1 = new B();
i1.m1();
```




    10




```Java
I2 i2 = new B();
i2.m2();
```




    20



Downcasting


```Java
i2.mA()
```


    |   i2.mA()

    cannot find symbol

      symbol:   method mA()

    



```Java
B b2 = (B) i2;
b2.mA()
```




    6




```Java

```
