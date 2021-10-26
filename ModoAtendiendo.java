public class ModoAtendiendo implements EstadoRobot{

  public Robot cocinero;
  
  public ModoAtendiendo(Robot cocinero){
    this.cocinero = cocinero;
  }

    @Override public String toString(){
 return "Modo atendiendo";
    }
  
  @Override
  public void suspender(){
    System.out.println("El robot no puede suspenderse mientras atiende.");
  }
  
  @Override
  public void activar(){
    System.out.println("El robot ya está activado.");
  }
  
  @Override
  public void caminar(){
    System.out.println("El robot no puede caminar mientras atiende.");
  }
  
  @Override
  public void atender(){
    System.out.println("Falta implementar el recibir la orden");
    this.cocinero.setEstadoActual(this.cocinero.getEstadoCocinando());
  }
  
  @Override
  public void cocinar(){
    System.out.println("El robot no  puede empezar a cocinar si no le has dado una orden");
  }
}
