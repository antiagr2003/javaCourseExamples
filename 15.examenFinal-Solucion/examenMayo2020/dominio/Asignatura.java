package examenMayo2020.dominio;

public class Asignatura implements Comparable, java.io.Serializable
{
    private String nombre;
    private float nota;

    public Asignatura(String nombre, float nota)
    {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre()
    {
        return nombre;
    }

    public float getNota()
    {
        return nota;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setNota(float nota)
    {
        this.nota = nota;
    }

    public float calcularNota()
    {
        return nota;
    }    

    @Override
    public int compareTo(Object obj)
    {
        return nombre.compareTo(((Asignatura)obj).getNombre()); 
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Asignatura)
        {
            Asignatura a = (Asignatura) obj;
            if (nombre.equals(a.getNombre()))
                return true;
            else
                return false;
        }
        else
            return false;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre)
          .append(" (")
          .append(nota)
          .append(")");
        return sb.toString();
    }    
}