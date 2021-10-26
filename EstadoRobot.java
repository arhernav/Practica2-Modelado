/**
 * Interfaz que contiene los estados del robot.
 */
public interface EstadoRobot{
  
  /* Estado suspendido */
  public void suspender();
  /* Estado caminando */
  public void caminar();
  /* Estado activado */
  public void activar();
  /* Estado atendiendo */
  public void atender();
  /* Estado cocinando */
  public void cocinar();
}
