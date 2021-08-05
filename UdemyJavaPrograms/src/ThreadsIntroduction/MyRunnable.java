package ThreadsIntroduction;

import TextColor.TextColorConstant;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(TextColorConstant.ANSI_RED + "Hello from MyRunnable's implementation of run.");
    }

}
