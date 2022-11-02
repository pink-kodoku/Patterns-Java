package memento;

public class Main {
    public static void main(String[] args) {
        History history = new History();
        Editor editor = new Editor();
        editor.setContent("A");
        history.push(editor.createState());
        editor.setContent("B");
        history.push(editor.createState());
        editor.setContent("C");
        editor.restore(history.pop());
        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }
}
