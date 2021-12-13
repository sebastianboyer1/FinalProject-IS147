package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        gas option = new gas();
        speed limit = new speed();
        KeyFob fob = new KeyFob();
        MessageInGame thankYou = new MessageInGame();
        StartOfGame start = new StartOfGame();
        Turning watchOut = new Turning();

        start.start();

        System.out.println("Your car is: " + fob.getLock() + "At: " + fob.getTime() + " PM");

        String Destination;

        System.out.println("Enter the location you wish to go to: ");
        String destination = input.next();
        System.out.println("The directions to: " + destination + ", have been set, let's go!");

        thankYou.message();

        option.gasLow();
        String[][] gasPrice = {
                {"$1.50", "gets you: ", "1 Gallon"},
                {"$3.50", "gets you: ", "2 Gallons"},
                {"$5.50", "gets you: ", "3 Gallons"},
                {"$7.50", "gets you: ", "4 Gallons"}};
        option.gasPrice(gasPrice);

        option.tankFilled();

        limit.speedLimit();

        watchOut.crash();




        }
    }







