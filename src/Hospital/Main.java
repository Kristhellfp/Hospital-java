package Hospital;

import Hospital.controller.LoginController;
import Hospital.view.LoginView;
import Hospital.backEnde.BackEnde;

public class Main {
    public static void main(String[] args) {

        LoginView loginView = new LoginView();

        BackEnde backEnde = new BackEnde();

        new LoginController(loginView, backEnde);
    }
}