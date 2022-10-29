package composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component {
    private List<Component> shapes = new ArrayList<>();

    public void add(Component shape) {
        shapes.add(shape);
    }

    public void render() {
        for (Component shape : shapes) {
            shape.render();
        }
    }
}
