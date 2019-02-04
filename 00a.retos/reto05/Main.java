/* RETO 5: ampliar el interfaz y la funcionalidad.

Se desea que la papelera tenga la capacidad de tener más de un contenido y se pueda ir agregando paso a paso. Ahora tiro un papel, luego un boli, después una manzana, etc...
*/

class Main {
  public static void main(String[] args) 
  {
    Papelera p1 = new Papelera();
    p1.addContenido("Papel");
    p1.addContenido("Boli");
    p1.addContenido("Manzana");
    System.out.println(p1.getInfo());
  }
}