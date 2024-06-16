package com.example.firstproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
@Entity
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInscription;
    private int numSemaine;
    @ManyToOne
    @JsonIgnore //pour eviter la boucle infinie lors de la serialisation de l'objet
    private Skieur skieur;
    @ManyToOne
    @JsonIgnore
    private Cours cours;
}
