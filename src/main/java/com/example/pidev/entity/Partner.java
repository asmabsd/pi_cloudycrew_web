package com.example.pidev.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "partners")

public class Partner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Part")
    private Integer idPart;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type;  // "HOTEL", "RESTAURANT", "ACTIVITY_ORGANIZER"

    private String contact;

    private String rate;

    private String averageRating;

    private String dateReparation;

    private String verifiedStatus;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "partner", cascade = CascadeType.ALL)
    private List<Activity> activities;

    @OneToMany(mappedBy = "partner", cascade = CascadeType.ALL)
    private List<Reviews> reviews;
}
