package com.idatco.assessment.test.controller;

import com.idatco.assessment.controller.GameOfLifeController;
import org.junit.jupiter.api.Test;

public class GameOfLifeControllerTest {
    @Test
    public void testGameControllerRun() {
        GameOfLifeController controller = new GameOfLifeController();
        controller.runGame(5, 5, 2); // This will test if the controller can run the game without exceptions
    }
}