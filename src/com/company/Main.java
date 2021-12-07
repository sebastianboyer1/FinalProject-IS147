package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        KeyFob fob = new KeyFob();
        SpeedOfCar speed = new SpeedOfCar();
        Turning direction = new Turning();

        System.out.print("Do you want to go for a drive? (true for yes/false for no) ");
        Scanner sc = new Scanner(System.in);
        boolean bn = sc.nextBoolean();
        if (bn == true) {
            System.out.println("Lets go for a drive");
        } else if (bn == false) {
            System.out.println("Come back when you want to go for a drive");
        }
        System.out.println("Where do you want to go? (UMBC, Store, Hospital)");
        String destination = sc.next();
        System.out.println("Great I know how to get to the " + destination + " lets go!");

        System.out.println("Up ahead there is a car slowing down do you want to merge right? (true for yes/false for no)");
        boolean merge = sc.nextBoolean();
        if (merge == true) {
            System.out.println("You passed them on the left and saw that they were asleep at the Wheel! Lucky Break! Lets take the next exit.");
        } else if (merge == false) {
            System.out.println("Uh oh they immediately stopped and hit you! You're safe but your car is totaled. Come back next time for your next drive.");
        }

        System.out.println("You're running low on gas lets pull over at the nearest gas station");
        System.out.println("What is the price of gas right now?");
        Double price = sc.nextDouble();
        System.out.println("Here is the table for how much gas is going to cost");
        sc.close();


    }
    }


