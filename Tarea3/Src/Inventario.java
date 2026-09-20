public class Inventario {
    public static void ejecutar() {
        String[] productos = {"Laptop", "Mouse", "Teclado", "Monitor", "Audífonos"};
        double[] precios = {45000.0, 850.0, 1200.0, 12000.0, 2500.0};
        int[] cantidades = {10, 50, 30, 8, 25};

        double[] valorTotal = new double[5];
        double totalGeneral = 0;

        System.out.println("\nPRODUCTO\tPRECIO\t\tCANTIDAD\tVALOR TOTAL");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < productos.length; i++) {
            valorTotal[i] = precios[i] * cantidades[i];
            totalGeneral += valorTotal[i];
            System.out.printf("%-15s RD$%,-10.2f %-10d RD$%,-10.2f%n", productos[i], precios[i], cantidades[i], valorTotal[i]);
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("TOTAL GENERAL: RD$%,.2f%n", totalGeneral);

        int posCaro = 0;
        int posBarato = 0;

        for (int i = 1; i < precios.length; i++) {
            if (precios[i] > precios[posCaro]) {
                posCaro = i;
            }
            if (precios[i] < precios[posBarato]) {
                posBarato = i;
            }
        }

        System.out.println("\nProducto mas caro: " + productos[posCaro] + " (RD$" + precios[posCaro] + ")");
        System.out.println("Producto mas barato: " + productos[posBarato] + " (RD$" + precios[posBarato] + ")");

        System.out.println("\nAlertas de stock bajo (menos de 15):");
        for (int i = 0; i < productos.length; i++) {
            if (cantidades[i] < 15) {
                System.out.println("- " + productos[i] + ": " + cantidades[i] + " unidades");
            }
        }

        for (int i = 0; i < precios.length - 1; i++) {
            for (int j = 0; j < precios.length - 1 - i; j++) {
                if (precios[j] < precios[j + 1]) {
                    double auxP = precios[j];
                    precios[j] = precios[j + 1];
                    precios[j + 1] = auxP;

                    String auxN = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = auxN;

                    int auxC = cantidades[j];
                    cantidades[j] = cantidades[j + 1];
                    cantidades[j + 1] = auxC;
                }
            }
        }

        System.out.println("\nProductos ordenados de mayor a menor precio:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + " -> RD$" + precios[i]);
        }
    }
}
