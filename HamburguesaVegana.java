/**
 * Clase que aplica el patrón Template al determinar la preparación de las hamburguesas veganas.
 */
public class HamburguesaVegana extends Plato{
  
  /**
   * Método que crea una hamburguesa Vegana.
   */
  public HamburguesaVegana(int id, String nombrePlatillo, String descripcion, double precio, boolean queso, boolean vegetariano ){
    this.id = id;
    this.nombrePlatillo = nombrePlatillo;
    this.descripcion = descripcion;
    this.precio = precio;
    this.queso = queso;
    this.vegetariano = vegetariano;
  }
  
  /**
   * Método que prepara el tofu de las hamburguesas veganas.
   */
  @Override String prepararCarne(){
    return "sustituto de carne a base de tofu ";
  }
}
