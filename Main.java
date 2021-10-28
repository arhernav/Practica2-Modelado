import java.util.Iterator;
import java.util.Scanner;

/**
 * Clase Main
 */
public class Main{
  public static void main(String[] args){
    /*Objetos necesarios para el programa*/
    MenuDiario menuDiario = new MenuDiario();
    MenuGeneral menuGeneral = new MenuGeneral();
    MenuEspecial menuEspecial = new MenuEspecial();
    Robot robot = new Robot();
    boolean finalizarPrograma = false;
    
    /*Precargamos los menus al robot*/
    robot.agregaMenu(menuGeneral.iterator());
    robot.agregaMenu(menuDiario.iterator());
    robot.agregaMenu(menuEspecial.iterator());

    /*Comienzo de la ejecucion del programa*/
    System.out.println("¡Bienvenid@ a McBurguesas!");

    //Comienzo del menu interactivo
    while(!finalizarPrograma){
	
      //Declaracion de  objetos necesarios para el menu
      System.out.println("\nEl  robot esta actualmente en " + robot.getEstadoActual());
      int opcionElegida = 7;
      Scanner escaner= new Scanner(System.in);
      boolean opcionValida = false;

      //Opciones para seleccionar
      System.out.println("Por favor ingrese la opcion que le gustaria que realizara el robot");
      System.out.println("1.- Suspender");
      System.out.println("2.- Activar");
      System.out.println("3.- Caminar");
      System.out.println("4.- Atender");
      System.out.println("5.- Cocinar");
      System.out.println("6.- Finalizar el programa");
      System.out.println("Ingrese el digito de la opcion que quiere");
      
      //Seleccion de opcion
      do{
        if(escaner.hasNextInt()){
          opcionElegida = escaner.nextInt();
          if(opcionElegida <= 6){
            opcionValida = true;
          }
        }else{    
          escaner.nextLine();
	  System.out.println("Recuerda que debes de ingresar solo un digito y este debe de concordar con alguna de las opciones del menu de arriba");
        }
      }while(!opcionValida);

      //Ejecucion de la opcion seleccionada
      switch(opcionElegida){
      case 1:
	System.out.println();
        robot.suspender();
	System.out.println();
        break;
      case 2:
	System.out.println();
	robot.activar();
	System.out.println();
	break;
      case 3:
	System.out.println();
	robot.caminar();
	System.out.println();
	break;
      case 4:
	System.out.println();
	robot.atender();
	System.out.println();
	break;
      case 5:
	System.out.println();
	robot.cocinar();
	System.out.println();
	break;
      case 6: 
        finalizarPrograma = true;
        break;
      default: 
        break;
      }
      
    }
  }
}
