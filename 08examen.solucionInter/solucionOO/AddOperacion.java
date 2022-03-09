public class AddOperacion extends Operacion
{
    @Override
    public void setup()
    {
        //No debe inicializar la List ya que justo su prueba de trabajo es esa.
    }

    @Override
    public void run(int size)
    {
         for(int i=0;i<size;i++)
            lista.add(String.valueOf(i));
    }
}
