package com.prashant.java.games.sudoku;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 */
interface CellObserver {
    void valueModified(Event event);

    static enum EventType{
        ADD
    }

    @Getter
    @AllArgsConstructor(staticName = "create")
    static class Event{
        private final String eventId;
        private final EventType type;
        private final char addVal;
        private final Cell source;
    }
}
