package com.nexaura.backend.controller;

import com.nexaura.backend.entity.Decision;
import com.nexaura.backend.service.DecisionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/decisions")
public class DecisionController {

    private final DecisionService decisionService;

    public DecisionController(DecisionService decisionService) {
        this.decisionService = decisionService;
    }

    @PostMapping
    public Decision createDecision(@RequestBody Decision decision) {
        return decisionService.saveDecision(decision);
    }
}