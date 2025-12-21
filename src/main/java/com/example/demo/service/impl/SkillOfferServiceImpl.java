package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.model.SkillOffer;
import com.example.demo.repository.SkillOfferRepository;
import com.example.demo.service.SkillOfferService;

@Service
public class SkillOfferServiceImpl implements SkillOfferService {

    private final SkillOfferRepository repository;

    public SkillOfferServiceImpl(SkillOfferRepository repository) {
        this.repository = repository;
    }

    public SkillOffer createOffer(SkillOffer offer) {
        return repository.save(offer);
    }

    public SkillOffer updateOffer(Long id, SkillOffer offer) {
        offer.setId(id);
        return repository.save(offer);
    }

    public SkillOffer getOfferById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("SkillOffer not found"));
    }

    public List<SkillOffer> getOffersByUser(Long userId) {
        return repository.findByUserId(userId);
    }
}
