package org.example.demo_tm.service;

import org.example.demo_tm.dto.CreateUserDto;
import org.example.demo_tm.entity.User;
import org.example.demo_tm.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserService {
    
    private final UserRepository userRepository;
    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public User createUser(CreateUserDto dto) {
        User user = new User(dto.getName());
        return userRepository.save(user);
    }
    
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

}
