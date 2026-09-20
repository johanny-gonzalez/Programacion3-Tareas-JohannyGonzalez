public class BusquedaProducto {
    
    public static void ejecutar() {
        String[] productos = {"Laptop", "Mouse", "Teclado", "Monitor", "Audífonos"};
        double[] precios = {45000.0, 850.0, 1200.0, 12000.0, 2500.0};
        int [] cantidades = {10, 50, 30, 8, 25};

        String[] busquedas = {"mouse", "MONITOR", "impresora"};

        for (int i = 0; i < busquedas.length; i++) {
            System.out.println("\nBuscando: " + busquedas[i]);
            int idx = buscarProducto(productos, busquedas[i]);

            if (idx != -1) {
                System.out.println("Encontrado:");
                System.out.println("Nombre: " + productos[idx]);
                System.out.println("Precio: RD$" + precios[idx]);
                System.out.println("Cantidad: " + cantidades[idx]);
            } else {
                System.out.println("El producto no existe.");
            }
        }

    }

    public static int buscarProducto(String[] productos, String busqueda) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].toLowerCase().contains(busqueda.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

}
