/**
 * Clase que implementa los métodos de la clase principal Menu.
 */
public class MenuEspecial implements Menu{
  //implements Iterable{

  /**
   * Tabla de platillos.
   */
  protected Hashtable platillos;
  
  /**
   * Implementa el método de la clase principal y muestra los platillos del menú especial.
   */
   public void mostrarPlatillos(){
   System.out.println(platillos);
   }  
}