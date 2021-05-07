package CompositionApplication;

public class Window {

    private int width;
    private int height;
    private String colour;

    public Window(int width, int height, String colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    public void openWindow() {
        System.out.println("The window is opened");
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
