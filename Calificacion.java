
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

    public Calificacion(Comentario comentario, int valoracion) {
        this.comentario = comentario;
        this.valoracion = valoracion;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }
    
}
