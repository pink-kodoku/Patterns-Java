package command;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CompositeCommand implements Command {
    private Stack<Command> commands = new Stack<>();

    public void push(Command command) {
        commands.push(command);
    }

    public Command pop() {
        return commands.pop();
    }

    @Override
    public void execute() {
        while (!commands.isEmpty()) {
            commands.pop().execute();
        }
    }
}
