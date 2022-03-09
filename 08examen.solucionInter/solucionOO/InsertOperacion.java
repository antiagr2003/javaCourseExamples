public class InsertOperacion extends Operacion
{
    @Override
    public void run(int posicion)
    {
         lista.add(posicion, String.valueOf(posicion));
    }
}
