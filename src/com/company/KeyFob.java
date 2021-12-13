package com.company;


public class KeyFob {
    private String locked;

    public KeyFob() {
        this.locked = "Locked ";
    }

    public KeyFob(String locked) {
        this.locked = locked;

    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String lock) {
        this.locked = lock;

    }
}


