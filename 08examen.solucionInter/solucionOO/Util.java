public class Util
{
    public static final int ITERACIONES = 1000;
 
    public static int getRandom(int size)
    {
        double rnd = Math.random() * (size-1);
        return (int) rnd;
    }
}