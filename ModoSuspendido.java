public class ModoSuspendido implements EstadoRobot{
  Robot cocinero;

  public ModoSuspendido(Robot cocinero){
    this.cocinero = cocinero;
  }

  @Override public void suspender(){
      this.cocinero.setEstado(cocinero.getEstadoActual());
  }

  @Override public void activar(){
      this.cocinero.setEstado(cocinero.getEstadoActual());
  }

  @Override public void caminar(){
      this.cocinero.setEstado(cocinero.getEstadoActual());
  }

  @Override public void atender(){
      this.cocinero.setEstado(cocinero.getEstadoActual());
  }

  @Override public void cocinar(){
      this.cocinero.setEstado(cocinero.getEstadoActual());
  }
}