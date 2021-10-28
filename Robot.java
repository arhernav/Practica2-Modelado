import java.util.Hashtable;
import java.util.Scanner;
import java.util.Iterator;

/**
 * Clase que modela el robot cocinero
 */
public class Robot{
  /*Hashtable para almacenar los platos de los menus*/  
  protected Hashtable<Integer, Plato> conjuntoMenus;
  /*Estado actual del robot*/
  protected EstadoRobot estadoActual;
  /*Modo suspendido del Robot*/  
  protected ModoSuspendido estadoSuspendido;
  /*Modo activado del robot*/
  protected ModoActivado estadoActivado;
  /* Modo caminando del robot*/
  protected ModoCaminando estadoCaminando;
  /* Modo atendiendo del robot*/
  protected ModoAtendiendo estadoAtendiendo;
  /*Modo cocinando del robot */
  protected ModoCocinando estadoCocinando;
  /*Integer para obtener el plato que se desea cocinar */
  protected Integer platoPorCocinar = 0;


    /**
     * Constructor de la clase
     */
    public Robot(){
      this.estadoSuspendido = new ModoSuspendido(this);
      this.estadoActivado = new ModoActivado(this);
      this.estadoCaminando = new ModoCaminando(this);
      this.estadoAtendiendo = new ModoAtendiendo(this);
      this.estadoCocinando = new ModoCocinando(this);
      this.estadoActual = this.estadoSuspendido;
      this.conjuntoMenus = new  Hashtable<Integer, Plato>();
    }

    /**
     * Agrega los platillos de algun menu al menu interno del robot
     * Esto permite maneja varios menus y agregar nuevos menus facilmente
     * @param Iterator Iterador del menu que se quiere agregar
     */
    public void agregaMenu(Iterator iterador){
      while(iterador.hasNext()){
       Plato plato = (Plato) iterador.next();
       this.conjuntoMenus.put(plato.id, plato);
      }
    }

  /**
  * Metodo para definir el estado actual del robot
  * @param EstadoRobot Estado al que va a pasar el robor
  */
  protected void setEstadoActual(EstadoRobot estadoPorAsignar){
    this.estadoActual = estadoPorAsignar;
  }

  /**
  * Regresa un String indicando el estado actual del robot
  * @return String Representacion  en cadena del estado actual del robot
  */  
  protected String getEstadoActual(){
    return this.estadoActual.toString();
  }

  /**
   * Regresa el estado suspendido del robot
   * @param EstadoRobot Estado suspendido del robot
   */  
  protected EstadoRobot getEstadoSuspendido(){
    return this.estadoSuspendido;
  }

  /**
   * Regresa el estado activado del robot
   * @param EstadoRobot Estado activado del robot
   */    
  protected EstadoRobot getEstadoActivado(){
    return this.estadoActivado;
  }

  /**
   * Regresa el estado caminando del robot
   * @param EstadoRobot Estado caminando del robot
   */    
  protected EstadoRobot getEstadoCaminando(){
    return this.estadoCaminando;
  }

  /**
   * Regresa el estado atendiendo del robot
   * @param EstadoRobot Estado atendiendo del robot
   */    
  protected EstadoRobot getEstadoAtendiendo(){
    return this.estadoAtendiendo;
  }

  /**
   * Regresa el estado cocinando del robot
   * @param EstadoRobot Estado cocinando del robot
   */   
  protected EstadoRobot getEstadoCocinando(){
    return this.estadoCocinando;
  }

  /**
   * Realiza la accion suspender del robot de acuerdo a sus estado interno
   */
  public void suspender(){
    this.estadoActual.suspender();
  }

  /**
   * Realiza la accion activar del robot de acuerdo a sus estado interno
   */  
  public void activar(){
    this.estadoActual.activar();
  }

  /**
   * Realiza la accion caminar del robot de acuerdo a sus estado interno
   */  
  public void caminar(){
    this.estadoActual.caminar();
  }

  /**
   * Realiza la accion atender del robot de acuerdo a sus estado interno
   */  
  public void atender(){
    this.estadoActual.atender();
  } 

  /**
   * Realiza la accion cocinar del robot de acuerdo a sus estado interno
   */  
  public void cocinar(){
    this.estadoActual.cocinar();
  }

  /**
   * Muestra un menu seleccionado de acuerdo al iterador que se le pase
   * @param Iterador Iterador del menu que se quiere mostrar
   */  
  public void muestraMenu(Iterator iterador){
    while(iterador.hasNext()){
      System.out.println(iterador.next());
    }
  }

  /**
   * Muestra los platilos guardados en el menu interno  del  robot
   */
  public void muestraConjuntoMenus(){
    Iterator iteradorConjunto = this.conjuntoMenus.values().iterator();
    while(iteradorConjunto.hasNext()){
    System.out.println(iteradorConjunto.next());
    }
  }

  /**
   * Recibe la orden del usuario y la guarda en la variable platoPorCocinar
   * @return Integer Orden que se va a cocinar
   */ 
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

  /**
   * Revisa que el entero recibido concuerde con el id de alguna orden del menu interno
   * @param Integer Integer por revisar
   * @return Boolean Regresa <code>True<code> si el entero concuerda con el id de algun platillo. <code>False<code> en otro caso
   */  
  protected boolean checarOrdenValida(Integer id){
    for(Plato plato:this.conjuntoMenus.values()){
      if(plato.id == id) return true;
    }
    return false;
  }

    /**
     * Establece el plato por cocinar
     * @param Integer id del plato a cocinar
     */  
  protected void setPlatoPorCocinar(int platoPorCocinar){
    this.platoPorCocinar = platoPorCocinar;
  }

  /**
   * Regresa el plato por cocinar
   * @return Plato que se va a cocinar
   */  
  protected  Plato getPlatoPorCocinar(){
    return this.conjuntoMenus.get(this.platoPorCocinar);
  }
    
    
}
