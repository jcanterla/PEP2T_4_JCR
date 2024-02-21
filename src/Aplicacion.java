import java.util.Scanner;

public class Aplicacion {

    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        String opcion;
        do {
            System.out.println("1. Añadir una entrada al atlas");
            System.out.println("2. Mostrar el contenido actual del atlas");
            System.out.println("3. Buscar una entrada al atlas");
            System.out.println("4. Modificar una entrada al atlas");
            System.out.println("5. Ordenar por nombre el país");
            System.out.println("6. Mostrar el contenido del atlas con iterador");
            System.out.println("7. Eliminar una entrada al atlas");
            System.out.println("8. Eliminar el contenido completo del atlas");
            System.out.println("9. Salir");
            System.out.print("Teclea una de las opciones: ");
            opcion = teclado.next();

            switch (opcion) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    break;
                case "9":
                    break;
                default:
                    System.out.println("Opción no valida, inserte una nueva opción\n");
                    break;
            }
        } while (!opcion.equals("9"));

    }
    public static void main(String[] args) {
        menu();
    }

}
