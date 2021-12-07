package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        KeyFob fob = new KeyFob();
        SpeedOfCar speed = new SpeedOfCar();
        Turning direction = new Turning();

        System.out.print("Do you want to go for a drive?- ");
        Scanner sc = new Scanner(System.in);
        boolean bn = sc.nextBoolean();
        if (bn == true) {
            System.out.println("Lets go for a drive");
        } else if (bn == false) {
            System.out.println("Come back when you want to go for a drive");
        }
        sc.close();
        /*System.out.println("Do you want to go for a drive? (Enter: yes/no) ");
        Boolean yes = true;
        Boolean no = false;
        boolean bn = scanner.nextBoolean();
        if (bn = true) {
            System.out.println("Lets go for a drive!");
        }else if (bn = false)
            System.out.println("Come back when you want to go for a drive!");
        }*/


    }
    }


