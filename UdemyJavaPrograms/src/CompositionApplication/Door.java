package CompositionApplication;

public class Door {

    private int width;
    private int height;
    private String colour;

    public Door(int width, int height, String colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    public void openDoor() {
        System.out.println("The door is opened");
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColour() {
        return colour;
    }
}
