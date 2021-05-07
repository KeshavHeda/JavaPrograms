package CompositionApplication;

public class PCInstance {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27Inch beast", "Acer", 27,
                new Resolution(2540, 1440));

        MotherBoard theMotherBoard = new MotherBoard("BJ-200", "Asus", "v2.44", 4, 6);

        PersonalComputer thePC = new PersonalComputer(theCase, theMonitor, theMotherBoard);

//        thePC.getTheCase().pressPowerButton();
//        thePC.getMotherBoard().loadProgram("Windows 1.0");
//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        thePC.powerUp();

    }

}
