
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
     * Constructor para objetos de la clase Comentario con dirección
     * @fecha es la fecha en la que se realizó el comentario
     * @autor es la persona que realizó el comentario
     * @descripcion es el contenido del comentario
     */
    public Comentario(long fecha, String autor, String descripcion) {
        this.fecha = fecha;
        this.autor = autor;
        this.descripcion = descripcion;
    }

    /**
     * Modifica la fecha en la que se realizó el comentario
     */
    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    /**
     * Modifica la fecha en la que se realizó el comentario
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Modifica el contenido del comentario
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
     * Regresa el autor que realizó el comentario 
     */
    public String getAutor()
    {
        return autor;
    }
    /**
     * Regresa el contenido del comentario 
     */
    public String getDescripcion()
    {
        return descripcion;
    }

}
