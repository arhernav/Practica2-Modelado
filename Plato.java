/**
 * Clase abstracta Plato.
 * Implementa el  algoritmo base para realizar una hamburguesa.
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
   * Método que imprime los datos de una hamburguesa vegana 
   * luego de comprobar si tiene ciertos ingredientes.
   */
  @Override public String toString(){
    String conQueso;
    String esVegetariana;
    if(this.queso){
      conQueso = "Hamburguesa con queso";
    }else{
      conQueso = "Hamburguesa sin queso";
    }
    if(this.vegetariano){
      esVegetariana = " y vegetariana";
    }else{
      esVegetariana = "";
    }
    return this.id + ".- " + this.nombrePlatillo + ": " + this.descripcion +
      " Precio: $" + this.precio + ". " + conQueso + esVegetariana;
  }
    
  /**
   * Método para iniciar y finalizar la preparación de una hamburguesa.
   * Hace uso de todos los demás metodos auxiliares de esta clase.
   */
  public void prepararPlatillo(){
    System.out.println("Preparando la hamburguesa: " + this.id + ".-" + this.nombrePlatillo);
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
  
  /**
   * Método que le muestra al usuario que se le está colocando el pan inferior de la hamburguesa.
   * Forma parte de imprimir la preparación de la hamburguesa para que no se impaciente el ususario.
   */
  private void ponerBase(){
    System.out.println("Colocando el pan inferior de la hamburguesa");
  }

  /**
   * Método que le muestra al usuario que se le está poniendo la mayonesa a la hamburguesa.
   * Forma parte de imprimir la preparación de la hamburguesa para que no se impaciente el ususario.
   */
  private void ponerMayonesa(){
    System.out.println("Añadiendo la mayonesa");
  }

  /**
   * Método que le muestra al usuario que se le está poniendo la mostaza a la hamburguesa.
   * Forma parte de imprimir la preparación de la hamburguesa para que no se impaciente el ususario.
   */
  private void ponerMostaza(){
    System.out.println("Añadiendo la mostaza");
  }

  /**
   * Método abstracto que aplica el patrón Template.
   * Pone tofu a la hamburguesa vegana o un tipo de corte a la hamburguesa carnívora.
   */
  abstract String prepararCarne();
  
  /**
   * Método que le muestra al usuario que se le está poniendo la carne o tofu a la hamburguesa 
   * dependiendo si es vegana o carnívora.
   * Forma parte de imprimir la preparación de la hamburguesa para que no se impaciente el ususario.
   */
  private void ponerCarne(){
    System.out.println("Añadiendo el " + this.prepararCarne() + "especialmente preparado para esta hamburguesa");
  }
  
  /**
   * Método que le muestra al usuario que se le está poniendo el queso a la hamburguesa 
   * sólo si el queso es uno de sus ingredientes.
   * Forma parte de imprimir la preparación de la hamburguesa para que no se impaciente el ususario.
   */
  private void ponerQueso(){
    if(this.queso){
      System.out.println("Añadiendo Queso");
    }
  }

  /**
   * Método que le muestra al usuario que se le están poniendo los vegetales a la hamburguesa.
   * Forma parte de imprimir la preparación de la hamburguesa para que no se impaciente el ususario.
   */
  private void ponerVegetales(){
    System.out.println("Añadiendo un conjunto de tomate, lechuga y cebolla");
  }
  
  /**
   * Método que le muestra al usuario que se le está poniendo catsup a la hamburguesa.
   * Forma parte de imprimir la preparación de la hamburguesa para que no se impaciente el ususario.
   */
  private void ponerCatsup(){
    System.out.println("Añadiendo la catsup");
  }
  
  /**
   * Método que le muestra al usuario que se le está colocando el pan superior a la hamburguesa.
   * Forma parte de imprimir la preparación de la hamburguesa para que no se impaciente el ususario.
   */
  private void ponerTapa(){
    System.out.println("Añadiendo la tapa de la hamburguesa");
  }
}