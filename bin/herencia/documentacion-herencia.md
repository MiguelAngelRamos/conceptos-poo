# Herencia y Clases Abstractas en Java

## Definición de Herencia
La herencia es un pilar fundamental de la programación orientada a objetos. Permite que una clase (subclase) herede atributos y métodos de otra clase (superclase), promoviendo la reutilización de código y la organización jerárquica.

## Clases Abstractas
Una clase abstracta es una clase que no puede ser instanciada directamente y puede contener métodos abstractos (sin implementación) que deben ser implementados por las subclases. Sirve como base para otras clases y define un comportamiento común.

## Ejemplo en este proyecto
En este ejercicio, se define la clase abstracta `Animal` con atributos `name` y `age`, y el método abstracto `makeSound()`. Las clases `Dog` y `Cat` extienden de `Animal` e implementan el método `makeSound()` para definir el sonido específico de cada animal.

## Ventajas de usar clases abstractas
- Permiten definir una estructura común para las subclases.
- Facilitan la reutilización y organización del código.
- Obligan a las subclases a implementar ciertos métodos.

## Código de ejemplo
```java
public abstract class Animal {
    private String name;
    private int age;
    // ...
    public abstract String makeSound();
}

public class Dog extends Animal {
    // ...
    @Override
    public String makeSound() {
        return "Guau";
    }
}

public class Cat extends Animal {
    // ...
    @Override
    public String makeSound() {
        return "Miau";
    }
}
```

## Ejecución
En la clase `Ejecutora`, se crean instancias de `Dog` y `Cat` y se demuestra el uso de herencia y polimorfismo al llamar al método `makeSound()` de cada animal.
