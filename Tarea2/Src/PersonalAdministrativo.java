public class PersonalAdministrativo extends Empleado implements BonoCalculable {
    private String departamento;
    private String cargo;

    public PersonalAdministrativo(String codigo, String nombre, String apellido, double salario, String departamento, String cargo) {
        super(codigo, nombre, apellido, salario);
        this.departamento = departamento;
        this.cargo = cargo;
    }

    @Override
    public String realizarTrabajo() {
        return "Trabajando en el departamento de " + departamento + " como " + cargo + ".";
    }

    @Override
    public double calcularBono() {
        return getSalario() * 0.15;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Departamento: " + departamento + ", Cargo: " + cargo;
    }
}