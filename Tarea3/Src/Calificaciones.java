public class Calificaciones {
    public static void ejecutar() {
        String[] nombres = {"Ana", "Luis", "Maria", "Carlos"};
        double[][] parciales = {
            {8.5, 9.0, 7.5},
            {6.0, 5.5, 7.0},
            {9.0, 8.5, 9.5},
            {4.5, 6.0, 5.0}
        };

        double[] promedios = new double[4];
        int aprobados = 0;
        int reprobados = 0;

        System.out.println("ESTUDIANTE\tP1\tP2\tP3\tPROMEDIO\tESTADO");
        System.out.println("-------------------------------------------------------");

        for (int i = 0; i < nombres.length; i++) {
            double suma = 0;

            for (int j = 0; j < 3; j++) {
                suma += parciales[i][j];
            }
            promedios[i] = suma / 3.0;

            String estado;
            if (promedios[i] >= 6.0) {
                estado = "APROBADO";
                aprobados++;
            } else {
                estado = "REPROBADO";
                reprobados++;
            }

            System.out.printf("%-12s %-7.1f %-7.1f %-7.1f %-12.2f %-10s%n",
                    nombres[i], parciales[i][0], parciales[i][1], parciales[i][2], promedios[i], estado);
        }   

        System.out.println("-------------------------------------------------------");
        System.out.println("PROMEDIO P:\t");
        for (int j = 0; j < 3; j++) {
            double sumaCol = 0;
            for (int i = 0; i < nombres.length; i ++) {
                sumaCol += parciales[i][j];
            }
            System.out.printf("%.2f\t", sumaCol / nombres.length);
        }
        System.out.println();

        int posMejor = 0;
        int posPeor = 0;

        for (int i = 1; i < promedios.length; i++) {
            if (promedios[i] > promedios[posMejor]) {
                posMejor = i;
            }
            if (promedios[i] < promedios[posPeor]) {
                posPeor = i;
            }
        }

        System.out.println("\nMejor estudiante: " + nombres[posMejor] + " (" + String.format("%.2f", promedios[posMejor]) + ")");
        System.out.println("Peor estudiante: " + nombres[posPeor] + " (" + String.format("%.2f", promedios[posPeor]) + ")");
        System.out.println("Total Aprobados: " + aprobados);
        System.out.println("Total Reprobados: " + reprobados);
    }
}