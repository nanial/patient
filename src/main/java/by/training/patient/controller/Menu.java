package by.training.patient.controller;

import java.util.Scanner;

public class Menu {

    public void userService() {

        System.out.println("Input 1 for list per page of book, 2 for search certain book," +
                " 3 for search books of certain author, 4 for offer new book, 5 for escape");
        try (@SuppressWarnings("")
             Scanner scan = new Scanner(System.in)) {
            int choice = scan.nextInt();

            while (true) {

                switch (choice) {

                    case 1:

                        System.out.println("Enter number of page");
                       // bm.getBookList(new BookFilter(new Scanner(System.in).nextInt()));
                        System.out.println("Choice next operation");
                        while (!scan.hasNextInt()){
                            System.out.println("Choice next operation");
                            scan.next();
                        }
                        choice = scan.nextInt();
                        break;

                    case 2:

                        System.out.println("Input title of book, please");
                        String titl =  new Scanner(System.in).nextLine();
                       // bm.getBookList(new BookFilter(null, titl));
                        System.out.println("Choice next operation, please");
                        choice = scan.nextInt();
                        break;

                    case 3:

                        System.out.println("Input author of book, please");
                        String auth =  new Scanner(System.in).nextLine();
                       // bm.getBookList(new BookFilter(auth, null));
                        System.out.println("Choice next operation, please");
                        choice = scan.nextInt();
                        break;

                    case 4:

                        System.out.println("Input author of book, please");
                        String author =  new Scanner(System.in).nextLine();

                        System.out.println("Choice next operation");
                        choice = scan.nextInt();
                        break;

                    case 5:
                        System.out.println("See you later..");
                        System.exit(0);

                    default:
                        System.out.println("You have been done incorrect command");
                        System.out.println("Choice next operation");
                        choice = scan.nextInt();
                }
            }

        }

    }
}
