package hospital.services;

import hospital.model.Doctor;
import java.util.ArrayList;

public class DataDoctor {

    private ArrayList<Doctor> data;

    public DataDoctor() {
        data = new ArrayList<>();

        data.add(new Doctor("Dr. Diego Rosales", "drosales@hospital.com", "Pediatría", "2596-9866", "drosales", "rdrfl89"));
        data.add(new Doctor("Dra. Andrea Leal", "aleal@hospital.com", "Dermatología", "4215-9863", "aleal", "andrleal78"));
        data.add(new Doctor("Dr. Manuel Gutiérrez", "mgutierrez@hospital.com", "Ginecología", "1248-9633", "mguttierrez", "gutierrexm45"));
        data.add(new Doctor("Dra. Pablo Arco", "parco@hospital.com", "Nutrición", "1478-9658", "parco", "pabloarco74"));
        data.add(new Doctor("Dr. Dilan Tejeda", "dtejeda@hospital.com", "Traumatología", "1248-9744", "dtejeda", "tejedxd77"));
    }


    public Doctor login(String usuario, String contraseña) {
        for (Doctor doctor : data) {
            if (doctor.getUsuario().equals(usuario) && doctor.getContraseña().equals(contraseña)) {
                return doctor;
            }
        }
        return null;
    }

    public ArrayList<Doctor> getDoctores() {
        return data;
    }
}
