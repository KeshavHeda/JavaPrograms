package CompositionApplication;

public class Wall {

    private int width;
    private int height;
    private String colour;
    private String direction;

    public Wall(int width, int height, String colour, String direction) {
        this.width = width;
        this.height = height;
        this.colour = colour;
        this.direction = direction;
    }

    public void changeColour(String newColour) {
        System.out.println("The wall has been painted from " + getColour() + " to " + newColour);
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

    public String getDirection() {
        return direction;
    }
}
