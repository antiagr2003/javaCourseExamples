import net.objecthunter.exp4j.*;

public class App
{
    public static void main(String[] args) 
    {
        Expression e = new ExpressionBuilder("3 * sin(y) - 2 / (x - 2)")
            .variables("x", "y")
            .build()
            .setVariable("x", 2.3)
            .setVariable("y", 3.14);
        double result = e.evaluate();
        System.out.println(result);
    }
}