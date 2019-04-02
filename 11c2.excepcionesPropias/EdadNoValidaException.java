public class EdadNoValidaException extends Exception
{
    public EdadNoValidaException()
    {
        super("La edad debe estar comprendida entre " + Persona.EDAD_MIN + " y " +  Persona.EDAD_MAX);
    }

    public String toString()
    {
        return this.getMessage();
    }

}