package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n╔══════════════════════════════════╗");
            System.out.println("║        MENU DE EJERCICIOS        ║");
            System.out.println("╠══════════════════════════════════╣");
            System.out.println("║  1. Calculadora básica           ║");
            System.out.println("║  2. Par o impar                  ║");
            System.out.println("║  3. Tabla de multiplicar         ║");
            System.out.println("║  4. Números del 1 al 100         ║");
            System.out.println("║  5. Clase Persona                ║");
            System.out.println("║  6. Clase Rectángulo             ║");
            System.out.println("║  7. Clase Empleado (herencia)    ║");
            System.out.println("║  8. Clase Figura (polimorfismo)  ║");
            System.out.println("║  9. Contador de vocales          ║");
            System.out.println("║ 10. Calculadora de notas         ║");
            System.out.println("║  0. Salir                        ║");
            System.out.println("╚══════════════════════════════════╝");
            System.out.print("Seleccione una opción: ");
            
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Por favor ingrese un número válido.");
                scanner.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    ejercicio1(scanner);
                    break;
                case 2:
                    ejercicio2(scanner);
                    break;
                case 3:
                    ejercicio3(scanner);
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5(scanner);
                    break;
                case 6:
                    ejercicio6(scanner);
                    break;
                case 7:
                    ejercicio7(scanner);
                    break;
                case 8:
                    ejercicio8(scanner);
                    break;
                case 9:
                    ejercicio9(scanner);
                    break;
                case 10:
                    ejercicio10(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public static void ejercicio1(Scanner sc) {
        System.out.println("\n--- Calculadora Básica ---");
        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();
        System.out.print("Ingrese la operación (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double resultado = 0;
        boolean valido = true;

        if (op == '+') {
            resultado = num1 + num2;
        } else if (op == '-') {
            resultado = num1 - num2;
        } else if (op == '*') {
            resultado = num1 * num2;
        } else if (op == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Error: No se puede dividir entre cero.");
                valido = false;
            }
        } else {
            System.out.println("Operación no válida.");
            valido = false;
        }

        if (valido) {
            System.out.println("El resultado es: " + resultado);
        }
    }

    public static void ejercicio2(Scanner sc) {
        System.out.println("\n--- Par o Impar ---");
        System.out.print("Ingrese un número entero: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número es Par.");
        } else {
            System.out.println("El número es Impar.");
        }

        if (num > 0) {
            System.out.println("Es positivo.");
        } else if (num < 0) {
            System.out.println("Es negativo.");
        } else {
            System.out.println("Es cero.");
        }
    }

    public static void ejercicio3(Scanner sc) {
        System.out.println("\n--- Tabla de Multiplicar ---");
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void ejercicio4() {
        System.out.println("\n--- Números del 1 al 100 ---");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void ejercicio5(Scanner sc) {
        System.out.println("\n--- Clase Persona ---");
        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese el correo: ");
        String correo = sc.nextLine();

        Persona persona = new Persona(nombre, edad, correo);
        persona.mostrarInfo();
    }

    public static void ejercicio6(Scanner sc) {
        System.out.println("\n--- Clase Rectángulo ---");
        System.out.print("Ingrese la base: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese la altura: ");
        double altura = sc.nextDouble();

        Rectangulo rect = new Rectangulo(base, altura);
        System.out.println("Área: " + rect.calcularArea());
        System.out.println("Perímetro: " + rect.calcularPerimetro());
    }

    public static void ejercicio7(Scanner sc) {
        System.out.println("\n--- Clase Empleado ---");
        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese el puesto: ");
        String puesto = sc.nextLine();
        System.out.print("Ingrese el salario: ");
        double salario = sc.nextDouble();

        Empleado emp = new Empleado(nombre, edad, puesto, salario);
        emp.mostrarDatos();
        System.out.println("Bono: " + emp.calcularBono());
    }

    public static void ejercicio8(Scanner sc) {
        System.out.println("\n--- Figura ---");
        System.out.println("1. Círculo");
        System.out.println("2. Triángulo");
        System.out.print("Elija la figura: ");
        int opcionFigura = sc.nextInt();

        Figura figura = null;

        if (opcionFigura == 1) {
            System.out.print("Ingrese el radio: ");
            double radio = sc.nextDouble();
            figura = new Circulo(radio);
        } else if (opcionFigura == 2) {
            System.out.print("Ingrese la base: ");
            double base = sc.nextDouble();
            System.out.print("Ingrese la altura: ");
            double altura = sc.nextDouble();
            figura = new Triangulo(base, altura);
        } else {
            System.out.println("Opción no válida.");
            return;
        }

        System.out.println("Área de la figura: " + figura.calcularArea());
    }

    public static void ejercicio9(Scanner sc) {
        System.out.println("\n--- Contador de Vocales ---");
        System.out.print("Ingrese una frase: ");
        String texto = sc.nextLine().toLowerCase();

        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú') {
                contador++;
            }
        }

        System.out.println("Total de vocales: " + contador);
    }

    public static void ejercicio10(Scanner sc) {
        System.out.println("\n--- Calculadora de Notas ---");
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();

        double[] notas = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        Estudiante est = new Estudiante(nombre, notas);
        System.out.println("\nEstudiante: " + est.getNombre());
        System.out.println("Promedio: " + est.calcularPromedio());
        System.out.println("Calificación: " + est.obtenerCalificacion());
    }
}