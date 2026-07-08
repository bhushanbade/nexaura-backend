package com.nexaura.backend.service;

import com.nexaura.backend.dto.ApiResponse;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    public ApiResponse getHealthStatus() {
        return new ApiResponse(
                true,
                "Nexaura Backend is Running 🚀",
                null
        );
    }
}