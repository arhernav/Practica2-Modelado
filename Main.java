import java.util.Iterator;
public class Main{
    
    public static void main(String[] args){
	MenuDiario menuDiario = new MenuDiario();
	MenuGeneral menuGeneral = new MenuGeneral();
	MenuEspecial menuEspecial = new MenuEspecial();
	Iterator iteradorGeneral = menuGeneral.iterator();
	Iterator iteradorDiario = menuDiario.iterator();
	Iterator iteradorEspecial = menuEspecial.iterator();
        

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

	robot.agregaMenu(menuGeneral.iterator());
	/*robot.muestraConjuntoMenus();
	System.out.println();*/
	robot.agregaMenu(menuDiario.iterator());
	/*robot.muestraConjuntoMenus();
	System.out.println();*/
	robot.agregaMenu(menuEspecial.iterator());
	/*robot.muestraConjuntoMenus();
	System.out.println();*/
	int ordenRecibida = robot.recibirOrden();
        System.out.println(ordenRecibida);
    }
}
