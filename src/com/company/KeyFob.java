package com.company;


public class KeyFob {
    private String lock;
    private double time;

    public KeyFob() {
        this.lock = "Locked ";
        this.time = 4.35;
    }
    public KeyFob(String lock, double time) {
        this.lock = lock;
        this.time = time;
    }
    public String getLock() {
        return lock;
    }
    public void setLock(String lock) {
        this.lock = lock;
    }
    public double getTime(){
        return time;
    }
    public void setTime(double time) {
        this.time = time;
    }
}




