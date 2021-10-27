import java.lang.Iterable;
import java.util.Iterator;
import java.util.Hashtable;

/**
 * Clase que modela el menu de hamburguesas especiales
 * Guarda sus platillos en un HashTable
 */
public class MenuEspecial implements Iterable{ 

  /* Tabla de platillos */
  private Hashtable<Integer, Plato>  platillos;
  
  /**
   * Constructor de la clase
   * Crea tres hamburguesas para el menú especial.
   */
  public MenuEspecial(){
    this.platillos = new Hashtable<Integer, Plato>();
    HamburguesaCarnivora plus = new HamburguesaCarnivora(31, "Hamburguesa plus",
        "Lechuga, queso, carne de res, mayonesa, mostaza, tomate, cebolla, catsup.",
        71.15, true, false);
    HamburguesaCarnivora normal = new HamburguesaCarnivora(32, "Hamburguesa normal",
          "Lechuga, carne de res, mayonesa, mostaza, tomate, catsup, cebolla.",
          64.95, false, false);
    HamburguesaVegana comun = new HamburguesaVegana(33, "Hamburguesa vegana común",
          "Lechuga, carne de res, mayonesa, mostaza, tomate, catsup, cebolla, queso.",
          58.30, true, true);
    platillos.put(1, plus);
    platillos.put(2, normal);
    platillos.put(3, comun);
  }
    
  /**
   * Metodo iterator
   * Devuelve un iterador de <code>Plato<code> esecializado para este menu
   * @return Iterator<Plato>
   */
  @Override public Iterator iterator(){
      return this.platillos.values().iterator();
  }
}
