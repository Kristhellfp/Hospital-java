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
        pacientes.add(new Paciente("Mateo Ramírez", "1990-03-21", "07:00", "Consulta general"));
        pacientes.add(new Paciente("Lucía Fernández", "1987-05-17", "07:30", "Chequeo de rutina"));
        pacientes.add(new Paciente("David Ortega", "1996-06-12", "08:00", "Control de presión arterial"));
        pacientes.add(new Paciente("Claudia Morales", "1993-08-07", "08:30", "Cita de seguimiento"));
        pacientes.add(new Paciente("Javier Pérez", "1984-12-02", "09:00", "Chequeo"));
        pacientes.add(new Paciente("Alejandra Vargas", "1991-11-15", "09:30", "Consulta de alergias"));
        pacientes.add(new Paciente("Diego Gutiérrez", "1988-07-20", "10:00", "Control de colesterol"));
        pacientes.add(new Paciente("Sara Jiménez", "1992-09-09", "10:30", "Chequeo"));
        pacientes.add(new Paciente("Manuel Santos", "1994-10-22", "11:00", "Cita de seguimiento"));
        pacientes.add(new Paciente("Elena Castro", "1986-03-11", "11:30", "Consulta general"));
        pacientes.add(new Paciente("Rafael Díaz", "1995-01-29", "12:00", "Control de azúcar en sangre"));
        pacientes.add(new Paciente("Isabel Navarro", "1990-12-05", "12:30", "Chequeo de rutina"));
        pacientes.add(new Paciente("Gabriel Soto", "1989-06-23", "13:00", "Consulta de alergias"));
        pacientes.add(new Paciente("Patricia Suárez", "1991-04-17", "13:30", "Control de hipertensión"));
        pacientes.add(new Paciente("Esteban Ruiz", "1996-02-08", "14:00", "Cita de seguimiento"));
        pacientes.add(new Paciente("Ana Gómez", "1987-10-18", "14:30", "Consulta general"));
        pacientes.add(new Paciente("Oscar Martínez", "1993-03-19", "15:00", "Chequeo"));
        pacientes.add(new Paciente("Verónica León", "1992-11-30", "15:30", "Consulta de alergias"));
        pacientes.add(new Paciente("Roberto Vega", "1994-09-07", "16:00", "Control de diabetes"));
        pacientes.add(new Paciente("Andrea Torres", "1988-02-14", "16:30", "Chequeo"));

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
