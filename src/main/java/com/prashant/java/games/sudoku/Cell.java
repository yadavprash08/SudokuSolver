package com.prashant.java.games.sudoku;

import lombok.Getter;

/**
 *
 */
public class Cell implements CellObserver {
    @Getter
    private final char value;
    @Getter
    private final int row;
    @Getter
    private final int col;
    @Getter
    private final int block;
    @Getter
    private final boolean sealed;

    public Cell(char value, int row, int col) {
        this.value = value;
        this.row = row;
        this.col = col;
        this.sealed = (value == '.');
        this.block = (this.row / 3) * 3 + col % 3;
    }

    public void valueModified(Event event) {

    }
}
