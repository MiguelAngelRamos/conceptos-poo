# Polimorfismo en Java

## Definición
El polimorfismo es un principio fundamental de la programación orientada a objetos que permite que objetos de diferentes clases sean tratados como objetos de una clase común. En Java, esto se logra principalmente a través de la herencia y el uso de métodos sobrescritos.

## Ejemplo en este proyecto
En este ejemplo, se define una clase abstracta `Figura` que representa una figura geométrica. Las clases `Circulo`, `Rectangulo` y `Triangulo` extienden de `Figura` y sobrescriben los métodos `calcularArea()` y `calcularPerimetro()` para implementar el comportamiento específico de cada figura.

El polimorfismo se observa cuando se crea un arreglo de tipo `Figura` y se almacenan instancias de diferentes figuras. Al recorrer el arreglo y llamar a los métodos, Java ejecuta el método correspondiente a la clase real del objeto.

## Ventajas del polimorfismo
- Permite escribir código más flexible y reutilizable.
- Facilita la extensión y el mantenimiento del software.
- Promueve el uso de interfaces y clases abstractas.

## Código de ejemplo
```java
Figura[] figuras = new Figura[3];
figuras[0] = new Circulo(5);
figuras[1] = new Rectangulo(4, 6);
figuras[2] = new Triangulo(3, 4, 3, 4, 5);

for (Figura figura : figuras) {
    System.out.println("Área: " + figura.calcularArea());
    System.out.println("Perímetro: " + figura.calcularPerimetro());
}
```

En este fragmento, cada figura calcula su área y perímetro usando su propia implementación, aunque todas son tratadas como `Figura`.
