package ThreadChallenge;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Student {
    private Tutor tutor;
    private Lock lock = new ReentrantLock();

    Student(Tutor tutor) {
        this.tutor = tutor;
    }

    public boolean startStudy() {
        try {
            // increase tutor waiting time
            Thread.sleep(500);
            // study
            System.out.println("Student is studying");
        } catch (InterruptedException iexc) {

        }
        return true;
    }

    public void handInAssignment() {
        System.out.println("Student handed in assignment and waiting for tutor to provide report");
        if(lock.tryLock()) {
            try {
                tutor.getProgressReport();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Student is not able to hand over assignment");
        }
    }
}
