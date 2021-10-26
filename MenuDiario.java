import java.lang.Iterable;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * Clase que implementa los métodos de la clase principal Menu.
 */
public class MenuDiario implements Iterable{
  /**
   * Lista de platillos.
   */
  protected ArrayList<Plato> platillos;

  public MenuDiario(){
    this.platillos = new ArrayList<Plato>();
    HamburguesaCarnivora deTodo = new HamburguesaCarnivora(1, "Hamburguesa con todo.", 
                                      "Lechuga, cebolla, mayonesa, mostaza, catsup, tomate, queso, carne de res.", 
                                      55.50, True, False);
    HamburguesaVegetariana tofu = new HamburguesaVegetariana(2, "Hamburguesa vegetariana sencilla.",
                                                       "Tofu, lechuga, tomate, cebolla, catsup, mayonesa, mostaza.",
                                                       42.80, False, True);
    HamburguesaCarnivora basica = new HamburguesaCarnivora(3, "Hamburguesa básica.",
                                            "Lechuga, cebolla, tomate, mayonesa, mostaza, catsup, jitomate, carne de res.",
                                            31.20, False, False);
    this.platillos.add(deTodo);
    this.platillos.ddd(tofu);
    this.platillos.add(basica);
  }

  @Override public Iterator iterator(){
    return platillos.iterator();
  }
    
}
