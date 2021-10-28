/**
 * Clase que modela el estado atendiendo del robot
 */
public class ModoAtendiendo implements EstadoRobot{
  /*Robot al que se le asigna el estado*/
  public Robot cocinero;

  /**
   * Consturctor de la clase
   * @param Robot Robot que implementa este estado
   */  
  public ModoAtendiendo(Robot cocinero){
    this.cocinero = cocinero;
  }

  /**
    * Metodo toString
    * @return String Representacion de la clase en String
    */   
  @Override public String toString(){
    return "Modo atendiendo";
  }

  /**
   * Define lo que realiza la accion suspender cuando el robot esta en estado atendiendo
   */    
  @Override
  public void suspender(){
    System.out.println("El robot no puede suspenderse mientras atiende.");
  }

  /**
   * Define lo que realiza la accion activar cuando el robot esta en estado atendiendo
   */    
  @Override
  public void activar(){
    System.out.println("El robot ya está activado.");
  }

  /**
   * Define lo que realiza la accion caminar cuando el robot esta en estado atendiendo
   */    
  @Override
  public void caminar(){
    System.out.println("El robot no puede caminar mientras atiende.");
  }

  /**
   * Define lo que realiza la accion atender cuando el robot esta en estado atendiendo
   */    
  @Override
  public void atender(){
      System.out.println("Esta es la coleccion de platillos que tenemos disponibles.\n" +
			 "Que platillo le gustaría que le prepare el robot?\n");
      cocinero.muestraConjuntoMenus();
      System.out.println("Por favor, introdusca el ID del platillo que quiere.\n" +
			 "El ID es el numero que aparece al inicio de cada platillo, antes del nombre");
      cocinero.setPlatoPorCocinar(cocinero.recibirOrden());
      this.cocinero.setEstadoActual(this.cocinero.getEstadoCocinando());
  }

  /**
   * Define lo que realiza la accion cocinar cuando el robot esta en estado atendiendo
   */    
  @Override
  public void cocinar(){
    System.out.println("El robot no  puede empezar a cocinar si no le has dado una orden");
  }
}
