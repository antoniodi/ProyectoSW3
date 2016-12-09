import java.util.ArrayList;

/**
 * Write a description of class Maestro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maestro
{
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;
    private String email;
    private String direccion;
    private ArrayList<Destreza> destrezas;

    public Maestro(String nombre, String apellido, String cedula, String telefono, String email, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    

    /**
     * Constructor for objects of class Maestro
     */
    public Maestro(String nombre, String apellido, String cc, long telefono, String tipoContrato)
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return 0;
    }
}
