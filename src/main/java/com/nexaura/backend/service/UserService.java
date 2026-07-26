package com.nexaura.backend.service;

import com.nexaura.backend.dto.UserRequest;
import com.nexaura.backend.dto.UserResponse;
import com.nexaura.backend.entity.User;
import com.nexaura.backend.mapper.UserMapper;
import com.nexaura.backend.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import com.nexaura.backend.exception.ResourceNotFoundException;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository,
                       UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public UserResponse saveUser(UserRequest request) {

        User user = userMapper.toEntity(request);

        User savedUser = userRepository.save(user);

        return userMapper.toResponse(savedUser);
    }
    public List<UserResponse> getAllUsers() {

    List<User> users = userRepository.findAll();

    return users.stream()
            .map(userMapper::toResponse)
            .toList();
}
public UserResponse getUserById(Long id) {

    User user = userRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException(
                    "User not found with id: " + id
            ));

    return userMapper.toResponse(user);
}
public UserResponse updateUser(Long id, UserRequest request) {

    User user = userRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException(
                    "User not found with id: " + id
            ));

    user.setName(request.getName());
    user.setEmail(request.getEmail());
    user.setPassword(request.getPassword());

    User updatedUser = userRepository.save(user);

    return userMapper.toResponse(updatedUser);
}
public void deleteUser(Long id) {

    User user = userRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException(
                    "User not found with id: " + id
            ));

    userRepository.delete(user);
}
}