package by.training.patient.view;

import by.training.patient.bean.Department;
import by.training.patient.bussiness.DispatcherFactory;
import by.training.patient.controller.Dispatcher;
import by.training.patient.exception.MenuException;
import by.training.patient.filter.Filter;
import by.training.patient.validator.DepartmentValidator;

import java.util.Scanner;

public class Menu implements View {

    Dispatcher dispatcher = new DispatcherFactory().getDispatcherBuilder().getDispatcher();


    public void userService() throws MenuException {

        System.out.println("Input 1 for list of patient of certain doctor," +
                " 2 for for list of patient of certain diagnosis," +
                " 3 for list of patient of certain department," +
                " 4 for for list of patient of certain number of policy, 5 for escape");

        try (@SuppressWarnings("")
             Scanner scan = new Scanner(System.in)) {
            while (!scan.hasNextInt()) {
                System.out.println("Input 1 for list of patient of certain doctor," +
                        " 2 for for list of patient of certain diagnosis," +
                        " 3 for list of patient of certain department," +
                        " 4 for for list of patient of certain number of policy, 5 for escape");
                scan.next();
            }
            int choice = scan.nextInt();

            one:
            while (true) {

                switch (choice) {

                    case 1:

                        System.out.println("Enter surname of doctor");
                        try {
                            String doc = new Scanner(System.in).nextLine();
                            System.out.println(dispatcher.execCertainDoctor
                                    (new Filter(null, doc)));
                        } catch (Exception e) {
                            throw new MenuException();
                        }

                        System.out.println("Choice next operation");

                        while (!scan.hasNextInt()) {
                            System.out.println("Choice next operation");
                            scan.next();
                        }
                        choice = scan.nextInt();
                        break;

                    case 2:

                        System.out.println("Input the diagnosis, please");
                        String diagnosis = new Scanner(System.in).nextLine();
                        System.out.println(dispatcher.execCertainDiagnosis
                                (new Filter(diagnosis, null)));
                        System.out.println("Choice next operation, please");

                        while (!scan.hasNextInt()) {
                            System.out.println("Choice next operation");
                            scan.next();
                        }
                        choice = scan.nextInt();
                        break;

                    case 3:

                        try {
                            System.out.println("Input the department, please");
                            String department = new Scanner(System.in).nextLine();

                            if (new DepartmentValidator().isDepartment(department)) {

                                System.out.println(dispatcher.execCertainDepartment
                                        (new Filter(department)));
                            } else {

                                throw new MenuException();
                            }

                        } catch (MenuException e) {
                            System.out.println(("Your request is incorrect"));
                        }
                        System.out.println("Choice next operation, please");

                        while (!scan.hasNextInt()) {
                            System.out.println("Choice next operation");
                            scan.next();
                        }
                        choice = scan.nextInt();
                        break;

                    case 4:
                        System.out.println("Input number of policy, from -> to, please");
                        Scanner scanner = new Scanner(System.in);

                        while (!scanner.hasNextInt()) {
                            System.out.println("Input number of policy correctly, please," +
                                    " from -> to, please");
                            scanner.next();
                        }

                        int lowLimit = scanner.nextInt();

                        while (!scanner.hasNextInt()) {
                            System.out.println("Input number of policy correctly, please," +
                                    "  -> to, please");
                            scanner.next();
                        }
                        int highLimit = scanner.nextInt();

                        System.out.println(dispatcher.execCertainNumPolicy
                                (new Filter(lowLimit, highLimit)));

                        System.out.println("Choice next operation");

                        while (!scan.hasNextInt()) {
                            System.out.println("Choice next operation");
                            scan.next();
                        }
                        choice = scan.nextInt();
                        break;

                    case 5:
                        System.out.println("See you later..");
                        break one;

                    default:
                        System.out.println("You have been done incorrect command");
                        System.out.println("Choice next operation");
                        choice = scan.nextInt();
                }
            }

        }

    }
}
