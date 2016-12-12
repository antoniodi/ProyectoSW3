
/**
 * Write a description of class Comentario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comentario
{
    private long fecha;
    private String autor;
    private String descripcion;

    /**
     * Constructor para objetos de la clase Comentario
     * @param
     * 'fecha' es la fecha en la que se realizó el comentario
     * 'autor' es la persona que realizó el comentario
     * 'descripcion' es el contenido del comentario
     */
    public Comentario(long fecha, String autor, String descripcion) {
        this.fecha = fecha;
        this.autor = autor;
        this.descripcion = descripcion;
    }

    /**
     * Método para modificar la fecha del Comentario
     * @param
     * 'fecha' es un long con la fecha que se va a asignar al Comentario
     */
    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    /**
     * Método para modificar el autor del Comentario
     * @param
     * 'autor' es un String con el autor que se va a asignar al Comentario
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Método para modificar la descripción del Comentario
     * @param
     * 'descripcion' es un String con la nueva descripcion que se va a asignar al Comentario
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
      
    /**
     * Este metodo devuelve la fecha en la que se realizo el comentario
     * 
     * @return     la fecha en la que se realizo el comentario
     */
    public long getFecha()
    {
        return fecha;
    }
    
    /**
     * Este metodo devuelve el autor que realizo el comentario
     * 
     * @return     el autor que realizó el comentario
     */
    public String getAutor()
    {
        return autor;
    }
    /**
     * Este metodo devuelve la descripcion del comentario
     * 
     * @return     la descripcion del comentario
     */
    public String getDescripcion()
    {
        return descripcion;
    }

}
