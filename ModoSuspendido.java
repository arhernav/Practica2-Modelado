public class ModoSuspendido implements EstadoRobot{
  Robot cocinero;

  public ModoSuspendido(Robot cocinero){
    this.cocinero = cocinero;
  }

    @Override public String toString(){
	return "Modo suspendido";
    }  

  @Override public void suspender(){
    System.out.println("El robot ya esta suspendido");
  }

  @Override public void activar(){
    System.out.println("El robot esta ahora activado");
    this.cocinero.setEstadoActual(this.cocinero.getEstadoActivado());
  }

  @Override public void caminar(){
    System.out.println("El robot debe de ser activado antes de poder caminar");
  }

  @Override public void atender(){
    System.out.println("El robot debe de ser activado antes de poder atender");
  }

  @Override public void cocinar(){
    System.out.println("El robot debe de ser activado antes de poder cocinar");
  }
}
