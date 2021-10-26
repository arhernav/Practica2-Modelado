public class ModoCocinando implements EstadoRobot{

  public Robot cocinero;
  
  public ModoCocinando(Robot cocinero){
    this.cocinero = cocinero;
  }
    @Override public String toString(){
	return "Modo cocinando";
    }
  
  @Override
  public void suspender(){
    System.out.println("El robot no puede suspenderse mientras esta cocinando");
  }
  
  @Override
  public void activar(){
    System.out.println("El robot ya está activado.");
  }
  
  @Override
  public void caminar(){
    System.out.println("El robot no puede caminar mientras cocina.");
  }
  
  @Override
  public void atender(){
    System.out.println("El robot debe de terminar la orden antes de pasar a la siguiente");
  }
  
  @Override
  public void cocinar(){
    System.out.println("El robot comenzará a cocinar.");
    this.cocinero.setEstadoActual(this.cocinero.getEstadoSuspendido());
  }
  
}
