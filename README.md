# Conceptos Fundamentales de Programación Orientada a Objetos

## ¿Qué es una Interface?
Una interface en programación orientada a objetos es un contrato que define un conjunto de métodos que una clase debe implementar. Las interfaces no contienen lógica interna, solo la firma de los métodos. Permiten establecer reglas claras sobre el comportamiento que deben tener las clases que las implementan, promoviendo la flexibilidad y el desacoplamiento en el diseño del software.

**Ejemplo:**
```java
public interface Vehiculo {
    void conducir();
    int obtenerVelocidadMaxima();
}

public class Bicicleta implements Vehiculo {
    @Override
    public void conducir() {
        System.out.println("Pedaleando la bicicleta...");
    }
    @Override
    public int obtenerVelocidadMaxima() {
        return 30;
    }
}
```

## ¿Qué es una Clase Abstracta?
Una clase abstracta es una clase que no puede ser instanciada directamente. Sirve como base para otras clases y puede contener métodos abstractos (sin implementación) y métodos concretos (con implementación). Las clases abstractas permiten definir una estructura común y obligan a las subclases a implementar ciertos comportamientos, facilitando la reutilización y organización del código.

**Ejemplo:**
```java
public abstract class DispositivoElectronico {
    public abstract void encender();
    public void mostrarMarca() {
        System.out.println("Marca: Genérica");
    }
}

public class Telefono extends DispositivoElectronico {
    @Override
    public void encender() {
        System.out.println("Encendiendo el teléfono...");
    }
}
```

## ¿Qué es la Herencia?
La herencia es un mecanismo que permite a una clase adquirir los atributos y métodos de otra clase. La clase que hereda se denomina subclase, y la clase de la que se hereda se llama superclase. La herencia promueve la reutilización de código, la organización jerárquica y el polimorfismo, permitiendo que las subclases extiendan o modifiquen el comportamiento de la superclase.

**Ejemplo:**
```java
public class Persona {
    protected String nombre;
    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}

public class Estudiante extends Persona {
    public void estudiar() {
        System.out.println(nombre + " está estudiando.");
    }
}
```