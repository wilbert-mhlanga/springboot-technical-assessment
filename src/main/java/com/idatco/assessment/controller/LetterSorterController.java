package com.idatco.assessment.controller;

import com.idatco.assessment.sorting.LetterSorter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sortLetters")
public class LetterSorterController {

    @PostMapping
    public String sortText(@RequestBody String input) {
        return LetterSorter.sortLetters(input);

    }
}
