package ThreadsIntroduction;

public class ThreadHello {

    public static void main(String[] args) {
        final PolitePerson jane= new PolitePerson("JANE");
        final PolitePerson john = new PolitePerson("JOHN");

        new Thread(new Runnable() {
            @Override
            public void run() {
                jane.sayHello(john);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                john.sayHello(jane);
            }
        }).start();

//        jane.sayHello(john);
//        john.sayHello(jane);
    }

    static class PolitePerson {
        private final String name;

        public PolitePerson(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public synchronized void sayHello(PolitePerson politePerson) {
            System.out.format("%s: %s"+ " has said hello to me!%n", this.getName(), politePerson.getName());
            politePerson.sayHelloBack(this);
        }

        public synchronized void sayHelloBack(PolitePerson politePerson) {
            System.out.format("%s: %s"+ " has said hello back to me!%n", this.getName(), politePerson.getName());
        }

    }

}
