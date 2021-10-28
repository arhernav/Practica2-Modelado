/**
 * Clase que modela el estado cocinando del robot
 */
public class ModoCocinando implements EstadoRobot{

  /*Robot al que se le asigna el estado*/  
  public Robot cocinero;

  /**
   * Consturctor de la clase
   * @param Robot Robot que implementa este estado
   */     
  public ModoCocinando(Robot cocinero){
    this.cocinero = cocinero;
  }

  /**
   * Metodo toString
   * @return String Representacion de la clase en String
   */    
  @Override public String toString(){
    return "Modo cocinando";
  }

  /**
   * Define lo que realiza la accion suspender cuando el robot esta en estado cocinando
   */  
  @Override
  public void suspender(){
    System.out.println("El robot no puede suspenderse mientras esta cocinando");
  }

  /**
   * Define lo que realiza la accion activar cuando el robot esta en estado cocinando
   */   
  @Override
  public void activar(){
    System.out.println("El robot ya está activado.");
  }

  /**
   * Define lo que realiza la accion caminar cuando el robot esta en estado cocinando
   */   
  @Override
  public void caminar(){
    System.out.println("El robot no puede caminar mientras cocina.");
  }

  /**
   * Define lo que realiza la accion atender cuando el robot esta en estado cocinando
   */   
  @Override
  public void atender(){
    System.out.println("El robot debe de terminar la orden antes de pasar a la siguiente");
  }

  /**
   * Define lo que realiza la accion cocinar cuando el robot esta en estado cocinando
   */   
  @Override
  public void cocinar(){
    System.out.println("El robot comenzará a cocinar su pedido.");
    Plato platoPorCocinar =  cocinero.getPlatoPorCocinar();
    if(platoPorCocinar == null){
      System.out.println("Lo sentimos, ha ocurrido un error");
      return;
    }
    platoPorCocinar.prepararPlatillo();
    cocinero.setPlatoPorCocinar(0);
    System.out.println("Su platillo esta listo");
    this.cocinero.setEstadoActual(this.cocinero.getEstadoSuspendido());
  }
}