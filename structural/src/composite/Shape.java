package composite;

public class Shape implements Component {
    public void render() {
        System.out.println("Render a shape");
    }

    @Override
    public void move() {
        System.out.println("Move a shape");
    }
}
