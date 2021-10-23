import java.util.ArrayList;

/**
 * Clase que implementa los métodos de la clase principal Menu.
 */
public class MenuDiario implements Menu {
  //implements Iterable{

  /**
   * Lista de platillos.
   */
  protected ArrayList<Plato> platillos;
  
  /**
   * Implementa el método de la clase principal y muestra los platillos del menú diario.
   */
  public void mostrarPlatillos(){
    System.out.println(platillos);
  }
}