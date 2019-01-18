/*
Reto #2:
Define la clase Coche implementando los getters y setters sabiendo que sus atributos son marca y cilindrada

*/
class Coche 
{
    //atributos
    String marca;
    int cilindrada;
    
    //métodos
    String getNombre()
    {
        return marca;
    }
    
    int getCilindrada()
    {
        return cilindrada;
    }
    
    void setNombre(String marca)
    {
        this.marca = marca;
    }
    
    void setCilindrada(int cilindrada)
    {
        this.cilindrada = cilindrada;
    }
}