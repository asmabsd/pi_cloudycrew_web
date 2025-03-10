package com.example.pidev.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "activity")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idActivity;
    private  String name;

    @Enumerated(EnumType.STRING)
    private CategoryA categoryA;

    private String location;

    private Boolean disponibility;

    private Integer price;

    @ManyToOne
    @JoinColumn(name = "id_partner")
    private User user;


}
