package com.company;
import java.util.Scanner;

public class gas {

    public void gasLow() {

        Scanner input = new Scanner(System.in);

        System.out.println("Before we start driving, press '1' to check how many gallons you have in the gas tank: ");
        int response1 = input.nextInt();
        if (response1 == 1) {
            System.out.println("Oh no! You only have 1 gallon left: type '2' to navigate to the nearest gas station: ");
        }
        {


            int response = input.nextInt();
            if (response == 2) {
                System.out.println("You have arrived at the gas station - Here is a table of the gas prices: ");
            }
        }
    }

        public void gasPrice (String array[][]){

            for (String[] array1 : array) {
                System.out.print("[");
                for (String n : array1) {
                    System.out.print(n + " ");
                }
                System.out.println("]");
            }
        }

        public void tankFilled () {
            Scanner input = new Scanner(System.in);
            int gallons;
            System.out.println("Enter the number of gallons you chose to fill your tank up with: ");
            gallons = input.nextInt();

            switch (gallons) {
                case 1:
                    System.out.println("You're credit card has been charged $1.50 at the High's gas station");
                    break;
                case 2:
                    System.out.println("You're credit card has been charged $3.50 at the High's gas station");
                    break;
                case 3:
                    System.out.println("You're credit card has been charged $5.50 at the High's gas station");
                    break;
                case 4:
                    System.out.println("You're credit card has been charged $7.50 at the High's gas station");
                    break;
            }
            System.out.println("Now that you've filled your gas tank up, let's get back on the road and drive!");
        }
    }


