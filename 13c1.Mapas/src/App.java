import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class App
{
    public static void main(String[] args)
    {
        HashMap<String, String> clientesProductos = new HashMap<String, String>();
        clientesProductos.put("C1", "P1");
        clientesProductos.put("C2", "P2");
        clientesProductos.put("C3", "P2");
        clientesProductos.put("C4", "P3");
        clientesProductos.put("C5", "P3");

        System.out.println("Mapa original: Cliente => Producto");
        System.out.println(clientesProductos);

        HashMap<String, Collection<String>> productosCliente = new HashMap<String, Collection<String>>();

        clientesProductos.forEach((cliente, producto) ->
            {
                Collection<String> clientes = productosCliente.getOrDefault(producto, new ArrayList<String>());
                clientes.add(cliente);
                productosCliente.put(producto, clientes);
            });

        System.out.println("Mapa final: Producto => Clientes");
        System.out.println(productosCliente);
    }
}
