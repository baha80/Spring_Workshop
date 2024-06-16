package com.example.firstproject.services;

import com.example.firstproject.entities.Abonnement;
import com.example.firstproject.entities.TypeAbonnement;
import com.example.firstproject.repository.AbonnementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
@Service
@AllArgsConstructor

public class AbonnementServiceIMP implements IAbonnement{

    private AbonnementRepository abonnementRepository;
    @Override
    public Abonnement addAbonnement(Abonnement sk) {
        return abonnementRepository.save(sk);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement sk) {
        return abonnementRepository.save(sk);
    }

    @Override
    public List<Abonnement> getAllAbonnement() {
        return abonnementRepository.findAll();
    }

    @Override
    public Abonnement getAbonnementById(Long numsk) {
        return abonnementRepository.findById(numsk).get();
    }

    @Override
    public void deleteAbonnement(Long numsk) {
        abonnementRepository.deleteById(numsk);

    }

    @Override
    public List<Abonnement> getAbonnementByType(TypeAbonnement typeAbonnement) {
        return abonnementRepository.findByTypeAbon(typeAbonnement);
    }

    @Override
    public List<Abonnement> retrieveSubscriptionByDate(LocalDate startDate, LocalDate endDate) {
        return abonnementRepository.findByDateDebutBetween(startDate, endDate);
    }
}
