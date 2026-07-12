package com.nexaura.backend.service;

import com.nexaura.backend.entity.Decision;
import com.nexaura.backend.repository.DecisionRepository;
import org.springframework.stereotype.Service;

@Service
public class DecisionService {

    private final DecisionRepository decisionRepository;

    public DecisionService(DecisionRepository decisionRepository) {
        this.decisionRepository = decisionRepository;
    }

    public Decision saveDecision(Decision decision) {
        return decisionRepository.save(decision);
    }

}