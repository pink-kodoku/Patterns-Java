package state;

public class Brush implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Brush mouse down");
    }

    @Override
    public void mouseUp() {
        System.out.println("Brush mouse up");
    }
}
