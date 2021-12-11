package com.company;

public class ArrayForGas {

    String[][] gasArray = {
            {"$1.50 ", "gets you ", "1 Gallon"},
            {"$3.50 ", "gets you ", "2 Gallons"},
            {"$5.50 ", "gets you ", "3 Gallons"},
            {"$7.50 ", "gets you ", "4 Gallon"}

    };

    public void printArrayForGas(){

        for (int x = 0; x < gasArray.length; x++) {
            for (int y = 0; y < gasArray.length - 1; y++) {
                System.out.print(gasArray[x][y]);
            }
            System.out.println("\n");
        }


    }
}
