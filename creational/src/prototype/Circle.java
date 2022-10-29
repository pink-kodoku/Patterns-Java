package prototype;

public class Circle implements Component {
    private double radius;

    @Override
    public void render() {
        System.out.println("Rendering a circle");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Component clone() {
        Circle newCircle = new Circle();
        newCircle.setRadius(radius);
        return newCircle;
    }
}
