package observer.pullStyle;

public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource();
        dataSource.addObserver(new SpreadSheet(dataSource));
        dataSource.addObserver(new Chart(dataSource));
        dataSource.setValue(5);
    }
}
