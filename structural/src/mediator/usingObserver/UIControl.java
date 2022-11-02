package mediator.usingObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    protected void notifyEventHandler() {
        for (EventHandler eventHandler : eventHandlers) {
            eventHandler.handle();
        }
    }
}
