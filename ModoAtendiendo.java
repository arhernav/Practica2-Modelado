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
      System.out.println("Esta es la coleccion de platillos que tenemos disponibles.\n" +
			 "Que platillo le gustaría que le prepare el robot?\n");
      cocinero.muestraConjuntoMenus();
      System.out.println("Por favor, introdusca el ID del platillo que quiere.\n" +
			 "El ID es el numero que aparece al inicio de cada platillo, antes del nombre");
      cocinero.setPlatoPorCocinar(cocinero.recibirOrden());
      this.cocinero.setEstadoActual(this.cocinero.getEstadoCocinando());
  }
  
  @Override
  public void cocinar(){
    System.out.println("El robot no  puede empezar a cocinar si no le has dado una orden");
  }
}
