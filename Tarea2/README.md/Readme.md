# Tarea 2: Encapsulamiento y Polimorfismo

Este proyecto implementa un sistema de gestión de personal universitario en **Java**, aplicando los principios del diseño orientado a objetos como **encapsulamiento**, **herencia**, **polimorfismo** e **interfaces**.

## Estructura del Proyecto

El código fuente se encuentra dentro de la carpeta `Src/`:

* `Empleado.java`: Clase abstracta base que representa a un empleado general.
* `Profesor.java`: Subclase que representa a los docentes (implementa `BonoCalculable`).
* `PersonalAdministrativo.java`: Subclase para el personal de oficina (implementa `BonoCalculable`).
* `PersonalMantenimiento.java`: Subclase para el personal operativo.
* `BonoCalculable.java`: Interfaz para definir el cálculo de bonos elegibles.
* `Main.java`: Clase principal con la lógica de ejecución, reportes y estadísticas.

## Conceptos Aplicados

* **Encapsulamiento:** Atributos privados con métodos getter y setter.
* **Herencia y Polimorfismo:** Sobrescritura del método `realizarTrabajo()` en cada subclase sin el uso de condicionales `if/else` para la ejecución de actividades.
* **Interfaces:** Uso de `BonoCalculable` para aplicar bonos solo a roles correspondientes.
* **Reflexión e Inspección:** Uso de `getClass().getSimpleName()` e `instanceof` para identificación y conteo de tipos de empleados.

## Instrucciones de Compilación y Ejecución

1. Abrir la terminal y navegar a la carpeta de código fuente:
   ```bash
   cd Src