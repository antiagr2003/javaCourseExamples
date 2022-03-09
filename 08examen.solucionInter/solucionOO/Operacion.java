import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public abstract class Operacion
{
    public static final int ARRAY_LIST = 1;
    public static final int LINKED_LIST = 2;
    
    public final static int SIZE = 100;
    
    protected List<String> lista;
    
    /** Selección de la estructura sobre la cual realizar el benchmarking */
    public void init(Listas tipoLista)
    {
        this.lista = tipoLista.getLista();
        this.setup();
    }
    
    /** Preparación de la estructura para hacer el benchmarking */
    public void setup()
    {
        for(int i=0;i<SIZE;i++)
            lista.add(String.valueOf(i));
    }
    
    /** Prueba de trabajo a realizar el benchmarking */
    public abstract void run(int posicion);
    
}