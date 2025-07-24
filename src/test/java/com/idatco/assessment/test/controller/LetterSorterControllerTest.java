package com.idatco.assessment.test.controller;

import com.idatco.assessment.controller.LetterSorterController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterSorterControllerTest {
    @Test
    public void testControllerSortText() {
        LetterSorterController controller = new LetterSorterController();
        String input = "Hello, World!";
        String expected = "dehllloorw";
        assertEquals(expected, controller.sortText(input)); // This will test if the controller can trigger the sorting functionality correctly
    }

}
