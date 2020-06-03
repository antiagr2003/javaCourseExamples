package examenMayo2020.dominio;

import java.util.Collection;
import java.util.TreeSet;

public class Alumno implements java.io.Serializable
{
    private String clave;
    private String titulo;
    private Collection<Asignatura> asignaturas;

    public Alumno(String clave, String titulo)
    {
        this.clave = clave;
        this.titulo = titulo;
        asignaturas = new TreeSet<Asignatura>();
    }

    public String getClave()
    {
        return clave;
    }

    public String getTitulo()
    {
        return titulo;
    }    

    public void setClave(String clave)
    {
        this.clave = clave;
    }

    public void addAsignatura(Asignatura asignatura)
    {
        asignaturas.add(asignatura);
    }

    public void setAsignatura(Collection<Asignatura> asignaturas)
    {
        this.asignaturas = asignaturas;
    }
    

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Alumno)
        {
            Alumno alumno = (Alumno) obj;
            if (clave.equals(alumno.getClave()) && titulo.equals(alumno.getTitulo()))
                return true;
            else
                return false;
        }
        else
            return false;
    }

    @Override
    public int hashCode()
    {
       return (int) clave.charAt(0);
    }

 	public float calcularNota()
    {
    	float notaMedia = 0F;
    	for(Asignatura a:asignaturas)  	  
    	{
    		notaMedia += a.calcularNota();
    	}
    	return (float) (notaMedia/(asignaturas.size()*1.0));
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Clave: ")
          .append(clave)
          .append(" (")
          .append(titulo)
          .append(") Asignaturas: ")
          .append(asignaturas.toString());
        return sb.toString();
    }


}