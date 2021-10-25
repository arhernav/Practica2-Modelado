public class ModoCaminando implements EstadoRobot{

  Robot cocinero;
    
  public ModoCaminando(Robot cocinero){
    this.cocinero = cocinero;
  }
    
  @Override public void suspender(){
    System.out.println("El robot pasara a suspenderse, pero debiste de haber pedido tu hamburguesa");
    this.cocinero.setEstado(this.cocinero.getEstadoSuspendido());
  }
    
  @Override public void activar(){
    System.out.println("El robot ya esta activado y se dirige hacia ti" +
		       ", dale algo de tiempo, es robot cocinero, no carro de carreras");
  }
    
  @Override public void caminar(){
    System.out.println("El robot ya va en camino hacia ti");
  }
    
  @Override public void atender(){
      System.out.println("El robot lo atendera ahora mismo");
      this.cocinero.setEstadoActual(this.cocinero.getEstadoCocinando);
  }
    
  @Override public void cocinar(){
    System.out.println("El robot debe de lledar a la mesa antes de cocinar");
  }   
}
