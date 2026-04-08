public class curso {
    public String nombre;
    public String codigo;
    private int creditos;
    private int horas;

    curso(String nombre, String codigo, int creditos, int horas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.horas = horas;
    }

    public void imprimir() {
        System.out.println("Curso: " + nombre + ", Código: " + codigo + ", Créditos: " + creditos);

    }
}