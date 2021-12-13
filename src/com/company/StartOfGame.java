package com.company;
import java.util.Scanner;

public class StartOfGame {

    public void start() {
        String answer;
        boolean yn;
        Scanner input = new Scanner(System.in);
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
    }
}