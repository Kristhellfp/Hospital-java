package Hospital;

import Hospital.controller.LoginController;
import Hospital.view.LoginView;
import Hospital.backEnde.BackEnde;
import Hospital.service.DataSalas;
import Hospital.view.SalasView;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        // Crear instancia de la vista de login
        LoginView loginView = new LoginView();

        // Crear instancia del backend
        BackEnde backEnde = new BackEnde();

        // Crear el controlador y pasar la vista y el backend
        new LoginController(loginView, backEnde);

        // Crear y mostrar la vista de salas
        SalasView salasView = new SalasView();
       DataSalas dataSalas = new DataSalas();
    }
}
