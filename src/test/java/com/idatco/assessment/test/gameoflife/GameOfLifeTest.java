package com.idatco.assessment.test.gameoflife;

import com.idatco.assessment.gameoflife.GameOfLife;
import org.junit.jupiter.api.Test;

public class GameOfLifeTest {
    @Test
    public void testGameInitializationAndRun() {
        GameOfLife game = new GameOfLife(5, 5);
        game.run(2); // Run the game for 2 generations to ensure it initializes and runs without errors

    }
}
