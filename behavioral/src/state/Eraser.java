package state;

public class Eraser implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Eraser mouse down");
    }

    @Override
    public void mouseUp() {
        System.out.println("Eraser mouse up");
    }
}
