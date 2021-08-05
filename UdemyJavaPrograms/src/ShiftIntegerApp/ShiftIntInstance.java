package ShiftIntegerApp;

import TextColor.TextColorConstant;

public class ShiftIntInstance {

    public static void main(String[] args) {
        int x = 922342959;
        writeInt(x);
    }

    private static void display(int x) {
        String all = String.format("%32s", Integer.toBinaryString(x)).replace(" ", "0");
        String colouredBinary = all.substring(0, 24) + TextColorConstant.ANSI_PURPLE + all.substring(24) + TextColorConstant.ANSI_RESET;
        int y = x & 0xFF;
        String output = String.format("%10d and 0xFF is %8s \t %10d is ",  y, Integer.toBinaryString(y), x) + colouredBinary;
        System.out.println(output);
    }

    private static void writeInt(int v) {
        int x;
        display(v >>> 24);
        display(v >>> 16);
        display(v >>> 8);
        display(v >>> 0);
    }
}
