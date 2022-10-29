package singleton;


// У нас есть один экземлпляр класса и мы предоставляем глобальную точку доступа к нему
public class Window {
    private static Window window = null;

    private Window() {}

    public static Window getWindow() {
        if (window == null) {
            window = new Window();
        }

        return window;
    }
}
