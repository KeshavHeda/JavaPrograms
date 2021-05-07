package Encapsulation;

public class PrinterInstance {

    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("Initial Page count : " + printer.getPagesPrinted());
        int pagesPrinted  = printer.printPages(4);
        System.out.println("Pages printed was : " + pagesPrinted + " , New Total : " + printer.getPagesPrinted());
        pagesPrinted  = printer.printPages(2);
        System.out.println("Pages printed was : " + pagesPrinted + " , New Total : " + printer.getPagesPrinted());
    }

}
