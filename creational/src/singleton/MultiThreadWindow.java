package singleton;

import java.util.concurrent.atomic.AtomicReference;

public final class MultiThreadWindow {
    private static MultiThreadWindow instance;

    public String value;

    private MultiThreadWindow(String value) {
        this.value = value;
    }

    public static MultiThreadWindow getInstance(String value) {
        MultiThreadWindow result = instance;
        if (result != null) {
            return result;
        }

        synchronized (MultiThreadWindow.class) {
            if (instance == null) {
                instance = new MultiThreadWindow(value);
            }
            return instance;
        }
    }

}
