public class ModoActivado implements EstadoRobot{

  Robot cocinero;
    
  public ModoActivado(Robot cocinero){
    this.cocinero = cocinero;
  }


  @Override public void suspender(){
    System.out.println("Si realmente no querias nada no debiste de activar el robot, "
		       + "ahora haz que el robot se acerque hacia ti, "
		       + "no puede cocinar si no se acerca");
  }

  @Override public void activar(){
    System.out.println("El robot ya esta activo");
  }

  @Override public void caminar(){
    System.out.println("El robot comenzara a caminar hacia tu mesa");
  }

  @Override public void atender(){
    System.out.println("El robot no puede atender si no se acerca a la mesa");
  }

  @Override public void cocinar(){
    System.out.println("El robot no puede cocinar si no se acerca a la mesa");
  }
}
