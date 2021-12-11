package com.company;

import java.util.Scanner;

public class Turning {

    public void crash(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Up ahead there is a car slowing down do you want to merge right? (true for yes/false for no)");
        boolean merge = sc.nextBoolean();
        if (merge == true) {
            System.out.println("You passed them on the right and saw that they were asleep at the Wheel! Lucky Break! Lets take the next exit.");
        } else if (merge == false) {
            System.out.println("Uh oh they immediately stopped and hit you! You're safe but your car is totaled. Come back next time for your next drive.");
        }
    }
}
