package com.example.firstproject.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
@Entity
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkieur;
    private String nomSk;
    private String prenomSk;
    private LocalDate dateNaissance;
    private String ville;




    @OneToOne
    private Abonnement abonnement;
    @OneToMany(mappedBy = "skieur") //mappedBy ==> CUILD
    private Set<Inscription> inscriptions;
    @ManyToMany
    private Set<Piste> pistes;

}


//seralisation : transformation d'un objet en un flux d'octets
// cad on va transformer un objet en un flux d'octets pour pouvoir le stocker dans un fichier ou le transmettre sur le réseau


  /*  OneToOne (Uni /Bid)) ---> FK

        OneToMany Unidi --->TA

        OneToMany Bid / ManyToOne Bid ---->FK

        ManyToMany Uni / Bid ----> TA


        bidere Mappedby   */



/*


OneToOne Uni (FK)

OneToOne (BID) --mappedBy (Fils) FK

OneToMany Bid / ManyToOne --> FK

ManyToOne Uni -- FK

ManyToMany (Uni / BID ) -->TA

OneToMany(Uni) -->TA



*/

//lombok : pour generer les getter et setter
//pagination : pour afficher les données par page

//JPA : Java Persistence API la base de données relationnelle
/*
spring data jpa

3 interfaces
CRUDRepository (CRUD + findById)

2éme interface
PagingAndSortingRepository hérite de CRUD ( CRUD + FINDBYID + PAGINATION + TRI )

3éme interface
JPARepository */