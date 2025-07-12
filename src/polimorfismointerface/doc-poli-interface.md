# Polimorfismo con Interfaces: Ejemplo de Empleados

## Definición
El polimorfismo con interfaces permite que diferentes clases implementen la misma interfaz y sean tratadas de manera uniforme. En este caso, la interfaz `Empleado` define el método `calcularSalario()` y `getDescripcion()`, y cada tipo de empleado implementa su propia lógica.

## Ejemplo en este proyecto
Se implementan tres tipos de empleados:
- `EmpleadoAsalariado`: Recibe un salario mensual fijo.
- `EmpleadoPorHora`: Recibe un pago según las horas trabajadas.
- `EmpleadoComision`: Recibe un pago según las ventas realizadas y un porcentaje de comisión.

El polimorfismo ocurre cuando se crea un arreglo de tipo `IEmpleado` y se almacenan instancias de diferentes clases que implementan la interfaz. Al recorrer el arreglo y llamar a los métodos, Java ejecuta el método correspondiente a la clase real del objeto.

## Ventajas
- Permite mayor flexibilidad y desacoplamiento.
- Facilita la programación orientada a contratos.
- Permite implementar múltiples interfaces en una misma clase.

## Código de ejemplo
```java
Empleado[] empleados = new Empleado[3];
empleados[0] = new EmpleadoAsalariado("Ana", 1500);
empleados[1] = new EmpleadoPorHora("Luis", 40, 15);
empleados[2] = new EmpleadoComision("Carlos", 10000, 5);

for (Empleado empleado : empleados) {
    System.out.println(empleado.getDescripcion());
    System.out.println("Salario: $" + empleado.calcularSalario());
}
```

Cada empleado calcula su salario usando su propia implementación, aunque todos son tratados como `Empleado` gracias a la interfaz.
