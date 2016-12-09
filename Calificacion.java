
/**
 * Write a description of class Calificacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calificacion
{
    private Comentario comentario;
    private int valoracion;

    /**
     * Constructor para objetos de la clase Calificación con dirección
     * @comentario es un comentario asignado a la calificación
     * @valoración es un valor entre 0-5.
     */
    public Calificacion(Comentario comentario, int valoracion) {
        this.comentario = comentario;
        this.valoracion = valoracion;
    }

    /**
     * Regresa el comentario asignado a la calificación
     */
    public Comentario getComentario() {
        return comentario;
    }

    /**
     * Modifica el comentario asignado a la calificación
     */
    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    /**
     * Regresa la valoración asignada a la calificación
     */
    public int getValoracion() {
        return valoracion;
    }

    /**
     * Modifica la valoración asignada a la calificación
     */
    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }
    
}
