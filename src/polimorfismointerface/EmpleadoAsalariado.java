package polimorfismointerface;

public class EmpleadoAsalariado implements IEmpleado {

  private String nombre;
  private double salarioMensual;

  public EmpleadoAsalariado(String nombre, double salarioMensual) {
    this.nombre = nombre;
    this.salarioMensual = salarioMensual;
  }

  @Override
  public double calcularSalario() {
    return salarioMensual;
  }

  @Override
  public String getDescripcion() {
    return "Empleado Asalariado: " + nombre + ", Salario Mensual: " + salarioMensual;
  }
   
  
}
