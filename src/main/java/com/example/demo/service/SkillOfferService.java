package com.example.demo.service;

import com.example.demo.model.SkillOffer;
import java.util.List;

public interface SkillOfferService {

    SkillOffer get(Long id);

    List<SkillOffer> list();
}
