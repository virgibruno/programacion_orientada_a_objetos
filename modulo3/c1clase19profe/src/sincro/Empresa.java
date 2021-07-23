package sincro;

import java.util.ArrayList;

public class Empresa {
    private String razonSocial;
    private ArrayList<Empleado> empleados;

    public Empresa(String razonSocial){
        this.razonSocial=razonSocial;
        empleados= new ArrayList<>();
        //crear y agregar empleados
        EmpleadoRelacionDependencia emp1 = (EmpleadoRelacionDependencia) EmpleadoFactory.getInstance().crearEmpleado("EMP-INT");
        emp1.setNombre("Juan");
        emp1.setApellido("Rodriguez");
        emp1.setSueldoMensual(100000);

        EmpleadoContratado emp2 = (EmpleadoContratado) EmpleadoFactory.getInstance().crearEmpleado("EMP-EXT");
        emp2.setNombre("Juan");
        emp2.setApellido("Rodriguez");
        emp2.setImportePorHora(2500);
        emp2.setRetencionImpuesto(0.1);

        //agrego empleados a la lista
        empleados.add(emp1);
        empleados.add(emp2);
    }

    public double calcularSueldoTotal(int dias){
        //calcular el costo total de los sueldos de los empleados según el parámetro
        double total=0;
        //calcular el sueldo de los empleados y acumularlo

        for (Empleado emp: empleados) {
            total+=emp.calcularSueldo(dias);
        }

        return total;
    }
}
