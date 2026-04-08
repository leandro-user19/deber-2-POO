public class estudiantes {

    public String nombre;
    private String carrera;
    private int edad;
    public int nota;


    estudiantes(String nombre, String carrera, int edad, int nota){
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;
        this.nota  = nota;



    }
    public void imprimir(){

        System.out.println("Estudiante: " + nombre + ", Carrera: " + carrera + ", Edad: " + edad);

    }
    public double Promedio() {
        return nota; // simple ejemplo
    }
}
