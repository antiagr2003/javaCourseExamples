package examenMayo2020.dominio;

public class AsignaturaPractica extends Asignatura
{
    private int porcentajePractico;
    private float notaPractico;

    public AsignaturaPractica(String nombre, float nota, int porcentajePractico, float notaPractico)
    {
        super(nombre, nota);
        this.porcentajePractico = porcentajePractico;
        this.notaPractico = notaPractico;
    }

    public int getPorcentajePractico()
    {
        return porcentajePractico;
    }

    public float getNotaPractico()
    {
        return notaPractico;
    }

    public void setPorcentajePractico(int porcentajePractico)
    {
        this.porcentajePractico = porcentajePractico;
    }

    public void setNotaPractico(float notaPractico)
    {
        this.notaPractico = notaPractico;
    }

    @Override
    public float calcularNota()
    {
        return super.calcularNota()*(1-porcentajePractico/100F) + notaPractico*(porcentajePractico/100F);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" - Practica: ")
          .append(porcentajePractico)
          .append("% (")
          .append(notaPractico)
          .append(")");
        return sb.toString();
    }
}