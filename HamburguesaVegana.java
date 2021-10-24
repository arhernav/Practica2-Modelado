public class HamburguesaVegana extends Plato{

    public HamburguesaVegana(int id, String nombrePlatillo, String descripcion, double precio, boolean queso, boolean vegetariano ){
	this.id = id;
	this.nombrePlatillo = nombrePlatillo;
	this.descripcion = descripcion;
	this.precio = precio;
	this.queso = queso;
	this.vegetariano = vegetariano;
  }

    @Override String prepararCarne(){
	return "sustituto de carne a base de tofu ";
    }
}
