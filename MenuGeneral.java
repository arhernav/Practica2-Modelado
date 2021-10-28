import java.lang.Iterable;
import java.util.Iterator;

/**
 * Clase que modela el menú general del restaurante.
 * Esta guarda sus platillos en un array.
 */
public class MenuGeneral implements Iterable{
  
  /**
   * Clase interna que itera los elementos del arreglo platillos.
   */
  protected class IteradorGeneral implements Iterator{
    /* Indica donde se encuentra el iterador */
    int indice = 0;
    
    /**
     * Método que se asegura de que haya un elemento siguiente en el arreglo de platillos.
     * @return boolean Elemento siguiente.
     */
    public boolean hasNext(){
      if(this.indice < platillos.length)return true;
      return false;
    }
    
    /**
     * Método que devuelve los elementos del arreglo platillos.
     * @return plato Tipo de hamburguesa.
     */
    public Plato next(){
      Plato plato = platillos[indice];
      this.indice++;
      return plato;
    }
  }
  
  //----------------------------------------------------------
      
  /* Arreglo de platillos */
  private Plato[] platillos;
  
  /**
   * Constructor de la clase.
   * Crea tres hamburguesas para el menú general.
   */
  public MenuGeneral(){
    this.platillos = new Plato[3];
    platillos[0] = new HamburguesaVegana(11, "Hamburguesa vegana neutral.",
                                             "Tofu, lechuga, tomate, cebolla, mostaza, mayonesa, catsup, queso.",
                                              49.70, true, true);
    platillos[1] = new HamburguesaCarnivora(12, "Hamburguesa carne cocida.",
                                            "Lechuga, cebolla, tomate, mostaza, mayonesa, queso, catsup, carne de res (término cocida).",
                                            37.10, true, false);
    platillos[2] = new HamburguesaCarnivora(13, "Hamburguesa carne media.",
                                            "Lechuga, cebolla, tomate, catsup, mostaza, mayonesa, carne de res (término medio).",
                                            22.00, false, false);
  }
  
  /**
   * Método iterator que devuelve un iterador para este menú.
   * @return IteradorGeneral - Iterador del menú
   */
  @Override public IteradorGeneral iterator(){
    return new IteradorGeneral();
  }
}