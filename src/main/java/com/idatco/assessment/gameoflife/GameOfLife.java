package com.idatco.assessment.gameoflife;

public class GameOfLife {
    private final CellGrid grid;

    public GameOfLife(int rows, int cols) {
        this.grid = new CellGrid(rows, cols);
        this.grid.randomize();
    }

    public void run(int generations) {
        for (int i = 0; i < generations; i++) {
            System.out.println("Generation " + (i + 1));
            grid.print();
            grid.nextGeneration();
        }
    }
}
