package Hospital.service;

import java.util.ArrayList;
import java.util.List;

public class DataSalas {
    private List<Sala> salas;

    public DataSalas() {
        salas = new ArrayList<>();
        cargarSalas(); // Cargar las salas con datos iniciales
    }

    private void cargarSalas() {
        // Agregar salas de ejemplo
        salas.add(new Sala("Sala 1", "Consulta", 10));
        salas.add(new Sala("Sala 2", "Emergencias", 5));
        salas.add(new Sala("Sala 3", "Pediatría", 8));
        salas.add(new Sala("Sala 4", "Cirugía", 3));
        salas.add(new Sala("Sala 5", "Maternidad", 6));
        salas.add(new Sala("Sala 6", "Cirugía", 3));
        salas.add(new Sala("Sala 7", "Maternidad", 6));
        salas.add(new Sala("Sala 8", "Pediatría", 8));
        salas.add(new Sala("Sala 9", "Cirugía", 3));
        salas.add(new Sala("Sala 10", "Maternidad", 6));
        salas.add(new Sala("Sala 11", "Cirugía", 3));
        salas.add(new Sala("Sala 12", "Maternidad", 6));
    }

    public List<Sala> obtenerSalas() {
        return salas;
    }

    // Clase interna que representa una sala
    public static class Sala {
        private String nombre;
        private String tipo;
        private int capacidad;

        public Sala(String nombre, String tipo, int capacidad) {
            this.nombre = nombre;
            this.tipo = tipo;
            this.capacidad = capacidad;
        }

        public String getNombre() {
            return nombre;
        }

        public String getTipo() {
            return tipo;
        }

        public int getCapacidad() {
            return capacidad;
        }

        @Override
        public String toString() {
            return nombre + " - " + tipo + " - Capacidad: " + capacidad;
        }
    }
}
