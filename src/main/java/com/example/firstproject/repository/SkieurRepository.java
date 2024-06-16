package com.example.firstproject.repository;

import com.example.firstproject.entities.Skieur;
import com.example.firstproject.entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur, Long> {
    //JpaRepository
    //create a keyword or use findSkieur by nom
    public Skieur findByNomSk(String name); //nomSk
    //equivallent de Select * from skieur where nom =  name

    public List<Skieur> findByAbonnement_TypeAbon(TypeAbonnement typeAbonnement );




}
