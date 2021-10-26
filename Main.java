import java.util.Iterator;

/**
 * Clase que aplica el patrón State.
 */
public class Main{
  
  public static void main(String[] args){
    /*MenuDiario menuDiario = new MenuDiario();
    MenuGeneral menuGeneral = new MenuGeneral();
    MenuEspecial menuEspecial = new MenuEspecial();
    Iterator iteradorGeneral = menuGeneral.iterator();
    Iterator iteradorDiario = menuDiario.iterator();
    Iterator iteradorEspecial = menuEspecial.iterator();
        */

    Robot robot = new Robot();
    /*
     System.out.println(robot.estadoActual);
     robot.cocinar();
     robot.caminar();
     robot.atender();
     robot.suspender();
     robot.activar();
     System.out.println(robot.estadoActual);
     robot.cocinar();
     robot.atender();
     robot.suspender();
     robot.activar();
     robot.caminar();
     System.out.println(robot.estadoActual);
     robot.cocinar();
     robot.activar();
     robot.caminar();
     robot.atender();
     System.out.println(robot.estadoActual);
     robot.cocinar();
     robot.suspender();
     robot.activar();
     robot.caminar();
     robot.atender();
     System.out.println(robot.estadoActual);
     robot.suspender();
     robot.activar();
     robot.caminar();
     robot.atender();
     robot.cocinar();
     System.out.println(robot.estadoActual);
    */
    Iterator iteradorConjunto = robot.conjuntoMenus.values().iterator();
    while(iteradorConjunto.hasNext()){
      System.out.println(iteradorConjunto.next());
    }
    System.out.println(robot.conjuntoMenus.get(11));
    robot.conjuntoMenus.get(11).prepararPlatillo();
  }
}
