public class Profesor extends Empleado implements BonoCalculable {
    private String departamento;
    private int cargo;

    public Profesor(String codigo, String nombre, String apellido, double salario, String departamento, int cargo) {
        super(codigo, nombre, apellido, salario);
        this.departamento = departamento;
        this.cargo = cargo;
    }

    @Override 
    public String realizarTrabajo() {
        return " Trabajo en el departamento de " + departamento + " como " + cargo;
    }

    @Override 
    public double calcularBono() {
        return (getSalario() * 0.5);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    @Override 
    public String toString() {
        return super.toString() + ", departamento= " + departamento + ", cargo= " + cargo;
    }

}
