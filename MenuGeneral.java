import java.lang.Iterable;
import java.util.Iterator;

/**
 * Clase que implementa los métodos de la clase principal Menu.
 */
public class MenuGeneral implements Iterable{
  
  protected class IteradorGeneral implements Iterator{
    
    int indice = 0;
    
    public boolean hasNext(){
      if(this.indice < platillos.length)return true;
      return false;
    }
    
    public Plato next(){
      Plato plato = platillos[indice];
      this.indice++;
      return plato;
    }
  }
    
  
  /**
   * Arreglo de platillos.
   */
  protected Plato[] platillos;
  
  public MenuGeneral(){
    this.platillos = new Plato[3];
    platillos[0] = new HamburguesaVegana(11, "Hamburguesa vegetariana neutral.",
                                             "Tofu, lechuga, tomate, cebolla, mostaza, mayonesa, catsup, queso.",
                                              49.70, true, true);
    platillos[1] = new HamburguesaCarnivora(12, "Hamburguesa carne cocida.",
                                            "Lechuga, cebolla, tomate, mostaza, mayonesa, queso, catsup, carne de res (término cocida).",
                                            37.10, true, false);
    platillos[2] = new HamburguesaCarnivora(13, "Hamburguesa carne media.",
                                            "Lechuga, cebolla, tomate, catsup, mostaza, mayonesa, carne de res (término medio).",
                                            22.00, false, false);
  }
  
  @Override public IteradorGeneral iterator(){
    return new IteradorGeneral();
  }
  
}
