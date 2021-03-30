public class BedRoomInstance {

    public static void main(String[] args) {

        Wall wallEast = new Wall( 30,20, "Salt-green","East");
        Wall wallWest = new Wall(30,20, "Salt-green","West");
        Wall wallNorth = new Wall(30,20, "Salt-green","North");
        Wall wallSouth = new Wall(30,20, "Salt-green","South");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 5, 4, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        BedRoom bedRoom = new BedRoom("Master bedroom", wallEast, wallWest, wallNorth, wallSouth, ceiling, bed, lamp);

        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();

    }

}
