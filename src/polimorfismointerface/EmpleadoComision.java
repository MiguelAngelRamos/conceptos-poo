package polimorfismointerface;

public class EmpleadoComision implements IEmpleado {

  private String nombre;
  private double ventasRealizadas;
  private double porcentajeComision;

  public EmpleadoComision(String nombre, double ventasRealizadas, double porcentajeComision) {
    this.nombre = nombre;
    this.ventasRealizadas = ventasRealizadas;
    this.porcentajeComision = porcentajeComision;
  }
  @Override
  public double calcularSalario() {
    return ventasRealizadas * (porcentajeComision / 100);
  }

  @Override
  public String getDescripcion() {
    return "Empleado por Comision: " + nombre + ", Ventas Realizadas: " + ventasRealizadas + ", Porcentaje de Comision: " + porcentajeComision + "%";
  }
  
}
