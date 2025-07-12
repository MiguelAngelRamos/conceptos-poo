package herencia;

public class Ejecutora {
  public static void main(String[] args) {
    Cat cat = new Cat("Gato Cosmico", 3);
    System.out.println("Nombre: " + cat.getName());
    System.out.println("Edad: " + cat.getAge());
    cat.makeSound(); // Output: Meow

    Dog dog = new Dog("Perro Galactico", 5);
    System.out.println("Nombre: " + dog.getName());
    System.out.println("Edad: " + dog.getAge());
    dog.makeSound(); // Output: Woof
  }
}
