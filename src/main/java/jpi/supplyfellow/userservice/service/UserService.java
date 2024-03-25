package jpi.supplyfellow.userservice.service;

import jpi.supplyfellow.userservice.model.User;
import java.util.List;


import java.util.Optional;

public interface UserService {
    User registerUser(User user);
    List<User> getAllUsers();
    Optional<User> findById(Long id);
    void deleteById(Long id);
    User findByEmail(String email);
    User updateUser(Long id, User user);
    // Consider including authentication method signatures if handling authentication within the service
}