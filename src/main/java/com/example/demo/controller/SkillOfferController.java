package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.demo.model.SkillOffer;
import com.example.demo.service.SkillOfferService;

@RestController
@RequestMapping("/api/skill-offers")
public class SkillOfferController {

    private final SkillOfferService service;

    public SkillOfferController(SkillOfferService service) {
        this.service = service;
    }

    @PostMapping
    public SkillOffer create(@RequestBody SkillOffer offer) {
        return service.createOffer(offer);
    }

    @PutMapping("/{id}")
    public SkillOffer update(@PathVariable Long id, @RequestBody SkillOffer offer) {
        return service.updateOffer(id, offer);
    }

    @GetMapping("/{id}")
    public SkillOffer getById(@PathVariable Long id) {
        return service.getOfferById(id);
    }

    @GetMapping("/user/{userId}")
    public List<SkillOffer> getByUser(@PathVariable Long userId) {
        return service.getOffersByUser(userId);
    }

    @PutMapping("/{id}/deactivate")
    public void deactivate(@PathVariable Long id) {
        service.updateOffer(id, new SkillOffer());
    }
}
