package src;

public class Empleado extends Persona {
    private String puesto;
    private double salario;

    public Empleado(String nombre, int edad, String puesto, double salario) {
        super(nombre, edad);
        this.puesto = puesto;
        this.salario = salario;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: " + salario);
    }

    public double calcularBono() {
        return salario * 0.10;
    }
}