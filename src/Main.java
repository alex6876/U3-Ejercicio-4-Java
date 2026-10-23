//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan","001");

        estudiante.agregarNota(10);
        estudiante.agregarNota(5);
        estudiante.agregarNota(8);
        estudiante.agregarNota(9);
        estudiante.agregarNota(10);
        estudiante.agregarNota(5);
        estudiante.agregarNota(8);
        estudiante.agregarNota(9);
        estudiante.agregarNota(10);
        estudiante.agregarNota(5);
        estudiante.calcularPromedio();

        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Legajo: " + estudiante.getLegajo());
        System.out.println("Promedio: "+estudiante.calcularPromedio());

    }
}