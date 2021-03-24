# Reto Métodos

Hasta ahora hemos visto la forma natural de trabajar con objetos, en la sintáxis objeto.método():
```java
Persona p = new Persona();
p.setEdad(12);
p.setNombre("Luis");
p.setDireccion("Calle de la otra esquina, 34");
```

También conocemos la forma de concatenar métodos:
```java
p.getNombre().substring(0,3).toUpperCase();
```

Pero en ocasiones vemos cómo algunos objetos trabajan siguiendo la siguiente estructura:

```java
StringBuilder sb = new StringBuilder();
sb.append("A")
  .append("B")
  .append("C");
```

¿Por qué es posible esto? Porque cada método append está devolviendo una ocurrencia modificada de StringBuilder. Sería equivalente a hacer lo siguiente, lo cual no queda tan cool...
```java
StringBuilder sb = new StringBuilder();
sb = sb.append("A");
sb = sb.append("B")
sb = sb.append("C");
```

### Objetivo del reto

Adaptar la clase Persona clásica que tenemos para que se puedan modificar los atributos de la siguiente forma:
```java
p.setNombre("Luis")
  .setEdad(22)
  .setDireccion("Calle de la otra esquina, 34");
```
