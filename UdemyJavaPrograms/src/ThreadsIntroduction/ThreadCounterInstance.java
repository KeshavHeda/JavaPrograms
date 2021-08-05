package ThreadsIntroduction;

import TextColor.TextColorConstant;

public class ThreadCounterInstance {

    public static void main(String[] args) {
        Countdown countdown = new Countdown();

        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(countdown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}

class Countdown {

    private int i; // instance variable is kept on heap
    // adding synchronized to method will put lock on entire method and one thread only can call at a time
    public  void doCountdown() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = TextColorConstant.ANSI_CYAN;
                break;
            case "Thread 2":
                color = TextColorConstant.ANSI_PURPLE;
                break;
            default:
                color = TextColorConstant.ANSI_GREEN;
                break;
        }

        // local variables or primitive types are on thread stack and each will have its own copy
        synchronized(this) {
            for (i = 10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + ": i =" + i);
            }
        }

    }
}

class CountdownThread extends Thread{
    private Countdown threadCountdown;

    public CountdownThread(Countdown countdown) {
        this.threadCountdown = countdown;
    }

    public void run() {
        threadCountdown.doCountdown();
    }
}