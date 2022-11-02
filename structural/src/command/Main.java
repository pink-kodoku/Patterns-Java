package command;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        var compositeCommand = new CompositeCommand();
        compositeCommand.push(new ShowNamesCommand());
        compositeCommand.push(new ResizeCommand());
        button.click(compositeCommand);
    }
}
