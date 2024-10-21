package clasesempresa;

public class Empleado {
    private String nombre;
    private String cargo;
    private double salario;

    public Empleado () {

    }

    public Empleado (String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setSalario(double salario) {
        this.salario =salario;
    }

    public double getSalario() {
        return salario;
    }
}
