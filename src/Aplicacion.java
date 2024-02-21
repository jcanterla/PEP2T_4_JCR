import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        ProgramaAtlasArrayList a = new ProgramaAtlasArrayList();
        ProgramaAtlasHashMap h = new ProgramaAtlasHashMap();

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("\n1. Programa Atlas ArrayList");
            System.out.println("2. Programa Atlas HashMap");
            System.out.println("3. Salir");
            System.out.print("Teclea una de las opciones: ");

            try {
                opcion = teclado.nextInt();
                System.out.println();
            }catch (Exception e){
                System.out.println("\t\tIntroduzca un numero entero");
                teclado.nextLine();
                continue;

            }

            switch (opcion) {
                case 1:

                    do {
                        System.out.println("\n\t\t\t\t\033[1m\033[4mPROGRAMA ATLAS\033[0m");
                        System.out.print("\n1. Añadir una entrada al atlas");
                        System.out.println("\t\t2. Mostrar el contenido actual del atlas");
                        System.out.print("3. Buscar una entrada al atlas");
                        System.out.println("\t\t4. Modificar una entrada al atlas");
                        System.out.print("5. Ordenar por nombre el país");
                        System.out.println("\t\t6. Mostrar el contenido del atlas con iterador");
                        System.out.print("7. Eliminar una entrada al atlas");
                        System.out.println("\t8. Eliminar el contenido completo del atlas");
                        System.out.println("9. Salir");
                        System.out.print("Teclea una de las opciones: ");


                        try {
                            opcion = teclado.nextInt();
                        }catch (Exception e){
                            System.out.println("\t\tIntroduzca un numero entero");
                            teclado.nextLine();
                            continue;

                        }

                        switch (opcion) {
                            case 1:
                                a.anyadirEntradaAtlas();
                                break;
                            case 2:
                                a.mostrarContenidoActual();
                                break;
                            case 3:
                                a.buscarEntradaAtlas();
                                break;
                            case 4:
                                a.modificarEntradaPais();
                                break;
                            case 5:
                                a.ordenarPorNombrePais();
                                break;
                            case 6:
                                a.mostrarContenidoAtlasIterator();
                                break;
                            case 7:
                                a.eliminarEntrada();
                                break;
                            case 8:
                                a.eliminarContenidoCompleto();
                                break;
                            case 9:
                                break;
                            default:
                                System.out.println("Opción no valida, inserte una nueva opción\n");
                                break;
                        }
                    } while (opcion != 9);

                    break;
                case 2:

                    do {
                        System.out.println("\n\t\t\t\t\033[1m\033[4mPROGRAMA ATLAS\033[0m");
                        System.out.print("\n1. Añadir una entrada al atlas");
                        System.out.println("\t\t2. Mostrar el contenido actual del atlas");
                        System.out.print("3. Buscar una entrada al atlas");
                        System.out.println("\t\t4. Modificar una entrada al atlas");
                        System.out.print("5. Ordenar por nombre el país");
                        System.out.println("\t\t6. Mostrar el contenido del atlas con iterador");
                        System.out.print("7. Eliminar una entrada al atlas");
                        System.out.println("\t8. Eliminar el contenido completo del atlas");
                        System.out.println("9. Salir");
                        System.out.print("Teclea una de las opciones: ");


                        try {
                            opcion = teclado.nextInt();
                        }catch (Exception e){
                            System.out.println("\t\tIntroduzca un numero entero");
                            teclado.nextLine();
                            continue;

                        }

                        switch (opcion) {
                            case 1:
                                h.anyadirEntradaAtlas();
                                break;
                            case 2:
                                h.mostrarContenidoActual();
                                break;
                            case 3:
                                h.buscarEntradaAtlas();
                                break;
                            case 4:
                                h.modificarEntradaPais();
                                break;
                            case 5:
                                h.ordenarPorNombrePais();
                                break;
                            case 6:
                                h.mostrarContenidoAtlasIterator();
                                break;
                            case 7:
                                h.eliminarEntrada();
                                break;
                            case 8:
                                h.eliminarContenidoCompleto();
                                break;
                            case 9:
                                break;
                            default:
                                System.out.println("Opción no valida, inserte una nueva opción\n");
                                break;
                        }
                    } while (opcion != 9);

                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción no valida, inserte una nueva opción\n");
                    break;
            }
        }while (opcion != 3);

    }

}
