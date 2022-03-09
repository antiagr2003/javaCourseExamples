import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public enum Listas
{
    ARRAY_LIST(new ArrayList<String>()), LINKED_LIST(new LinkedList<String>());
 
    List<String> lista;

    Listas(List<String> lista)
    {
        this.lista = lista;
    }

    public List<String> getLista()
    {
        return lista;
    }
}



