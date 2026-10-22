Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Gestión de Estudiantes y Calificaciones (Encapsulamiento y Manejo de Arreglos en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🎓 Simulación de Gestión de Estudiantes y Promedios (Encapsulamiento y Arreglos en Java)

Este proyecto es una aplicación en Java que modela la administración de información académica de un estudiante, permitiendo registrar notas con validación de rangos y calcular automáticamente su promedio ponderado. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como el **encapsulamiento de atributos**, el control de arreglos estáticos con contadores dinámicos y la validación de reglas de negocio en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase de dominio encapsulada y un punto de ejecución:

* **`Estudiante`**: Modela la entidad académica y protege la integridad de sus datos personales y calificaciones.
* **Atributos privados (`private`)**: `nombre`, `legajo`, un arreglo estático de calificaciones `notas` (con capacidad máxima de 10 elementos) y un contador interno `cantidadNota`.
* **Constructor**: Inicializa el perfil del estudiante asignando el nombre, el legajo, creando un arreglo de tamaño fijo e inicializando el contador en cero.
* **Métodos accesores (*getters*)**: Permiten consultar el nombre, el legajo y el conjunto de calificaciones registradas.
* **Métodos operativos de negocio**:
* `agregarNota(double nota)`: Valida que la calificación se encuentre en el rango permitido (de 0 a 10) y verifica que el arreglo no haya superado su capacidad máxima antes de almacenar el valor e incrementar el contador.
* `calcularPromedio()`: Retorna el promedio aritmético de las notas cargadas hasta el momento, previniendo errores de división por cero si el estudiante aún no posee registros.




* **`Main`**: Punto de entrada del programa. Instancia un objeto de tipo `Estudiante`, agrega múltiples calificaciones mediante llamadas sucesivas, calcula el promedio y muestra por consola los datos completos del alumno.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Rango Válido de Calificaciones:** El método `agregarNota` implementa una guardia estricta para comprobar que la nota se encuentre comprendida entre **0 y 10** (`nota >= 0 && nota <= 10`). Si se ingresa un valor inválido, se rechaza la operación informando un mensaje por consola.
2. **Control de Capacidad del Arreglo:** Previene desbordamientos de memoria evaluando que la cantidad actual de notas no supere la longitud máxima del arreglo (`cantidadNota < notas.length`). Si se intenta exceder el límite, el sistema bloquea el ingreso.
3. **Protección ante Promedios Vacíos:** El cálculo del promedio verifica si el alumno posee notas registradas (`cantidadNota == 0`), retornando `0` de forma segura para evitar excepciones de división por cero.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
Nota agregada: 10.0
Nota agregada: 5.0
Nota agregada: 8.0
Nota agregada: 9.0
Nota agregada: 10.0
Nota agregada: 5.0
Nota agregada: 8.0
Nota agregada: 9.0
Nota agregada: 10.0
Nota agregada: 5.0
Nombre: Juan
Legajo: 001
Promedio: 7.9

```

---

## 🚀 Conceptos de Programación Aplicados

* **Encapsulamiento de Estado:** Ocultamiento de los arreglos y contadores internos, exponiendo únicamente métodos públicos seguros para interactuar con el objeto.
* **Gestión Manual de Arreglos:** Uso de contadores de posición (`cantidadNota`) para controlar de forma eficiente el llenado de estructuras de tamaño fijo en memoria.
* **Diseño Modular:** Clara separación entre la lógica de dominio académico (`Estudiante`) y la ejecución del caso de uso (`Main`).
