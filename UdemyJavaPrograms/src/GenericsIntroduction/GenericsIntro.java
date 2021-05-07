package GenericsIntroduction;

import java.util.ArrayList;

public class GenericsIntro {

    public static void main(String[] args) {
//        ArrayList items = new ArrayList();
        ArrayList<Integer> items = new ArrayList<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("tim");
        items.add(4);
        items.add(5);

        printDoubledAny(items);
        printDoubledType(items);
    }

    private static void printDoubledAny(ArrayList items) {
        for (Object i : items) {
            System.out.println(((Integer) i) * 2);
        }
    }

    private static void printDoubledType(ArrayList<Integer> items) {
        for (int i : items) {
            System.out.println(i * 2);
        }
    }
}
