/* RETO 8: Tipos de datos 
Realizar las siguientes conversiones:
54.6 --> float --> char --> Character --> String --> Integer --> int --> float
*/


class Main 
{
  public static void main(String[] args) 
  {
    float f1 = 54.6F;
    char c = (char) f1;
    Character ch = Character.valueOf(c); //new Character() está deprecated en la versión 9
    String s = String.valueOf(ch);
    Integer i1 = Integer.valueOf(s); //new Integer() está deprecated en la versión 9
    int i2 = i1.intValue();
    float f2 = i2;

  }
}