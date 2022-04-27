# Ejemplo de Mapas
## Invertir la estructura de un mapa

El objetivo de este ejemplo es convertir un mapa original de una estructura de Cliente => Producto.

```
{C3=P2, C4=P3, C5=P3, C1=P1, C2=P2}
```
...a una estructura de Producto => Clientes.
```
{P1=[C1], P2=[C3, C2], P3=[C4, C5]}
```

## Solución

```java
HashMap<String, Collection<String>> productosCliente = new HashMap<String, Collection<String>>();

clientesProductos.forEach((cliente, producto) ->
    {
        Collection<String> clientes = productosCliente.getOrDefault(producto, new ArrayList<String>());
        clientes.add(cliente);
        productosCliente.put(producto, clientes);
    });
```