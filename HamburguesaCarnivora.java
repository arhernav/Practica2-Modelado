/**
 * Clase que aplica el patrón Template.
 */
public class HamburguesaCarnivora extends Plato{
  /**
   * Crea una hamburguesa carnívora.
   */
    public HamburguesaCarnivora(int id, String nombrePlatillo, String descripcion, double precio, boolean queso, boolean vegetariano ){
	this.id = id;
	this.nombrePlatillo = nombrePlatillo;
	this.descripcion = descripcion;
	this.precio = precio;
	this.queso = queso;
	this.vegetariano = vegetariano;
  }

    @Override  String prepararCarne(){
	return "corte de carne ";
    }
  
}
