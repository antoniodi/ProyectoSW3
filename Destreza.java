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
     * @param
     * 'promedio' es el valor que mide que tan bueno es el maestro en dicha destreza
     * 'habilidad' es en lo que se destaca el maestro en la destreza
     */
    public Destreza( Habilidad habilidad) {
        this.promedio = 0;
        this.habilidad = habilidad;
    }

    /**
     * Método para conocer el primedio de la destreza
     * @return devuelve un float con el promedio de la destreza
     */
    public float getPromedio() {
        return promedio;
    }

    /**
     * Método para modificar el promedio de la destreza
     * @param
     * 'promedio' es un float con el promedio que se va a asignar al maestro
     */
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    /**
     * Método para conocer la habilidad de la destreza
     * @return devuelve un Habilidad con la habilidad de la destreza
     */
    public Habilidad getHabilidad() {
        return habilidad;
    }

    /**
     * Método para modificar la habilidad de la destreza
     * @param
     * 'habilidad' es un Habilidad con la habilidad que se va a asignar al maestro
     */
    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }
  
}
