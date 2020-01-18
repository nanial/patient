package by.training.patient.view;

import by.training.patient.bean.Command;
import by.training.patient.exception.MenuException;
import by.training.patient.filter.Filter;

import java.util.Scanner;

public class AlternativeMenu implements View {
    @Override
    public void userService() throws MenuException {

        if(Command.DOCTOR.toString().equals(new Scanner(System.in).nextLine().toUpperCase().trim())) {
            Command.DOCTOR.service(new Filter(null, new Scanner(System.in).nextLine()));
        }
    }
}
