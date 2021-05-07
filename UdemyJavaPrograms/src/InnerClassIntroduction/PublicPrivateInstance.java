package InnerClassIntroduction;

public class PublicPrivateInstance {

    public static void main(String[] args) {

        // Public Inner Class
//        GearBoxPublic mcLarenPublic = new GearBoxPublic(6);
//        GearBoxPublic.Gear first = mcLarenPublic.new Gear(1, 12.3);
////        GearBox.Gear second = new GearBox.Gear(2, 15.4); // not enclosing class
////        GearBox.Gear third = new mcLarenPublic.Gear(3, 17.8); // cannot resolve symbol gear
//
//        System.out.println(first.driveSpeed(1000));

        // Private Inner Class
        GearBoxPrivate mcLarenPrivate = new GearBoxPrivate(6);

//        mcLarenPrivate.addGear(1,5.3);
//        mcLarenPrivate.addGear(2,10.6);
//        mcLarenPrivate.addGear(3,15.9);

        mcLarenPrivate.operateClutch(true);
        mcLarenPrivate.changeGear(1);
        mcLarenPrivate.operateClutch(false);
        System.out.println(mcLarenPrivate.wheelSpeed(1000));

        mcLarenPrivate.changeGear(2);
        System.out.println(mcLarenPrivate.wheelSpeed(3000));

        mcLarenPrivate.operateClutch(true);
        mcLarenPrivate.changeGear(3);
        mcLarenPrivate.operateClutch(false);
        System.out.println(mcLarenPrivate.wheelSpeed(6000));

    }
}
