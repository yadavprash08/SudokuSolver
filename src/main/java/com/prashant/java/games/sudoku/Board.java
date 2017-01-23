package com.prashant.java.games.sudoku;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

/**
 *
 */
@Slf4j
public class Board {

    public static Board createBoard(InputStream stream) {
        Reader inputReader = new InputStreamReader(stream);
        BufferedReader reader = new BufferedReader(inputReader);
        int[] row = {0};
        final Board board = new Board();
        reader.lines().forEach(l->board.processLine(l, row[0]++));
        return board;
    }

    private Board() {
    }

    private void processLine(String line, int rowIndex){
        log.debug("Processing row:{} with input:{}", rowIndex, line);
        Cell[] row = cells[rowIndex];
    }

    private Cell[][] cells = new Cell[9][9];

    public void printBoard(){
        Arrays.stream(cells).forEach(c->{Arrays.stream(c).forEach(System.out::print);
            System.out.println();});
    }
}
