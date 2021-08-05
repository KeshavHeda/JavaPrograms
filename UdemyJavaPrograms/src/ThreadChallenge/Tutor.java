package ThreadChallenge;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tutor {
    private Student student;
    private Lock lock = new ReentrantLock();

    public void setStudent(Student student) {
        this.student = student;
    }

    public boolean studyTime() {
        System.out.println("Tutor has arrived");
        boolean startStudy = false;
        if (lock.tryLock()) {
            try {
                try {
                    // wait for student to arrive and hand in assignment
                    Thread.sleep(300);
                }
                catch (InterruptedException e) {
                }
                startStudy = student.startStudy();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Waiting for Student");
        }
        System.out.println("Tutor is studying with student");
        return startStudy;
    }

    public void getProgressReport() {
        // get progress report
        System.out.println("Tutor gave progress report");
    }
}
