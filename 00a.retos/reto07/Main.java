/** Reto 07: Herencia 
Arregla todo este desastre de herencia, por favor 
*/


class Main 
{
  public static void main(String[] args) 
  {
    A aes[] = new A[5];
    aes[0] = new A(1);
    aes[1] = new B(2, 2);
    aes[2] = new C(3, 3, 3);
    
    for(int i=0;i<5;i++)
        if(aes[i]!=null)
            System.out.println(aes[i].getInfo());
    
    Calculable objetos[] = new Calculable[10];
    objetos[0] = new A(500);
    objetos[1] = new Z("Hola", "Adios");
    
    
    for(int i=0;i<10;i++)
        if(objetos[i]!=null)
            System.out.println(objetos[i].calcular());

  }
}

class A implements Calculable
{
    private int a;
    
    A(int a)
    {
        this.a = a;
    }
    
    @Override
    public int calcular()
    {
        return a;
    }
    
    String getInfo()
    {
        return String.valueOf(a);
    }
}

class B extends A
{
    private int b;

    B(int a, int b)
    {
        super(a);
        this.b = b;
    }
    
    @Override
    String getInfo()
    {
        return super.getInfo() + b;
    }
    
}

class C extends B
{
    private int c;

    C(int a, int b, int c)
    {
        super(a, b);
        this.c = c;
    }
    
    @Override
    String getInfo()
    {
        return super.getInfo() + c;
    }

}

class Z implements Calculable
{
    String a;
    String b;
    
    Z(String a, String b)
    {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public int calcular()
    {
        return a.hashCode();
    }
    
    String getInfo()
    {
        return a + b;
    }
    
}

interface Calculable
{
    int calcular();
}

