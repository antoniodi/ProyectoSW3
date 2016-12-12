
/**
 * Write a description of class Demo here.
 * 
 * @author Antonio Cortes
 * @version 1.0
 */
public class Demo
{
    // instance variables - replace the example below with your own
    private Cliente cliente;
    private Maestro maestro;

    /**
     * Constructor for objects of class Demo
     */
    public Demo()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Cliente sampleMethod()
    {
        cliente = new Cliente("Jaime","Castro","1234567","647568967","Jaime.Castro@hotmail.com",Municipio.BUCARAMANGA,"Calle 103");
        return cliente;
    }
    
    public Maestro sampleMethod2()
    {
        maestro = new Maestro("Pedro", "Martinez", "34566367", "5745667444", "pedro_martinez@gmail.com", Municipio.BUCARAMANGA, "Carrera 14");
    }
}

