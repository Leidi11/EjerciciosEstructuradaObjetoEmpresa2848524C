import javax.swing.JOptionPane;

import clasesempresa.*;

public class AppEmpresaObjetos {
    public static void main(String[] args) throws Exception {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la cantidad de empleados: "));

        Empresa empresa = new Empresa();
        for(int emp = 0; emp < cantidad; emp++) {
            String nombre = JOptionPane.showInputDialog(null, "ingrese el nombre del empleado: ");
            String cargo = JOptionPane.showInputDialog(null, "ingrese el cargo del empleado: ");
            double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el salario del empleado: "));

            empresa.contratarEmpleado(new Empleado(nombre, cargo, salario));

            System.out.println("el total de empleados es: " + empresa.getTotalempleados());

            System.out.println("los nombres y salarios de los empleeados son: ");
            empresa.nombreSalario();

            System.out.println("total de dinero pagado a todos los empleados: " + empresa.getTotalSalarios());

            empresa.EmpleadoMayorSalario();

            empresa.EmpleadoMenorSalario();
        }

    }
}
