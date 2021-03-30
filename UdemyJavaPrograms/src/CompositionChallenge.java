public class CompositionChallenge {

    public static void main(String[] args) {

        Wall wall = new Wall(30, 20, "yellow", "All");
        Door door = new Door(6, 6, "brown");
        Window window = new Window(3, 4, "purple");

        Room room = new Room(wall, window, door);
        room.getDoor().openDoor();
        room.changeWallColour("sea-blue");

    }
}
