public class Estudiante {
    private String nombre;
    private String legajo;
    private double[] notas;
    private int cantidadNota = 0;


    public Estudiante(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.notas = new double[10];
        this.cantidadNota = 0;
    }


    //Nombreeee
    public String getNombre() {
        return nombre;
    }

    //Legajoooooo
    public String getLegajo() {
        return legajo;
    }

    //-------- Notass --------
    public double[] getNota() {
        return notas;
    }


    public void agregarNota(double nota){
        if (nota >= 0 && nota <= 10) {
            if(cantidadNota < notas.length){
                notas[cantidadNota] = nota;
                cantidadNota++;
                System.out.println("Nota agregada: " + nota);
            }else{
                System.out.println("No se pueden agregar mas notas.");
            }

        }else {
            System.out.println("La nota debe ser de 0 a 10.");
        }
    }

    public double calcularPromedio(){
        if (cantidadNota == 0){
            return 0;
        }

        double suma = 0;
        for(int i = 0; i < cantidadNota; i++){
            suma += notas[i];
        }

        return suma/cantidadNota;

    }

}
