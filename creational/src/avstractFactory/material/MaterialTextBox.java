package avstractFactory.material;

import avstractFactory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material textbox");
    }
}
