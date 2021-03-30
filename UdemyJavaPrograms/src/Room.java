public class Room {

    private Wall wall;
    private Window window;
    private Door door;

    public Room(Wall wall, Window window, Door door) {
        this.wall = wall;
        this.window = window;
        this.door = door;
    }

    public void changeWallColour(String colour) {
        this.wall.changeColour(colour);
    }

    public Wall getWall() {
        return wall;
    }

    public Window getWindow() {
        return window;
    }

    public Door getDoor() {
        return door;
    }
}
