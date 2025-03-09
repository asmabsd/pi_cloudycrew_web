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
@Table(name = "activities")

public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAct")
    private Integer idAct;

    @Column(nullable = false)
    private String name;

    private String category;

    private String location;

    @Column(name = "id_Partner")
    private Integer idPartner;

    private String disponibility;

    private String rate;

    @ManyToOne
    @JoinColumn(name = "id_Partner", insertable = false, updatable = false)
    private Partner partner;

    @OneToMany(mappedBy = "activity", cascade = CascadeType.ALL)
    private List<Reservation> reservations;
}
