import java.util.Iterator;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    
    MenuDiario menuDiario = new MenuDiario();
    MenuGeneral menuGeneral = new MenuGeneral();
    MenuEspecial menuEspecial = new MenuEspecial();
    Robot robot = new Robot();
    boolean finalizarPrograma = false;
    
    robot.agregaMenu(menuGeneral.iterator());
    robot.agregaMenu(menuDiario.iterator());
    robot.agregaMenu(menuEspecial.iterator());
    
    System.out.println("¡Bienvenid@ a McBurguesas!");
    while(!finalizarPrograma){
      System.out.println(robot.getEstadoActual());
      int opcionElegida = 7;
      Scanner escaner= new Scanner(System.in);
      boolean opcionValida = false;
      
      do{
        if(escaner.hasNextInt()){
          opcionElegida = escaner.nextInt();
          if(opcionElegida <= 6){
            opcionValida = true;
          }
        }else{
          escaner.nextLine();
        }
      }while(!opcionValida);
      
      switch(opcionElegida){
        case 6: 
          finalizarPrograma = true;
          break;
        default: 
          break;
      }
      
    } 
    
    int ordenRecibida = robot.recibirOrden();
    System.out.println(ordenRecibida);
    
    
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
  }
}
