package com.thread_life_cycle;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Running there manually...!!");
        try {
            Thread.sleep(2000); //PAUSE MYTHREAD EXECUTION
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args)throws InterruptedException {
        MyThread myThread=new MyThread();
        System.out.println(myThread.getState()); // NEW
        myThread.start();
        System.out.println(myThread.getState());  // RUNNABLE
        System.out.println(Thread.currentThread().getState()); // RUNNABLE-->RUNNING OKAY *_*
        Thread.sleep(100); // TO START RUN METHOD WE USE SLEEP METHOD
        System.out.println(myThread.getState()); // TIMED_WAITING STATE WHILE ITS SLEEPING
        myThread.join(); // MAIN METHOD WAS WAITING FOR myThread TO GET FINISHED
        System.out.println(myThread.getState()); // TERMINATED
    }
}
