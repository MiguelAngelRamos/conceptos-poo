package polimorfismointerface;

public class EmpleadoPorHora implements IEmpleado{
  private String nombre;
  private double horasTrabajadas; 
  private double pagoPorHora;

  public EmpleadoPorHora(String nombre, double horasTrabajadas, double pagoPorHora) {
    this.nombre = nombre;
    this.horasTrabajadas = horasTrabajadas;
    this.pagoPorHora = pagoPorHora;
  }

  @Override
  public double calcularSalario() {
    return horasTrabajadas *pagoPorHora;
  }

  @Override
  public String getDescripcion() {
    return "Empleado por Hora: " + nombre + ", Horas Trabajadas: " + horasTrabajadas + ", Pago por Hora: " + pagoPorHora;
  }
  
}
