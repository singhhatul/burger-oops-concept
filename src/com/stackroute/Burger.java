package com.stackroute;

import java.util.Scanner;

public class Burger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Display the menu
        System.out.println("Dear Sir/Madam kindly choose your Burger");
        while (true) {
            System.out.println("1\t Healthy Burger");
            System.out.println("2\t Deluxe Burger");

            System.out.println("Please enter your choice:");

            //Get user's choice
            int choice = in.nextInt();

            //Display the title of the chosen module
            switch (choice) {
                case 1:
                    System.out.println("you have choosen healthy burger\n");
                    HealthyBurger healthyBurger=new HealthyBurger();

                    break;
                case 2:
                    System.out.println("you have choosen deluxe burger\n");
                    DeluxeBurger deluxeBurger=new DeluxeBurger();
                    break;
                default:
                    System.out.println("no burger selecteds\n");
            }//end of switch
            // }//end of the main method
        }
    }
}

