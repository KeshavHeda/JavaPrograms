package ThreadsIntroduction;

import TextColor.TextColorConstant;

public class AnotherThread extends Thread{

    @Override
    public void run() {
        System.out.println(TextColorConstant.ANSI_BLUE + "Hello from " + currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException inex) {
            System.out.println(TextColorConstant.ANSI_BLUE + "Another thread woke me up");
            return;
        }

        System.out.println(TextColorConstant.ANSI_BLUE + "Five seconds have passed and I am awake " + currentThread().getName());

    }

}
