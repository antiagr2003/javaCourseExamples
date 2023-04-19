public class App
{
    public static void main(String s[])
    {
        App.carrera();
        App.crearRunnable01();
        App.crearRunnable02();
        App.crearRunnable03();
    }

    private static void carrera()
    {
        Hilo piloto1 = new Hilo("Alonso");
        Hilo piloto2 = new Hilo("Hamilton");
        piloto1.start();
        piloto2.start();
    }

    private static void crearRunnable01()
    {
        Runnable r = new R();
        Thread t = new Thread(r);
        t.start();
    }

    private static void crearRunnable02()
    {
        Thread t = new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    for(int i=1;i<10;i++)
                        System.out.println(i);
                } 
            });
        t.start();
    }

    private static void crearRunnable03()
    {
        Thread t = new Thread(() -> 
                {
                    for(int i=1;i<10;i++)
                        System.out.println(i);
                });
        t.start();
    }
}