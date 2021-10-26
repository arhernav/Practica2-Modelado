import java.lang.Iterable;
import java.util.Iterator;

/**
 * Clase que implementa los métodos de la clase principal Menu.
 */
public class MenuGeneral implements Iterable{
  
  protected class IteradorGeneral implements Iterator{
    
    int indice = -1;
    
    public boolean hasNext(){
      if(this.indice < platillos.length-1)return true;
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
    platillos[0] = new HamburguesaVegetariana(1, "Hamburguesa vegetariana neutral.",
                                             "Tofu, lechuga, tomate, cebolla, mostaza, mayonesa, catsup, queso.",
                                              49.70, True, True);
    platillos[1] = new HamburguesaCarnivora(2, "Hamburguesa carne cocida.",
                                            "Lechuga, cebolla, tomate, mostaza, mayonesa, queso, catsup, carne de res (término cocida).",
                                            37.10, True, False);
    platillos[2] = new HamburguesaCarnivora(3, "Hamburguesa carne media.",
                                            "Lechuga, cebolla, tomate, catsup, mostaza, mayonesa, carne de res (término medio).",
                                            22.00, False, False);
  }
  
  @Override public IteradorGeneral iterator(){
    return new IteradorGeneral();
  }
  
}
