package factoryMethod.matcha;

import java.util.Map;

public abstract class Controller {
    public void render(String viewName, Map<String, Object> data) {
        var engine = createViewEngine();
        var html = engine.render(viewName, data);
        System.out.println(html);
    }

    protected abstract ViewEngine createViewEngine();
}
