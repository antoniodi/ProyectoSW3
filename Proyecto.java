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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }

    public long getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(long fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public long getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(long fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }
    
}
