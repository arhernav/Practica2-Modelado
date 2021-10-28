/**
 * Modela el modo suspendido del robot
 */
public class ModoSuspendido implements EstadoRobot{

  /*Robot al que se le asigna este estado */  
  Robot cocinero;

  /**
   * Constructor de la clase
   * @param Robot al cual se le asigna el estado
   */  
  public ModoSuspendido(Robot cocinero){
    this.cocinero = cocinero;
  }

  /**
   * Metodo toString
   * @return String Representacion en cadena de la clase
   */  
  @Override public String toString(){
    return "Modo suspendido";
  } 

  /**
   * Define el comportamiento de suspender cuando el robot esta en estado suspendido
   */  
  @Override public void suspender(){
    System.out.println("El robot ya esta suspendido");
  }

  /**
   * Define el comportamiento de activar cuando el robot esta en estado suspendido
   */    
  @Override public void activar(){
    System.out.println("El robot esta ahora activado");
    this.cocinero.setEstadoActual(this.cocinero.getEstadoActivado());
  }

  /**
   * Define el comportamiento de caminar cuando el robot esta en estado suspendido
   */    
  @Override public void caminar(){
    System.out.println("El robot debe de ser activado antes de poder caminar");
  }

  /**
   * Define el comportamiento de atender cuando el robot esta en estado suspendido
   */    
  @Override public void atender(){
    System.out.println("El robot debe de ser activado antes de poder atender");
  }

  /**
   * Define el comportamiento de cocinar cuando el robot esta en estado suspendido
   */    
  @Override public void cocinar(){
    System.out.println("El robot debe de ser activado antes de poder cocinar");
  }
}