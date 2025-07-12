package polimorfismo;

public class EjecutoraPolimorfismo {

  public static void main(String[] args) {
    Figura [] figurasArray = new Figura[3];
    figurasArray[0] = new Circulo(5);
    figurasArray[1] = new Rectangulo(4, 6);
    figurasArray[2] = new Triangulo(3, 4, 5, 6);

    for (Figura figura : figurasArray) {
      System.out.println("Área: " + figura.calcularArea());
      System.out.println("Perímetro: " + figura.calcularPerimetro());
      System.out.println();
    }
  }


}
