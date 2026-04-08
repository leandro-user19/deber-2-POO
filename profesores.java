public class profesores {

    public String nombre;
    public String especialidad;
    private int edad;
    private double sueldo;

    profesores(String nombre, String especialidad, int edad, double sueldo) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public void imprimir() {
        System.out.println("Profesor: " + nombre + ", Especialidad: " + especialidad);
    }

}
