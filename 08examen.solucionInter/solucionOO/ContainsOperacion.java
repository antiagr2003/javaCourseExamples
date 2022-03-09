public class ContainsOperacion extends Operacion
{
    @Override
    public void run(int valor)
    {
        boolean x = lista.contains(String.valueOf(valor));
    }
}