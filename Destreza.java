import java.util.ArrayList;
/**
 * Write a description of class Destreza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Destreza
{
    private float promedio;
    private Habilidad habilidad;
    private ArrayList<Calificacion> calificaciones;

    /**
     * Constructor para objetos de la clase Destreza con dirección
     * @promedio es el valor que mide que tan bueno es el maestro en dicha destreza
     * @habilidad es en lo que se destaca el maestro en la destreza
     */
    public Destreza(float promedio, Habilidad habilidad) {
        this.promedio = promedio;
        this.habilidad = habilidad;
    }

    /**
     * Regresa el valor del promedio en calificaciones de la destreza
     */
    public float getPromedio() {
        return promedio;
    }

    /**
     * Modifica el valor del promedio en calificaciones de la destreza
     */
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    /**
     * Regresa la habilidad asociada a la destreza
     */
    public Habilidad getHabilidad() {
        return habilidad;
    }

    /**
     * Modifica la habilidad asociada a la destreza
     */
    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }
  
}
