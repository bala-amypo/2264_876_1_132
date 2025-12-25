package com.example.demo.controller;

import com.example.demo.model.MatchRecord;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matches")
public class MatchRecordController {

    @PostMapping("/generate/{id}")
    public MatchRecord generate(@PathVariable Long id) {
        return new MatchRecord();
    }
}
