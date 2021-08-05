package ThreadsIntroduction;

import TextColor.TextColorConstant;

public class ThreadInstance {

    public static void main(String[] args) {
        System.out.println(TextColorConstant.ANSI_PURPLE + "Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("=== Another Thread ===");
        anotherThread.start(); // will run on separate instance
//        anotherThread.run(); // will run on main thread instance

        new Thread() {
            @Override
            public void run() {
                System.out.println(TextColorConstant.ANSI_GREEN + "Hello from the anonymous class thread.");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            public void run() {
                // super.run();
                System.out.println(TextColorConstant.ANSI_RED + "Hello from the anonymous class implementation of run.");
                try {
                    anotherThread.join(2000);
                    System.out.println(TextColorConstant.ANSI_RED + "Another thread terminated, or timed out, So I am running again.");
                } catch (InterruptedException inex) {
                    System.out.println(TextColorConstant.ANSI_RED + "I could not wait after all. I was interrupted.");
                }
            }
        });
        myRunnableThread.start();
//        anotherThread.interrupt();

        System.out.println(TextColorConstant.ANSI_PURPLE + "Hello again from the main thread.");

//        anotherThread.start(); // will throw exception as thread cna be started only once
    }

}
