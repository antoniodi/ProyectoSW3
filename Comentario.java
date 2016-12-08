
/**
 * Write a description of class Comentario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comentario
{
<<<<<<< HEAD
    private long fecha;
    private String autor;
    private String descripcion;

    public Comentario(long fecha, String autor, String descripcion) {
        this.fecha = fecha;
        this.autor = autor;
        this.descripcion = descripcion;
    }

    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
=======
    // instance variables - replace the example below with your own
    private long fecha;
    private String autor;
    private String descripcion;
    /**
     * Constructor for objects of class Comentario
     */
    public Comentario(String autor, String descripcion)
    {
        // initialise instance variables
        this.autor = autor;
        this.descripcion = descripcion;
        //fecha =
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public long getFecha()
    {
        // put your code here
        return fecha;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getAutor()
    {
        // put your code here
        return autor;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getDescripcion()
    {
        // put your code here
        return descripcion;
    }
>>>>>>> origin/master
}
