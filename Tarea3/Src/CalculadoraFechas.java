import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class CalculadoraFechas {

    public static void ejecutar(Scanner sc) {
        Calendar cal = Calendar.getInstance();
        Date hoy = cal.getTime();

        SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat f2 = new SimpleDateFormat("EEEE, d 'de' MMMM 'de' yyyy");
        SimpleDateFormat f3 = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("\nFecha y hora actual:");
        System.out.println("Formato 1: " + f1.format(hoy));
        System.out.println("Formato 2: " + f2.format(hoy));
        System.out.println("Formato 3: " + f3.format(hoy));

        Calendar fFuturo = Calendar.getInstance();
        fFuturo.add(Calendar.DAY_OF_YEAR, 90);
        System.out.println("\nEn 90 dias sera: " + f1.format(fFuturo.getTime()));

        Calendar fPasado = Calendar.getInstance();
        fPasado.add(Calendar.MONTH, -6);
        System.out.println("Hace 6 meses fue: " + f1.format(fPasado.getTime()));

        System.out.print("\nIngrese su ano de nacimiento: ");
        int anioNac = sc.nextInt();
        sc.next();
        int anioActual = cal.get(Calendar.YEAR);
        System.out.println("Su edad es: " + (anioActual - anioNac) + " anos.");

        Calendar finAnio = Calendar.getInstance();
        finAnio.set(Calendar.MONTH, Calendar.DECEMBER);
        finAnio.set(Calendar.DAY_OF_MONTH, 31);

        long diff = finAnio.getTimeInMillis() - cal.getTimeInMillis();
        long dias = diff / (100 * 60 * 60 * 24);

        System.out.println("Dias faltantes para el 31 de diciembre: " + dias);

    }
    
}