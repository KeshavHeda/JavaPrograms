package AbstractIntroduction;

public class AnimalInstance {

    public static void main(String[] args) {
        Dog dog = new Dog("Percy Flash");
        dog.eat();
        dog.breathe();

        System.out.println("***************************");

        Parrot parrot = new Parrot("Australian Ringneck");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        System.out.println("***************************");

        Penguin penguin = new Penguin("Emperor");
        penguin.eat();
        penguin.breathe();
        penguin.fly();
    }
}
