import java.lang.Iterable;
import java.util.Iterator;
import java.util.Hashtable;


/**
 * Clase que implementa los métodos de la clase principal Menu.
 */
public class MenuEspecial implements Iterable{

  /////////////////////////////////////////////////////////
  ///////////Falta investigar a cerca de hash tables///////
  ////////////////E implementar////////////////////////////
  protected class IteradorEspecial implements Iterator{ 
    
    public boolean hasNext(){
      return true;
    }
    
    public Plato next(){
      return new HamburguesaCarnivora(0, "plato prueba", "Primer platillo de prueba", 3.24, true, true);
    }
  }
  

  /**
   * Tabla de platillos.
   */
  protected Hashtable<String, Plato>  platillos;
    
  /**
   * Metodo iterator
   * Devuelve un iterador de <code>Plato<code> esecializado para este menu
   * @return Iterator<Plato>
   */
  @Override public IteradorEspecial iterator(){
    return new IteradorEspecial();
  }
  
}
