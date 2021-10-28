/**
 * Clase que modela e implementa las acciones del estado activado del robot
 */
public class ModoActivado implements EstadoRobot{

  /*Robot que implementa este estado*/  
  Robot cocinero;

    /**
     * Constructor de la clase
     * @param Robot El robot que va a usar el estado
     */  
  public ModoActivado(Robot cocinero){
    this.cocinero = cocinero;
  }

    /**
     * Metodo toString
     * @return String Representacion de la clase en String
     */
    @Override public String toString(){
	return "Modo activado";
    }

    /**
     * Define lo que realiza la accion suspender cuando el robot esta en estado actvado
     */
  @Override public void suspender(){
    System.out.println("Si realmente no querias nada no debiste de activar el robot, "
		       + "ahora haz que el robot se acerque hacia ti, "
		       + "no puede cocinar si no se acerca");
  }

    /**
     * Define lo que realiza la accion activar cuando el robot esta en estado activado
     */
  @Override public void activar(){
    System.out.println("El robot ya esta activo");
  }

    /**
     * Define lo que realiza la accion caminar cuando el robot esta en estado activado
     */
  @Override public void caminar(){
    System.out.println("El robot comenzara a caminar hacia tu mesa");
    this.cocinero.setEstadoActual(this.cocinero.getEstadoCaminando());
  }

    /**
     * Define lo que realiza la accion atender cuando el robot esta en estado activado
     */
  @Override public void atender(){
    System.out.println("El robot no puede atender si no se acerca a la mesa");
  }

    /**
     * Define lo que realiza la accion cocinar cuando el robot esta en estado activado
     */
  @Override public void cocinar(){
    System.out.println("El robot no puede cocinar si no se acerca a la mesa");
  }
}
