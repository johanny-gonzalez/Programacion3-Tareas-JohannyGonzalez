import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new Profesor("P01", "Carlos", "Mendoza", 45000.0, "Programacion", 16));
        empleados.add(new Profesor("P02", "Laura", "Gomez", 48000.0, "Bases de Datos", 20));
        empleados.add(new Profesor("P03", "Roberto", "Sanchez", 42000.0, "Redes", 12));

        empleados.add(new PersonalAdministrativo("A01", "Maria", "Rodriguez", 38000.0, "Registro", "Directora"));
        empleados.add(new PersonalAdministrativo("A02", "Juan", "Perez", 32000.0, "Recursos Humanos", "Analista"));
        empleados.add(new PersonalAdministrativo("A03", "Ana", "Martinez", 35000.0, "Contabilidad", "Contadora"));

        empleados.add(new PersonalMantenimiento("M01", "Pedro", "Almonte", 25000.0, "Edificio A"));
        empleados.add(new PersonalMantenimiento("M02", "Jose", "Fernandez", 24000.0, "Laboratorios"));

        System.out.println("=== LISTA GENERAL DE EMPLEADOS Y SUS TRABAJOS ===");
        for (Empleado e : empleados) {
            System.out.println("Tipo Real: " + e.getClass().getName());
            System.out.println("Info: " + e.toString());
            System.out.println("Actividad: " + e.realizarTrabajo());
            System.out.println("--------------------------------------------------");
        }

       System.out.println("\n=== EMPLEADOS QUE RECIBEN BONO ===");
        for (Empleado e : empleados) {
            if (e instanceof BonoCalculable) {
                BonoCalculable conBono = (BonoCalculable) e;
                System.out.println(e.getNombre() + " " + e.getApellido() + " -> Bono: $" + conBono.calcularBono());
            }
        }

        double totalSalarios = 0;
        Empleado mayorSalario = empleados.get(0);

        int profCount = 0;
        int adminCount = 0;
        int mantCount = 0;

        for (Empleado e : empleados) {
            totalSalarios += e.getSalario();

            if (e.getSalario() > mayorSalario.getSalario()) {
                mayorSalario = e;
            }

            profCount += (e instanceof Profesor) ? 1 : 0;
            adminCount += (e instanceof PersonalAdministrativo) ? 1 : 0;
            mantCount += (e instanceof PersonalMantenimiento) ? 1 : 0;
        }

        System.out.println("\n=== ESTADISTICAS FINAL ===");
        System.out.println("Total de salarios: $" + totalSalarios);
        System.out.println("Empleado con el salario mas alto: " + mayorSalario.getNombre() + " " + mayorSalario.getApellido() + " ($" + mayorSalario.getSalario() + ")");
        System.out.println("\nCantidad por tipo:");
        System.out.println("- Profesores: " + profCount);
        System.out.println("- Personal Administrativo: " + adminCount);
        System.out.println("- Personal de Mantenimiento: " + mantCount);
    }
}