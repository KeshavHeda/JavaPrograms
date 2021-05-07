package Polymorphism;

class BaseCar {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public BaseCar(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return "ConstructorValid.Car -> startEngine()";
    }

    public String accelerate() {
        return "ConstructorValid.Car -> accelerate()";
    }

    public String brake() {
        return "ConstructorValid.Car -> brake()";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}


class Mitsubishi extends BaseCar {
    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Polymorphism.Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Polymorphism.Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Polymorphism.Mitsubishi -> brake()";
    }
}

class Ford extends BaseCar {
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Polymorphism.Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Polymorphism.Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Polymorphism.Ford -> brake()";
    }
}

class Holden extends BaseCar {
    public Holden(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Polymorphism.Holden -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Polymorphism.Holden -> accelerate()";
    }

    @Override
    public String brake() {
        return "Polymorphism.Holden -> brake()";
    }
}

public class PolymorphismCar {
    public static void main(String[] args) {

        BaseCar car = new BaseCar("Base ConstructorValid.Car", 8 );
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi("Outlander VRX", 6 );
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford("Polymorphism.Ford Falcon", 4 );
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden("Commodore", 5 );
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

//        for (int i = 1; i < 11; i++) {
//            ConstructorValid.Car car = randomCar();
//            System.out.println("ConstructorValid.Car #" + i +
//                    " : " + car.getName());
//            car.StartEngine();
//            car.accelerate();
//            car.brake();
//        }
    }
//
//    public static ConstructorValid.Car randomCar() {
//        int randomNumber = (int) (Math.random() * 3) + 1;
//        System.out.println("Random number generated was : " + randomNumber);
//
//        switch (randomNumber) {
//            case 1:
//                return new Honda();
//            case 2:
//                return new Toyota();
//            case 3:
//                return new Polymorphism.Ford();
//        }
//        return null;
//    }

}