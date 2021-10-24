/**
 * Clase abstracta Plato
 * Implementa el  algoritmo base para realizar una hamburguesa
 */
public abstract class Plato{
    /* Id del platillo */
    int id;
    /* Nombre del platillo */
    String nombrePlatillo;
    /* Descripcion del platillo */
    String descripcion;
    /* Precio  del platillo */
    double precio;
    /* Boolean indicando si lleva queso o no */
    boolean queso;
    /* Boolean indicando si es vegetariana o no */
    boolean vegetariano;

    /**
     * Metodo para preparar una hamburguesa.
     * Este hace uso de todos los demas metodos auxiliares de esta clase
     */
    public void prepararPlatillo(){
 this.ponerBase();
 this.ponerMayonesa();
 this.ponerMostaza();
 this.ponerCarne();
 this.ponerQueso();
 this.ponerVegetales();
 this.ponerCatsup();
 this.ponerTapa();
 System.out.println("Hamburguesa terminada");
    }

    private void ponerBase(){
 System.out.println("Colocando el pan inferior de la hamburguesa");
    }

    private void ponerMayonesa(){
 System.out.println("Añadiendo la mayonesa");
    }

    private void ponerMostaza(){
 System.out.println("Añadiendo la mostaza");
    }

    abstract String prepararCarne();

    private void ponerCarne(){
        System.out.println("Añadiendo el " + this.prepararCarne() + "especialmente preparado para esta hamburguesa");
    }

    private void ponerQueso(){
 if(this.queso){
     System.out.println("Añadiendo Queso");
 }
    }

    private void ponerVegetales(){
 System.out.println("Añadiendo un conjunto de tomate, lechuga y cebolla");
    }

    private void ponerCatsup(){
 System.out.println("Añadiendo la catsup");
    }

    private void ponerTapa(){
 System.out.println("Añadiendo la tapa de la hamburguesa");
    }
    
}
