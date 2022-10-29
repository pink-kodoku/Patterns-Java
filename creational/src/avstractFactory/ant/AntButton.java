package avstractFactory.ant;

import avstractFactory.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant button");
    }
}
