package ConstructorValid;

public class CarInstance {

    public static void main(String[] args) {

        ConstructorValid.Car porsche = new ConstructorValid.Car();
        ConstructorValid.Car holden = new ConstructorValid.Car();
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());


    }
}
