package com.nexaura.backend.controller;

import com.nexaura.backend.dto.DecisionRequest;
import com.nexaura.backend.dto.DecisionResponse;
import com.nexaura.backend.service.DecisionService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

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
}