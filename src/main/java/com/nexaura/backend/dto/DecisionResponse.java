package com.nexaura.backend.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class DecisionResponse {

    private Long id;

    private String title;

    private String description;

    private String status;

    private LocalDateTime createdAt;

}