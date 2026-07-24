package com.nexaura.backend.controller;

import com.nexaura.backend.dto.DecisionRequest;
import com.nexaura.backend.dto.DecisionResponse;
import com.nexaura.backend.service.DecisionService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/decisions")
public class DecisionController {

    private final DecisionService decisionService;

    public DecisionController(DecisionService decisionService) {
        this.decisionService = decisionService;
    }

    @PostMapping
    public DecisionResponse createDecision(@Valid @RequestBody DecisionRequest request) {
        return decisionService.saveDecision(request);
    }

    @GetMapping
    public List<DecisionResponse> getAllDecisions() {
        return decisionService.getAllDecisions();
    }
    @GetMapping("/{id}")
public DecisionResponse getDecisionById(@PathVariable Long id) {
    return decisionService.getDecisionById(id);
}
@PutMapping("/{id}")
public DecisionResponse updateDecision(
        @PathVariable Long id,
        @Valid @RequestBody DecisionRequest request) {

    return decisionService.updateDecision(id, request);
}

}