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
    
    protected Iterator iteradorColeccion = platillos.values().iterator();
    
    
    public boolean hasNext(){
      return iteradorColeccion.hasNext();
    }
    
    public Plato next(){
      return platillos.get(iteradorColeccion.next());
    } 
  }
  

  /**
   * Tabla de platillos.
   */
  protected Hashtable<Integer, Plato>  platillos;

  public MenuEspecial(){
    this.platillos = new Hashtable<Integer, Plato>();
  }
    
  /**
   * Metodo iterator
   * Devuelve un iterador de <code>Plato<code> esecializado para este menu
   * @return Iterator<Plato>
   */
  @Override public IteradorEspecial iterator(){
    return new IteradorEspecial();
  }
  
}
