package com.example.pidev.controller;


import com.example.pidev.entity.User;
import com.example.pidev.service.PasswordResetService;
import com.example.pidev.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private PasswordResetService passwordResetService;

    @Autowired
    private UserService userService;
    // Endpoint pour envoyer l'email de réinitialisation
    @PostMapping("/forgot-password")
    public String sendPasswordResetEmail(@RequestParam String email) {
        passwordResetService.sendPasswordResetEmail(email);
        return "Un email de réinitialisation a été envoyé à " + email;
    }

    // Endpoint pour réinitialiser le mot de passe
    @PostMapping("/reset-password")
    public String resetPassword(@RequestParam String email, @RequestParam String newPassword) {
        passwordResetService.resetPassword(email, newPassword);
        return "Le mot de passe a été réinitialisé pour l'email : " + email;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUser(id);
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        User user = userService.getUser(id); // Récupérer l'utilisateur par son ID
        userService.deleteUser(user); // Supprimer l'utilisateur
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }
}
