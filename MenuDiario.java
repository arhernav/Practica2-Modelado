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

  @Override public Iterator iterator(){
    return platillos.iterator();
  }
    
}
