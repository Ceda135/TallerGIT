package tallergit;

public class Materia {
    private String nombre;

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar() {
        System.out.println("Materia: " + nombre);
    }
}
