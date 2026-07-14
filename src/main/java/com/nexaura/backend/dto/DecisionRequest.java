package com.nexaura.backend.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DecisionRequest {

    private String title;

    private String description;

    private String status;

}