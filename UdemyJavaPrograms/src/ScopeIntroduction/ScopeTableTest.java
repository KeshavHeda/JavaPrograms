package ScopeIntroduction;

import java.util.Scanner;

public class ScopeTableTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for which multiplication needs to be performed : ");
//        X x = new X(scanner.nextInt());
        X x = new X(new Scanner(System.in));
        x.x();
    }
}
