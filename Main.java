public class Main {
    void main(String[] args) {

        estudiantes e1 = new estudiantes("Belen", "Ingenieria", 20, 9);
        e1.imprimir();
        System.out.println("Promedio: " + e1.Promedio());

        curso c1 = new curso("Matematicas", "MAT101", 4, 80);
        c1.imprimir();

        profesores p1 = new profesores("Luis", "Matematicas", 40, 300);
        p1.imprimir();
    }
}

