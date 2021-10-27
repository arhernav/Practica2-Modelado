/**
 * Interfaz que contiene las acciones que puede realizar el robot en cada estado
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
