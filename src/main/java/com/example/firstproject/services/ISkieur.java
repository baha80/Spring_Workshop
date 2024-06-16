package com.example.firstproject.services;

import com.example.firstproject.entities.Skieur;
import com.example.firstproject.entities.TypeAbonnement;

import java.util.List;

public interface ISkieur {


    public Skieur addSkieur(Skieur sk);
    public Skieur updateSkieur(Skieur sk);
    public List<Skieur> getAllSkieur();
    public Skieur getSkById(Long numsk);
    public void deleteSkieur(Long numsk);

    public Skieur getSkByNom(String nom);

 public Skieur AssignSkieurToPiste(Long numsk, Long numPiste);

 public Skieur addSkieurandAssigntoCours(Skieur skieur, Long numCours);

    public List<Skieur> retrieveSkieurByTypeAbonnement(TypeAbonnement typeAbonnement);





}
