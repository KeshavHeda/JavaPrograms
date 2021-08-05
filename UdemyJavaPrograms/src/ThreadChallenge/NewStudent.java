package ThreadChallenge;

public class NewStudent {
    private NewTutor tutor;

    NewStudent(NewTutor tutor) {
        this.tutor = tutor;
    }

    public void startStudy() {
        // study
        System.out.println("Student is studying");
    }

    public void handInAssignment() {
        synchronized (this) {
            synchronized (tutor) {
                System.out.println("Student handed in assignment");
                tutor.getProgressReport();
                tutor.notifyAll();
            }
        }
    }
}
