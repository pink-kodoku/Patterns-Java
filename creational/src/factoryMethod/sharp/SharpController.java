package factoryMethod.sharp;

import factoryMethod.matcha.Controller;
import factoryMethod.matcha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
