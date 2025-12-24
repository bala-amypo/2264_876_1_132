package com.example.demo.controller;

import com.example.demo.model.MatchRecord;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchController {

    @GetMapping("/{id}")
    public ResponseEntity<MatchRecord> get(@PathVariable Long id) {
        MatchRecord record = new MatchRecord();
        record.setId(id);
        return ResponseEntity.ok(record);
    }

    @GetMapping
    public ResponseEntity<List<MatchRecord>> list() {
        return ResponseEntity.ok(new ArrayList<>());
    }
}
