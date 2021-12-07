package com.company;

    public class FuelGauge {
        // instance variable
        private int fuel;

        // know about current fuel
        public void setFuel(int fuel) {
            this.fuel = fuel;
        }

        // report current fuel
        public int getFuel() {
            return fuel;
        }

        // increase current fuel
        public void increaseFuel() {
            if (fuel <= 15)
                fuel++;
        }

        // decrease current fuel
        public void decreaseFuel() {
            if (fuel > 0)
                fuel--;
        }

    }


