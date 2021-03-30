public class Hamburger {

    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price)
    {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price)
    {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price)
    {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price)
    {
        this.addition4Name = name;
        this.addition4Price = price;
    }


//    public void addHamburgerAdditions(int count, String name, double itemPrice)
//    {
//        switch (count) {
//            case 1:
//                addition1Name = name;
//                addition1Price = itemPrice;
//                break;
//            case 2:
//                addition2Name = name;
//                addition2Price = itemPrice;
//                break;
//            case 3:
//                addition3Name = name;
//                addition3Price = itemPrice;
//                break;
//            case 4:
//                addition4Name = name;
//                addition4Price = itemPrice;
//                break;
//            default:
//                break;
//        }
//    }

    public double itemizeHamburger()
    {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + hamburgerPrice);
        if(addition1Name != null)
        {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if(addition2Name != null)
        {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if(addition3Name != null)
        {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if(addition4Name != null)
        {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }
        return hamburgerPrice;
    }

//    public double getTotalPrice() {
//        return basePrice + addition1Price + addition2Price + addition3Price + addition4Price;
//    }

}
