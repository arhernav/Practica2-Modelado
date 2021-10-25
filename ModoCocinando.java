public class ModoCocinando implements EstadoRobot{

  public Robot cocinero;
  
  public ModoCocinando(Robot cocinero){
    this.cocinero = cocinero;
  }
  
  @Override
  public void suspender(){
    System.out.println("Su comida está lista.");
    System.out.println("¡¡¡BUEN PROVECHO!!!");
    this.cocinero.setEstadoActual(this.cocinero.getEstadoSuspendido());
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
    System.out.println("El robot no puede atender mientras cocina.");
  }
  
  @Override
  public void cocinar(){
    System.out.println("El robot comenzará a cocinar.");
    this.cocinero.setEstadoActual(this.cocinero.getEstadoCocinando());
  }
  
}