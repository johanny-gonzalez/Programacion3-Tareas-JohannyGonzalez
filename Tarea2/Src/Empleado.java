public abstract class Empleado {
    private String codigo;
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado(String codigo, String nombre, String apellido, double salario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public abstract String realizarTrabajo();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override 
    public String toString() {
        return "codigo" + codigo + ", nombre= " + nombre + ", apellido= " + apellido + ", salario= " + salario;
    }

}

    
    
    
