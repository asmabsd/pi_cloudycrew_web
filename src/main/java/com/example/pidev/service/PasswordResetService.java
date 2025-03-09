package com.example.pidev.service;


import com.example.pidev.entity.User;
import com.example.pidev.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PasswordResetService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JavaMailSender mailSender;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // Envoi de l'email pour réinitialiser le mot de passe
    public void sendPasswordResetEmail(String email) {
        Optional<User> userOptional = userRepository.findByEmail(email);
        if (userOptional.isPresent()) {
            User user = userOptional.get();

            // Créer le lien de réinitialisation
            String resetLink = "http://localhost:8089/api/users/reset-password?email=" + email;

            // Envoyer l'email
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(user.getEmail());
            message.setSubject("Réinitialisation de votre mot de passe");
            message.setText("Cliquez sur le lien suivant pour réinitialiser votre mot de passe : " + resetLink);
            mailSender.send(message);
        } else {
            // Gérer le cas où l'utilisateur n'existe pas
            throw new RuntimeException("Aucun utilisateur trouvé avec l'email : " + email);
        }
    }

    // Réinitialiser le mot de passe
    public void resetPassword(String email, String newPassword) {
        Optional<User> userOptional = userRepository.findByEmail(email);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setPassword(passwordEncoder.encode(newPassword));
            userRepository.save(user);
        } else {
            // Gérer le cas où l'utilisateur n'existe pas
            throw new RuntimeException("Aucun utilisateur trouvé avec l'email : " + email);
        }
    }
}