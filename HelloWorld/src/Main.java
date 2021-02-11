import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello World from Keshav Heda.");
        String animal = "dog";
        String replaced = animal.replace('d','f');
        System.out.println(animal + " -> " + replaced);

        /*

        // Helloworld example
        System.out.println("Hello World from Keshav Heda.");

        // Object Examples
        Car firstCar = new Car(25.5,
            "1FC001", Color.BLUE,
            true);

        Car secondCar = new Car(13.2,
                "2SC002", Color.BLACK,
                false);

        System.out.println("Car 1 License Plate: " + firstCar.licensePlate.toString());
        System.out.println("Car 2 License Plate: " + secondCar.licensePlate.toString());

        System.out.println("Before Color: " + firstCar.paintColor);
        firstCar.changePaintColor(Color.RED);
        System.out.println("After Color: " + firstCar.paintColor);

        // String Examples
        String userInput = "entertainment";
        String uppercased = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(uppercased);

        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);

        System.out.println("Contains : " + userInput.contains("enter"));
        System.out.println("Contains : " + userInput.contains("Enter"));
        System.out.println("Contains : " + userInput.contains("Enter".toLowerCase()));


        // Scanner word examples
        System.out.println("Enter a word:");
        Scanner sc = new Scanner(System.in);

        String userInput = sc.next();
        String uppercased = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(uppercased);

        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);

        // scanner number examples
        Scanner sc = new Scanner(System.in);
        int userNumber1 = sc.nextInt();
        System.out.println(userNumber1);
        double userNumber2 = sc.nextDouble();
        System.out.println(userNumber2);

        // Array Examples
        // 25, 15, 45, 55, 20
        int[] numbers1 = new int[5];
        numbers1[0] = 25;
        numbers1[1] = 15;
        numbers1[2] = 45;
        numbers1[3] = 55;
        numbers1[4] = 20;

        int[] numbers2 = {25, 15, 45, 55, 20};

        Arrays.sort(numbers1);
        System.out.println(numbers1);
        System.out.println(Arrays.toString(numbers1));

        String[] chocolates = {"choco1", "choco2", "choco3"};
        System.out.println("Index 1 : " + chocolates[1]);
        System.out.println("Index 2 : " + chocolates[2]);
        chocolates[2] = "choco31";
        System.out.println("Index 2 : " + chocolates[2]);
        System.out.println("Length : " + chocolates.length);

        System.out.println(Array.get(chocolates, 2));

        // Pass by value examples
        Car firstCar = new Car(25.5,
                "1FC001", Color.BLUE,
                true);

        Car secondCar = new Car(13.2,
                "2SC002", Color.BLACK,
                false);

        double myCarSpeed = 20;
        firstCar.speedingUp(myCarSpeed);
        System.out.println("Speed : " + myCarSpeed);
        myCarSpeed = firstCar.speedingUpReally(myCarSpeed);
        System.out.println("Speed : " + myCarSpeed);


        */

    }
}
