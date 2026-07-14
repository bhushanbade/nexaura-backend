package com.nexaura.backend.mapper;

import com.nexaura.backend.dto.DecisionRequest;
import com.nexaura.backend.dto.DecisionResponse;
import com.nexaura.backend.entity.Decision;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DecisionMapper {

    public Decision toEntity(DecisionRequest request) {

        Decision decision = new Decision();

        decision.setTitle(request.getTitle());
        decision.setDescription(request.getDescription());
        decision.setStatus(request.getStatus());
        decision.setCreatedAt(LocalDateTime.now());

        return decision;
    }

    public DecisionResponse toResponse(Decision decision) {

        DecisionResponse response = new DecisionResponse();

        response.setId(decision.getId());
        response.setTitle(decision.getTitle());
        response.setDescription(decision.getDescription());
        response.setStatus(decision.getStatus());
        response.setCreatedAt(decision.getCreatedAt());

        return response;
    }
}