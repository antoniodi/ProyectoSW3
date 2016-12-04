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

    public Destreza(float promedio, Habilidad habilidad) {
        this.promedio = promedio;
        this.habilidad = habilidad;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public Habilidad getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }
  
}
