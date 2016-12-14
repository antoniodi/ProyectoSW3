import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ClasesTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClasesTest
{
    /**
     * Default constructor for test class ClienteTest
     */
    public ClasesTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * verificamos los metodos del cliente que esten funconando correctamente
     */
    @Test
    public void verificarInfoCliente(){
    Cliente cliente1 = new Cliente("Jaime","Castro","1234567","647568967","Jaime.Castro@hotmail.com",Municipio.BUCARAMANGA,"Calle 103");
    assertEquals("Jaime", cliente1.getNombre());
    assertEquals("Castro", cliente1.getApellido());
    assertEquals("1234567", cliente1.getCedula());
    assertEquals("Calle 103", cliente1.getDireccion());
    assertEquals(Municipio.BUCARAMANGA, cliente1.getMunicipio());
    }

    /**
     * verificamos los metodos del mestro que esten funconando correctamente
     */
    @Test
    public void verificarInfoMestro()
    {Maestro maestro1 = new Maestro("Pedro", "Martinez", "34566367", "5745667444", "pedro_martinez@gmail.com", Municipio.BUCARAMANGA, "Carrera 14");
        assertEquals("Pedro", maestro1.getNombre());
        assertEquals("Martinez", maestro1.getApellido());
        assertEquals("34566367", maestro1.getCedula());
        assertEquals("Carrera 14", maestro1.getDireccion());
        assertEquals(Municipio.BUCARAMANGA, maestro1.getMunicipio());
    }
    
    /**
     * verificamos los metodos de la clase cometario esten funconando correctamente
     */
    @Test
    public void verificarMetodosComentario()
    {Comentario comentario = new Comentario("Jaime", "Eñ precio es muy alto");
      assertEquals("Jaime", comentario.getAutor());
      assertEquals("Eñ precio es muy alto", comentario.getDescripcion());
        
    }
}

