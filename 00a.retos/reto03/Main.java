/* RETO 3: crea los constructores necesarios acorde a la lógica de una papelera.
Crea dos papeleras, una vacía a la cual luego tiras un papel y otra con una lata ya en su interior.
*/

class Main {
  public static void main(String[] args) {
    Papelera p1 = new Papelera();
    p1.setContenido("Papel");
    Papelera p2 = new Papelera("Lata");
    System.out.println(p1.getContenido());
    System.out.println(p2.getContenido());
  }
}