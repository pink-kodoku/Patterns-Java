package avstractFactory.material;

import avstractFactory.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material button");
    }
}
