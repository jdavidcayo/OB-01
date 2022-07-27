import javax.swing.JOptionPane;

public class App {

    public static int suma( int v1, int v2, int v3){
        int total = v1 + v2 + v3;
        return total;
    }


    public static void main(String[] args) throws Exception {
        int eleccion = -1;
    //Eleccion
        try {
        eleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Ej 1 primera parte.\n" + 
                                                                            "2 - Ej 1 segunda parte."));
    
        } catch (Exception e) {
            System.out.println("Ingrese una opcion valida. Saliendo del programa");
            System.exit(-1);
        }
        
        switch (eleccion){
            case 1:
            int total;
            int v1, v2, v3;
    
            try {          
                v1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor 1"));
                v2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor 2"));
                v3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor 3"));
                total = suma(v1,v2,v3);
    
                System.out.println("Total= \t" + total);
                
            } catch (Exception e) {
                System.out.println("Valor a sumar incorrecto, ingrese un entero.");
                System.exit(-1);
            }
            break;

            case 2:
                Coche auto = new Coche( 2 );
                auto.incrementarPuertas();

                System.out.println("Cantidad de puertas del coche: \t" + auto.getPuertas());
                break;

            default:
            System.out.println("Saliendo.");
            break;
        }
        
        
        
    }
}
