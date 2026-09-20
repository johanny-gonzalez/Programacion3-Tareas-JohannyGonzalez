import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;

        do {
            System.out.println("\n--- MENU DE LA PRACTICA ---");
            System.out.println("1. Ejercicio 1 (Inventario)");
            System.out.println("2. Ejercicio 2 (Calificaciones)");
            System.out.println("3. Ejercicio 3 (Buscar Producto)");
            System.out.println("4. Ejercicio 4 (Procesar CSV)");
            System.out.println("5. Ejercicio 5 (Validar Estudiante)");
            System.out.println("6. Ejercicio 6 (Calculadora de Fechas)");
            System.out.println("7. Salir");
            System.out.print("Elija una opcion: ");

             if (sc.hasNextInt()) {
                opc = sc.nextInt();
                sc.nextLine();
            } else {
                sc.nextLine();
                opc = 0;
            }

            switch (opc) {
                case 1:
                    Inventario.ejecutar();
                    break;
                case 2:
                    Calificaciones.ejecutar();
                    break;
                case 3:
                    BusquedaProducto.ejecutar();
                    break;
                case 4:
                    ProcesadorCSV.ejecutar();
                    break;
                case 5:
                    ValidadorEstudiante.ejecutar();
                    break;
                case 6:
                    CalculadoraFechas.ejecutar(sc);
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida, intente de nuevo.");
            }
        } while (opc != 7);
    }
}
