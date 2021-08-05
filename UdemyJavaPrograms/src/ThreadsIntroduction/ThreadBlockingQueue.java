package ThreadsIntroduction;

import TextColor.TextColorConstant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadBlockingQueue {

    public static void main(String[] args) {
        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<>(6);

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        MyNewProducer producer = new MyNewProducer(buffer, TextColorConstant.ANSI_YELLOW);
        MyNewConsumer consumer1 = new MyNewConsumer(buffer, TextColorConstant.ANSI_PURPLE);
        MyNewConsumer consumer2 = new MyNewConsumer(buffer, TextColorConstant.ANSI_CYAN);

        executorService.execute(producer);
        executorService.execute(consumer1);
        executorService.execute(consumer2);

        executorService.shutdown();
    }
}

class MyNewProducer implements Runnable{
    private ArrayBlockingQueue<String> buffer;
    private String color;

    public MyNewProducer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    public void run() {
        Random random = new Random();
        String[] nums = {"1", "2", "3", "4", "5"};

        for (String num: nums) {
            try {
                System.out.println(color + "Adding..." + num);
                buffer.put(num);

                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException iexc){
                System.out.println("Producer was interrupted " + iexc.getMessage());
            }
        }

        System.out.println(color + "Adding EOF and exiting...");
        try {
            buffer.put("EOF");
        } catch (InterruptedException iexc){
            System.out.println("Producer was interrupted " + iexc.getMessage());
        }
    }
}

class MyNewConsumer implements Runnable{
    private ArrayBlockingQueue<String> buffer;
    private String color;

    public MyNewConsumer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    public void run() {

        while(true){
            synchronized (buffer) {
                try {
                    if(buffer.isEmpty()) {
                        continue;
                    }

                    if(buffer.peek().equals("EOF")) {
                        System.out.println(color + "Exiting");
                        break;
                    } else{
                        System.out.println(color + "Removed " + buffer.take());
                    }
                }  catch (InterruptedException iexc){
                    System.out.println("Consumer was interrupted " + iexc.getMessage());
                }
            }
        }
    }
}