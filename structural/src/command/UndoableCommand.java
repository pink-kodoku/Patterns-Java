package command;

public interface UndoableCommand extends Command {
    void unexecute();
}
