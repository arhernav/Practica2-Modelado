public class Main{

  public static void main(String[] args){
    
    HamburguesaCarnivora prueba = new HamburguesaCarnivora(0, "Hamburguesa de prueba", "Prueba de la creacion de las hamburguesas con paradigma  template", 3.14, true,  false );
    prueba.prepararPlatillo();

    System.out.println("Vegana");
    HamburguesaVegana pruebaVegana = new HamburguesaVegana(0, "Hamburguesa de prueba vegana", "Prueba de la creacion de las hamburguesas con paradigma  template", 3.14, false,  true);
    pruebaVegana.prepararPlatillo();
    
    }
}