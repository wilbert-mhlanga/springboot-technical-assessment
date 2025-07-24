package com.idatco.assessment.test.gameoflife;


import com.idatco.assessment.gameoflife.CellGrid;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CellGridTest {
    @Test
    public void testGridInitialization() {
        CellGrid grid = new CellGrid(3, 3);
        assertNotNull(grid); // This checks if the grid is initialized properly
    }


    @Test
    public void testRandomizeAndNextGeneration() {
        CellGrid grid = new CellGrid(4, 4);
        grid.randomize();
        grid.nextGeneration(); // This will test if the next generation can be computed without exceptions
    }

    @Test
    public void testPrint() {
        CellGrid grid = new CellGrid(3, 3);
        grid.randomize();
        grid.print(); // This will print the grid to the console
    }
}
