package practicaExtra.util;

public class Generador
{
    public static int generaX(int min, int max)
    {
        double d = Math.random();
        d = d * (max - min) + min;
        return (int) d;
    }

    public static int generaY(int min, int max)
    {
        return (int) generaX(min, max);
    }

    public static int generaVelocidad()
    {
        return (int) generaX(1, 4);
    }
}
