package com.example.demo.service;

import com.example.demo.model.SkillOffer;

public interface SkillOfferService {
    SkillOffer createOffer(SkillOffer offer);
    SkillOffer getOfferById(Long id);
}
