
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

    public Comentario(long fecha, String autor, String descripcion) {
        this.fecha = fecha;
        this.autor = autor;
        this.descripcion = descripcion;
    }


    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
   
    /**
     * Este metodo devuelve la fehca en la que se realizo el comentario
     * 
     * @return     la fecha en la que se realizo el comentario
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

}
