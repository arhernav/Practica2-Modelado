public class ModoSuspendido implements EstadoRobot{
  Robot cocinero;

  public ModoSuspendido(Robot cocinero){
    this.cocinero = cocinero;
  }

  @Override public void suspender(){
      System.out.println("El robot ya esta suspendido");
  }

  @Override public void activar(){
      System.out.println("El robot esta ahora activado");
      this.cocinero.setEstadoActual(this.cocinero.getEstadoActivado());
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
