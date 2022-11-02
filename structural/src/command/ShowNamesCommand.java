package command;

public class ShowNamesCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Show names to the console");
    }
}
