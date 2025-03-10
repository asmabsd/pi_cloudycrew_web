package com.example.pidev.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "blog")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString

public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBlog;
    private String title;
    private String content;
    private String publication;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;



}
