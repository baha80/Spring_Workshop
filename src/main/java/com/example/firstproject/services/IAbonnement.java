package com.example.firstproject.services;

import com.example.firstproject.entities.Abonnement;

import java.util.List;

public interface IAbonnement {

    public Abonnement addAbonnement(Abonnement sk);
    public Abonnement updateAbonnement(Abonnement sk);
    public List<Abonnement> getAllAbonnement();
    public Abonnement getAbonnementById(Long numsk);
    public void deleteAbonnement(Long numsk);


}


