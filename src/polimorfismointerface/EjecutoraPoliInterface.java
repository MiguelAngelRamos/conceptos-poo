package polimorfismointerface;

public class EjecutoraPoliInterface {
  public static void main(String[] args) {
    IEmpleado [] empleados = new IEmpleado[3];
    empleados[0] = new EmpleadoPorHora("Juan", 40, 15.50);
    empleados[1] = new EmpleadoAsalariado("Ana", 3000);  
    empleados[2] = new EmpleadoPorHora("Luis", 30, 20.00);

    for (IEmpleado empleado : empleados) {
      System.out.println(empleado.getDescripcion());
      System.out.println("Salario: " + empleado.calcularSalario());
      System.out.println();
    }
    
  }
}
