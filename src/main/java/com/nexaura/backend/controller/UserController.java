package com.nexaura.backend.controller;

import com.nexaura.backend.dto.DecisionResponse;
import com.nexaura.backend.dto.UserRequest;
import com.nexaura.backend.dto.UserResponse;
import com.nexaura.backend.service.DecisionService;
import com.nexaura.backend.service.UserService;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
private final DecisionService decisionService;

   public UserController(UserService userService,
                      DecisionService decisionService) {

    this.userService = userService;
    this.decisionService = decisionService;
}
@GetMapping("/{id}/decisions")
public List<DecisionResponse> getUserDecisions(
        @PathVariable Long id) {

    return decisionService.getDecisionsByUser(id);
}

    @PostMapping
    public UserResponse createUser(
        @Valid @RequestBody UserRequest request) {
    return userService.saveUser(request);
}
@GetMapping
public List<UserResponse> getAllUsers() {
    return userService.getAllUsers();
}
@GetMapping("/{id}")
public UserResponse getUserById(@PathVariable Long id) {
    return userService.getUserById(id);
}
@PutMapping("/{id}")
public UserResponse updateUser(
        @PathVariable Long id,
        @Valid @RequestBody UserRequest request) {

    return userService.updateUser(id, request);
}
@DeleteMapping("/{id}")
public ResponseEntity<Void> deleteUser(@PathVariable Long id) {

    userService.deleteUser(id);

    return ResponseEntity.noContent().build();
}

}