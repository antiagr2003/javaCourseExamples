# Reto HashSet

El HashSet es una estructura que permite trabajar como una tabla hash.

### Objetivo
Aunque no sea el objetivo, ni mucho menos, se propone ordenar (con fines pedagógicos), las personas almacenadas en el HashSet (no se puede utilizar otra colección) por edad de forma ascendente, para de esta manera entender la gestión interna de memoria que sigue el tabla hash. Evidentemente, es algo aproximado y NUNCA se utilizaría esta funcionalidad para ordenar.

### Solución con un TreeSet

Si quisiésemos optar por la estructura ideal, un TreeSet, una posible solución podría ser la siguiente:

```java
class Persona
{
	...

    @Override
    public int compareTo(Object obj)
    {
        if(obj instanceof Persona) 
        {
            Persona p = (Persona) obj;
            if(edad>p.getEdad())
                return +1;
            else if(edad<p.getEdad())
                return -1;
            else
            {
                if(this.equals(p))
                    return 0;
                else
                    return +1;
            }
        }
        else
            return +1;   
    }

    ...

}
```