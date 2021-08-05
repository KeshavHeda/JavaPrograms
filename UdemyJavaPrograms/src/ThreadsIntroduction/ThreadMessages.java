package ThreadsIntroduction;

import java.util.Random;

public class ThreadMessages {

    public static void main(String[] args) {
        Message localMessage = new Message();
        (new Thread(new Writer(localMessage))).start();
        (new Thread(new Reader(localMessage))).start();
    }
}

class Message{
    private String message;
    private boolean empty = true;

    public synchronized String read() {
        while (empty){
            try{
                wait();
            } catch (InterruptedException iexc) {
                System.out.println(iexc.getMessage());
            }
        }
        empty = true;
        notifyAll();
        return message;
    }

    public synchronized void write(String message) {
        while (!empty){
            try{
                wait();
            } catch (InterruptedException iexc) {
                System.out.println(iexc.getMessage());
            }
        }
        empty = false;
        this.message = message;
        notifyAll();
    }

}

class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    public void run() {
        String messages[] = {
                "Humpty Dumpty sat on a wall",
                "Humpty Dumpty had a great fall",
                "All the king's horses and all the king's men",
                "Couldn't put Humpty together again"
        };

        Random random = new Random();

        for(int i=0; i<messages.length; i++) {
            message.write(messages[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException iexc) {
                System.out.println(iexc.getMessage());
            }
        }
        message.write("Finished");
    }
}

class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    public void run() {
        Random random = new Random();
        for(
                String latestMessage = message.read();
                !latestMessage.equals("Finished");
                latestMessage = message.read()) {
            System.out.println(latestMessage);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException iexc) {
                System.out.println(iexc.getMessage());
            }
        }
    }
}