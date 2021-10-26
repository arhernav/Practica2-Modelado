import java.util.Hashtable;
import java.util.Scanner;
import java.util.Iterator;

public class Robot{
  public Hashtable<Integer, Plato> conjuntoMenus;
  public EstadoRobot estadoActual;
  public ModoSuspendido estadoSuspendido;
  public ModoActivado estadoActivado;
  public ModoCaminando estadoCaminando;
  public ModoAtendiendo estadoAtendiendo;
  public ModoCocinando estadoCocinando;
  public Plato platoPorCocinar;


    public Robot(){
	this.estadoSuspendido = new ModoSuspendido(this);
	this.estadoActivado = new ModoActivado(this);
	this.estadoCaminando = new ModoCaminando(this);
	this.estadoAtendiendo = new ModoAtendiendo(this);
	this.estadoCocinando = new ModoCocinando(this);
	this.estadoActual = this.estadoSuspendido;
	this.conjuntoMenus = new  Hashtable<Integer, Plato>();
    }

    public void agregaMenu(Iterator iterador){
	while(iterador.hasNext()){
	    Plato plato = (Plato) iterador.next();
	    this.conjuntoMenus.put(plato.id, plato);
	}
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
        Iterator iteradorConjunto = this.conjuntoMenus.values().iterator();
	while(iteradorConjunto.hasNext()){
	    System.out.println(iteradorConjunto.next());
	}
    }

    public int recibirOrden(){
	Scanner scan = new Scanner(System.in);
	Integer orden = 0;
        do{
	    System.out.print("Ingrese el id de la hamburguesa que quiere: ");
        if(scan.hasNextInt()){
            orden = scan.nextInt();
	    if(!this.checarOrdenValida(orden))
		System.out.println("Recuerda que debes de ordenar con un id" +
				   " valido. El id es el numero que aparece antes" +
				   " del nombre de la hamburguesa");
        }else{
            scan.nextLine();
            System.out.println("Recuerda que debes de ordenar con un id" +
				   " valido. El id es el numero que aparece antes" +
				   " del nombre de la hamburguesa");
        }
	}while(!this.checarOrdenValida(orden));
	return orden;
    }
    
    public boolean checarOrdenValida(Integer id){
	for(Plato plato:this.conjuntoMenus.values()){
	    if(plato.id == id) return true;
	}
	return false;
    }
  
  
}
