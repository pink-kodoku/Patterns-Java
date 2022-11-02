package chainOfResponsibility;

public class HttpRequest {
    private String password;
    private String username;

    public HttpRequest(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
