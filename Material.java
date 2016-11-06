
/**
 * Write a description of class Material here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Material
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int cantidad;

    /**
     * Constructor for objects of class Material
     */
    public Material(String nombre, int cantidad)
    {
        // initialise instance variables
        this.nombre=nombre;
        this.cantidad=cantidad;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getNombre()
    {
        // put your code here
        return nombre;
    }
    
    public int getCantidad()
    {
        // put your code here
        return cantidad;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    public void setCantidad(int cantidad)
    {
        this.cantidad=cantidad;
    }
}
