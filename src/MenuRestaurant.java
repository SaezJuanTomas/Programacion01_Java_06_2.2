import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;

public class MenuRestaurant {
    public static void main(String[] args) {
        System.out.println("Ingrese cantidad de platos");
        Scanner scanner = new Scanner(System.in);
        int cantidadPlatos = scanner.nextInt();
        ArrayList<Plato> platos = new ArrayList<Plato>();
        
        for (int i = 0; i < cantidadPlatos; i++) {

            System.out.println("Ingrese el nombre del plato:");
            String nombrePlato = scanner.next();

            System.out.println("Ingrese el precio del plato:");
            double precioPlato = scanner.nextDouble();

            System.out.println("El plato es una bebida? (si/no):");
            String esBebida = scanner.next();
            
            Plato plato;
            if (esBebida.equals("si")) {
                plato = new Plato(nombrePlato, precioPlato);
                plato.setEsBebida(true);
            } else {
                plato = new Plato(nombrePlato, precioPlato);
                plato.setEsBebida(false);
                System.out.println("Ingrese cantidad de ingredientes:");
                int cantidadIngredientes = scanner.nextInt();
                for (int j = 0; j < cantidadIngredientes; j++) {
                    System.out.println("Ingrese el nombre del ingrediente:");
                    String nombreIngrediente = scanner.next();
                    System.out.println("Ingrese la cantidad del ingrediente:");
                    double cantidadIngrediente = scanner.nextDouble();
                    System.out.println("Ingrese la unidad de medida del ingrediente:");
                    String unidadMedida = scanner.next();
                    Ingrediente ingrediente = new Ingrediente(nombreIngrediente, cantidadIngrediente, unidadMedida);
                    plato.agregarIngrediente(ingrediente);
                }
            }
            platos.add(plato);
        }

        System.out.println("-----------MENÚ----------------");
        for (Plato plato : platos) {
            System.out.println(plato);
        }
    }
}