import java.util.ArrayList;
/**
 * Write a description of class Proyecto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Proyecto
{
    private Cliente cliente;
    private Maestro maestro;
    private long fechaDeInicio;
    private long fechaLimite;
    private String ubicacion;
    private Obra obra;
    private String descripcion;
    private ArrayList<Comentario> comentarios;
    private Calificacion calificacion;
    private int plazo;
    private String materiales;

    /**
     * Constructor para objetos de la clase Proyecto
     * @cliente es el cliente que ha creado el proyecto
     * @maestro es el maestro a cargo del proyecto
     * @fechaDeInicio es la fecha en la que se comienza la ejecución del proyecto
     * @fechaLimite es la fecha que se debe cumplir para culminar el proyecto
     * @ubicación se refiere a donde se realiza el proyecto
     * @obra es el tipo de obra en que se basa el proyecto
     * @plazo es el tiempo que se tiene para tomar el proyecto
     * @materiales son los materiales con los que se cuenta para realizar el proyecto
     */
    public Proyecto(Cliente cliente, Maestro maestro, long fechaDeInicio, long fechaLimite, String ubicacion, Obra obra, int plazo, String materiales) {
        this.cliente = cliente;
        this.maestro = maestro;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaLimite = fechaLimite;
        this.ubicacion = ubicacion;
        this.obra = obra;
        this.plazo = plazo;
        this.materiales = materiales;
    }

    /**
     * Regresa el cliente patrón del proyecto
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Modifica el cliente patrón del proyecto
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Regresa el maestro a cargo del proyecto
     */
    public Maestro getMaestro() {
        return maestro;
    }

    /**
     * Modifica el maestro a cargo del proyecto
     */
    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }

    /**
     * Regresa la fecha de inicio del proyecto
     */
    public long getFechaDeInicio() {
        return fechaDeInicio;
    }

    /**
     * Modifica la fecha de inicio del proyecto
     */
    public void setFechaDeInicio(long fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    /**
     * Regresa la fecha límite del proyecto
     */
    public long getFechaLimite() {
        return fechaLimite;
    }

    /**
     * Modifica la fecha límite del proyecto
     */
    public void setFechaLimite(long fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    /**
     * Regresa la ubicación del proyecto
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Modifica la ubicación del proyecto
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Regresa la obra base del proyecto
     */
    public Obra getObra() {
        return obra;
    }

    /**
     * Modifica la obra base del proyecto
     */
    public void setObra(Obra obra) {
        this.obra = obra;
    }

    /**
     * Regresa la descripción del proyecto
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Modifica la descripción del proyecto
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Regresa la calificación del proyecto
     */
    public Calificacion getCalificacion() {
        return calificacion;
    }

    /**
     * Modifica la calificación del proyecto
     */
    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Regresa el plazo con el que cuenta el proyecto
     */
    public int getPlazo() {
        return plazo;
    }

    /**
     * Modifica el plazo con el que cuenta el proyecto
     */
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    /**
     * Regresa los materiales con los que cuenta el proyecto
     */
    public String getMateriales() {
        return materiales;
    }

    /**
     * Modifica los materiales con los que cuenta el proyecto
     */
    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }
    
}
