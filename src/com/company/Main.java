package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        gas option = new gas();
        speed limit = new speed();
        KeyFob fob = new KeyFob();

        String answer;
        boolean yn;

        System.out.println("Do you want to go for a drive? (y/n)");
        while (true) {
            answer = input.nextLine().trim().toLowerCase();
            if (answer.equals("y")) {
                yn = true;
                System.out.println("Lets go for a drive");
                break;
            } else if (answer.equals("n")) {
                yn = false;
                System.out.println("Come back when you want to go for a drive");
            } else {
                System.out.println("Sorry, I didn't catch that. Please answer y/n");
            }
        }

        System.out.println("Your car is: " + fob.getLock() + "At: " + fob.getTime() + " PM");

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




        }
    }







