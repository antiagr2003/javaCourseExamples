/* RETO 4: Arrays

Completad y modificad el código para que se inicialice el array y se muestre 

*/
class Main 
{
  static int numeros[] = new int[4];

  public static void main(String[] args) 
  {
    Main.inicializar();
    Main.mostrar();
  }
  
  static void inicializar()
  {
    numeros[0] = 4;
    numeros[1] = 1;
    numeros[2] = 2;
    numeros[3] = 7;
  }
  
  static void mostrar()
  {
    for (int i=0;i<numeros.length;i++)
        System.out.println(numeros[i]);
  }
}