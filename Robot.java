import java.util.Hashtable;
import java.util.Scanner;
import java.util.Iterator;

public class Robot{
  
  public MenuGeneral menuGeneral;
  public MenuDiario menuDiario;
  public MenuEspecial menuEspecial;
  public Hashtable<Integer, Plato> conjuntoMenus;
  public EstadoRobot estadoActual;
  public ModoSuspendido estadoSuspendido;
  public ModoActivado estadoActivado;
  public ModoCaminando estadoCaminando;
  public ModoAtendiendo estadoAtendiendo;
  public ModoCocinando estadoCocinando;
  public Plato platoPorCocinar;


    public Robot(){
	this.menuGeneral = new MenuGeneral();
	this.menuDiario = new MenuDiario();
	this.menuEspecial = new MenuEspecial();
	this.conjuntoMenus = new  Hashtable<Integer, Plato>();
	this.estadoSuspendido = new ModoSuspendido(this);
	this.estadoActivado = new ModoActivado(this);
	this.estadoCaminando = new ModoCaminando(this);
	this.estadoAtendiendo = new ModoAtendiendo(this);
	this.estadoCocinando = new ModoCocinando(this);
	this.estadoActual = this.estadoSuspendido;
    }  
  
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

    public void muestraMenu(Iterator iterador){
	while(iterador.hasNext()){
	    System.out.println(iterador.next());
	}
    }

    public void muestraConjuntoMenus(){
	Iterator iteradorGeneral = this.menuGeneral.iterator();
	Iterator iteradorDiario = this.menuDiario.iterator();
	Iterator iteradorEspecial = this.menuEspecial.iterator();
	this.muestraMenu(iteradorGeneral);
	this.muestraMenu(iteradorDiario);
	this.muestraMenu(iteradorEspecial);
    }

    public void recibirOrden(){
	Scanner scanner = new Scanner(System.in);
    }
  
  
}
