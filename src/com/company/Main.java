package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        KeyFob fob = new KeyFob();
        SpeedOfCar speed = new SpeedOfCar();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to go for a drive? (Enter: true/false) ");
        Boolean yn;
        Boolean start = scanner.nextBoolean();

            if (true) {
                System.out.print("Lets go for a drive! ");
            } else {
                System.out.print("Come back when you want to go for a drive!");
            }




    }
}
