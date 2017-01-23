package com.prashant.java.games.sudoku.app;

import com.prashant.java.games.sudoku.Board;

/**
 *
 */
public class Application {

    public static void main(String[] args) throws Exception{
        Board board = Board.createBoard(Application.class.getResourceAsStream("/SudokuInput1.txt"));
    }
}
