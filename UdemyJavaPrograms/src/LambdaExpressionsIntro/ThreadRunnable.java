package LambdaExpressionsIntro;

public class ThreadRunnable {
    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println("Printing from the Runnable Main");
            System.out.println("This is line 2");
            System.out.format("This is line %d\n", 3);
        }).start();

        // anonymous method call
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing from the Runnable Anonymous");
            }
        }).start();

        new Thread(new CodeToTun()).start();
    }
}

class CodeToTun implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing from the Runnable custom class");
    }
}
