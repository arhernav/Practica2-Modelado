import java.util.Hashtable;

public class Robot{
  
  public MenuGeneral menuGeneral;
  public MenuDiario menuDiario;
  public MenuEspecial menuEspecial;
  public EstadoRobot estadoActual;
  public ModoSuspendido estadoSuspendido;
  public ModoActivado estadoActivado;
  public ModoCaminando estadoCaminando;
  public ModoAtendiendo estadoAtendiendo;
  public ModoCocinando estadoCocinando;
  public Plato platoPorCocinar;
  public Hashtable<Integer, Plato> ConjuntoMenus;
  
  public void setEstadoActual(EstadoRobot estadoPorAsignar){
    this.estadoActual = estadoPorAsignar;
  }
  
  public EstadoRobot getEstadoSuspendido(){
    return this.estadoSuspendido;
  }
  
  public EstadoRobot getEstadoActivado(){
    return this.estadoActivado;
  }
  
  public EstadoRobot getEstadoCaminando(){
    return this.estadoCaminando;
  }
  
  public EstadoRobot getEstadoAtendiendo(){
    return this.estadoAtendiendo;
  }
  
  public EstadoRobot getEstadoCocinando(){
    return this.estadoCocinando;
  }
  
  public void suspender(){
    this.estadoActual.suspender();
  }
  
  public void activar(){
    this.estadoActual.activar();
  }
  
  public void caminar(){
    this.estadoActual.caminar();
  }
  
  public void atender(){
    this.estadoActual.atender();
  } 
  
  public void cocinar(){
    this.estadoActual.cocinar();
  }

  
  
  
}
