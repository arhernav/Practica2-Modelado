import java.lang.Iterable;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * Clase para emular el menu diario
 * Esta guarda sus platillos en un <code>ArrayList<code>
 */
public class MenuDiario implements Iterable{
  
  /* Lista de platillos */
  private ArrayList<Plato> platillos;
  
  /**
   * Constructor de la clase.
   * Crea tres hamburguesas para el menú diario.
   */
  public MenuDiario(){
    this.platillos = new ArrayList<Plato>();
    HamburguesaCarnivora deTodo = new HamburguesaCarnivora(21, "Hamburguesa con todo.", 
                                      "Lechuga, cebolla, mayonesa, mostaza, catsup, tomate, queso, carne de res.", 
                                      55.50, true, false);
    HamburguesaVegana tofu = new HamburguesaVegana(22, "Hamburguesa vegana sencilla.",
                                                       "Tofu, lechuga, tomate, cebolla, catsup, mayonesa, mostaza.",
                                                       42.80, false, true);
    HamburguesaCarnivora basica = new HamburguesaCarnivora(23, "Hamburguesa básica.",
                                            "Lechuga, cebolla, tomate, mayonesa, mostaza, catsup, jitomate, carne de res.",
                                            31.20, false, false);
    this.platillos.add(deTodo);
    this.platillos.add(tofu);
    this.platillos.add(basica);
  }
  
  /**
   * Método iterator que devuelve la lista de platillos del menú diario.
   * @return platillos Lista de platillos.
   */
  @Override public Iterator iterator(){
    return platillos.iterator();
  }   
}
