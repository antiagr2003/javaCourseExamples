public class Empresa implements Cotizable
{
    String nombre;
    int facturacion;

    //Constructor
    public Empresa(String nombre, int facturacion)
    {
        this.nombre = nombre;
        this.facturacion = facturacion;
    }

    public String getInfo()
    {
    	return nombre + facturacion; 
    }

    @Override
    public double cotizar()
    {
        return facturacion*0.35;
    }

}