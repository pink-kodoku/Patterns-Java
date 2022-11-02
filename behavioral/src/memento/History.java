package memento;

import java.util.List;
import java.util.Stack;

public class History {
    private Stack<EditorState> states = new Stack<>();

    public void push(EditorState state) {
        this.states.push(state);
    }

    public EditorState pop() {
        if (!states.isEmpty()) {
            return states.pop();
        }

        return null;
    }
}
