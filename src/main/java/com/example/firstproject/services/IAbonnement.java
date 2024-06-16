package com.example.firstproject.services;

import com.example.firstproject.entities.Abonnement;
import com.example.firstproject.entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface IAbonnement {

    public Abonnement addAbonnement(Abonnement sk);
    public Abonnement updateAbonnement(Abonnement sk);
    public List<Abonnement> getAllAbonnement();
    public Abonnement getAbonnementById(Long numsk);
    public void deleteAbonnement(Long numsk);

    public List<Abonnement> getAbonnementByType(TypeAbonnement typeAbonnement);//retrieve all abonnements by type

    public List<Abonnement> retrieveSubscriptionByDate(LocalDate startDate, LocalDate endDate);
}


