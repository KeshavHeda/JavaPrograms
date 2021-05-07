package AbstractIntroduction;

public abstract class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking food.");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathe in, breathe out, repeat multiple times.");
    }

    public abstract void fly();
}
