package ScopeIntroduction;

import java.util.Scanner;

public class X {
    private int x;

    public X(int x) {
        this.x = x;
    }

    public X(Scanner x) {
        System.out.println("Enter the number for which multiplication needs to be performed : ");
        this.x = x.nextInt();
    }

    public void x() {
        for (int x = 1; x <= 12; x++) {
            System.out.println(x + " times " + this.x + " is : " + (x * this.x));
        }
    }
}