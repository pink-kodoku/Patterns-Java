package avstractFactory.ant;

import avstractFactory.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant textBox");
    }
}
