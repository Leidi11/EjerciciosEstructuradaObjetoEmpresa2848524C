package clasesempresa;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<Empleado>();
    }

    public void contratarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public int getTotalempleados() {
        return empleados.size();
    }

    // metodo que muestra el salario y nombre del empleado

    public void nombreSalario() {
        for(Empleado e:empleados) {
            System.out.println("Nombre: " + e.getNombre() + " salario " + e.getSalario());
        }
    }

    public double getTotalSalarios() {
        double total= 0;
        for(Empleado e: empleados) {
            total = total + e.getSalario();
        }
        return total;
    }

    public void EmpleadoMayorSalario() {
        Empleado empMayorSalario = empleados.get(0);
        double mayorSalario = empleados.get(0).getSalario();
        for(Empleado e:empleados) {
            if (e.getSalario() > mayorSalario) {
                mayorSalario= e.getSalario();
                empMayorSalario = e;
            }
        }

        System.out.println("nombre: " + empMayorSalario.getNombre() + " salario: " + empMayorSalario.getSalario()); 

    }

    public void EmpleadoMenorSalario() {
        Empleado empMenorSalario = empleados.get(0);
        double menorSalario = empleados.get(0).getSalario();
        for(Empleado e:empleados) {
            if (e.getSalario() < menorSalario) {
                menorSalario= e.getSalario();
                empMenorSalario = e;
            }
        }

        System.out.println("nombre: " + empMenorSalario.getNombre() + " salario: " + empMenorSalario.getSalario()); 
        
    }
}
