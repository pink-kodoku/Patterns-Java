package command.undoable;

import java.util.Stack;

public class History {
    private Stack<UndoableCommand> commands = new Stack<>();

    public void push(UndoableCommand undoableCommand) {
        commands.push(undoableCommand);
    }

    public UndoableCommand pop() {
        return commands.pop();
    }

    public int size() {
        return commands.size();
    }
}
