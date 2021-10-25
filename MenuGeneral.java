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

  
  @Override public IteradorGeneral iterator(){
    return new IteradorGeneral();
  }
  
}
