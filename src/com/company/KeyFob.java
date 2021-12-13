package com.company;


public class KeyFob {
    private String lock;
    private String unLock;

    public KeyFob(){
        this.lock = "Lock car";
        this.unLock = "Unlock car";
    }
    public KeyFob(String lock, String unlock) {
        this.lock = lock;
        this.unLock = unlock;
    }
    public String getLock() {
        return lock;
    }
    public void setLock(String lock){
        this.lock = lock;

    }
    public String getUnlock(){
        return unLock;
    }
    public void setUnLock(String unLock){
        this.unLock= unLock;
    }
}




