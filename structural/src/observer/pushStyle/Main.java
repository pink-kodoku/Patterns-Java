package observer.pushStyle;

public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource();
        dataSource.addObserver(new SpreadSheet());
        dataSource.addObserver(new Chart());
        dataSource.setValue(5);
    }
}
