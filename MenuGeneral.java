/**
 * Clase que implementa los métodos de la clase principal Menu.
 */
public class MenuGeneral implements Menu{
  //implements Iterable{

  /**
   * Arreglo de platillos.
   */
  protected Plato[] platillos;
  
  /**
   * Implementa el método de la clase principal y muestra los platillos del menú general.
   */
  public void mostrarPlatillos(){
    System.out.println(platillos);
  }
}