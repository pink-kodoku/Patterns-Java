package chainOfResponsibility;

import java.util.Objects;

public class Authenticator extends Handler {
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(HttpRequest request) {
        var isValid = Objects.equals(request.getUsername(), "admin")
          && Objects.equals(request.getPassword(), "12345");

        System.out.println("Auth " + isValid);

        return isValid;
    }
}
