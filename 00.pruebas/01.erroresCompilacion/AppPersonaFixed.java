public class AppPersonaFixed
{
    public void main(String args) 
    {
    	PersonaFixed.setCIUDAD("Madrid");
        PersonaFixed persona1 = new PersonaFixed("Luis", 22);
        System.out.println(persona1.getInfo());
    }
}
