package com.example.pidev.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id") //
//@JsonIgnoreProperties({"name", "type", "location", "image", "menus"})
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nameMenu;
    private String descriptionMenu;
    private double prixMenu;

    @ManyToOne
    @JoinColumn(name = "gastronomy_id", referencedColumnName = "id")
    @JsonIgnoreProperties(value = {"name", "type", "location", "image", "menus"})
    private Gastronomy gastronomy;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameMenu() {
        return nameMenu;
    }

    public void setNameMenu(String nameMenu) {
        this.nameMenu = nameMenu;
    }

    public String getDescriptionMenu() {
        return descriptionMenu;
    }

    public void setDescriptionMenu(String descriptionMenu) {
        this.descriptionMenu = descriptionMenu;
    }

    public double getPrixMenu() {
        return prixMenu;
    }

    public void setPrixMenu(double prixMenu) {
        this.prixMenu = prixMenu;
    }

    public Gastronomy getGastronomy() {
        return gastronomy;
    }

    public void setGastronomy(Gastronomy gastronomy) {
        this.gastronomy = gastronomy;
    }
}
