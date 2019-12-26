package by.training.patient.view;

import by.training.patient.bussiness.DispatcherFactory;
import by.training.patient.controller.Dispatcher;
import by.training.patient.filter.Filter;
import java.util.Scanner;

public class Menu implements View{

    Dispatcher dispatcher = new DispatcherFactory().getDispatcherBuilder().getDispatcher();


    public void userService() {

        System.out.println("Input 1 for list of patient of certain doctor," +
                " 2 for for list of patient of certain diagnosis," +
                " 3 for list of patient of certain department," +
                " 4 for for list of patient of certain number of policy, 5 for escape");
        try (@SuppressWarnings("")
             Scanner scan = new Scanner(System.in)) {
            int choice = scan.nextInt();

        one :    while (true) {

                switch (choice) {

                    case 1:

                        System.out.println("Enter surname of doctor");
                        String doc = new Scanner(System.in).nextLine();
                        System.out.println(dispatcher.execCertainDoctor
                                (new Filter(doc)));

                        System.out.println("Choice next operation");
                        while (!scan.hasNextInt()){
                            System.out.println("Choice next operation");
                            scan.next();
                        }
                        choice = scan.nextInt();
                        break;

                    case 2:

                        System.out.println("Input the diagnosis, please");
                        String diagnosis =  new Scanner(System.in).nextLine();
                        System.out.println(dispatcher.execCertainDoctor
                                (new Filter(diagnosis, null)));
                        System.out.println("Choice next operation, please");
                        choice = scan.nextInt();
                        break;

                    case 3:

                        System.out.println("Input the department, please");
                        String department =  new Scanner(System.in).nextLine();
                        System.out.println(dispatcher.execCertainDepartment
                                (new Filter(null, department)));
                        System.out.println("Choice next operation, please");
                        choice = scan.nextInt();
                        break;

                    case 4:

                        System.out.println("Input number of policy, fro -> to, please");
                        int lowLimit =  new Scanner(System.in).nextInt();
                        int highLimit =  new Scanner(System.in).nextInt();
                        System.out.println(dispatcher.execCertainNumPolicy
                                (new Filter(lowLimit, highLimit)));

                        System.out.println("Choice next operation");
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