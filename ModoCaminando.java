/**
 * Clase que modela el estado Caminando
 */
public class ModoCaminando implements EstadoRobot{

  /*Robot que implementa este estado*/
  Robot cocinero;

  /**
   * Constructor de la clase
   */   
  public ModoCaminando(Robot cocinero){
    this.cocinero = cocinero;
  }

  /**
    * Metodo toString
    * @return String Representacion de la clase en String
    */ 
  @Override public String toString(){
    return "Modo caminando";
  }

  /**
   * Define lo que realiza la accion suspender cuando el robot esta en estado caminando
   */  
  @Override public void suspender(){
    System.out.println("El robot pasara a suspenderse, pero debiste de haber pedido tu hamburguesa");
    this.cocinero.setEstadoActual(this.cocinero.getEstadoSuspendido());
  }

  /**
   * Define lo que realiza la accion activar cuando el robot esta en estado caminando
   */  
  @Override public void activar(){
    System.out.println("El robot ya esta activado y se dirige hacia ti" +
		       ", dale algo de tiempo, es robot cocinero, no carro de carreras");
  }

  /**
   * Define lo que realiza la accion caminar cuando el robot esta en estado caminando
   */    
  @Override public void caminar(){
    System.out.println("El robot ya va en camino hacia ti");
  }

  /**
   * Define lo que realiza la accion atender cuando el robot esta en estado caminando
   */    
  @Override public void atender(){
      System.out.println("El robot lo atendera ahora mismo");
      this.cocinero.setEstadoActual(this.cocinero.getEstadoAtendiendo());
  }

  /**
   * Define lo que realiza la accion cocinar cuando el robot esta en estado caminando
   */    
  @Override public void cocinar(){
    System.out.println("El robot debe de llegar a la mesa antes de cocinar");
  }   
}
