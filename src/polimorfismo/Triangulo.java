package polimorfismo;

public class Triangulo extends Figura {

  private double base;
  private double altura;
  private double lado1;
  private double lado2;


  public Triangulo(double base, double altura, double lado1, double lado2) {
    this.base = base;
    this.altura = altura;
    this.lado1 = lado1;
    this.lado2 = lado2;
   
  }

  @Override
  public double calcularArea() {
    return (base * altura) / 2;
  }

  @Override
  public double calcularPerimetro() {
    return base + lado1 + lado2;
  }
  
}
