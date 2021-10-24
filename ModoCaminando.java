public class ModoCaminando implements EstadoRobot{

  Robot cocinero;
    
  public ModoCaminando(Robot cocinero){
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
