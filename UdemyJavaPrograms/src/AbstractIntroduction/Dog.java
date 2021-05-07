package AbstractIntroduction;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating food.");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathe in, breathe out, repeat.");
    }
}
