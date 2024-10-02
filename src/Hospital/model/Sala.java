package Hospital.model;

public class Sala {
    private String nombre;
    private int numeroCamas;
    private String tipo; // por ejemplo: "cirugía", "emergencia", "maternidad", etc.
    private boolean disponible;

    // Constructor
    public Sala(String nombre, int numeroCamas, String tipo) {
        this.nombre = nombre;
        this.numeroCamas = numeroCamas;
        this.tipo = tipo;
        this.disponible = true; // Por defecto, la sala está disponible
    }

    // Métodos Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Método para mostrar información de la sala
    public void mostrarInformacion() {
        System.out.println("Sala: " + nombre);
        System.out.println("Número de Camas: " + numeroCamas);
        System.out.println("Tipo: " + tipo);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }
}
