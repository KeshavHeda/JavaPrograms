package InnerClassIntroduction;

import java.util.Scanner;

public class ButtonAnonymous {

    private static Scanner scanner = new Scanner(System.in);
    private static ButtonLocal btnPrint = new ButtonLocal("Print");
    private static ButtonLocal btnSave = new ButtonLocal("Save");

    public static void main(String[] args) {

        btnPrint.setOnClickListener(new ButtonLocal.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " Control was clicked. Records Printed");
            }
        });

        btnSave.setOnClickListener(new ButtonLocal.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " Control was clicked. Records Saved");
            }
        });

        listen();
    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            System.out.println("Enter your choice: \r\n"
                    + "0 -> Exit\n" +
                    "1 -> Print Click\n" +
                    "2 -> Save Click");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
                case 2:
                    btnSave.onClick();
                    break;
            }
        }
    }
}
