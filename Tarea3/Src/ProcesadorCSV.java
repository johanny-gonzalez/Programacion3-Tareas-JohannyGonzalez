import java.util.StringTokenizer;

public class ProcesadorCSV {

    public static void ejecutar() {
        String datos = "Juan Perez, juanp@empresa.com,Sistemas,35000\n"
                + "Ana Lopez,anal@empresa.com,Contabilidad,28000\n"
                + "Carlos Ruiz,carlosr@gmail.com,Sistemas,42000\n"
                + "Maria Diaz,mariad@empresa.com,RRHH,31000\n"
                + "Luis Marte,luism@gmail.com,Sistemas,38000";

        String[] lineas = datos.split("\n");
        int total = lineas.length;

        String[] nombres = new String[total];
        String[] correos = new String[total];
        String[] deptos = new String[total];
        double[] salarios = new double[total];

        double suma = 0;

        System.out.println("\nNOMBRE\t\tCORREO\t\t\tDEPARTAMENTO\tSALARIO");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < total; i++) {
            StringTokenizer st = new StringTokenizer(lineas[i], ",");
            nombres[i] = st.nextToken();
            correos[i] = st.nextToken();
            deptos[i] = st.nextToken();
            salarios[i] = Double.parseDouble(st.nextToken());

            suma += salarios[i];

            System.out.printf("%-15s %-22s %-15s RD$%,-10.2f%n",
                    nombres[i].toUpperCase(), correos[i].toLowerCase(), deptos[i], salarios[i]);
        }

        System.out.println("\nEmpleados del departamento de Sistemas:");
        for (int i = 0; i < total; i++) {
            if (deptos[i].equalsIgnoreCase("Sistemas")) {
                System.out.println("- " + nombres[i]);
            }
        }

        System.out.println("\nEmpleados con correo @empresa.com:");
        for (int i = 0; i < total; i++) {
            if (correos[i].endsWith("@empresa.com")) {
                System.out.println("- " + nombres[i] + " (" + correos[i] + ")");
            }
        }

        int posMax = 0;
        int posMin = 0;

        for (int i = 1; i < total; i++) {
            if (salarios[i] > salarios[posMax]) {
                posMax = i;
            }
            if (salarios[i] < salarios[posMin]) {
                posMin = i;
            }
        }

        System.out.println("\nSalario promedio: RD$" + String.format("%,.2f", (suma / total)));
        System.out.println("El que mas gana: " + nombres[posMax] + " (RD$" + salarios[posMax] + ")");
        System.out.println("El que menos gana: " + nombres[posMin] + " (RD$" + salarios[posMin] + ")");
    }
    
}
