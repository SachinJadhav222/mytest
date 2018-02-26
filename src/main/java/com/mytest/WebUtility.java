package com.mytest;

public class WebUtility extends DriverBase {

    public void sleepTime(int sleepTimer){
        try {
            Thread.sleep(1000*sleepTimer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
