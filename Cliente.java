
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;
    private String email;
    private String direccion;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nombre, String apellido, String cedula, String telefono, String email)
    {
        // initialise instance variables
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=cedula;
        this.telefono=telefono;
        this.email=email;
        this.direccion=null;
    }
    
    public Cliente(String nombre, String apellido, String cedula, String telefono, String email, String direccion)
    {
        // initialise instance variables
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=cedula;
        this.telefono=telefono;
        this.email=email;
        this.direccion=direccion;
    }
    
    public String getNombre()
    {
        return nombre;
    }

    public String getApellido()
    {
        return apellido;
    }
    
    public String getCedula()
    {
        return cedula;
    }
    
    public String getTelefono()
    {
        return telefono;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getDireccion()
    {
        return direccion;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }
    
    public void setCedula(String cedula)
    {
        this.cedula = cedula;
    }
    
    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }
   
}
