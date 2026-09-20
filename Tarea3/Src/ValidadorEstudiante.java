public class ValidadorEstudiante {

    public static void ejecutar() {
        System.out.println("\n--- Pruebas de Validacion ---");

        String[][] datos = {
            {"Johanny Gonzalez", "2024-1234", "johanny@ucne.edu"},
            {"Ana", "2024-1234", "ana@ucne.edu"},
            {"Carlos Ruiz", "2019-5555", "carlos@gmail.com"}
        };

        for (int i = 0; i < datos.length; i++) {
            System.out.println("Prueba " + (i + 1) + ": " + datos[i][0] + " | " + datos[i][1] + " | " + datos[i][2]);
            String res = validarEstudiante(datos[i][0], datos[i][1], datos[i][2]);
            System.out.println("Resultado: " + res + "\n");
        }
    }

    public static String validarEstudiante(String nombre, String matricula, String correo) {
        if (nombre == null || nombre.trim().isEmpty()) {
            return "El nombre esta vacio.";
        }

        String[] partes = nombre.trim().split(" ");
        if (partes.length < 2) {
            return "El nombre debe tener al menos 2 palabras.";
        }

        if (matricula == null || !matricula.startsWith("202") || matricula.length() != 9) {
            return "La matricula debe iniciar con '202' y tener exactamente 9 caracteres.";
        }

        if (correo == null || !correo.contains("@") || !correo.endsWith(".edu")) {
            return "El correo debe contener '@' y terminar en '.edu'.";
        }

        return "Datos validos.";
    }
}
