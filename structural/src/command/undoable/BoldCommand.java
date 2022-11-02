package command.undoable;

public class BoldCommand implements UndoableCommand {
    private HtmlDocument htmlDocument;
    private String prevContent;
    private History history;

    public BoldCommand(HtmlDocument htmlDocument, History history) {
        this.htmlDocument = htmlDocument;
        this.history = history;
    }

    @Override
    public void execute() {
        prevContent = htmlDocument.getContent();
        htmlDocument.makeBold();
        history.push(this);
    }

    @Override
    public void unexecute() {
        htmlDocument.setContent(prevContent);
    }
}
