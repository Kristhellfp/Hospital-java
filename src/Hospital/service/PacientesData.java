package Hospital.service;

import java.util.ArrayList;
import java.util.List;

class Paciente {
    String nombre;
    String fechaNacimiento;
    String horaCita;
    String tipoVisita;

    public Paciente(String nombre, String fechaNacimiento, String horaCita, String tipoVisita) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.horaCita = horaCita;
        this.tipoVisita = tipoVisita;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s, Fecha de Nacimiento: %s, Hora de Cita: %s, Tipo de Visita: %s",
                nombre, fechaNacimiento, horaCita, tipoVisita);
    }
}

public class PacientesData {
    private List<Paciente> pacientes;

    public PacientesData() {
        pacientes = new ArrayList<>();
        cargarDatosPacientes();
    }

    private void cargarDatosPacientes() {
        pacientes.add(new Paciente("Juan Pérez", "1990-01-15", "07:00", "Consulta general"));
        pacientes.add(new Paciente("María López", "1988-04-22", "07:30", "Chequeo"));
        pacientes.add(new Paciente("Carlos Ruiz", "1995-07-10", "08:00", "Control de diabetes"));
        pacientes.add(new Paciente("Ana Martínez", "1992-11-05", "08:30", "Cita de seguimiento"));
        pacientes.add(new Paciente("Luis González", "1985-03-15", "09:00", "Chequeo"));
        pacientes.add(new Paciente("Sofía Torres", "1993-06-18", "09:30", "Consulta de alergias"));
        pacientes.add(new Paciente("Fernando Hernández", "1989-08-24", "10:00", "Control de hipertensión"));
        pacientes.add(new Paciente("Isabel Castro", "1991-12-12", "10:30", "Chequeo"));
        pacientes.add(new Paciente("Jorge Silva", "1994-02-28", "11:00", "Cita de seguimiento"));
        pacientes.add(new Paciente("Patricia Ruiz", "1987-05-19", "11:30", "Consulta general"));
        pacientes.add(new Paciente("Ricardo Morales", "1996-03-22", "12:00", "Control de diabetes"));
        pacientes.add(new Paciente("Laura Reyes", "1990-10-30", "12:30", "Chequeo"));
        pacientes.add(new Paciente("Felipe Gómez", "1988-01-15", "13:00", "Consulta de alergias"));
        pacientes.add(new Paciente("Gloria Vega", "1992-12-05", "13:30", "Control de hipertensión"));
        pacientes.add(new Paciente("Andrés Castro", "1995-08-20", "14:00", "Cita de seguimiento"));
        pacientes.add(new Paciente("Diana Torres", "1986-06-11", "14:30", "Consulta general"));
        pacientes.add(new Paciente("Cristian Pérez", "1993-11-30", "15:00", "Chequeo"));
        pacientes.add(new Paciente("Karla Sánchez", "1991-09-25", "15:30", "Consulta de alergias"));
        pacientes.add(new Paciente("Julio Fernández", "1994-04-10", "16:00", "Control de diabetes"));
        pacientes.add(new Paciente("Beatriz López", "1989-02-14", "16:30", "Chequeo"));
    }

    public void mostrarPacientes() {
        for (Paciente paciente : pacientes) {
            System.out.println(paciente);
        }
    }

    // Nuevo método getter para obtener la lista de pacientes
    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public static void main(String[] args) {
        PacientesData datos = new PacientesData();
        datos.mostrarPacientes();
    }
}
