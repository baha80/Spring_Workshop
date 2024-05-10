package com.example.firstproject.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString

@Entity
public class Cours implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCours;
    private int niveau;
    @Enumerated(EnumType.STRING)
    private TypeCour typeCour;
    @Enumerated(EnumType.STRING)
    private Support support;
    private Float prix;
    private int crenau;

    @OneToMany(mappedBy = "cours") //FK f inscri
    private Set<Inscription> inscriptions;
}
