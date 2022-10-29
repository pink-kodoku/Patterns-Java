package singleton;

public class Main {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        System.out.println(Window.getWindow() == Window.getWindow());
    }

    private static void method2() {
        Thread thread1 = new Thread(() -> {
            MultiThreadWindow window = MultiThreadWindow.getInstance("foo");
            System.out.println(window.value);
        });

        Thread thread2 = new Thread(() -> {
            MultiThreadWindow window = MultiThreadWindow.getInstance("bee");
            System.out.println(window.value);
        });

        thread1.start();
        thread2.start();
    }
}
