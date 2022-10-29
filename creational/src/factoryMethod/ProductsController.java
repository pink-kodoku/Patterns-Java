package factoryMethod;

import factoryMethod.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends SharpController {
    public void listProducts() {
        // Get products from a database
        Map<String, Object> data = new HashMap<>();
        // data.put(products);
        render("products.html", data);
    }
}
