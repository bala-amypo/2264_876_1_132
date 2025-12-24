package com.example.demo.controller;

import com.example.demo.model.SkillOffer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/offers")
public class SkillOfferController {

    @GetMapping("/{id}")
    public ResponseEntity<SkillOffer> get(@PathVariable Long id) {
        SkillOffer offer = new SkillOffer();
        offer.setId(id);
        return ResponseEntity.ok(offer);
    }

    @GetMapping
    public ResponseEntity<List<SkillOffer>> list() {
        return ResponseEntity.ok(new ArrayList<>());
    }
}
