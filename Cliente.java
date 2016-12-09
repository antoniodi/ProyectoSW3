
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
     * Constructor para objetos de la clase Cliente sin dirección
     * @nombre es el nombre del cliente
     * @apellido es el apellido del cliente
     * @cedula es la cedula del cliente
     * @telefono es el telefono del cliente
     * @email es el correo electronico del cliente
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
    
    /**
     * Constructor para objetos de la clase Cliente con dirección
     * @nombre es el nombre del cliente
     * @apellido es el apellido del cliente
     * @cedula es la cedula del cliente
     * @telefono es el telefono del cliente
     * @email es el correo electronico del cliente
     * @direccion es la dirección del domicilio del cliente
     */
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
    
    /**
     * Regresa el nombre del cliente
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * Regresa el apellido del cliente
     */
    public String getApellido()
    {
        return apellido;
    }
    
    /**
     * Regresa la cedula del cliente
     */
    public String getCedula()
    {
        return cedula;
    }
    
    /**
     * Regresa el telefono del cliente
     */
    public String getTelefono()
    {
        return telefono;
    }
    
    /**
     * Regresa el email del cliente
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Regresa la dirección del cliente
     */
    public String getDireccion()
    {
        return direccion;
    }
    
    /**
     * Modifica el nombre del cliente
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    /**
     * Modifica el apellido del cliente
     */
    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }
    
    /**
     * Modifica la cedula del cliente
     */
    public void setCedula(String cedula)
    {
        this.cedula = cedula;
    }
    
    /**
     * Modifica el telefono del cliente
     */
    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
    
    /**
     * Modifica el email del cliente
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    /**
     * Modifica la dirección del cliente
     */
    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }
   
}
