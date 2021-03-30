public class HealthyBurger extends Hamburger {

    private String healthyaddition1Name;
    private double healthyaddition1Price;

    private String healthyaddition2Name;
    private double healthyaddition2Price;

    public HealthyBurger(String meat, double basePrice) {
        super("Healthy", meat, basePrice, "Brown rye");
    }

    public void addHealthyAddition1(String name, double itemPrice)
    {
        this.healthyaddition1Name = name;
        this.healthyaddition1Price = itemPrice;
    }

    public void addHealthyAddition2(String name, double itemPrice)
    {
        this.healthyaddition2Name = name;
        this.healthyaddition2Price = itemPrice;
    }

//    public void addHealthyHamburgerAdditions(int count, String name, double itemPrice)
//    {
//        switch (count) {
//            case 1:
//                healthyaddition1Name = name;
//                healthyaddition1Price = itemPrice;
//                break;
//            case 2:
//                healthyaddition2Name = name;
//                healthyaddition2Price = itemPrice;
//                break;
//            default:
//                break;
//        }
//    }

    @Override
    public double itemizeHamburger() {
        double burgerPrice = super.itemizeHamburger();
        if(healthyaddition1Name != null)
        {
            burgerPrice += this.healthyaddition1Price;
            System.out.println("Added healthy " + this.healthyaddition1Name + " for an extra " + this.healthyaddition1Price);
        }
        if(healthyaddition2Name != null)
        {
            burgerPrice += this.healthyaddition2Price;
            System.out.println("Added healthy " + this.healthyaddition2Name + " for an extra " + this.healthyaddition2Price);
        }
        return burgerPrice;
    }
}
