/*
Reto #1:
Muestra los primeros 10 números diciendo si son pares o impares.
Fíjate en los campos XX para completarlo.

output:
======
Impar: 1
Par: 2
Impar: 3
...

*/
class Main 
{
    public static void main(String[] args) 
    {
        for(int i=1;i<=10;i++)
        {
            if(i%2==0)
                System.out.println("Par: " + i);
            else
                System.out.println("Impar: " + i);
        }
    }
}