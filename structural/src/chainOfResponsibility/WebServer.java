package chainOfResponsibility;

public class WebServer {
    public void handle(Handler handler, HttpRequest request) {
        handler.handle(request);
    }
}
