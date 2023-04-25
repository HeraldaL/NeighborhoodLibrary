package org.example;

import java.util.Scanner;

public class Screen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the neighborhood Library");
        System.out.println("[A] show Available books");
        System.out.println("[B] Show checked out Books");
        System.out.println("[C] Exit");
        String input = scanner.nextLine();
        if (input.equals("A")) {
            System.out.println("Available books to checkout");
            for (Book b : Inventory.inventory) {
                if (b.isCheckedOut()) {
                } else {
                    System.out.println(b.getTitle());
                }
            }
            System.out.println("please enter your name to check out a book");
            String name = scanner.nextLine();
            System.out.println("What Book would you like to check out?");
            String title = scanner.nextLine();
            for (Book b : Inventory.inventory) {
                if (b.getTitle().equals(title)) {
//                    System.out.println("Would you like to check out?");
//                    System.out.println("Enter the ID of the book you would like to check out: ");
//                    int id = scanner.nextInt();
                    b.checkOut(name);
                    System.out.println("You have checked out " + b.getTitle());
                }

            }
        } else if (input.equals("B")) {
            System.out.println("Checked out Books");
            for (Book c : Inventory.inventory) {
                if (!c.isCheckedOut()) {

                    System.out.println(c.getTitle());
                    System.out.println("please enter your id to check in a book");
                    String id = scanner.nextLine();
                    System.out.println("What Book would you like to check in?");
                    String title = scanner.nextLine();
                    if (c.getTitle().equals(title)) {
//                    System.out.println("Would you like to check out?");
//                    System.out.println("Enter the ID of the book you would like to check out: ");
//                    int id = scanner.nextInt();
                        c.checkIn();
                        System.out.println("You have checked in " + c.getTitle());
                        return;
                    }


                }
            }


        } else if (input.equals("C")) {
            return;
        }


    }
}
