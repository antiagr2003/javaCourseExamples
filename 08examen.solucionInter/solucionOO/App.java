public class App
{
    public static void main(String[] args) 
    {
        Operacion agregar = new AddOperacion();   
        Operacion accesoDirecto = new GetOperacion();   
        Operacion borrar  = new RemoveOperacion();
        Operacion insertar = new InsertOperacion();
        Operacion iterar  = new IteratorOperacion();
        Operacion contains  = new ContainsOperacion();    

        System.out.printf("\nIteraciones: %d\n", Util.ITERACIONES);

        System.out.printf("\nADD: %.4f", App.test(agregar));
        System.out.printf("\nGET: %.4f", App.test(accesoDirecto));
        System.out.printf("\nREMOVE: %.4f", App.test(borrar));
        System.out.printf("\nINSERT: %.4f", App.test(insertar));
        System.out.printf("\nITERATOR: %.4f", App.test(iterar));
        System.out.printf("\nCONTAINS: %.4f", App.test(contains));
    }

    public static float test(Operacion op)
    {
        long tiempoAcumulado = 0;
        int ITERACIONES = Util.ITERACIONES;
        for(int indexPromedio=0; indexPromedio<ITERACIONES;indexPromedio++)
        {
            op.init(Listas.ARRAY_LIST);
            int random = Util.getRandom(Operacion.SIZE);
            long inicio = System.nanoTime(); 
            op.run(random);
            long fin = System.nanoTime(); 
            tiempoAcumulado += (fin - inicio);
        }

        float media = tiempoAcumulado/(float)ITERACIONES;
        return (float) (media/1000.);
    }
}