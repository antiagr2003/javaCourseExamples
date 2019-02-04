/* RETO 06: Define e incializa las variables i, j y k de la forma correcta y en el lugar correspondiente, según la siguiente lógica */

class Main {
  static int k = 3;
  
  public static void main(String[] args) 
  {
    int i = 1;
    if(i==1)
        for(int j=2;j<5;j++)
            System.out.println(Main.exec(j));
  }
  
  static String exec(int j)
  {
    String resultado;

    if(k+j==5)
        resultado = "OK";
    else
        resultado = "ERROR";
    k--;        

    return resultado;
  }

}
