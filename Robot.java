public class Robot{
  
  public MenuGeneral menuGeneral;
  public MenuDiario menuDiario;
  public MenuEspecial menuEspecial;
  public EstadoRobot estadoActual;
  public ModoSuspedido estadoSuspendido;
  public ModoActivado estadoActivado;
  public ModoCamimando estadoCaminando;
  public ModoAtendiendo estadoAtendiendo;
  public ModoCocinando estadoCocinando;
  
  public void setEstadoActual(EstadoRobot estadoPorAsignar){
    this.estadoActual = estadoPorAsignar;
  }
  
  public EstadoRobot getEstadoSuspendido(){
    return estadoSuspendido;
  }
  
  public EstadoRobot getEstadoActivado(){
    return estadoActivado;
  }
  
  public EstadoRobot getEstadoCaminando(){
    return estadoCaminando;
  }
  
  public EstadoRobot getEstadoAtendiendo(){
    return estadoAtendiendo;
  }
  
  public EstadoRobot getEstadoCocinando(){
    return estadoCocinando;
  }
  
  public void suspender(){
    this.estadoActual.suspender();
  }
  
  public void activar(){
    this.estadoActivado.activar();
  }
  
  public void caminar(){
    this.estadoActivado.caminar();
  }
  
  public void atender(){
    this.estadoActivado.atender();
  } 
  
  public void cocinar(){
    this.estadoActivado.cocinar();
  }
  
}
