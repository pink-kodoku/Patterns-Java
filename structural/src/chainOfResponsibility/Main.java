package chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        var auth = new Authenticator(null);
        var log = new Logger(auth);
        var compress = new Compressor(log);

        var webServer = new WebServer();
        webServer.handle(compress, new HttpRequest("admin", "12345"));
    }
}
