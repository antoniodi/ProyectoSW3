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
    private Municipio municipio;
    private String direccion;
    private ArrayList<Destreza> destrezas;

    /**
     * Constructor para objetos de la clase Maestro
     * @nombre es el nombre del maestro
     * @apellido es el apellido del maestro
     * @cedula es la cedula del maestro
     * @telefono es el telefono del maestro
     * @email es el correo electronico del maestro
     * @direccion es la dirección del domicilio del maestro
     */
    public Maestro(String nombre, String apellido, String cedula, String telefono, String email, Municipio municipio, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.email = email;
        this.municipio = municipio;
        this.direccion = direccion;
    }
   /**
     * Esta funcion se encarga de agregar una destrezaRegresa el nombre del maestro
     */
    public void agregardestreza(String habilidaElegida){
        
         for (Habilidad habilidad: Habilidad.values() ) {
            System.out.print(habilidad.toString()+"\t");   }
            
         destrezas.add(new Destreza(0,));
    }
    /**
     * Regresa el nombre del maestro
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del maestro
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Regresa el apellido del maestro
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Modifica el apellido del maestro
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Regresa la cedula del maestro
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Modifica la cedula del maestro
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Regresa el telefono del maestro
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Modifica el telefono del maestro
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Regresa el correo electronico del maestro
     */
    public String getEmail() {
        return email;
    }

    /**
     * Modifica el correo electronico del maestro
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Regresa la dirección del domicilio del maestro
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Modifica la dirección del domicilio del maestro
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
