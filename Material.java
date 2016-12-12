
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
     * Constructor para objetos de la clase Material
     * @param
     * 'nombre' es el nombre del material
     * 'cantidad' es el número de unidades del material
     */
    public Material(String nombre, int cantidad)
    {
        // initialise instance variables
        this.nombre=nombre;
        this.cantidad=cantidad;
    }

    /**
     * Método para conocer el nombre del material
     * @return devuelve un string con el nombre del material
     */
    public String getNombre()
    {
        // put your code here
        return nombre;
    }
    
    /**
     * Método para conocer la cantidad del material
     * @return devuelve un string con la cantidad del material
     */
    public int getCantidad()
    {
        // put your code here
        return cantidad;
    }
    
    /**
     * Método para modificar el nombre del material
     * @param
     * 'nombre' es un String con el nombre que se va a asignar al material
     */
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    /**
     * Método para modificar la cantidad del material
     * @param
     * 'cantidad' es un int con la nueva cantidad que se va a asignar al material
     */
    public void setCantidad(int cantidad)
    {
        this.cantidad=cantidad;
    }
}
