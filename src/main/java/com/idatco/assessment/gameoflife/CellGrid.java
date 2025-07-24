package com.idatco.assessment.gameoflife;

import java.util.Random;

public class CellGrid {

    private final int rows, cols;
    private boolean[][] grid;

    public CellGrid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.grid = new boolean[rows][cols];
    }

    public void randomize() {
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = rand.nextBoolean();
            }
        }
    }

    public void nextGeneration() {
        boolean[][] next = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int live = countLiveNeighbors(i, j);
                if (grid[i][j]) {
                    next[i][j] = live == 2 || live == 3;
                } else {
                    next[i][j] = live == 3;
                }
            }
        }

        grid = next;
    }

    private int countLiveNeighbors(int x, int y) {
        int count = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i >= 0 && i < rows && j >= 0 && j < cols && !(i == x && j == y)) {
                    if (grid[i][j]) count++;
                }
            }
        }
        return count;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j] ? "■ " : ". ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
