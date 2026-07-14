package com.nexaura.backend.service;

import com.nexaura.backend.dto.DecisionRequest;
import com.nexaura.backend.dto.DecisionResponse;
import com.nexaura.backend.entity.Decision;
import com.nexaura.backend.mapper.DecisionMapper;
import com.nexaura.backend.repository.DecisionRepository;
import org.springframework.stereotype.Service;

@Service
public class DecisionService {

    private final DecisionRepository decisionRepository;
    private final DecisionMapper decisionMapper;

    public DecisionService(DecisionRepository decisionRepository,
                           DecisionMapper decisionMapper) {
        this.decisionRepository = decisionRepository;
        this.decisionMapper = decisionMapper;
    }

    public DecisionResponse saveDecision(DecisionRequest request) {

        Decision decision = decisionMapper.toEntity(request);

        Decision savedDecision = decisionRepository.save(decision);

        return decisionMapper.toResponse(savedDecision);
    }
}