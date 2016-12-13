
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
    private Obra obra;

    /**
     * Constructor for objects of class Demo
     */
    public Demo()
    {cliente = new Cliente("Jaime","Castro","1234567","647568967","Jaime.Castro@hotmail.com",Municipio.BUCARAMANGA,"Calle 103");
     maestro = new Maestro("Pedro", "Martinez", "34566367", "5745667444", "pedro_martinez@gmail.com", Municipio.BUCARAMANGA, "Carrera 14");
     
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @return    retorna el cliente con los parametros asignados dentro del metodo 
     */
    public Cliente generarCliente()
    {
        cliente = new Cliente("Jaime","Castro","1234567","647568967","Jaime.Castro@hotmail.com",Municipio.BUCARAMANGA,"Calle 103");
        return cliente;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @return     retorna el maestro con los para
     */
    public Maestro generarMaestro()
    {
        maestro = new Maestro("Pedro", "Martinez", "34566367", "5745667444", "pedro_martinez@gmail.com", Municipio.BUCARAMANGA, "Carrera 14");
        return maestro;
    
    }
    
}

