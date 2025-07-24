package com.idatco.assessment.test.sorting;

import com.idatco.assessment.sorting.LetterSorter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LetterSorterTest {
    @Test
    public void testSortLetters() {
        String input = "Contrary to popular belief, the pink unicorn flies east.";
        String expected = "aaabcceeeeeffhiiiiklllnnnnooooppprrrrssttttuuy";
        assertEquals(expected, LetterSorter.sortLetters(input));
    }

    @Test
    public void testEmptyInput() {
        assertEquals("", LetterSorter.sortLetters(""));
    }

    @Test
    public void testOnlyPunctuation() {
        assertEquals("", LetterSorter.sortLetters("!@#$%^&*()"));
    }
}
