/** @author David Contreras */

/* RETO 13: Muestra el contenido de las colecciones mediante el método mostrar */
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

class Main {
  public static void main(String[] args) 
  {
    ArrayList miArrayList = new ArrayList();
    miArrayList.add("1.Uno");
    miArrayList.add("2.Dos");
    miArrayList.add("3.Tres");
    
    TreeSet miTreeSet = new TreeSet();
    miTreeSet.add("2.Dos");
    miTreeSet.add("3.Tres");
    miTreeSet.add("1.Uno");

    Main.mostrar(miArrayList);
    System.out.println("-----");
    Main.mostrar(miTreeSet);
  }
  
  private static void mostrar(Collection col)
  {
      Iterator it = col.iterator();
      while(it.hasNext())
        System.out.println(it.next());
  }
}