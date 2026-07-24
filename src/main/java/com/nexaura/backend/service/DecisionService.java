package com.nexaura.backend.service;

import com.nexaura.backend.dto.DecisionRequest;
import com.nexaura.backend.dto.DecisionResponse;
import com.nexaura.backend.entity.Decision;
import com.nexaura.backend.mapper.DecisionMapper;
import com.nexaura.backend.repository.DecisionRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import com.nexaura.backend.exception.ResourceNotFoundException;

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
    public DecisionResponse getDecisionById(Long id) {

    Decision decision = decisionRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException(
                    "Decision not found with id: " + id
            ));

    return decisionMapper.toResponse(decision);
}
public DecisionResponse updateDecision(Long id, DecisionRequest request) {

    Decision decision = decisionRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException(
                    "Decision not found with id: " + id
            ));
    decision.setTitle(request.getTitle());
    decision.setDescription(request.getDescription());
    decision.setStatus(request.getStatus());

    Decision updatedDecision = decisionRepository.save(decision);

    return decisionMapper.toResponse(updatedDecision);
}

    public List<DecisionResponse> getAllDecisions() {

        List<Decision> decisions = decisionRepository.findAll();

        return decisions.stream()
                .map(decisionMapper::toResponse)
                .toList();
                
    }
}