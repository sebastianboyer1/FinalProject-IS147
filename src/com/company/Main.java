package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        gas option = new gas();
        speed limit = new speed();
        KeyFob fob = new KeyFob();


//      System.out.print("Do you want to go for a drive? (true for yes/false for no) ");
//        boolean bn = sc.nextBoolean();
//        if (bn == true) {
//            System.out.println("Lets go for a drive");
//        } else if (bn == false) {
//            System.out.println("Come back when you want to go for a drive");
//        }

        String Destination;

        System.out.println("Enter the location you wish to go to: ");
        String destination = input.next();
        System.out.println("The directions to: " + destination + ", have been set, let's go!");

        option.gasLow();
        String[][] gasPrice = {
                {"$1.50", "gets you: ", "1 Gallon"},
                {"$3.50", "gets you: ", "2 Gallons"},
                {"$5.50", "gets you: ", "3 Gallons"},
                {"$7.50", "gets you: ", "4 Gallons"}};
        option.gasPrice(gasPrice);

        option.tankFilled();

        limit.speedLimit();

        System.out.println("Your car is: " + fob.getLock() + " Your car is: " + fob.getUnlock());


        }
    }







