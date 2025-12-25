package com.example.demo.service.impl;

import com.example.demo.model.SkillOffer;
import com.example.demo.repository.SkillOfferRepository;
import com.example.demo.service.SkillOfferService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillOfferServiceImpl implements SkillOfferService {

    private final SkillOfferRepository repository;

    public SkillOfferServiceImpl(SkillOfferRepository repository) {
        this.repository = repository;
    }

    @Override
    public SkillOffer createOffer(SkillOffer offer) {
        return repository.save(offer);
    }

    @Override
    public SkillOffer updateOffer(Long id, SkillOffer offer) {
        Skill existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setSkillName(offer.getSkillName());
            return repository.save(existing);
        }
        return null;
    }

    @Override
    public List<SkillOffer> getOffersByUser(Long userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public void deactivateOffer(Long id) {
        SkillOffer offer = repository.findById(id).orElse(null);
        if (offer != null) {
            offer.setActive(false);
            repository.save(offer);
        }
    }
}
