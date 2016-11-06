
/**
 * Write a description of class Obra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obra
{
    // instance variables - replace the example below with your own
    private String habilidad;
    private String elemento;

    /**
     * Constructor for objects of class Obra
     */
    public Obra(String habilidad, String elemento)
    {
        // initialise instance variables
        this.habilidad=habilidad;
        this.elemento=elemento;
    }

    public String getHabilidad()
    {
        return habilidad;
    }
    
    public String getElemento()
    {
        return elemento;
    }
    
    public void setHabilidad(String habilidad)
    {
        this.habilidad=habilidad;
    }
    
    public void setElemento(String elemento)
    {
        this.elemento=elemento;
    }
    
}
