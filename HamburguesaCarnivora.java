/**
 * Clase que aplica el patrón Template al determinar la preparación de las hamburguesas carnívoras.
 */
public class HamburguesaCarnivora extends Plato{
  
  /**
   * Método que crea una hamburguesa carnívora.
   */
  public HamburguesaCarnivora(int id, String nombrePlatillo, String descripcion, double precio, boolean queso, boolean vegetariano ){
    this.id = id;
    this.nombrePlatillo = nombrePlatillo;
    this.descripcion = descripcion;
    this.precio = precio;
    this.queso = queso;
    this.vegetariano = vegetariano;
  }

  /**
   * Método que prepara la carne de las hamburguesas carnívoras.
   */
  @Override  String prepararCarne(){
    return "corte de carne ";
  }
}
