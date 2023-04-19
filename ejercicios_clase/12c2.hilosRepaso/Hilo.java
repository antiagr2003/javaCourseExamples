public class Hilo extends Thread
{
    private String piloto;

    public Hilo(String piloto)
    {
        this.piloto = piloto;
    }
    
    @Override
    public void run()
    {
        for(int i=1;i<10;i++)
            System.out.println("Piloto " + piloto + " en vuelta " + i);
    }
}
