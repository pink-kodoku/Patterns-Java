package factoryMethod.matcha;

import java.util.Map;

public class MatchaViewEngine implements ViewEngine {
    public String render(String viewName, Map<String, Object> data) {
        return "View rendered by Matcha";
    }
}
