package com.company;
import java.util.Scanner;
import java.lang.Math;

public class speed {

    public void speedLimit(){

        System.out.println("Let's calculate the speed that you're currently driving:");

        double speed, distance, time;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance that you have covered so far in (miles): ");

        distance = sc.nextDouble();

        System.out.println("Enter the time that it has taken you to cover this distance in (hours): ");

        time = sc.nextDouble();
        speed = distance/time;

        System.out.println("Your current speed is = " + speed + " mph");

        System.out.println("You better slow down! The speed limit on this road is: " + (speed - 10) + "mph");
    }
}