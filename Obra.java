import java.util.*;
/**
 * Write a description of class Obra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obra
{
    // instance variables - replace the example below with your own
    private HashMap<Elemento,ArrayList<Habilidad>> obra;
   

    /**
     * Constructor for objects of class Obra
     */
    public Obra()
    {obra = new HashMap<>();
     obra.put(Elemento.PISO,agregarHabilidades(Habilidad.ENCHAPE,Habilidad.MANPOSTERIA));
     obra.put(Elemento.PARED,agregarHabilidades(Habilidad.PINTURA,Habilidad.ESTUCO,Habilidad.ENCHAPE));
            
    }
    /**
     * Usamos etse metodo para conocer las Habiliades relacionadas con un elemento de la casa
     */
    public void conocerHabilidades(String elementoElegido){
    Iterator it = obra.entrySet().iterator();
		
    while (it.hasNext()) {
    	Map.Entry e = (Map.Entry)it.next();
    	if (e.getKey().toString() == elementoElegido){
    	System.out.println(e.getKey() + " " + e.getValue());
    }
    }
    
    }
    /**
     * Agregamos 1 Habilidad que se encuentren relacionadas con un elemento especifico
     */
    public ArrayList<Habilidad> agregarHabilidades(Habilidad habilidad1){
    ArrayList<Habilidad> habilidades = new ArrayList<Habilidad>();
    habilidades.add(habilidad1);
    return habilidades;
    
    }
     /**
     * Agregamos 2 Habilidades que se encuentren relacionadas con un elemento especifico
     */
    public ArrayList<Habilidad> agregarHabilidades(Habilidad habilidad1, Habilidad habilidad2){
    ArrayList<Habilidad> habilidades = new ArrayList<Habilidad>();
    habilidades.add(habilidad1);
    habilidades.add(habilidad2);
    return habilidades;
    
    }

    /**
     * Agregamos 3 Habilidades que se encuentren relacionadas con un elemento especifico
     */
    public ArrayList<Habilidad> agregarHabilidades(Habilidad habilidad1, Habilidad habilidad2, Habilidad habilidad3){
    ArrayList<Habilidad> habilidades = new ArrayList<Habilidad>();
    habilidades.add(habilidad1);
    habilidades.add(habilidad2);
    habilidades.add(habilidad3);
    return habilidades;
    
    }
}



