public class App
{
    static int numero = 5;

    public static void main(String[] args)
    {
    	App.mostrar();
    	numero = App.sumar(5);
    	numero = App.restar(4);
    	numero = App.multiplicar(2);
    	App.mostrar();
    }
    
    static void mostrar()
    {
        System.out.println(numero);
    }
    
    static int sumar(int otroNumero)
    {
        return numero + otroNumero;    
    }
    
    static int multiplicar(int otroNumero)
    {
    	return numero * otroNumero;    
    }
    
    static int restar(int otroNumero)
    {
        return numero - otroNumero;    
    }    

}
