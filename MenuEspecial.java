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
  HamburguesaCarnivora plus = new HamburguesaCarnivora(1, "Hamburguesa plus",
                                                       "Lechuga, queso, carne de res, mayonesa, mostaza, tomate, cebolla, catsup."
                                                       71.15, True, False);
  HamburguesaCarnivora normal = new HamburguesaCarnivora(2, "Hamburguesa normal",
                                                         "Lechuga, carne de res, mayonesa, mostaza, tomate, catsup, cebolla.",
                                                         64.95, False, False);
  HamburguesaVegetariana comun = new HamburguesaVegetariana(3, "Hamburguesa común",
                                                            "Lechuga, carne de res, mayonesa, mostaza, tomate, catsup, cebolla, queso.",
                                                            58.30, True, True);
  
  public MenuEspecial(){
    this.platillos = new Hashtable<Integer, Plato>();
    platillos.put(1, plus);
    platillos.put(2, normal);
    platillos.put(3, comun);
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