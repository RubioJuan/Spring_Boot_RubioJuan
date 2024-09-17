package EjComponente;

public class Persona implements SerVivo{
    private String nombre;
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String caminar() {
        return "La persona está caminando.";
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
