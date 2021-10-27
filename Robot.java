import java.util.Hashtable;
import java.util.Scanner;
import java.util.Iterator;

public class Robot{
  protected Hashtable<Integer, Plato> conjuntoMenus;
  protected EstadoRobot estadoActual;
  protected ModoSuspendido estadoSuspendido;
  protected ModoActivado estadoActivado;
  protected ModoCaminando estadoCaminando;
  protected ModoAtendiendo estadoAtendiendo;
  protected ModoCocinando estadoCocinando;
  protected Integer platoPorCocinar = 0;


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
  
  protected void setEstadoActual(EstadoRobot estadoPorAsignar){
    this.estadoActual = estadoPorAsignar;
  }
  
  protected String getEstadoActual(){
    return this.estadoActual.toString();
  }
  
  protected EstadoRobot getEstadoSuspendido(){
    return this.estadoSuspendido;
  }
  
  protected EstadoRobot getEstadoActivado(){
    return this.estadoActivado;
  }
  
  protected EstadoRobot getEstadoCaminando(){
    return this.estadoCaminando;
  }
  
  protected EstadoRobot getEstadoAtendiendo(){
    return this.estadoAtendiendo;
  }
  
  protected EstadoRobot getEstadoCocinando(){
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

    protected int recibirOrden(){
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
    
    protected boolean checarOrdenValida(Integer id){
 for(Plato plato:this.conjuntoMenus.values()){
     if(plato.id == id) return true;
 }
 return false;
    }

    protected void setPlatoPorCocinar(int platoPorCocinar){
 this.platoPorCocinar = platoPorCocinar;
    }

    protected  Plato getPlatoPorCocinar(){
        for(Plato plato: this.conjuntoMenus.values()){
     if(plato.id == this.platoPorCocinar) return plato;
 }
 return null;
    }
    
  
}
