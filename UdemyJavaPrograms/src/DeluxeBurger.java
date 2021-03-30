public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "sausage with beacon", 19.10, "Milk bread");
        super.addHamburgerAddition1( "Chips", 2.12);
        super.addHamburgerAddition2( "Drink", 3.24);
    }

//    @Override
//    public void addHamburgerAdditions(int count, String name, double itemPrice) {
//        System.out.println("Deluxe hamburger cannot be topped");
//    }
}
