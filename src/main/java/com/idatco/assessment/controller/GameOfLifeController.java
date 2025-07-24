package com.idatco.assessment.controller;

import com.idatco.assessment.gameoflife.GameOfLife;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gameOfLife")
public class GameOfLifeController {

    @GetMapping("/run")
    public void runGame(@RequestParam int rows, @RequestParam int cols, @RequestParam int generations) {
        GameOfLife game = new GameOfLife(rows, cols);
        game.run(generations);
    }
}
