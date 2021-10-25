public class ModoAtendiendo implements EstadoRobot{

  public Robot cocinero;
  
  public ModoAtendiendo(Robot cocinero){
    this.cocinero = cocinero;
  }
  
  @Override
  public void suspender(){
    System.out.println("El robot no puede suspenderse mientras atiende.");
  }
  
  @Override
  public void activar(){
    Systm.out.println("El robot ya está activado.");
  }
  
  @Override
  public void caminar(){
    System.out.println("El robot no puede caminar mientras atiende.");
  }
  
  @Override
  public void atender(){
    System.out.println("El robot l@ atenderá.");
    this.cocinero.setEstadoActual(this.cocinero.getEstadoAtendiendo());
  }
  
  @Override
  public void cocinar(){
    System.out.println("El robot ha tomado su orden, comenzará a cocinar.");
    this.cocinero.setEstadoActual(this.cocinero.getEstadoCocinando());
  }
  
}