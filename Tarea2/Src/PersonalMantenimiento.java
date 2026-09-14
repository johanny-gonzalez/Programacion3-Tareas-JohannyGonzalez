public class PersonalMantenimiento extends Empleado {
    private String areaAsignada;

    public PersonalMantenimiento(String codigo, String nombre, String apellido, double salario, String areaAsignada) {
        super(codigo, nombre, apellido, salario);
        this.areaAsignada = areaAsignada;
    }

    @Override
    public String realizarTrabajo() {
        return "Realizando mantenimiento en el área de " + areaAsignada;
    }

    public String getAreaAsignada() {
        return areaAsignada;
    }

    public void setAreaAsignada(String areaAsignada) {
        this.areaAsignada = areaAsignada;
    }

    @Override
    public String toString() {
        return super.toString() + ", area asignada= " + areaAsignada;
    }
}
